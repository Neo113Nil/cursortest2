package com.inmobi.media;

/* renamed from: com.inmobi.media.ie, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2486ie {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.RelativeLayout f5259a;
    public final kotlinx.coroutines.CoroutineScope b;
    public final android.media.MediaPlayer c;
    public final com.inmobi.media.C2469hn d;
    public final kotlinx.coroutines.flow.MutableSharedFlow e;
    public final com.inmobi.media.Q1 f;
    public final android.widget.RelativeLayout g;
    public final float h;
    public boolean i;
    public final com.inmobi.media.C2607n5 j;
    public final com.inmobi.media.C2607n5 k;
    public final com.inmobi.media.C2760sn l;

    public C2486ie(android.widget.RelativeLayout parentView, kotlinx.coroutines.CoroutineScope coroutineScope, android.media.MediaPlayer mediaPlayer, com.inmobi.media.C2469hn config, kotlinx.coroutines.flow.MutableSharedFlow mediaPlayerFlow) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parentView, "parentView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaPlayer, "mediaPlayer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaPlayerFlow, "mediaPlayerFlow");
        this.f5259a = parentView;
        this.b = coroutineScope;
        this.c = mediaPlayer;
        this.d = config;
        this.e = mediaPlayerFlow;
        android.content.Context context = parentView.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        com.inmobi.media.Q1 q1 = new com.inmobi.media.Q1(context);
        this.f = q1;
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(parentView.getContext());
        this.g = relativeLayout;
        this.h = com.inmobi.media.N5.b();
        this.l = new com.inmobi.media.C2760sn(coroutineScope, relativeLayout, config.c, mediaPlayerFlow);
        com.inmobi.media.C2355de listener = new com.inmobi.media.C2355de(this);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        q1.c = new java.lang.ref.WeakReference(listener);
        android.content.Context context2 = relativeLayout.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.j = new com.inmobi.media.C2607n5(context2, (byte) 9, null);
        android.content.Context context3 = relativeLayout.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.k = new com.inmobi.media.C2607n5(context3, (byte) 10, null);
        b();
        relativeLayout.setWillNotDraw(true);
        relativeLayout.setBackgroundColor(0);
        com.inmobi.media.AbstractC2494in.a(mediaPlayer, q1);
    }

    public static final void a(com.inmobi.media.C2486ie c2486ie, android.view.View view) {
        com.inmobi.media.T4.a(c2486ie.b, new com.inmobi.media.C2460he(c2486ie, null));
    }

    public final void b() {
        this.j.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.inmobi.media.ie$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.inmobi.media.C2486ie.a(com.inmobi.media.C2486ie.this, view);
            }
        });
        this.k.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.inmobi.media.ie$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.inmobi.media.C2486ie.b(com.inmobi.media.C2486ie.this, view);
            }
        });
    }

    public final void a() {
        android.media.MediaPlayer mediaPlayer = this.c;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaPlayer, "<this>");
        try {
            mediaPlayer.setVolume(0.0f, 0.0f);
        } catch (java.lang.IllegalStateException unused) {
        }
        a(this.j, this.k);
        com.inmobi.media.T4.a(this.e, this.b, new com.inmobi.media.S1(0.0f, true));
        this.i = true;
    }

    public static final void b(com.inmobi.media.C2486ie c2486ie, android.view.View view) {
        c2486ie.a();
        c2486ie.f.a();
    }

    public final void a(com.inmobi.media.C2607n5 c2607n5, com.inmobi.media.C2607n5 c2607n52) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(c2607n5.getParent(), this.g)) {
            return;
        }
        this.g.removeView(c2607n52);
        com.inmobi.media.O1 audioConfig = this.d.d;
        float f = this.h;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c2607n5, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(audioConfig, "audioConfig");
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams((int) (audioConfig.b * f), (int) (audioConfig.c * f));
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
        com.inmobi.media.C2432gc c2432gc = audioConfig.d;
        layoutParams.leftMargin = (int) (c2432gc.f5217a * f);
        layoutParams.topMargin = (int) (c2432gc.b * f);
        layoutParams.rightMargin = (int) (c2432gc.c * f);
        layoutParams.bottomMargin = (int) (c2432gc.d * f);
        c2607n5.setLayoutParams(layoutParams);
        this.g.addView(c2607n5);
    }
}
