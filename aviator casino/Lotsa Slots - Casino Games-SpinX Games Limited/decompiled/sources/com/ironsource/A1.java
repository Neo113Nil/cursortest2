package com.ironsource;

/* loaded from: classes5.dex */
public final class A1 {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f5606a;

    /* JADX WARN: Multi-variable type inference failed */
    public A1() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final java.lang.String a() {
        return this.f5606a;
    }

    public final java.lang.String b() {
        return this.f5606a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.ironsource.A1) && kotlin.jvm.internal.Intrinsics.areEqual(this.f5606a, ((com.ironsource.A1) obj).f5606a);
    }

    public int hashCode() {
        return this.f5606a.hashCode();
    }

    public java.lang.String toString() {
        return "ApplicationAuctionSettings(auctionData=" + this.f5606a + ")";
    }

    public A1(java.lang.String auctionData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        this.f5606a = auctionData;
    }

    public final com.ironsource.A1 a(java.lang.String auctionData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        return new com.ironsource.A1(auctionData);
    }

    public /* synthetic */ A1(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }

    public static /* synthetic */ com.ironsource.A1 a(com.ironsource.A1 a1, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = a1.f5606a;
        }
        return a1.a(str);
    }
}
