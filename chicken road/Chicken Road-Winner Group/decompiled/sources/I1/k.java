package I1;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

/* loaded from: classes.dex */
public final class k implements TextureView.SurfaceTextureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f628a;

    public k(l lVar) {
        this.f628a = lVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i3, int i4) {
        l lVar = this.f628a;
        lVar.f629a = true;
        if ((lVar.f631c == null || lVar.f630b) ? false : true) {
            lVar.e();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        l lVar = this.f628a;
        boolean z3 = false;
        lVar.f629a = false;
        io.flutter.embedding.engine.renderer.j jVar = lVar.f631c;
        if (jVar != null && !lVar.f630b) {
            z3 = true;
        }
        if (z3) {
            if (jVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            jVar.j();
            Surface surface = lVar.f632d;
            if (surface != null) {
                surface.release();
                lVar.f632d = null;
            }
        }
        Surface surface2 = lVar.f632d;
        if (surface2 != null) {
            surface2.release();
            lVar.f632d = null;
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i3, int i4) {
        l lVar = this.f628a;
        io.flutter.embedding.engine.renderer.j jVar = lVar.f631c;
        if (jVar == null || lVar.f630b) {
            return;
        }
        if (jVar == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        jVar.f9165a.onSurfaceChanged(i3, i4);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
