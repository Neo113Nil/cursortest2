package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.nk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0570nk extends io.appmetrica.analytics.impl.Jc {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0807wo f6539a;

    public C0570nk() {
        this(io.appmetrica.analytics.impl.C0560na.k().D().b());
    }

    @Override // io.appmetrica.analytics.impl.Jc
    public final void a(int i2) {
        io.appmetrica.analytics.impl.C0807wo c0807wo = this.f6539a;
        synchronized (c0807wo) {
            io.appmetrica.analytics.impl.C0859yo c0859yo = c0807wo.f7070a;
            c0859yo.a(c0859yo.a().put("last_migration_api_level", i2));
        }
    }

    @Override // io.appmetrica.analytics.impl.Jc
    public final int b() {
        int optInt;
        io.appmetrica.analytics.impl.C0807wo c0807wo = this.f6539a;
        synchronized (c0807wo) {
            optInt = c0807wo.f7070a.a().optInt("last_migration_api_level", -1);
        }
        return optInt;
    }

    @Override // io.appmetrica.analytics.impl.Jc
    public final android.util.SparseArray<io.appmetrica.analytics.impl.Ic> c() {
        android.util.SparseArray<io.appmetrica.analytics.impl.Ic> sparseArray = new android.util.SparseArray<>(1);
        sparseArray.put(112, new io.appmetrica.analytics.impl.C0596ok(this.f6539a));
        sparseArray.put(115, new io.appmetrica.analytics.impl.C0622pk());
        sparseArray.put(io.appmetrica.analytics.BuildConfig.API_LEVEL, new io.appmetrica.analytics.impl.C0699sk());
        return sparseArray;
    }

    public C0570nk(io.appmetrica.analytics.impl.C0807wo c0807wo) {
        this.f6539a = c0807wo;
    }
}
