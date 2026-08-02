package com.paypal.oslo.feature.cashin.manager;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/cashin/manager/CashInFeatureManager;", "", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "featureGate", "<init>", "(Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;)V", "", "isCashInFeatureEnabled", "()Z", "isCashInOnboardingEnabled", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CashInFeatureManager {
    public static final int $stable = 8;
    private final com.paypal.oslo.core.remoteconfig.contract.FeatureGate getHighSpeedVideoSizes;

    @javax.inject.Inject
    public CashInFeatureManager(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        this.getHighSpeedVideoSizes = featureGate;
    }

    public final boolean isCashInFeatureEnabled() {
        return this.getHighSpeedVideoSizes.checkGate(com.paypal.oslo.feature.cashin.common.CashInFeatureGates.INSTANCE.getMainFeature());
    }

    public final boolean isCashInOnboardingEnabled() {
        return this.getHighSpeedVideoSizes.checkGate(com.paypal.oslo.feature.cashin.common.DebitCardIntegrationGates.INSTANCE.getAcquisitionEntrypointEnabled());
    }
}
