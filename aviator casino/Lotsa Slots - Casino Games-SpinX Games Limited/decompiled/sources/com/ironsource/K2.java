package com.ironsource;

/* loaded from: classes5.dex */
public class K2 extends com.ironsource.AbstractC3107j3<com.ironsource.InterfaceC3283t0> implements com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener, com.ironsource.E0 {
    public static final java.lang.String t = "bannerLayout";
    public static final java.lang.String u = "bannerSize";
    private final com.ironsource.mediationsdk.o r;
    private final boolean s;

    class a extends com.ironsource.AbstractRunnableC3136ke {
        final /* synthetic */ android.view.View b;
        final /* synthetic */ android.widget.FrameLayout.LayoutParams c;

        a(android.view.View view, android.widget.FrameLayout.LayoutParams layoutParams) {
            this.b = view;
            this.c = layoutParams;
        }

        @Override // com.ironsource.AbstractRunnableC3136ke
        public void a() {
            com.ironsource.K2.this.a(this.b, this.c);
        }
    }

    class b extends com.ironsource.AbstractRunnableC3136ke {
        b() {
        }

        @Override // com.ironsource.AbstractRunnableC3136ke
        public void a() {
            com.ironsource.K2.this.J();
        }
    }

    public K2(com.ironsource.InterfaceC3243qd interfaceC3243qd, com.ironsource.C3176n0 c3176n0, com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener> baseAdAdapter, com.ironsource.mediationsdk.o oVar, com.ironsource.C3064gd c3064gd, boolean z, com.ironsource.C3232q2 c3232q2, com.ironsource.InterfaceC3283t0 interfaceC3283t0) {
        super(interfaceC3243qd, c3176n0, baseAdAdapter, new com.ironsource.C3016e1(c3176n0.g(), c3176n0.g().getBannerSettings(), com.ironsource.mediationsdk.IronSource.a.BANNER), c3232q2, interfaceC3283t0);
        this.r = oVar;
        this.g = c3064gd;
        this.s = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        com.ironsource.mediationsdk.logger.IronLog ironLog = com.ironsource.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose(d());
        if (y()) {
            super.onAdOpened();
        } else {
            if (this.e == com.ironsource.AbstractC3107j3.h.FAILED) {
                return;
            }
            ironLog.error(java.lang.String.format("unexpected onAdOpened for %s, state - %s", k(), this.e));
            if (this.d != null) {
                this.d.j.q(java.lang.String.format("unexpected onAdOpened, state - %s", this.e));
            }
        }
    }

    @Override // com.ironsource.AbstractC3107j3
    protected void G() {
        java.lang.Object obj = this.c;
        if (obj instanceof com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface) {
            ((com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface) obj).loadAd(this.k, com.ironsource.environment.ContextProvider.getInstance().getCurrentActiveActivity(), this.r.getSize(), this);
        } else {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(a("adapter not instance of AdapterBannerInterface"));
        }
    }

    @Override // com.ironsource.AbstractC3107j3
    protected boolean O() {
        return false;
    }

    public void P() {
        com.ironsource.mediationsdk.logger.IronLog ironLog = com.ironsource.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose(k());
        a(com.ironsource.AbstractC3107j3.h.NONE);
        java.lang.Object obj = this.c;
        if (obj == null) {
            ironLog.warning("mAdapter == null");
            return;
        }
        try {
            if (obj instanceof com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface) {
                ((com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface) obj).destroyAd(this.k);
            } else {
                ironLog.error(a("adapter not instance of AdapterBannerInterface"));
            }
        } catch (java.lang.Throwable th) {
            com.ironsource.C3180n4.d().a(th);
            java.lang.String str = "destroyBanner - exception = " + th.getLocalizedMessage() + " state = " + this.e;
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(a(str));
            com.ironsource.F0 f0 = this.d;
            if (f0 != null) {
                f0.j.g(str);
            }
        }
        com.ironsource.F0 f02 = this.d;
        if (f02 != null) {
            f02.f.a(r().intValue());
        }
    }

    public void Q() {
        java.lang.Object obj = this.c;
        if (obj instanceof com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBindAdViewInterface) {
            ((com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBindAdViewInterface) obj).onAdViewBound(this.k);
        }
    }

