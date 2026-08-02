package com.paypal.oslo.feature.verificationcapture.data.datasource;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.data.datasource.DaonSdkWrapperImpl", f = "DaonSdkWrapper.kt", i = {0, 0, 0, 0, 0, 0}, l = {155}, m = "checkCameraAvailability", n = {"context", "cameraManager", "cameraIdList", "backCameraId", com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.AVAILABLE_CONDITION_KEY, com.sun.jna.Callback.METHOD_NAME}, nl = {157}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5"}, v = 2)
/* loaded from: classes15.dex */
final class DaonSdkWrapperImpl$checkCameraAvailability$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.data.datasource.DaonSdkWrapperImpl getInputFormats;
    java.lang.Object getOutputFormats;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.getOutputMinFrameDuration = obj;
        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = this.getInputFormats.getHighSpeedVideoFpsRanges(null, this);
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DaonSdkWrapperImpl$checkCameraAvailability$1(com.paypal.oslo.feature.verificationcapture.data.datasource.DaonSdkWrapperImpl daonSdkWrapperImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.data.datasource.DaonSdkWrapperImpl$checkCameraAvailability$1> continuation) {
        super(continuation);
        this.getInputFormats = daonSdkWrapperImpl;
    }
}
