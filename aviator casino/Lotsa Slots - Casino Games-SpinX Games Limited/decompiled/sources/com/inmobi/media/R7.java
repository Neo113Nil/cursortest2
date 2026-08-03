package com.inmobi.media;

/* loaded from: classes5.dex */
public final class R7 {
    public final com.inmobi.media.P7 A;
    public final com.inmobi.media.J7 B;
    public final kotlinx.coroutines.flow.MutableSharedFlow C;

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.videoPlayer.model.HtmlVideoPlayerRequest f4933a;
    public final com.inmobi.media.InterfaceC2772t9 b;
    public final kotlinx.coroutines.CoroutineScope c;
    public final kotlinx.coroutines.CoroutineScope d;
    public final com.inmobi.media.videoPlayer.model.HtmlVideoPlayerConfig e;
    public final java.util.concurrent.atomic.AtomicBoolean f;
    public final java.util.concurrent.atomic.AtomicBoolean g;
    public final java.util.concurrent.atomic.AtomicBoolean h;
    public volatile int i;
    public volatile int j;
    public final java.util.List k;
    public final java.util.concurrent.atomic.AtomicReference l;
    public final kotlinx.coroutines.flow.MutableSharedFlow m;
    public final com.inmobi.media.G1 n;
    public final android.widget.ProgressBar o;
    public final androidx.media3.exoplayer.ExoPlayer p;
    public java.lang.String q;
    public java.lang.ref.WeakReference r;
    public final java.util.List s;
    public com.inmobi.media.Bg t;
    public long u;
    public kotlinx.coroutines.Job v;
    public final com.inmobi.media.L2 w;
    public final com.inmobi.media.C2899y6 x;
    public final com.inmobi.media.W7 y;
    public final com.inmobi.media.C2742s8 z;

