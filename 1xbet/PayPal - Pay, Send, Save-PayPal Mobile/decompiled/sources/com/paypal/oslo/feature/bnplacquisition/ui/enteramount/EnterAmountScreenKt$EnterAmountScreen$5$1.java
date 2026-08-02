package com.paypal.oslo.feature.bnplacquisition.ui.enteramount;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountScreenKt$EnterAmountScreen$5$1", f = "EnterAmountScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class EnterAmountScreenKt$EnterAmountScreen$5$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiState> getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiState access$EnterAmountScreen$lambda$0 = com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountScreenKt.access$EnterAmountScreen$lambda$0(this.getHighSpeedVideoFpsRangesFor);
        com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiState.ApiLoading apiLoading = access$EnterAmountScreen$lambda$0 instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiState.ApiLoading ? (com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiState.ApiLoading) access$EnterAmountScreen$lambda$0 : null;
        if (apiLoading != null) {
            com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiState.ApiLoading apiLoading2 = apiLoading.getModel().getApiSuccessful() ? apiLoading : null;
            if (apiLoading2 != null) {
                this.Camera2StreamConfigurationMap.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.SwitchToSuccess(apiLoading2.getModel()));
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountScreenKt$EnterAmountScreen$5$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountScreenKt$EnterAmountScreen$5$1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    EnterAmountScreenKt$EnterAmountScreen$5$1(androidx.compose.runtime.State<? extends com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiState> state, com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel enterAmountViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountScreenKt$EnterAmountScreen$5$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = state;
        this.Camera2StreamConfigurationMap = enterAmountViewModel;
    }
}
