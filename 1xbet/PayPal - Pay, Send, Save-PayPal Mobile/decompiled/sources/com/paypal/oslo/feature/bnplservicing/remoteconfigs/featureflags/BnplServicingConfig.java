package com.paypal.oslo.feature.bnplservicing.remoteconfigs.featureflags;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bp\u0018\u00002\u00020\u0001:\u0001\u0002À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/remoteconfigs/featureflags/BnplServicingConfig;", "", "Flags"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface BnplServicingConfig {

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\f\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/remoteconfigs/featureflags/BnplServicingConfig$Flags;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGateSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "mockApiEnabled$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getMockApiEnabled", "()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "mockApiEnabled", "servicingEnabled$delegate", "getServicingEnabled", "servicingEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Flags extends com.paypal.oslo.core.remoteconfig.contract.FeatureGateSpec {
        public static final int $stable;
        public static final com.paypal.oslo.feature.bnplservicing.remoteconfigs.featureflags.BnplServicingConfig.Flags INSTANCE;
        static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoFpsRangesFor = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.bnplservicing.remoteconfigs.featureflags.BnplServicingConfig.Flags.class, "mockApiEnabled", "getMockApiEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.bnplservicing.remoteconfigs.featureflags.BnplServicingConfig.Flags.class, "servicingEnabled", "getServicingEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0))};

        /* renamed from: mockApiEnabled$delegate, reason: from kotlin metadata */
        private static final kotlin.properties.ReadOnlyProperty mockApiEnabled;

        /* renamed from: servicingEnabled$delegate, reason: from kotlin metadata */
        private static final kotlin.properties.ReadOnlyProperty servicingEnabled;

        private Flags() {
            super(com.paypal.oslo.feature.bnplservicing.common.constants.BnplServicingConstants.BNPL_SERV_REMOTE_CONFIG_DOMAIN);
        }

        public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getMockApiEnabled() {
            return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) mockApiEnabled.getValue(this, getHighSpeedVideoFpsRangesFor[0]);
        }

        public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getServicingEnabled() {
            return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) servicingEnabled.getValue(this, getHighSpeedVideoFpsRangesFor[1]);
        }

        static {
            com.paypal.oslo.feature.bnplservicing.remoteconfigs.featureflags.BnplServicingConfig.Flags flags = new com.paypal.oslo.feature.bnplservicing.remoteconfigs.featureflags.BnplServicingConfig.Flags();
            INSTANCE = flags;
            mockApiEnabled = flags.create("mock_api_enabled");
            servicingEnabled = flags.create("enabled");
            $stable = 8;
        }
    }
}
