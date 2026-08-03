package com.inmobi.media;

/* renamed from: com.inmobi.media.r8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2716r8 implements com.inmobi.media.Yj {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.C2742s8 f5422a;

    public C2716r8(com.inmobi.media.C2742s8 c2742s8) {
        this.f5422a = c2742s8;
    }

    @Override // com.inmobi.media.Yj
    public final void a(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surface, "surface");
        android.view.Surface surface2 = new android.view.Surface(surface);
        com.inmobi.media.C2742s8 c2742s8 = this.f5422a;
        android.view.Surface surface3 = c2742s8.e;
        if (surface3 != null) {
            surface3.release();
        }
        c2742s8.e = surface2;
        com.inmobi.media.Zj zj = this.f5422a.f;
        if (zj != null) {
            zj.c();
        }
    }

    @Override // com.inmobi.media.Yj
    public final void a() {
        this.f5422a.b.clearVideoSurface();
        this.f5422a.b.setVideoSurface(null);
        android.view.Surface surface = this.f5422a.e;
        if (surface != null) {
            surface.release();
        }
        this.f5422a.e = null;
    }
}
