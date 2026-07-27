package com.inmobi.media;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.s8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class TextureViewSurfaceTextureListenerC4071s8 implements TextureView.SurfaceTextureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4099t8 f7368a;

    public TextureViewSurfaceTextureListenerC4071s8(C4099t8 c4099t8) {
        this.f7368a = c4099t8;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surface, int i, int i2) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        InterfaceC4112tl interfaceC4112tl = this.f7368a.e;
        if (interfaceC4112tl != null) {
            interfaceC4112tl.a(surface);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        InterfaceC4112tl interfaceC4112tl = this.f7368a.e;
        if (interfaceC4112tl == null) {
            return true;
        }
        interfaceC4112tl.a();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surface, int i, int i2) {
        Intrinsics.checkNotNullParameter(surface, "surface");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
    }
}
