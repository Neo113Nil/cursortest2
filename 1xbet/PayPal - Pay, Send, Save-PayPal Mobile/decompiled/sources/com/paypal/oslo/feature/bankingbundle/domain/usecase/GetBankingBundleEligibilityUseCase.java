package com.paypal.oslo.feature.bankingbundle.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/domain/usecase/GetBankingBundleEligibilityUseCase;", "", "Lcom/paypal/oslo/feature/bankingbundle/domain/repository/BankingBundleRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/bankingbundle/domain/repository/BankingBundleRepository;)V", "", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "Larrow/core/Either;", "Lcom/paypal/oslo/feature/bankingbundle/domain/error/BankingBundleError;", "Lcom/paypal/oslo/feature/bankingbundle/domain/model/BankingBundleEligibility;", "invoke", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/bankingbundle/domain/repository/BankingBundleRepository;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GetBankingBundleEligibilityUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bankingbundle.domain.repository.BankingBundleRepository getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public GetBankingBundleEligibilityUseCase(com.paypal.oslo.feature.bankingbundle.domain.repository.BankingBundleRepository bankingBundleRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankingBundleRepository, "");
        this.getHighResolutionOutputSizeshNQ4ISI = bankingBundleRepository;
    }

    public final java.lang.Object invoke(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.bankingbundle.domain.error.BankingBundleError, com.paypal.oslo.feature.bankingbundle.domain.model.BankingBundleEligibility>> continuation) {
        return this.getHighResolutionOutputSizeshNQ4ISI.getBalanceBundleEligibility(str, continuation);
    }
}
