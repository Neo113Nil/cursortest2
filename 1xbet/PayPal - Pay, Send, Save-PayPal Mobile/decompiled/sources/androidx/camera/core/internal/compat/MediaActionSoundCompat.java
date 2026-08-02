package androidx.camera.core.internal.compat;

/* loaded from: classes6.dex */
public final class MediaActionSoundCompat {
    public static boolean mustPlayShutterSound() {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            return androidx.camera.core.internal.compat.MediaActionSoundCompatApi33Impl.Camera2StreamConfigurationMap();
        }
        return androidx.camera.core.internal.compat.MediaActionSoundCompatBaseImpl.Camera2StreamConfigurationMap();
    }

    private MediaActionSoundCompat() {
    }
}
