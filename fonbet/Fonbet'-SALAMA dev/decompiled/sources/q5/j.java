package q5;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

/* loaded from: classes2.dex */
public final class j implements TextureView.SurfaceTextureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f15905a;

    public j(k kVar) {
        this.f15905a = kVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i8) {
        k kVar = this.f15905a;
        kVar.f15906a = true;
        if ((kVar.f15908c == null || kVar.f15907b) ? false : true) {
            kVar.c();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        k kVar = this.f15905a;
        boolean z4 = false;
        kVar.f15906a = false;
        io.flutter.embedding.engine.renderer.k kVar2 = kVar.f15908c;
        if (kVar2 != null && !kVar.f15907b) {
            z4 = true;
        }
        if (z4) {
            if (kVar2 == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            kVar2.g();
            Surface surface = kVar.f15909d;
            if (surface != null) {
                surface.release();
                kVar.f15909d = null;
            }
        }
        Surface surface2 = kVar.f15909d;
        if (surface2 != null) {
            surface2.release();
            kVar.f15909d = null;
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i8) {
        k kVar = this.f15905a;
        io.flutter.embedding.engine.renderer.k kVar2 = kVar.f15908c;
        if (kVar2 == null || kVar.f15907b) {
            return;
        }
        if (kVar2 == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        kVar2.f14106a.onSurfaceChanged(i7, i8);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
