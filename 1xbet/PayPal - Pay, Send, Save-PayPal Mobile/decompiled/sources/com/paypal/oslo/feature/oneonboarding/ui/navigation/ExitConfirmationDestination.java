package com.paypal.oslo.feature.oneonboarding.ui.navigation;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/ui/navigation/ExitConfirmationDestination;", "Lcom/paypal/oslo/feature/oneonboarding/api/navigation/OneOnboardingDestination;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "intentId", "<init>", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;)V", "component1", "()Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "copy", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;)Lcom/paypal/oslo/feature/oneonboarding/ui/navigation/ExitConfirmationDestination;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "getIntentId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ExitConfirmationDestination implements com.paypal.oslo.feature.oneonboarding.api.navigation.OneOnboardingDestination {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId;

    public ExitConfirmationDestination(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        this.intentId = intentId;
    }

    @Override // com.paypal.oslo.feature.oneonboarding.api.navigation.OneOnboardingDestination
    public final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId getIntentId() {
        return this.intentId;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId = this.intentId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ExitConfirmationDestination(intentId=");
        sb.append(intentId);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.intentId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.oneonboarding.ui.navigation.ExitConfirmationDestination) && kotlin.jvm.internal.Intrinsics.areEqual(this.intentId, ((com.paypal.oslo.feature.oneonboarding.ui.navigation.ExitConfirmationDestination) other).intentId);
    }

    public final com.paypal.oslo.feature.oneonboarding.ui.navigation.ExitConfirmationDestination copy(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        return new com.paypal.oslo.feature.oneonboarding.ui.navigation.ExitConfirmationDestination(intentId);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId getIntentId() {
        return this.intentId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.ui.navigation.ExitConfirmationDestination copy$default(com.paypal.oslo.feature.oneonboarding.ui.navigation.ExitConfirmationDestination exitConfirmationDestination, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            intentId = exitConfirmationDestination.intentId;
        }
        return exitConfirmationDestination.copy(intentId);
    }
}
