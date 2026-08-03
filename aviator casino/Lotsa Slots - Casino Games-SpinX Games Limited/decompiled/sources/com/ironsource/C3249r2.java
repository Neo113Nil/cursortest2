package com.ironsource;

/* renamed from: com.ironsource.r2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3249r2 {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f6579a;
    private final com.ironsource.mediationsdk.d b;

    public C3249r2(java.lang.String serverData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serverData, "serverData");
        this.f6579a = serverData;
        this.b = com.ironsource.mediationsdk.d.b();
    }

    private final java.lang.String c() {
        return this.f6579a;
    }

    public final com.ironsource.C3249r2 a(java.lang.String serverData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serverData, "serverData");
        return new com.ironsource.C3249r2(serverData);
    }

    public final java.util.Map<java.lang.String, java.lang.String> b() {
        java.util.Map<java.lang.String, java.lang.String> b = this.b.b(this.f6579a);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(b, "auctionDataUtils.getAuct…verDataParams(serverData)");
        return b;
    }

    public final java.lang.String d() {
        java.lang.String c = this.b.c(this.f6579a);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c, "auctionDataUtils.getDyna…romServerData(serverData)");
        return c;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.ironsource.C3249r2) && kotlin.jvm.internal.Intrinsics.areEqual(this.f6579a, ((com.ironsource.C3249r2) obj).f6579a);
    }

    public int hashCode() {
        return this.f6579a.hashCode();
    }

    public java.lang.String toString() {
        return "AuctionServerData(serverData=" + this.f6579a + ")";
    }

    public static /* synthetic */ com.ironsource.C3249r2 a(com.ironsource.C3249r2 c3249r2, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c3249r2.f6579a;
        }
        return c3249r2.a(str);
    }

    public final java.lang.String a() {
        java.lang.String a2 = this.b.a(this.f6579a);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "auctionDataUtils.getAdmFromServerData(serverData)");
        return a2;
    }
}
