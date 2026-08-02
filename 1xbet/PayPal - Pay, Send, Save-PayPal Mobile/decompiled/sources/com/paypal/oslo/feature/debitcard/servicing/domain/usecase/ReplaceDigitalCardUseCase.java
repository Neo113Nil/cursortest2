package com.paypal.oslo.feature.debitcard.servicing.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/ReplaceDigitalCardUseCase;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/usecase/UseCase;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/replacedigitalcard/model/ReplaceDigitalCardRequest;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/replacedigitalcard/model/ReplaceDigitalCardResponse;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/repository/DebitCardServicingRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/repository/DebitCardServicingRepository;)V", "request", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/UseCaseResult;", "invoke", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/replacedigitalcard/model/ReplaceDigitalCardRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/repository/DebitCardServicingRepository;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ReplaceDigitalCardUseCase implements com.paypal.oslo.feature.debitcard.shared.domain.usecase.UseCase<com.paypal.oslo.feature.debitcard.servicing.domain.replacedigitalcard.model.ReplaceDigitalCardRequest, com.paypal.oslo.feature.debitcard.servicing.domain.replacedigitalcard.model.ReplaceDigitalCardResponse> {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.servicing.domain.repository.DebitCardServicingRepository getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public ReplaceDigitalCardUseCase(com.paypal.oslo.feature.debitcard.servicing.domain.repository.DebitCardServicingRepository debitCardServicingRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardServicingRepository, "");
        this.getHighResolutionOutputSizeshNQ4ISI = debitCardServicingRepository;
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.domain.usecase.UseCase
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.debitcard.servicing.domain.replacedigitalcard.model.ReplaceDigitalCardRequest replaceDigitalCardRequest, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<? extends com.paypal.oslo.feature.debitcard.servicing.domain.replacedigitalcard.model.ReplaceDigitalCardResponse>> continuation) {
        return invoke2(replaceDigitalCardRequest, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.servicing.domain.replacedigitalcard.model.ReplaceDigitalCardResponse>>) continuation);
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.domain.usecase.UseCase
    public final /* bridge */ <T> com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.servicing.domain.replacedigitalcard.model.ReplaceDigitalCardResponse> toUseCaseResult(arrow.core.Ior<? extends com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError, ? extends T> ior, kotlin.jvm.functions.Function1<? super T, com.paypal.oslo.feature.debitcard.servicing.domain.replacedigitalcard.model.ReplaceDigitalCardResponse> function1) {
        return super.toUseCaseResult(ior, function1);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke2(com.paypal.oslo.feature.debitcard.servicing.domain.replacedigitalcard.model.ReplaceDigitalCardRequest replaceDigitalCardRequest, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.servicing.domain.replacedigitalcard.model.ReplaceDigitalCardResponse>> continuation) {
        com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ReplaceDigitalCardUseCase$invoke$1 replaceDigitalCardUseCase$invoke$1;
        int i;
        com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ReplaceDigitalCardUseCase replaceDigitalCardUseCase;
        if (continuation instanceof com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ReplaceDigitalCardUseCase$invoke$1) {
            replaceDigitalCardUseCase$invoke$1 = (com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ReplaceDigitalCardUseCase$invoke$1) continuation;
            if ((replaceDigitalCardUseCase$invoke$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                replaceDigitalCardUseCase$invoke$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = replaceDigitalCardUseCase$invoke$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = replaceDigitalCardUseCase$invoke$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.debitcard.servicing.domain.repository.DebitCardServicingRepository debitCardServicingRepository = this.getHighResolutionOutputSizeshNQ4ISI;
                    replaceDigitalCardUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(replaceDigitalCardRequest);
                    replaceDigitalCardUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = this;
                    replaceDigitalCardUseCase$invoke$1.getHighSpeedVideoSizes = 1;
                    obj = debitCardServicingRepository.replaceDigitalCard(replaceDigitalCardRequest, replaceDigitalCardUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    replaceDigitalCardUseCase = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    replaceDigitalCardUseCase = (com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ReplaceDigitalCardUseCase) replaceDigitalCardUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return replaceDigitalCardUseCase.toUseCaseResult((arrow.core.Ior) obj, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ReplaceDigitalCardUseCase$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ReplaceDigitalCardUseCase.m14320$r8$lambda$nkQsQfWpNDQpboefIWhpqsRdkw((com.paypal.oslo.feature.debitcard.servicing.domain.replacedigitalcard.model.ReplaceDigitalCardResponse) obj2);
                    }
                });
            }
        }
        replaceDigitalCardUseCase$invoke$1 = new com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ReplaceDigitalCardUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = replaceDigitalCardUseCase$invoke$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = replaceDigitalCardUseCase$invoke$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        return replaceDigitalCardUseCase.toUseCaseResult((arrow.core.Ior) obj2, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ReplaceDigitalCardUseCase$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj22) {
                return com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ReplaceDigitalCardUseCase.m14320$r8$lambda$nkQsQfWpNDQpboefIWhpqsRdkw((com.paypal.oslo.feature.debitcard.servicing.domain.replacedigitalcard.model.ReplaceDigitalCardResponse) obj22);
            }
        });
    }

    /* renamed from: $r8$lambda$nkQsQfWpNDQpboefIWhpqsRd-kw, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.domain.replacedigitalcard.model.ReplaceDigitalCardResponse m14320$r8$lambda$nkQsQfWpNDQpboefIWhpqsRdkw(com.paypal.oslo.feature.debitcard.servicing.domain.replacedigitalcard.model.ReplaceDigitalCardResponse replaceDigitalCardResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(replaceDigitalCardResponse, "");
        return replaceDigitalCardResponse;
    }
}
