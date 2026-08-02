package com.paypal.oslo.feature.savings.ui.home;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.ui.home.SavingsHomeScreenKt$SavingsHomeLifecycleEffects$3$1", f = "SavingsHomeScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class SavingsHomeScreenKt$SavingsHomeLifecycleEffects$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsInitialFlowType getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    int getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel getOutputFormats;
    final /* synthetic */ com.paypal.oslo.feature.savings.ui.home.SavingsHomeState getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getInputFormats != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if ((this.getOutputMinFrameDuration instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeState.Success) && this.getOutputFormats.handleInitialFlowIfNeeded(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes)) {
            this.getHighResolutionOutputSizeshNQ4ISI.showSheet();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.savings.ui.home.SavingsHomeScreenKt$SavingsHomeLifecycleEffects$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.savings.ui.home.SavingsHomeScreenKt$SavingsHomeLifecycleEffects$3$1(this.getOutputMinFrameDuration, this.getOutputFormats, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavingsHomeScreenKt$SavingsHomeLifecycleEffects$3$1(com.paypal.oslo.feature.savings.ui.home.SavingsHomeState savingsHomeState, com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel savingsHomeViewModel, com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsInitialFlowType savingsInitialFlowType, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.ui.home.SavingsHomeScreenKt$SavingsHomeLifecycleEffects$3$1> continuation) {
        super(2, continuation);
        this.getOutputMinFrameDuration = savingsHomeState;
        this.getOutputFormats = savingsHomeViewModel;
        this.getHighSpeedVideoFpsRanges = savingsInitialFlowType;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.Camera2StreamConfigurationMap = str2;
        this.getHighSpeedVideoSizes = str3;
        this.getHighResolutionOutputSizeshNQ4ISI = bottomSheetController;
    }
}
