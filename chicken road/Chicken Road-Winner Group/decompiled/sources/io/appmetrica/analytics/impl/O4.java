package io.appmetrica.analytics.impl;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class O4 implements InterfaceC0461e7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f6348a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6349b;

    public O4(X4 x4) {
        this.f6348a = String.format("component_%s.db", Arrays.copyOf(new Object[]{x4.d() ? "main" : x4.b()}, 1));
        this.f6349b = "db_metrica_" + x4;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0461e7
    public final String a() {
        return this.f6349b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0461e7
    public final String b() {
        return this.f6348a;
    }
}
