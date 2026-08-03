package com.ironsource;

/* renamed from: com.ironsource.tf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3298tf {

    /* renamed from: a, reason: collision with root package name */
    private final int f6742a;
    private final com.ironsource.H3 b;

    public C3298tf(int i, com.ironsource.H3 unit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "unit");
        this.f6742a = i;
        this.b = unit;
    }

    public final int a() {
        return this.f6742a;
    }

    public final com.ironsource.H3 b() {
        return this.b;
    }

    public java.lang.String toString() {
        return "ShowCountCappingConfig(maxImpressions=" + this.f6742a + ", unit=" + this.b + ")";
    }
}
