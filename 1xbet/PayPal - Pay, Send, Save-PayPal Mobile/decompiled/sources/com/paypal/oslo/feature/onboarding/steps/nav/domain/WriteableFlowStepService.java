package com.paypal.oslo.feature.onboarding.steps.nav.domain;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000b\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\tH&¢\u0006\u0004\b\u000b\u0010\fÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/WriteableFlowStepService;", "", "Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/StepKey;", "stepKey", "Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/Step;", "step", "", "cacheStep", "(Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/StepKey;Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/Step;)V", "", "steps", "preloadSteps", "(Ljava/util/Map;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface WriteableFlowStepService {
    void cacheStep(com.paypal.oslo.feature.onboarding.steps.nav.domain.StepKey stepKey, com.paypal.oslo.feature.onboarding.steps.nav.domain.Step step);

    void preloadSteps(java.util.Map<com.paypal.oslo.feature.onboarding.steps.nav.domain.StepKey, com.paypal.oslo.feature.onboarding.steps.nav.domain.Step> steps);
}
