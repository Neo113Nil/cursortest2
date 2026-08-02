package com.paypal.oslo.feature.bnplservicing.remoteconfigs.featureflags;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\f\u001a\u00020\b¢\u0006\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/remoteconfigs/featureflags/FeatureGateManager;", "", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "featureGate", "Lcom/paypal/oslo/feature/bnplacquisition/api/config/BnplAcquisitionConfigManager;", "bnplAcquisitionConfigManager", "<init>", "(Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;Lcom/paypal/oslo/feature/bnplacquisition/api/config/BnplAcquisitionConfigManager;)V", "", "isMockApiEnabled", "()Z", "isServicingEnabled", "isInstoreProductEnabled", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/bnplacquisition/api/config/BnplAcquisitionConfigManager;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FeatureGateManager {
    public static final int $stable = 8;
    private final com.paypal.oslo.core.remoteconfig.contract.FeatureGate Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.bnplacquisition.api.config.BnplAcquisitionConfigManager getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public FeatureGateManager(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, com.paypal.oslo.feature.bnplacquisition.api.config.BnplAcquisitionConfigManager bnplAcquisitionConfigManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionConfigManager, "");
        this.Camera2StreamConfigurationMap = featureGate;
        this.getHighSpeedVideoFpsRangesFor = bnplAcquisitionConfigManager;
    }

    public final boolean isMockApiEnabled() {
        return this.Camera2StreamConfigurationMap.checkGate(com.paypal.oslo.feature.bnplservicing.remoteconfigs.featureflags.BnplServicingConfig.Flags.INSTANCE.getMockApiEnabled());
    }

    public final boolean isServicingEnabled() {
        return this.Camera2StreamConfigurationMap.checkGate(com.paypal.oslo.feature.bnplservicing.remoteconfigs.featureflags.BnplServicingConfig.Flags.INSTANCE.getServicingEnabled());
    }

    public final boolean isInstoreProductEnabled() {
        return this.getHighSpeedVideoFpsRangesFor.isInstoreProductEnabled();
    }
}
