package com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JF\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0086B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/updatefi/domain/usecase/UpdatePreferredFundingInstrumentUseCase;", "", "Lcom/paypal/oslo/feature/subscriptions/updatefi/domain/repository/UpdateFiRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/updatefi/domain/repository/UpdateFiRepository;)V", "", "", "agreementIds", "fundingInstrumentId", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/BalancePreference;", "balancePreference", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "agreementType", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsError;", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/BulkUpdateFiResult;", "invoke", "(Ljava/util/List;Ljava/lang/String;Lcom/paypal/oslo/feature/subscriptions/shared/domain/BalancePreference;Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/subscriptions/updatefi/domain/repository/UpdateFiRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UpdatePreferredFundingInstrumentUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.subscriptions.updatefi.domain.repository.UpdateFiRepository Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public UpdatePreferredFundingInstrumentUseCase(com.paypal.oslo.feature.subscriptions.updatefi.domain.repository.UpdateFiRepository updateFiRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateFiRepository, "");
        this.Camera2StreamConfigurationMap = updateFiRepository;
    }

    public static /* synthetic */ java.lang.Object invoke$default(com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase.UpdatePreferredFundingInstrumentUseCase updatePreferredFundingInstrumentUseCase, java.util.List list, java.lang.String str, com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            balancePreference = null;
        }
        return updatePreferredFundingInstrumentUseCase.invoke(list, str, balancePreference, agreementType, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(java.util.List<java.lang.String> list, java.lang.String str, com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError, com.paypal.oslo.feature.subscriptions.shared.domain.model.BulkUpdateFiResult>> continuation) {
        com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase.UpdatePreferredFundingInstrumentUseCase$invoke$1 updatePreferredFundingInstrumentUseCase$invoke$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase.UpdatePreferredFundingInstrumentUseCase$invoke$1) {
            updatePreferredFundingInstrumentUseCase$invoke$1 = (com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase.UpdatePreferredFundingInstrumentUseCase$invoke$1) continuation;
            if ((updatePreferredFundingInstrumentUseCase$invoke$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                updatePreferredFundingInstrumentUseCase$invoke$1.getHighSpeedVideoSizes -= 2147483648;
                com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase.UpdatePreferredFundingInstrumentUseCase$invoke$1 updatePreferredFundingInstrumentUseCase$invoke$12 = updatePreferredFundingInstrumentUseCase$invoke$1;
                java.lang.Object obj = updatePreferredFundingInstrumentUseCase$invoke$12.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = updatePreferredFundingInstrumentUseCase$invoke$12.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.subscriptions.updatefi.domain.repository.UpdateFiRepository updateFiRepository = this.Camera2StreamConfigurationMap;
                    updatePreferredFundingInstrumentUseCase$invoke$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                    updatePreferredFundingInstrumentUseCase$invoke$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    updatePreferredFundingInstrumentUseCase$invoke$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(balancePreference);
                    updatePreferredFundingInstrumentUseCase$invoke$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(agreementType);
                    updatePreferredFundingInstrumentUseCase$invoke$12.getHighSpeedVideoSizes = 1;
                    obj = updateFiRepository.updatePreferredFundingInstrument(list, str, balancePreference, agreementType, updatePreferredFundingInstrumentUseCase$invoke$12);
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
        updatePreferredFundingInstrumentUseCase$invoke$1 = new com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase.UpdatePreferredFundingInstrumentUseCase$invoke$1(this, continuation);
        com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase.UpdatePreferredFundingInstrumentUseCase$invoke$1 updatePreferredFundingInstrumentUseCase$invoke$122 = updatePreferredFundingInstrumentUseCase$invoke$1;
        java.lang.Object obj2 = updatePreferredFundingInstrumentUseCase$invoke$122.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = updatePreferredFundingInstrumentUseCase$invoke$122.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        return ((arrow.core.Ior) obj2).toEither();
    }
}
