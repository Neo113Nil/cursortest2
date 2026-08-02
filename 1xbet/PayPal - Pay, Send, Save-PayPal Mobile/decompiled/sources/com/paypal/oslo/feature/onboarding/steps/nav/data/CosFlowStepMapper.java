package com.paypal.oslo.feature.onboarding.steps.nav.data;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0012\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/steps/nav/data/CosFlowStepMapper;", "", "Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/mapper/ErrorMapper;", "errorMapper", "<init>", "(Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/mapper/ErrorMapper;)V", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "callError", "Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/StepError;", "mapToStepError", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/StepError;", "Lcom/paypal/oslo/feature/onboarding/graphql/GetOnboardingFlowStepsQuery$Data;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lkotlin/Pair;", "", "Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/Step;", "", "Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/StepKey;", "mapToSteps", "(Lcom/paypal/oslo/feature/onboarding/graphql/GetOnboardingFlowStepsQuery$Data;)Lkotlin/Pair;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/mapper/ErrorMapper;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CosFlowStepMapper {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.onboarding.errorstruct.domain.mapper.ErrorMapper getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public CosFlowStepMapper(com.paypal.oslo.feature.onboarding.errorstruct.domain.mapper.ErrorMapper errorMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMapper, "");
        this.getHighResolutionOutputSizeshNQ4ISI = errorMapper;
    }

    public final com.paypal.oslo.feature.onboarding.steps.nav.domain.StepError mapToStepError(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        return com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowStepMapperKt.mapToStepError(callError, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final kotlin.Pair<java.util.List<com.paypal.oslo.feature.onboarding.steps.nav.domain.Step>, java.util.Set<com.paypal.oslo.feature.onboarding.steps.nav.domain.StepKey>> mapToSteps(com.paypal.oslo.feature.onboarding.graphql.GetOnboardingFlowStepsQuery.Data data) {
        return com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowStepMapperKt.mapToSteps(data);
    }
}
