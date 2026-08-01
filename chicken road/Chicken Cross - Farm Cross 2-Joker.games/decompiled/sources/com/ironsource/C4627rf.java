package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.rf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4627rf {

    /* renamed from: a, reason: collision with root package name */
    private final int f8511a;
    private final E3 b;

    public C4627rf(int i, E3 unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.f8511a = i;
        this.b = unit;
    }

    public final int a() {
        return this.f8511a;
    }

    public final E3 b() {
        return this.b;
    }

    public String toString() {
        return "ShowCountCappingConfig(maxImpressions=" + this.f8511a + ", unit=" + this.b + ")";
    }
}
