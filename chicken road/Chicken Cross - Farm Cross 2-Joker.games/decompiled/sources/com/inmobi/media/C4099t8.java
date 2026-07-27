package com.inmobi.media;

import android.widget.FrameLayout;
import androidx.media3.exoplayer.ExoPlayer;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.t8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4099t8 {

    /* renamed from: a, reason: collision with root package name */
    public final I5 f7388a;
    public final C8 b;
    public final ExoPlayer c;
    public final Y9 d;
    public InterfaceC4112tl e;
    public C3647d8 f;

    public C4099t8(I5 textureView, C8 parentView, ExoPlayer mediaPlayer, Y9 y9) {
        Intrinsics.checkNotNullParameter(textureView, "textureView");
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        Intrinsics.checkNotNullParameter(mediaPlayer, "mediaPlayer");
        this.f7388a = textureView;
        this.b = parentView;
        this.c = mediaPlayer;
        this.d = y9;
    }

    public final void a(int i, int i2) {
        Y9 y9 = this.d;
        if (y9 != null) {
            ((Z9) y9).a("HtmlPlayerTextureManager", "Video Size Changed: " + i + " x " + i2);
        }
        int i3 = this.c.getVideoSize().width;
        int i4 = this.c.getVideoSize().height;
        if (i4 == 0) {
            this.f7388a.setAspectRatio(1.0f);
        } else {
            this.f7388a.setAspectRatio(i3 / i4);
        }
    }

    public final void a(InterfaceC4112tl surfaceTextureListener) {
        Intrinsics.checkNotNullParameter(surfaceTextureListener, "surfaceTextureListener");
        this.e = surfaceTextureListener;
        this.f7388a.setOnPositionChangeListener(this.f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        this.b.addView(this.f7388a, layoutParams);
        int i = this.c.getVideoSize().width;
        int i2 = this.c.getVideoSize().height;
        if (i2 == 0) {
            this.f7388a.setAspectRatio(1.0f);
        } else {
            this.f7388a.setAspectRatio(i / i2);
        }
        this.f7388a.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC4071s8(this));
    }
}
