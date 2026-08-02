package org.betup.model.remote.api.rest.interstitial;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: GetInterstitialCampaignInteractor.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lorg/betup/model/remote/api/rest/interstitial/InterstitialCampaignRequest;", "", "campaignId", "", "eventKey", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/String;)V", "getCampaignId", "()Ljava/lang/String;", "getEventKey", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class InterstitialCampaignRequest {
    public static final int $stable = 0;
    private final String campaignId;
    private final String eventKey;

    public static /* synthetic */ InterstitialCampaignRequest copy$default(InterstitialCampaignRequest interstitialCampaignRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = interstitialCampaignRequest.campaignId;
        }
        if ((i & 2) != 0) {
            str2 = interstitialCampaignRequest.eventKey;
        }
        return interstitialCampaignRequest.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCampaignId() {
        return this.campaignId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getEventKey() {
        return this.eventKey;
    }

    public final InterstitialCampaignRequest copy(String campaignId, String eventKey) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        return new InterstitialCampaignRequest(campaignId, eventKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InterstitialCampaignRequest)) {
            return false;
        }
        InterstitialCampaignRequest interstitialCampaignRequest = (InterstitialCampaignRequest) other;
        return Intrinsics.areEqual(this.campaignId, interstitialCampaignRequest.campaignId) && Intrinsics.areEqual(this.eventKey, interstitialCampaignRequest.eventKey);
    }

    public int hashCode() {
        int hashCode = this.campaignId.hashCode() * 31;
        String str = this.eventKey;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "InterstitialCampaignRequest(campaignId=" + this.campaignId + ", eventKey=" + this.eventKey + ")";
    }

    public InterstitialCampaignRequest(String campaignId, String str) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        this.campaignId = campaignId;
        this.eventKey = str;
    }

    public final String getCampaignId() {
        return this.campaignId;
    }

    public final String getEventKey() {
        return this.eventKey;
    }
}
