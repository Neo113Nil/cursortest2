package com.paypal.oslo.feature.smartroute.manager;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/manager/SmartRouteFeatureManager;", "", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "featureGate", "<init>", "(Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;)V", "", "isSmartRouteFeatureEnabled", "()Z", "isBalanceL2SmartRouteEnabled", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SmartRouteFeatureManager {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.contract.FeatureGate getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public SmartRouteFeatureManager(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        this.getHighResolutionOutputSizeshNQ4ISI = featureGate;
    }

    public final boolean isSmartRouteFeatureEnabled() {
        return this.getHighResolutionOutputSizeshNQ4ISI.checkGate(com.paypal.oslo.feature.smartroute.common.SmartRouteFeatureGates.INSTANCE.getMainFeature());
    }

    public final boolean isBalanceL2SmartRouteEnabled() {
        return this.getHighResolutionOutputSizeshNQ4ISI.checkGate(com.paypal.oslo.feature.smartroute.common.BalanceIntegrationGates.INSTANCE.getBalanceL2SmartRoute());
    }
}
