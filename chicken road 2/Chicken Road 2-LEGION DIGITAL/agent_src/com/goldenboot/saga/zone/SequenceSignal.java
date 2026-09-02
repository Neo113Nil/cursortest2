package com.goldenboot.saga.zone;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class SequenceSignal {

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static class ActivityMutator implements ThreadFactory {
        public String evictLayout;
        public int growPayload;

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        /* renamed from: com.goldenboot.saga.zone.SequenceSignal$ActivityMutator$ActivityMutator, reason: collision with other inner class name */
        public static class C0153ActivityMutator extends Thread {
            public final int reduceScope;

            public C0153ActivityMutator(Runnable runnable, String str, int i) {
                super(runnable, str);
                this.reduceScope = i;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.reduceScope);
                super.run();
            }
        }

        public ActivityMutator(String str, int i) {
            this.evictLayout = str;
            this.growPayload = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0153ActivityMutator(runnable, this.evictLayout, this.growPayload);
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static class BounceHandler implements Executor {
        public final Handler reduceScope;

        public BounceHandler(Handler handler) {
            this.reduceScope = (Handler) GroupBroadcaster.flushSample(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.reduceScope.post((Runnable) GroupBroadcaster.flushSample(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.reduceScope + " is shutting down");
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static class FeedbackFlow implements Runnable {
        public Handler connectPatch;
        public WrapperValve notifyMessage;
        public Callable reduceScope;

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        public class ActivityMutator implements Runnable {
            public final /* synthetic */ Object notifyMessage;
            public final /* synthetic */ WrapperValve reduceScope;

            public ActivityMutator(WrapperValve wrapperValve, Object obj) {
                this.reduceScope = wrapperValve;
                this.notifyMessage = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.reduceScope.accept(this.notifyMessage);
            }
        }

        public FeedbackFlow(Handler handler, Callable callable, WrapperValve wrapperValve) {
            this.reduceScope = callable;
            this.notifyMessage = wrapperValve;
            this.connectPatch = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            try {
                obj = this.reduceScope.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.connectPatch.post(new ActivityMutator(this.notifyMessage, obj));
        }
    }

    public static Object detachStream(ExecutorService executorService, Callable callable, int i) {
        try {
            return executorService.submit(callable).get(i, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw e;
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }

    public static ThreadPoolExecutor evictLayout(String str, int i, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i2, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ActivityMutator(str, i));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static Executor growPayload(Handler handler) {
        return new BounceHandler(handler);
    }

    public static void injectMetric(Executor executor, Callable callable, WrapperValve wrapperValve) {
        executor.execute(new FeedbackFlow(FadeMux.evictLayout(), callable, wrapperValve));
    }
}
