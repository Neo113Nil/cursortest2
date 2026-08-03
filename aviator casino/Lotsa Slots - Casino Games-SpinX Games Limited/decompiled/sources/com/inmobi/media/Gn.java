package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Gn {

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.CoroutineScope f4732a;
    public final android.media.MediaPlayer b;
    public final com.inmobi.media.C2799u9 c;
    public final java.util.concurrent.atomic.AtomicBoolean d;
    public final java.util.ArrayList e;
    public final com.inmobi.media.C2328ce f;
    public android.view.Surface g;
    public com.inmobi.media.Zj h;
    public final com.inmobi.media.C2627nn i;
    public final com.inmobi.media.Fn j;

    public Gn(kotlinx.coroutines.CoroutineScope coroutineScope, android.media.MediaPlayer mediaPlayer, android.widget.RelativeLayout mediaPlayerLayout, com.inmobi.media.C2469hn config, com.inmobi.media.C2799u9 c2799u9) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaPlayer, "mediaPlayer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaPlayerLayout, "mediaPlayerLayout");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        this.f4732a = coroutineScope;
        this.b = mediaPlayer;
        this.c = c2799u9;
        this.d = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.e = new java.util.ArrayList();
        android.content.Context context = mediaPlayerLayout.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        com.inmobi.media.C2555l5 c2555l5 = new com.inmobi.media.C2555l5(context);
        this.f = new com.inmobi.media.C2328ce(c2555l5, mediaPlayerLayout, mediaPlayer, c2799u9);
        this.i = new com.inmobi.media.C2627nn(coroutineScope, c2555l5, config.e);
        this.j = new com.inmobi.media.Fn(this);
    }

    public final void a() {
        if (this.g != null && this.d.get()) {
            com.inmobi.media.Fg fg = (com.inmobi.media.Fg) this.i.d.getValue();
            fg.f.set(false);
            fg.a();
        } else {
            com.inmobi.media.Fg fg2 = (com.inmobi.media.Fg) this.i.d.getValue();
            fg2.b.setValue(com.inmobi.media.EnumC2391eo.f5188a);
            fg2.f.set(true);
            com.inmobi.media.L6.a(fg2.e);
            fg2.e = null;
        }
    }

    public final void b() {
        com.inmobi.media.T4.a(this.e);
        com.inmobi.media.C2328ce c2328ce = this.f;
        c2328ce.e = null;
        c2328ce.f5140a.setSurfaceTextureListener(null);
        c2328ce.c.setOnVideoSizeChangedListener(null);
        com.inmobi.media.Fg fg = (com.inmobi.media.Fg) this.i.d.getValue();
        fg.f.set(true);
        com.inmobi.media.L6.a(fg.e);
        fg.e = null;
        android.view.Surface surface = this.g;
        if (surface != null) {
            surface.release();
        }
        this.g = null;
        this.h = null;
    }
}
