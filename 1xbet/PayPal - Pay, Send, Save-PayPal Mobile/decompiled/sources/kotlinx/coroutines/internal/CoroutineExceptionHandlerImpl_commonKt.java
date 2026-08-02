package kotlinx.coroutines.internal;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleUncaughtCoroutineException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CoroutineExceptionHandlerImpl_commonKt {
    public static final void handleUncaughtCoroutineException(kotlin.coroutines.CoroutineContext coroutineContext, java.lang.Throwable th) {
        java.util.Iterator<kotlinx.coroutines.CoroutineExceptionHandler> it = kotlinx.coroutines.internal.CoroutineExceptionHandlerImplKt.getPlatformExceptionHandlers().iterator();
        while (it.hasNext()) {
            try {
                it.next().handleException(coroutineContext, th);
            } catch (kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (java.lang.Throwable th2) {
                kotlinx.coroutines.internal.CoroutineExceptionHandlerImplKt.propagateExceptionFinalResort(kotlinx.coroutines.CoroutineExceptionHandlerKt.handlerException(th, th2));
            }
        }
        try {
            kotlin.ExceptionsKt.addSuppressed(th, new kotlinx.coroutines.internal.DiagnosticCoroutineContextException(coroutineContext));
        } catch (java.lang.Throwable unused2) {
        }
        kotlinx.coroutines.internal.CoroutineExceptionHandlerImplKt.propagateExceptionFinalResort(th);
    }
}
