package com.paypal.oslo.feature.subscriptions.bulkfi.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/bulkfi/domain/usecase/GetConsumerAgreementsByFundingInstrumentUseCase;", "", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/domain/repository/BulkUpdateFiRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/bulkfi/domain/repository/BulkUpdateFiRepository;)V", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "agreementType", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsError;", "", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/domain/model/BulkUpdateFiData;", "invoke", "(Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/domain/repository/BulkUpdateFiRepository;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GetConsumerAgreementsByFundingInstrumentUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.subscriptions.bulkfi.domain.repository.BulkUpdateFiRepository getHighSpeedVideoSizes;

    @javax.inject.Inject
    public GetConsumerAgreementsByFundingInstrumentUseCase(com.paypal.oslo.feature.subscriptions.bulkfi.domain.repository.BulkUpdateFiRepository bulkUpdateFiRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bulkUpdateFiRepository, "");
        this.getHighSpeedVideoSizes = bulkUpdateFiRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError, ? extends java.util.List<com.paypal.oslo.feature.subscriptions.bulkfi.domain.model.BulkUpdateFiData>>> continuation) {
        com.paypal.oslo.feature.subscriptions.bulkfi.domain.usecase.GetConsumerAgreementsByFundingInstrumentUseCase$invoke$1 getConsumerAgreementsByFundingInstrumentUseCase$invoke$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.subscriptions.bulkfi.domain.usecase.GetConsumerAgreementsByFundingInstrumentUseCase$invoke$1) {
            getConsumerAgreementsByFundingInstrumentUseCase$invoke$1 = (com.paypal.oslo.feature.subscriptions.bulkfi.domain.usecase.GetConsumerAgreementsByFundingInstrumentUseCase$invoke$1) continuation;
            if ((getConsumerAgreementsByFundingInstrumentUseCase$invoke$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                getConsumerAgreementsByFundingInstrumentUseCase$invoke$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = getConsumerAgreementsByFundingInstrumentUseCase$invoke$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getConsumerAgreementsByFundingInstrumentUseCase$invoke$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.subscriptions.bulkfi.domain.repository.BulkUpdateFiRepository bulkUpdateFiRepository = this.getHighSpeedVideoSizes;
                    getConsumerAgreementsByFundingInstrumentUseCase$invoke$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(agreementType);
                    getConsumerAgreementsByFundingInstrumentUseCase$invoke$1.Camera2StreamConfigurationMap = 1;
                    obj = bulkUpdateFiRepository.getConsumerAgreementsByFundingInstrument(agreementType, getConsumerAgreementsByFundingInstrumentUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return ((arrow.core.Ior) obj).toEither();
            }
        }
        getConsumerAgreementsByFundingInstrumentUseCase$invoke$1 = new com.paypal.oslo.feature.subscriptions.bulkfi.domain.usecase.GetConsumerAgreementsByFundingInstrumentUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = getConsumerAgreementsByFundingInstrumentUseCase$invoke$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getConsumerAgreementsByFundingInstrumentUseCase$invoke$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        return ((arrow.core.Ior) obj2).toEither();
    }
}
