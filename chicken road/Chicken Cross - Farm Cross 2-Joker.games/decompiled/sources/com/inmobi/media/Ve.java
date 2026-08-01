package com.inmobi.media;

import android.media.MediaPlayer;
import android.widget.RelativeLayout;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Ve {

    /* renamed from: a, reason: collision with root package name */
    public final I5 f6912a;
    public final RelativeLayout b;
    public final MediaPlayer c;
    public final Z9 d;
    public InterfaceC4112tl e;

    public Ve(I5 textureView, RelativeLayout parentView, MediaPlayer mediaPlayer, Z9 z9) {
        Intrinsics.checkNotNullParameter(textureView, "textureView");
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        Intrinsics.checkNotNullParameter(mediaPlayer, "mediaPlayer");
        this.f6912a = textureView;
        this.b = parentView;
        this.c = mediaPlayer;
        this.d = z9;
    }

    public final void a(InterfaceC4112tl surfaceTextureListener) {
        Intrinsics.checkNotNullParameter(surfaceTextureListener, "surfaceTextureListener");
        this.e = surfaceTextureListener;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13, -1);
        this.b.addView(this.f6912a, layoutParams);
        a();
        int videoWidth = this.c.getVideoWidth();
        int videoHeight = this.c.getVideoHeight();
        if (videoHeight == 0) {
            this.f6912a.setAspectRatio(1.0f);
        } else {
            this.f6912a.setAspectRatio(videoWidth / videoHeight);
        }
        this.f6912a.setSurfaceTextureListener(new Ue(this));
    }

    public final void a() {
        this.c.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() { // from class: com.inmobi.media.Ve$$ExternalSyntheticLambda0
            @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
            public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
                Ve.a(Ve.this, mediaPlayer, i, i2);
            }
        });
    }

    public static final void a(Ve ve, MediaPlayer mediaPlayer, int i, int i2) {
        Z9 z9 = ve.d;
        if (z9 != null) {
            z9.a("NativePlayerTextureManager", "Video Size Changed: " + i + " x " + i2);
        }
        int videoWidth = ve.c.getVideoWidth();
        int videoHeight = ve.c.getVideoHeight();
        if (videoHeight == 0) {
            ve.f6912a.setAspectRatio(1.0f);
        } else {
            ve.f6912a.setAspectRatio(videoWidth / videoHeight);
        }
    }
}
