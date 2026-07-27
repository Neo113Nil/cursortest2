package com.inmobi.media;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* renamed from: com.inmobi.media.bf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3597bf {

    /* renamed from: a, reason: collision with root package name */
    public final RelativeLayout f7028a;
    public final CoroutineScope b;
    public final MediaPlayer c;
    public final C3692ep d;
    public final MutableSharedFlow e;
    public final C3809j2 f;
    public final RelativeLayout g;
    public final float h;
    public boolean i;
    public final K5 j;
    public final K5 k;
    public final C4004pp l;

    public C3597bf(RelativeLayout parentView, CoroutineScope coroutineScope, MediaPlayer mediaPlayer, C3692ep config, MutableSharedFlow mediaPlayerFlow) {
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(mediaPlayer, "mediaPlayer");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(mediaPlayerFlow, "mediaPlayerFlow");
        this.f7028a = parentView;
        this.b = coroutineScope;
        this.c = mediaPlayer;
        this.d = config;
        this.e = mediaPlayerFlow;
        Context context = parentView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        C3809j2 c3809j2 = new C3809j2(context);
        this.f = c3809j2;
        RelativeLayout relativeLayout = new RelativeLayout(parentView.getContext());
        this.g = relativeLayout;
        this.h = AbstractC3841k6.b();
        this.l = new C4004pp(coroutineScope, relativeLayout, config.c, mediaPlayerFlow);
        We listener = new We(this);
        Intrinsics.checkNotNullParameter(listener, "listener");
        c3809j2.c = new WeakReference(listener);
        Context context2 = relativeLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.j = new K5(context2, (byte) 9, null);
        Context context3 = relativeLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.k = new K5(context3, (byte) 10, null);
        b();
        relativeLayout.setWillNotDraw(true);
        relativeLayout.setBackgroundColor(0);
        AbstractC3720fp.a(mediaPlayer, c3809j2);
    }

    public static final void a(C3597bf c3597bf, View view) {
        AbstractC4012q5.a(c3597bf.b, new C3569af(c3597bf, null));
    }

    public final void b() {
        this.j.setOnClickListener(new View.OnClickListener() { // from class: com.inmobi.media.bf$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3597bf.a(C3597bf.this, view);
            }
        });
        this.k.setOnClickListener(new View.OnClickListener() { // from class: com.inmobi.media.bf$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3597bf.b(C3597bf.this, view);
            }
        });
    }

    public final void a() {
        MediaPlayer mediaPlayer = this.c;
        Intrinsics.checkNotNullParameter(mediaPlayer, "<this>");
        try {
            mediaPlayer.setVolume(0.0f, 0.0f);
        } catch (IllegalStateException unused) {
        }
        a(this.j, this.k);
        AbstractC4012q5.a(this.e, this.b, new C3866l2(0.0f, true));
        this.i = true;
    }

    public static final void b(C3597bf c3597bf, View view) {
        c3597bf.a();
        c3597bf.f.a();
    }

    public final void a(K5 k5, K5 k52) {
        if (Intrinsics.areEqual(k5.getParent(), this.g)) {
            return;
        }
        this.g.removeView(k52);
        C3753h2 audioConfig = this.d.d;
        float f = this.h;
        Intrinsics.checkNotNullParameter(k5, "<this>");
        Intrinsics.checkNotNullParameter(audioConfig, "audioConfig");
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (audioConfig.b * f), (int) (audioConfig.c * f));
        int i = audioConfig.e;
        if (i == 0) {
            layoutParams.addRule(9, -1);
            layoutParams.addRule(10, -1);
        } else if (i == 1) {
            layoutParams.addRule(11, -1);
            layoutParams.addRule(10, -1);
        } else if (i == 2) {
            layoutParams.addRule(9, -1);
            layoutParams.addRule(12, -1);
        } else if (i == 3) {
            layoutParams.addRule(11, -1);
            layoutParams.addRule(12, -1);
        }
        Yc yc = audioConfig.d;
        layoutParams.leftMargin = (int) (yc.f6971a * f);
        layoutParams.topMargin = (int) (yc.b * f);
        layoutParams.rightMargin = (int) (yc.c * f);
        layoutParams.bottomMargin = (int) (yc.d * f);
        k5.setLayoutParams(layoutParams);
        this.g.addView(k5);
    }
}
