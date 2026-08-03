package com.moloco.sdk.publisher;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J:\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÇ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001a\u001a\u00020\u001bH×\u0001J\t\u0010\u001c\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/moloco/sdk/publisher/MolocoAd;", "", "networkName", "", "adUnitId", "revenue", "", "creativeId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;)V", "getNetworkName", "()Ljava/lang/String;", "getAdUnitId", "getRevenue", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getCreativeId", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;)Lcom/moloco/sdk/publisher/MolocoAd;", "equals", "", "other", "hashCode", "", "toString", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MolocoAd {
    public static final int $stable = 0;
    private final java.lang.String adUnitId;
    private final java.lang.String creativeId;
    private final java.lang.String networkName;
    private final java.lang.Float revenue;

    public MolocoAd(java.lang.String networkName, java.lang.String adUnitId, java.lang.Float f, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkName, "networkName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        this.networkName = networkName;
        this.adUnitId = adUnitId;
        this.revenue = f;
        this.creativeId = str;
    }

    public static /* synthetic */ com.moloco.sdk.publisher.MolocoAd copy$default(com.moloco.sdk.publisher.MolocoAd molocoAd, java.lang.String str, java.lang.String str2, java.lang.Float f, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = molocoAd.networkName;
        }
        if ((i & 2) != 0) {
            str2 = molocoAd.adUnitId;
        }
        if ((i & 4) != 0) {
            f = molocoAd.revenue;
        }
        if ((i & 8) != 0) {
            str3 = molocoAd.creativeId;
        }
        return molocoAd.copy(str, str2, f, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getNetworkName() {
        return this.networkName;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getAdUnitId() {
        return this.adUnitId;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Float getRevenue() {
        return this.revenue;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getCreativeId() {
        return this.creativeId;
    }

    public final com.moloco.sdk.publisher.MolocoAd copy(java.lang.String networkName, java.lang.String adUnitId, java.lang.Float revenue, java.lang.String creativeId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkName, "networkName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        return new com.moloco.sdk.publisher.MolocoAd(networkName, adUnitId, revenue, creativeId);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.moloco.sdk.publisher.MolocoAd)) {
            return false;
        }
        com.moloco.sdk.publisher.MolocoAd molocoAd = (com.moloco.sdk.publisher.MolocoAd) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.networkName, molocoAd.networkName) && kotlin.jvm.internal.Intrinsics.areEqual(this.adUnitId, molocoAd.adUnitId) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) this.revenue, (java.lang.Object) molocoAd.revenue) && kotlin.jvm.internal.Intrinsics.areEqual(this.creativeId, molocoAd.creativeId);
    }

    public final java.lang.String getAdUnitId() {
        return this.adUnitId;
    }

    public final java.lang.String getCreativeId() {
        return this.creativeId;
    }

    public final java.lang.String getNetworkName() {
        return this.networkName;
    }

    public final java.lang.Float getRevenue() {
        return this.revenue;
    }

    public int hashCode() {
        int hashCode = ((this.networkName.hashCode() * 31) + this.adUnitId.hashCode()) * 31;
        java.lang.Float f = this.revenue;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        java.lang.String str = this.creativeId;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "MolocoAd(networkName=" + this.networkName + ", adUnitId=" + this.adUnitId + ", revenue=" + this.revenue + ", creativeId=" + this.creativeId + ')';
    }

    public /* synthetic */ MolocoAd(java.lang.String str, java.lang.String str2, java.lang.Float f, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : f, (i & 8) != 0 ? null : str3);
    }
}
