package com.inmobi.media;

/* renamed from: com.inmobi.media.ce, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2328ce {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.C2555l5 f5140a;
    public final android.widget.RelativeLayout b;
    public final android.media.MediaPlayer c;
    public final com.inmobi.media.C2799u9 d;
    public com.inmobi.media.Yj e;

    public C2328ce(com.inmobi.media.C2555l5 textureView, android.widget.RelativeLayout parentView, android.media.MediaPlayer mediaPlayer, com.inmobi.media.C2799u9 c2799u9) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textureView, "textureView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parentView, "parentView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaPlayer, "mediaPlayer");
        this.f5140a = textureView;
        this.b = parentView;
        this.c = mediaPlayer;
        this.d = c2799u9;
    }

    public final void a(com.inmobi.media.Yj surfaceTextureListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surfaceTextureListener, "surfaceTextureListener");
        this.e = surfaceTextureListener;
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13, -1);
        this.b.addView(this.f5140a, layoutParams);
        a();
        int videoWidth = this.c.getVideoWidth();
        int videoHeight = this.c.getVideoHeight();
        if (videoHeight == 0) {
            this.f5140a.setAspectRatio(1.0f);
        } else {
            this.f5140a.setAspectRatio(videoWidth / videoHeight);
        }
        this.f5140a.setSurfaceTextureListener(new com.inmobi.media.TextureViewSurfaceTextureListenerC2301be(this));
    }

    public final void a() {
        this.c.setOnVideoSizeChangedListener(new android.media.MediaPlayer.OnVideoSizeChangedListener() { // from class: com.inmobi.media.ce$$ExternalSyntheticLambda0
            @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
            public final void onVideoSizeChanged(android.media.MediaPlayer mediaPlayer, int i, int i2) {
                com.inmobi.media.C2328ce.a(com.inmobi.media.C2328ce.this, mediaPlayer, i, i2);
            }
        });
    }

    public static final void a(com.inmobi.media.C2328ce c2328ce, android.media.MediaPlayer mediaPlayer, int i, int i2) {
        com.inmobi.media.C2799u9 c2799u9 = c2328ce.d;
        if (c2799u9 != null) {
            c2799u9.a("NativePlayerTextureManager", "Video Size Changed: " + i + " x " + i2);
        }
        int videoWidth = c2328ce.c.getVideoWidth();
        int videoHeight = c2328ce.c.getVideoHeight();
        if (videoHeight == 0) {
            c2328ce.f5140a.setAspectRatio(1.0f);
        } else {
            c2328ce.f5140a.setAspectRatio(videoWidth / videoHeight);
        }
    }
}
