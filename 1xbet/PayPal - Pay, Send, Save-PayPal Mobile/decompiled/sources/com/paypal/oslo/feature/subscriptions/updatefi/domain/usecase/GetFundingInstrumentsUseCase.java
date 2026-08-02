package com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0013B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J2\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0086B¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/updatefi/domain/usecase/GetFundingInstrumentsUseCase;", "", "Lcom/paypal/oslo/feature/subscriptions/updatefi/domain/repository/UpdateFiRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/updatefi/domain/repository/UpdateFiRepository;)V", "", "", "agreementIds", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "agreementType", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsError;", "Lcom/paypal/oslo/feature/subscriptions/updatefi/domain/usecase/GetFundingInstrumentsUseCase$Result;", "invoke", "(Ljava/util/List;Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/subscriptions/updatefi/domain/repository/UpdateFiRepository;", "getHighSpeedVideoFpsRangesFor", "Result"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GetFundingInstrumentsUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.subscriptions.updatefi.domain.repository.UpdateFiRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public GetFundingInstrumentsUseCase(com.paypal.oslo.feature.subscriptions.updatefi.domain.repository.UpdateFiRepository updateFiRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateFiRepository, "");
        this.getHighSpeedVideoFpsRangesFor = updateFiRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(java.util.List<java.lang.String> list, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError, com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase.GetFundingInstrumentsUseCase.Result>> continuation) {
        com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase.GetFundingInstrumentsUseCase$invoke$1 getFundingInstrumentsUseCase$invoke$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase.GetFundingInstrumentsUseCase$invoke$1) {
            getFundingInstrumentsUseCase$invoke$1 = (com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase.GetFundingInstrumentsUseCase$invoke$1) continuation;
            if ((getFundingInstrumentsUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                getFundingInstrumentsUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = getFundingInstrumentsUseCase$invoke$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getFundingInstrumentsUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                boolean z = true;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.subscriptions.updatefi.domain.repository.UpdateFiRepository updateFiRepository = this.getHighSpeedVideoFpsRangesFor;
                    getFundingInstrumentsUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                    getFundingInstrumentsUseCase$invoke$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(agreementType);
                    getFundingInstrumentsUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = updateFiRepository.getFundingInstruments(list, agreementType, getFundingInstrumentsUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = ((arrow.core.Ior) obj).toEither();
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.subscriptions.updatefi.domain.model.ConsumerAgreementFundingInstruments consumerAgreementFundingInstruments = (com.paypal.oslo.feature.subscriptions.updatefi.domain.model.ConsumerAgreementFundingInstruments) ((arrow.core.Either.Right) either).getValue();
                    java.util.List<com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument> fundingInstruments = consumerAgreementFundingInstruments.getFundingInstruments();
                    if (!(fundingInstruments instanceof java.util.Collection) || !fundingInstruments.isEmpty()) {
                        java.util.Iterator<T> it = fundingInstruments.iterator();
                        while (it.hasNext()) {
                            if (((com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument) it.next()).getType() == com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType.PAYPAL_DEBIT_CARD) {
                                break;
                            }
                        }
                    }
                    z = false;
                    return new arrow.core.Either.Right(new com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase.GetFundingInstrumentsUseCase.Result(consumerAgreementFundingInstruments, com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreferenceKt.isEnabled(consumerAgreementFundingInstruments.getBalancePreference()), z));
                }
                if (either instanceof arrow.core.Either.Left) {
                    return either;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        getFundingInstrumentsUseCase$invoke$1 = new com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase.GetFundingInstrumentsUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = getFundingInstrumentsUseCase$invoke$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getFundingInstrumentsUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
        boolean z2 = true;
        if (i != 0) {
        }
        either = ((arrow.core.Ior) obj2).toEither();
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u0005\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/updatefi/domain/usecase/GetFundingInstrumentsUseCase$Result;", "", "Lcom/paypal/oslo/feature/subscriptions/updatefi/domain/model/ConsumerAgreementFundingInstruments;", "consumerAgreementFundingInstruments", "", "isBalancePreferenceEnabled", "hasPayPalDebitCard", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/updatefi/domain/model/ConsumerAgreementFundingInstruments;ZZ)V", "component1", "()Lcom/paypal/oslo/feature/subscriptions/updatefi/domain/model/ConsumerAgreementFundingInstruments;", "component2", "()Z", "component3", "copy", "(Lcom/paypal/oslo/feature/subscriptions/updatefi/domain/model/ConsumerAgreementFundingInstruments;ZZ)Lcom/paypal/oslo/feature/subscriptions/updatefi/domain/usecase/GetFundingInstrumentsUseCase$Result;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/subscriptions/updatefi/domain/model/ConsumerAgreementFundingInstruments;", "getConsumerAgreementFundingInstruments", "Z", "getHasPayPalDebitCard"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Result {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.subscriptions.updatefi.domain.model.ConsumerAgreementFundingInstruments consumerAgreementFundingInstruments;
        private final boolean hasPayPalDebitCard;
        private final boolean isBalancePreferenceEnabled;

        public Result(com.paypal.oslo.feature.subscriptions.updatefi.domain.model.ConsumerAgreementFundingInstruments consumerAgreementFundingInstruments, boolean z, boolean z2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumerAgreementFundingInstruments, "");
            this.consumerAgreementFundingInstruments = consumerAgreementFundingInstruments;
            this.isBalancePreferenceEnabled = z;
            this.hasPayPalDebitCard = z2;
        }

        public final com.paypal.oslo.feature.subscriptions.updatefi.domain.model.ConsumerAgreementFundingInstruments getConsumerAgreementFundingInstruments() {
            return this.consumerAgreementFundingInstruments;
        }

        public final boolean isBalancePreferenceEnabled() {
            return this.isBalancePreferenceEnabled;
        }

        public final boolean getHasPayPalDebitCard() {
            return this.hasPayPalDebitCard;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.subscriptions.updatefi.domain.model.ConsumerAgreementFundingInstruments consumerAgreementFundingInstruments = this.consumerAgreementFundingInstruments;
            boolean z = this.isBalancePreferenceEnabled;
            boolean z2 = this.hasPayPalDebitCard;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Result(consumerAgreementFundingInstruments=");
            sb.append(consumerAgreementFundingInstruments);
            sb.append(", isBalancePreferenceEnabled=");
            sb.append(z);
            sb.append(", hasPayPalDebitCard=");
            sb.append(z2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.consumerAgreementFundingInstruments.hashCode() * 31) + java.lang.Boolean.hashCode(this.isBalancePreferenceEnabled)) * 31) + java.lang.Boolean.hashCode(this.hasPayPalDebitCard);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase.GetFundingInstrumentsUseCase.Result)) {
                return false;
            }
            com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase.GetFundingInstrumentsUseCase.Result result = (com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase.GetFundingInstrumentsUseCase.Result) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.consumerAgreementFundingInstruments, result.consumerAgreementFundingInstruments) && this.isBalancePreferenceEnabled == result.isBalancePreferenceEnabled && this.hasPayPalDebitCard == result.hasPayPalDebitCard;
        }

        public final com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase.GetFundingInstrumentsUseCase.Result copy(com.paypal.oslo.feature.subscriptions.updatefi.domain.model.ConsumerAgreementFundingInstruments consumerAgreementFundingInstruments, boolean isBalancePreferenceEnabled, boolean hasPayPalDebitCard) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumerAgreementFundingInstruments, "");
            return new com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase.GetFundingInstrumentsUseCase.Result(consumerAgreementFundingInstruments, isBalancePreferenceEnabled, hasPayPalDebitCard);
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getHasPayPalDebitCard() {
            return this.hasPayPalDebitCard;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsBalancePreferenceEnabled() {
            return this.isBalancePreferenceEnabled;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.subscriptions.updatefi.domain.model.ConsumerAgreementFundingInstruments getConsumerAgreementFundingInstruments() {
            return this.consumerAgreementFundingInstruments;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase.GetFundingInstrumentsUseCase.Result copy$default(com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase.GetFundingInstrumentsUseCase.Result result, com.paypal.oslo.feature.subscriptions.updatefi.domain.model.ConsumerAgreementFundingInstruments consumerAgreementFundingInstruments, boolean z, boolean z2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                consumerAgreementFundingInstruments = result.consumerAgreementFundingInstruments;
            }
            if ((i & 2) != 0) {
                z = result.isBalancePreferenceEnabled;
            }
            if ((i & 4) != 0) {
                z2 = result.hasPayPalDebitCard;
            }
            return result.copy(consumerAgreementFundingInstruments, z, z2);
        }
    }
}
