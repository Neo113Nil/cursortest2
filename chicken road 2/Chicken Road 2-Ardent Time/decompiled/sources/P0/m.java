package P0;

/* loaded from: classes.dex */
public final class m implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ P0.n f1372a;

    public m(P0.n nVar) {
        this.f1372a = nVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i2, int i3) {
        P0.n nVar = this.f1372a;
        nVar.f1373a = true;
        if ((nVar.f1375c == null || nVar.f1374b) ? false : true) {
            nVar.e();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        P0.n nVar = this.f1372a;
        boolean z2 = false;
        nVar.f1373a = false;
        io.flutter.embedding.engine.renderer.h hVar = nVar.f1375c;
        if (hVar != null && !nVar.f1374b) {
            z2 = true;
        }
        if (z2) {
            if (hVar == null) {
                throw new java.lang.IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            hVar.e();
            android.view.Surface surface = nVar.f1376d;
            if (surface != null) {
                surface.release();
                nVar.f1376d = null;
            }
        }
        android.view.Surface surface2 = nVar.f1376d;
        if (surface2 != null) {
            surface2.release();
            nVar.f1376d = null;
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i2, int i3) {
        P0.n nVar = this.f1372a;
        io.flutter.embedding.engine.renderer.h hVar = nVar.f1375c;
        if (hVar == null || nVar.f1374b) {
            return;
        }
        if (hVar == null) {
            throw new java.lang.IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        hVar.f7676a.onSurfaceChanged(i2, i3);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
    }
}
