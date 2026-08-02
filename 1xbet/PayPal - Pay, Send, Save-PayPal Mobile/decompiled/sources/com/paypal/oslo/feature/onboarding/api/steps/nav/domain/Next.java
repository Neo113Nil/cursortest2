package com.paypal.oslo.feature.onboarding.api.steps.nav.domain;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/steps/nav/domain/Next;", "Lcom/paypal/oslo/feature/onboarding/api/steps/nav/domain/Transition;", "", "Lcom/paypal/oslo/feature/onboarding/api/steps/nav/domain/FlowData;", "inputs", "", "prefetchable", "<init>", "(Ljava/util/Set;Z)V", "sanitize", "()Lcom/paypal/oslo/feature/onboarding/api/steps/nav/domain/Transition;", "component1", "()Ljava/util/Set;", "component2", "()Z", "copy", "(Ljava/util/Set;Z)Lcom/paypal/oslo/feature/onboarding/api/steps/nav/domain/Next;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/Set;", "getInputs", "Z", "getPrefetchable"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class Next implements com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition {
    private final java.util.Set<com.paypal.oslo.feature.onboarding.api.steps.nav.domain.FlowData> inputs;
    private final boolean prefetchable;

    public Next(java.util.Set<com.paypal.oslo.feature.onboarding.api.steps.nav.domain.FlowData> set, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        this.inputs = set;
        this.prefetchable = z;
    }

    public /* synthetic */ Next(java.util.Set set, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kotlin.collections.SetsKt.emptySet() : set, (i & 2) != 0 ? false : z);
    }

    public final java.util.Set<com.paypal.oslo.feature.onboarding.api.steps.nav.domain.FlowData> getInputs() {
        return this.inputs;
    }

    @Override // com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition
    public final boolean getPrefetchable() {
        return this.prefetchable;
    }

    @Override // com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition
    public final com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition sanitize() {
        return copy$default(this, null, false, 1, null);
    }

    public final java.lang.String toString() {
        java.util.Set<com.paypal.oslo.feature.onboarding.api.steps.nav.domain.FlowData> set = this.inputs;
        boolean z = this.prefetchable;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Next(inputs=");
        sb.append(set);
        sb.append(", prefetchable=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.inputs.hashCode() * 31) + java.lang.Boolean.hashCode(this.prefetchable);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Next)) {
            return false;
        }
        com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Next next = (com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Next) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.inputs, next.inputs) && this.prefetchable == next.prefetchable;
    }

    public final com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Next copy(java.util.Set<com.paypal.oslo.feature.onboarding.api.steps.nav.domain.FlowData> inputs, boolean prefetchable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputs, "");
        return new com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Next(inputs, prefetchable);
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getPrefetchable() {
        return this.prefetchable;
    }

    public final java.util.Set<com.paypal.oslo.feature.onboarding.api.steps.nav.domain.FlowData> component1() {
        return this.inputs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Next copy$default(com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Next next, java.util.Set set, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            set = next.inputs;
        }
        if ((i & 2) != 0) {
            z = next.prefetchable;
        }
        return next.copy(set, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Next() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }
}
