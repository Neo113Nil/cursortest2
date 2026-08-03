package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Wi extends io.appmetrica.analytics.impl.Rg {

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0720tf f5221b;

    public Wi(io.appmetrica.analytics.impl.X4 x4) {
        this(x4, io.appmetrica.analytics.impl.C0560na.k().t());
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final boolean a(io.appmetrica.analytics.impl.P5 p5) {
        org.json.JSONObject jSONObject;
        try {
            jSONObject = new org.json.JSONObject(p5.getValue()).optJSONObject("preloadInfo");
        } catch (java.lang.Throwable unused) {
            jSONObject = null;
        }
        this.f5221b.b(io.appmetrica.analytics.impl.C0643qf.a(jSONObject));
        return false;
    }

    public Wi(io.appmetrica.analytics.impl.X4 x4, io.appmetrica.analytics.impl.C0720tf c0720tf) {
        super(x4);
        this.f5221b = c0720tf;
    }
}
