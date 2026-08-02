package com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/domain/usecase/fundingoptions/SetDebitCardFundingOptionsUseCase;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/usecase/UseCase;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/SetDebitCardFundingOptionsRequest;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/SetDebitCardFundingOptionsResult;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/repository/fundingoptions/FundingOptionsRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/repository/fundingoptions/FundingOptionsRepository;)V", "request", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/UseCaseResult;", "invoke", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/SetDebitCardFundingOptionsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/debitcard/shared/domain/repository/fundingoptions/FundingOptionsRepository;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SetDebitCardFundingOptionsUseCase implements com.paypal.oslo.feature.debitcard.shared.domain.usecase.UseCase<com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SetDebitCardFundingOptionsRequest, com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SetDebitCardFundingOptionsResult> {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.shared.domain.repository.fundingoptions.FundingOptionsRepository getHighSpeedVideoSizes;

    @javax.inject.Inject
    public SetDebitCardFundingOptionsUseCase(com.paypal.oslo.feature.debitcard.shared.domain.repository.fundingoptions.FundingOptionsRepository fundingOptionsRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingOptionsRepository, "");
        this.getHighSpeedVideoSizes = fundingOptionsRepository;
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.domain.usecase.UseCase
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SetDebitCardFundingOptionsRequest setDebitCardFundingOptionsRequest, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<? extends com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SetDebitCardFundingOptionsResult>> continuation) {
        return invoke2(setDebitCardFundingOptionsRequest, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SetDebitCardFundingOptionsResult>>) continuation);
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.domain.usecase.UseCase
    public final /* bridge */ <T> com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SetDebitCardFundingOptionsResult> toUseCaseResult(arrow.core.Ior<? extends com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError, ? extends T> ior, kotlin.jvm.functions.Function1<? super T, com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SetDebitCardFundingOptionsResult> function1) {
        return super.toUseCaseResult(ior, function1);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke2(com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SetDebitCardFundingOptionsRequest setDebitCardFundingOptionsRequest, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SetDebitCardFundingOptionsResult>> continuation) {
        com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.SetDebitCardFundingOptionsUseCase$invoke$1 setDebitCardFundingOptionsUseCase$invoke$1;
        int i;
        com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.SetDebitCardFundingOptionsUseCase setDebitCardFundingOptionsUseCase;
        if (continuation instanceof com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.SetDebitCardFundingOptionsUseCase$invoke$1) {
            setDebitCardFundingOptionsUseCase$invoke$1 = (com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.SetDebitCardFundingOptionsUseCase$invoke$1) continuation;
            if ((setDebitCardFundingOptionsUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                setDebitCardFundingOptionsUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = setDebitCardFundingOptionsUseCase$invoke$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = setDebitCardFundingOptionsUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.debitcard.shared.domain.repository.fundingoptions.FundingOptionsRepository fundingOptionsRepository = this.getHighSpeedVideoSizes;
                    setDebitCardFundingOptionsUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(setDebitCardFundingOptionsRequest);
                    setDebitCardFundingOptionsUseCase$invoke$1.Camera2StreamConfigurationMap = this;
                    setDebitCardFundingOptionsUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = fundingOptionsRepository.setDebitCardFundingOptions(setDebitCardFundingOptionsRequest, setDebitCardFundingOptionsUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    setDebitCardFundingOptionsUseCase = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    setDebitCardFundingOptionsUseCase = (com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.SetDebitCardFundingOptionsUseCase) setDebitCardFundingOptionsUseCase$invoke$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return setDebitCardFundingOptionsUseCase.toUseCaseResult((arrow.core.Ior) obj, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.SetDebitCardFundingOptionsUseCase$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.SetDebitCardFundingOptionsUseCase.$r8$lambda$GFlhaby_T3LSlCpKsmuWVyd4v7k((com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SetDebitCardFundingOptionsResult) obj2);
                    }
                });
            }
        }
        setDebitCardFundingOptionsUseCase$invoke$1 = new com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.SetDebitCardFundingOptionsUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = setDebitCardFundingOptionsUseCase$invoke$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = setDebitCardFundingOptionsUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        return setDebitCardFundingOptionsUseCase.toUseCaseResult((arrow.core.Ior) obj2, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.SetDebitCardFundingOptionsUseCase$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj22) {
                return com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.SetDebitCardFundingOptionsUseCase.$r8$lambda$GFlhaby_T3LSlCpKsmuWVyd4v7k((com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SetDebitCardFundingOptionsResult) obj22);
            }
        });
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SetDebitCardFundingOptionsResult $r8$lambda$GFlhaby_T3LSlCpKsmuWVyd4v7k(com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SetDebitCardFundingOptionsResult setDebitCardFundingOptionsResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setDebitCardFundingOptionsResult, "");
        return setDebitCardFundingOptionsResult;
    }
}
