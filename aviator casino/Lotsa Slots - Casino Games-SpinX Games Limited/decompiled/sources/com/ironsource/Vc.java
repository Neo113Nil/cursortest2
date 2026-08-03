package com.ironsource;

/* loaded from: classes5.dex */
public final class Vc {

    /* renamed from: a, reason: collision with root package name */
    private final long f6026a;
    private final com.ironsource.H3 b;

    public Vc(long j, com.ironsource.H3 unit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "unit");
        this.f6026a = j;
        this.b = unit;
    }

    public final long a() {
        return this.f6026a;
    }

    public final com.ironsource.H3 b() {
        return this.b;
    }

    public java.lang.String toString() {
        return "PacingCappingConfig(timeInterval=" + this.f6026a + " unit=" + this.b + ")";
    }

    public /* synthetic */ Vc(long j, com.ironsource.H3 h3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? com.ironsource.H3.Second : h3);
    }
}
