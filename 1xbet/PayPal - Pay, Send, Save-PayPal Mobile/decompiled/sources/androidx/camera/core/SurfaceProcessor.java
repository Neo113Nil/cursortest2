package androidx.camera.core;

/* loaded from: classes6.dex */
public interface SurfaceProcessor {
    void onInputSurface(androidx.camera.core.SurfaceRequest surfaceRequest) throws androidx.camera.core.ProcessingException;

    void onOutputSurface(androidx.camera.core.SurfaceOutput surfaceOutput) throws androidx.camera.core.ProcessingException;
}
