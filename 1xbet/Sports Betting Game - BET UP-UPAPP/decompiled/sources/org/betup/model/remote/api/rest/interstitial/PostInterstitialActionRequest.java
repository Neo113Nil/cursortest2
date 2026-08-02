package org.betup.model.remote.api.rest.interstitial;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: PostInterstitialActionInteractor.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JA\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, d2 = {"Lorg/betup/model/remote/api/rest/interstitial/PostInterstitialActionRequest;", "", "campaignId", "", SDKConstants.PARAM_GAME_REQUESTS_ACTION_TYPE, "Lorg/betup/model/remote/api/rest/interstitial/InterstitialActionType;", "eventKey", "screenKey", "targetUrl", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Lorg/betup/model/remote/api/rest/interstitial/InterstitialActionType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCampaignId", "()Ljava/lang/String;", "getActionType", "()Lorg/betup/model/remote/api/rest/interstitial/InterstitialActionType;", "getEventKey", "getScreenKey", "getTargetUrl", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PostInterstitialActionRequest {
    public static final int $stable = 0;
    private final InterstitialActionType actionType;
    private final String campaignId;
    private final String eventKey;
    private final String screenKey;
    private final String targetUrl;

    public static /* synthetic */ PostInterstitialActionRequest copy$default(PostInterstitialActionRequest postInterstitialActionRequest, String str, InterstitialActionType interstitialActionType, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = postInterstitialActionRequest.campaignId;
        }
        if ((i & 2) != 0) {
            interstitialActionType = postInterstitialActionRequest.actionType;
        }
        InterstitialActionType interstitialActionType2 = interstitialActionType;
        if ((i & 4) != 0) {
            str2 = postInterstitialActionRequest.eventKey;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = postInterstitialActionRequest.screenKey;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = postInterstitialActionRequest.targetUrl;
        }
        return postInterstitialActionRequest.copy(str, interstitialActionType2, str5, str6, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCampaignId() {
        return this.campaignId;
    }

    /* renamed from: component2, reason: from getter */
    public final InterstitialActionType getActionType() {
        return this.actionType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getEventKey() {
        return this.eventKey;
    }

    /* renamed from: component4, reason: from getter */
    public final String getScreenKey() {
        return this.screenKey;
    }

    /* renamed from: component5, reason: from getter */
    public final String getTargetUrl() {
        return this.targetUrl;
    }

    public final PostInterstitialActionRequest copy(String campaignId, InterstitialActionType actionType, String eventKey, String screenKey, String targetUrl) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        return new PostInterstitialActionRequest(campaignId, actionType, eventKey, screenKey, targetUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostInterstitialActionRequest)) {
            return false;
        }
        PostInterstitialActionRequest postInterstitialActionRequest = (PostInterstitialActionRequest) other;
        return Intrinsics.areEqual(this.campaignId, postInterstitialActionRequest.campaignId) && this.actionType == postInterstitialActionRequest.actionType && Intrinsics.areEqual(this.eventKey, postInterstitialActionRequest.eventKey) && Intrinsics.areEqual(this.screenKey, postInterstitialActionRequest.screenKey) && Intrinsics.areEqual(this.targetUrl, postInterstitialActionRequest.targetUrl);
    }

    public int hashCode() {
        int hashCode = ((this.campaignId.hashCode() * 31) + this.actionType.hashCode()) * 31;
        String str = this.eventKey;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.screenKey;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.targetUrl;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "PostInterstitialActionRequest(campaignId=" + this.campaignId + ", actionType=" + this.actionType + ", eventKey=" + this.eventKey + ", screenKey=" + this.screenKey + ", targetUrl=" + this.targetUrl + ")";
    }

    public PostInterstitialActionRequest(String campaignId, InterstitialActionType actionType, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        this.campaignId = campaignId;
        this.actionType = actionType;
        this.eventKey = str;
        this.screenKey = str2;
        this.targetUrl = str3;
    }

    public /* synthetic */ PostInterstitialActionRequest(String str, InterstitialActionType interstitialActionType, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, interstitialActionType, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
    }

    public final String getCampaignId() {
        return this.campaignId;
    }

    public final InterstitialActionType getActionType() {
        return this.actionType;
    }

    public final String getEventKey() {
        return this.eventKey;
    }

    public final String getScreenKey() {
        return this.screenKey;
    }

    public final String getTargetUrl() {
        return this.targetUrl;
    }
}
