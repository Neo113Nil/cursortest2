package com.paypal.oslo.feature.cardconnect.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/cardconnect/domain/usecase/CheckCardConnectEligibilityUseCase;", "Lcom/paypal/oslo/feature/cardconnect/shared/domain/usecase/UseCase;", "Lcom/paypal/oslo/feature/cardconnect/domain/model/CardConnectEligibilityRequest;", "Lcom/paypal/oslo/feature/cardconnect/domain/model/CardConnectEligibilityResponse;", "Lcom/paypal/oslo/feature/cardconnect/domain/repository/CardConnectRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/cardconnect/domain/repository/CardConnectRepository;)V", "request", "Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/UseCaseResult;", "invoke", "(Lcom/paypal/oslo/feature/cardconnect/domain/model/CardConnectEligibilityRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/cardconnect/domain/repository/CardConnectRepository;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CheckCardConnectEligibilityUseCase implements com.paypal.oslo.feature.cardconnect.shared.domain.usecase.UseCase<com.paypal.oslo.feature.cardconnect.domain.model.CardConnectEligibilityRequest, com.paypal.oslo.feature.cardconnect.domain.model.CardConnectEligibilityResponse> {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cardconnect.domain.repository.CardConnectRepository getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public CheckCardConnectEligibilityUseCase(com.paypal.oslo.feature.cardconnect.domain.repository.CardConnectRepository cardConnectRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardConnectRepository, "");
        this.getHighResolutionOutputSizeshNQ4ISI = cardConnectRepository;
    }

    @Override // com.paypal.oslo.feature.cardconnect.shared.domain.usecase.UseCase
    public final /* bridge */ <T> com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.cardconnect.domain.model.CardConnectEligibilityResponse> toUseCaseResult(arrow.core.Ior<? extends com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError, ? extends T> ior, kotlin.jvm.functions.Function1<? super T, ? extends com.paypal.oslo.feature.cardconnect.domain.model.CardConnectEligibilityResponse> function1) {
        return super.toUseCaseResult(ior, function1);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.cardconnect.shared.domain.usecase.UseCase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.feature.cardconnect.domain.model.CardConnectEligibilityRequest cardConnectEligibilityRequest, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult<? extends com.paypal.oslo.feature.cardconnect.domain.model.CardConnectEligibilityResponse>> continuation) {
        com.paypal.oslo.feature.cardconnect.domain.usecase.CheckCardConnectEligibilityUseCase$invoke$1 checkCardConnectEligibilityUseCase$invoke$1;
        int i;
        com.paypal.oslo.feature.cardconnect.domain.usecase.CheckCardConnectEligibilityUseCase checkCardConnectEligibilityUseCase;
        if (continuation instanceof com.paypal.oslo.feature.cardconnect.domain.usecase.CheckCardConnectEligibilityUseCase$invoke$1) {
            checkCardConnectEligibilityUseCase$invoke$1 = (com.paypal.oslo.feature.cardconnect.domain.usecase.CheckCardConnectEligibilityUseCase$invoke$1) continuation;
            if ((checkCardConnectEligibilityUseCase$invoke$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                checkCardConnectEligibilityUseCase$invoke$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = checkCardConnectEligibilityUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = checkCardConnectEligibilityUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.cardconnect.domain.repository.CardConnectRepository cardConnectRepository = this.getHighResolutionOutputSizeshNQ4ISI;
                    checkCardConnectEligibilityUseCase$invoke$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardConnectEligibilityRequest);
                    checkCardConnectEligibilityUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = this;
                    checkCardConnectEligibilityUseCase$invoke$1.getHighSpeedVideoFpsRanges = 1;
                    obj = cardConnectRepository.checkEligibility(cardConnectEligibilityRequest, checkCardConnectEligibilityUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    checkCardConnectEligibilityUseCase = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    checkCardConnectEligibilityUseCase = (com.paypal.oslo.feature.cardconnect.domain.usecase.CheckCardConnectEligibilityUseCase) checkCardConnectEligibilityUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return checkCardConnectEligibilityUseCase.toUseCaseResult((arrow.core.Ior) obj, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cardconnect.domain.usecase.CheckCardConnectEligibilityUseCase$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.cardconnect.domain.usecase.CheckCardConnectEligibilityUseCase.m13380$r8$lambda$a6iH1OnLTIkqQv7OuO6tCqvsCw((com.paypal.oslo.feature.cardconnect.domain.model.CardConnectEligibilityResponse) obj2);
                    }
                });
            }
        }
        checkCardConnectEligibilityUseCase$invoke$1 = new com.paypal.oslo.feature.cardconnect.domain.usecase.CheckCardConnectEligibilityUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = checkCardConnectEligibilityUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = checkCardConnectEligibilityUseCase$invoke$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        return checkCardConnectEligibilityUseCase.toUseCaseResult((arrow.core.Ior) obj2, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cardconnect.domain.usecase.CheckCardConnectEligibilityUseCase$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj22) {
                return com.paypal.oslo.feature.cardconnect.domain.usecase.CheckCardConnectEligibilityUseCase.m13380$r8$lambda$a6iH1OnLTIkqQv7OuO6tCqvsCw((com.paypal.oslo.feature.cardconnect.domain.model.CardConnectEligibilityResponse) obj22);
            }
        });
    }

    /* renamed from: $r8$lambda$a6-iH1OnLTIkqQv7OuO6tCqvsCw, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.cardconnect.domain.model.CardConnectEligibilityResponse m13380$r8$lambda$a6iH1OnLTIkqQv7OuO6tCqvsCw(com.paypal.oslo.feature.cardconnect.domain.model.CardConnectEligibilityResponse cardConnectEligibilityResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardConnectEligibilityResponse, "");
        return cardConnectEligibilityResponse;
    }
}
