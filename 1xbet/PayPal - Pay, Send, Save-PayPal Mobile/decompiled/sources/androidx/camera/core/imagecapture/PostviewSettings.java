package androidx.camera.core.imagecapture;

/* loaded from: classes6.dex */
public abstract class PostviewSettings {
    public abstract int getInputFormat();

    public abstract android.util.Size getResolution();

    public static androidx.camera.core.imagecapture.PostviewSettings create(android.util.Size size, int i) {
        return new androidx.camera.core.imagecapture.AutoValue_PostviewSettings(size, i);
    }
}
