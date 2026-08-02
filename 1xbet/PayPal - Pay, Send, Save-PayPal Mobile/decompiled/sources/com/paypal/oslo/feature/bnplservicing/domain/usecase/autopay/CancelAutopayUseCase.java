package com.paypal.oslo.feature.bnplservicing.domain.usecase.autopay;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/usecase/autopay/CancelAutopayUseCase;", "Lcom/paypal/oslo/feature/bnplservicing/domain/usecase/BaseUseCase;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/autopay/input/CancelAutoPayInput;", "Lcom/paypal/oslo/feature/bnplservicing/domain/repository/AutopayRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/domain/repository/AutopayRepository;)V", "request", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/UseCaseResult;", "invoke", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/autopay/input/CancelAutoPayInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/bnplservicing/domain/repository/AutopayRepository;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CancelAutopayUseCase extends com.paypal.oslo.feature.bnplservicing.domain.usecase.BaseUseCase<com.paypal.oslo.feature.bnplservicing.domain.model.autopay.input.CancelAutoPayInput> {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplservicing.domain.repository.AutopayRepository getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public CancelAutopayUseCase(com.paypal.oslo.feature.bnplservicing.domain.repository.AutopayRepository autopayRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autopayRepository, "");
        this.getHighResolutionOutputSizeshNQ4ISI = autopayRepository;
    }

    @Override // com.paypal.oslo.feature.bnplservicing.domain.usecase.BaseUseCase
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.bnplservicing.domain.model.autopay.input.CancelAutoPayInput cancelAutoPayInput, kotlin.coroutines.Continuation continuation) {
        return invoke2(cancelAutoPayInput, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult<?>>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke2(com.paypal.oslo.feature.bnplservicing.domain.model.autopay.input.CancelAutoPayInput cancelAutoPayInput, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult<?>> continuation) {
        com.paypal.oslo.feature.bnplservicing.domain.usecase.autopay.CancelAutopayUseCase$invoke$1 cancelAutopayUseCase$invoke$1;
        int i;
        com.paypal.oslo.feature.bnplservicing.domain.usecase.autopay.CancelAutopayUseCase cancelAutopayUseCase;
        if (continuation instanceof com.paypal.oslo.feature.bnplservicing.domain.usecase.autopay.CancelAutopayUseCase$invoke$1) {
            cancelAutopayUseCase$invoke$1 = (com.paypal.oslo.feature.bnplservicing.domain.usecase.autopay.CancelAutopayUseCase$invoke$1) continuation;
            if ((cancelAutopayUseCase$invoke$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                cancelAutopayUseCase$invoke$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = cancelAutopayUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cancelAutopayUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.bnplservicing.domain.repository.AutopayRepository autopayRepository = this.getHighResolutionOutputSizeshNQ4ISI;
                    cancelAutopayUseCase$invoke$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cancelAutoPayInput);
                    cancelAutopayUseCase$invoke$1.getHighSpeedVideoSizes = this;
                    cancelAutopayUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = autopayRepository.cancelAutopay(cancelAutoPayInput, cancelAutopayUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    cancelAutopayUseCase = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cancelAutopayUseCase = (com.paypal.oslo.feature.bnplservicing.domain.usecase.autopay.CancelAutopayUseCase) cancelAutopayUseCase$invoke$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return cancelAutopayUseCase.toUseCaseResult((arrow.core.Ior) obj, false);
            }
        }
        cancelAutopayUseCase$invoke$1 = new com.paypal.oslo.feature.bnplservicing.domain.usecase.autopay.CancelAutopayUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = cancelAutopayUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cancelAutopayUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        return cancelAutopayUseCase.toUseCaseResult((arrow.core.Ior) obj2, false);
    }
}
