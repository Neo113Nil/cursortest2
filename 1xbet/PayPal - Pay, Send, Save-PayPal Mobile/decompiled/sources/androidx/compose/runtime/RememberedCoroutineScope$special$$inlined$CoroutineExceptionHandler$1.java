package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¸\u0006\n"}, d2 = {"Lkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RememberedCoroutineScope$special$$inlined$CoroutineExceptionHandler$1 extends kotlin.coroutines.AbstractCoroutineContextElement implements kotlinx.coroutines.CoroutineExceptionHandler {
    final /* synthetic */ androidx.compose.runtime.tooling.CompositionErrorContextImpl getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.RememberedCoroutineScope getHighSpeedVideoFpsRanges;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RememberedCoroutineScope$special$$inlined$CoroutineExceptionHandler$1(kotlinx.coroutines.CoroutineExceptionHandler.Companion companion, androidx.compose.runtime.tooling.CompositionErrorContextImpl compositionErrorContextImpl, androidx.compose.runtime.RememberedCoroutineScope rememberedCoroutineScope) {
        super(companion);
        this.getHighResolutionOutputSizeshNQ4ISI = compositionErrorContextImpl;
        this.getHighSpeedVideoFpsRanges = rememberedCoroutineScope;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(kotlin.coroutines.CoroutineContext context, java.lang.Throwable exception) {
        kotlin.coroutines.CoroutineContext coroutineContext;
        kotlin.coroutines.CoroutineContext coroutineContext2;
        this.getHighResolutionOutputSizeshNQ4ISI.attachComposeStackTrace(exception, this.getHighSpeedVideoFpsRanges);
        coroutineContext = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges;
        kotlinx.coroutines.CoroutineExceptionHandler coroutineExceptionHandler = (kotlinx.coroutines.CoroutineExceptionHandler) coroutineContext.get(kotlinx.coroutines.CoroutineExceptionHandler.INSTANCE);
        if (coroutineExceptionHandler != null) {
            coroutineExceptionHandler.handleException(context, exception);
            return;
        }
        coroutineContext2 = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
        kotlinx.coroutines.CoroutineExceptionHandler coroutineExceptionHandler2 = (kotlinx.coroutines.CoroutineExceptionHandler) coroutineContext2.get(kotlinx.coroutines.CoroutineExceptionHandler.INSTANCE);
        if (coroutineExceptionHandler2 == null) {
            throw exception;
        }
        coroutineExceptionHandler2.handleException(context, exception);
    }
}
