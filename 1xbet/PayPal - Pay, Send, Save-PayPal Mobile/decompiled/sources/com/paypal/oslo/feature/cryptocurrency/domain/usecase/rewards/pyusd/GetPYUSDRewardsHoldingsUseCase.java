package com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \n2\u00020\u0001:\u0001\nB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0086\u0002¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/rewards/pyusd/GetPYUSDRewardsHoldingsUseCase;", "", "<init>", "()V", "", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/CryptoHolding;", "holdings", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/PYUSDRewardHoldings;", "invoke", "(Ljava/util/List;)Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/PYUSDRewardHoldings;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GetPYUSDRewardsHoldingsUseCase {
    public static final int $stable = 0;
    private static final com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsHoldingsUseCase.Companion Companion = new com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsHoldingsUseCase.Companion(null);

    @javax.inject.Inject
    public GetPYUSDRewardsHoldingsUseCase() {
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.PYUSDRewardHoldings invoke(java.util.List<com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHolding> holdings) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holdings, "");
        java.util.Iterator<T> it = holdings.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHolding) obj).getAssetSymbol(), "PYUSD")) {
                break;
            }
        }
        com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHolding cryptoHolding = (com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHolding) obj;
        if (cryptoHolding != null) {
            return cryptoHolding.getPyusdRewardHoldings();
        }
        return null;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/rewards/pyusd/GetPYUSDRewardsHoldingsUseCase$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
