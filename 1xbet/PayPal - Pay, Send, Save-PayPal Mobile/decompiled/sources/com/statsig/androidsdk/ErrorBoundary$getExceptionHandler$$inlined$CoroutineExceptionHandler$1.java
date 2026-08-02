package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¸\u0006\n"}, d2 = {"Lkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ErrorBoundary$getExceptionHandler$$inlined$CoroutineExceptionHandler$1 extends kotlin.coroutines.AbstractCoroutineContextElement implements kotlinx.coroutines.CoroutineExceptionHandler {
    final /* synthetic */ com.statsig.androidsdk.ErrorBoundary this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorBoundary$getExceptionHandler$$inlined$CoroutineExceptionHandler$1(kotlinx.coroutines.CoroutineExceptionHandler.Companion companion, com.statsig.androidsdk.ErrorBoundary errorBoundary) {
        super(companion);
        this.this$0 = errorBoundary;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(kotlin.coroutines.CoroutineContext context, java.lang.Throwable exception) {
        com.statsig.androidsdk.ErrorBoundary.handleException$default(this.this$0, exception, null, null, 6, null);
    }
}
