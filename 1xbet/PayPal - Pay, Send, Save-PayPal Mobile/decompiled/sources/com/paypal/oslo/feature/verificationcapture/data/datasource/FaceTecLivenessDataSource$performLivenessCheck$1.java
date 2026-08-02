package com.paypal.oslo.feature.verificationcapture.data.datasource;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecLivenessDataSource", f = "FaceTecLivenessDataSource.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE}, m = "performLivenessCheck$verification_capture_prodRelease", n = {"context", com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_FLOW_NAME, "entityId", "webViewBridge", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "activityContext", "processor", "isWebFlow", "isStage"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "Z$0", "I$0"}, v = 2)
/* loaded from: classes5.dex */
final class FaceTecLivenessDataSource$performLivenessCheck$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    boolean getOutputMinFrameDuration;
    /* synthetic */ java.lang.Object getOutputMinFrameDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecLivenessDataSource getOutputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDurationlomOqCM = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        return this.getOutputSizeshNQ4ISI.performLivenessCheck$verification_capture_prodRelease(null, false, null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FaceTecLivenessDataSource$performLivenessCheck$1(com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecLivenessDataSource faceTecLivenessDataSource, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecLivenessDataSource$performLivenessCheck$1> continuation) {
        super(continuation);
        this.getOutputSizeshNQ4ISI = faceTecLivenessDataSource;
    }
}
