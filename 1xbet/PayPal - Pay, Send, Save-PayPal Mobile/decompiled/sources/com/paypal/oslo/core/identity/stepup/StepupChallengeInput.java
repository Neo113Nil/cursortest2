package com.paypal.oslo.core.identity.stepup;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ:\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/paypal/oslo/core/identity/stepup/StepupChallengeInput;", "", "", com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_STEP_UP_CONTEXT_ID, com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_FLOW_NAME, "flowContext", com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_FLOW_CONTEXT_ID, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/core/identity/stepup/StepupChallengeInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getStepUpContextId", "getFlowName", "getFlowContext", "getFlowContextId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class StepupChallengeInput {
    private final java.lang.String flowContext;
    private final java.lang.String flowContextId;
    private final java.lang.String flowName;
    private final java.lang.String stepUpContextId;

    public StepupChallengeInput(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.stepUpContextId = str;
        this.flowName = str2;
        this.flowContext = str3;
        this.flowContextId = str4;
    }

    public /* synthetic */ StepupChallengeInput(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4);
    }

    public final java.lang.String getStepUpContextId() {
        return this.stepUpContextId;
    }

    public final java.lang.String getFlowName() {
        return this.flowName;
    }

    public final java.lang.String getFlowContext() {
        return this.flowContext;
    }

    public final java.lang.String getFlowContextId() {
        return this.flowContextId;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.stepUpContextId;
        java.lang.String str2 = this.flowName;
        java.lang.String str3 = this.flowContext;
        java.lang.String str4 = this.flowContextId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("StepupChallengeInput(stepUpContextId=");
        sb.append(str);
        sb.append(", flowName=");
        sb.append(str2);
        sb.append(", flowContext=");
        sb.append(str3);
        sb.append(", flowContextId=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.stepUpContextId.hashCode();
        int hashCode2 = this.flowName.hashCode();
        int hashCode3 = this.flowContext.hashCode();
        java.lang.String str = this.flowContextId;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.identity.stepup.StepupChallengeInput)) {
            return false;
        }
        com.paypal.oslo.core.identity.stepup.StepupChallengeInput stepupChallengeInput = (com.paypal.oslo.core.identity.stepup.StepupChallengeInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.stepUpContextId, stepupChallengeInput.stepUpContextId) && kotlin.jvm.internal.Intrinsics.areEqual(this.flowName, stepupChallengeInput.flowName) && kotlin.jvm.internal.Intrinsics.areEqual(this.flowContext, stepupChallengeInput.flowContext) && kotlin.jvm.internal.Intrinsics.areEqual(this.flowContextId, stepupChallengeInput.flowContextId);
    }

    public final com.paypal.oslo.core.identity.stepup.StepupChallengeInput copy(java.lang.String stepUpContextId, java.lang.String flowName, java.lang.String flowContext, java.lang.String flowContextId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepUpContextId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowContext, "");
        return new com.paypal.oslo.core.identity.stepup.StepupChallengeInput(stepUpContextId, flowName, flowContext, flowContextId);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getFlowContextId() {
        return this.flowContextId;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getFlowContext() {
        return this.flowContext;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getFlowName() {
        return this.flowName;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getStepUpContextId() {
        return this.stepUpContextId;
    }

    public static /* synthetic */ com.paypal.oslo.core.identity.stepup.StepupChallengeInput copy$default(com.paypal.oslo.core.identity.stepup.StepupChallengeInput stepupChallengeInput, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = stepupChallengeInput.stepUpContextId;
        }
        if ((i & 2) != 0) {
            str2 = stepupChallengeInput.flowName;
        }
        if ((i & 4) != 0) {
            str3 = stepupChallengeInput.flowContext;
        }
        if ((i & 8) != 0) {
            str4 = stepupChallengeInput.flowContextId;
        }
        return stepupChallengeInput.copy(str, str2, str3, str4);
    }
}
