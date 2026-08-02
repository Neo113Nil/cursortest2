package com.paypal.oslo.feature.taptopay.domain.usecase.wallet;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/usecase/wallet/GetWalletInfoUseCase;", "", "Lcom/paypal/oslo/feature/taptopay/domain/repository/card/CardRepository;", "cardRepository", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/repository/card/CardRepository;)V", "Lcom/paypal/oslo/feature/taptopay/domain/model/wallet/WalletInfo;", "invoke", "()Lcom/paypal/oslo/feature/taptopay/domain/model/wallet/WalletInfo;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/taptopay/domain/repository/card/CardRepository;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GetWalletInfoUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public GetWalletInfoUseCase(com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository cardRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardRepository, "");
        this.getHighResolutionOutputSizeshNQ4ISI = cardRepository;
    }

    public final com.paypal.oslo.feature.taptopay.domain.model.wallet.WalletInfo invoke() {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Running get wallet info use case", null, null, 6, null);
        return new com.paypal.oslo.feature.taptopay.domain.model.wallet.WalletInfo(this.getHighResolutionOutputSizeshNQ4ISI.getWalletID(), this.getHighResolutionOutputSizeshNQ4ISI.getWalletPartner());
    }
}
