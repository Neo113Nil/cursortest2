package com.paypal.oslo.feature.verificationcapture.webview;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/VerificationError;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/LivenessResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.webview.WebFlowNavigator$launchFaceTecDirectly$1$livenessResult$1", f = "WebFlowNavigator.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_UP_VALUE}, m = "invokeSuspend", n = {}, nl = {204}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class WebFlowNavigator$launchFaceTecDirectly$1$livenessResult$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError, ? extends com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult>>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.webview.WebFlowNavigator getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.fragment.app.FragmentActivity getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecLivenessDataSource getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewDelegateImpl verificationCaptureWebViewDelegateImpl;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecLivenessDataSource faceTecLivenessDataSource = this.getHighSpeedVideoSizes;
        androidx.fragment.app.FragmentActivity fragmentActivity = this.getHighSpeedVideoFpsRanges;
        java.lang.String flowName = this.Camera2StreamConfigurationMap.getFlowName();
        java.lang.String partyId = this.Camera2StreamConfigurationMap.getPartyId();
        if (partyId == null) {
            partyId = "";
        }
        java.lang.String str = partyId;
        verificationCaptureWebViewDelegateImpl = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoFpsRangesFor = 1;
        java.lang.Object performLivenessCheck$verification_capture_prodRelease = faceTecLivenessDataSource.performLivenessCheck$verification_capture_prodRelease(fragmentActivity, true, flowName, str, verificationCaptureWebViewDelegateImpl, this);
        return performLivenessCheck$verification_capture_prodRelease == coroutine_suspended ? coroutine_suspended : performLivenessCheck$verification_capture_prodRelease;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError, ? extends com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult>> continuation) {
        return ((com.paypal.oslo.feature.verificationcapture.webview.WebFlowNavigator$launchFaceTecDirectly$1$livenessResult$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.verificationcapture.webview.WebFlowNavigator$launchFaceTecDirectly$1$livenessResult$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebFlowNavigator$launchFaceTecDirectly$1$livenessResult$1(com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecLivenessDataSource faceTecLivenessDataSource, androidx.fragment.app.FragmentActivity fragmentActivity, com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext workflowContext, com.paypal.oslo.feature.verificationcapture.webview.WebFlowNavigator webFlowNavigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.webview.WebFlowNavigator$launchFaceTecDirectly$1$livenessResult$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = faceTecLivenessDataSource;
        this.getHighSpeedVideoFpsRanges = fragmentActivity;
        this.Camera2StreamConfigurationMap = workflowContext;
        this.getHighResolutionOutputSizeshNQ4ISI = webFlowNavigator;
    }
}
