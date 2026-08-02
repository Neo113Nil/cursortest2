package com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.values;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000bR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/data/remoteconfig/values/DynamicConfigurationManagerImpl;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/values/DynamicConfigurationManager;", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "dynamicConfiguration", "<init>", "(Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;)V", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "Camera2StreamConfigurationMap", "", "getHubHoldingsPollingIntervalMs", "()J", "hubHoldingsPollingIntervalMs", "getHubPricesPollingIntervalMs", "hubPricesPollingIntervalMs", "getDetailsPricePollingIntervalMs", "detailsPricePollingIntervalMs", "getReviewQuotePollingIntervalMs", "reviewQuotePollingIntervalMs", "", "", "getMultichainAssets", "()Ljava/util/List;", "multichainAssets"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DynamicConfigurationManagerImpl implements com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.values.DynamicConfigurationManager {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public DynamicConfigurationManagerImpl(com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicConfiguration, "");
        this.Camera2StreamConfigurationMap = dynamicConfiguration;
    }

    @Override // com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.values.DynamicConfigurationManager
    public final long getHubHoldingsPollingIntervalMs() {
        return ((java.lang.Number) this.Camera2StreamConfigurationMap.getValue((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey) com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.values.CryptocurrencyConfigs.getHighResolutionOutputSizeshNQ4ISI.getValue(com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.values.CryptocurrencyConfigs.INSTANCE, com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.values.CryptocurrencyConfigs.getHighSpeedVideoFpsRangesFor[0]))).longValue();
    }

    @Override // com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.values.DynamicConfigurationManager
    public final long getHubPricesPollingIntervalMs() {
        return ((java.lang.Number) this.Camera2StreamConfigurationMap.getValue((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey) com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.values.CryptocurrencyConfigs.Camera2StreamConfigurationMap.getValue(com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.values.CryptocurrencyConfigs.INSTANCE, com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.values.CryptocurrencyConfigs.getHighSpeedVideoFpsRangesFor[1]))).longValue();
    }

    @Override // com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.values.DynamicConfigurationManager
    public final long getDetailsPricePollingIntervalMs() {
        return ((java.lang.Number) this.Camera2StreamConfigurationMap.getValue((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey) com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.values.CryptocurrencyConfigs.getHighSpeedVideoFpsRangesFor.getValue(com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.values.CryptocurrencyConfigs.INSTANCE, com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.values.CryptocurrencyConfigs.getHighSpeedVideoFpsRangesFor[2]))).longValue();
    }

    @Override // com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.values.DynamicConfigurationManager
    public final long getReviewQuotePollingIntervalMs() {
        return ((java.lang.Number) this.Camera2StreamConfigurationMap.getValue((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey) com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.values.CryptocurrencyConfigs.getHighSpeedVideoSizes.getValue(com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.values.CryptocurrencyConfigs.INSTANCE, com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.values.CryptocurrencyConfigs.getHighSpeedVideoFpsRangesFor[3]))).longValue();
    }

    @Override // com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.values.DynamicConfigurationManager
    public final java.util.List<java.lang.String> getMultichainAssets() {
        java.lang.Object[] objArr = (java.lang.Object[]) this.Camera2StreamConfigurationMap.getValue((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey) com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.values.MultichainAssetsConfig.getHighSpeedVideoFpsRangesFor.getValue(com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.values.MultichainAssetsConfig.INSTANCE, com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.values.MultichainAssetsConfig.Camera2StreamConfigurationMap[0]));
        java.util.ArrayList arrayList = new java.util.ArrayList(objArr.length);
        for (java.lang.Object obj : objArr) {
            java.util.Locale locale = java.util.Locale.ROOT;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
            java.lang.String upperCase = ((java.lang.String) obj).toUpperCase(locale);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
            arrayList.add(upperCase);
        }
        return arrayList;
    }
}
