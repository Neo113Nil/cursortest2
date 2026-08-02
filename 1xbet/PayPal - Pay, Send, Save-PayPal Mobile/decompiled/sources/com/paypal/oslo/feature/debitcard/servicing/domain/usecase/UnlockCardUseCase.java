package com.paypal.oslo.feature.debitcard.servicing.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/UnlockCardUseCase;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/usecase/UseCase;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/unlockcard/model/UnlockCardRequest;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/unlockcard/model/UnlockCardResult;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/repository/DebitCardServicingRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/repository/DebitCardServicingRepository;)V", "request", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/UseCaseResult;", "invoke", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/unlockcard/model/UnlockCardRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/repository/DebitCardServicingRepository;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UnlockCardUseCase implements com.paypal.oslo.feature.debitcard.shared.domain.usecase.UseCase<com.paypal.oslo.feature.debitcard.servicing.domain.unlockcard.model.UnlockCardRequest, com.paypal.oslo.feature.debitcard.servicing.domain.unlockcard.model.UnlockCardResult> {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.servicing.domain.repository.DebitCardServicingRepository getHighSpeedVideoSizes;

    @javax.inject.Inject
    public UnlockCardUseCase(com.paypal.oslo.feature.debitcard.servicing.domain.repository.DebitCardServicingRepository debitCardServicingRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardServicingRepository, "");
        this.getHighSpeedVideoSizes = debitCardServicingRepository;
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.domain.usecase.UseCase
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.debitcard.servicing.domain.unlockcard.model.UnlockCardRequest unlockCardRequest, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<? extends com.paypal.oslo.feature.debitcard.servicing.domain.unlockcard.model.UnlockCardResult>> continuation) {
        return invoke2(unlockCardRequest, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.servicing.domain.unlockcard.model.UnlockCardResult>>) continuation);
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.domain.usecase.UseCase
    public final /* bridge */ <T> com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.servicing.domain.unlockcard.model.UnlockCardResult> toUseCaseResult(arrow.core.Ior<? extends com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError, ? extends T> ior, kotlin.jvm.functions.Function1<? super T, com.paypal.oslo.feature.debitcard.servicing.domain.unlockcard.model.UnlockCardResult> function1) {
        return super.toUseCaseResult(ior, function1);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke2(com.paypal.oslo.feature.debitcard.servicing.domain.unlockcard.model.UnlockCardRequest unlockCardRequest, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.servicing.domain.unlockcard.model.UnlockCardResult>> continuation) {
        com.paypal.oslo.feature.debitcard.servicing.domain.usecase.UnlockCardUseCase$invoke$1 unlockCardUseCase$invoke$1;
        int i;
        com.paypal.oslo.feature.debitcard.servicing.domain.usecase.UnlockCardUseCase unlockCardUseCase;
        if (continuation instanceof com.paypal.oslo.feature.debitcard.servicing.domain.usecase.UnlockCardUseCase$invoke$1) {
            unlockCardUseCase$invoke$1 = (com.paypal.oslo.feature.debitcard.servicing.domain.usecase.UnlockCardUseCase$invoke$1) continuation;
            if ((unlockCardUseCase$invoke$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                unlockCardUseCase$invoke$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = unlockCardUseCase$invoke$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = unlockCardUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.debitcard.servicing.domain.repository.DebitCardServicingRepository debitCardServicingRepository = this.getHighSpeedVideoSizes;
                    unlockCardUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(unlockCardRequest);
                    unlockCardUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = this;
                    unlockCardUseCase$invoke$1.getHighSpeedVideoFpsRanges = 1;
                    obj = debitCardServicingRepository.unlockCard(unlockCardRequest, unlockCardUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    unlockCardUseCase = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    unlockCardUseCase = (com.paypal.oslo.feature.debitcard.servicing.domain.usecase.UnlockCardUseCase) unlockCardUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return unlockCardUseCase.toUseCaseResult((arrow.core.Ior) obj, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.domain.usecase.UnlockCardUseCase$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.servicing.domain.usecase.UnlockCardUseCase.m14321$r8$lambda$lXmYxfNMlGCzT9cjyEhMLUgQsE((com.paypal.oslo.feature.debitcard.servicing.domain.unlockcard.model.UnlockCardResult) obj2);
                    }
                });
            }
        }
        unlockCardUseCase$invoke$1 = new com.paypal.oslo.feature.debitcard.servicing.domain.usecase.UnlockCardUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = unlockCardUseCase$invoke$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = unlockCardUseCase$invoke$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        return unlockCardUseCase.toUseCaseResult((arrow.core.Ior) obj2, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.domain.usecase.UnlockCardUseCase$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj22) {
                return com.paypal.oslo.feature.debitcard.servicing.domain.usecase.UnlockCardUseCase.m14321$r8$lambda$lXmYxfNMlGCzT9cjyEhMLUgQsE((com.paypal.oslo.feature.debitcard.servicing.domain.unlockcard.model.UnlockCardResult) obj22);
            }
        });
    }

    /* renamed from: $r8$lambda$lXmYxfNMlGCzT9cjy-EhMLUgQsE, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.domain.unlockcard.model.UnlockCardResult m14321$r8$lambda$lXmYxfNMlGCzT9cjyEhMLUgQsE(com.paypal.oslo.feature.debitcard.servicing.domain.unlockcard.model.UnlockCardResult unlockCardResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unlockCardResult, "");
        return unlockCardResult;
    }
}
