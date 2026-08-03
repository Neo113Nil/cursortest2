package com.ironsource;

/* renamed from: com.ironsource.md, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3171md {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.Integer f6390a;
    private final java.lang.String b;
    private final java.lang.Boolean c;
    private final java.lang.String d;
    private final java.lang.Integer e;
    private final java.lang.Boolean f;
    private final com.ironsource.C3376y3 g;
    private final com.ironsource.Xc h;

    public C3171md() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public final java.lang.Integer a() {
        return this.f6390a;
    }

    public final java.lang.String b() {
        return this.b;
    }

    public final java.lang.Boolean c() {
        return this.c;
    }

    public final java.lang.String d() {
        return this.d;
    }

    public final java.lang.Integer e() {
        return this.e;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.ironsource.C3171md)) {
            return false;
        }
        com.ironsource.C3171md c3171md = (com.ironsource.C3171md) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f6390a, c3171md.f6390a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, c3171md.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, c3171md.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, c3171md.d) && kotlin.jvm.internal.Intrinsics.areEqual(this.e, c3171md.e) && kotlin.jvm.internal.Intrinsics.areEqual(this.f, c3171md.f) && kotlin.jvm.internal.Intrinsics.areEqual(this.g, c3171md.g) && kotlin.jvm.internal.Intrinsics.areEqual(this.h, c3171md.h);
    }

    public final java.lang.Boolean f() {
        return this.f;
    }

    public final com.ironsource.C3376y3 g() {
        return this.g;
    }

    public final com.ironsource.Xc h() {
        return this.h;
    }

    public int hashCode() {
        java.lang.Integer num = this.f6390a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        java.lang.String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.Boolean bool = this.c;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        java.lang.String str2 = this.d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.Integer num2 = this.e;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        java.lang.Boolean bool2 = this.f;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        com.ironsource.C3376y3 c3376y3 = this.g;
        int hashCode7 = (hashCode6 + (c3376y3 == null ? 0 : c3376y3.hashCode())) * 31;
        com.ironsource.Xc xc = this.h;
        return hashCode7 + (xc != null ? xc.hashCode() : 0);
    }

    public final com.ironsource.C3376y3 i() {
        return this.g;
    }

    public final java.lang.Boolean j() {
        return this.f;
    }

    public final com.ironsource.Xc k() {
        return this.h;
    }

    public final java.lang.Integer l() {
        return this.f6390a;
    }

    public final java.lang.String m() {
        return this.b;
    }

    public final java.lang.Integer n() {
        return this.e;
    }

    public final java.lang.String o() {
        return this.d;
    }

    public final java.lang.Boolean p() {
        return this.c;
    }

    public java.lang.String toString() {
        return "PlacementConfig2(placementId=" + this.f6390a + ", placementName=" + this.b + ", isDefault=" + this.c + ", virtualItemName=" + this.d + ", virtualItemCount=" + this.e + ", delivery=" + this.f + ", capping=" + this.g + ", pacing=" + this.h + ")";
    }

    public C3171md(java.lang.Integer num, java.lang.String str, java.lang.Boolean bool, java.lang.String str2, java.lang.Integer num2, java.lang.Boolean bool2, com.ironsource.C3376y3 c3376y3, com.ironsource.Xc xc) {
        this.f6390a = num;
        this.b = str;
        this.c = bool;
        this.d = str2;
        this.e = num2;
        this.f = bool2;
        this.g = c3376y3;
        this.h = xc;
    }

    public final com.ironsource.C3171md a(java.lang.Integer num, java.lang.String str, java.lang.Boolean bool, java.lang.String str2, java.lang.Integer num2, java.lang.Boolean bool2, com.ironsource.C3376y3 c3376y3, com.ironsource.Xc xc) {
        return new com.ironsource.C3171md(num, str, bool, str2, num2, bool2, c3376y3, xc);
    }

    public /* synthetic */ C3171md(java.lang.Integer num, java.lang.String str, java.lang.Boolean bool, java.lang.String str2, java.lang.Integer num2, java.lang.Boolean bool2, com.ironsource.C3376y3 c3376y3, com.ironsource.Xc xc, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : bool2, (i & 64) != 0 ? null : c3376y3, (i & 128) == 0 ? xc : null);
    }
}
