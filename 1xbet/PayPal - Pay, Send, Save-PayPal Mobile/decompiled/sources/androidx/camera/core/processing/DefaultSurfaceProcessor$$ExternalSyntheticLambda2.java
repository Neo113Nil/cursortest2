package androidx.camera.core.processing;

/* loaded from: classes6.dex */
public final /* synthetic */ class DefaultSurfaceProcessor$$ExternalSyntheticLambda2 implements java.lang.Runnable {
    public final /* synthetic */ androidx.camera.core.SurfaceRequest f$0;

    public /* synthetic */ DefaultSurfaceProcessor$$ExternalSyntheticLambda2(androidx.camera.core.SurfaceRequest surfaceRequest) {
        this.f$0 = surfaceRequest;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f$0.willNotProvideSurface();
    }
}
