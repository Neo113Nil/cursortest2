package com.paypal.oslo.feature.subscriptions.updatefi.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiViewModel$onAddFiSuccess$1", f = "UpdateFiViewModel.kt", i = {}, l = {165, 166}, m = "invokeSuspend", n = {}, nl = {166, 167}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class UpdateFiViewModel$onAddFiSuccess$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiViewModel getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        if (com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiViewModel.access$doFetchFundingInstruments(r5.getHighSpeedVideoFpsRangesFor, r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (r6.emit(com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiUiState.Loading.INSTANCE, r5) != r0) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.getHighResolutionOutputSizeshNQ4ISI = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiViewModel$onAddFiSuccess$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiViewModel$onAddFiSuccess$1(this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UpdateFiViewModel$onAddFiSuccess$1(com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiViewModel updateFiViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiViewModel$onAddFiSuccess$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = updateFiViewModel;
    }
}
