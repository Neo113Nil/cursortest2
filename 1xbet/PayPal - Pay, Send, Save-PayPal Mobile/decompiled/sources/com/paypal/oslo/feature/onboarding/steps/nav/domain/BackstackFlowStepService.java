package com.paypal.oslo.feature.onboarding.steps.nav.domain;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u0011\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0004\b\u0006\u0010\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/BackstackFlowStepService;", "Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/ReadableFlowStepService;", "Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/WriteableFlowStepService;", "Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/Step;", "peekBackStack", "()Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/Step;", "popBackStack"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface BackstackFlowStepService extends com.paypal.oslo.feature.onboarding.steps.nav.domain.ReadableFlowStepService, com.paypal.oslo.feature.onboarding.steps.nav.domain.WriteableFlowStepService {
    com.paypal.oslo.feature.onboarding.steps.nav.domain.Step peekBackStack();

    com.paypal.oslo.feature.onboarding.steps.nav.domain.Step popBackStack();
}
