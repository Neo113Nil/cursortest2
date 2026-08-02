package com.paypal.oslo.feature.taptopay.domain.remoteconfig;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/remoteconfig/TapToPayConfig;", "", "Flags", "TapToPayDynamicConfigs", "Manager"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface TapToPayConfig {

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/remoteconfig/TapToPayConfig$Manager;", "", "", "isTapToPayEnabled", "()Z", "isTapToPayMockEnabled", "", "getWalletVendor", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Manager {
        java.lang.String getWalletVendor();

        boolean isTapToPayEnabled();

        boolean isTapToPayMockEnabled();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0007\u001a\u00020\u00048GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\n\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/remoteconfig/TapToPayConfig$Flags;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGateSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "isTapToPayEnabled$delegate", "Lkotlin/properties/ReadOnlyProperty;", "isTapToPayEnabled", "()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "isTapToPayMockEnabled$delegate", "isTapToPayMockEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Flags extends com.paypal.oslo.core.remoteconfig.contract.FeatureGateSpec {
        public static final int $stable;
        static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] Camera2StreamConfigurationMap = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.taptopay.domain.remoteconfig.TapToPayConfig.Flags.class, "isTapToPayEnabled", "isTapToPayEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.taptopay.domain.remoteconfig.TapToPayConfig.Flags.class, "isTapToPayMockEnabled", "isTapToPayMockEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0))};
        public static final com.paypal.oslo.feature.taptopay.domain.remoteconfig.TapToPayConfig.Flags INSTANCE;

        /* renamed from: isTapToPayEnabled$delegate, reason: from kotlin metadata */
        private static final kotlin.properties.ReadOnlyProperty isTapToPayEnabled;

        /* renamed from: isTapToPayMockEnabled$delegate, reason: from kotlin metadata */
        private static final kotlin.properties.ReadOnlyProperty isTapToPayMockEnabled;

        private Flags() {
            super("taptopay");
        }

        public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey isTapToPayEnabled() {
            return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) isTapToPayEnabled.getValue(this, Camera2StreamConfigurationMap[0]);
        }

        public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey isTapToPayMockEnabled() {
            return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) isTapToPayMockEnabled.getValue(this, Camera2StreamConfigurationMap[1]);
        }

        static {
            com.paypal.oslo.feature.taptopay.domain.remoteconfig.TapToPayConfig.Flags flags = new com.paypal.oslo.feature.taptopay.domain.remoteconfig.TapToPayConfig.Flags();
            INSTANCE = flags;
            isTapToPayEnabled = flags.create("enabled");
            isTapToPayMockEnabled = flags.create("mock_enabled");
            $stable = 8;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/remoteconfig/TapToPayConfig$TapToPayDynamicConfigs;", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfigurationSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", "", "walletVendor$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getWalletVendor", "()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", "walletVendor"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class TapToPayDynamicConfigs extends com.paypal.oslo.core.remoteconfig.contract.DynamicConfigurationSpec {
        public static final int $stable;
        public static final com.paypal.oslo.feature.taptopay.domain.remoteconfig.TapToPayConfig.TapToPayDynamicConfigs INSTANCE;
        static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoFpsRanges = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.taptopay.domain.remoteconfig.TapToPayConfig.TapToPayDynamicConfigs.class, "walletVendor", "getWalletVendor()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", 0))};

        /* renamed from: walletVendor$delegate, reason: from kotlin metadata */
        private static final kotlin.properties.ReadOnlyProperty walletVendor;

        private TapToPayDynamicConfigs() {
            super("taptopay", "configs");
        }

        public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey<java.lang.String> getWalletVendor() {
            return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey) walletVendor.getValue(this, getHighSpeedVideoFpsRanges[0]);
        }

        static {
            com.paypal.oslo.feature.taptopay.domain.remoteconfig.TapToPayConfig.TapToPayDynamicConfigs tapToPayDynamicConfigs = new com.paypal.oslo.feature.taptopay.domain.remoteconfig.TapToPayConfig.TapToPayDynamicConfigs();
            INSTANCE = tapToPayDynamicConfigs;
            walletVendor = tapToPayDynamicConfigs.create("PAYAIR", "wallet_vendor");
            $stable = 8;
        }
    }
}
