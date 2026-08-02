package com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/prices/FilterMarketPricesUseCase;", "", "<init>", "()V", "", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/CryptoMarketPrice;", "marketPrices", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/CryptoHoldings;", "holdings", "invoke", "(Ljava/util/List;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/CryptoHoldings;)Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FilterMarketPricesUseCase {
    public static final int $stable = 0;

    @javax.inject.Inject
    public FilterMarketPricesUseCase() {
    }

    public final java.util.List<com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoMarketPrice> invoke(java.util.List<com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoMarketPrice> marketPrices, com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHoldings holdings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marketPrices, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holdings, "");
        if (marketPrices.isEmpty() || holdings.getHoldings().isEmpty()) {
            return marketPrices;
        }
        java.util.List<com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHolding> holdings2 = holdings.getHoldings();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator<T> it = holdings2.iterator();
        while (it.hasNext()) {
            hashSet.add(((com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHolding) it.next()).getAssetSymbol());
        }
        java.util.HashSet hashSet2 = hashSet;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : marketPrices) {
            if (!hashSet2.contains(((com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoMarketPrice) obj).getAssetSymbol())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
