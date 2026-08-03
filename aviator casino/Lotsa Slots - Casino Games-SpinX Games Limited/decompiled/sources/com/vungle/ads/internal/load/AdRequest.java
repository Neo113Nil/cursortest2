package com.vungle.ads.internal.load;

/* compiled from: AdRequest.kt */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001b"}, d2 = {"Lcom/vungle/ads/internal/load/AdRequest;", "Ljava/io/Serializable;", "placement", "Lcom/vungle/ads/internal/model/Placement;", "adMarkup", "Lcom/vungle/ads/internal/model/BidPayload;", "requestAdSize", "Lcom/vungle/ads/VungleAdSize;", "csbData", "Lcom/vungle/ads/VungleCSBData;", "(Lcom/vungle/ads/internal/model/Placement;Lcom/vungle/ads/internal/model/BidPayload;Lcom/vungle/ads/VungleAdSize;Lcom/vungle/ads/VungleCSBData;)V", "getAdMarkup", "()Lcom/vungle/ads/internal/model/BidPayload;", "getCsbData", "()Lcom/vungle/ads/VungleCSBData;", "getPlacement", "()Lcom/vungle/ads/internal/model/Placement;", "getRequestAdSize", "()Lcom/vungle/ads/VungleAdSize;", "equals", "", "other", "", "hashCode", "", "toString", "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class AdRequest implements java.io.Serializable {
    private final com.vungle.ads.internal.model.BidPayload adMarkup;
    private final com.vungle.ads.VungleCSBData csbData;
    private final com.vungle.ads.internal.model.Placement placement;
    private final com.vungle.ads.VungleAdSize requestAdSize;

    public AdRequest(com.vungle.ads.internal.model.Placement placement, com.vungle.ads.internal.model.BidPayload bidPayload, com.vungle.ads.VungleAdSize vungleAdSize, com.vungle.ads.VungleCSBData vungleCSBData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placement, "placement");
        this.placement = placement;
        this.adMarkup = bidPayload;
        this.requestAdSize = vungleAdSize;
        this.csbData = vungleCSBData;
    }

    public /* synthetic */ AdRequest(com.vungle.ads.internal.model.Placement placement, com.vungle.ads.internal.model.BidPayload bidPayload, com.vungle.ads.VungleAdSize vungleAdSize, com.vungle.ads.VungleCSBData vungleCSBData, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(placement, bidPayload, vungleAdSize, (i & 8) != 0 ? null : vungleCSBData);
    }

    public final com.vungle.ads.internal.model.Placement getPlacement() {
        return this.placement;
    }

    public final com.vungle.ads.internal.model.BidPayload getAdMarkup() {
        return this.adMarkup;
    }

    public final com.vungle.ads.VungleAdSize getRequestAdSize() {
        return this.requestAdSize;
    }

    public final com.vungle.ads.VungleCSBData getCsbData() {
        return this.csbData;
    }

    public java.lang.String toString() {
        return "AdRequest{placementId='" + this.placement.getReferenceId() + "', adMarkup=" + this.adMarkup + ", requestAdSize=" + this.requestAdSize + ", csbData=" + this.csbData + kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other.getClass())) {
            return false;
        }
        com.vungle.ads.internal.load.AdRequest adRequest = (com.vungle.ads.internal.load.AdRequest) other;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(this.placement.getReferenceId(), adRequest.placement.getReferenceId()) || !kotlin.jvm.internal.Intrinsics.areEqual(this.requestAdSize, adRequest.requestAdSize)) {
            return false;
        }
        com.vungle.ads.internal.model.BidPayload bidPayload = this.adMarkup;
        if (bidPayload != null) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(bidPayload, adRequest.adMarkup)) {
                return false;
            }
        } else if (adRequest.adMarkup != null) {
            return false;
        }
        com.vungle.ads.VungleCSBData vungleCSBData = this.csbData;
        com.vungle.ads.VungleCSBData vungleCSBData2 = adRequest.csbData;
        return vungleCSBData != null ? kotlin.jvm.internal.Intrinsics.areEqual(vungleCSBData, vungleCSBData2) : vungleCSBData2 == null;
    }

    public int hashCode() {
        int hashCode = this.placement.getReferenceId().hashCode() * 31;
        com.vungle.ads.VungleAdSize vungleAdSize = this.requestAdSize;
        int hashCode2 = (hashCode + (vungleAdSize != null ? vungleAdSize.hashCode() : 0)) * 31;
        com.vungle.ads.internal.model.BidPayload bidPayload = this.adMarkup;
        int hashCode3 = (hashCode2 + (bidPayload != null ? bidPayload.hashCode() : 0)) * 31;
        com.vungle.ads.VungleCSBData vungleCSBData = this.csbData;
        return hashCode3 + (vungleCSBData != null ? vungleCSBData.hashCode() : 0);
    }
}
