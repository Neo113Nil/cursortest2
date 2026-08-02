package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\n\u001a,\u0010\u000e\u001a\u00020\r2\u001a\b\u0004\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000bH\u0086\b¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleCoroutineException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "originalException", "thrownException", "handlerException", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)Ljava/lang/Throwable;", "Lkotlin/Function2;", "handler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "CoroutineExceptionHandler", "(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/CoroutineExceptionHandler;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CoroutineExceptionHandlerKt {
    public static final void handleCoroutineException(kotlin.coroutines.CoroutineContext coroutineContext, java.lang.Throwable th) {
        if (th instanceof kotlinx.coroutines.DispatchException) {
            th = ((kotlinx.coroutines.DispatchException) th).getCause();
        }
        try {
            kotlinx.coroutines.CoroutineExceptionHandler coroutineExceptionHandler = (kotlinx.coroutines.CoroutineExceptionHandler) coroutineContext.get(kotlinx.coroutines.CoroutineExceptionHandler.INSTANCE);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(coroutineContext, th);
            } else {
                kotlinx.coroutines.internal.CoroutineExceptionHandlerImpl_commonKt.handleUncaughtCoroutineException(coroutineContext, th);
            }
        } catch (java.lang.Throwable th2) {
            kotlinx.coroutines.internal.CoroutineExceptionHandlerImpl_commonKt.handleUncaughtCoroutineException(coroutineContext, handlerException(th, th2));
        }
    }

    public static final java.lang.Throwable handlerException(java.lang.Throwable th, java.lang.Throwable th2) {
        if (th == th2) {
            return th;
        }
        java.lang.RuntimeException runtimeException = new java.lang.RuntimeException("Exception while trying to handle coroutine exception", th2);
        kotlin.ExceptionsKt.addSuppressed(runtimeException, th);
        return runtimeException;
    }

    public static final kotlinx.coroutines.CoroutineExceptionHandler CoroutineExceptionHandler(kotlin.jvm.functions.Function2<? super kotlin.coroutines.CoroutineContext, ? super java.lang.Throwable, kotlin.Unit> function2) {
        return new kotlinx.coroutines.CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1(function2, kotlinx.coroutines.CoroutineExceptionHandler.INSTANCE);
    }
}
