package com.paypal.oslo.feature.onboarding.signup.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/domain/usecase/CalculateProgressUseCase;", "", "Lcom/paypal/oslo/feature/onboarding/signup/domain/repository/FlowConfigurationRepository;", "flowConfigurationRepository", "<init>", "(Lcom/paypal/oslo/feature/onboarding/signup/domain/repository/FlowConfigurationRepository;)V", "Lcom/paypal/oslo/feature/onboarding/api/steps/domain/StepId;", "currentStepId", "", "invoke-DJJLKbI", "(Ljava/lang/String;)I", "invoke", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/onboarding/signup/domain/repository/FlowConfigurationRepository;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CalculateProgressUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.onboarding.signup.domain.repository.FlowConfigurationRepository getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public CalculateProgressUseCase(com.paypal.oslo.feature.onboarding.signup.domain.repository.FlowConfigurationRepository flowConfigurationRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowConfigurationRepository, "");
        this.getHighSpeedVideoFpsRanges = flowConfigurationRepository;
    }

    /* renamed from: invoke-DJJLKbI, reason: not valid java name */
    public final int m16328invokeDJJLKbI(java.lang.String currentStepId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentStepId, "");
        return this.getHighSpeedVideoFpsRanges.mo16273calculateProgressStatusDJJLKbI(currentStepId);
    }
}
