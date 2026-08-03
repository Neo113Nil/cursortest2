package com.ironsource;

/* loaded from: classes5.dex */
public final class Vb extends com.ironsource.B implements com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener {
    private com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData y;
    private com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Vb(com.ironsource.V0 adTools, com.ironsource.C instanceData, com.ironsource.I adInstancePayload, com.ironsource.F listener) {
        super(adTools, instanceData, adInstancePayload, listener);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstancePayload, "adInstancePayload");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.ironsource.B
    protected void C() {
        if (!(g() instanceof com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface)) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(a("adapter not instance of AdapterNativeAdInterface"));
            return;
        }
        com.ironsource.mediationsdk.adunit.adapter.utility.AdData i = i();
        if (com.ironsource.environment.ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(a("activity must not be null"));
            f().e().h().g("activity must not be null");
            return;
        }
        java.lang.Object g = g();
        kotlin.jvm.internal.Intrinsics.checkNotNull(g, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener>");
        android.content.Context activeContext = com.ironsource.environment.ContextProvider.getInstance().getActiveContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activeContext, "getInstance().activeContext");
        ((com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface) g).loadAd(i, activeContext, this);
    }

    public final com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData K() {
        return this.y;
    }

    public final com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder L() {
        return this.z;
    }

    @Override // com.ironsource.B
    public void a(com.ironsource.K adInstancePresenter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstancePresenter, "adInstancePresenter");
        adInstancePresenter.a(this);
    }

    @Override // com.ironsource.B
    public void b() {
        com.ironsource.mediationsdk.logger.IronLog ironLog = com.ironsource.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose(q());
        if (g() == null) {
            ironLog.warning("adapter == null");
            return;
        }
        try {
            if (g() instanceof com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface) {
                java.lang.Object g = g();
                kotlin.jvm.internal.Intrinsics.checkNotNull(g, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<*>");
                ((com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface) g).destroyAd(i());
            } else {
                ironLog.error(a("adapter not instance of AdapterNativeAdInterface"));
            }
        } catch (java.lang.Throwable th) {
            com.ironsource.C3180n4.d().a(th);
            java.lang.String str = "destroyNativeAd - exception = " + th.getLocalizedMessage();
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(a(str));
            f().e().h().g(str);
        }
        super.b();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener
    public void onAdLoadSuccess(com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData adapterNativeAdData, com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder nativeAdViewBinder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapterNativeAdData, "adapterNativeAdData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeAdViewBinder, "nativeAdViewBinder");
        this.y = adapterNativeAdData;
        this.z = nativeAdViewBinder;
        super.onAdLoadSuccess();
    }

    public final void a(com.ironsource.Ob nativeAdBinder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeAdBinder, "nativeAdBinder");
        nativeAdBinder.a(this.y);
        nativeAdBinder.a(this.z);
    }
}
