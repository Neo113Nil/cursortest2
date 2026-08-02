package com.paypal.oslo.feature.controlcenter.manager;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/controlcenter/manager/ControlCenterFeatureManager;", "", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "featureGate", "<init>", "(Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;)V", "", "isAccountSwitchEnabled", "()Z", "isUpdatePhotoEnabled", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ControlCenterFeatureManager {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.contract.FeatureGate Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public ControlCenterFeatureManager(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        this.Camera2StreamConfigurationMap = featureGate;
    }

    public final boolean isAccountSwitchEnabled() {
        return this.Camera2StreamConfigurationMap.checkGate(com.paypal.oslo.feature.controlcenter.remoteconfig.ControlCenterFeatureGates.INSTANCE.getAccountSwitchEnabled());
    }

    public final boolean isUpdatePhotoEnabled() {
        return this.Camera2StreamConfigurationMap.checkGate(com.paypal.oslo.feature.controlcenter.remoteconfig.ControlCenterFeatureGates.INSTANCE.getUpdatePhotoEnabled());
    }
}
