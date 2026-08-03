package com.ironsource;

/* renamed from: com.ironsource.y3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3376y3 {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.Boolean f6846a;
    private final java.lang.String b;
    private final java.lang.Integer c;

    public C3376y3() {
        this(null, null, null, 7, null);
    }

    public final java.lang.Boolean a() {
        return this.f6846a;
    }

    public final java.lang.String b() {
        return this.b;
    }

    public final java.lang.Integer c() {
        return this.c;
    }

    public final java.lang.Boolean d() {
        return this.f6846a;
    }

    public final java.lang.Integer e() {
        return this.c;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.ironsource.C3376y3)) {
            return false;
        }
        com.ironsource.C3376y3 c3376y3 = (com.ironsource.C3376y3) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f6846a, c3376y3.f6846a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, c3376y3.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, c3376y3.c);
    }

    public final java.lang.String f() {
        return this.b;
    }

    public int hashCode() {
        java.lang.Boolean bool = this.f6846a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        java.lang.String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.Integer num = this.c;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "CappingConfig2(enabled=" + this.f6846a + ", unit=" + this.b + ", maxImpressions=" + this.c + ")";
    }

    public C3376y3(java.lang.Boolean bool, java.lang.String str, java.lang.Integer num) {
        this.f6846a = bool;
        this.b = str;
        this.c = num;
    }

    public final com.ironsource.C3376y3 a(java.lang.Boolean bool, java.lang.String str, java.lang.Integer num) {
        return new com.ironsource.C3376y3(bool, str, num);
    }

    public static /* synthetic */ com.ironsource.C3376y3 a(com.ironsource.C3376y3 c3376y3, java.lang.Boolean bool, java.lang.String str, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bool = c3376y3.f6846a;
        }
        if ((i & 2) != 0) {
            str = c3376y3.b;
        }
        if ((i & 4) != 0) {
            num = c3376y3.c;
        }
        return c3376y3.a(bool, str, num);
    }

    public /* synthetic */ C3376y3(java.lang.Boolean bool, java.lang.String str, java.lang.Integer num, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num);
    }
}
