package androidx.camera.core.processing;

/* loaded from: classes6.dex */
public final /* synthetic */ class SurfaceEdge$$ExternalSyntheticLambda2 implements java.lang.Runnable {
    public final /* synthetic */ androidx.camera.core.processing.SurfaceEdge.SettableSurface f$0;

    public /* synthetic */ SurfaceEdge$$ExternalSyntheticLambda2(androidx.camera.core.processing.SurfaceEdge.SettableSurface settableSurface) {
        this.f$0 = settableSurface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f$0.close();
    }
}
