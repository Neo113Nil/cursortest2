package com.ironsource.mediationsdk;

/* loaded from: classes5.dex */
public abstract class u implements com.ironsource.K8.b {

    /* renamed from: a, reason: collision with root package name */
    protected com.ironsource.mediationsdk.AbstractAdapter f6469a;
    protected com.ironsource.C3016e1 b;
    private boolean c;
    protected org.json.JSONObject d;
    protected java.lang.String e;
    protected int f;
    protected java.lang.Long g = null;

    u(com.ironsource.C3016e1 c3016e1, com.ironsource.mediationsdk.AbstractAdapter abstractAdapter) {
        this.b = c3016e1;
        this.f6469a = abstractAdapter;
        this.d = c3016e1.c();
    }

    public abstract com.ironsource.mediationsdk.IronSource.a a();

    public void a(boolean z) {
        this.c = z;
    }

    @Override // com.ironsource.K8.b
    public int b() {
        return this.b.e();
    }

    @Override // com.ironsource.K8.b
    public java.lang.String c() {
        return this.b.f();
    }

    public java.lang.Long d() {
        return this.g;
    }

    public java.lang.String e() {
        return java.lang.String.format("%s %s", h(), java.lang.Integer.valueOf(hashCode()));
    }

    public int f() {
        return this.b.d();
    }

    public boolean g() {
        return this.c;
    }

    public java.lang.String h() {
        return this.b.h().isMultipleInstances() ? this.b.h().getProviderTypeForReflection() : this.b.h().getProviderName();
    }

    public java.lang.String i() {
        return this.b.g();
    }

    public abstract java.lang.String j();

    public int k() {
        return 1;
    }

    public java.util.Map<java.lang.String, java.lang.Object> l() {
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            com.ironsource.mediationsdk.AbstractAdapter abstractAdapter = this.f6469a;
            hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, abstractAdapter != null ? abstractAdapter.getVersion() : "");
            com.ironsource.mediationsdk.AbstractAdapter abstractAdapter2 = this.f6469a;
            hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, abstractAdapter2 != null ? abstractAdapter2.getCoreSDKVersion() : "");
            hashMap.put("spId", this.b.i());
            hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER, this.b.a());
            hashMap.put("instanceType", java.lang.Integer.valueOf(o() ? 2 : 1));
            hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_PROGRAMMATIC, java.lang.Integer.valueOf(k()));
            if (!android.text.TextUtils.isEmpty(this.e)) {
                hashMap.put("dynamicDemandSource", this.e);
            }
        } catch (java.lang.Throwable th) {
            com.ironsource.C3180n4.d().a(th);
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE, "getProviderEventData " + c() + ")", th);
        }
        return hashMap;
    }

    public int m() {
        return this.f;
    }

    public boolean n() {
        com.ironsource.mediationsdk.logger.IronLog ironLog = com.ironsource.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose();
        try {
            if (com.ironsource.environment.ContextProvider.getInstance().getCurrentActiveActivity() != null || !this.f6469a.isUsingActivityBeforeImpression(com.ironsource.Ff.a(a()))) {
                return false;
            }
            ironLog.verbose(c() + " - is using activity before impression and activity is null");
            return true;
        } catch (java.lang.Throwable th) {
            com.ironsource.C3180n4.d().a(th);
            b("Exception while calling adapter.isUsingActivityBeforeImpression() - " + th.getLocalizedMessage());
            return true;
        }
    }

    public boolean o() {
        return this.b.j();
    }

    public void p() {
        this.f6469a = null;
    }

    public boolean q() {
        if (n()) {
            return false;
        }
        return o() || r();
    }

    public boolean r() {
        return this.b.k();
    }

    public void a(java.lang.String str) {
        a(str, 0);
    }

    public void b(java.lang.String str) {
        a(str, 3);
    }

    public void c(java.lang.String str) {
        this.e = com.ironsource.mediationsdk.d.b().c(str);
    }

    private void a(java.lang.String str, int i) {
        com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL, j() + io.ktor.sse.ServerSentEventKt.SPACE + c() + " : " + str, i);
    }
}
