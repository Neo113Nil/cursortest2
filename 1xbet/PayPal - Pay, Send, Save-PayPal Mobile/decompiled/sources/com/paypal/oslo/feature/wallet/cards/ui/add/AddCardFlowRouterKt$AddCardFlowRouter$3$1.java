package com.paypal.oslo.feature.wallet.cards.ui.add;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterKt$AddCardFlowRouter$3$1", f = "AddCardFlowRouter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class AddCardFlowRouterKt$AddCardFlowRouter$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Config getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterViewModel getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getInputFormats;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult scanCardNavResult = (com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult) this.getInputFormats;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getOutputMinFrameDuration != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighSpeedVideoSizes.handleScannerResult(scanCardNavResult, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult scanCardNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterKt$AddCardFlowRouter$3$1) create(scanCardNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterKt$AddCardFlowRouter$3$1 addCardFlowRouterKt$AddCardFlowRouter$3$1 = new com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterKt$AddCardFlowRouter$3$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        addCardFlowRouterKt$AddCardFlowRouter$3$1.getInputFormats = obj;
        return addCardFlowRouterKt$AddCardFlowRouter$3$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddCardFlowRouterKt$AddCardFlowRouter$3$1(com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterViewModel addCardFlowRouterViewModel, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext addFIAnalyticsContext, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header header, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Config config, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options options, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterKt$AddCardFlowRouter$3$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = addCardFlowRouterViewModel;
        this.getHighSpeedVideoFpsRangesFor = addFIAnalyticsContext;
        this.Camera2StreamConfigurationMap = header;
        this.getHighSpeedVideoFpsRanges = config;
        this.getHighResolutionOutputSizeshNQ4ISI = options;
    }
}
