package com.ironsource;

/* renamed from: com.ironsource.jb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3115jb extends com.ironsource.AbstractC3311ua implements com.ironsource.Ub {
    private final java.util.UUID d;
    private final com.ironsource.C3080hb e;
    private com.ironsource.Rb f;
    private java.lang.String g;
    private com.ironsource.C3064gd h;
    private com.ironsource.InterfaceC3151lb i;
    private com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData j;
    private com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder k;

    public /* synthetic */ C3115jb(java.util.UUID uuid, com.ironsource.C3080hb c3080hb, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.ironsource.C3326v7.f6774a.a() : uuid, c3080hb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.C3115jb this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.ironsource.mediationsdk.logger.IronLog.API.info(java.lang.String.valueOf(this$0));
        try {
            com.ironsource.Rb rb = this$0.f;
            if (rb == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("nativeAdController");
                rb = null;
            }
            rb.n();
            this$0.i = null;
        } catch (java.lang.Throwable th) {
            com.ironsource.C3180n4.d().a(th);
            com.ironsource.mediationsdk.logger.IronLog.API.error("destroyNativeAd()");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(com.ironsource.C3115jb this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.ironsource.Rb rb = null;
        if (this$0.c()) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.warning(com.ironsource.C3212p0.a(this$0.a(), "Native ad load already called", (java.lang.String) null, 2, (java.lang.Object) null));
            return;
        }
        this$0.a(true);
        if (this$0.d()) {
            com.ironsource.Rb rb2 = this$0.f;
            if (rb2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("nativeAdController");
            } else {
                rb = rb2;
            }
            rb.o();
        }
    }

    private final com.ironsource.Rb e() {
        this.h = a().c(this.g);
        java.util.UUID uuid = this.d;
        java.lang.String b = b();
        com.ironsource.C3064gd c3064gd = this.h;
        if (c3064gd == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("placement");
            c3064gd = null;
        }
        com.ironsource.C2973bc c2973bc = new com.ironsource.C2973bc(uuid, b, c3064gd);
        a(c2973bc);
        return new com.ironsource.Rb(this, a(), c2973bc);
    }

    @Override // com.ironsource.AbstractC3311ua
    public boolean d() {
        this.f = e();
        return true;
    }

    public final void f() {
        a(new java.lang.Runnable() { // from class: com.ironsource.jb$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.C3115jb.a(com.ironsource.C3115jb.this);
            }
        });
    }

    public final java.util.UUID g() {
        return this.d;
    }

    public final java.lang.String h() {
        com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData adapterNativeAdData = this.j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getAdvertiser();
        }
        return null;
    }

    public final java.lang.String i() {
        com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData adapterNativeAdData = this.j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getBody();
        }
        return null;
    }

    public final java.lang.String j() {
        com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData adapterNativeAdData = this.j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getCallToAction();
        }
        return null;
    }

    public final com.ironsource.InterfaceC3098ib.a k() {
        com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface.Image icon;
        com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData adapterNativeAdData = this.j;
        if (adapterNativeAdData == null || (icon = adapterNativeAdData.getIcon()) == null) {
            return null;
        }
        return new com.ironsource.InterfaceC3098ib.a(icon.getDrawable(), icon.getUri());
    }

    public final com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder l() {
        return this.k;
    }

    public final java.lang.String m() {
        com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData adapterNativeAdData = this.j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getTitle();
        }
        return null;
    }

    public final void n() {
        a(new java.lang.Runnable() { // from class: com.ironsource.jb$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.C3115jb.b(com.ironsource.C3115jb.this);
            }
        });
    }

    @Override // com.ironsource.Ub
    public void onNativeAdLoadFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        java.lang.String uuid = this.d.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "adId.toString()");
        final com.unity3d.mediation.LevelPlayAdError levelPlayAdError = new com.unity3d.mediation.LevelPlayAdError(ironSourceError, uuid, b());
        b(new java.lang.Runnable() { // from class: com.ironsource.jb$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.C3115jb.a(com.ironsource.C3115jb.this, levelPlayAdError);
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3115jb(java.util.UUID adId, com.ironsource.C3080hb nativeAd) {
        super(new com.ironsource.C3212p0(r1, com.ironsource.F0.b.MEDIATION));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adId, "adId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        com.ironsource.mediationsdk.IronSource.a aVar = com.ironsource.mediationsdk.IronSource.a.NATIVE_AD;
        this.d = adId;
        this.e = nativeAd;
        this.g = "";
        a().e().a(new com.ironsource.C3175n(aVar, adId, b()));
    }

    public final void a(final com.ironsource.InterfaceC3151lb interfaceC3151lb) {
        a(new java.lang.Runnable() { // from class: com.ironsource.jb$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.C3115jb.a(com.ironsource.C3115jb.this, interfaceC3151lb);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.C3115jb this$0, com.ironsource.InterfaceC3151lb interfaceC3151lb) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.i = interfaceC3151lb;
    }

    @Override // com.ironsource.Ub
    public void a(final com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info(java.lang.String.valueOf(this));
        com.ironsource.Ob ob = new com.ironsource.Ob();
        com.ironsource.Rb rb = this.f;
        if (rb == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("nativeAdController");
            rb = null;
        }
        rb.a(ob);
        this.j = ob.a();
        this.k = ob.b();
        b(new java.lang.Runnable() { // from class: com.ironsource.jb$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.C3115jb.b(com.ironsource.C3115jb.this, adInfo);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(com.ironsource.C3115jb this$0, com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        com.ironsource.InterfaceC3151lb interfaceC3151lb = this$0.i;
        if (interfaceC3151lb != null) {
            interfaceC3151lb.b(this$0.e, adInfo);
        }
    }

    @Override // com.ironsource.Ub
    public void b(final com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        b(new java.lang.Runnable() { // from class: com.ironsource.jb$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.C3115jb.a(com.ironsource.C3115jb.this, adInfo);
            }
        });
    }

    public final void b(final java.lang.String placementName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementName, "placementName");
        a(new java.lang.Runnable() { // from class: com.ironsource.jb$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.C3115jb.a(com.ironsource.C3115jb.this, placementName);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.C3115jb this$0, com.unity3d.mediation.LevelPlayAdError levelPlayError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(levelPlayError, "$levelPlayError");
        com.ironsource.InterfaceC3151lb interfaceC3151lb = this$0.i;
        if (interfaceC3151lb != null) {
            interfaceC3151lb.a(this$0.e, levelPlayError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.C3115jb this$0, com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        com.ironsource.InterfaceC3151lb interfaceC3151lb = this$0.i;
        if (interfaceC3151lb != null) {
            interfaceC3151lb.c(this$0.e, adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.C3115jb this$0, java.lang.String placementName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementName, "$placementName");
        this$0.g = placementName;
    }
}
