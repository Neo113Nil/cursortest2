package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Ao {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f4074a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedHashMap f4075b = new java.util.LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0807wo f4076c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0807wo f4077d;

    public Ao(android.content.Context context) {
        this.f4074a = context;
        io.appmetrica.analytics.impl.C0250ba c0250ba = new io.appmetrica.analytics.impl.C0250ba(context, "appmetrica_vital.dat");
        this.f4076c = new io.appmetrica.analytics.impl.C0807wo(io.appmetrica.analytics.impl.C0560na.k().y(), c0250ba);
        this.f4077d = new io.appmetrica.analytics.impl.C0807wo(new io.appmetrica.analytics.impl.Ze(io.appmetrica.analytics.impl.C0560na.k().B().e(context)), c0250ba);
    }

    public final io.appmetrica.analytics.impl.C0807wo a() {
        return this.f4076c;
    }

    public final io.appmetrica.analytics.impl.C0807wo b() {
        return this.f4077d;
    }
}
