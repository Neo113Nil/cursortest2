package androidx.camera.video.internal.compat.quirk;

/* loaded from: classes6.dex */
public class StretchedVideoResolutionQuirk implements androidx.camera.core.impl.Quirk {
    public android.util.Size getAlternativeResolution(int i) {
        if (i == 4) {
            return new android.util.Size(640, androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND);
        }
        if (i == 5) {
            return new android.util.Size(960, com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_HEIGHT);
        }
        if (i != 6) {
            return null;
        }
        return new android.util.Size(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_WIDTH, 1080);
    }

    static boolean getHighSpeedVideoSizes() {
        return "motorola".equalsIgnoreCase(android.os.Build.BRAND) && "moto e5 play".equalsIgnoreCase(android.os.Build.MODEL);
    }
}
