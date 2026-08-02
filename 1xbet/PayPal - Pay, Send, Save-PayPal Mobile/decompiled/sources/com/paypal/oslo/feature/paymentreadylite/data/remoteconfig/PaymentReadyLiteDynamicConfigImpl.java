package com.paypal.oslo.feature.paymentreadylite.data.remoteconfig;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\rB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/paymentreadylite/data/remoteconfig/PaymentReadyLiteDynamicConfigImpl;", "Lcom/paypal/oslo/feature/paymentreadylite/domain/remoteconfig/PaymentReadyLiteDynamicConfig;", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "dynamicConfiguration", "<init>", "(Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "getHighSpeedVideoFpsRangesFor", "", "getRefreshInterval", "()J", "refreshInterval", "PaymentReadyLiteDynamicConfigSpecs"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaymentReadyLiteDynamicConfigImpl implements com.paypal.oslo.feature.paymentreadylite.domain.remoteconfig.PaymentReadyLiteDynamicConfig {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public PaymentReadyLiteDynamicConfigImpl(com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicConfiguration, "");
        this.getHighSpeedVideoFpsRangesFor = dynamicConfiguration;
    }

    @Override // com.paypal.oslo.feature.paymentreadylite.domain.remoteconfig.PaymentReadyLiteDynamicConfig
    public final long getRefreshInterval() {
        return ((java.lang.Number) this.getHighSpeedVideoFpsRangesFor.getValue((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey) com.paypal.oslo.feature.paymentreadylite.data.remoteconfig.PaymentReadyLiteDynamicConfigImpl.PaymentReadyLiteDynamicConfigSpecs.getHighSpeedVideoFpsRanges.getValue(com.paypal.oslo.feature.paymentreadylite.data.remoteconfig.PaymentReadyLiteDynamicConfigImpl.PaymentReadyLiteDynamicConfigSpecs.INSTANCE, com.paypal.oslo.feature.paymentreadylite.data.remoteconfig.PaymentReadyLiteDynamicConfigImpl.PaymentReadyLiteDynamicConfigSpecs.Camera2StreamConfigurationMap[0]))).longValue();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048GX\u0086\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/paymentreadylite/data/remoteconfig/PaymentReadyLiteDynamicConfigImpl$PaymentReadyLiteDynamicConfigSpecs;", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfigurationSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", "", "getHighSpeedVideoSizes", "Lkotlin/properties/ReadOnlyProperty;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class PaymentReadyLiteDynamicConfigSpecs extends com.paypal.oslo.core.remoteconfig.contract.DynamicConfigurationSpec {
        static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] Camera2StreamConfigurationMap = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.paymentreadylite.data.remoteconfig.PaymentReadyLiteDynamicConfigImpl.PaymentReadyLiteDynamicConfigSpecs.class, "refreshTimeIntervalConfig", "getRefreshTimeIntervalConfig()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", 0))};
        public static final com.paypal.oslo.feature.paymentreadylite.data.remoteconfig.PaymentReadyLiteDynamicConfigImpl.PaymentReadyLiteDynamicConfigSpecs INSTANCE;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        static final kotlin.properties.ReadOnlyProperty getHighSpeedVideoFpsRanges;

        private PaymentReadyLiteDynamicConfigSpecs() {
            super("payment_ready_lite", "configs");
        }

        static {
            com.paypal.oslo.feature.paymentreadylite.data.remoteconfig.PaymentReadyLiteDynamicConfigImpl.PaymentReadyLiteDynamicConfigSpecs paymentReadyLiteDynamicConfigSpecs = new com.paypal.oslo.feature.paymentreadylite.data.remoteconfig.PaymentReadyLiteDynamicConfigImpl.PaymentReadyLiteDynamicConfigSpecs();
            INSTANCE = paymentReadyLiteDynamicConfigSpecs;
            getHighSpeedVideoFpsRanges = paymentReadyLiteDynamicConfigSpecs.create(1440L, "refresh_interval");
        }
    }
}
