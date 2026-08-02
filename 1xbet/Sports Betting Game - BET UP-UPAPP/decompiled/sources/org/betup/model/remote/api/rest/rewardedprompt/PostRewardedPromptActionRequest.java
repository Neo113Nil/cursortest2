package org.betup.model.remote.api.rest.rewardedprompt;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: RewardedPromptInteractors.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lorg/betup/model/remote/api/rest/rewardedprompt/PostRewardedPromptActionRequest;", "", "campaignId", "", SDKConstants.PARAM_GAME_REQUESTS_ACTION_TYPE, "Lorg/betup/model/remote/api/rest/rewardedprompt/RewardedPromptActionType;", "eventKey", "screenKey", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Lorg/betup/model/remote/api/rest/rewardedprompt/RewardedPromptActionType;Ljava/lang/String;Ljava/lang/String;)V", "getCampaignId", "()Ljava/lang/String;", "getActionType", "()Lorg/betup/model/remote/api/rest/rewardedprompt/RewardedPromptActionType;", "getEventKey", "getScreenKey", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PostRewardedPromptActionRequest {
    public static final int $stable = 0;
    private final RewardedPromptActionType actionType;
    private final String campaignId;
    private final String eventKey;
    private final String screenKey;

    public static /* synthetic */ PostRewardedPromptActionRequest copy$default(PostRewardedPromptActionRequest postRewardedPromptActionRequest, String str, RewardedPromptActionType rewardedPromptActionType, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = postRewardedPromptActionRequest.campaignId;
        }
        if ((i & 2) != 0) {
            rewardedPromptActionType = postRewardedPromptActionRequest.actionType;
        }
        if ((i & 4) != 0) {
            str2 = postRewardedPromptActionRequest.eventKey;
        }
        if ((i & 8) != 0) {
            str3 = postRewardedPromptActionRequest.screenKey;
        }
        return postRewardedPromptActionRequest.copy(str, rewardedPromptActionType, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCampaignId() {
        return this.campaignId;
    }

    /* renamed from: component2, reason: from getter */
    public final RewardedPromptActionType getActionType() {
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

    public final PostRewardedPromptActionRequest copy(String campaignId, RewardedPromptActionType actionType, String eventKey, String screenKey) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        return new PostRewardedPromptActionRequest(campaignId, actionType, eventKey, screenKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostRewardedPromptActionRequest)) {
            return false;
        }
        PostRewardedPromptActionRequest postRewardedPromptActionRequest = (PostRewardedPromptActionRequest) other;
        return Intrinsics.areEqual(this.campaignId, postRewardedPromptActionRequest.campaignId) && this.actionType == postRewardedPromptActionRequest.actionType && Intrinsics.areEqual(this.eventKey, postRewardedPromptActionRequest.eventKey) && Intrinsics.areEqual(this.screenKey, postRewardedPromptActionRequest.screenKey);
    }

    public int hashCode() {
        int hashCode = ((this.campaignId.hashCode() * 31) + this.actionType.hashCode()) * 31;
        String str = this.eventKey;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.screenKey;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "PostRewardedPromptActionRequest(campaignId=" + this.campaignId + ", actionType=" + this.actionType + ", eventKey=" + this.eventKey + ", screenKey=" + this.screenKey + ")";
    }

    public PostRewardedPromptActionRequest(String campaignId, RewardedPromptActionType actionType, String str, String str2) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        this.campaignId = campaignId;
        this.actionType = actionType;
        this.eventKey = str;
        this.screenKey = str2;
    }

    public /* synthetic */ PostRewardedPromptActionRequest(String str, RewardedPromptActionType rewardedPromptActionType, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, rewardedPromptActionType, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }

    public final String getCampaignId() {
        return this.campaignId;
    }

    public final RewardedPromptActionType getActionType() {
        return this.actionType;
    }

    public final String getEventKey() {
        return this.eventKey;
    }

    public final String getScreenKey() {
        return this.screenKey;
    }
}
