package com.paypal.oslo.feature.taptopay.data.remoteconfig;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/remoteconfig/TapToPayConfigManagerImpl;", "Lcom/paypal/oslo/feature/taptopay/domain/remoteconfig/TapToPayConfig$Manager;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "featureGate", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "dynamicConfiguration", "<init>", "(Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;)V", "", "isTapToPayEnabled", "()Z", "isTapToPayMockEnabled", "", "getWalletVendor", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TapToPayConfigManagerImpl implements com.paypal.oslo.feature.taptopay.domain.remoteconfig.TapToPayConfig.Manager {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.contract.FeatureGate getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public TapToPayConfigManagerImpl(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicConfiguration, "");
        this.getHighSpeedVideoFpsRangesFor = featureGate;
        this.getHighSpeedVideoSizes = dynamicConfiguration;
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.remoteconfig.TapToPayConfig.Manager
    public final boolean isTapToPayEnabled() {
        return this.getHighSpeedVideoFpsRangesFor.checkGate(com.paypal.oslo.feature.taptopay.domain.remoteconfig.TapToPayConfig.Flags.INSTANCE.isTapToPayEnabled());
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.remoteconfig.TapToPayConfig.Manager
    public final boolean isTapToPayMockEnabled() {
        return this.getHighSpeedVideoFpsRangesFor.checkGate(com.paypal.oslo.feature.taptopay.domain.remoteconfig.TapToPayConfig.Flags.INSTANCE.isTapToPayMockEnabled());
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.remoteconfig.TapToPayConfig.Manager
    public final java.lang.String getWalletVendor() {
        return (java.lang.String) this.getHighSpeedVideoSizes.getValue(com.paypal.oslo.feature.taptopay.domain.remoteconfig.TapToPayConfig.TapToPayDynamicConfigs.INSTANCE.getWalletVendor());
    }
}
