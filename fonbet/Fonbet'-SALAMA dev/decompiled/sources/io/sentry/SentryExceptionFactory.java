package io.sentry;

import io.sentry.exception.ExceptionMechanismException;
import io.sentry.protocol.Mechanism;
import io.sentry.protocol.SentryException;
import io.sentry.protocol.SentryStackFrame;
import io.sentry.protocol.SentryStackTrace;
import io.sentry.protocol.SentryThread;
import io.sentry.util.Objects;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class SentryExceptionFactory {
    private final SentryStackTraceFactory sentryStackTraceFactory;

    public SentryExceptionFactory(SentryStackTraceFactory sentryStackTraceFactory) {
        this.sentryStackTraceFactory = (SentryStackTraceFactory) Objects.requireNonNull(sentryStackTraceFactory, "The SentryStackTraceFactory is required.");
    }

    private SentryException getSentryException(Throwable th, Mechanism mechanism, Long l7, List<SentryStackFrame> list, boolean z4) {
        Package r02 = th.getClass().getPackage();
        String name = th.getClass().getName();
        SentryException sentryException = new SentryException();
        String message = th.getMessage();
        if (r02 != null) {
            name = name.replace(r02.getName() + ".", "");
        }
        String name2 = r02 != null ? r02.getName() : null;
        if (list != null && !list.isEmpty()) {
            SentryStackTrace sentryStackTrace = new SentryStackTrace(list);
            if (z4) {
                sentryStackTrace.setSnapshot(Boolean.TRUE);
            }
            sentryException.setStacktrace(sentryStackTrace);
        }
        sentryException.setThreadId(l7);
        sentryException.setType(name);
        sentryException.setMechanism(mechanism);
        sentryException.setModule(name2);
        sentryException.setValue(message);
        return sentryException;
    }

    public Deque<SentryException> extractExceptionQueue(Throwable th) {
        return extractExceptionQueueInternal(th, new AtomicInteger(-1), new HashSet<>(), new ArrayDeque(), null);
    }

    public Deque<SentryException> extractExceptionQueueInternal(Throwable th, AtomicInteger atomicInteger, HashSet<Throwable> hashSet, Deque<SentryException> deque, String str) {
        Mechanism mechanism;
        boolean z4;
        Throwable th2;
        Thread currentThread;
        String str2 = str;
        int i7 = atomicInteger.get();
        Throwable th3 = th;
        while (th3 != null && hashSet.add(th3)) {
            if (str2 == null) {
                str2 = "chained";
            }
            if (th3 instanceof ExceptionMechanismException) {
                ExceptionMechanismException exceptionMechanismException = (ExceptionMechanismException) th3;
                mechanism = exceptionMechanismException.getExceptionMechanism();
                Throwable throwable = exceptionMechanismException.getThrowable();
                Thread thread = exceptionMechanismException.getThread();
                z4 = exceptionMechanismException.isSnapshot();
                currentThread = thread;
                th2 = throwable;
            } else {
                mechanism = new Mechanism();
                z4 = false;
                th2 = th3;
                currentThread = Thread.currentThread();
            }
            deque.addFirst(getSentryException(th2, mechanism, Long.valueOf(currentThread.getId()), this.sentryStackTraceFactory.getStackFrames(th2.getStackTrace(), Boolean.FALSE.equals(mechanism.isHandled())), z4));
            if (mechanism.getType() == null) {
                mechanism.setType(str2);
            }
            if (atomicInteger.get() >= 0) {
                mechanism.setParentId(Integer.valueOf(i7));
            }
            int incrementAndGet = atomicInteger.incrementAndGet();
            mechanism.setExceptionId(Integer.valueOf(incrementAndGet));
            Throwable[] suppressed = th2.getSuppressed();
            if (suppressed != null && suppressed.length > 0) {
                for (Throwable th4 : suppressed) {
                    extractExceptionQueueInternal(th4, atomicInteger, hashSet, deque, "suppressed");
                }
            }
            th3 = th2.getCause();
            str2 = null;
            i7 = incrementAndGet;
        }
        return deque;
    }

    public List<SentryException> getSentryExceptions(Throwable th) {
        return getSentryExceptions(extractExceptionQueue(th));
    }

    public List<SentryException> getSentryExceptionsFromThread(SentryThread sentryThread, Mechanism mechanism, Throwable th) {
        SentryStackTrace stacktrace = sentryThread.getStacktrace();
        if (stacktrace == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(getSentryException(th, mechanism, sentryThread.getId(), stacktrace.getFrames(), true));
        return arrayList;
    }

    private List<SentryException> getSentryExceptions(Deque<SentryException> deque) {
        return new ArrayList(deque);
    }
}
