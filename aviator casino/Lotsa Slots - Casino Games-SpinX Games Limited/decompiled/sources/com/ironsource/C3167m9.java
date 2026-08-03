package com.ironsource;

/* renamed from: com.ironsource.m9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3167m9 {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f6387a;
    private final int b;
    private final java.lang.String c;

    public C3167m9() {
        this(null, 0, null, 7, null);
    }

    public final java.lang.String a() {
        return this.f6387a;
    }

    public final int b() {
        return this.b;
    }

    public final java.lang.String c() {
        return this.c;
    }

    public final java.lang.String d() {
        return this.c;
    }

    public final java.lang.String e() {
        return this.f6387a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.ironsource.C3167m9)) {
            return false;
        }
        com.ironsource.C3167m9 c3167m9 = (com.ironsource.C3167m9) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f6387a, c3167m9.f6387a) && this.b == c3167m9.b && kotlin.jvm.internal.Intrinsics.areEqual(this.c, c3167m9.c);
    }

    public final int f() {
        return this.b;
    }

    public int hashCode() {
        int hashCode = ((this.f6387a.hashCode() * 31) + this.b) * 31;
        java.lang.String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "InstanceInformation(instanceId=" + this.f6387a + ", instanceType=" + this.b + ", dynamicDemandSourceId=" + this.c + ")";
    }

    public C3167m9(java.lang.String instanceId, int i, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        this.f6387a = instanceId;
        this.b = i;
        this.c = str;
    }

    public final com.ironsource.C3167m9 a(java.lang.String instanceId, int i, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        return new com.ironsource.C3167m9(instanceId, i, str);
    }

    public static /* synthetic */ com.ironsource.C3167m9 a(com.ironsource.C3167m9 c3167m9, java.lang.String str, int i, java.lang.String str2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = c3167m9.f6387a;
        }
        if ((i2 & 2) != 0) {
            i = c3167m9.b;
        }
        if ((i2 & 4) != 0) {
            str2 = c3167m9.c;
        }
        return c3167m9.a(str, i, str2);
    }

    public /* synthetic */ C3167m9(java.lang.String str, int i, java.lang.String str2, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : str2);
    }
}
