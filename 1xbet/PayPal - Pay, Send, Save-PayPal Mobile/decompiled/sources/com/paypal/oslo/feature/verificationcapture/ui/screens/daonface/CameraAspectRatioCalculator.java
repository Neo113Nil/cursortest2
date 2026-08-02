package com.paypal.oslo.feature.verificationcapture.ui.screens.daonface;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/CameraAspectRatioCalculator;", "", "<init>", "()V", "", "cameraWidth", "cameraHeight", "displayWidth", "displayHeight", "", "isPortrait", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/CameraDimensions;", "calculate", "(IIIIZ)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/CameraDimensions;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CameraAspectRatioCalculator {
    public static final int $stable = 0;

    public final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.CameraDimensions calculate(int cameraWidth, int cameraHeight, int displayWidth, int displayHeight, boolean isPortrait) {
        if (cameraWidth == 0 || cameraHeight == 0 || displayWidth == 0 || displayHeight == 0) {
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.CameraDimensions(displayWidth, displayHeight, 0, 0);
        }
        int i = isPortrait ? cameraHeight : cameraWidth;
        if (!isPortrait) {
            cameraWidth = cameraHeight;
        }
        double d = i / cameraWidth;
        double d2 = displayWidth;
        double d3 = displayHeight;
        if (d > d2 / d3) {
            int i2 = (int) (d * d3);
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.CameraDimensions(i2, displayHeight, -((i2 - displayWidth) / 2), 0);
        }
        int i3 = (int) (d2 / d);
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.CameraDimensions(displayWidth, i3, 0, -((i3 - displayHeight) / 2));
    }
}
