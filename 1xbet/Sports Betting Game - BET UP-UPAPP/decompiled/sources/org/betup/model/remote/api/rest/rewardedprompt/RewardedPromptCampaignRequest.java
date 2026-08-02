package org.betup.model.remote.api.rest.rewardedprompt;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: RewardedPromptInteractors.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003JA\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lorg/betup/model/remote/api/rest/rewardedprompt/RewardedPromptCampaignRequest;", "", "campaignId", "", "eventKey", "screenKey", "contextParams", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getCampaignId", "()Ljava/lang/String;", "getEventKey", "getScreenKey", "getContextParams", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RewardedPromptCampaignRequest {
    public static final int $stable = 8;
    private final String campaignId;
    private final Map<String, String> contextParams;
    private final String eventKey;
    private final String screenKey;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RewardedPromptCampaignRequest copy$default(RewardedPromptCampaignRequest rewardedPromptCampaignRequest, String str, String str2, String str3, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rewardedPromptCampaignRequest.campaignId;
        }
        if ((i & 2) != 0) {
            str2 = rewardedPromptCampaignRequest.eventKey;
        }
        if ((i & 4) != 0) {
            str3 = rewardedPromptCampaignRequest.screenKey;
        }
        if ((i & 8) != 0) {
            map = rewardedPromptCampaignRequest.contextParams;
        }
        return rewardedPromptCampaignRequest.copy(str, str2, str3, map);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCampaignId() {
        return this.campaignId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getEventKey() {
        return this.eventKey;
    }

    /* renamed from: component3, reason: from getter */
    public final String getScreenKey() {
        return this.screenKey;
    }

    public final Map<String, String> component4() {
        return this.contextParams;
    }

    public final RewardedPromptCampaignRequest copy(String campaignId, String eventKey, String screenKey, Map<String, String> contextParams) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(contextParams, "contextParams");
        return new RewardedPromptCampaignRequest(campaignId, eventKey, screenKey, contextParams);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardedPromptCampaignRequest)) {
            return false;
        }
        RewardedPromptCampaignRequest rewardedPromptCampaignRequest = (RewardedPromptCampaignRequest) other;
        return Intrinsics.areEqual(this.campaignId, rewardedPromptCampaignRequest.campaignId) && Intrinsics.areEqual(this.eventKey, rewardedPromptCampaignRequest.eventKey) && Intrinsics.areEqual(this.screenKey, rewardedPromptCampaignRequest.screenKey) && Intrinsics.areEqual(this.contextParams, rewardedPromptCampaignRequest.contextParams);
    }

    public int hashCode() {
        int hashCode = this.campaignId.hashCode() * 31;
        String str = this.eventKey;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.screenKey;
        return ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.contextParams.hashCode();
    }

    public String toString() {
        return "RewardedPromptCampaignRequest(campaignId=" + this.campaignId + ", eventKey=" + this.eventKey + ", screenKey=" + this.screenKey + ", contextParams=" + this.contextParams + ")";
    }

    public RewardedPromptCampaignRequest(String campaignId, String str, String str2, Map<String, String> contextParams) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(contextParams, "contextParams");
        this.campaignId = campaignId;
        this.eventKey = str;
        this.screenKey = str2;
        this.contextParams = contextParams;
    }

    public final String getCampaignId() {
        return this.campaignId;
    }

    public final String getEventKey() {
        return this.eventKey;
    }

    public final String getScreenKey() {
        return this.screenKey;
    }

    public /* synthetic */ RewardedPromptCampaignRequest(String str, String str2, String str3, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? MapsKt.emptyMap() : map);
    }

    public final Map<String, String> getContextParams() {
        return this.contextParams;
    }
}
