package com.paypal.oslo.feature.oneonboarding.ui.navigation;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J!\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0004\b\b\u0010\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/ui/navigation/StepComponentNavigator;", "Lcom/paypal/oslo/feature/oneonboarding/domain/StepComponentConfig;", "T", "", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "intentId", "step", "Lcom/paypal/oslo/feature/oneonboarding/api/navigation/OneOnboardingDestination;", "navigate", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Lcom/paypal/oslo/feature/oneonboarding/domain/StepComponentConfig;)Lcom/paypal/oslo/feature/oneonboarding/api/navigation/OneOnboardingDestination;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface StepComponentNavigator<T extends com.paypal.oslo.feature.oneonboarding.domain.StepComponentConfig> {
    com.paypal.oslo.feature.oneonboarding.api.navigation.OneOnboardingDestination navigate(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, T step);
}
