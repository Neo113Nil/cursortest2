package com.paypal.oslo.feature.debitcard.shared.data.remoteconfig.gates;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\bR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/data/remoteconfig/gates/FeatureGateManagerImpl;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/remoteconfig/gates/FeatureGateManager;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "featureGate", "<init>", "(Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;)V", "", "isWidgetEntrypointEnabled", "()Z", "isWidgetAcquisitionEntrypointEnabled", "isCardConnectEntrypointEnabled", "isPpdcContingencyHandlingEnabled", "isAdditionalCardholderManagementEnabled", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FeatureGateManagerImpl implements com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.gates.FeatureGateManager {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.contract.FeatureGate getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public FeatureGateManagerImpl(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        this.getHighSpeedVideoFpsRangesFor = featureGate;
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.gates.FeatureGateManager
    public final boolean isWidgetEntrypointEnabled() {
        return this.getHighSpeedVideoFpsRangesFor.checkGate((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) com.paypal.oslo.feature.debitcard.shared.data.remoteconfig.gates.FeatureGates.getHighSpeedVideoFpsRanges.getValue(com.paypal.oslo.feature.debitcard.shared.data.remoteconfig.gates.FeatureGates.INSTANCE, com.paypal.oslo.feature.debitcard.shared.data.remoteconfig.gates.FeatureGates.Camera2StreamConfigurationMap[0]));
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.gates.FeatureGateManager
    public final boolean isWidgetAcquisitionEntrypointEnabled() {
        return this.getHighSpeedVideoFpsRangesFor.checkGate((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) com.paypal.oslo.feature.debitcard.shared.data.remoteconfig.gates.FeatureGates.getHighSpeedVideoFpsRangesFor.getValue(com.paypal.oslo.feature.debitcard.shared.data.remoteconfig.gates.FeatureGates.INSTANCE, com.paypal.oslo.feature.debitcard.shared.data.remoteconfig.gates.FeatureGates.Camera2StreamConfigurationMap[1]));
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.gates.FeatureGateManager
    public final boolean isCardConnectEntrypointEnabled() {
        return this.getHighSpeedVideoFpsRangesFor.checkGate((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) com.paypal.oslo.feature.debitcard.shared.data.remoteconfig.gates.FeatureGates.getHighResolutionOutputSizeshNQ4ISI.getValue(com.paypal.oslo.feature.debitcard.shared.data.remoteconfig.gates.FeatureGates.INSTANCE, com.paypal.oslo.feature.debitcard.shared.data.remoteconfig.gates.FeatureGates.Camera2StreamConfigurationMap[2]));
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.gates.FeatureGateManager
    public final boolean isPpdcContingencyHandlingEnabled() {
        return this.getHighSpeedVideoFpsRangesFor.checkGate((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) com.paypal.oslo.feature.debitcard.shared.data.remoteconfig.gates.FeatureGates.getHighSpeedVideoSizes.getValue(com.paypal.oslo.feature.debitcard.shared.data.remoteconfig.gates.FeatureGates.INSTANCE, com.paypal.oslo.feature.debitcard.shared.data.remoteconfig.gates.FeatureGates.Camera2StreamConfigurationMap[3]));
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.gates.FeatureGateManager
    public final boolean isAdditionalCardholderManagementEnabled() {
        return this.getHighSpeedVideoFpsRangesFor.checkGate((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) com.paypal.oslo.feature.debitcard.shared.data.remoteconfig.gates.FeatureGates.Camera2StreamConfigurationMap.getValue(com.paypal.oslo.feature.debitcard.shared.data.remoteconfig.gates.FeatureGates.INSTANCE, com.paypal.oslo.feature.debitcard.shared.data.remoteconfig.gates.FeatureGates.Camera2StreamConfigurationMap[4]));
    }
}
