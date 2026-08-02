package com.paypal.oslo.feature.debitcard.cardacquisition.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/usecase/CheckDebitCardEligibilityUseCase;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/usecase/UseCase;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/model/eligibility/DebitCardEligibilityRequest;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/model/eligibility/DebitCardEligibilityResponse;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/repository/DebitCardAcquisitionRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/repository/DebitCardAcquisitionRepository;)V", "request", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/UseCaseResult;", "invoke", "(Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/model/eligibility/DebitCardEligibilityRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/repository/DebitCardAcquisitionRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CheckDebitCardEligibilityUseCase implements com.paypal.oslo.feature.debitcard.shared.domain.usecase.UseCase<com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityRequest, com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityResponse> {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.debitcard.cardacquisition.domain.repository.DebitCardAcquisitionRepository getHighSpeedVideoSizes;

    @javax.inject.Inject
    public CheckDebitCardEligibilityUseCase(com.paypal.oslo.feature.debitcard.cardacquisition.domain.repository.DebitCardAcquisitionRepository debitCardAcquisitionRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardAcquisitionRepository, "");
        this.getHighSpeedVideoSizes = debitCardAcquisitionRepository;
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.domain.usecase.UseCase
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityRequest debitCardEligibilityRequest, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<? extends com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityResponse>> continuation) {
        return invoke2(debitCardEligibilityRequest, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityResponse>>) continuation);
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.domain.usecase.UseCase
    public final /* bridge */ <T> com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityResponse> toUseCaseResult(arrow.core.Ior<? extends com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError, ? extends T> ior, kotlin.jvm.functions.Function1<? super T, com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityResponse> function1) {
        return super.toUseCaseResult(ior, function1);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke2(com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityRequest debitCardEligibilityRequest, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityResponse>> continuation) {
        com.paypal.oslo.feature.debitcard.cardacquisition.domain.usecase.CheckDebitCardEligibilityUseCase$invoke$1 checkDebitCardEligibilityUseCase$invoke$1;
        int i;
        com.paypal.oslo.feature.debitcard.cardacquisition.domain.usecase.CheckDebitCardEligibilityUseCase checkDebitCardEligibilityUseCase;
        if (continuation instanceof com.paypal.oslo.feature.debitcard.cardacquisition.domain.usecase.CheckDebitCardEligibilityUseCase$invoke$1) {
            checkDebitCardEligibilityUseCase$invoke$1 = (com.paypal.oslo.feature.debitcard.cardacquisition.domain.usecase.CheckDebitCardEligibilityUseCase$invoke$1) continuation;
            if ((checkDebitCardEligibilityUseCase$invoke$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                checkDebitCardEligibilityUseCase$invoke$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = checkDebitCardEligibilityUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = checkDebitCardEligibilityUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.debitcard.cardacquisition.domain.repository.DebitCardAcquisitionRepository debitCardAcquisitionRepository = this.getHighSpeedVideoSizes;
                    checkDebitCardEligibilityUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(debitCardEligibilityRequest);
                    checkDebitCardEligibilityUseCase$invoke$1.getHighSpeedVideoSizes = this;
                    checkDebitCardEligibilityUseCase$invoke$1.getHighSpeedVideoFpsRanges = 1;
                    obj = debitCardAcquisitionRepository.checkEligibility(debitCardEligibilityRequest, checkDebitCardEligibilityUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    checkDebitCardEligibilityUseCase = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    checkDebitCardEligibilityUseCase = (com.paypal.oslo.feature.debitcard.cardacquisition.domain.usecase.CheckDebitCardEligibilityUseCase) checkDebitCardEligibilityUseCase$invoke$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return checkDebitCardEligibilityUseCase.toUseCaseResult((arrow.core.Ior) obj, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.domain.usecase.CheckDebitCardEligibilityUseCase$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.cardacquisition.domain.usecase.CheckDebitCardEligibilityUseCase.$r8$lambda$DywMbnVF3bPemsKbGcLj7ab_jPY((com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityResponse) obj2);
                    }
                });
            }
        }
        checkDebitCardEligibilityUseCase$invoke$1 = new com.paypal.oslo.feature.debitcard.cardacquisition.domain.usecase.CheckDebitCardEligibilityUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = checkDebitCardEligibilityUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = checkDebitCardEligibilityUseCase$invoke$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        return checkDebitCardEligibilityUseCase.toUseCaseResult((arrow.core.Ior) obj2, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.domain.usecase.CheckDebitCardEligibilityUseCase$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj22) {
                return com.paypal.oslo.feature.debitcard.cardacquisition.domain.usecase.CheckDebitCardEligibilityUseCase.$r8$lambda$DywMbnVF3bPemsKbGcLj7ab_jPY((com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityResponse) obj22);
            }
        });
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityResponse $r8$lambda$DywMbnVF3bPemsKbGcLj7ab_jPY(com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityResponse debitCardEligibilityResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardEligibilityResponse, "");
        return debitCardEligibilityResponse;
    }
}
