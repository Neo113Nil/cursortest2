package com.paypal.oslo.feature.verificationcapture.ui.screens.daonface;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J=\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/FaceAnalysisDecider;", "", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/TimeBasedWarningDecider;", "warningDecider", "<init>", "(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/TimeBasedWarningDecider;)V", "", "faceInOval", "Lcom/daon/sdk/face/QualityResult;", com.daon.sdk.face.license.License.FEATURE_QUALITY, "Lcom/daon/sdk/face/LivenessResult;", com.daon.sdk.face.license.License.FEATURE_LIVENESS, "livenessTimerStarted", "blinkEnabled", "", "timeSinceGoodFace", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/AnalysisAction;", "decideAction", "(ZLcom/daon/sdk/face/QualityResult;Lcom/daon/sdk/face/LivenessResult;ZZJ)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/AnalysisAction;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/TimeBasedWarningDecider;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FaceAnalysisDecider {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.TimeBasedWarningDecider Camera2StreamConfigurationMap;

    public FaceAnalysisDecider(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.TimeBasedWarningDecider timeBasedWarningDecider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeBasedWarningDecider, "");
        this.Camera2StreamConfigurationMap = timeBasedWarningDecider;
    }

    public /* synthetic */ FaceAnalysisDecider(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.TimeBasedWarningDecider timeBasedWarningDecider, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.TimeBasedWarningDecider() : timeBasedWarningDecider);
    }

    public final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.AnalysisAction decideAction(boolean faceInOval, com.daon.sdk.face.QualityResult quality, com.daon.sdk.face.LivenessResult liveness, boolean livenessTimerStarted, boolean blinkEnabled, long timeSinceGoodFace) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quality, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(liveness, "");
        if (livenessTimerStarted) {
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.AnalysisAction.CollectLivenessFrame(quality);
        }
        if (!faceInOval) {
            com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningState decideWarning = this.Camera2StreamConfigurationMap.decideWarning(timeSinceGoodFace);
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.AnalysisAction.ShowWarning(decideWarning.getOvalColor(), decideWarning.getTutorialVisible(), decideWarning.getBlinkVisible(), decideWarning.getWarning());
        }
        if (blinkEnabled && quality.hasAcceptableQuality() && quality.isFaceCentered() && !liveness.isBlink()) {
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.AnalysisAction.WaitForBlink(quality);
        }
        if (faceInOval && quality.getScore() > 0.75f && quality.hasAcceptableQuality()) {
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.AnalysisAction.StartLiveness(quality);
        }
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.AnalysisAction.WaitForQuality(quality);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FaceAnalysisDecider() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
