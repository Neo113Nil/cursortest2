package com.inmobi.media;

/* renamed from: com.inmobi.media.be, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class TextureViewSurfaceTextureListenerC2301be implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.C2328ce f5122a;

    public TextureViewSurfaceTextureListenerC2301be(com.inmobi.media.C2328ce c2328ce) {
        this.f5122a = c2328ce;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surface, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surface, "surface");
        com.inmobi.media.Yj yj = this.f5122a.e;
        if (yj != null) {
            yj.a(surface);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surface, "surface");
        com.inmobi.media.Yj yj = this.f5122a.e;
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
