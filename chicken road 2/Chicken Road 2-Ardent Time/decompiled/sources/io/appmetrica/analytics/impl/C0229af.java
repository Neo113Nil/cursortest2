package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.af, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0229af implements io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0617pf f5475a;

    public C0229af() {
        this(new io.appmetrica.analytics.impl.C0617pf());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0539mf fromModel(io.appmetrica.analytics.impl.C0281cf c0281cf) {
        io.appmetrica.analytics.impl.C0539mf c0539mf = new io.appmetrica.analytics.impl.C0539mf();
        if (!android.text.TextUtils.isEmpty(c0281cf.f5656a)) {
            c0539mf.f6425a = c0281cf.f5656a;
        }
        c0539mf.f6426b = c0281cf.f5657b.toString();
        c0539mf.f6427c = this.f5475a.fromModel(c0281cf.f5658c).intValue();
        return c0539mf;
    }

    public C0229af(io.appmetrica.analytics.impl.C0617pf c0617pf) {
        this.f5475a = c0617pf;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0281cf toModel(io.appmetrica.analytics.impl.C0539mf c0539mf) {
        org.json.JSONObject jSONObject;
        java.lang.String str = c0539mf.f6425a;
        java.lang.String str2 = c0539mf.f6426b;
        if (!android.text.TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new org.json.JSONObject(str2);
            } catch (java.lang.Throwable unused) {
            }
            return new io.appmetrica.analytics.impl.C0281cf(str, jSONObject, this.f5475a.toModel(java.lang.Integer.valueOf(c0539mf.f6427c)));
        }
        jSONObject = new org.json.JSONObject();
        return new io.appmetrica.analytics.impl.C0281cf(str, jSONObject, this.f5475a.toModel(java.lang.Integer.valueOf(c0539mf.f6427c)));
    }
}
