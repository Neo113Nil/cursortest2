package com.ironsource;

/* loaded from: classes5.dex */
public final class Xc {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.Boolean f6081a;
    private final java.lang.Integer b;

    /* JADX WARN: Multi-variable type inference failed */
    public Xc() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final java.lang.Boolean a() {
        return this.f6081a;
    }

    public final java.lang.Integer b() {
        return this.b;
    }

    public final java.lang.Boolean c() {
        return this.f6081a;
    }

    public final java.lang.Integer d() {
        return this.b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.ironsource.Xc)) {
            return false;
        }
        com.ironsource.Xc xc = (com.ironsource.Xc) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f6081a, xc.f6081a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, xc.b);
    }

    public int hashCode() {
        java.lang.Boolean bool = this.f6081a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        java.lang.Integer num = this.b;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "PacingConfig2(enabled=" + this.f6081a + ", minTimeBetweenShowsSeconds=" + this.b + ")";
    }

    public Xc(java.lang.Boolean bool, java.lang.Integer num) {
        this.f6081a = bool;
        this.b = num;
    }

    public final com.ironsource.Xc a(java.lang.Boolean bool, java.lang.Integer num) {
        return new com.ironsource.Xc(bool, num);
    }

    public /* synthetic */ Xc(java.lang.Boolean bool, java.lang.Integer num, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : num);
    }

    public static /* synthetic */ com.ironsource.Xc a(com.ironsource.Xc xc, java.lang.Boolean bool, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bool = xc.f6081a;
        }
        if ((i & 2) != 0) {
            num = xc.b;
        }
        return xc.a(bool, num);
    }
}
