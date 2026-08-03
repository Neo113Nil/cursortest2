package com.inmobi.media;

/* loaded from: classes5.dex */
public final class S7 implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.T7 f4950a;

    public S7(com.inmobi.media.T7 t7) {
        this.f4950a = t7;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surface, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surface, "surface");
        com.inmobi.media.Yj yj = this.f4950a.e;
        if (yj != null) {
            yj.a(surface);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surface, "surface");
        com.inmobi.media.Yj yj = this.f4950a.e;
        if (yj == null) {
            return true;
        }
        yj.a();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surface, "surface");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surface, "surface");
    }
}
