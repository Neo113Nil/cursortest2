package A1;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* loaded from: classes.dex */
public final class K implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N f109a;

    public K(N n2) {
        this.f109a = n2;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i8) {
        N n2 = this.f109a;
        n2.getClass();
        Surface surface = new Surface(surfaceTexture);
        n2.Q(surface);
        n2.f140O = surface;
        N.q(n2, i7, i8);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        N n2 = this.f109a;
        n2.Q(null);
        N.q(n2, 0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i8) {
        N.q(this.f109a, i7, i8);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i7, int i8, int i9) {
        N.q(this.f109a, i8, i9);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f109a.getClass();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        N n2 = this.f109a;
        n2.getClass();
        N.q(n2, 0, 0);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
