package org.betup.model.remote.api.rest.rewardedprompt;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: RewardedPromptInteractors.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J7\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lorg/betup/model/remote/api/rest/rewardedprompt/RewardedPromptEligibilityRequest;", "", "eventKey", "", "screenKey", "contextParams", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getEventKey", "()Ljava/lang/String;", "getScreenKey", "getContextParams", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RewardedPromptEligibilityRequest {
    public static final int $stable = 8;
    private final Map<String, String> contextParams;
    private final String eventKey;
    private final String screenKey;

    public RewardedPromptEligibilityRequest() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RewardedPromptEligibilityRequest copy$default(RewardedPromptEligibilityRequest rewardedPromptEligibilityRequest, String str, String str2, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rewardedPromptEligibilityRequest.eventKey;
        }
        if ((i & 2) != 0) {
            str2 = rewardedPromptEligibilityRequest.screenKey;
        }
        if ((i & 4) != 0) {
            map = rewardedPromptEligibilityRequest.contextParams;
        }
        return rewardedPromptEligibilityRequest.copy(str, str2, map);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEventKey() {
        return this.eventKey;
    }

    /* renamed from: component2, reason: from getter */
    public final String getScreenKey() {
        return this.screenKey;
    }

    public final Map<String, String> component3() {
        return this.contextParams;
    }

    public final RewardedPromptEligibilityRequest copy(String eventKey, String screenKey, Map<String, String> contextParams) {
        Intrinsics.checkNotNullParameter(contextParams, "contextParams");
        return new RewardedPromptEligibilityRequest(eventKey, screenKey, contextParams);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardedPromptEligibilityRequest)) {
            return false;
        }
        RewardedPromptEligibilityRequest rewardedPromptEligibilityRequest = (RewardedPromptEligibilityRequest) other;
        return Intrinsics.areEqual(this.eventKey, rewardedPromptEligibilityRequest.eventKey) && Intrinsics.areEqual(this.screenKey, rewardedPromptEligibilityRequest.screenKey) && Intrinsics.areEqual(this.contextParams, rewardedPromptEligibilityRequest.contextParams);
    }

    public int hashCode() {
        String str = this.eventKey;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.screenKey;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.contextParams.hashCode();
    }

    public String toString() {
        return "RewardedPromptEligibilityRequest(eventKey=" + this.eventKey + ", screenKey=" + this.screenKey + ", contextParams=" + this.contextParams + ")";
    }

    public RewardedPromptEligibilityRequest(String str, String str2, Map<String, String> contextParams) {
        Intrinsics.checkNotNullParameter(contextParams, "contextParams");
        this.eventKey = str;
        this.screenKey = str2;
        this.contextParams = contextParams;
    }

    public final String getEventKey() {
        return this.eventKey;
    }

    public final String getScreenKey() {
        return this.screenKey;
    }

    public /* synthetic */ RewardedPromptEligibilityRequest(String str, String str2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? MapsKt.emptyMap() : map);
    }

    public final Map<String, String> getContextParams() {
        return this.contextParams;
    }
}
