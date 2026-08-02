package com.paypal.oslo.feature.cashin.manager;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048GX\u0086\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048GX\u0086\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u001b\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048GX\u0086\u0084\u0002¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u001b\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048GX\u0086\u0084\u0002¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048GX\u0086\u0084\u0002¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cashin/manager/CashInConfigs;", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfigurationSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", "", "getHighSpeedVideoSizesFor", "Lkotlin/properties/ReadOnlyProperty;", "getHighResolutionOutputSizeshNQ4ISI", "getInputFormats", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final class CashInConfigs extends com.paypal.oslo.core.remoteconfig.contract.DynamicConfigurationSpec {
    public static final com.paypal.oslo.feature.cashin.manager.CashInConfigs INSTANCE;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighResolutionOutputSizeshNQ4ISI = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.cashin.manager.CashInConfigs.class, "transactionTimeDelay", "getTransactionTimeDelay()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.cashin.manager.CashInConfigs.class, "transactionMinLimitPerDay", "getTransactionMinLimitPerDay()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.cashin.manager.CashInConfigs.class, "transactionMaxLimitPerMonth", "getTransactionMaxLimitPerMonth()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.cashin.manager.CashInConfigs.class, "minLimitPerTransaction", "getMinLimitPerTransaction()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.cashin.manager.CashInConfigs.class, "maxLimitPerTransaction", "getMaxLimitPerTransaction()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", 0))};

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    static final kotlin.properties.ReadOnlyProperty getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    static final kotlin.properties.ReadOnlyProperty Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    static final kotlin.properties.ReadOnlyProperty getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    static final kotlin.properties.ReadOnlyProperty getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    static final kotlin.properties.ReadOnlyProperty getHighSpeedVideoFpsRanges;

    private CashInConfigs() {
        super(com.paypal.oslo.feature.cashin.common.CashInConstants.RemoteConfig.DOMAIN, "value_props_config");
    }

    static {
        com.paypal.oslo.feature.cashin.manager.CashInConfigs cashInConfigs = new com.paypal.oslo.feature.cashin.manager.CashInConfigs();
        INSTANCE = cashInConfigs;
        getHighResolutionOutputSizeshNQ4ISI = cashInConfigs.create("15", "transaction_time_delay");
        getHighSpeedVideoFpsRanges = cashInConfigs.create(com.paypal.oslo.feature.bnplservicing.config.paylaterhub.PrequalTileConstants.DEFAULT_AMOUNT, "transaction_min_limit_per_day");
        getHighSpeedVideoSizes = cashInConfigs.create("$5,000", "transaction_max_limit_per_month");
        Camera2StreamConfigurationMap = cashInConfigs.create("$20", "min_limit_per_transaction");
        getHighSpeedVideoFpsRangesFor = cashInConfigs.create("$500", "max_limit_per_transaction");
    }
}
