package com.ironsource;

/* loaded from: classes5.dex */
public final class P2 implements com.ironsource.G2 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.J9 f5889a;
    private final com.ironsource.C3041f8 b;
    private final com.ironsource.Y1 c;
    private final com.ironsource.InterfaceC3266s1 d;
    private final com.ironsource.InterfaceC3134kc e;
    private final com.ironsource.InterfaceC2995cg f;
    private final com.ironsource.L8 g;
    private final com.ironsource.L8.a h;
    private final boolean i;
    private com.unity3d.ironsourceads.banner.BannerAdInfo j;
    private java.lang.ref.WeakReference<com.ironsource.Q2> k;
    private android.view.View.OnAttachStateChangeListener l;
    private java.lang.ref.WeakReference<android.widget.FrameLayout> m;

    public static final class a implements android.view.View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(android.view.View v) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(v, "v");
            com.ironsource.C3005d8 size = com.ironsource.P2.this.d().getSize();
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(size.c(), size.a(), 17);
            if (com.ironsource.P2.this.i) {
                android.view.ViewParent parent = com.ironsource.P2.this.d().getParent();
                android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(com.ironsource.P2.this.d());
                }
            }
            ((android.widget.FrameLayout) v).addView(com.ironsource.P2.this.d(), 0, layoutParams);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(android.view.View v) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(v, "v");
            ((android.widget.FrameLayout) v).removeAllViews();
        }
    }

    public P2(com.ironsource.J9 adInstance, com.ironsource.C3041f8 container, com.ironsource.Y1 auctionDataReporter, com.ironsource.InterfaceC3266s1 analytics, com.ironsource.InterfaceC3134kc networkDestroyAPI, com.ironsource.InterfaceC2995cg threadManager, com.ironsource.L8 sessionDepthService, com.ironsource.L8.a sessionDepthServiceEditor, com.ironsource.InterfaceC3398z7 epService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(container, "container");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionDataReporter, "auctionDataReporter");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analytics, "analytics");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkDestroyAPI, "networkDestroyAPI");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threadManager, "threadManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionDepthService, "sessionDepthService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionDepthServiceEditor, "sessionDepthServiceEditor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(epService, "epService");
        this.f5889a = adInstance;
        this.b = container;
        this.c = auctionDataReporter;
        this.d = analytics;
        this.e = networkDestroyAPI;
        this.f = threadManager;
        this.g = sessionDepthService;
        this.h = sessionDepthServiceEditor;
        this.i = epService.m();
        java.lang.String f = adInstance.f();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(f, "adInstance.instanceId");
        java.lang.String e = adInstance.e();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(e, "adInstance.id");
        this.j = new com.unity3d.ironsourceads.banner.BannerAdInfo(f, e);
        this.k = new java.lang.ref.WeakReference<>(null);
        this.m = new java.lang.ref.WeakReference<>(null);
        com.ironsource.Ic ic = new com.ironsource.Ic();
        adInstance.a(ic);
        ic.a(this);
    }

    public final void b(java.lang.ref.WeakReference<android.widget.FrameLayout> value) {
        android.widget.FrameLayout frameLayout;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        android.view.View.OnAttachStateChangeListener onAttachStateChangeListener = this.l;
        if (onAttachStateChangeListener != null && (frameLayout = this.m.get()) != null) {
            frameLayout.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
        this.m = value;
        com.ironsource.P2.a a2 = a();
        this.l = a2;
        android.widget.FrameLayout frameLayout2 = value.get();
        if (frameLayout2 != null) {
            frameLayout2.addOnAttachStateChangeListener(a2);
        }
    }

    public final com.unity3d.ironsourceads.banner.BannerAdInfo c() {
        return this.j;
    }

    public final com.ironsource.C3041f8 d() {
        return this.b;
    }

    public final java.lang.ref.WeakReference<com.ironsource.Q2> e() {
        return this.k;
    }

    public final java.lang.ref.WeakReference<android.widget.FrameLayout> f() {
        return this.m;
    }

    protected final void finalize() {
        b();
    }

    @Override // com.ironsource.G2
    public void onBannerClick() {
        com.ironsource.InterfaceC3141l1.a.f6353a.a().a(this.d);
        this.f.a(new java.lang.Runnable() { // from class: com.ironsource.P2$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.P2.c(com.ironsource.P2.this);
            }
        });
    }

    @Override // com.ironsource.G2
    public void onBannerShowSuccess() {
        com.ironsource.L8 l8 = this.g;
        com.ironsource.mediationsdk.IronSource.a aVar = com.ironsource.mediationsdk.IronSource.a.BANNER;
        com.ironsource.InterfaceC3141l1.a.f6353a.f(new com.ironsource.C3195o1.w(l8.a(aVar))).a(this.d);
        this.h.b(aVar);
        this.c.b("onBannerShowSuccess");
        this.f.a(new java.lang.Runnable() { // from class: com.ironsource.P2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.P2.d(com.ironsource.P2.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(com.ironsource.P2 this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.ironsource.Q2 q2 = this$0.k.get();
        if (q2 != null) {
            q2.onBannerAdClicked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(com.ironsource.P2 this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.ironsource.Q2 q2 = this$0.k.get();
        if (q2 != null) {
            q2.onBannerAdShown();
        }
    }

    public final void a(com.unity3d.ironsourceads.banner.BannerAdInfo bannerAdInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bannerAdInfo, "<set-?>");
        this.j = bannerAdInfo;
    }

    public final void a(java.lang.ref.WeakReference<com.ironsource.Q2> weakReference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
        this.k = weakReference;
    }

    private final com.ironsource.P2.a a() {
        return new com.ironsource.P2.a();
    }

    public final void b() {
        com.ironsource.InterfaceC2995cg.CC.a(this.f, new java.lang.Runnable() { // from class: com.ironsource.P2$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.P2.b(com.ironsource.P2.this);
            }
        }, 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(com.ironsource.P2 this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.ironsource.InterfaceC3141l1.d.f6358a.b().a(this$0.d);
        this$0.e.a(this$0.f5889a);
    }

    public /* synthetic */ P2(com.ironsource.J9 j9, com.ironsource.C3041f8 c3041f8, com.ironsource.Y1 y1, com.ironsource.InterfaceC3266s1 interfaceC3266s1, com.ironsource.InterfaceC3134kc interfaceC3134kc, com.ironsource.InterfaceC2995cg interfaceC2995cg, com.ironsource.L8 l8, com.ironsource.L8.a aVar, com.ironsource.InterfaceC3398z7 interfaceC3398z7, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j9, c3041f8, y1, interfaceC3266s1, (i & 16) != 0 ? new com.ironsource.C3152lc() : interfaceC3134kc, (i & 32) != 0 ? com.ironsource.Q7.f5934a : interfaceC2995cg, (i & 64) != 0 ? com.ironsource.Jb.u.d().s() : l8, (i & 128) != 0 ? com.ironsource.Jb.u.a().i() : aVar, (i & 256) != 0 ? com.ironsource.Jb.u.d().h() : interfaceC3398z7);
    }
}
