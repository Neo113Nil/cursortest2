package com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddMoneyReviewScreenKt$AddMoneyReviewScreen$2$1", f = "AddMoneyReviewScreen.kt", i = {}, l = {146}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class AddMoneyReviewScreenKt$AddMoneyReviewScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig getHighSpeedVideoSizes;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.pds.components.BottomSheetController getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenViewModel getInputSizeshNQ4ISI;
    int getOutputFormats;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddMoneyReviewEvent> uiEvent = this.getInputSizeshNQ4ISI.getUiEvent();
            final com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.getOutputMinFrameDuration;
            final com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig addMoneyConfig = this.getHighSpeedVideoSizes;
            final java.lang.String str = this.Camera2StreamConfigurationMap;
            final java.lang.String str2 = this.getHighSpeedVideoFpsRangesFor;
            final java.lang.String str3 = this.getHighSpeedVideoFpsRanges;
            final java.lang.String str4 = this.getHighResolutionOutputSizeshNQ4ISI;
            final java.lang.String str5 = this.getHighSpeedVideoSizesFor;
            final com.paypal.pds.components.BottomSheetController bottomSheetController = this.getInputFormats;
            this.getOutputFormats = 1;
            if (uiEvent.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddMoneyReviewScreenKt$AddMoneyReviewScreen$2$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddMoneyReviewScreenKt.m21280access$handleUiEventwkqWiCI((com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddMoneyReviewEvent) obj2, com.paypal.oslo.core.navigation.AppNavigator.this, addMoneyConfig, str, str2, str3, str4, str5, bottomSheetController);
                    return kotlin.Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddMoneyReviewScreenKt$AddMoneyReviewScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddMoneyReviewScreenKt$AddMoneyReviewScreen$2$1(this.getInputSizeshNQ4ISI, this.getOutputMinFrameDuration, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor, this.getInputFormats, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddMoneyReviewScreenKt$AddMoneyReviewScreen$2$1(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenViewModel reviewScreenViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig addMoneyConfig, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddMoneyReviewScreenKt$AddMoneyReviewScreen$2$1> continuation) {
        super(2, continuation);
        this.getInputSizeshNQ4ISI = reviewScreenViewModel;
        this.getOutputMinFrameDuration = appNavigator;
        this.getHighSpeedVideoSizes = addMoneyConfig;
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoFpsRangesFor = str2;
        this.getHighSpeedVideoFpsRanges = str3;
        this.getHighResolutionOutputSizeshNQ4ISI = str4;
        this.getHighSpeedVideoSizesFor = str5;
        this.getInputFormats = bottomSheetController;
    }
}
