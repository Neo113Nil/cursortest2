package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.rf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0668rf implements io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0617pf f6730a = new io.appmetrica.analytics.impl.C0617pf();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0513lf fromModel(io.appmetrica.analytics.impl.C0643qf c0643qf) {
        io.appmetrica.analytics.impl.C0513lf c0513lf = new io.appmetrica.analytics.impl.C0513lf();
        if (!android.text.TextUtils.isEmpty(c0643qf.f6687a)) {
            c0513lf.f6358a = c0643qf.f6687a;
        }
        c0513lf.f6359b = c0643qf.f6688b.toString();
        c0513lf.f6360c = c0643qf.f6689c;
        c0513lf.f6361d = c0643qf.f6690d;
        c0513lf.f6362e = this.f6730a.fromModel(c0643qf.f6691e).intValue();
        return c0513lf;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0643qf toModel(io.appmetrica.analytics.impl.C0513lf c0513lf) {
        org.json.JSONObject jSONObject;
        java.lang.String str = c0513lf.f6358a;
        java.lang.String str2 = c0513lf.f6359b;
        if (!android.text.TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new org.json.JSONObject(str2);
            } catch (java.lang.Throwable unused) {
            }
            return new io.appmetrica.analytics.impl.C0643qf(str, jSONObject, c0513lf.f6360c, c0513lf.f6361d, this.f6730a.toModel(java.lang.Integer.valueOf(c0513lf.f6362e)));
        }
        jSONObject = new org.json.JSONObject();
        return new io.appmetrica.analytics.impl.C0643qf(str, jSONObject, c0513lf.f6360c, c0513lf.f6361d, this.f6730a.toModel(java.lang.Integer.valueOf(c0513lf.f6362e)));
    }
}
