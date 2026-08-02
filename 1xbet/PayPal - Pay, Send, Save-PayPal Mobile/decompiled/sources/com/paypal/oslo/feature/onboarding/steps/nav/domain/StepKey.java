package com.paypal.oslo.feature.onboarding.steps.nav.domain;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001f\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/StepKey;", "", "Lcom/paypal/oslo/feature/onboarding/api/steps/domain/FlowId;", com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.HeaderFields.FLOW_ID, "Lcom/paypal/oslo/feature/onboarding/api/steps/domain/StepId;", "stepId", "Lcom/paypal/oslo/feature/onboarding/api/steps/nav/domain/Transition;", "transition", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/onboarding/api/steps/nav/domain/Transition;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-8NcbBzM", "()Ljava/lang/String;", "component1", "component2-eVUBM90", "component2", "component3", "()Lcom/paypal/oslo/feature/onboarding/api/steps/nav/domain/Transition;", "copy-NTOUAV8", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/onboarding/api/steps/nav/domain/Transition;)Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/StepKey;", "copy", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "Ljava/lang/String;", "getFlowId-8NcbBzM", "getStepId-eVUBM90", "Lcom/paypal/oslo/feature/onboarding/api/steps/nav/domain/Transition;", "getTransition"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class StepKey {
    public static final int $stable = 8;
    private final java.lang.String flowId;
    private final java.lang.String stepId;
    private final com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition transition;

    private StepKey(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition transition) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transition, "");
        this.flowId = str;
        this.stepId = str2;
        this.transition = transition;
    }

    /* renamed from: getFlowId-8NcbBzM, reason: not valid java name */
    public final java.lang.String m16529getFlowId8NcbBzM() {
        return this.flowId;
    }

    /* renamed from: getStepId-eVUBM90, reason: not valid java name */
    public final java.lang.String m16530getStepIdeVUBM90() {
        return this.stepId;
    }

    public final com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition getTransition() {
        return this.transition;
    }

    public final java.lang.String toString() {
        java.lang.String m16025toStringimpl = com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId.m16025toStringimpl(this.flowId);
        java.lang.String m16034toStringimpl = com.paypal.oslo.feature.onboarding.api.steps.domain.StepId.m16034toStringimpl(this.stepId);
        com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition transition = this.transition;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("StepKey(flowId=");
        sb.append(m16025toStringimpl);
        sb.append(", stepId=");
        sb.append(m16034toStringimpl);
        sb.append(", transition=");
        sb.append(transition);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId.m16024hashCodeimpl(this.flowId) * 31) + com.paypal.oslo.feature.onboarding.api.steps.domain.StepId.m16033hashCodeimpl(this.stepId)) * 31) + this.transition.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.onboarding.steps.nav.domain.StepKey)) {
            return false;
        }
        com.paypal.oslo.feature.onboarding.steps.nav.domain.StepKey stepKey = (com.paypal.oslo.feature.onboarding.steps.nav.domain.StepKey) other;
        return com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId.m16023equalsimpl0(this.flowId, stepKey.flowId) && com.paypal.oslo.feature.onboarding.api.steps.domain.StepId.m16032equalsimpl0(this.stepId, stepKey.stepId) && kotlin.jvm.internal.Intrinsics.areEqual(this.transition, stepKey.transition);
    }

    /* renamed from: copy-NTOUAV8, reason: not valid java name */
    public final com.paypal.oslo.feature.onboarding.steps.nav.domain.StepKey m16528copyNTOUAV8(java.lang.String flowId, java.lang.String stepId, com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition transition) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transition, "");
        return new com.paypal.oslo.feature.onboarding.steps.nav.domain.StepKey(flowId, stepId, transition, null);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition getTransition() {
        return this.transition;
    }

    /* renamed from: component2-eVUBM90, reason: not valid java name and from getter */
    public final java.lang.String getStepId() {
        return this.stepId;
    }

    /* renamed from: component1-8NcbBzM, reason: not valid java name and from getter */
    public final java.lang.String getFlowId() {
        return this.flowId;
    }

    /* renamed from: copy-NTOUAV8$default, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.onboarding.steps.nav.domain.StepKey m16525copyNTOUAV8$default(com.paypal.oslo.feature.onboarding.steps.nav.domain.StepKey stepKey, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition transition, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = stepKey.flowId;
        }
        if ((i & 2) != 0) {
            str2 = stepKey.stepId;
        }
        if ((i & 4) != 0) {
            transition = stepKey.transition;
        }
        return stepKey.m16528copyNTOUAV8(str, str2, transition);
    }

    public /* synthetic */ StepKey(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition transition, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, transition);
    }
}
