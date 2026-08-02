package com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.util;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/util/GuidanceMessageMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentDetectionStatus;", "status", "", "getGuidanceMessageResId", "(Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentDetectionStatus;)I"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GuidanceMessageMapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.util.GuidanceMessageMapper INSTANCE = new com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.util.GuidanceMessageMapper();

    private GuidanceMessageMapper() {
    }

    public final int getGuidanceMessageResId(com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus status) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(status, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus.NoDocument.INSTANCE)) {
            return 0;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(status, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus.DocumentDetected.INSTANCE)) {
            return com.paypal.oslo.feature.verificationcapture.R.string.feature_verification_capture_hold_device_steady_label;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(status, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus.DocumentTooFar.INSTANCE)) {
            return com.paypal.oslo.feature.verificationcapture.R.string.feature_verification_capture_move_device_nearer_label;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(status, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus.DocumentTooClose.INSTANCE)) {
            return com.paypal.oslo.feature.verificationcapture.R.string.feature_verification_capture_move_device_further_label;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(status, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus.DocumentNotCentered.INSTANCE)) {
            return 0;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(status, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus.LightingTooLow.INSTANCE)) {
            return com.paypal.oslo.feature.verificationcapture.R.string.feature_verification_capture_liveness_lighting_dark_label;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(status, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus.GlareDetected.INSTANCE)) {
            return com.paypal.oslo.feature.verificationcapture.R.string.feature_verification_capture_image_quality_lighting_dark_label;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(status, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus.BlurDetected.INSTANCE)) {
            return com.paypal.oslo.feature.verificationcapture.R.string.feature_verification_capture_hold_device_steady_label;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(status, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus.Ready.INSTANCE)) {
            return 0;
        }
        if (!(status instanceof com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus.Capturing)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        if (((com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus.Capturing) status).getProgress() >= 1.0f) {
            return com.paypal.oslo.feature.verificationcapture.R.string.feature_verification_capture_document_scan_front_success_accessibility;
        }
        return com.paypal.oslo.feature.verificationcapture.R.string.feature_verification_capture_document_capture_upload_label;
    }
}
