package com.ironsource;

/* loaded from: classes5.dex */
public final class Bb {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.EnumC3203o9 f5634a;
    private final java.lang.String b;
    private final long c;
    private final boolean d;
    private final boolean e;

    public Bb(com.ironsource.EnumC3203o9 instanceType, java.lang.String adSourceNameForEvents, long j, boolean z, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceType, "instanceType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSourceNameForEvents, "adSourceNameForEvents");
        this.f5634a = instanceType;
        this.b = adSourceNameForEvents;
        this.c = j;
        this.d = z;
        this.e = z2;
    }

    public final com.ironsource.EnumC3203o9 a() {
        return this.f5634a;
    }

    public final java.lang.String b() {
        return this.b;
    }

    public final long c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.ironsource.Bb)) {
            return false;
        }
        com.ironsource.Bb bb = (com.ironsource.Bb) obj;
        return this.f5634a == bb.f5634a && kotlin.jvm.internal.Intrinsics.areEqual(this.b, bb.b) && this.c == bb.c && this.d == bb.d && this.e == bb.e;
    }

    public final java.lang.String f() {
        return this.b;
    }

    public final com.ironsource.EnumC3203o9 g() {
        return this.f5634a;
    }

    public final long h() {
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f5634a.hashCode() * 31) + this.b.hashCode()) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.c)) * 31;
        boolean z = this.d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.e;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final boolean i() {
        return this.e;
    }

    public final boolean j() {
        return this.d;
    }

    public java.lang.String toString() {
        return "LoadTaskConfig(instanceType=" + this.f5634a + ", adSourceNameForEvents=" + this.b + ", loadTimeoutInMills=" + this.c + ", isOneFlow=" + this.d + ", isMultipleAdObjects=" + this.e + ")";
    }

    public final com.ironsource.Bb a(com.ironsource.EnumC3203o9 instanceType, java.lang.String adSourceNameForEvents, long j, boolean z, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceType, "instanceType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSourceNameForEvents, "adSourceNameForEvents");
        return new com.ironsource.Bb(instanceType, adSourceNameForEvents, j, z, z2);
    }

    public static /* synthetic */ com.ironsource.Bb a(com.ironsource.Bb bb, com.ironsource.EnumC3203o9 enumC3203o9, java.lang.String str, long j, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            enumC3203o9 = bb.f5634a;
        }
        if ((i & 2) != 0) {
            str = bb.b;
        }
        java.lang.String str2 = str;
        if ((i & 4) != 0) {
            j = bb.c;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            z = bb.d;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = bb.e;
        }
        return bb.a(enumC3203o9, str2, j2, z3, z2);
    }

    public /* synthetic */ Bb(com.ironsource.EnumC3203o9 enumC3203o9, java.lang.String str, long j, boolean z, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC3203o9, str, j, z, (i & 16) != 0 ? true : z2);
    }
}
