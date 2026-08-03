package com.ironsource;

/* renamed from: com.ironsource.n2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3178n2 {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f6475a;
    private final org.json.JSONObject b;
    private final com.ironsource.C3232q2 c;
    private final int d;
    private final java.lang.String e;

    public C3178n2(java.lang.String auctionId, org.json.JSONObject jSONObject, com.ironsource.C3232q2 c3232q2, int i, java.lang.String auctionFallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionFallback, "auctionFallback");
        this.f6475a = auctionId;
        this.b = jSONObject;
        this.c = c3232q2;
        this.d = i;
        this.e = auctionFallback;
    }

    public final java.lang.String a() {
        return this.f6475a;
    }

    public final org.json.JSONObject b() {
        return this.b;
    }

    public final com.ironsource.C3232q2 c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final java.lang.String e() {
        return this.e;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.ironsource.C3178n2)) {
            return false;
        }
        com.ironsource.C3178n2 c3178n2 = (com.ironsource.C3178n2) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f6475a, c3178n2.f6475a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, c3178n2.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, c3178n2.c) && this.d == c3178n2.d && kotlin.jvm.internal.Intrinsics.areEqual(this.e, c3178n2.e);
    }

    public final java.lang.String f() {
        return this.e;
    }

    public final java.lang.String g() {
        return this.f6475a;
    }

    public final org.json.JSONObject h() {
        return this.b;
    }

    public int hashCode() {
        int hashCode = this.f6475a.hashCode() * 31;
        org.json.JSONObject jSONObject = this.b;
        int hashCode2 = (hashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        com.ironsource.C3232q2 c3232q2 = this.c;
        return ((((hashCode2 + (c3232q2 != null ? c3232q2.hashCode() : 0)) * 31) + this.d) * 31) + this.e.hashCode();
    }

    public final int i() {
        return this.d;
    }

    public final com.ironsource.C3232q2 j() {
        return this.c;
    }

    public java.lang.String toString() {
        return "AuctionResponseData(auctionId=" + this.f6475a + ", auctionResponseGenericParam=" + this.b + ", genericNotifications=" + this.c + ", auctionTrial=" + this.d + ", auctionFallback=" + this.e + ")";
    }

    public final com.ironsource.C3178n2 a(java.lang.String auctionId, org.json.JSONObject jSONObject, com.ironsource.C3232q2 c3232q2, int i, java.lang.String auctionFallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionFallback, "auctionFallback");
        return new com.ironsource.C3178n2(auctionId, jSONObject, c3232q2, i, auctionFallback);
    }

    public static /* synthetic */ com.ironsource.C3178n2 a(com.ironsource.C3178n2 c3178n2, java.lang.String str, org.json.JSONObject jSONObject, com.ironsource.C3232q2 c3232q2, int i, java.lang.String str2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = c3178n2.f6475a;
        }
        if ((i2 & 2) != 0) {
            jSONObject = c3178n2.b;
        }
        org.json.JSONObject jSONObject2 = jSONObject;
        if ((i2 & 4) != 0) {
            c3232q2 = c3178n2.c;
        }
        com.ironsource.C3232q2 c3232q22 = c3232q2;
        if ((i2 & 8) != 0) {
            i = c3178n2.d;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str2 = c3178n2.e;
        }
        return c3178n2.a(str, jSONObject2, c3232q22, i3, str2);
    }
}
