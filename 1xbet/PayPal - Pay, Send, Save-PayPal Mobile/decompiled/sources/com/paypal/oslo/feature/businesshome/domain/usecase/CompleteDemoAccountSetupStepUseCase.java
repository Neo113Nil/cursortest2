package com.paypal.oslo.feature.businesshome.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/domain/usecase/CompleteDemoAccountSetupStepUseCase;", "", "Lcom/paypal/oslo/feature/businesshome/domain/repository/AccountSetupRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/businesshome/domain/repository/AccountSetupRepository;)V", "Lcom/paypal/oslo/feature/businesshome/api/domain/model/AccountSetupStepType;", "stepType", "", "invoke", "(Lcom/paypal/oslo/feature/businesshome/api/domain/model/AccountSetupStepType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/businesshome/domain/repository/AccountSetupRepository;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CompleteDemoAccountSetupStepUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businesshome.domain.repository.AccountSetupRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public CompleteDemoAccountSetupStepUseCase(com.paypal.oslo.feature.businesshome.domain.repository.AccountSetupRepository accountSetupRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountSetupRepository, "");
        this.getHighSpeedVideoFpsRangesFor = accountSetupRepository;
    }

    public final java.lang.Object invoke(com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStepType accountSetupStepType, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object completeStep = this.getHighSpeedVideoFpsRangesFor.completeStep(accountSetupStepType, continuation);
        return completeStep == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? completeStep : kotlin.Unit.INSTANCE;
    }
}
