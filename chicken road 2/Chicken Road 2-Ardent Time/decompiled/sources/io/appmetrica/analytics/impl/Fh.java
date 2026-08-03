package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public class Fh extends io.appmetrica.analytics.impl.H3 {

    /* renamed from: c, reason: collision with root package name */
    protected io.appmetrica.analytics.impl.D8 f4293c;

    /* renamed from: d, reason: collision with root package name */
    protected io.appmetrica.analytics.impl.C0746uf f4294d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4295e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f4296f;

    public Fh(io.appmetrica.analytics.impl.Bf bf, io.appmetrica.analytics.internal.CounterConfiguration counterConfiguration, io.appmetrica.analytics.impl.D8 d8) {
        this(bf, counterConfiguration, d8, null);
    }

    public final android.os.Bundle c() {
        android.os.Bundle bundle = new android.os.Bundle();
        this.f4368b.toBundle(bundle);
        io.appmetrica.analytics.impl.Bf bf = this.f4367a;
        synchronized (bf) {
            bundle.putParcelable("PROCESS_CFG_OBJ", bf);
        }
        return bundle;
    }

    public final synchronized java.lang.String d() {
        io.appmetrica.analytics.impl.D8 d8;
        d8 = this.f4293c;
        return d8.f4202a.isEmpty() ? null : new org.json.JSONObject(d8.f4202a).toString();
    }

    public final synchronized java.lang.String e() {
        return this.f4296f;
    }

    public boolean f() {
        return this.f4295e;
    }

    public Fh(io.appmetrica.analytics.impl.Bf bf, io.appmetrica.analytics.internal.CounterConfiguration counterConfiguration, io.appmetrica.analytics.impl.D8 d8, java.lang.String str) {
        super(bf, counterConfiguration);
        this.f4295e = true;
        this.f4296f = str;
        this.f4293c = d8;
    }
}
