package com.paypal.oslo.feature.onboarding.api.steps.nav.domain;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/steps/nav/domain/Initial;", "Lcom/paypal/oslo/feature/onboarding/api/steps/nav/domain/Transition;", "", "prefetchable", "<init>", "(Z)V", "sanitize", "()Lcom/paypal/oslo/feature/onboarding/api/steps/nav/domain/Transition;", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/onboarding/api/steps/nav/domain/Initial;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getPrefetchable"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class Initial implements com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition {
    private final boolean prefetchable;

    public Initial(boolean z) {
        this.prefetchable = z;
    }

    public /* synthetic */ Initial(boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    @Override // com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition
    public final boolean getPrefetchable() {
        return this.prefetchable;
    }

    @Override // com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition
    public final com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition sanitize() {
        return copy(false);
    }

    public final java.lang.String toString() {
        boolean z = this.prefetchable;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Initial(prefetchable=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.prefetchable);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Initial) && this.prefetchable == ((com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Initial) other).prefetchable;
    }

    public final com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Initial copy(boolean prefetchable) {
        return new com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Initial(prefetchable);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getPrefetchable() {
        return this.prefetchable;
    }

    public static /* synthetic */ com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Initial copy$default(com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Initial initial, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = initial.prefetchable;
        }
        return initial.copy(z);
    }

    public Initial() {
        this(false, 1, null);
    }
}
