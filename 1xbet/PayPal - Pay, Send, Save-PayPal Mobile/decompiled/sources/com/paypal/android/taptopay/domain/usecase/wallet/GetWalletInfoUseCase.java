package com.paypal.android.taptopay.domain.usecase.wallet;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/android/taptopay/domain/usecase/wallet/GetWalletInfoUseCase;", "", "Lcom/paypal/android/taptopay/domain/repository/card/CardRepository;", "cardRepository", "<init>", "(Lcom/paypal/android/taptopay/domain/repository/card/CardRepository;)V", "Lcom/paypal/android/taptopay/domain/usecase/wallet/WalletInfo;", "invoke", "()Lcom/paypal/android/taptopay/domain/usecase/wallet/WalletInfo;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/android/taptopay/domain/repository/card/CardRepository;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class GetWalletInfoUseCase {
    private final com.paypal.android.taptopay.domain.repository.card.CardRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public GetWalletInfoUseCase(com.paypal.android.taptopay.domain.repository.card.CardRepository cardRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardRepository, "");
        this.getHighSpeedVideoFpsRangesFor = cardRepository;
    }

    public final com.paypal.android.taptopay.domain.usecase.wallet.WalletInfo invoke() {
        return new com.paypal.android.taptopay.domain.usecase.wallet.WalletInfo(this.getHighSpeedVideoFpsRangesFor.getWalletID(), this.getHighSpeedVideoFpsRangesFor.getWalletPartner());
    }
}
