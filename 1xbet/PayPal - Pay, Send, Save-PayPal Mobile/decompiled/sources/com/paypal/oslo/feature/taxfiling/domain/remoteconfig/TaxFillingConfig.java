package com.paypal.oslo.feature.taxfiling.domain.remoteconfig;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taxfiling/domain/remoteconfig/TaxFillingConfig;", "", "Configs", "Manager"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface TaxFillingConfig {

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taxfiling/domain/remoteconfig/TaxFillingConfig$Manager;", "", "", "getTaxFilingServiceUrl", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Manager {
        java.lang.String getTaxFilingServiceUrl();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/taxfiling/domain/remoteconfig/TaxFillingConfig$Configs;", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfigurationSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", "", "taxFilingServiceUrl$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getTaxFilingServiceUrl", "()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", "taxFilingServiceUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Configs extends com.paypal.oslo.core.remoteconfig.contract.DynamicConfigurationSpec {
        public static final int $stable;
        public static final com.paypal.oslo.feature.taxfiling.domain.remoteconfig.TaxFillingConfig.Configs INSTANCE;
        static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoFpsRangesFor = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.taxfiling.domain.remoteconfig.TaxFillingConfig.Configs.class, "taxFilingServiceUrl", "getTaxFilingServiceUrl()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", 0))};

        /* renamed from: taxFilingServiceUrl$delegate, reason: from kotlin metadata */
        private static final kotlin.properties.ReadOnlyProperty taxFilingServiceUrl;

        private Configs() {
            super("taxfiling", "config");
        }

        public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey<java.lang.String> getTaxFilingServiceUrl() {
            return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey) taxFilingServiceUrl.getValue(this, getHighSpeedVideoFpsRangesFor[0]);
        }

        static {
            com.paypal.oslo.feature.taxfiling.domain.remoteconfig.TaxFillingConfig.Configs configs = new com.paypal.oslo.feature.taxfiling.domain.remoteconfig.TaxFillingConfig.Configs();
            INSTANCE = configs;
            taxFilingServiceUrl = configs.create("https://www.paypal.com/myaccount/taxfiling/flow/filing", "web_url");
            $stable = 8;
        }
    }
}
