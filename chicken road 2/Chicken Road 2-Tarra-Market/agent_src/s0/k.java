package s0;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

/* loaded from: classes.dex */
public final class k implements TextureView.SurfaceTextureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f6539a;

    public k(l lVar) {
        this.f6539a = lVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        l lVar = this.f6539a;
        lVar.f6540a = true;
        if ((lVar.f6542c == null || lVar.f6541b) ? false : true) {
            lVar.e();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        l lVar = this.f6539a;
        boolean z2 = false;
        lVar.f6540a = false;
        io.flutter.embedding.engine.renderer.i iVar = lVar.f6542c;
        if (iVar != null && !lVar.f6541b) {
            z2 = true;
        }
        if (z2) {
            if (iVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            iVar.e();
            Surface surface = lVar.f6543d;
            if (surface != null) {
                surface.release();
                lVar.f6543d = null;
            }
        }
        Surface surface2 = lVar.f6543d;
        if (surface2 != null) {
            surface2.release();
            lVar.f6543d = null;
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        l lVar = this.f6539a;
        io.flutter.embedding.engine.renderer.i iVar = lVar.f6542c;
        if (iVar == null || lVar.f6541b) {
            return;
        }
        if (iVar == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        iVar.f5784a.onSurfaceChanged(i2, i3);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
