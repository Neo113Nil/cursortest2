package com.ironsource;

/* renamed from: com.ironsource.v9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3328v9 implements com.ironsource.InterfaceC2967b6 {

    /* renamed from: a, reason: collision with root package name */
    private com.ironsource.J9 f6776a;
    private com.ironsource.InterfaceC2979c0 b;
    private com.ironsource.Z1 c;
    private com.ironsource.InterfaceC3266s1 d;
    private com.ironsource.InterfaceC3134kc e;
    private com.ironsource.InterfaceC2995cg f;
    private com.ironsource.L8 g;
    private com.ironsource.L8.a h;
    private final java.util.Map<java.lang.String, com.ironsource.C3328v9> i;
    private com.unity3d.ironsourceads.interstitial.InterstitialAdInfo j;
    private com.ironsource.InterfaceC3346w9 k;

    public C3328v9(com.ironsource.J9 adInstance, com.ironsource.InterfaceC2979c0 adNetworkShow, com.ironsource.Z1 auctionDataReporter, com.ironsource.InterfaceC3266s1 analytics, com.ironsource.InterfaceC3134kc networkDestroyAPI, com.ironsource.InterfaceC2995cg threadManager, com.ironsource.L8 sessionDepthService, com.ironsource.L8.a sessionDepthServiceEditor, java.util.Map<java.lang.String, com.ironsource.C3328v9> retainer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adNetworkShow, "adNetworkShow");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionDataReporter, "auctionDataReporter");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analytics, "analytics");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkDestroyAPI, "networkDestroyAPI");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threadManager, "threadManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionDepthService, "sessionDepthService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionDepthServiceEditor, "sessionDepthServiceEditor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(retainer, "retainer");
        this.f6776a = adInstance;
        this.b = adNetworkShow;
        this.c = auctionDataReporter;
        this.d = analytics;
        this.e = networkDestroyAPI;
        this.f = threadManager;
        this.g = sessionDepthService;
        this.h = sessionDepthServiceEditor;
        this.i = retainer;
        java.lang.String f = adInstance.f();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(f, "adInstance.instanceId");
        java.lang.String e = this.f6776a.e();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(e, "adInstance.id");
        this.j = new com.unity3d.ironsourceads.interstitial.InterstitialAdInfo(f, e);
        com.ironsource.Z5 z5 = new com.ironsource.Z5();
        this.f6776a.a(z5);
        z5.a(this);
    }

    public final void a(com.unity3d.ironsourceads.interstitial.InterstitialAdInfo interstitialAdInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interstitialAdInfo, "<set-?>");
        this.j = interstitialAdInfo;
    }

    public final com.unity3d.ironsourceads.interstitial.InterstitialAdInfo b() {
        return this.j;
    }

    public final com.ironsource.InterfaceC3346w9 c() {
        return this.k;
    }

    public final boolean d() {
        boolean a2 = this.b.a(this.f6776a);
        com.ironsource.InterfaceC3141l1.a.f6353a.a(a2).a(this.d);
        return a2;
    }

    protected final void finalize() {
        a();
    }

    @Override // com.ironsource.InterfaceC2967b6
    public void onAdInstanceDidBecomeVisible() {
        com.ironsource.InterfaceC3141l1.a.f6353a.f(new com.ironsource.InterfaceC3213p1[0]).a(this.d);
    }

    @Override // com.ironsource.InterfaceC2967b6
    public void onAdInstanceDidClick() {
        com.ironsource.InterfaceC3141l1.a.f6353a.a().a(this.d);
        this.f.a(new java.lang.Runnable() { // from class: com.ironsource.v9$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.C3328v9.b(com.ironsource.C3328v9.this);
            }
        });
    }

    @Override // com.ironsource.InterfaceC2967b6
    public void onAdInstanceDidDismiss() {
        this.i.remove(this.j.getAdId());
        com.ironsource.InterfaceC3141l1.a.f6353a.a(new com.ironsource.InterfaceC3213p1[0]).a(this.d);
        this.f.a(new java.lang.Runnable() { // from class: com.ironsource.v9$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.C3328v9.c(com.ironsource.C3328v9.this);
            }
        });
    }

    @Override // com.ironsource.InterfaceC2967b6
    public void onAdInstanceDidReward(java.lang.String str, int i) {
    }

    @Override // com.ironsource.InterfaceC2967b6
    public void onAdInstanceDidShow() {
        com.ironsource.L8 l8 = this.g;
        com.ironsource.mediationsdk.IronSource.a aVar = com.ironsource.mediationsdk.IronSource.a.INTERSTITIAL;
        com.ironsource.InterfaceC3141l1.a.f6353a.b(new com.ironsource.C3195o1.w(l8.a(aVar))).a(this.d);
        this.h.b(aVar);
        this.c.b("onAdInstanceDidShow");
        this.f.a(new java.lang.Runnable() { // from class: com.ironsource.v9$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.C3328v9.d(com.ironsource.C3328v9.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(com.ironsource.C3328v9 this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.ironsource.InterfaceC3346w9 interfaceC3346w9 = this$0.k;
        if (interfaceC3346w9 != null) {
            interfaceC3346w9.onAdInstanceDidClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(com.ironsource.C3328v9 this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.ironsource.InterfaceC3346w9 interfaceC3346w9 = this$0.k;
        if (interfaceC3346w9 != null) {
            interfaceC3346w9.onAdInstanceDidDismiss();
        }
    }

    public final void a(com.ironsource.InterfaceC3346w9 interfaceC3346w9) {
        this.k = interfaceC3346w9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(com.ironsource.C3328v9 this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.ironsource.InterfaceC3346w9 interfaceC3346w9 = this$0.k;
        if (interfaceC3346w9 != null) {
            interfaceC3346w9.onAdInstanceDidShow();
        }
    }

    public final void a(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        this.i.put(this.j.getAdId(), this);
        if (!this.b.a(this.f6776a)) {
            a(com.ironsource.C3306u5.f6757a.t());
        } else {
            com.ironsource.InterfaceC3141l1.a.f6353a.d(new com.ironsource.InterfaceC3213p1[0]).a(this.d);
            this.b.a(activity, this.f6776a);
        }
    }

    @Override // com.ironsource.InterfaceC2967b6
    public void a(java.lang.String str) {
        a(com.ironsource.C3306u5.f6757a.c(new com.ironsource.mediationsdk.logger.IronSourceError(0, str)));
    }

    private final void a(final com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        this.i.remove(this.j.getAdId());
        com.ironsource.InterfaceC3141l1.a.f6353a.a(new com.ironsource.C3195o1.j(ironSourceError.getErrorCode()), new com.ironsource.C3195o1.k(ironSourceError.getErrorMessage())).a(this.d);
        this.f.a(new java.lang.Runnable() { // from class: com.ironsource.v9$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.C3328v9.a(com.ironsource.C3328v9.this, ironSourceError);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.C3328v9 this$0, com.ironsource.mediationsdk.logger.IronSourceError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "$error");
        com.ironsource.InterfaceC3346w9 interfaceC3346w9 = this$0.k;
        if (interfaceC3346w9 != null) {
            interfaceC3346w9.onAdInstanceDidFailedToShow(error);
        }
    }

    public final void a() {
        com.ironsource.InterfaceC2995cg.CC.a(this.f, new java.lang.Runnable() { // from class: com.ironsource.v9$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.C3328v9.a(com.ironsource.C3328v9.this);
            }
        }, 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.C3328v9 this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.ironsource.InterfaceC3141l1.d.f6358a.b().a(this$0.d);
        this$0.e.a(this$0.f6776a);
    }

    public /* synthetic */ C3328v9(com.ironsource.J9 j9, com.ironsource.InterfaceC2979c0 interfaceC2979c0, com.ironsource.Z1 z1, com.ironsource.InterfaceC3266s1 interfaceC3266s1, com.ironsource.InterfaceC3134kc interfaceC3134kc, com.ironsource.InterfaceC2995cg interfaceC2995cg, com.ironsource.L8 l8, com.ironsource.L8.a aVar, java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j9, interfaceC2979c0, z1, interfaceC3266s1, (i & 16) != 0 ? new com.ironsource.C3152lc() : interfaceC3134kc, (i & 32) != 0 ? com.ironsource.Q7.f5934a : interfaceC2995cg, (i & 64) != 0 ? com.ironsource.Jb.u.d().s() : l8, (i & 128) != 0 ? com.ironsource.Jb.u.a().i() : aVar, map);
    }
}
