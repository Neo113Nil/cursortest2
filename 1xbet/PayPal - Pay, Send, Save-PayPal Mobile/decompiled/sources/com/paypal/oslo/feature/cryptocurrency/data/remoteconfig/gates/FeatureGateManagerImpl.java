package com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.gates;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\bJ\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\bJ\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\bJ\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\bJ\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\bJ\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\bR\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/data/remoteconfig/gates/FeatureGateManagerImpl;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/gates/FeatureGateManager;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "featureGate", "<init>", "(Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;)V", "", "isPyusdRewardsEnabled", "()Z", "isRecurringBuysEnabled", "isGainsAndLossesEnabled", "isSendFeatureEnabled", "isReceiveFeatureEnabled", "isConvertToPYUSDEnabled", "isMockApiEnabled", "isPriceAlertsEnabled", "isAddressBookEnabled", "isSellToPyusdEnabled", "isCelsiusEnabled", "isPpdDisclaimersEnabled", "isLoyaltyForCryptoEnabled", "isBizAccountEnabled", "isOneOnboardingIntegrationEnabled", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FeatureGateManagerImpl implements com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.contract.FeatureGate getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public FeatureGateManagerImpl(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        this.getHighSpeedVideoFpsRanges = featureGate;
    }

    @Override // com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager
    public final boolean isPyusdRewardsEnabled() {
        return this.getHighSpeedVideoFpsRanges.checkGate((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.gates.FeatureGates.Camera2StreamConfigurationMap.getValue(com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.gates.FeatureGates.INSTANCE, com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.gates.FeatureGates.getHighSpeedVideoSizes[0]));
    }

    @Override // com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager
    public final boolean isRecurringBuysEnabled() {
        return this.getHighSpeedVideoFpsRanges.checkGate((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.gates.FeatureGates.getHighSpeedVideoSizes.getValue(com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.gates.FeatureGates.INSTANCE, com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.gates.FeatureGates.getHighSpeedVideoSizes[1]));
    }

    @Override // com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager
    public final boolean isGainsAndLossesEnabled() {
        return this.getHighSpeedVideoFpsRanges.checkGate((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.gates.FeatureGates.getHighSpeedVideoFpsRangesFor.getValue(com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.gates.FeatureGates.INSTANCE, com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.gates.FeatureGates.getHighSpeedVideoSizes[3]));
    }

    @Override // com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager
    public final boolean isSendFeatureEnabled() {
        return this.getHighSpeedVideoFpsRanges.checkGate((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.gates.FeatureGates.getHighSpeedVideoFpsRanges.getValue(com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.gates.FeatureGates.INSTANCE, com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.gates.FeatureGates.getHighSpeedVideoSizes[4]));
    }

    @Override // com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager
    public final boolean isReceiveFeatureEnabled() {
        return this.getHighSpeedVideoFpsRanges.checkGate((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.gates.FeatureGates.getInputFormats.getValue(com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.gates.FeatureGates.INSTANCE, com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.gates.FeatureGates.getHighSpeedVideoSizes[5]));
    }

    @Override // com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager
    public final boolean isConvertToPYUSDEnabled() {
        return this.getHighSpeedVideoFpsRanges.checkGate((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.gates.FeatureGates.getInputSizeshNQ4ISI.getValue(com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.gates.FeatureGates.INSTANCE, com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.gates.FeatureGates.getHighSpeedVideoSizes[6]));
    }

    @Override // com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager
    public final boolean isMockApiEnabled() {
        return this.getHighSpeedVideoFpsRanges.checkGate((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.gates.FeatureGates.getHighResolutionOutputSizeshNQ4ISI.getValue(com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.gates.FeatureGates.INSTANCE, com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.gates.FeatureGates.getHighSpeedVideoSizes[2]));
    }

    @Override // com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager
    public final boolean isPriceAlertsEnabled() {
        return this.getHighSpeedVideoFpsRanges.checkGate((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.gates.FeatureGates.getOutputFormats.getValue(com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.gates.FeatureGates.INSTANCE, com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.gates.FeatureGates.getHighSpeedVideoSizes[7]));
    }

    @Override // com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager
    public final boolean isAddressBookEnabled() {
        return this.getHighSpeedVideoFpsRanges.checkGate((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.gates.FeatureGates.getOutputMinFrameDuration.getValue(com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.gates.FeatureGates.INSTANCE, com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.gates.FeatureGates.getHighSpeedVideoSizes[8]));
    }

    @Override // com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager
    public final boolean isSellToPyusdEnabled() {
        return this.getHighSpeedVideoFpsRanges.checkGate((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.gates.FeatureGates.getHighSpeedVideoSizesFor.getValue(com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.gates.FeatureGates.INSTANCE, com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.gates.FeatureGates.getHighSpeedVideoSizes[9]));
    }

    @Override // com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager
    public final boolean isCelsiusEnabled() {
        return this.getHighSpeedVideoFpsRanges.checkGate((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.gates.FeatureGates.getOutputMinFrameDurationlomOqCM.getValue(com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.gates.FeatureGates.INSTANCE, com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.gates.FeatureGates.getHighSpeedVideoSizes[10]));
    }

    @Override // com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager
    public final boolean isPpdDisclaimersEnabled() {
        return this.getHighSpeedVideoFpsRanges.checkGate((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.gates.FeatureGates.getOutputStallDurationlomOqCM.getValue(com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.gates.FeatureGates.INSTANCE, com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.gates.FeatureGates.getHighSpeedVideoSizes[11]));
    }

    @Override // com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager
    public final boolean isLoyaltyForCryptoEnabled() {
        return this.getHighSpeedVideoFpsRanges.checkGate((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.gates.FeatureGates.getOutputStallDuration.getValue(com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.gates.FeatureGates.INSTANCE, com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.gates.FeatureGates.getHighSpeedVideoSizes[12]));
    }

    @Override // com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager
    public final boolean isBizAccountEnabled() {
        return this.getHighSpeedVideoFpsRanges.checkGate((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.gates.FeatureGates.getOutputSizeshNQ4ISI.getValue(com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.gates.FeatureGates.INSTANCE, com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.gates.FeatureGates.getHighSpeedVideoSizes[13]));
    }

    @Override // com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager
    public final boolean isOneOnboardingIntegrationEnabled() {
        return this.getHighSpeedVideoFpsRanges.checkGate((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.gates.FeatureGates.getOutputSizes.getValue(com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.gates.FeatureGates.INSTANCE, com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.gates.FeatureGates.getHighSpeedVideoSizes[14]));
    }
}
