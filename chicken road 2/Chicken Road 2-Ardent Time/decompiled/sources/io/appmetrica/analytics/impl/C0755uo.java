package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.uo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0755uo implements io.appmetrica.analytics.impl.InterfaceC0729to {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C8 f6939a;

    public C0755uo() {
        this(new io.appmetrica.analytics.impl.C8());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0729to
    public final byte[] a(io.appmetrica.analytics.impl.N8 n8, io.appmetrica.analytics.impl.C0489kh c0489kh) {
        if (!((io.appmetrica.analytics.impl.X4) c0489kh.f6292l).B() && !android.text.TextUtils.isEmpty(n8.f4712b)) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(n8.f4712b);
                jSONObject.remove("preloadInfo");
                n8.f4712b = jSONObject.toString();
            } catch (java.lang.Throwable unused) {
            }
        }
        return this.f6939a.a(n8, c0489kh);
    }

    public C0755uo(io.appmetrica.analytics.impl.C8 c8) {
        this.f6939a = c8;
    }
}
