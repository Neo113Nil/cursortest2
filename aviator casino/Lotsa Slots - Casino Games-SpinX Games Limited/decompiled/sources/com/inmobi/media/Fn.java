package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Fn implements com.inmobi.media.Yj {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.Gn f4713a;

    public Fn(com.inmobi.media.Gn gn) {
        this.f4713a = gn;
    }

    @Override // com.inmobi.media.Yj
    public final void a(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surface, "surface");
        android.view.Surface surface2 = new android.view.Surface(surface);
        com.inmobi.media.Gn gn = this.f4713a;
        gn.g = surface2;
        android.media.MediaPlayer mediaPlayer = gn.b;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaPlayer, "<this>");
        try {
            mediaPlayer.setSurface(surface2);
        } catch (java.lang.IllegalStateException unused) {
        }
        this.f4713a.a();
        com.inmobi.media.Zj zj = this.f4713a.h;
        if (zj != null) {
            zj.c();
        }
    }

    @Override // com.inmobi.media.Yj
    public final void a() {
        android.view.Surface surface = this.f4713a.g;
        if (surface != null) {
            surface.release();
        }
        com.inmobi.media.Gn gn = this.f4713a;
        gn.g = null;
        android.media.MediaPlayer mediaPlayer = gn.b;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaPlayer, "<this>");
        try {
            mediaPlayer.setSurface(null);
        } catch (java.lang.IllegalStateException unused) {
        }
        this.f4713a.a();
    }
}
