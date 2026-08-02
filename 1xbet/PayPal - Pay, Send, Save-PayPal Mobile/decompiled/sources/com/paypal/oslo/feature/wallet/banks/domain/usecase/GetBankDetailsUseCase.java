package com.paypal.oslo.feature.wallet.banks.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/usecase/GetBankDetailsUseCase;", "", "Lcom/paypal/oslo/feature/wallet/banks/domain/repository/BankDetailsRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/wallet/banks/domain/repository/BankDetailsRepository;)V", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankDetailsParams;", "params", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankDetailsError;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankDetails;", "invoke", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankDetailsParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/wallet/banks/domain/repository/BankDetailsRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GetBankDetailsUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.wallet.banks.domain.repository.BankDetailsRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public GetBankDetailsUseCase(com.paypal.oslo.feature.wallet.banks.domain.repository.BankDetailsRepository bankDetailsRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankDetailsRepository, "");
        this.getHighSpeedVideoFpsRangesFor = bankDetailsRepository;
    }

    public final java.lang.Object invoke(com.paypal.oslo.feature.wallet.banks.domain.model.BankDetailsParams bankDetailsParams, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.wallet.banks.domain.model.BankDetailsError, com.paypal.oslo.feature.wallet.banks.domain.model.BankDetails>> continuation) {
        if (kotlin.text.StringsKt.isBlank(bankDetailsParams.getCountryCode())) {
            throw new java.lang.IllegalArgumentException("countryCode cannot be blank".toString());
        }
        if (bankDetailsParams instanceof com.paypal.oslo.feature.wallet.banks.domain.model.BankDetailsParams.ByBankCode) {
            if (kotlin.text.StringsKt.isBlank(((com.paypal.oslo.feature.wallet.banks.domain.model.BankDetailsParams.ByBankCode) bankDetailsParams).getBankCode())) {
                throw new java.lang.IllegalArgumentException("bankCode cannot be blank".toString());
            }
        } else {
            if (!(bankDetailsParams instanceof com.paypal.oslo.feature.wallet.banks.domain.model.BankDetailsParams.ByIban)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            if (kotlin.text.StringsKt.isBlank(((com.paypal.oslo.feature.wallet.banks.domain.model.BankDetailsParams.ByIban) bankDetailsParams).getIban())) {
                throw new java.lang.IllegalArgumentException("iban cannot be blank".toString());
            }
        }
        return this.getHighSpeedVideoFpsRangesFor.getBankDetails(bankDetailsParams, continuation);
    }
}
