package androidx.camera.video.internal.compat.quirk;

/* loaded from: classes6.dex */
public class ExcludeStretchedVideoQualityQuirk implements androidx.camera.video.internal.compat.quirk.VideoQualityQuirk {
    private static boolean Camera2StreamConfigurationMap() {
        return "Samsung".equalsIgnoreCase(android.os.Build.BRAND) && "SM-G610M".equalsIgnoreCase(android.os.Build.MODEL) && android.os.Build.VERSION.SDK_INT >= 27;
    }

    private static boolean getHighSpeedVideoSizes() {
        return "Samsung".equalsIgnoreCase(android.os.Build.BRAND) && "SM-J710MN".equalsIgnoreCase(android.os.Build.MODEL) && android.os.Build.VERSION.SDK_INT >= 27;
    }

    static boolean getHighSpeedVideoFpsRanges() {
        if ("Samsung".equalsIgnoreCase(android.os.Build.BRAND) && "SM-J260F".equalsIgnoreCase(android.os.Build.MODEL)) {
            return true;
        }
        if ("Samsung".equalsIgnoreCase(android.os.Build.BRAND) && "SM-J400G".equalsIgnoreCase(android.os.Build.MODEL)) {
            return true;
        }
        if ("Samsung".equalsIgnoreCase(android.os.Build.BRAND) && "SM-J530F".equalsIgnoreCase(android.os.Build.MODEL)) {
            return true;
        }
        if ("Samsung".equalsIgnoreCase(android.os.Build.BRAND) && "sm-j600g".equalsIgnoreCase(android.os.Build.MODEL)) {
            return true;
        }
        return ("Samsung".equalsIgnoreCase(android.os.Build.BRAND) && "SM-J701F".equalsIgnoreCase(android.os.Build.MODEL)) || Camera2StreamConfigurationMap() || getHighSpeedVideoSizes();
    }

    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    public boolean isProblematicVideoQuality(androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, androidx.camera.video.Quality quality) {
        return ("Samsung".equalsIgnoreCase(android.os.Build.BRAND) && "SM-J400G".equalsIgnoreCase(android.os.Build.MODEL)) ? quality == androidx.camera.video.Quality.FHD || quality == androidx.camera.video.Quality.UHD : (("Samsung".equalsIgnoreCase(android.os.Build.BRAND) && "SM-J260F".equalsIgnoreCase(android.os.Build.MODEL)) || (("Samsung".equalsIgnoreCase(android.os.Build.BRAND) && "SM-J530F".equalsIgnoreCase(android.os.Build.MODEL)) || (("Samsung".equalsIgnoreCase(android.os.Build.BRAND) && "sm-j600g".equalsIgnoreCase(android.os.Build.MODEL)) || (("Samsung".equalsIgnoreCase(android.os.Build.BRAND) && "SM-J701F".equalsIgnoreCase(android.os.Build.MODEL)) || Camera2StreamConfigurationMap() || getHighSpeedVideoSizes())))) && quality == androidx.camera.video.Quality.FHD;
    }
}
