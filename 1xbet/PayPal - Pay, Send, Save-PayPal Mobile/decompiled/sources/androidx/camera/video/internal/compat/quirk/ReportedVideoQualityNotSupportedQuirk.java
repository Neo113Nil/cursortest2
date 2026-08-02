package androidx.camera.video.internal.compat.quirk;

/* loaded from: classes6.dex */
public class ReportedVideoQualityNotSupportedQuirk implements androidx.camera.video.internal.compat.quirk.VideoQualityQuirk, androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk {
    private static boolean getHighSpeedVideoFpsRanges() {
        return "Huawei".equalsIgnoreCase(android.os.Build.MANUFACTURER) && java.util.Arrays.asList("JNY-L21A", "JNY-L01A", "JNY-L21B", "JNY-L22A", "JNY-L02A", "JNY-L22B", "JNY-LX1").contains(android.os.Build.MODEL.toUpperCase(java.util.Locale.US));
    }

    static boolean getHighSpeedVideoSizes() {
        if ("Huawei".equalsIgnoreCase(android.os.Build.BRAND) && "HMA-L29".equalsIgnoreCase(android.os.Build.MODEL)) {
            return true;
        }
        if ("Huawei".equalsIgnoreCase(android.os.Build.BRAND) && "LYA-AL00".equalsIgnoreCase(android.os.Build.MODEL)) {
            return true;
        }
        if (("Vivo".equalsIgnoreCase(android.os.Build.BRAND) && "vivo 1820".equalsIgnoreCase(android.os.Build.MODEL)) || getHighSpeedVideoFpsRanges()) {
            return true;
        }
        return "OPPO".equalsIgnoreCase(android.os.Build.BRAND) && "PHT110".equalsIgnoreCase(android.os.Build.MODEL);
    }

    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    public boolean isProblematicVideoQuality(androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, androidx.camera.video.Quality quality) {
        return (("Huawei".equalsIgnoreCase(android.os.Build.BRAND) && "HMA-L29".equalsIgnoreCase(android.os.Build.MODEL)) || ("Huawei".equalsIgnoreCase(android.os.Build.BRAND) && "LYA-AL00".equalsIgnoreCase(android.os.Build.MODEL))) ? quality == androidx.camera.video.Quality.UHD : ("Vivo".equalsIgnoreCase(android.os.Build.BRAND) && "vivo 1820".equalsIgnoreCase(android.os.Build.MODEL)) ? quality == androidx.camera.video.Quality.HD || quality == androidx.camera.video.Quality.FHD : getHighSpeedVideoFpsRanges() ? cameraInfoInternal.getLensFacing() == 0 && (quality == androidx.camera.video.Quality.FHD || quality == androidx.camera.video.Quality.HD) : "OPPO".equalsIgnoreCase(android.os.Build.BRAND) && "PHT110".equalsIgnoreCase(android.os.Build.MODEL) && cameraInfoInternal.getLensFacing() == 1 && quality == androidx.camera.video.Quality.UHD;
    }

    @Override // androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk
    public boolean workaroundBySurfaceProcessing() {
        if ("Huawei".equalsIgnoreCase(android.os.Build.BRAND) && "HMA-L29".equalsIgnoreCase(android.os.Build.MODEL)) {
            return true;
        }
        if (("Huawei".equalsIgnoreCase(android.os.Build.BRAND) && "LYA-AL00".equalsIgnoreCase(android.os.Build.MODEL)) || getHighSpeedVideoFpsRanges()) {
            return true;
        }
        return "OPPO".equalsIgnoreCase(android.os.Build.BRAND) && "PHT110".equalsIgnoreCase(android.os.Build.MODEL);
    }
}
