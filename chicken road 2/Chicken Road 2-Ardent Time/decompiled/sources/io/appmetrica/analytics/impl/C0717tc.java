package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.tc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0717tc implements io.appmetrica.analytics.impl.F8 {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Qg f6850a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.We f6851b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f6852c = "activation_unlock_event_sending";

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f6853d;

    public C0717tc(io.appmetrica.analytics.impl.Qg qg, io.appmetrica.analytics.impl.C0580o4 c0580o4, io.appmetrica.analytics.impl.We we) {
        this.f6850a = qg;
        this.f6851b = we;
        this.f6853d = new java.util.concurrent.atomic.AtomicBoolean(we.a(false) || a(c0580o4));
    }

    public final void a(java.lang.String str) {
        try {
            io.appmetrica.analytics.impl.Qj qj = io.appmetrica.analytics.impl.AbstractC0595oj.f6598a;
            java.lang.String str2 = this.f6852c;
            org.json.JSONObject put = new org.json.JSONObject().put(io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants.SOURCE_KEY, str).put("framework", io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector.framework());
            io.appmetrica.analytics.impl.M9 i2 = io.appmetrica.analytics.impl.C0560na.f6484I.i();
            android.os.Bundle applicationMetaData = i2.f4656d.getApplicationMetaData(i2.f4653a);
            org.json.JSONObject put2 = put.put("appmetrica_plugin_id", applicationMetaData != null ? applicationMetaData.getString("io.appmetrica.analytics.plugin_id") : null);
            io.appmetrica.analytics.impl.C0544mk c0544mk = io.appmetrica.analytics.impl.C0560na.f6484I.f6488D;
            java.lang.String jSONObject = put2.put("activation_offset", java.util.concurrent.TimeUnit.SECONDS.convert(c0544mk.f6442a.currentTimeMillis() - c0544mk.f6443b, java.util.concurrent.TimeUnit.MILLISECONDS)).toString();
            qj.getClass();
            qj.a(new io.appmetrica.analytics.impl.Oj(str2, jSONObject));
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // io.appmetrica.analytics.impl.F8
    public final boolean b() {
        java.lang.String str;
        if (!this.f6853d.get() && (str = ((io.appmetrica.analytics.impl.C0489kh) this.f6850a.a()).f6293m) != null && !str.equals("629a824d-c717-4ba5-bc0f-3f3968554d01") && this.f6853d.compareAndSet(false, true)) {
            this.f6851b.b(true);
            a("activation");
        }
        return this.f6853d.get();
    }

    public final void a() {
        if (this.f6853d.compareAndSet(false, true)) {
            this.f6851b.b(true);
            a("timer");
        }
    }

    public static boolean a(io.appmetrica.analytics.impl.C0580o4 c0580o4) {
        java.lang.String str = c0580o4.f6553a;
        return (str == null || str.equals("629a824d-c717-4ba5-bc0f-3f3968554d01")) ? false : true;
    }
}
