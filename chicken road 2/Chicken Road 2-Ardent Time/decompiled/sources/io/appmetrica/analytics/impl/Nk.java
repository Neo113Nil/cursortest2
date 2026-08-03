package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Nk {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f4739a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Ik f4740b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Mk f4741c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper f4742d;

    public Nk(android.content.Context context, io.appmetrica.analytics.impl.Q4 q4) {
        q4.a();
        this.f4739a = "session_extras";
        this.f4740b = new io.appmetrica.analytics.impl.Ik();
        this.f4741c = new io.appmetrica.analytics.impl.Mk();
        this.f4742d = io.appmetrica.analytics.impl.C0560na.k().B().a(context, q4);
    }

    public final java.util.Map a() {
        try {
            byte[] bArr = this.f4742d.get(this.f4739a);
            if (bArr != null) {
                if (!(bArr.length == 0)) {
                    return this.f4740b.toModel(this.f4741c.toState(bArr));
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        io.appmetrica.analytics.impl.Ik ik = this.f4740b;
        this.f4741c.getClass();
        return ik.toModel(new io.appmetrica.analytics.impl.Kk());
    }
}
