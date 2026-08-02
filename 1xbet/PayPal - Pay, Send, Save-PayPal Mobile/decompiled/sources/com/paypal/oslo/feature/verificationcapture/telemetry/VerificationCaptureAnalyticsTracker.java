package com.paypal.oslo.feature.verificationcapture.telemetry;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\tJ\r\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u0003J\u001d\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0015\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u0010J\r\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u0003J\u0015\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u0010J\u001d\u0010 \u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006¢\u0006\u0004\b \u0010\u0010J\u0015\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010\tJ\u001b\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060#H\u0002¢\u0006\u0004\b$\u0010%JK\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060#2.\u0010(\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060'0&\"\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060'H\u0002¢\u0006\u0004\b)\u0010*R\u0018\u0010-\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010,R\u0016\u0010$\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u00100"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/telemetry/VerificationCaptureAnalyticsTracker;", "", "<init>", "()V", "", "startFlow", "", "documentId", "completeFlow", "(Ljava/lang/String;)V", "reason", "cancelFlow", "trackTutorialViewed", "documentType", "documentSide", "trackDocumentCaptureStarted", "(Ljava/lang/String;Ljava/lang/String;)V", "", "captureTimeMs", "", "qualityScore", "trackDocumentCaptureSuccess", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Float;)V", "errorCode", "errorMessage", "trackDocumentCaptureFailed", "trackLivenessCheckStarted", "trackLivenessCheckSuccess", "(J)V", "trackLivenessCheckFailed", "sdkName", "sdkVersion", "trackSDKInitialized", "screenName", "trackRetryAttempted", "", "Camera2StreamConfigurationMap", "()Ljava/util/Map;", "", "Lkotlin/Pair;", "p0", "getHighResolutionOutputSizeshNQ4ISI", "([Lkotlin/Pair;)Ljava/util/Map;", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class VerificationCaptureAnalyticsTracker {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private int Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private java.lang.String getHighSpeedVideoSizes;
    private java.lang.String getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public VerificationCaptureAnalyticsTracker() {
    }

    public final void startFlow() {
        this.getHighSpeedVideoSizes = java.util.UUID.randomUUID().toString();
        this.getHighSpeedVideoFpsRangesFor = java.util.UUID.randomUUID().toString();
        this.Camera2StreamConfigurationMap = 0;
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "Verification Capture Event: ".concat(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.VERIFICATION_FLOW_STARTED), Camera2StreamConfigurationMap(), null, 4, null);
    }

    public final void completeFlow(java.lang.String documentId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentId, "");
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "Verification Capture Event: ".concat(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.VERIFICATION_FLOW_COMPLETED), kotlin.collections.MapsKt.plus(Camera2StreamConfigurationMap(), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("document_id", documentId))), null, 4, null);
        this.getHighSpeedVideoSizes = null;
        this.getHighSpeedVideoFpsRangesFor = null;
        this.Camera2StreamConfigurationMap = 0;
    }

    public static /* synthetic */ void cancelFlow$default(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureAnalyticsTracker verificationCaptureAnalyticsTracker, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        verificationCaptureAnalyticsTracker.cancelFlow(str);
    }

    public final void cancelFlow(java.lang.String reason) {
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "Verification Capture Event: ".concat(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.VERIFICATION_FLOW_CANCELLED), kotlin.collections.MapsKt.plus(Camera2StreamConfigurationMap(), getHighResolutionOutputSizeshNQ4ISI(kotlin.TuplesKt.to("cancel_reason", reason))), null, 4, null);
        this.getHighSpeedVideoSizes = null;
        this.getHighSpeedVideoFpsRangesFor = null;
        this.Camera2StreamConfigurationMap = 0;
    }

    public final void trackTutorialViewed() {
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "Verification Capture Event: ".concat(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.TUTORIAL_SCREEN_VIEWED), Camera2StreamConfigurationMap(), null, 4, null);
    }

    public final void trackDocumentCaptureStarted(java.lang.String documentType, java.lang.String documentSide) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentSide, "");
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "Verification Capture Event: ".concat(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.DOCUMENT_CAPTURE_STARTED), kotlin.collections.MapsKt.plus(Camera2StreamConfigurationMap(), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.Attributes.DOCUMENT_TYPE, documentType), kotlin.TuplesKt.to(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.Attributes.DOCUMENT_SIDE, documentSide))), null, 4, null);
    }

    public static /* synthetic */ void trackDocumentCaptureSuccess$default(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureAnalyticsTracker verificationCaptureAnalyticsTracker, java.lang.String str, java.lang.String str2, long j, java.lang.Float f, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            f = null;
        }
        verificationCaptureAnalyticsTracker.trackDocumentCaptureSuccess(str, str2, j, f);
    }

    public final void trackDocumentCaptureSuccess(java.lang.String documentType, java.lang.String documentSide, long captureTimeMs, java.lang.Float qualityScore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentSide, "");
        java.util.Map plus = kotlin.collections.MapsKt.plus(Camera2StreamConfigurationMap(), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.Attributes.DOCUMENT_TYPE, documentType), kotlin.TuplesKt.to(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.Attributes.DOCUMENT_SIDE, documentSide), kotlin.TuplesKt.to(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.Attributes.CAPTURE_TIME_MS, java.lang.String.valueOf(captureTimeMs))));
        kotlin.Pair[] pairArr = new kotlin.Pair[1];
        pairArr[0] = kotlin.TuplesKt.to(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.Attributes.QUALITY_SCORE, qualityScore != null ? java.lang.String.valueOf(qualityScore.floatValue()) : null);
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "Verification Capture Event: ".concat(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.DOCUMENT_CAPTURE_SUCCESS), kotlin.collections.MapsKt.plus(plus, getHighResolutionOutputSizeshNQ4ISI(pairArr)), null, 4, null);
    }

    public final void trackDocumentCaptureFailed(java.lang.String errorCode, java.lang.String errorMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "Verification Capture Event: ".concat(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.DOCUMENT_CAPTURE_FAILED), kotlin.collections.MapsKt.plus(Camera2StreamConfigurationMap(), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.Attributes.ERROR_CODE, errorCode), kotlin.TuplesKt.to("error_message", errorMessage))), null, 4, null);
    }

    public final void trackLivenessCheckStarted() {
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "Verification Capture Event: ".concat(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.LIVENESS_CHECK_STARTED), Camera2StreamConfigurationMap(), null, 4, null);
    }

    public final void trackLivenessCheckSuccess(long captureTimeMs) {
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "Verification Capture Event: ".concat(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.LIVENESS_CHECK_SUCCESS), kotlin.collections.MapsKt.plus(Camera2StreamConfigurationMap(), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.Attributes.CAPTURE_TIME_MS, java.lang.String.valueOf(captureTimeMs)))), null, 4, null);
    }

    public final void trackLivenessCheckFailed(java.lang.String errorCode, java.lang.String errorMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "Verification Capture Event: ".concat(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.LIVENESS_CHECK_FAILED), kotlin.collections.MapsKt.plus(Camera2StreamConfigurationMap(), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.Attributes.ERROR_CODE, errorCode), kotlin.TuplesKt.to("error_message", errorMessage))), null, 4, null);
    }

    public final void trackSDKInitialized(java.lang.String sdkName, java.lang.String sdkVersion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkVersion, "");
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "Verification Capture Event: ".concat(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.SDK_INITIALIZED), kotlin.collections.MapsKt.plus(Camera2StreamConfigurationMap(), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.Attributes.SDK_NAME, sdkName), kotlin.TuplesKt.to("sdk_version", sdkVersion))), null, 4, null);
    }

    public final void trackRetryAttempted(java.lang.String screenName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(screenName, "");
        this.Camera2StreamConfigurationMap++;
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "Verification Capture Event: ".concat(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.RETRY_ATTEMPTED), kotlin.collections.MapsKt.plus(Camera2StreamConfigurationMap(), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("screen_name", screenName), kotlin.TuplesKt.to("retry_count", java.lang.String.valueOf(this.Camera2StreamConfigurationMap)))), null, 4, null);
    }

    private final java.util.Map<java.lang.String, java.lang.String> Camera2StreamConfigurationMap() {
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        java.lang.String str = this.getHighSpeedVideoSizes;
        if (str == null) {
            str = "unknown";
        }
        pairArr[0] = kotlin.TuplesKt.to(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.Attributes.FLOW_ID, str);
        java.lang.String str2 = this.getHighSpeedVideoFpsRangesFor;
        pairArr[1] = kotlin.TuplesKt.to("session_id", str2 != null ? str2 : "unknown");
        return kotlin.collections.MapsKt.mapOf(pairArr);
    }

    private static java.util.Map<java.lang.String, java.lang.String> getHighResolutionOutputSizeshNQ4ISI(kotlin.Pair<java.lang.String, java.lang.String>... p0) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = p0.length;
        for (int i = 0; i <= 0; i++) {
            kotlin.Pair<java.lang.String, java.lang.String> pair = p0[0];
            java.lang.String component1 = pair.component1();
            java.lang.String component2 = pair.component2();
            kotlin.Pair pair2 = component2 != null ? kotlin.TuplesKt.to(component1, component2) : null;
            if (pair2 != null) {
                arrayList.add(pair2);
            }
        }
        return kotlin.collections.MapsKt.toMap(arrayList);
    }
}
