package androidx.camera.core.internal.compat.quirk;

/* loaded from: classes6.dex */
public final class ImageCaptureRotationOptionQuirk implements androidx.camera.core.impl.Quirk {
    public final boolean isSupported(androidx.camera.core.impl.Config.Option<?> option) {
        return option != androidx.camera.core.impl.CaptureConfig.OPTION_ROTATION;
    }

    static boolean getHighSpeedVideoFpsRangesFor() {
        if ("HUAWEI".equalsIgnoreCase(android.os.Build.BRAND) && "SNE-LX1".equalsIgnoreCase(android.os.Build.MODEL)) {
            return true;
        }
        return "HONOR".equalsIgnoreCase(android.os.Build.BRAND) && "STK-LX1".equalsIgnoreCase(android.os.Build.MODEL);
    }
}
