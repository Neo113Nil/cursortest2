package com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.navigation;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/signupwithgoogle/ui/navigation/SignUpWithGoogleDestination;", "Lcom/paypal/oslo/feature/oneonboarding/api/navigation/OneOnboardingDestination;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "intentId", "Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/signupwithgoogle/domain/SignUpWithGoogleStepComponentConfig;", "stepComponentConfig", "<init>", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/signupwithgoogle/domain/SignUpWithGoogleStepComponentConfig;)V", "component1", "()Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "component2", "()Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/signupwithgoogle/domain/SignUpWithGoogleStepComponentConfig;", "copy", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/signupwithgoogle/domain/SignUpWithGoogleStepComponentConfig;)Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/signupwithgoogle/ui/navigation/SignUpWithGoogleDestination;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "getIntentId", "Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/signupwithgoogle/domain/SignUpWithGoogleStepComponentConfig;", "getStepComponentConfig"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SignUpWithGoogleDestination implements com.paypal.oslo.feature.oneonboarding.api.navigation.OneOnboardingDestination {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId;
    private final com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.domain.SignUpWithGoogleStepComponentConfig stepComponentConfig;

    public SignUpWithGoogleDestination(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.domain.SignUpWithGoogleStepComponentConfig signUpWithGoogleStepComponentConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signUpWithGoogleStepComponentConfig, "");
        this.intentId = intentId;
        this.stepComponentConfig = signUpWithGoogleStepComponentConfig;
    }

    @Override // com.paypal.oslo.feature.oneonboarding.api.navigation.OneOnboardingDestination
    public final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId getIntentId() {
        return this.intentId;
    }

    public final com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.domain.SignUpWithGoogleStepComponentConfig getStepComponentConfig() {
        return this.stepComponentConfig;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId = this.intentId;
        com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.domain.SignUpWithGoogleStepComponentConfig signUpWithGoogleStepComponentConfig = this.stepComponentConfig;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SignUpWithGoogleDestination(intentId=");
        sb.append(intentId);
        sb.append(", stepComponentConfig=");
        sb.append(signUpWithGoogleStepComponentConfig);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.intentId.hashCode() * 31) + this.stepComponentConfig.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.navigation.SignUpWithGoogleDestination)) {
            return false;
        }
        com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.navigation.SignUpWithGoogleDestination signUpWithGoogleDestination = (com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.navigation.SignUpWithGoogleDestination) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.intentId, signUpWithGoogleDestination.intentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.stepComponentConfig, signUpWithGoogleDestination.stepComponentConfig);
    }

    public final com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.navigation.SignUpWithGoogleDestination copy(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.domain.SignUpWithGoogleStepComponentConfig stepComponentConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepComponentConfig, "");
        return new com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.navigation.SignUpWithGoogleDestination(intentId, stepComponentConfig);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.domain.SignUpWithGoogleStepComponentConfig getStepComponentConfig() {
        return this.stepComponentConfig;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId getIntentId() {
        return this.intentId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.navigation.SignUpWithGoogleDestination copy$default(com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.navigation.SignUpWithGoogleDestination signUpWithGoogleDestination, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.domain.SignUpWithGoogleStepComponentConfig signUpWithGoogleStepComponentConfig, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            intentId = signUpWithGoogleDestination.intentId;
        }
        if ((i & 2) != 0) {
            signUpWithGoogleStepComponentConfig = signUpWithGoogleDestination.stepComponentConfig;
        }
        return signUpWithGoogleDestination.copy(intentId, signUpWithGoogleStepComponentConfig);
    }
}
