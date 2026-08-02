package com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoViewModel$sideEffectsMiddleware$1$invoke$1", f = "AdditionalInfoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class AdditionalInfoViewModel$sideEffectsMiddleware$1$invoke$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoViewModel getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiMapper additionalInfoUiMapper;
        com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage sessionStorage;
        com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage sessionStorage2;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            additionalInfoUiMapper = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
            java.lang.String formattedAmount = ((com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.Initialize) this.Camera2StreamConfigurationMap).getFormattedAmount();
            java.lang.String selectedOfferId = ((com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.Initialize) this.Camera2StreamConfigurationMap).getSelectedOfferId();
            sessionStorage = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
            boolean getHighSpeedVideoSizesFor = sessionStorage.getGetHighSpeedVideoSizesFor();
            sessionStorage2 = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
            this.getHighResolutionOutputSizeshNQ4ISI.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.Initialized(additionalInfoUiMapper.buildInitialUiModel(formattedAmount, getHighSpeedVideoSizesFor, selectedOfferId, sessionStorage2.getGetInputSizeshNQ4ISI())));
            return kotlin.Unit.INSTANCE;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoViewModel$sideEffectsMiddleware$1$invoke$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoViewModel$sideEffectsMiddleware$1$invoke$1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdditionalInfoViewModel$sideEffectsMiddleware$1$invoke$1(com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoViewModel additionalInfoViewModel, com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent additionalInfoEvent, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoViewModel$sideEffectsMiddleware$1$invoke$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = additionalInfoViewModel;
        this.Camera2StreamConfigurationMap = additionalInfoEvent;
    }
}
