package androidx.camera.video.internal.compat.quirk;

/* loaded from: classes6.dex */
public class VideoEncoderCrashQuirk implements androidx.camera.video.internal.compat.quirk.VideoQualityQuirk {
    static boolean Camera2StreamConfigurationMap() {
        return "positivo".equalsIgnoreCase(android.os.Build.BRAND) && "twist 2 pro".equalsIgnoreCase(android.os.Build.MODEL);
    }

    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    public boolean isProblematicVideoQuality(androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, androidx.camera.video.Quality quality) {
        return "positivo".equalsIgnoreCase(android.os.Build.BRAND) && "twist 2 pro".equalsIgnoreCase(android.os.Build.MODEL) && cameraInfoInternal.getLensFacing() == 0 && quality == androidx.camera.video.Quality.SD;
    }
}
