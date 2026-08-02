package com.paypal.oslo.feature.subscriptions.cancel.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0086B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/cancel/domain/usecase/DisableAgreementUseCase;", "", "Lcom/paypal/oslo/feature/subscriptions/cancel/domain/repository/DisableAgreementRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/cancel/domain/repository/DisableAgreementRepository;)V", "", "agreementId", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "agreementType", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsError;", "", "invoke", "(Ljava/lang/String;Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/subscriptions/cancel/domain/repository/DisableAgreementRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DisableAgreementUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.subscriptions.cancel.domain.repository.DisableAgreementRepository getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public DisableAgreementUseCase(com.paypal.oslo.feature.subscriptions.cancel.domain.repository.DisableAgreementRepository disableAgreementRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disableAgreementRepository, "");
        this.getHighSpeedVideoFpsRanges = disableAgreementRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(java.lang.String str, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError, java.lang.Boolean>> continuation) {
        com.paypal.oslo.feature.subscriptions.cancel.domain.usecase.DisableAgreementUseCase$invoke$1 disableAgreementUseCase$invoke$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.subscriptions.cancel.domain.usecase.DisableAgreementUseCase$invoke$1) {
            disableAgreementUseCase$invoke$1 = (com.paypal.oslo.feature.subscriptions.cancel.domain.usecase.DisableAgreementUseCase$invoke$1) continuation;
            if ((disableAgreementUseCase$invoke$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                disableAgreementUseCase$invoke$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = disableAgreementUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = disableAgreementUseCase$invoke$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.subscriptions.cancel.domain.repository.DisableAgreementRepository disableAgreementRepository = this.getHighSpeedVideoFpsRanges;
                    disableAgreementUseCase$invoke$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    disableAgreementUseCase$invoke$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(agreementType);
                    disableAgreementUseCase$invoke$1.Camera2StreamConfigurationMap = 1;
                    obj = disableAgreementRepository.disableConsumerAgreement(str, agreementType, disableAgreementUseCase$invoke$1);
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
        disableAgreementUseCase$invoke$1 = new com.paypal.oslo.feature.subscriptions.cancel.domain.usecase.DisableAgreementUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = disableAgreementUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = disableAgreementUseCase$invoke$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        return ((arrow.core.Ior) obj2).toEither();
    }
}
