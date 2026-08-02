package androidx.camera.core.processing.util;

/* loaded from: classes6.dex */
public abstract class OutputSurface {
    public abstract android.opengl.EGLSurface getEglSurface();

    public abstract int getHeight();

    public abstract int getWidth();

    public static androidx.camera.core.processing.util.OutputSurface of(android.opengl.EGLSurface eGLSurface, int i, int i2) {
        return new androidx.camera.core.processing.util.AutoValue_OutputSurface(eGLSurface, i, i2);
    }
}
