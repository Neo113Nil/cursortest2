package com.inmobi.media;

/* renamed from: com.inmobi.media.v7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2823v7 {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.RelativeLayout f5504a;
    public com.inmobi.media.Lf b;
    public float c;
    public boolean d;
    public final java.lang.ref.WeakReference e;
    public final com.inmobi.media.GestureDetectorOnGestureListenerC2675pi f;
    public final android.widget.RelativeLayout g;
    public boolean h;

    public C2823v7(java.lang.ref.WeakReference activityRef, com.inmobi.media.GestureDetectorOnGestureListenerC2675pi adContainer, android.widget.RelativeLayout adBackgroundView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityRef, "activityRef");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adContainer, "adContainer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adBackgroundView, "adBackgroundView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adBackgroundView, "adBackgroundView");
        this.f5504a = adBackgroundView;
        this.b = com.inmobi.media.Mf.a(com.inmobi.media.N5.g());
        this.c = 1.0f;
        this.e = activityRef;
        this.f = adContainer;
        this.g = adBackgroundView;
    }

    public final void a(final com.inmobi.media.Lf orientation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(orientation, "orientation");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(orientation, "orientation");
        this.b = orientation;
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = this.f;
        kotlin.jvm.internal.Intrinsics.checkNotNull(gestureDetectorOnGestureListenerC2675pi, "null cannot be cast to non-null type com.inmobi.ads.containers.RenderView");
        gestureDetectorOnGestureListenerC2675pi.getWebViewFactory().a(new kotlin.jvm.functions.Function1() { // from class: com.inmobi.media.v7$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.inmobi.media.C2823v7.a(com.inmobi.media.Lf.this, (com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) obj);
            }
        });
    }

    public final void b() {
        android.app.Activity activity = (android.app.Activity) this.e.get();
        if ((activity instanceof com.inmobi.ads.rendering.InMobiAdActivity) && ((com.inmobi.ads.rendering.InMobiAdActivity) activity).e) {
            try {
                com.inmobi.media.B fullScreenEventsListener = this.f.getFullScreenEventsListener();
                if (fullScreenEventsListener != null) {
                    com.inmobi.media.C2489ii c2489ii = (com.inmobi.media.C2489ii) fullScreenEventsListener;
                    com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = c2489ii.f5262a.i;
                    if (interfaceC2772t9 != null) {
                        java.lang.String str = com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.i1;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
                        ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str, com.ironsource.Vf.m);
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.webkit.Profile.DEFAULT_PROFILE_NAME, c2489ii.f5262a.getViewState())) {
                        c2489ii.f5262a.setAndUpdateViewState("Hidden");
                    }
                    c2489ii.f5262a.W();
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
            } catch (java.lang.Exception e) {
                e.getMessage();
                com.inmobi.media.Sb.a((byte) 2, "InMobi", "SDK encountered unexpected error while finishing fullscreen view");
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            }
        } else {
            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = this.f;
            kotlin.jvm.internal.Intrinsics.checkNotNull(gestureDetectorOnGestureListenerC2675pi, "null cannot be cast to non-null type com.inmobi.ads.containers.RenderView");
            gestureDetectorOnGestureListenerC2675pi.setFullScreenActivityContext(null);
            try {
                gestureDetectorOnGestureListenerC2675pi.n();
            } catch (java.lang.Exception e2) {
                e2.getMessage();
                com.inmobi.media.Sb.a((byte) 2, "InMobi", "SDK encountered unexpected error in processing close request");
            }
            android.util.SparseArray sparseArray = com.inmobi.ads.rendering.InMobiAdActivity.t;
            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi container = this.f;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(container, "container");
            com.inmobi.ads.rendering.InMobiAdActivity.t.remove(container.hashCode());
        }
        this.f.b();
    }

    public final void c() {
        com.inmobi.media.M5 m5;
        android.widget.RelativeLayout.LayoutParams layoutParams;
        if (this.c == 1.0f) {
            android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -1);
            layoutParams2.addRule(10);
            this.f5504a.setLayoutParams(layoutParams2);
            return;
        }
        if (this.d) {
            com.inmobi.media.P5 p5 = com.inmobi.media.N5.f4847a;
            android.content.Context context = this.f5504a.getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            m5 = com.inmobi.media.N5.b(context);
        } else {
            com.inmobi.media.P5 p52 = com.inmobi.media.N5.f4847a;
            android.content.Context context2 = this.f5504a.getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context2, "context");
            android.view.Display a2 = com.inmobi.media.N5.a(context2);
            if (a2 == null) {
                m5 = com.inmobi.media.N5.b;
            } else {
                android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
                a2.getMetrics(displayMetrics);
                m5 = new com.inmobi.media.M5(displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
        }
        int i = m5.f4829a;
        int i2 = m5.b;
        java.util.Objects.toString(this.b);
        if (com.inmobi.media.Mf.b(this.b)) {
            layoutParams = new android.widget.RelativeLayout.LayoutParams(kotlin.math.MathKt.roundToInt(m5.f4829a * this.c), -1);
            layoutParams.addRule(9);
        } else {
            layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, kotlin.math.MathKt.roundToInt(m5.b * this.c));
            layoutParams.addRule(10);
        }
        this.f5504a.setLayoutParams(layoutParams);
    }

    public final void d() {
        this.g.setBackgroundColor(0);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(10);
        com.inmobi.media.Wn viewableAd = this.f.getViewableAd();
        android.view.View c = viewableAd != null ? viewableAd.c() : null;
        if (c != null) {
            android.view.ViewParent parent = c.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(c);
            }
            android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(this.g.getContext());
            relativeLayout.addView(c, new android.widget.RelativeLayout.LayoutParams(-1, -1));
            this.g.addView(relativeLayout, layoutParams);
            this.f.a(relativeLayout);
        }
    }

    public final void e() {
        if (1 == this.f.getPlacementType()) {
            try {
                java.util.HashMap hashMap = new java.util.HashMap();
                com.inmobi.media.Wn viewableAd = this.f.getViewableAd();
                if (viewableAd != null) {
                    viewableAd.a(hashMap);
                }
            } catch (java.lang.Exception e) {
                e.getMessage();
                com.inmobi.media.B fullScreenEventsListener = this.f.getFullScreenEventsListener();
                if (fullScreenEventsListener != null) {
                    ((com.inmobi.media.C2489ii) fullScreenEventsListener).a();
                }
            }
        }
    }

    public final void a() {
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = this.f;
        if (!(gestureDetectorOnGestureListenerC2675pi instanceof com.inmobi.media.GestureDetectorOnGestureListenerC2675pi)) {
            gestureDetectorOnGestureListenerC2675pi = null;
        }
        if (gestureDetectorOnGestureListenerC2675pi == null) {
            return;
        }
        gestureDetectorOnGestureListenerC2675pi.getWebViewFactory().a(new kotlin.jvm.functions.Function1() { // from class: com.inmobi.media.v7$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.inmobi.media.C2823v7.a((com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) obj);
            }
        });
        if (gestureDetectorOnGestureListenerC2675pi.L) {
            return;
        }
        try {
            gestureDetectorOnGestureListenerC2675pi.n();
        } catch (java.lang.Exception e) {
            e.getMessage();
            com.inmobi.media.Sb.a((byte) 2, "InMobi", "SDK encountered unexpected error in processing close request");
        }
    }

    public static final kotlin.Unit a(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        it.r();
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlin.Unit a(com.inmobi.media.Lf lf, com.inmobi.media.GestureDetectorOnGestureListenerC2675pi it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        it.b(lf);
        return kotlin.Unit.INSTANCE;
    }
}
