package com.inmobi.media;

/* loaded from: classes5.dex */
public final class T7 {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.C2555l5 f4971a;
    public final com.inmobi.media.G1 b;
    public final androidx.media3.exoplayer.ExoPlayer c;
    public final com.inmobi.media.InterfaceC2772t9 d;
    public com.inmobi.media.Yj e;

    public T7(com.inmobi.media.C2555l5 textureView, com.inmobi.media.G1 parentView, androidx.media3.exoplayer.ExoPlayer mediaPlayer, com.inmobi.media.InterfaceC2772t9 interfaceC2772t9) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textureView, "textureView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parentView, "parentView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaPlayer, "mediaPlayer");
        this.f4971a = textureView;
        this.b = parentView;
        this.c = mediaPlayer;
        this.d = interfaceC2772t9;
    }

    public final void a(int i, int i2) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.d;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("HtmlPlayerTextureManager", "Video Size Changed: " + i + " x " + i2);
        }
        int i3 = this.c.getVideoSize().width;
        int i4 = this.c.getVideoSize().height;
        if (i4 == 0) {
            this.f4971a.setAspectRatio(1.0f);
        } else {
            this.f4971a.setAspectRatio(i3 / i4);
        }
    }

    public final void a(com.inmobi.media.Yj surfaceTextureListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surfaceTextureListener, "surfaceTextureListener");
        this.e = surfaceTextureListener;
        this.b.addView(this.f4971a, new android.widget.FrameLayout.LayoutParams(-1, -1));
        int i = this.c.getVideoSize().width;
        int i2 = this.c.getVideoSize().height;
        if (i2 == 0) {
            this.f4971a.setAspectRatio(1.0f);
        } else {
            this.f4971a.setAspectRatio(i / i2);
        }
        this.f4971a.setSurfaceTextureListener(new com.inmobi.media.S7(this));
    }
}
