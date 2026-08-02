package androidx.camera.core.processing;

/* loaded from: classes6.dex */
public final /* synthetic */ class DefaultSurfaceProcessor$$ExternalSyntheticLambda13 implements java.lang.Runnable {
    public final /* synthetic */ androidx.camera.core.SurfaceOutput f$0;

    public /* synthetic */ DefaultSurfaceProcessor$$ExternalSyntheticLambda13(androidx.camera.core.SurfaceOutput surfaceOutput) {
        this.f$0 = surfaceOutput;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f$0.close();
    }
}
