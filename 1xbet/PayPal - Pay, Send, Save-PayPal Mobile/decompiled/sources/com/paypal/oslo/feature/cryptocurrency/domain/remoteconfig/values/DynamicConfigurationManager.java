package com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.values;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/values/DynamicConfigurationManager;", "", "", "getHubHoldingsPollingIntervalMs", "()J", "hubHoldingsPollingIntervalMs", "getHubPricesPollingIntervalMs", "hubPricesPollingIntervalMs", "getDetailsPricePollingIntervalMs", "detailsPricePollingIntervalMs", "getReviewQuotePollingIntervalMs", "reviewQuotePollingIntervalMs", "", "", "getMultichainAssets", "()Ljava/util/List;", "multichainAssets"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface DynamicConfigurationManager {
    long getDetailsPricePollingIntervalMs();

    long getHubHoldingsPollingIntervalMs();

    long getHubPricesPollingIntervalMs();

    java.util.List<java.lang.String> getMultichainAssets();

    long getReviewQuotePollingIntervalMs();
}
