package io.appmetrica.analytics.impl;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class O4 implements InterfaceC0610e7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f7207a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7208b;

    public O4(X4 x42) {
        this.f7207a = String.format("component_%s.db", Arrays.copyOf(new Object[]{x42.d() ? "main" : x42.b()}, 1));
        this.f7208b = "db_metrica_" + x42;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0610e7
    public final String a() {
        return this.f7208b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0610e7
    public final String b() {
        return this.f7207a;
    }
}
