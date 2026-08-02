package kotlinx.coroutines.internal;

@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a,\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00060\u0001j\u0002`\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0080\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00072\u0006\u0010\t\u001a\u00020\bH\u0080\b¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\"\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014*\f\b\u0000\u0010\u0015\"\u00020\u00012\u00020\u0001*\u001e\b\u0000\u0010\u0013\u001a\u0004\b\u0000\u0010\u0000\"\b\u0012\u0004\u0012\u00028\u00000\u00162\b\u0012\u0004\u0012\u00028\u00000\u0016"}, d2 = {"T", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/getHighSpeedVideoFpsRanges;", "Lkotlin/Function0;", "action", "withLock", "(Ljava/util/concurrent/locks/ReentrantLock;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "E", "", "expectedSize", "", "identitySet", "(I)Ljava/util/Set;", "Ljava/util/concurrent/Executor;", "executor", "", "removeFutureOnCancel", "(Ljava/util/concurrent/Executor;)Z", "Ljava/lang/reflect/Method;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/reflect/Method;", "getHighSpeedVideoFpsRanges", "Ljava/util/concurrent/atomic/AtomicReference;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ConcurrentKt {
    private static final java.lang.reflect.Method getHighResolutionOutputSizeshNQ4ISI;

    public static final <T> T withLock(java.util.concurrent.locks.ReentrantLock reentrantLock, kotlin.jvm.functions.Function0<? extends T> function0) {
        java.util.concurrent.locks.ReentrantLock reentrantLock2 = reentrantLock;
        reentrantLock2.lock();
        try {
            return function0.invoke();
        } finally {
            reentrantLock2.unlock();
        }
    }

    public static final <E> java.util.Set<E> identitySet(int i) {
        return java.util.Collections.newSetFromMap(new java.util.IdentityHashMap(i));
    }

    static {
        java.lang.reflect.Method method;
        try {
            method = java.util.concurrent.ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", java.lang.Boolean.TYPE);
        } catch (java.lang.Throwable unused) {
            method = null;
        }
        getHighResolutionOutputSizeshNQ4ISI = method;
    }

    public static final boolean removeFutureOnCancel(java.util.concurrent.Executor executor) {
        java.lang.reflect.Method method;
        try {
            java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof java.util.concurrent.ScheduledThreadPoolExecutor ? (java.util.concurrent.ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor == null || (method = getHighResolutionOutputSizeshNQ4ISI) == null) {
                return false;
            }
            method.invoke(scheduledThreadPoolExecutor, java.lang.Boolean.TRUE);
            return true;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }
}
