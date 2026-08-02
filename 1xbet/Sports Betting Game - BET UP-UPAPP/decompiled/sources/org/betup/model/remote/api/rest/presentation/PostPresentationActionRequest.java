package org.betup.model.remote.api.rest.presentation;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: PostPresentationActionInteractor.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lorg/betup/model/remote/api/rest/presentation/PostPresentationActionRequest;", "", "campaignId", "", SDKConstants.PARAM_GAME_REQUESTS_ACTION_TYPE, "Lorg/betup/model/remote/api/rest/presentation/PresentationActionType;", "screenKey", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Lorg/betup/model/remote/api/rest/presentation/PresentationActionType;Ljava/lang/String;)V", "getCampaignId", "()Ljava/lang/String;", "getActionType", "()Lorg/betup/model/remote/api/rest/presentation/PresentationActionType;", "getScreenKey", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PostPresentationActionRequest {
    public static final int $stable = 0;
    private final PresentationActionType actionType;
    private final String campaignId;
    private final String screenKey;

    public static /* synthetic */ PostPresentationActionRequest copy$default(PostPresentationActionRequest postPresentationActionRequest, String str, PresentationActionType presentationActionType, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = postPresentationActionRequest.campaignId;
        }
        if ((i & 2) != 0) {
            presentationActionType = postPresentationActionRequest.actionType;
        }
        if ((i & 4) != 0) {
            str2 = postPresentationActionRequest.screenKey;
        }
        return postPresentationActionRequest.copy(str, presentationActionType, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCampaignId() {
        return this.campaignId;
    }

    /* renamed from: component2, reason: from getter */
    public final PresentationActionType getActionType() {
        return this.actionType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getScreenKey() {
        return this.screenKey;
    }

    public final PostPresentationActionRequest copy(String campaignId, PresentationActionType actionType, String screenKey) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        return new PostPresentationActionRequest(campaignId, actionType, screenKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostPresentationActionRequest)) {
            return false;
        }
        PostPresentationActionRequest postPresentationActionRequest = (PostPresentationActionRequest) other;
        return Intrinsics.areEqual(this.campaignId, postPresentationActionRequest.campaignId) && this.actionType == postPresentationActionRequest.actionType && Intrinsics.areEqual(this.screenKey, postPresentationActionRequest.screenKey);
    }

    public int hashCode() {
        int hashCode = ((this.campaignId.hashCode() * 31) + this.actionType.hashCode()) * 31;
        String str = this.screenKey;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "PostPresentationActionRequest(campaignId=" + this.campaignId + ", actionType=" + this.actionType + ", screenKey=" + this.screenKey + ")";
    }

    public PostPresentationActionRequest(String campaignId, PresentationActionType actionType, String str) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        this.campaignId = campaignId;
        this.actionType = actionType;
        this.screenKey = str;
    }

    public final String getCampaignId() {
        return this.campaignId;
    }

    public final PresentationActionType getActionType() {
        return this.actionType;
    }

    public final String getScreenKey() {
        return this.screenKey;
    }
}
