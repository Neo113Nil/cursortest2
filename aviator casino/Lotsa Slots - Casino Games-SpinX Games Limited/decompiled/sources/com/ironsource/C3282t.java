package com.ironsource;

/* renamed from: com.ironsource.t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3282t {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f6728a;
    private final com.ironsource.EnumC3203o9 b;
    private final boolean c;
    private final java.lang.String d;
    private final long e;

    public C3282t(java.lang.String adSourceNameForEvents, com.ironsource.EnumC3203o9 instanceType, boolean z, java.lang.String providerName, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSourceNameForEvents, "adSourceNameForEvents");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceType, "instanceType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerName, "providerName");
        this.f6728a = adSourceNameForEvents;
        this.b = instanceType;
        this.c = z;
        this.d = providerName;
        this.e = j;
    }

    public final java.lang.String a() {
        return this.f6728a;
    }

    public final com.ironsource.EnumC3203o9 b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final java.lang.String d() {
        return this.d;
    }

    public final long e() {
        return this.e;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.ironsource.C3282t)) {
            return false;
        }
        com.ironsource.C3282t c3282t = (com.ironsource.C3282t) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f6728a, c3282t.f6728a) && this.b == c3282t.b && this.c == c3282t.c && kotlin.jvm.internal.Intrinsics.areEqual(this.d, c3282t.d) && this.e == c3282t.e;
    }

    public final java.lang.String f() {
        return this.f6728a;
    }

    public final com.ironsource.EnumC3203o9 g() {
        return this.b;
    }

    public final long h() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f6728a.hashCode() * 31) + this.b.hashCode()) * 31;
        boolean z = this.c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((((hashCode + i) * 31) + this.d.hashCode()) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.e);
    }

    public final java.lang.String i() {
        return this.d;
    }

    public final boolean j() {
        return this.c;
    }

    public java.lang.String toString() {
        return "AdFormatConfig(adSourceNameForEvents=" + this.f6728a + ", instanceType=" + this.b + ", isOneFlow=" + this.c + ", providerName=" + this.d + ", loadTimeoutInMillis=" + this.e + ")";
    }

    public final com.ironsource.C3282t a(java.lang.String adSourceNameForEvents, com.ironsource.EnumC3203o9 instanceType, boolean z, java.lang.String providerName, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSourceNameForEvents, "adSourceNameForEvents");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceType, "instanceType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerName, "providerName");
        return new com.ironsource.C3282t(adSourceNameForEvents, instanceType, z, providerName, j);
    }

    public static /* synthetic */ com.ironsource.C3282t a(com.ironsource.C3282t c3282t, java.lang.String str, com.ironsource.EnumC3203o9 enumC3203o9, boolean z, java.lang.String str2, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c3282t.f6728a;
        }
        if ((i & 2) != 0) {
            enumC3203o9 = c3282t.b;
        }
        com.ironsource.EnumC3203o9 enumC3203o92 = enumC3203o9;
        if ((i & 4) != 0) {
            z = c3282t.c;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            str2 = c3282t.d;
        }
        java.lang.String str3 = str2;
        if ((i & 16) != 0) {
            j = c3282t.e;
        }
        return c3282t.a(str, enumC3203o92, z2, str3, j);
    }
}
