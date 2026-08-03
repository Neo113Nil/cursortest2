package com.ironsource.mediationsdk;

/* loaded from: classes5.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    private java.util.HashSet<com.ironsource.mediationsdk.impressionData.ImpressionDataListener> f6440a;
    protected com.ironsource.C3264s b;
    protected com.ironsource.C2953aa c;
    protected com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo d;

    public k(java.util.HashSet<com.ironsource.mediationsdk.impressionData.ImpressionDataListener> hashSet, com.ironsource.C2953aa c2953aa) {
        new java.util.HashSet();
        this.f6440a = hashSet;
        this.b = new com.ironsource.C3264s();
        this.c = c2953aa;
    }

    public void a(com.ironsource.mediationsdk.impressionData.ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f6440a.add(impressionDataListener);
        }
    }

    public void b(com.ironsource.mediationsdk.impressionData.ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f6440a.remove(impressionDataListener);
        }
    }

    public void c() {
        this.d = null;
    }

    public void a(com.ironsource.C2953aa c2953aa) {
        this.c = c2953aa;
    }

    public void b() {
        synchronized (this) {
            this.f6440a.clear();
        }
    }

    public void a(com.ironsource.V8 v8, com.ironsource.C3402zb c3402zb) {
        if (v8 != null) {
            this.d = new com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo(v8, c3402zb);
        }
    }

    protected void a(com.ironsource.C3232q2 c3232q2, java.lang.String str) {
        java.util.HashSet hashSet;
        if (c3232q2 != null) {
            com.ironsource.V8 a2 = c3232q2.a(str);
            if (a2 != null) {
                synchronized (this) {
                    hashSet = (java.util.HashSet) this.f6440a.clone();
                }
                java.util.Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    com.ironsource.mediationsdk.impressionData.ImpressionDataListener impressionDataListener = (com.ironsource.mediationsdk.impressionData.ImpressionDataListener) it.next();
                    com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("onImpressionSuccess " + impressionDataListener.getClass().getSimpleName() + ": " + a2);
                    impressionDataListener.onImpressionSuccess(a2);
                }
                return;
            }
            return;
        }
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("no auctionResponseItem or listener");
    }

    protected java.lang.String a() {
        return "fallback_" + java.lang.System.currentTimeMillis();
    }

    protected void a(org.json.JSONObject jSONObject, com.ironsource.mediationsdk.IronSource.a aVar) {
        this.b.a(aVar, jSONObject != null ? jSONObject.optBoolean(com.ironsource.mediationsdk.d.f, false) : false);
    }

    protected void a(com.ironsource.mediationsdk.IronSource.a aVar) {
        this.b.a(aVar, false);
    }
}
