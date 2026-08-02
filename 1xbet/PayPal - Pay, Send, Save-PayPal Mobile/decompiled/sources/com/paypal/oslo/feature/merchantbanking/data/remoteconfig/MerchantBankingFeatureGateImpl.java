package com.paypal.oslo.feature.merchantbanking.data.remoteconfig;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/merchantbanking/data/remoteconfig/MerchantBankingFeatureGateImpl;", "Lcom/paypal/oslo/feature/merchantbanking/domain/remoteconfig/MerchantBankingFeatureGate;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "featureGate", "<init>", "(Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;)V", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "getHighSpeedVideoFpsRanges", "", "isMerchantArnEnabled", "()Z", "FeatureGates"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MerchantBankingFeatureGateImpl implements com.paypal.oslo.feature.merchantbanking.domain.remoteconfig.MerchantBankingFeatureGate {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.contract.FeatureGate getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public MerchantBankingFeatureGateImpl(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        this.getHighSpeedVideoFpsRanges = featureGate;
    }

    @Override // com.paypal.oslo.feature.merchantbanking.domain.remoteconfig.MerchantBankingFeatureGate
    public final boolean isMerchantArnEnabled() {
        return this.getHighSpeedVideoFpsRanges.checkGate((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) com.paypal.oslo.feature.merchantbanking.data.remoteconfig.MerchantBankingFeatureGateImpl.FeatureGates.getHighSpeedVideoFpsRanges.getValue(com.paypal.oslo.feature.merchantbanking.data.remoteconfig.MerchantBankingFeatureGateImpl.FeatureGates.INSTANCE, com.paypal.oslo.feature.merchantbanking.data.remoteconfig.MerchantBankingFeatureGateImpl.FeatureGates.Camera2StreamConfigurationMap[0]));
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0015\u0010\u0007\u001a\u00020\u00048GX\u0086\u0084\u0002¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/merchantbanking/data/remoteconfig/MerchantBankingFeatureGateImpl$FeatureGates;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGateSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/properties/ReadOnlyProperty;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    static final class FeatureGates extends com.paypal.oslo.core.remoteconfig.contract.FeatureGateSpec {
        static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] Camera2StreamConfigurationMap = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.merchantbanking.data.remoteconfig.MerchantBankingFeatureGateImpl.FeatureGates.class, "merchantArnEnabled", "getMerchantArnEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0))};
        public static final com.paypal.oslo.feature.merchantbanking.data.remoteconfig.MerchantBankingFeatureGateImpl.FeatureGates INSTANCE;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        static final kotlin.properties.ReadOnlyProperty getHighSpeedVideoFpsRanges;

        private FeatureGates() {
            super("money_management");
        }

        static {
            com.paypal.oslo.feature.merchantbanking.data.remoteconfig.MerchantBankingFeatureGateImpl.FeatureGates featureGates = new com.paypal.oslo.feature.merchantbanking.data.remoteconfig.MerchantBankingFeatureGateImpl.FeatureGates();
            INSTANCE = featureGates;
            getHighSpeedVideoFpsRanges = featureGates.create("merchant_banking_arn");
        }
    }
}
