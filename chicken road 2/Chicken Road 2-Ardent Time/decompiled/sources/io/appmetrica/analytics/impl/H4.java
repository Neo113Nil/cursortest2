package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class H4 implements io.appmetrica.analytics.impl.X6 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f4369a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f4370b;

    public H4(io.appmetrica.analytics.impl.Q4 q4) {
        this.f4369a = java.lang.String.format("component_%s.db", java.util.Arrays.copyOf(new java.lang.Object[]{q4.d() ? "main" : q4.b()}, 1));
        this.f4370b = "db_metrica_" + q4;
    }

    @Override // io.appmetrica.analytics.impl.X6
    public final java.lang.String a() {
        return this.f4370b;
    }

    @Override // io.appmetrica.analytics.impl.X6
    public final java.lang.String b() {
        return this.f4369a;
    }
}
