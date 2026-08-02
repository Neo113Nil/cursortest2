package com.paypal.oslo.feature.taxanddocumentcenter.config;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0012B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\nR\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/config/AllTransactionsConfig;", "", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "dynamicConfig", "<init>", "(Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;)V", "", "rollingMonths", com.visa.cbp.getEncExpo.warmup, "getRollingMonths", "()I", "enableDayOfMonth", "getEnableDayOfMonth", "", "wireOnMonth", "Ljava/lang/String;", "getWireOnMonth", "()Ljava/lang/String;", "Specs"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AllTransactionsConfig {
    public static final int $stable = 0;
    private final int enableDayOfMonth;
    private final int rollingMonths;
    private final java.lang.String wireOnMonth;

    @javax.inject.Inject
    public AllTransactionsConfig(com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicConfiguration, "");
        this.rollingMonths = ((java.lang.Number) dynamicConfiguration.getValue((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey) com.paypal.oslo.feature.taxanddocumentcenter.config.AllTransactionsConfig.Specs.getHighSpeedVideoFpsRangesFor.getValue(com.paypal.oslo.feature.taxanddocumentcenter.config.AllTransactionsConfig.Specs.INSTANCE, com.paypal.oslo.feature.taxanddocumentcenter.config.AllTransactionsConfig.Specs.getHighSpeedVideoFpsRangesFor[0]))).intValue();
        this.enableDayOfMonth = ((java.lang.Number) dynamicConfiguration.getValue((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey) com.paypal.oslo.feature.taxanddocumentcenter.config.AllTransactionsConfig.Specs.Camera2StreamConfigurationMap.getValue(com.paypal.oslo.feature.taxanddocumentcenter.config.AllTransactionsConfig.Specs.INSTANCE, com.paypal.oslo.feature.taxanddocumentcenter.config.AllTransactionsConfig.Specs.getHighSpeedVideoFpsRangesFor[1]))).intValue();
        this.wireOnMonth = (java.lang.String) dynamicConfiguration.getValue((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey) com.paypal.oslo.feature.taxanddocumentcenter.config.AllTransactionsConfig.Specs.getHighSpeedVideoFpsRanges.getValue(com.paypal.oslo.feature.taxanddocumentcenter.config.AllTransactionsConfig.Specs.INSTANCE, com.paypal.oslo.feature.taxanddocumentcenter.config.AllTransactionsConfig.Specs.getHighSpeedVideoFpsRangesFor[2]));
    }

    public final int getRollingMonths() {
        return this.rollingMonths;
    }

    public final int getEnableDayOfMonth() {
        return this.enableDayOfMonth;
    }

    public final java.lang.String getWireOnMonth() {
        return this.wireOnMonth;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048GX\u0087\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048GX\u0087\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048GX\u0087\u0084\u0002¢\u0006\u0006\n\u0004\b\f\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/config/AllTransactionsConfig$Specs;", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfigurationSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", "", "getHighSpeedVideoFpsRanges", "Lkotlin/properties/ReadOnlyProperty;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Specs extends com.paypal.oslo.core.remoteconfig.contract.DynamicConfigurationSpec {
        public static final com.paypal.oslo.feature.taxanddocumentcenter.config.AllTransactionsConfig.Specs INSTANCE;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        static final kotlin.properties.ReadOnlyProperty getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        static final kotlin.properties.ReadOnlyProperty getHighSpeedVideoFpsRangesFor;
        static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoFpsRangesFor = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.taxanddocumentcenter.config.AllTransactionsConfig.Specs.class, "rollingMonths", "getRollingMonths()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.taxanddocumentcenter.config.AllTransactionsConfig.Specs.class, "enableDayOfMonth", "getEnableDayOfMonth()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.taxanddocumentcenter.config.AllTransactionsConfig.Specs.class, "wireOnMonth", "getWireOnMonth()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", 0))};

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        static final kotlin.properties.ReadOnlyProperty Camera2StreamConfigurationMap;

        private Specs() {
            super("tax_and_document_center", "all_transactions_config");
        }

        static {
            com.paypal.oslo.feature.taxanddocumentcenter.config.AllTransactionsConfig.Specs specs = new com.paypal.oslo.feature.taxanddocumentcenter.config.AllTransactionsConfig.Specs();
            INSTANCE = specs;
            com.paypal.oslo.feature.taxanddocumentcenter.config.AllTransactionsConfig.Specs specs2 = specs;
            getHighSpeedVideoFpsRangesFor = com.paypal.oslo.core.remoteconfig.contract.DynamicConfigurationSpec.create$default(specs2, 24, null, 2, null);
            Camera2StreamConfigurationMap = com.paypal.oslo.core.remoteconfig.contract.DynamicConfigurationSpec.create$default(specs2, 10, null, 2, null);
            getHighSpeedVideoFpsRanges = com.paypal.oslo.core.remoteconfig.contract.DynamicConfigurationSpec.create$default(specs2, "202306", null, 2, null);
        }
    }
}
