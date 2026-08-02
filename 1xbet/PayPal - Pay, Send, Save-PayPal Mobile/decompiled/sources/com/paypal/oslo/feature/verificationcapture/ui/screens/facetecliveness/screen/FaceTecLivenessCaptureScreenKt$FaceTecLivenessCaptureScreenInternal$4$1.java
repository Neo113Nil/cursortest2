package com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.screen;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.screen.FaceTecLivenessCaptureScreenKt$FaceTecLivenessCaptureScreenInternal$4$1", f = "FaceTecLivenessCaptureScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class FaceTecLivenessCaptureScreenKt$FaceTecLivenessCaptureScreenInternal$4$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiState> Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.viewmodel.FaceTecLivenessCaptureViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.screen.FaceTecLivenessCaptureScreenKt.access$FaceTecLivenessCaptureScreenInternal$lambda$0(this.Camera2StreamConfigurationMap) instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiState.Ready) {
            this.getHighSpeedVideoSizes.processEvent(new com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureEvent.SetSessionToken(this.getHighResolutionOutputSizeshNQ4ISI));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.screen.FaceTecLivenessCaptureScreenKt$FaceTecLivenessCaptureScreenInternal$4$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.screen.FaceTecLivenessCaptureScreenKt$FaceTecLivenessCaptureScreenInternal$4$1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FaceTecLivenessCaptureScreenKt$FaceTecLivenessCaptureScreenInternal$4$1(com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.viewmodel.FaceTecLivenessCaptureViewModel faceTecLivenessCaptureViewModel, java.lang.String str, androidx.compose.runtime.State<? extends com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiState> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.screen.FaceTecLivenessCaptureScreenKt$FaceTecLivenessCaptureScreenInternal$4$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = faceTecLivenessCaptureViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.Camera2StreamConfigurationMap = state;
    }
}
