package com.ironsource;

/* renamed from: com.ironsource.h6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3075h6 extends com.ironsource.B implements com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener, com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener {
    private com.ironsource.C3056g5 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3075h6(com.ironsource.V0 adTools, com.ironsource.C instanceData, com.ironsource.I adInstancePayload) {
        super(adTools, instanceData, adInstancePayload, null, 8, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstancePayload, "adInstancePayload");
    }

    private final java.util.List<java.lang.String> K() {
        org.json.JSONObject optJSONObject = new com.ironsource.O6().a(new java.lang.String[]{com.ironsource.M6.u}).optJSONObject(com.ironsource.M6.u);
        if (optJSONObject == null) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.lang.Object opt = optJSONObject.opt(com.ironsource.M6.C);
        java.util.List list = opt instanceof java.util.List ? (java.util.List) opt : null;
        if (list == null) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.String.valueOf(it.next()));
        }
        return arrayList;
    }

    private final com.ironsource.InterfaceC3093i6 L() {
        com.ironsource.F s = s();
        if (s instanceof com.ironsource.InterfaceC3093i6) {
            return (com.ironsource.InterfaceC3093i6) s;
        }
        return null;
    }

    private final java.util.Map<java.lang.String, java.lang.Object> M() {
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        for (java.lang.String str : K()) {
            java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{com.ironsource.X3.j.b}, false, 2, 2, (java.lang.Object) null);
            if (split$default.size() < 2) {
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.warning(a("\"" + str + "\" is not a valid key=value format"));
            } else {
                java.lang.String str2 = (java.lang.String) split$default.get(0);
                createMapBuilder.put("custom_" + str2, (java.lang.String) split$default.get(1));
            }
        }
        return kotlin.collections.MapsKt.build(createMapBuilder);
    }

    private final void N() {
        if (w()) {
            f().e().h().l("closed after failure");
            return;
        }
        this.y = new com.ironsource.C3056g5();
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(com.ironsource.B.a(this, (java.lang.String) null, 1, (java.lang.Object) null));
        f().e().a().a(k(), "");
        com.ironsource.InterfaceC3093i6 L = L();
        if (L != null) {
            L.b(this);
        }
        c();
    }

    private final void O() {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(com.ironsource.B.a(this, (java.lang.String) null, 1, (java.lang.Object) null));
        f().e().a().d(k());
    }

    private final void P() {
        if (w()) {
            f().e().h().l("rewarded after failure");
            return;
        }
        java.util.Map<java.lang.String, java.lang.Object> M = M();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String a2 = f().a(currentTimeMillis, p());
        long a3 = com.ironsource.C3056g5.a(this.y);
        com.unity3d.mediation.rewarded.LevelPlayReward a4 = com.ironsource.Jb.u.d().C().a(k(), n().j().b().c());
        f().e().a().a(k(), a4.getName(), a4.getAmount(), currentTimeMillis, a2, a3, M, f().j());
        com.ironsource.InterfaceC3093i6 L = L();
        if (L != null) {
            L.a(this, a4);
        }
    }

    private final void Q() {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(com.ironsource.B.a(this, (java.lang.String) null, 1, (java.lang.Object) null));
        com.ironsource.InterfaceC3093i6 L = L();
        if (L != null) {
            L.a(this);
        }
    }

    private final void R() {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(com.ironsource.B.a(this, (java.lang.String) null, 1, (java.lang.Object) null));
        f().e().a().i(k());
    }

    private final void S() {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(com.ironsource.B.a(this, (java.lang.String) null, 1, (java.lang.Object) null));
        f().e().a().k(k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(com.ironsource.C3075h6 this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(com.ironsource.C3075h6 this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(com.ironsource.C3075h6 this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.R();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(com.ironsource.C3075h6 this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.S();
    }

    @Override // com.ironsource.B
    protected void C() {
        if (!(g() instanceof com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface)) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(a("adapter not instance of AdapterAdFullScreenInterface"));
            return;
        }
        java.lang.Object g = g();
        kotlin.jvm.internal.Intrinsics.checkNotNull(g, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface<com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener>");
        ((com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface) g).loadAd(n().h(), com.ironsource.environment.ContextProvider.getInstance().getActiveContext(), this);
    }

    @Override // com.ironsource.B
    public void a(com.ironsource.K adInstancePresenter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstancePresenter, "adInstancePresenter");
        adInstancePresenter.a(this);
    }

    @Override // com.ironsource.B
    public void c() {
        if (!(g() instanceof com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface)) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(a("adapter not instance of AdapterAdFullScreenInterface"));
            return;
        }
        java.lang.Object g = g();
        kotlin.jvm.internal.Intrinsics.checkNotNull(g, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface<*>");
        ((com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface) g).destroyAd(n().h());
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdClosed() {
        a(new java.lang.Runnable() { // from class: com.ironsource.h6$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.C3075h6.a(com.ironsource.C3075h6.this);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public /* synthetic */ void onAdClosed(java.util.Map map) {
        onAdClosed();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdEnded() {
        a(new java.lang.Runnable() { // from class: com.ironsource.h6$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.C3075h6.b(com.ironsource.C3075h6.this);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public /* synthetic */ void onAdEnded(java.util.Map map) {
        onAdEnded();
    }

    @Override // com.ironsource.B, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        onAdOpened(new java.util.LinkedHashMap());
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener
    public void onAdRewarded() {
        a(new java.lang.Runnable() { // from class: com.ironsource.h6$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.C3075h6.d(com.ironsource.C3075h6.this);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener
    public /* synthetic */ void onAdRewarded(java.util.Map map) {
        onAdRewarded();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdStarted() {
        a(new java.lang.Runnable() { // from class: com.ironsource.h6$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.C3075h6.e(com.ironsource.C3075h6.this);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public /* synthetic */ void onAdStarted(java.util.Map map) {
        onAdStarted();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdVisible() {
        a(new java.lang.Runnable() { // from class: com.ironsource.h6$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.C3075h6.f(com.ironsource.C3075h6.this);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public /* synthetic */ void onAdVisible(java.util.Map map) {
        onAdVisible();
    }

    public final void a(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        com.ironsource.mediationsdk.logger.IronLog ironLog = com.ironsource.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose(a("placementName = " + k()));
        try {
            f().e().a().a(activity, k());
            if (g() instanceof com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface) {
                java.lang.Object g = g();
                kotlin.jvm.internal.Intrinsics.checkNotNull(g, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface<com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener>");
                ((com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface) g).showAd(i(), activity, this);
            } else {
                ironLog.error(a("showAd - adapter not instance of AdapterAdFullScreenInterface"));
                f().e().h().g("showAd - adapter not instance of AdapterAdFullScreenInterface");
            }
        } catch (java.lang.Throwable th) {
            com.ironsource.C3180n4.d().a(th);
            java.lang.String str = "showAd - exception = " + th.getMessage();
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(a(str));
            f().e().h().g(str);
            a(com.ironsource.B0.h(n().i()), str);
        }
    }

    @Override // com.ironsource.B, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened(java.util.Map<java.lang.String, java.lang.Object> extraData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extraData, "extraData");
        super.onAdOpened(extraData);
        a(new java.lang.Runnable() { // from class: com.ironsource.h6$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.C3075h6.c(com.ironsource.C3075h6.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(com.ironsource.C3075h6 this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.C3075h6 this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.N();
    }
}
