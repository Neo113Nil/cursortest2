package com.paypal.oslo.feature.debitcard.servicing.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/SetDebitPinUseCase;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/usecase/UseCase;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/debitpin/model/SetDebitPinRequest;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/debitpin/model/SetDebitPinResult;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/repository/DebitCardServicingRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/repository/DebitCardServicingRepository;)V", "request", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/UseCaseResult;", "invoke", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/debitpin/model/SetDebitPinRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/repository/DebitCardServicingRepository;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SetDebitPinUseCase implements com.paypal.oslo.feature.debitcard.shared.domain.usecase.UseCase<com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinRequest, com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinResult> {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.servicing.domain.repository.DebitCardServicingRepository Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public SetDebitPinUseCase(com.paypal.oslo.feature.debitcard.servicing.domain.repository.DebitCardServicingRepository debitCardServicingRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardServicingRepository, "");
        this.Camera2StreamConfigurationMap = debitCardServicingRepository;
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.domain.usecase.UseCase
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinRequest setDebitPinRequest, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<? extends com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinResult>> continuation) {
        return invoke2(setDebitPinRequest, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinResult>>) continuation);
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.domain.usecase.UseCase
    public final /* bridge */ <T> com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinResult> toUseCaseResult(arrow.core.Ior<? extends com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError, ? extends T> ior, kotlin.jvm.functions.Function1<? super T, com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinResult> function1) {
        return super.toUseCaseResult(ior, function1);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke2(com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinRequest setDebitPinRequest, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinResult>> continuation) {
        com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SetDebitPinUseCase$invoke$1 setDebitPinUseCase$invoke$1;
        int i;
        com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SetDebitPinUseCase setDebitPinUseCase;
        if (continuation instanceof com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SetDebitPinUseCase$invoke$1) {
            setDebitPinUseCase$invoke$1 = (com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SetDebitPinUseCase$invoke$1) continuation;
            if ((setDebitPinUseCase$invoke$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                setDebitPinUseCase$invoke$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = setDebitPinUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = setDebitPinUseCase$invoke$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.debitcard.servicing.domain.repository.DebitCardServicingRepository debitCardServicingRepository = this.Camera2StreamConfigurationMap;
                    setDebitPinUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(setDebitPinRequest);
                    setDebitPinUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = this;
                    setDebitPinUseCase$invoke$1.getHighSpeedVideoSizes = 1;
                    obj = debitCardServicingRepository.setDebitPin(setDebitPinRequest, setDebitPinUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    setDebitPinUseCase = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    setDebitPinUseCase = (com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SetDebitPinUseCase) setDebitPinUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return setDebitPinUseCase.toUseCaseResult((arrow.core.Ior) obj, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SetDebitPinUseCase$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SetDebitPinUseCase.$r8$lambda$Z2_y7yirWxNOp8IpsAjGl1eWlQ4((com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinResult) obj2);
                    }
                });
            }
        }
        setDebitPinUseCase$invoke$1 = new com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SetDebitPinUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = setDebitPinUseCase$invoke$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = setDebitPinUseCase$invoke$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        return setDebitPinUseCase.toUseCaseResult((arrow.core.Ior) obj2, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SetDebitPinUseCase$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj22) {
                return com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SetDebitPinUseCase.$r8$lambda$Z2_y7yirWxNOp8IpsAjGl1eWlQ4((com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinResult) obj22);
            }
        });
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinResult $r8$lambda$Z2_y7yirWxNOp8IpsAjGl1eWlQ4(com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinResult setDebitPinResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setDebitPinResult, "");
        return setDebitPinResult;
    }
}
