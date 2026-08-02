package com.paypal.oslo.feature.verificationcapture.telemetry;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b#\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001'B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0006R\u0014\u0010\u001a\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0006R\u0014\u0010\u001c\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0006R\u0014\u0010\u001e\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0006R\u0014\u0010 \u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b \u0010\u0006R\u0014\u0010!\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b!\u0010\u0006R\u0014\u0010\"\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\"\u0010\u0006R\u0014\u0010#\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b#\u0010\u0006R\u0014\u0010$\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b$\u0010\u0006R\u0014\u0010%\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b%\u0010\u0006R\u0014\u0010&\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b&\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/telemetry/VerificationCaptureTelemetry;", "", "<init>", "()V", "", "VERIFICATION_FLOW_STARTED", "Ljava/lang/String;", "VERIFICATION_FLOW_COMPLETED", "VERIFICATION_FLOW_CANCELLED", "TUTORIAL_SCREEN_VIEWED", "TUTORIAL_CONTINUE_TAPPED", "TUTORIAL_CANCELLED", "DOCUMENT_CAPTURE_STARTED", "DOCUMENT_CAPTURE_SUCCESS", "DOCUMENT_CAPTURE_FAILED", "DOCUMENT_CAPTURE_TIMEOUT", "DOCUMENT_CAPTURE_CANCELLED", "DOCUMENT_REVIEW_VIEWED", "DOCUMENT_CONFIRMED", "DOCUMENT_RETAKE_REQUESTED", "DOCUMENT_UPLOAD_STARTED", "DOCUMENT_UPLOAD_SUCCESS", "DOCUMENT_UPLOAD_FAILED", "LIVENESS_CHECK_STARTED", "LIVENESS_CHECK_SUCCESS", "LIVENESS_CHECK_FAILED", "LIVENESS_CHECK_TIMEOUT", "LIVENESS_CHECK_CANCELLED", "LIVENESS_REVIEW_VIEWED", "LIVENESS_CONFIRMED", "LIVENESS_RETAKE_REQUESTED", "SDK_INITIALIZED", "SDK_INITIALIZATION_FAILED", "CAMERA_PERMISSION_REQUESTED", "CAMERA_PERMISSION_GRANTED", "CAMERA_PERMISSION_DENIED", "ERROR_SCREEN_VIEWED", "TIMEOUT_SCREEN_VIEWED", "RETRY_ATTEMPTED", "Attributes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class VerificationCaptureTelemetry {
    public static final int $stable = 0;
    public static final java.lang.String CAMERA_PERMISSION_DENIED = "camera_permission_denied";
    public static final java.lang.String CAMERA_PERMISSION_GRANTED = "camera_permission_granted";
    public static final java.lang.String CAMERA_PERMISSION_REQUESTED = "camera_permission_requested";
    public static final java.lang.String DOCUMENT_CAPTURE_CANCELLED = "document_capture_cancelled";
    public static final java.lang.String DOCUMENT_CAPTURE_FAILED = "document_capture_failed";
    public static final java.lang.String DOCUMENT_CAPTURE_STARTED = "document_capture_started";
    public static final java.lang.String DOCUMENT_CAPTURE_SUCCESS = "document_capture_success";
    public static final java.lang.String DOCUMENT_CAPTURE_TIMEOUT = "document_capture_timeout";
    public static final java.lang.String DOCUMENT_CONFIRMED = "document_confirmed";
    public static final java.lang.String DOCUMENT_RETAKE_REQUESTED = "document_retake_requested";
    public static final java.lang.String DOCUMENT_REVIEW_VIEWED = "document_review_viewed";
    public static final java.lang.String DOCUMENT_UPLOAD_FAILED = "document_upload_failed";
    public static final java.lang.String DOCUMENT_UPLOAD_STARTED = "document_upload_started";
    public static final java.lang.String DOCUMENT_UPLOAD_SUCCESS = "document_upload_success";
    public static final java.lang.String ERROR_SCREEN_VIEWED = "verification_error_viewed";
    public static final com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry INSTANCE = new com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry();
    public static final java.lang.String LIVENESS_CHECK_CANCELLED = "liveness_check_cancelled";
    public static final java.lang.String LIVENESS_CHECK_FAILED = "liveness_check_failed";
    public static final java.lang.String LIVENESS_CHECK_STARTED = "liveness_check_started";
    public static final java.lang.String LIVENESS_CHECK_SUCCESS = "liveness_check_success";
    public static final java.lang.String LIVENESS_CHECK_TIMEOUT = "liveness_check_timeout";
    public static final java.lang.String LIVENESS_CONFIRMED = "liveness_confirmed";
    public static final java.lang.String LIVENESS_RETAKE_REQUESTED = "liveness_retake_requested";
    public static final java.lang.String LIVENESS_REVIEW_VIEWED = "liveness_review_viewed";
    public static final java.lang.String RETRY_ATTEMPTED = "verification_retry_attempted";
    public static final java.lang.String SDK_INITIALIZATION_FAILED = "verification_sdk_initialization_failed";
    public static final java.lang.String SDK_INITIALIZED = "verification_sdk_initialized";
    public static final java.lang.String TIMEOUT_SCREEN_VIEWED = "verification_timeout_viewed";
    public static final java.lang.String TUTORIAL_CANCELLED = "verification_tutorial_cancelled";
    public static final java.lang.String TUTORIAL_CONTINUE_TAPPED = "verification_tutorial_continue";
    public static final java.lang.String TUTORIAL_SCREEN_VIEWED = "verification_tutorial_viewed";
    public static final java.lang.String VERIFICATION_FLOW_CANCELLED = "verification_capture_flow_cancelled";
    public static final java.lang.String VERIFICATION_FLOW_COMPLETED = "verification_capture_flow_completed";
    public static final java.lang.String VERIFICATION_FLOW_STARTED = "verification_capture_flow_started";

    private VerificationCaptureTelemetry() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/telemetry/VerificationCaptureTelemetry$Attributes;", "", "<init>", "()V", "", "DOCUMENT_TYPE", "Ljava/lang/String;", "DOCUMENT_SIDE", "ERROR_CODE", "ERROR_MESSAGE", "CAPTURE_TIME_MS", "QUALITY_SCORE", "SDK_NAME", "SDK_VERSION", "TIMEOUT_SECONDS", "RETRY_COUNT", "FLOW_ID", com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Target.SESSION_ID}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Attributes {
        public static final int $stable = 0;
        public static final java.lang.String CAPTURE_TIME_MS = "capture_time_ms";
        public static final java.lang.String DOCUMENT_SIDE = "document_side";
        public static final java.lang.String DOCUMENT_TYPE = "document_type";
        public static final java.lang.String ERROR_CODE = "error_code";
        public static final java.lang.String ERROR_MESSAGE = "error_message";
        public static final java.lang.String FLOW_ID = "flow_id";
        public static final com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.Attributes INSTANCE = new com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.Attributes();
        public static final java.lang.String QUALITY_SCORE = "quality_score";
        public static final java.lang.String RETRY_COUNT = "retry_count";
        public static final java.lang.String SDK_NAME = "sdk_name";
        public static final java.lang.String SDK_VERSION = "sdk_version";
        public static final java.lang.String SESSION_ID = "session_id";
        public static final java.lang.String TIMEOUT_SECONDS = "timeout_seconds";

        private Attributes() {
        }
    }
}
