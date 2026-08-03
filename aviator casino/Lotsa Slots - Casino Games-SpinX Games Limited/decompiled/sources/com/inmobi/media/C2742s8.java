package com.inmobi.media;

/* renamed from: com.inmobi.media.s8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2742s8 {

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.CoroutineScope f5443a;
    public final androidx.media3.exoplayer.ExoPlayer b;
    public final java.util.ArrayList c;
    public final com.inmobi.media.T7 d;
    public android.view.Surface e;
    public com.inmobi.media.Zj f;
    public boolean g;
    public final com.inmobi.media.C2716r8 h;

    public C2742s8(kotlinx.coroutines.CoroutineScope coroutineScope, androidx.media3.exoplayer.ExoPlayer mediaPlayer, com.inmobi.media.G1 mediaPlayerLayout, com.inmobi.media.InterfaceC2772t9 interfaceC2772t9) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaPlayer, "mediaPlayer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaPlayerLayout, "mediaPlayerLayout");
        this.f5443a = coroutineScope;
        this.b = mediaPlayer;
        this.c = new java.util.ArrayList();
        android.content.Context context = mediaPlayerLayout.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.d = new com.inmobi.media.T7(new com.inmobi.media.C2555l5(context), mediaPlayerLayout, mediaPlayer, interfaceC2772t9);
        this.h = new com.inmobi.media.C2716r8(this);
    }

    public final void a() {
        com.inmobi.media.T4.a(this.c);
        com.inmobi.media.T7 t7 = this.d;
        t7.e = null;
        t7.f4971a.setSurfaceTextureListener(null);
        android.view.Surface surface = this.e;
        if (surface != null) {
            surface.release();
        }
        this.e = null;
        this.f = null;
    }
}
