package com.paypal.oslo.feature.oneonboarding.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ:\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001c\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001d\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/StepUpComponentFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "__typename", "id", com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_STEP_UP_CONTEXT_ID, com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_FLOW_CONTEXT_ID, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/StepUpComponentFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "getId", "getStepUpContextId", "getFlowContextId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class StepUpComponentFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 0;
    private final java.lang.String __typename;
    private final java.lang.String flowContextId;
    private final java.lang.String id;
    private final java.lang.String stepUpContextId;

    public StepUpComponentFragment(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.__typename = str;
        this.id = str2;
        this.stepUpContextId = str3;
        this.flowContextId = str4;
    }

    public final java.lang.String get__typename() {
        return this.__typename;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getStepUpContextId() {
        return this.stepUpContextId;
    }

    public final java.lang.String getFlowContextId() {
        return this.flowContextId;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.__typename;
        java.lang.String str2 = this.id;
        java.lang.String str3 = this.stepUpContextId;
        java.lang.String str4 = this.flowContextId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("StepUpComponentFragment(__typename=");
        sb.append(str);
        sb.append(", id=");
        sb.append(str2);
        sb.append(", stepUpContextId=");
        sb.append(str3);
        sb.append(", flowContextId=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.__typename.hashCode();
        int hashCode2 = this.id.hashCode();
        int hashCode3 = this.stepUpContextId.hashCode();
        java.lang.String str = this.flowContextId;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.oneonboarding.graphql.fragment.StepUpComponentFragment)) {
            return false;
        }
        com.paypal.oslo.feature.oneonboarding.graphql.fragment.StepUpComponentFragment stepUpComponentFragment = (com.paypal.oslo.feature.oneonboarding.graphql.fragment.StepUpComponentFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, stepUpComponentFragment.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, stepUpComponentFragment.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.stepUpContextId, stepUpComponentFragment.stepUpContextId) && kotlin.jvm.internal.Intrinsics.areEqual(this.flowContextId, stepUpComponentFragment.flowContextId);
    }

    public final com.paypal.oslo.feature.oneonboarding.graphql.fragment.StepUpComponentFragment copy(java.lang.String __typename, java.lang.String id, java.lang.String stepUpContextId, java.lang.String flowContextId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepUpContextId, "");
        return new com.paypal.oslo.feature.oneonboarding.graphql.fragment.StepUpComponentFragment(__typename, id, stepUpContextId, flowContextId);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getFlowContextId() {
        return this.flowContextId;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getStepUpContextId() {
        return this.stepUpContextId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String get__typename() {
        return this.__typename;
    }

    public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.graphql.fragment.StepUpComponentFragment copy$default(com.paypal.oslo.feature.oneonboarding.graphql.fragment.StepUpComponentFragment stepUpComponentFragment, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = stepUpComponentFragment.__typename;
        }
        if ((i & 2) != 0) {
            str2 = stepUpComponentFragment.id;
        }
        if ((i & 4) != 0) {
            str3 = stepUpComponentFragment.stepUpContextId;
        }
        if ((i & 8) != 0) {
            str4 = stepUpComponentFragment.flowContextId;
        }
        return stepUpComponentFragment.copy(str, str2, str3, str4);
    }
}
