package com.ironsource.mediationsdk.demandOnly;

/* loaded from: classes5.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    protected com.ironsource.mediationsdk.AbstractAdapter f6429a;
    protected com.ironsource.C3016e1 b;
    protected org.json.JSONObject c;
    private com.ironsource.mediationsdk.demandOnly.m.a d;
    private java.util.Timer e;
    long f;
    protected java.lang.String g;
    protected org.json.JSONObject h;
    protected java.util.List<java.lang.String> i;
    protected java.lang.String j;
    private final java.lang.Object k = new java.lang.Object();
    private final java.lang.Object l = new java.lang.Object();
    protected final com.ironsource.mediationsdk.IronSource.a m;

    protected enum a {
        NOT_LOADED,
        LOAD_IN_PROGRESS,
        LOADED,
        SHOW_IN_PROGRESS
    }

    public m(com.ironsource.C3016e1 c3016e1, com.ironsource.mediationsdk.AbstractAdapter abstractAdapter) {
        this.b = c3016e1;
        this.m = c3016e1.b();
        this.f6429a = abstractAdapter;
        org.json.JSONObject c = c3016e1.c();
        this.c = c;
        try {
            c.put(com.ironsource.adapters.ironsource.IronSourceLoadParameters.Constants.DEMAND_ONLY, true);
        } catch (org.json.JSONException e) {
            com.ironsource.C3180n4.d().a(e);
        }
        this.d = com.ironsource.mediationsdk.demandOnly.m.a.NOT_LOADED;
        this.e = null;
        this.g = "";
        this.h = null;
        this.i = new java.util.ArrayList();
    }

    boolean a(com.ironsource.mediationsdk.demandOnly.m.a aVar, com.ironsource.mediationsdk.demandOnly.m.a aVar2) {
        synchronized (this.k) {
            if (this.d != aVar) {
                return false;
            }
            b(aVar2);
            return true;
        }
    }

    void b(com.ironsource.mediationsdk.demandOnly.m.a aVar) {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("DemandOnlySmash " + this.b.f() + ": current state=" + this.d + ", new state=" + aVar);
        synchronized (this.k) {
            this.d = aVar;
        }
    }

    public com.ironsource.C3016e1 f() {
        return this.b;
    }

    public java.lang.String g() {
        return this.g;
    }

    public java.lang.String h() {
        return this.b.f();
    }

    public int i() {
        return this.b.d();
    }

    public java.util.Map<java.lang.String, java.lang.Object> j() {
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            com.ironsource.mediationsdk.AbstractAdapter abstractAdapter = this.f6429a;
            hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, abstractAdapter != null ? abstractAdapter.getVersion() : "");
            com.ironsource.mediationsdk.AbstractAdapter abstractAdapter2 = this.f6429a;
            hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, abstractAdapter2 != null ? abstractAdapter2.getCoreSDKVersion() : "");
            hashMap.put("spId", this.b.i());
            hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER, this.b.a());
            hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            hashMap.put("instanceType", java.lang.Integer.valueOf(this.b.d()));
            if (!android.text.TextUtils.isEmpty(this.g)) {
                hashMap.put("auctionId", this.g);
            }
            org.json.JSONObject jSONObject = this.h;
            if (jSONObject != null && jSONObject.length() > 0) {
                hashMap.put("genericParams", this.h);
            }
            if (!android.text.TextUtils.isEmpty(this.j)) {
                hashMap.put("dynamicDemandSource", this.j);
            }
            if (o()) {
                hashMap.put("isOneFlow", 1);
            }
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE, "getProviderEventData " + h() + ")", e);
        }
        return hashMap;
    }

    java.lang.String k() {
        com.ironsource.mediationsdk.demandOnly.m.a aVar = this.d;
        return aVar == null ? kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL : aVar.toString();
    }

    public java.lang.String l() {
        return this.b.i();
    }

    public java.util.List<java.lang.String> m() {
        return this.i;
    }

    public boolean n() {
        return this.b.j();
    }

    public boolean o() {
        return this.c.optBoolean("isOneFlow", false);
    }

    void p() {
        synchronized (this.l) {
            java.util.Timer timer = this.e;
            if (timer != null) {
                timer.cancel();
                this.e = null;
            }
        }
    }

    com.ironsource.mediationsdk.demandOnly.m.a a(com.ironsource.mediationsdk.demandOnly.m.a[] aVarArr, com.ironsource.mediationsdk.demandOnly.m.a aVar) {
        com.ironsource.mediationsdk.demandOnly.m.a aVar2;
        synchronized (this.k) {
            aVar2 = this.d;
            if (java.util.Arrays.asList(aVarArr).contains(this.d)) {
                b(aVar);
            }
        }
        return aVar2;
    }

    public void b(java.lang.String str) {
        this.j = com.ironsource.mediationsdk.d.b().c(str);
    }

    boolean a(com.ironsource.mediationsdk.demandOnly.m.a aVar) {
        boolean z;
        synchronized (this.k) {
            z = this.d == aVar;
        }
        return z;
    }

    public void a(boolean z) {
        try {
            this.c.put("isOneFlow", z);
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("Can't set isOneFlow = " + z + ". Error: " + e.getMessage());
        }
    }

    void a(java.util.TimerTask timerTask) {
        synchronized (this.l) {
            p();
            java.util.Timer timer = new java.util.Timer();
            this.e = timer;
            timer.schedule(timerTask, this.f);
        }
    }

    public void a(java.lang.String str) {
        this.g = str;
    }

    public void a(org.json.JSONObject jSONObject) {
        this.h = jSONObject;
    }

    protected void a(java.util.List<java.lang.String> list, java.lang.String str, int i, java.lang.String str2, java.lang.String str3) {
        java.util.Iterator it = ((java.util.List) com.ironsource.Y9.a((java.util.ArrayList) list, new java.util.ArrayList())).iterator();
        while (it.hasNext()) {
            com.ironsource.mediationsdk.d.b().a(str3, str, com.ironsource.mediationsdk.d.b().a((java.lang.String) it.next(), str, i, str2, "", "", "", ""));
        }
    }
}
