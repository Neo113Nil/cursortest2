package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public abstract class OutputSurface {
    public abstract int getImageFormat();

    public abstract android.util.Size getSize();

    public abstract android.view.Surface getSurface();

    public static androidx.camera.core.impl.OutputSurface create(android.view.Surface surface, android.util.Size size, int i) {
        return new androidx.camera.core.impl.AutoValue_OutputSurface(surface, size, i);
    }
}
