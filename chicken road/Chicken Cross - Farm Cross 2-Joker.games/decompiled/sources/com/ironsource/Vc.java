package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Vc {

    /* renamed from: a, reason: collision with root package name */
    private final long f7972a;
    private final E3 b;

    public Vc(long j, E3 unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.f7972a = j;
        this.b = unit;
    }

    public final long a() {
        return this.f7972a;
    }

    public final E3 b() {
        return this.b;
    }

    public String toString() {
        return "PacingCappingConfig(timeInterval=" + this.f7972a + " unit=" + this.b + ")";
    }

    public /* synthetic */ Vc(long j, E3 e3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? E3.Second : e3);
    }
}
