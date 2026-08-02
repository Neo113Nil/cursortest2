package com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.values;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048GX\u0086\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048GX\u0086\u0084\u0002¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048GX\u0086\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048GX\u0086\u0084\u0002¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/data/remoteconfig/values/CryptocurrencyConfigs;", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfigurationSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", "", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/properties/ReadOnlyProperty;", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "getOutputMinFrameDuration", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CryptocurrencyConfigs extends com.paypal.oslo.core.remoteconfig.contract.DynamicConfigurationSpec {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    static final kotlin.properties.ReadOnlyProperty getHighSpeedVideoFpsRangesFor;
    public static final com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.values.CryptocurrencyConfigs INSTANCE;
    static final kotlin.properties.ReadOnlyProperty getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    static final kotlin.properties.ReadOnlyProperty Camera2StreamConfigurationMap;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoFpsRangesFor = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.values.CryptocurrencyConfigs.class, "hubHoldingsPollingIntervalMs", "getHubHoldingsPollingIntervalMs()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.values.CryptocurrencyConfigs.class, "hubPricesPollingIntervalMs", "getHubPricesPollingIntervalMs()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.values.CryptocurrencyConfigs.class, "detailsPricePollingIntervalMs", "getDetailsPricePollingIntervalMs()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.values.CryptocurrencyConfigs.class, "reviewQuotePollingIntervalMs", "getReviewQuotePollingIntervalMs()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", 0))};

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    static final kotlin.properties.ReadOnlyProperty getHighSpeedVideoSizes;

    private CryptocurrencyConfigs() {
        super("cryptocurrency", "configs");
    }

    static {
        com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.values.CryptocurrencyConfigs cryptocurrencyConfigs = new com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.values.CryptocurrencyConfigs();
        INSTANCE = cryptocurrencyConfigs;
        getHighResolutionOutputSizeshNQ4ISI = cryptocurrencyConfigs.create(30000L, "hub_holdings_polling_interval_ms");
        Camera2StreamConfigurationMap = cryptocurrencyConfigs.create(30000L, "hub_prices_polling_interval_ms");
        getHighSpeedVideoFpsRangesFor = cryptocurrencyConfigs.create(30000L, "details_price_polling_interval_ms");
        getHighSpeedVideoSizes = cryptocurrencyConfigs.create(3000L, "review_quote_polling_interval_ms");
    }
}
