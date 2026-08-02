package com.paypal.oslo.feature.wallet.banks.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/usecase/InitiateExternalBankAccessUseCase;", "", "Lcom/paypal/oslo/feature/wallet/banks/domain/repository/ExternalBankAccessRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/wallet/banks/domain/repository/ExternalBankAccessRepository;)V", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/InitiateExternalBankAccessParams;", "params", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessError;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessResult;", "invoke", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/InitiateExternalBankAccessParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/wallet/banks/domain/repository/ExternalBankAccessRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class InitiateExternalBankAccessUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.wallet.banks.domain.repository.ExternalBankAccessRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public InitiateExternalBankAccessUseCase(com.paypal.oslo.feature.wallet.banks.domain.repository.ExternalBankAccessRepository externalBankAccessRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalBankAccessRepository, "");
        this.getHighSpeedVideoFpsRangesFor = externalBankAccessRepository;
    }

    public final java.lang.Object invoke(com.paypal.oslo.feature.wallet.banks.domain.model.InitiateExternalBankAccessParams initiateExternalBankAccessParams, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError, com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessResult>> continuation) {
        return this.getHighSpeedVideoFpsRangesFor.initiateExternalBankAccess(initiateExternalBankAccessParams, continuation);
    }
}
