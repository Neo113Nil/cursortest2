package com.paypal.oslo.feature.verificationcapture.webview;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/VerificationError;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.webview.WebFlowNavigator$launchFaceTecDirectly$1$initResult$1", f = "WebFlowNavigator.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class WebFlowNavigator$launchFaceTecDirectly$1$initResult$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError, ? extends kotlin.Unit>>, java.lang.Object> {
    final /* synthetic */ androidx.fragment.app.FragmentActivity Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecLivenessDataSource getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowConfig getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecLivenessDataSource faceTecLivenessDataSource = this.getHighResolutionOutputSizeshNQ4ISI;
        androidx.fragment.app.FragmentActivity fragmentActivity = this.Camera2StreamConfigurationMap;
        java.lang.String deviceKeyIdentifier = this.getHighSpeedVideoFpsRangesFor.getDeviceKeyIdentifier();
        if (deviceKeyIdentifier == null) {
            deviceKeyIdentifier = "";
        }
        java.lang.String productionKey = this.getHighSpeedVideoFpsRangesFor.getProductionKey();
        if (productionKey == null) {
            productionKey = "";
        }
        java.lang.String licenseExpirationDate = this.getHighSpeedVideoFpsRangesFor.getLicenseExpirationDate();
        if (licenseExpirationDate == null) {
            licenseExpirationDate = "";
        }
        this.getHighSpeedVideoSizes = 1;
        java.lang.Object initialize = faceTecLivenessDataSource.initialize(fragmentActivity, deviceKeyIdentifier, productionKey, licenseExpirationDate, this);
        return initialize == coroutine_suspended ? coroutine_suspended : initialize;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError, ? extends kotlin.Unit>> continuation) {
        return ((com.paypal.oslo.feature.verificationcapture.webview.WebFlowNavigator$launchFaceTecDirectly$1$initResult$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.verificationcapture.webview.WebFlowNavigator$launchFaceTecDirectly$1$initResult$1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebFlowNavigator$launchFaceTecDirectly$1$initResult$1(com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecLivenessDataSource faceTecLivenessDataSource, androidx.fragment.app.FragmentActivity fragmentActivity, com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowConfig workflowConfig, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.webview.WebFlowNavigator$launchFaceTecDirectly$1$initResult$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = faceTecLivenessDataSource;
        this.Camera2StreamConfigurationMap = fragmentActivity;
        this.getHighSpeedVideoFpsRangesFor = workflowConfig;
    }
}
