package com.paypal.oslo.feature.verificationcapture.webview;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.webview.WebFlowNavigator$launchFaceTecDirectly$1", f = "WebFlowNavigator.kt", i = {1, 2, 2, 2}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE, 197}, m = "invokeSuspend", n = {"granted", "initResult", "currentActivity", "granted"}, nl = {165, 181, 207}, s = {"Z$0", "L$0", "L$1", "Z$0"}, v = 2)
/* loaded from: classes15.dex */
final class WebFlowNavigator$launchFaceTecDirectly$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.fragment.app.FragmentActivity Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowConfig getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecLivenessDataSource getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.webview.WebFlowNavigator getInputSizeshNQ4ISI;
    boolean getOutputFormats;

    /* JADX WARN: Code restructure failed: missing block: B:48:0x013d, code lost:
    
        if (r2 == r1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01dc, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0098, code lost:
    
        if (r5 != r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x005a, code lost:
    
        if (r2 != r1) goto L14;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object withContext;
        boolean booleanValue;
        java.lang.Object withContext2;
        com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewDelegateImpl verificationCaptureWebViewDelegateImpl;
        com.paypal.oslo.feature.verificationcapture.webview.ActivityProvider activityProvider;
        java.lang.Object withContext3;
        com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewDelegateImpl verificationCaptureWebViewDelegateImpl2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getInputFormats = 1;
            withContext = kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain(), new com.paypal.oslo.feature.verificationcapture.webview.WebFlowNavigator$launchFaceTecDirectly$1$granted$1(this.getInputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, null), this);
        } else if (i == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
            withContext = obj;
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                withContext3 = obj;
                arrow.core.Either either = (arrow.core.Either) withContext3;
                if (either instanceof arrow.core.Either.Left) {
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "FaceTec web flow init failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", ((com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError) ((arrow.core.Either.Left) either).getValue()).getMessage())), null, null, 12, null);
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    arrow.core.Either.Right right = (arrow.core.Either.Right) either;
                    com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult livenessResult = (com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult) right.getValue();
                    if (livenessResult instanceof com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult.Success) {
                        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "FaceTec web flow complete", null, null, 6, null);
                    } else if (livenessResult instanceof com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult.Cancelled) {
                        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "FaceTec web flow cancelled by user", null, null, 6, null);
                    } else if (livenessResult instanceof com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult.Timeout) {
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "FaceTec web flow timed out", null, null, 6, null);
                    } else {
                        if (!(livenessResult instanceof com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult.Failure)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.verificationcapture.LoggerKt.log;
                        java.lang.Object value = right.getValue();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(value, "");
                        com.paypal.android.logger.Logger.e$default(logger, "FaceTec web flow failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", ((com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult.Failure) value).getError().getMessage())), null, null, 12, null);
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
            booleanValue = this.getOutputFormats;
            kotlin.ResultKt.throwOnFailure(obj);
            withContext2 = obj;
            arrow.core.Either either2 = (arrow.core.Either) withContext2;
            if (!(either2 instanceof arrow.core.Either.Left)) {
                activityProvider = this.getInputSizeshNQ4ISI.Camera2StreamConfigurationMap;
                androidx.fragment.app.FragmentActivity currentActivity = activityProvider != null ? activityProvider.getCurrentActivity() : null;
                if (currentActivity == null) {
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "Activity no longer valid after FaceTec init, aborting launch", null, null, 6, null);
                    return kotlin.Unit.INSTANCE;
                }
                com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecLivenessDataSource faceTecLivenessDataSource = this.getHighSpeedVideoSizes;
                java.lang.String sessionToken = this.getHighResolutionOutputSizeshNQ4ISI.getSessionToken();
                if (sessionToken == null) {
                    sessionToken = "";
                }
                faceTecLivenessDataSource.setSessionToken(sessionToken);
                this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either2);
                this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(currentActivity);
                this.getOutputFormats = booleanValue;
                this.getInputFormats = 3;
                withContext3 = kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain(), new com.paypal.oslo.feature.verificationcapture.webview.WebFlowNavigator$launchFaceTecDirectly$1$livenessResult$1(this.getHighSpeedVideoSizes, currentActivity, this.getHighSpeedVideoFpsRanges, this.getInputSizeshNQ4ISI, null), this);
            } else {
                arrow.core.Either.Left left = (arrow.core.Either.Left) either2;
                com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "FaceTec init failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", ((com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError) left.getValue()).getMessage())), null, null, 12, null);
                verificationCaptureWebViewDelegateImpl2 = this.getInputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
                verificationCaptureWebViewDelegateImpl2.sendCallback(com.paypal.oslo.feature.verificationcapture.webview.WebSdkResultConverter.INSTANCE.convertError(((com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError) left.getValue()).getCode(), ((com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError) left.getValue()).getMessage()));
                return kotlin.Unit.INSTANCE;
            }
        }
        booleanValue = ((java.lang.Boolean) withContext).booleanValue();
        if (!booleanValue) {
            verificationCaptureWebViewDelegateImpl = this.getInputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
            verificationCaptureWebViewDelegateImpl.sendCallback(com.paypal.oslo.feature.verificationcapture.webview.WebSdkResultConverter.INSTANCE.convertError("PERMISSION_DENIED", "Camera permission denied"));
            return kotlin.Unit.INSTANCE;
        }
        this.getOutputFormats = booleanValue;
        this.getInputFormats = 2;
        withContext2 = kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain(), new com.paypal.oslo.feature.verificationcapture.webview.WebFlowNavigator$launchFaceTecDirectly$1$initResult$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, null), this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.verificationcapture.webview.WebFlowNavigator$launchFaceTecDirectly$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.verificationcapture.webview.WebFlowNavigator$launchFaceTecDirectly$1(this.getInputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebFlowNavigator$launchFaceTecDirectly$1(com.paypal.oslo.feature.verificationcapture.webview.WebFlowNavigator webFlowNavigator, com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecLivenessDataSource faceTecLivenessDataSource, com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowConfig workflowConfig, androidx.fragment.app.FragmentActivity fragmentActivity, com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext workflowContext, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.webview.WebFlowNavigator$launchFaceTecDirectly$1> continuation) {
        super(2, continuation);
        this.getInputSizeshNQ4ISI = webFlowNavigator;
        this.getHighSpeedVideoSizes = faceTecLivenessDataSource;
        this.getHighResolutionOutputSizeshNQ4ISI = workflowConfig;
        this.Camera2StreamConfigurationMap = fragmentActivity;
        this.getHighSpeedVideoFpsRanges = workflowContext;
    }
}