    public void R() {
        java.lang.Object obj = this.c;
        if (obj instanceof com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBindAdViewInterface) {
            ((com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBindAdViewInterface) obj).onAdViewWillBind(this.k);
        }
    }

    @Override // com.ironsource.AbstractC3107j3
    protected com.ironsource.mediationsdk.adunit.adapter.utility.AdData a(java.lang.String str, java.util.Map<java.lang.String, java.lang.Object> map) {
        return new com.ironsource.mediationsdk.adunit.adapter.utility.AdData(str, q(), a(map));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLeftApplication() {
        com.ironsource.F0 f0;
        com.ironsource.C3064gd c3064gd = this.g;
        if (c3064gd != null && (f0 = this.d) != null) {
            f0.i.f(c3064gd.c());
        }
        Listener listener = this.b;
        if (listener != 0) {
            ((com.ironsource.InterfaceC3283t0) listener).c(this);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public /* synthetic */ void onAdLeftApplication(java.util.Map map) {
        onAdLeftApplication();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLoadSuccess(android.view.View view, android.widget.FrameLayout.LayoutParams layoutParams) {
        if (u().c()) {
            u().a(new com.ironsource.K2.a(view, layoutParams));
        } else {
            a(view, layoutParams);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public /* synthetic */ void onAdLoadSuccess(android.view.View view, android.widget.FrameLayout.LayoutParams layoutParams, java.util.Map map) {
        onAdLoadSuccess(view, layoutParams);
    }

    @Override // com.ironsource.AbstractC3107j3, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        if (u().c()) {
            u().a(new com.ironsource.K2.b());
        } else {
            J();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenDismissed() {
        com.ironsource.F0 f0;
        com.ironsource.C3064gd c3064gd = this.g;
        if (c3064gd != null && (f0 = this.d) != null) {
            f0.i.c(c3064gd.c());
        }
        Listener listener = this.b;
        if (listener != 0) {
            ((com.ironsource.InterfaceC3283t0) listener).b(this);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public /* synthetic */ void onAdScreenDismissed(java.util.Map map) {
        onAdScreenDismissed();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenPresented() {
        com.ironsource.F0 f0;
        com.ironsource.C3064gd c3064gd = this.g;
        if (c3064gd != null && (f0 = this.d) != null) {
            f0.i.h(c3064gd.c());
        }
        Listener listener = this.b;
        if (listener != 0) {
            ((com.ironsource.InterfaceC3283t0) listener).f(this);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public /* synthetic */ void onAdScreenPresented(java.util.Map map) {
        onAdScreenPresented();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdShowFailed(int i, java.lang.String str) {
    }

    @Override // com.ironsource.AbstractC3107j3
    protected boolean v() {
        return this.s;
    }

    @Override // com.ironsource.AbstractC3107j3
    protected java.util.Map<java.lang.String, java.lang.Object> a(java.util.Map<java.lang.String, java.lang.Object> map) {
        java.util.Map<java.lang.String, java.lang.Object> a2 = super.a(map);
        com.ironsource.C3176n0 c3176n0 = this.f6320a;
        if (c3176n0 != null && this.r != null && android.text.TextUtils.isEmpty(c3176n0.g().getCustomNetwork())) {
            a2.put(t, this.r);
        }
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(android.view.View view, android.widget.FrameLayout.LayoutParams layoutParams) {
        Listener listener;
        super.onAdLoadSuccess();
        if (!y() || (listener = this.b) == 0) {
            return;
        }
        ((com.ironsource.InterfaceC3283t0) listener).a(this, view, layoutParams);
    }

    @Override // com.ironsource.AbstractC3107j3, com.ironsource.E0
    public java.util.Map<java.lang.String, java.lang.Object> a(com.ironsource.C0 c0) {
        java.util.Map<java.lang.String, java.lang.Object> a2 = super.a(c0);
        com.ironsource.mediationsdk.o oVar = this.r;
        if (oVar != null && !oVar.b()) {
            com.ironsource.mediationsdk.j.a(a2, this.r.getSize());
        }
        if (this.g != null) {
            a2.put("placement", j());
        }
        return a2;
    }
}
