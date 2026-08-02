package com.paypal.oslo.feature.debitcard.servicing.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/DebitInstrumentForRequestPhysicalCardUseCase;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/usecase/UseCase;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/requestphysicalcard/model/DebitInstrumentForRequestPhysicalCardRequest;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/requestphysicalcard/model/DebitInstrumentForRequestPhysicalCardResponse;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/repository/DebitCardServicingRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/repository/DebitCardServicingRepository;)V", "request", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/UseCaseResult;", "invoke", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/requestphysicalcard/model/DebitInstrumentForRequestPhysicalCardRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/repository/DebitCardServicingRepository;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitInstrumentForRequestPhysicalCardUseCase implements com.paypal.oslo.feature.debitcard.shared.domain.usecase.UseCase<com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardRequest, com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardResponse> {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.servicing.domain.repository.DebitCardServicingRepository getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public DebitInstrumentForRequestPhysicalCardUseCase(com.paypal.oslo.feature.debitcard.servicing.domain.repository.DebitCardServicingRepository debitCardServicingRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardServicingRepository, "");
        this.getHighSpeedVideoFpsRanges = debitCardServicingRepository;
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.domain.usecase.UseCase
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardRequest debitInstrumentForRequestPhysicalCardRequest, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<? extends com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardResponse>> continuation) {
        return invoke2(debitInstrumentForRequestPhysicalCardRequest, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardResponse>>) continuation);
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.domain.usecase.UseCase
    public final /* bridge */ <T> com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardResponse> toUseCaseResult(arrow.core.Ior<? extends com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError, ? extends T> ior, kotlin.jvm.functions.Function1<? super T, com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardResponse> function1) {
        return super.toUseCaseResult(ior, function1);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke2(com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardRequest debitInstrumentForRequestPhysicalCardRequest, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardResponse>> continuation) {
        com.paypal.oslo.feature.debitcard.servicing.domain.usecase.DebitInstrumentForRequestPhysicalCardUseCase$invoke$1 debitInstrumentForRequestPhysicalCardUseCase$invoke$1;
        int i;
        com.paypal.oslo.feature.debitcard.servicing.domain.usecase.DebitInstrumentForRequestPhysicalCardUseCase debitInstrumentForRequestPhysicalCardUseCase;
        if (continuation instanceof com.paypal.oslo.feature.debitcard.servicing.domain.usecase.DebitInstrumentForRequestPhysicalCardUseCase$invoke$1) {
            debitInstrumentForRequestPhysicalCardUseCase$invoke$1 = (com.paypal.oslo.feature.debitcard.servicing.domain.usecase.DebitInstrumentForRequestPhysicalCardUseCase$invoke$1) continuation;
            if ((debitInstrumentForRequestPhysicalCardUseCase$invoke$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                debitInstrumentForRequestPhysicalCardUseCase$invoke$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = debitInstrumentForRequestPhysicalCardUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = debitInstrumentForRequestPhysicalCardUseCase$invoke$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.debitcard.servicing.domain.repository.DebitCardServicingRepository debitCardServicingRepository = this.getHighSpeedVideoFpsRanges;
                    java.lang.String productName = debitInstrumentForRequestPhysicalCardRequest.getProductName();
                    java.lang.String instrumentId = debitInstrumentForRequestPhysicalCardRequest.getInstrumentId();
                    debitInstrumentForRequestPhysicalCardUseCase$invoke$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(debitInstrumentForRequestPhysicalCardRequest);
                    debitInstrumentForRequestPhysicalCardUseCase$invoke$1.getHighSpeedVideoSizes = this;
                    debitInstrumentForRequestPhysicalCardUseCase$invoke$1.Camera2StreamConfigurationMap = 1;
                    obj = debitCardServicingRepository.debitInstrumentForRequestPhysicalCard(productName, instrumentId, debitInstrumentForRequestPhysicalCardUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    debitInstrumentForRequestPhysicalCardUseCase = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    debitInstrumentForRequestPhysicalCardUseCase = (com.paypal.oslo.feature.debitcard.servicing.domain.usecase.DebitInstrumentForRequestPhysicalCardUseCase) debitInstrumentForRequestPhysicalCardUseCase$invoke$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return debitInstrumentForRequestPhysicalCardUseCase.toUseCaseResult((arrow.core.Ior) obj, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.domain.usecase.DebitInstrumentForRequestPhysicalCardUseCase$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.servicing.domain.usecase.DebitInstrumentForRequestPhysicalCardUseCase.m14315$r8$lambda$n9U3zm47ofEZg49FiG76jA8OGg((com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardResponse) obj2);
                    }
                });
            }
        }
        debitInstrumentForRequestPhysicalCardUseCase$invoke$1 = new com.paypal.oslo.feature.debitcard.servicing.domain.usecase.DebitInstrumentForRequestPhysicalCardUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = debitInstrumentForRequestPhysicalCardUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = debitInstrumentForRequestPhysicalCardUseCase$invoke$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        return debitInstrumentForRequestPhysicalCardUseCase.toUseCaseResult((arrow.core.Ior) obj2, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.domain.usecase.DebitInstrumentForRequestPhysicalCardUseCase$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj22) {
                return com.paypal.oslo.feature.debitcard.servicing.domain.usecase.DebitInstrumentForRequestPhysicalCardUseCase.m14315$r8$lambda$n9U3zm47ofEZg49FiG76jA8OGg((com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardResponse) obj22);
            }
        });
    }

    /* renamed from: $r8$lambda$n9U3zm-47ofEZg49FiG76jA8OGg, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardResponse m14315$r8$lambda$n9U3zm47ofEZg49FiG76jA8OGg(com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardResponse debitInstrumentForRequestPhysicalCardResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentForRequestPhysicalCardResponse, "");
        return debitInstrumentForRequestPhysicalCardResponse;
    }
}