    public R7(android.content.Context context, com.inmobi.media.core.config.models.AdConfig.HybridNativeConfig hybridNativeConfig, kotlinx.coroutines.CoroutineScope coroutineScope, com.inmobi.media.videoPlayer.model.HtmlVideoPlayerRequest htmlVideoPlayerRequest, com.inmobi.media.InterfaceC2772t9 interfaceC2772t9) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hybridNativeConfig, "hybridNativeConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(htmlVideoPlayerRequest, "htmlVideoPlayerRequest");
        this.f4933a = htmlVideoPlayerRequest;
        this.b = interfaceC2772t9;
        this.c = com.inmobi.media.T4.a(coroutineScope, new com.inmobi.media.O7(kotlinx.coroutines.CoroutineExceptionHandler.INSTANCE, this));
        kotlinx.coroutines.CoroutineScope a2 = com.inmobi.media.T4.a(coroutineScope);
        this.d = a2;
        com.inmobi.media.videoPlayer.model.HtmlVideoPlayerConfig config = htmlVideoPlayerRequest.getConfig();
        this.e = config;
        this.f = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.g = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.h = new java.util.concurrent.atomic.AtomicBoolean(false);
        java.util.List synchronizedList = java.util.Collections.synchronizedList(new java.util.ArrayList());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(synchronizedList, "synchronizedList(...)");
        this.k = synchronizedList;
        com.inmobi.media.Bg bg = com.inmobi.media.Bg.f4624a;
        this.l = new java.util.concurrent.atomic.AtomicReference(bg);
        kotlinx.coroutines.flow.MutableSharedFlow MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.m = MutableSharedFlow$default;
        com.inmobi.media.G1 g1 = new com.inmobi.media.G1(context);
        this.n = g1;
        this.o = new android.widget.ProgressBar(context);
        androidx.media3.exoplayer.ExoPlayer build = new androidx.media3.exoplayer.ExoPlayer.Builder(context).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        this.p = build;
        java.util.List synchronizedList2 = java.util.Collections.synchronizedList(new java.util.ArrayList());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(synchronizedList2, "synchronizedList(...)");
        this.s = synchronizedList2;
        this.t = bg;
        com.inmobi.media.L2 l2 = (com.inmobi.media.L2) com.inmobi.media.L2.h.getValue();
        l2.f.incrementAndGet();
        this.w = l2;
        this.x = new com.inmobi.media.C2899y6(build, hybridNativeConfig, a2, config.getPlaybackUpdateInterval(), MutableSharedFlow$default, config.getTrackPercentages());
        android.content.Context context2 = g1.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.y = new com.inmobi.media.W7(context2, a2, build, config.getMuted(), MutableSharedFlow$default);
        this.z = new com.inmobi.media.C2742s8(a2, build, g1, interfaceC2772t9);
        this.A = new com.inmobi.media.P7(this);
        this.B = new com.inmobi.media.J7(this);
        this.C = MutableSharedFlow$default;
    }

    public final void a(com.inmobi.media.AbstractC2493im abstractC2493im) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new com.inmobi.media.K7(this, abstractC2493im, null), 3, null);
    }

    public final com.inmobi.media.Bg b() {
        java.lang.Object obj = this.l.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        return (com.inmobi.media.Bg) obj;
    }

    public final void c() {
        if (!this.h.get() && b() == com.inmobi.media.Bg.d) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new com.inmobi.media.H7(null, this), 3, null);
                return;
            }
            this.p.pause();
            this.x.a();
            com.inmobi.media.W7 w7 = this.y;
            w7.b.setVolume(0.0f);
            w7.d.a();
            this.l.set(com.inmobi.media.Bg.e);
            a(new com.inmobi.media.C2417fn(this.p.getCurrentPosition()));
        }
    }

    public final void d() {
        kotlinx.coroutines.Job launch$default;
        kotlinx.coroutines.Job launch$default2;
        if (this.h.get()) {
            return;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.b;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).b("HtmlMediaPlayer", "playVideo called");
        }
        if (b() != com.inmobi.media.Bg.e && b() != com.inmobi.media.Bg.c && b() != com.inmobi.media.Bg.f) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.b;
            if (interfaceC2772t92 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t92).b("HtmlMediaPlayer", "playVideo: Player not in playable state");
                return;
            }
            return;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new com.inmobi.media.I7(null, this), 3, null);
            return;
        }
        if (b() == com.inmobi.media.Bg.f) {
            this.p.seekTo(0L);
            this.l.set(com.inmobi.media.Bg.c);
        }
        com.inmobi.media.W7 w7 = this.y;
        if (w7.e) {
            w7.a();
            w7.d.a();
        } else {
            com.inmobi.media.T4.a(w7.f5025a, new com.inmobi.media.V7(w7, null));
        }
        com.inmobi.media.C2899y6 c2899y6 = this.x;
        if (!c2899y6.d.getAndSet(true)) {
            kotlinx.coroutines.CoroutineScope coroutineScope = c2899y6.b;
            long j = c2899y6.k;
            com.inmobi.media.C2848w6 action = new com.inmobi.media.C2848w6(c2899y6, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, kotlinx.coroutines.Dispatchers.getMain().getImmediate(), null, new com.inmobi.media.G3(j, null, action), 2, null);
            c2899y6.e = launch$default;
            kotlinx.coroutines.CoroutineScope coroutineScope2 = c2899y6.b;
            long j2 = c2899y6.l;
            com.inmobi.media.C2874x6 action2 = new com.inmobi.media.C2874x6(c2899y6, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope2, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action2, "action");
            launch$default2 = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope2, kotlinx.coroutines.Dispatchers.getMain().getImmediate(), null, new com.inmobi.media.G3(j2, null, action2), 2, null);
            c2899y6.f = launch$default2;
        }
        this.p.play();
        this.l.set(com.inmobi.media.Bg.d);
        a(new com.inmobi.media.C2916yn(this.p.getCurrentPosition()));
    }

    public final void e() {
        kotlinx.coroutines.Job launch$default;
        if (this.h.get()) {
            return;
        }
        java.lang.String str = this.q;
        if (str != null) {
            for (com.inmobi.media.videoPlayer.model.HtmlVideoFile htmlVideoFile : this.s) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(htmlVideoFile.getUrl(), str)) {
                    break;
                }
            }
        }
        htmlVideoFile = null;
        if (htmlVideoFile == null) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.b;
            if (interfaceC2772t9 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t9).b("HtmlMediaPlayer", "start() called before successful load – ignoring");
                return;
            }
            return;
        }
        if (!this.g.get()) {
            this.g.set(true);
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new com.inmobi.media.C2900y7(new com.inmobi.media.B7(this.C), null, this), 3, null);
            java.util.List activeJobs = this.k;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(launch$default, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activeJobs, "activeJobs");
            activeJobs.add(launch$default);
        }
        if (!this.f.get()) {
            this.f.set(true);
            if (kotlin.jvm.internal.Intrinsics.areEqual(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
                this.p.addListener(this.B);
            } else {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new com.inmobi.media.C2849w7(null, this), 3, null);
            }
        }
        if (this.e.getAutoplay()) {
            d();
        }
    }

    public final void f() {
        if (this.h.get()) {
            return;
        }
        if (b() == com.inmobi.media.Bg.d) {
            c();
        }
        if (this.f.get()) {
            this.f.set(false);
            if (kotlin.jvm.internal.Intrinsics.areEqual(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
                this.p.removeListener(this.B);
            } else {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new com.inmobi.media.M7(null, this), 3, null);
            }
        }
        this.x.a();
        this.g.set(false);
        com.inmobi.media.T4.a(this.k);
    }

    public final void a(android.widget.RelativeLayout parentView) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parentView, "parentView");
        if (this.h.get()) {
            return;
        }
        this.r = new java.lang.ref.WeakReference(parentView);
        com.inmobi.media.C2742s8 c2742s8 = this.z;
        com.inmobi.media.P7 surfaceViewabilityListener = this.A;
        c2742s8.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surfaceViewabilityListener, "surfaceViewabilityListener");
        com.inmobi.media.T4.a(c2742s8.f5443a, new com.inmobi.media.C2691q8(c2742s8, surfaceViewabilityListener, null));
        com.inmobi.media.G1 g1 = this.n;
        com.inmobi.media.videoPlayer.model.VideoViewPosition videoViewPosition = new com.inmobi.media.videoPlayer.model.VideoViewPosition();
        com.inmobi.media.videoPlayer.model.VideoViewPosition videoViewPosition2 = this.e.getVideoViewPosition();
        if (this.e.getFullscreenEnabled()) {
            videoViewPosition.setX(0);
            videoViewPosition.setY(0);
            videoViewPosition.setWidth(-1);
            videoViewPosition.setHeight(-1);
        } else {
            videoViewPosition.setX(videoViewPosition2 != null ? (int) (com.inmobi.media.N5.b() * videoViewPosition2.getX()) : 0);
            videoViewPosition.setY(videoViewPosition2 != null ? (int) (com.inmobi.media.N5.b() * videoViewPosition2.getY()) : 0);
            videoViewPosition.setWidth(videoViewPosition2 != null ? (int) (com.inmobi.media.N5.b() * videoViewPosition2.getWidth()) : -2);
            videoViewPosition.setHeight(videoViewPosition2 != null ? (int) (com.inmobi.media.N5.b() * videoViewPosition2.getHeight()) : -2);
        }
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(videoViewPosition.getWidth(), videoViewPosition.getHeight());
        if (this.e.getFullscreenEnabled()) {
            layoutParams.addRule(13, -1);
        } else {
            layoutParams.setMargins(videoViewPosition.getX(), videoViewPosition.getY(), 0, 0);
        }
        g1.setLayoutParams(layoutParams);
        this.n.setOnPositionChangeListener(new com.inmobi.media.F7(this));
        android.view.ViewParent parent = this.o.getParent();
        if (parent != null) {
            ((android.view.ViewGroup) parent).removeView(this.o);
        }
        android.widget.ProgressBar progressBar = this.o;
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(100, 100);
        layoutParams2.gravity = 17;
        progressBar.setLayoutParams(layoutParams2);
        progressBar.setVisibility(0);
        if (kotlin.jvm.internal.Intrinsics.areEqual(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            this.n.addView(this.o, 0);
        } else {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new com.inmobi.media.N7(null, this), 3, null);
        }
        com.inmobi.media.G1 g12 = this.n;
        if (androidx.core.view.ViewCompat.isAttachedToWindow(g12)) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.b;
            if (interfaceC2772t92 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t92).a("HtmlMediaPlayer", "inflate: MediaPlayerLayout is attached to window");
            }
            a(com.inmobi.media.C2798u8.f5483a);
        } else {
            g12.addOnAttachStateChangeListener(new com.inmobi.media.E7(g12, this));
        }
        parentView.addView(this.n, 0);
        if (b() == com.inmobi.media.Bg.c || (interfaceC2772t9 = this.b) == null) {
            return;
        }
        ((com.inmobi.media.C2799u9) interfaceC2772t9).b("HtmlMediaPlayer", "inflate() called before successful load – waiting for load to complete");
    }

    public final com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState a() {
        java.lang.String str;
        com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState htmlVideoPlaybackState = new com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState();
        int ordinal = b().ordinal();
        if (ordinal == 2) {
            com.inmobi.media.EnumC2612n8[] enumC2612n8Arr = com.inmobi.media.EnumC2612n8.f5353a;
            str = com.ironsource.X3.i.s;
        } else if (ordinal == 3) {
            com.inmobi.media.EnumC2612n8[] enumC2612n8Arr2 = com.inmobi.media.EnumC2612n8.f5353a;
            str = com.ironsource.X3.i.f0;
        } else if (ordinal == 4) {
            com.inmobi.media.EnumC2612n8[] enumC2612n8Arr3 = com.inmobi.media.EnumC2612n8.f5353a;
            str = com.ironsource.X3.i.e0;
        } else if (ordinal == 5) {
            com.inmobi.media.EnumC2612n8[] enumC2612n8Arr4 = com.inmobi.media.EnumC2612n8.f5353a;
            str = com.ironsource.X3.i.h0;
        } else if (ordinal != 6) {
            com.inmobi.media.EnumC2612n8[] enumC2612n8Arr5 = com.inmobi.media.EnumC2612n8.f5353a;
            str = "loading";
        } else {
            com.inmobi.media.EnumC2612n8[] enumC2612n8Arr6 = com.inmobi.media.EnumC2612n8.f5353a;
            str = com.ironsource.X3.i.t;
        }
        htmlVideoPlaybackState.setState(str);
        htmlVideoPlaybackState.setDuration(this.p.getDuration() / 1000.0f);
        htmlVideoPlaybackState.setTime(this.p.getCurrentPosition() / 1000.0f);
        htmlVideoPlaybackState.setMuted(this.y.e);
        return htmlVideoPlaybackState;
    }

    public final void a(com.inmobi.media.videoPlayer.model.VideoViewPosition newVideoViewPosition) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newVideoViewPosition, "newVideoViewPosition");
        if (this.h.get()) {
            return;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new com.inmobi.media.Q7(null, this, newVideoViewPosition), 3, null);
            return;
        }
        android.transition.TransitionManager.beginDelayedTransition(this.n);
        this.e.setVideoViewPosition(newVideoViewPosition);
        int b = (int) (com.inmobi.media.N5.b() * newVideoViewPosition.getWidth());
        int b2 = (int) (com.inmobi.media.N5.b() * newVideoViewPosition.getHeight());
        com.inmobi.media.G1 g1 = this.n;
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(b, b2);
        if (this.e.getVideoViewPosition() != null) {
            layoutParams.setMargins((int) (com.inmobi.media.N5.b() * newVideoViewPosition.getX()), (int) (com.inmobi.media.N5.b() * newVideoViewPosition.getY()), 0, 0);
        }
        g1.setLayoutParams(layoutParams);
        if (this.i > 0 && this.j > 0) {
            com.inmobi.media.G1 g12 = this.n;
            int i = this.i;
            int i2 = this.j;
            g12.getClass();
            if (i > 0 && i2 > 0) {
                g12.f4716a = i / i2;
                g12.requestLayout();
            }
        }
        this.n.requestLayout();
    }

    public final void a(com.inmobi.media.AbstractC2480i8 abstractC2480i8) {
        android.view.Surface surface;
        if (abstractC2480i8 instanceof com.inmobi.media.C2505j8) {
            com.inmobi.media.C2505j8 c2505j8 = (com.inmobi.media.C2505j8) abstractC2480i8;
            this.q = c2505j8.f5274a;
            this.v = null;
            if (!kotlin.jvm.internal.Intrinsics.areEqual(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new com.inmobi.media.D7(null, this, c2505j8), 3, null);
                return;
            }
            this.l.set(com.inmobi.media.Bg.c);
            this.p.seekTo(0L);
            com.inmobi.media.C2742s8 c2742s8 = this.z;
            if (!c2742s8.g && (surface = c2742s8.e) != null) {
                c2742s8.g = true;
                c2742s8.b.setVideoSurface(surface);
            }
            com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState htmlVideoPlaybackState = new com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState();
            htmlVideoPlaybackState.setDuration(c2505j8.b / 1000.0f);
            htmlVideoPlaybackState.setVideoUrl(c2505j8.f5274a);
            htmlVideoPlaybackState.setLatency(java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.u));
            htmlVideoPlaybackState.setMuted(this.y.e);
            com.inmobi.media.EnumC2612n8[] enumC2612n8Arr = com.inmobi.media.EnumC2612n8.f5353a;
            htmlVideoPlaybackState.setState(com.ironsource.X3.i.s);
            htmlVideoPlaybackState.setTime(this.p.getCurrentPosition() / 1000.0f);
            a(new com.inmobi.media.C2531k8(htmlVideoPlaybackState, c2505j8.c));
            return;
        }
        if (abstractC2480i8 instanceof com.inmobi.media.C2428g8) {
            this.l.set(com.inmobi.media.Bg.g);
            this.v = null;
            a(new com.inmobi.media.C2401f8(this.f4933a, ((com.inmobi.media.C2428g8) abstractC2480i8).f5214a.f4943a.f5136a));
            return;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
