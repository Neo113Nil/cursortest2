package F;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

/* renamed from: F.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class TextureViewSurfaceTextureListenerC0015p implements TextureView.SurfaceTextureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0016q f105a;

    public TextureViewSurfaceTextureListenerC0015p(C0016q c0016q) {
        this.f105a = c0016q;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        C0016q c0016q = this.f105a;
        c0016q.f106a = true;
        if (c0016q.f108c == null || c0016q.f107b) {
            return;
        }
        c0016q.e();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C0016q c0016q = this.f105a;
        c0016q.f106a = false;
        io.flutter.embedding.engine.renderer.h hVar = c0016q.f108c;
        if (hVar != null && !c0016q.f107b) {
            if (hVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            hVar.e();
            Surface surface = c0016q.f109d;
            if (surface != null) {
                surface.release();
                c0016q.f109d = null;
            }
        }
        Surface surface2 = c0016q.f109d;
        if (surface2 == null) {
            return true;
        }
        surface2.release();
        c0016q.f109d = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        C0016q c0016q = this.f105a;
        io.flutter.embedding.engine.renderer.h hVar = c0016q.f108c;
        if (hVar == null || c0016q.f107b) {
            return;
        }
        if (hVar == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        hVar.f593a.onSurfaceChanged(i2, i3);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
