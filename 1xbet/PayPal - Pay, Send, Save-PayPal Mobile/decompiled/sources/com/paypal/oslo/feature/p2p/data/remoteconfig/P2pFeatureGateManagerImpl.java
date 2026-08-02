package com.paypal.oslo.feature.p2p.data.remoteconfig;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\bR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/p2p/data/remoteconfig/P2pFeatureGateManagerImpl;", "Lcom/paypal/oslo/feature/p2p/domain/remoteconfig/P2pFeatureGateManager;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "featureGate", "<init>", "(Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;)V", "", "isCryptoPickerEnabled", "()Z", "isQrcFlowEnabled", "isContactSyncEnabled", "isPublicProfileEnabled", "isPpLinkEnabled", "isAddPaymentMethodEnabled", "isClaimMoneyDeeplinkEnabled", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class P2pFeatureGateManagerImpl implements com.paypal.oslo.feature.p2p.domain.remoteconfig.P2pFeatureGateManager {
    public static final int $stable = 8;
    private final com.paypal.oslo.core.remoteconfig.contract.FeatureGate getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public P2pFeatureGateManagerImpl(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        this.getHighResolutionOutputSizeshNQ4ISI = featureGate;
    }

    @Override // com.paypal.oslo.feature.p2p.domain.remoteconfig.P2pFeatureGateManager
    public final boolean isCryptoPickerEnabled() {
        return this.getHighResolutionOutputSizeshNQ4ISI.checkGate((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) com.paypal.oslo.feature.p2p.data.remoteconfig.P2pFeatureGates.getHighSpeedVideoSizes.getValue(com.paypal.oslo.feature.p2p.data.remoteconfig.P2pFeatureGates.INSTANCE, com.paypal.oslo.feature.p2p.data.remoteconfig.P2pFeatureGates.Camera2StreamConfigurationMap[0]));
    }

    @Override // com.paypal.oslo.feature.p2p.domain.remoteconfig.P2pFeatureGateManager
    public final boolean isQrcFlowEnabled() {
        return this.getHighResolutionOutputSizeshNQ4ISI.checkGate((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) com.paypal.oslo.feature.p2p.data.remoteconfig.P2pFeatureGates.getHighResolutionOutputSizeshNQ4ISI.getValue(com.paypal.oslo.feature.p2p.data.remoteconfig.P2pFeatureGates.INSTANCE, com.paypal.oslo.feature.p2p.data.remoteconfig.P2pFeatureGates.Camera2StreamConfigurationMap[1]));
    }

    @Override // com.paypal.oslo.feature.p2p.domain.remoteconfig.P2pFeatureGateManager
    public final boolean isContactSyncEnabled() {
        return this.getHighResolutionOutputSizeshNQ4ISI.checkGate((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) com.paypal.oslo.feature.p2p.data.remoteconfig.P2pFeatureGates.getHighSpeedVideoFpsRangesFor.getValue(com.paypal.oslo.feature.p2p.data.remoteconfig.P2pFeatureGates.INSTANCE, com.paypal.oslo.feature.p2p.data.remoteconfig.P2pFeatureGates.Camera2StreamConfigurationMap[2]));
    }

    @Override // com.paypal.oslo.feature.p2p.domain.remoteconfig.P2pFeatureGateManager
    public final boolean isPublicProfileEnabled() {
        return this.getHighResolutionOutputSizeshNQ4ISI.checkGate((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) com.paypal.oslo.feature.p2p.data.remoteconfig.P2pFeatureGates.Camera2StreamConfigurationMap.getValue(com.paypal.oslo.feature.p2p.data.remoteconfig.P2pFeatureGates.INSTANCE, com.paypal.oslo.feature.p2p.data.remoteconfig.P2pFeatureGates.Camera2StreamConfigurationMap[3]));
    }

    @Override // com.paypal.oslo.feature.p2p.domain.remoteconfig.P2pFeatureGateManager
    public final boolean isPpLinkEnabled() {
        return this.getHighResolutionOutputSizeshNQ4ISI.checkGate((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) com.paypal.oslo.feature.p2p.data.remoteconfig.P2pFeatureGates.getHighSpeedVideoFpsRanges.getValue(com.paypal.oslo.feature.p2p.data.remoteconfig.P2pFeatureGates.INSTANCE, com.paypal.oslo.feature.p2p.data.remoteconfig.P2pFeatureGates.Camera2StreamConfigurationMap[4]));
    }

    @Override // com.paypal.oslo.feature.p2p.domain.remoteconfig.P2pFeatureGateManager
    public final boolean isAddPaymentMethodEnabled() {
        return this.getHighResolutionOutputSizeshNQ4ISI.checkGate((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) com.paypal.oslo.feature.p2p.data.remoteconfig.P2pFeatureGates.getOutputFormats.getValue(com.paypal.oslo.feature.p2p.data.remoteconfig.P2pFeatureGates.INSTANCE, com.paypal.oslo.feature.p2p.data.remoteconfig.P2pFeatureGates.Camera2StreamConfigurationMap[5]));
    }

    @Override // com.paypal.oslo.feature.p2p.domain.remoteconfig.P2pFeatureGateManager
    public final boolean isClaimMoneyDeeplinkEnabled() {
        return this.getHighResolutionOutputSizeshNQ4ISI.checkGate((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) com.paypal.oslo.feature.p2p.data.remoteconfig.P2pFeatureGates.getOutputMinFrameDuration.getValue(com.paypal.oslo.feature.p2p.data.remoteconfig.P2pFeatureGates.INSTANCE, com.paypal.oslo.feature.p2p.data.remoteconfig.P2pFeatureGates.Camera2StreamConfigurationMap[6]));
    }
}
