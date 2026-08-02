package com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.navigation;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/signupwithgoogle/ui/navigation/SignUpWithGoogleStepComponentNavigator;", "Lcom/paypal/oslo/feature/oneonboarding/ui/navigation/StepComponentNavigator;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/signupwithgoogle/domain/SignUpWithGoogleStepComponentConfig;", "<init>", "()V", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "intentId", "step", "Lcom/paypal/oslo/feature/oneonboarding/api/navigation/OneOnboardingDestination;", "navigate", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/signupwithgoogle/domain/SignUpWithGoogleStepComponentConfig;)Lcom/paypal/oslo/feature/oneonboarding/api/navigation/OneOnboardingDestination;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SignUpWithGoogleStepComponentNavigator implements com.paypal.oslo.feature.oneonboarding.ui.navigation.StepComponentNavigator<com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.domain.SignUpWithGoogleStepComponentConfig> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public SignUpWithGoogleStepComponentNavigator() {
    }

    @Override // com.paypal.oslo.feature.oneonboarding.ui.navigation.StepComponentNavigator
    public final com.paypal.oslo.feature.oneonboarding.api.navigation.OneOnboardingDestination navigate(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.domain.SignUpWithGoogleStepComponentConfig step) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "");
        return new com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.navigation.SignUpWithGoogleDestination(intentId, step);
    }
}
