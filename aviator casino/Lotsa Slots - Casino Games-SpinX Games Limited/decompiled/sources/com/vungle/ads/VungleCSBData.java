package com.vungle.ads;

/* compiled from: VungleCSBData.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001eBO\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u001a\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\tH\u0016R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0017R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, d2 = {"Lcom/vungle/ads/VungleCSBData;", "Ljava/io/Serializable;", "bidFloor", "", "auctionId", "", "creativeId", "adUnitId", "phase", "", "isVXWinner", "", "extras", "", "(DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/util/Map;)V", "getAdUnitId", "()Ljava/lang/String;", "getAuctionId", "getBidFloor", "()D", "getCreativeId", "getExtras", "()Ljava/util/Map;", "()Z", "getPhase", "()I", "equals", "other", "", "hashCode", "Builder", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class VungleCSBData implements java.io.Serializable {
    private final java.lang.String adUnitId;
    private final java.lang.String auctionId;
    private final double bidFloor;
    private final java.lang.String creativeId;
    private final java.util.Map<java.lang.String, java.lang.String> extras;
    private final boolean isVXWinner;
    private final int phase;

    public /* synthetic */ VungleCSBData(double d, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, boolean z, java.util.Map map, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(d, str, str2, str3, i, z, map);
    }

    private VungleCSBData(double d, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, boolean z, java.util.Map<java.lang.String, java.lang.String> map) {
        this.bidFloor = d;
        this.auctionId = str;
        this.creativeId = str2;
        this.adUnitId = str3;
        this.phase = i;
        this.isVXWinner = z;
        this.extras = map;
    }

    /* synthetic */ VungleCSBData(double d, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, boolean z, java.util.Map map, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(d, str, str2, str3, i, z, (i2 & 64) != 0 ? null : map);
    }

    public final double getBidFloor() {
        return this.bidFloor;
    }

    public final java.lang.String getAuctionId() {
        return this.auctionId;
    }

    public final java.lang.String getCreativeId() {
        return this.creativeId;
    }

    public final java.lang.String getAdUnitId() {
        return this.adUnitId;
    }

    public final int getPhase() {
        return this.phase;
    }

    /* renamed from: isVXWinner, reason: from getter */
    public final boolean getIsVXWinner() {
        return this.isVXWinner;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getExtras() {
        return this.extras;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.vungle.ads.VungleCSBData)) {
            return false;
        }
        com.vungle.ads.VungleCSBData vungleCSBData = (com.vungle.ads.VungleCSBData) other;
        return java.lang.Double.compare(this.bidFloor, vungleCSBData.bidFloor) == 0 && kotlin.jvm.internal.Intrinsics.areEqual(this.auctionId, vungleCSBData.auctionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.creativeId, vungleCSBData.creativeId) && kotlin.jvm.internal.Intrinsics.areEqual(this.adUnitId, vungleCSBData.adUnitId) && this.phase == vungleCSBData.phase && this.isVXWinner == vungleCSBData.isVXWinner && kotlin.jvm.internal.Intrinsics.areEqual(this.extras, vungleCSBData.extras);
    }

    public int hashCode() {
        int m = ((((((((((androidx.compose.animation.core.ComplexDouble$$ExternalSyntheticBackport0.m(this.bidFloor) * 31) + this.auctionId.hashCode()) * 31) + this.creativeId.hashCode()) * 31) + this.adUnitId.hashCode()) * 31) + this.phase) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.isVXWinner)) * 31;
        java.util.Map<java.lang.String, java.lang.String> map = this.extras;
        return m + (map != null ? map.hashCode() : 0);
    }

    /* compiled from: VungleCSBData.kt */
    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fJ\u001c\u0010\u0010\u001a\u00020\u00002\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/vungle/ads/VungleCSBData$Builder;", "", "bidFloor", "", "(D)V", "adUnitId", "", "auctionId", "creativeId", "extras", "", "isPriorityAccess", "", "isVXWinner", "build", "Lcom/vungle/ads/VungleCSBData;", "putExtras", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder {
        private java.lang.String adUnitId;
        private java.lang.String auctionId;
        private final double bidFloor;
        private java.lang.String creativeId;
        private java.util.Map<java.lang.String, java.lang.String> extras;
        private boolean isPriorityAccess;
        private boolean isVXWinner;

        public Builder(double d) {
            this.bidFloor = d;
        }

        public final com.vungle.ads.VungleCSBData.Builder auctionId(java.lang.String auctionId) {
            this.auctionId = auctionId;
            return this;
        }

        public final com.vungle.ads.VungleCSBData.Builder creativeId(java.lang.String creativeId) {
            this.creativeId = creativeId;
            return this;
        }

        public final com.vungle.ads.VungleCSBData.Builder adUnitId(java.lang.String adUnitId) {
            this.adUnitId = adUnitId;
            return this;
        }

        public final com.vungle.ads.VungleCSBData.Builder isPriorityAccess(boolean isPriorityAccess) {
            this.isPriorityAccess = isPriorityAccess;
            return this;
        }

        public final com.vungle.ads.VungleCSBData.Builder isVXWinner(boolean isVXWinner) {
            this.isVXWinner = isVXWinner;
            return this;
        }

        public final com.vungle.ads.VungleCSBData.Builder putExtras(java.util.Map<java.lang.String, java.lang.String> extras) {
            this.extras = extras;
            return this;
        }

        public final com.vungle.ads.VungleCSBData build() {
            double d = this.bidFloor;
            java.lang.String str = this.auctionId;
            java.lang.String str2 = str == null ? "" : str;
            java.lang.String str3 = this.creativeId;
            java.lang.String str4 = str3 == null ? "" : str3;
            java.lang.String str5 = this.adUnitId;
            return new com.vungle.ads.VungleCSBData(d, str2, str4, str5 == null ? "" : str5, this.isPriorityAccess ? 2 : 1, this.isVXWinner, this.extras, null);
        }
    }
}
