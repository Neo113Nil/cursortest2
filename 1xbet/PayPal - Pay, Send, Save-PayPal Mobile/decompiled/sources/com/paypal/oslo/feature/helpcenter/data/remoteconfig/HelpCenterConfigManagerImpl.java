package com.paypal.oslo.feature.helpcenter.data.remoteconfig;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/data/remoteconfig/HelpCenterConfigManagerImpl;", "Lcom/paypal/oslo/feature/helpcenter/domain/remoteconfig/HelpCenterConfig$Manager;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "featureGate", "<init>", "(Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;)V", "", "isFeatureEnabled", "()Z", "isWifiCallingEnabled", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HelpCenterConfigManagerImpl implements com.paypal.oslo.feature.helpcenter.domain.remoteconfig.HelpCenterConfig.Manager {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.contract.FeatureGate getHighSpeedVideoSizes;

    @javax.inject.Inject
    public HelpCenterConfigManagerImpl(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        this.getHighSpeedVideoSizes = featureGate;
    }

    @Override // com.paypal.oslo.feature.helpcenter.domain.remoteconfig.HelpCenterConfig.Manager
    public final boolean isFeatureEnabled() {
        return this.getHighSpeedVideoSizes.checkGate(com.paypal.oslo.feature.helpcenter.domain.remoteconfig.HelpCenterFeatureGates.INSTANCE.getFeatureEnabled());
    }

    @Override // com.paypal.oslo.feature.helpcenter.domain.remoteconfig.HelpCenterConfig.Manager
    public final boolean isWifiCallingEnabled() {
        return this.getHighSpeedVideoSizes.checkGate(com.paypal.oslo.feature.helpcenter.domain.remoteconfig.HelpCenterFeatureGates.INSTANCE.getWifiCallingEnabled());
    }
}
