package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: kotlinx.coroutines.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1082i {
    public static final T a(K k, CoroutineContext coroutineContext, M m, Function2 function2) {
        CoroutineContext b = H.b(k, coroutineContext);
        m.getClass();
        T g0 = m == M.b ? new G0(b, function2) : new T(b, true);
        g0.c0(m, g0, function2);
        return g0;
    }

    public static Q0 c(K k, CoroutineContext coroutineContext, M m, Function2 function2, int i) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            m = M.a;
        }
        CoroutineContext b = H.b(k, coroutineContext);
        m.getClass();
        Q0 h0 = m == M.b ? new H0(b, function2) : new Q0(b, true);
        h0.c0(m, h0, function2);
        return h0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T d(CoroutineContext coroutineContext, Function2<? super K, ? super Continuation<? super T>, ? extends Object> function2) throws InterruptedException {
        AbstractC1083i0 abstractC1083i0;
        CoroutineContext a;
        Thread currentThread = Thread.currentThread();
        ContinuationInterceptor.Companion companion = ContinuationInterceptor.INSTANCE;
        ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) coroutineContext.get(companion);
        if (continuationInterceptor == null) {
            abstractC1083i0 = U0.a();
            a = H.a(EmptyCoroutineContext.INSTANCE, coroutineContext.plus(abstractC1083i0), true);
            kotlinx.coroutines.scheduling.c cVar = C1049c0.a;
            if (a != cVar && a.get(companion) == null) {
                a = a.plus(cVar);
            }
        } else {
            if (continuationInterceptor instanceof AbstractC1083i0) {
            }
            abstractC1083i0 = U0.a.get();
            a = H.a(EmptyCoroutineContext.INSTANCE, coroutineContext, true);
            kotlinx.coroutines.scheduling.c cVar2 = C1049c0.a;
            if (a != cVar2 && a.get(companion) == null) {
                a = a.plus(cVar2);
            }
        }
        C1078g c1078g = new C1078g(a, currentThread, abstractC1083i0);
        c1078g.c0(M.a, c1078g, function2);
        AbstractC1083i0 abstractC1083i02 = c1078g.e;
        if (abstractC1083i02 != null) {
            int i = AbstractC1083i0.d;
            abstractC1083i02.Y(false);
        }
        while (!Thread.interrupted()) {
            try {
                long Z = abstractC1083i02 != null ? abstractC1083i02.Z() : Long.MAX_VALUE;
                if (c1078g.isCompleted()) {
                    if (abstractC1083i02 != null) {
                        int i2 = AbstractC1083i0.d;
                        abstractC1083i02.W(false);
                    }
                    T t = (T) F0.a(C0.a.get(c1078g));
                    A a2 = t instanceof A ? (A) t : null;
                    if (a2 == null) {
                        return t;
                    }
                    throw a2.a;
                }
                LockSupport.parkNanos(c1078g, Z);
            } catch (Throwable th) {
                if (abstractC1083i02 != null) {
                    int i3 = AbstractC1083i0.d;
                    abstractC1083i02.W(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c1078g.o(interruptedException);
        throw interruptedException;
    }

    public static final Object f(Function2 function2, CoroutineContext coroutineContext, Continuation continuation) {
        Object a;
        CoroutineContext coroutineContext2 = continuation.get$context();
        CoroutineContext plus = !((Boolean) coroutineContext.fold(Boolean.FALSE, new E())).booleanValue() ? coroutineContext2.plus(coroutineContext) : H.a(coroutineContext2, coroutineContext, false);
        com.google.common.base.r.d(plus);
        if (plus == coroutineContext2) {
            kotlinx.coroutines.internal.t tVar = new kotlinx.coroutines.internal.t(continuation, plus);
            a = kotlinx.coroutines.intrinsics.b.a(tVar, tVar, function2);
        } else {
            ContinuationInterceptor.Companion companion = ContinuationInterceptor.INSTANCE;
            if (Intrinsics.areEqual(plus.get(companion), coroutineContext2.get(companion))) {
                Z0 z0 = new Z0(continuation, plus);
                CoroutineContext coroutineContext3 = z0.c;
                Object c = kotlinx.coroutines.internal.C.c(coroutineContext3, null);
                try {
                    a = kotlinx.coroutines.intrinsics.b.a(z0, z0, function2);
                } finally {
                    kotlinx.coroutines.internal.C.a(coroutineContext3, c);
                }
            } else {
                Y y = new Y(continuation, plus);
                kotlinx.coroutines.intrinsics.a.c(function2, y, y);
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = Y.e;
                while (true) {
                    int i = atomicIntegerFieldUpdater.get(y);
                    if (i != 0) {
                        if (i != 2) {
                            throw new IllegalStateException("Already suspended");
                        }
                        a = F0.a(C0.a.get(y));
                        if (a instanceof A) {
                            throw ((A) a).a;
                        }
                    } else if (atomicIntegerFieldUpdater.compareAndSet(y, 0, 1)) {
                        a = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        break;
                    }
                }
            }
        }
        if (a == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return a;
    }
}
