package com.paypal.oslo.feature.ads.data.models.ol;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ@\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/ol/OLAdMetadata;", "", "", "advertiserId", "campaignId", "creativeId", "flightId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/ads/data/models/ol/OLAdMetadata;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAdvertiserId", "getCampaignId", "getCreativeId", "getFlightId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class OLAdMetadata {
    public static final int $stable = 0;
    private final java.lang.String advertiserId;
    private final java.lang.String campaignId;
    private final java.lang.String creativeId;
    private final java.lang.String flightId;

    public OLAdMetadata(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.advertiserId = str;
        this.campaignId = str2;
        this.creativeId = str3;
        this.flightId = str4;
    }

    public /* synthetic */ OLAdMetadata(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    public final java.lang.String getAdvertiserId() {
        return this.advertiserId;
    }

    public final java.lang.String getCampaignId() {
        return this.campaignId;
    }

    public final java.lang.String getCreativeId() {
        return this.creativeId;
    }

    public final java.lang.String getFlightId() {
        return this.flightId;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.advertiserId;
        java.lang.String str2 = this.campaignId;
        java.lang.String str3 = this.creativeId;
        java.lang.String str4 = this.flightId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OLAdMetadata(advertiserId=");
        sb.append(str);
        sb.append(", campaignId=");
        sb.append(str2);
        sb.append(", creativeId=");
        sb.append(str3);
        sb.append(", flightId=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.advertiserId;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.campaignId;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.creativeId;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.flightId;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.ads.data.models.ol.OLAdMetadata)) {
            return false;
        }
        com.paypal.oslo.feature.ads.data.models.ol.OLAdMetadata oLAdMetadata = (com.paypal.oslo.feature.ads.data.models.ol.OLAdMetadata) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.advertiserId, oLAdMetadata.advertiserId) && kotlin.jvm.internal.Intrinsics.areEqual(this.campaignId, oLAdMetadata.campaignId) && kotlin.jvm.internal.Intrinsics.areEqual(this.creativeId, oLAdMetadata.creativeId) && kotlin.jvm.internal.Intrinsics.areEqual(this.flightId, oLAdMetadata.flightId);
    }

    public final com.paypal.oslo.feature.ads.data.models.ol.OLAdMetadata copy(java.lang.String advertiserId, java.lang.String campaignId, java.lang.String creativeId, java.lang.String flightId) {
        return new com.paypal.oslo.feature.ads.data.models.ol.OLAdMetadata(advertiserId, campaignId, creativeId, flightId);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getFlightId() {
        return this.flightId;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCreativeId() {
        return this.creativeId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCampaignId() {
        return this.campaignId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAdvertiserId() {
        return this.advertiserId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.ads.data.models.ol.OLAdMetadata copy$default(com.paypal.oslo.feature.ads.data.models.ol.OLAdMetadata oLAdMetadata, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = oLAdMetadata.advertiserId;
        }
        if ((i & 2) != 0) {
            str2 = oLAdMetadata.campaignId;
        }
        if ((i & 4) != 0) {
            str3 = oLAdMetadata.creativeId;
        }
        if ((i & 8) != 0) {
            str4 = oLAdMetadata.flightId;
        }
        return oLAdMetadata.copy(str, str2, str3, str4);
    }

    public OLAdMetadata() {
        this(null, null, null, null, 15, null);
    }
}
