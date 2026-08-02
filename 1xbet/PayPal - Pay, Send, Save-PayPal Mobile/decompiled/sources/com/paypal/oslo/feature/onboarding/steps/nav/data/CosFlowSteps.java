package com.paypal.oslo.feature.onboarding.steps.nav.data;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/steps/nav/data/CosFlowSteps;", "", "", "Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/Step;", "steps", "", "Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/StepKey;", "prefetchableStepKeys", "<init>", "(Ljava/util/List;Ljava/util/Set;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/util/Set;", "copy", "(Ljava/util/List;Ljava/util/Set;)Lcom/paypal/oslo/feature/onboarding/steps/nav/data/CosFlowSteps;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getSteps", "Ljava/util/Set;", "getPrefetchableStepKeys"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CosFlowSteps {
    public static final int $stable = 8;
    private final java.util.Set<com.paypal.oslo.feature.onboarding.steps.nav.domain.StepKey> prefetchableStepKeys;
    private final java.util.List<com.paypal.oslo.feature.onboarding.steps.nav.domain.Step> steps;

    public CosFlowSteps(java.util.List<com.paypal.oslo.feature.onboarding.steps.nav.domain.Step> list, java.util.Set<com.paypal.oslo.feature.onboarding.steps.nav.domain.StepKey> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        this.steps = list;
        this.prefetchableStepKeys = set;
    }

    public final java.util.List<com.paypal.oslo.feature.onboarding.steps.nav.domain.Step> getSteps() {
        return this.steps;
    }

    public final java.util.Set<com.paypal.oslo.feature.onboarding.steps.nav.domain.StepKey> getPrefetchableStepKeys() {
        return this.prefetchableStepKeys;
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.onboarding.steps.nav.domain.Step> list = this.steps;
        java.util.Set<com.paypal.oslo.feature.onboarding.steps.nav.domain.StepKey> set = this.prefetchableStepKeys;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CosFlowSteps(steps=");
        sb.append(list);
        sb.append(", prefetchableStepKeys=");
        sb.append(set);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.steps.hashCode() * 31) + this.prefetchableStepKeys.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowSteps)) {
            return false;
        }
        com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowSteps cosFlowSteps = (com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowSteps) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.steps, cosFlowSteps.steps) && kotlin.jvm.internal.Intrinsics.areEqual(this.prefetchableStepKeys, cosFlowSteps.prefetchableStepKeys);
    }

    public final com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowSteps copy(java.util.List<com.paypal.oslo.feature.onboarding.steps.nav.domain.Step> steps, java.util.Set<com.paypal.oslo.feature.onboarding.steps.nav.domain.StepKey> prefetchableStepKeys) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(steps, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prefetchableStepKeys, "");
        return new com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowSteps(steps, prefetchableStepKeys);
    }

    public final java.util.Set<com.paypal.oslo.feature.onboarding.steps.nav.domain.StepKey> component2() {
        return this.prefetchableStepKeys;
    }

    public final java.util.List<com.paypal.oslo.feature.onboarding.steps.nav.domain.Step> component1() {
        return this.steps;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowSteps copy$default(com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowSteps cosFlowSteps, java.util.List list, java.util.Set set, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = cosFlowSteps.steps;
        }
        if ((i & 2) != 0) {
            set = cosFlowSteps.prefetchableStepKeys;
        }
        return cosFlowSteps.copy(list, set);
    }
}
