package p121q5;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import io.flutter.embedding.engine.renderer.k;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f15911a;

    public j(k kVar) {
        this.f15911a = kVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i8) {
        k kVar = this.f15911a;
        kVar.f15912a = true;
        if ((kVar.f15914c == null || kVar.f15913b) ? false : true) {
            kVar.c();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        k kVar = this.f15911a;
        boolean z4 = false;
        kVar.f15912a = false;
        k kVar2 = kVar.f15914c;
        if (kVar2 != null && !kVar.f15913b) {
            z4 = true;
        }
        if (z4) {
            if (kVar2 == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            kVar2.g();
            Surface surface = kVar.f15915d;
            if (surface != null) {
                surface.release();
                kVar.f15915d = null;
            }
        }
        Surface surface2 = kVar.f15915d;
        if (surface2 != null) {
            surface2.release();
            kVar.f15915d = null;
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i8) {
        k kVar = this.f15911a;
        k kVar2 = kVar.f15914c;
        if (kVar2 == null || kVar.f15913b) {
            return;
        }
        if (kVar2 == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        kVar2.f14112a.onSurfaceChanged(i7, i8);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
