package kotlinx.coroutines.internal;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\" \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lkotlinx/coroutines/CoroutineExceptionHandler;", com.sun.jna.Callback.METHOD_NAME, "", "ensurePlatformExceptionHandlerLoaded", "(Lkotlinx/coroutines/CoroutineExceptionHandler;)V", "", "exception", "propagateExceptionFinalResort", "(Ljava/lang/Throwable;)V", "", "platformExceptionHandlers", "Ljava/util/Collection;", "getPlatformExceptionHandlers", "()Ljava/util/Collection;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CoroutineExceptionHandlerImplKt {
    private static final java.util.Collection<kotlinx.coroutines.CoroutineExceptionHandler> platformExceptionHandlers = kotlin.sequences.SequencesKt.toList(kotlin.sequences.SequencesKt.asSequence(java.util.ServiceLoader.load(kotlinx.coroutines.CoroutineExceptionHandler.class, kotlinx.coroutines.CoroutineExceptionHandler.class.getClassLoader()).iterator()));

    public static final java.util.Collection<kotlinx.coroutines.CoroutineExceptionHandler> getPlatformExceptionHandlers() {
        return platformExceptionHandlers;
    }

    public static final void ensurePlatformExceptionHandlerLoaded(kotlinx.coroutines.CoroutineExceptionHandler coroutineExceptionHandler) {
        if (!platformExceptionHandlers.contains(coroutineExceptionHandler)) {
            throw new java.lang.IllegalStateException("Exception handler was not found via a ServiceLoader".toString());
        }
    }

    public static final void propagateExceptionFinalResort(java.lang.Throwable th) {
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }
}
