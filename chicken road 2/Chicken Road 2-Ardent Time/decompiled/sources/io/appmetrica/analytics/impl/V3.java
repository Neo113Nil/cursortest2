package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class V3 extends io.appmetrica.analytics.impl.Jc {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Ve f5116a;

    public V3(android.content.Context context) {
        this(new io.appmetrica.analytics.impl.Ve(io.appmetrica.analytics.impl.C0244b4.l().c(context).b(context)));
    }

    @Override // io.appmetrica.analytics.impl.Jc
    public final void a(int i2) {
        this.f5116a.c(i2);
    }

    @Override // io.appmetrica.analytics.impl.Jc
    public final int b() {
        return (int) this.f5116a.a(-1L);
    }

    @Override // io.appmetrica.analytics.impl.Jc
    public final android.util.SparseArray<io.appmetrica.analytics.impl.Ic> c() {
        return new android.util.SparseArray<>();
    }

    public V3(io.appmetrica.analytics.impl.Ve ve) {
        this.f5116a = ve;
    }
}
