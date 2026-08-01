package com.inmobi.media;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.Surface;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
public final class Dp {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineScope f6520a;
    public final MediaPlayer b;
    public final Z9 c;
    public final AtomicBoolean d;
    public final ArrayList e;
    public final Ve f;
    public Surface g;
    public InterfaceC4141ul h;
    public final C3861kp i;
    public final Cp j;

    public Dp(CoroutineScope coroutineScope, MediaPlayer mediaPlayer, RelativeLayout mediaPlayerLayout, C3692ep config, Z9 z9) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(mediaPlayer, "mediaPlayer");
        Intrinsics.checkNotNullParameter(mediaPlayerLayout, "mediaPlayerLayout");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f6520a = coroutineScope;
        this.b = mediaPlayer;
        this.c = z9;
        this.d = new AtomicBoolean(false);
        this.e = new ArrayList();
        Context context = mediaPlayerLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        I5 i5 = new I5(context);
        this.f = new Ve(i5, mediaPlayerLayout, mediaPlayer, z9);
        this.i = new C3861kp(coroutineScope, i5, config.e);
        this.j = new Cp(this);
    }

    public final void a() {
        if (this.g != null && this.d.get()) {
            Oh oh = (Oh) this.i.d.getValue();
            oh.f.set(false);
            oh.a();
        } else {
            Oh oh2 = (Oh) this.i.d.getValue();
            oh2.b.setValue(EnumC3580aq.f7019a);
            oh2.f.set(true);
            AbstractC3787i7.a(oh2.e);
            oh2.e = null;
        }
    }

    public final void b() {
        AbstractC4012q5.a(this.e);
        Ve ve = this.f;
        ve.e = null;
        ve.f6912a.setSurfaceTextureListener(null);
        ve.c.setOnVideoSizeChangedListener(null);
        Oh oh = (Oh) this.i.d.getValue();
        oh.f.set(true);
        AbstractC3787i7.a(oh.e);
        oh.e = null;
        Surface surface = this.g;
        if (surface != null) {
            surface.release();
        }
        this.g = null;
        this.h = null;
    }
}
