package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public abstract class OutputSurfaceConfiguration {
    public abstract androidx.camera.core.impl.OutputSurface getImageAnalysisOutputSurface();

    public abstract androidx.camera.core.impl.OutputSurface getImageCaptureOutputSurface();

    public abstract androidx.camera.core.impl.OutputSurface getPostviewOutputSurface();

    public abstract androidx.camera.core.impl.OutputSurface getPreviewOutputSurface();

    public static androidx.camera.core.impl.OutputSurfaceConfiguration create(androidx.camera.core.impl.OutputSurface outputSurface, androidx.camera.core.impl.OutputSurface outputSurface2, androidx.camera.core.impl.OutputSurface outputSurface3, androidx.camera.core.impl.OutputSurface outputSurface4) {
        return new androidx.camera.core.impl.AutoValue_OutputSurfaceConfiguration(outputSurface, outputSurface2, outputSurface3, outputSurface4);
    }
}
