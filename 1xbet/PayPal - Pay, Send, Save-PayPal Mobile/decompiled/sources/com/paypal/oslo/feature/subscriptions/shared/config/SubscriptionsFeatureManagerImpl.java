package com.paypal.oslo.feature.subscriptions.shared.config;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/config/SubscriptionsFeatureManagerImpl;", "Lcom/paypal/oslo/feature/subscriptions/shared/config/SubscriptionsFeatureManager;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "featureGate", "<init>", "(Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;)V", "", "isLinkBusinessesEnabled", "()Z", "isLinkSubscriptionsEnabled", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SubscriptionsFeatureManagerImpl implements com.paypal.oslo.feature.subscriptions.shared.config.SubscriptionsFeatureManager {
    public static final int $stable = 8;
    private final com.paypal.oslo.core.remoteconfig.contract.FeatureGate Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public SubscriptionsFeatureManagerImpl(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        this.Camera2StreamConfigurationMap = featureGate;
    }

    @Override // com.paypal.oslo.feature.subscriptions.shared.config.SubscriptionsFeatureManager
    public final boolean isLinkBusinessesEnabled() {
        return this.Camera2StreamConfigurationMap.checkGate(com.paypal.oslo.feature.subscriptions.shared.config.SubscriptionsFeatureGates.INSTANCE.getLinkBusinessesEnabled());
    }

    @Override // com.paypal.oslo.feature.subscriptions.shared.config.SubscriptionsFeatureManager
    public final boolean isLinkSubscriptionsEnabled() {
        return this.Camera2StreamConfigurationMap.checkGate(com.paypal.oslo.feature.subscriptions.shared.config.SubscriptionsFeatureGates.INSTANCE.getLinkSubscriptionsEnabled());
    }
}
