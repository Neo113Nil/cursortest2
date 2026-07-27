package com.inmobi.media;

import android.content.Context;
import android.view.Surface;
import androidx.media3.exoplayer.ExoPlayer;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
public final class U8 {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineScope f6886a;
    public final ExoPlayer b;
    public final ArrayList c;
    public final C4099t8 d;
    public Surface e;
    public InterfaceC4141ul f;
    public boolean g;
    public final T8 h;

    public U8(CoroutineScope coroutineScope, ExoPlayer mediaPlayer, C8 mediaPlayerLayout, Y9 y9) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(mediaPlayer, "mediaPlayer");
        Intrinsics.checkNotNullParameter(mediaPlayerLayout, "mediaPlayerLayout");
        this.f6886a = coroutineScope;
        this.b = mediaPlayer;
        this.c = new ArrayList();
        Context context = mediaPlayerLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.d = new C4099t8(new I5(context), mediaPlayerLayout, mediaPlayer, y9);
        this.h = new T8(this);
    }

    public final void a() {
        AbstractC4012q5.a(this.c);
        C4099t8 c4099t8 = this.d;
        c4099t8.e = null;
        c4099t8.f = null;
        c4099t8.f7388a.setSurfaceTextureListener(null);
        c4099t8.f7388a.setOnPositionChangeListener(null);
        Surface surface = this.e;
        if (surface != null) {
            surface.release();
        }
        this.e = null;
        this.f = null;
    }
}
