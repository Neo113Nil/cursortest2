package com.paypal.oslo.feature.savings.manager;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\f\u001a\u00020\b¢\u0006\u0004\b\f\u0010\nJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\nJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\nJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\nJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\nJ\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/savings/manager/SavingsFeatureManager;", "Lcom/paypal/oslo/feature/savings/api/SavingsOnboardingProvider;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "featureGate", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "dynamicConfiguration", "<init>", "(Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;)V", "", "isSavingsFeatureAvailable", "()Z", "isAddMoneyFeatureAvailable", "isTransferMoneyFeatureAvailable", "isAutoSaveFeatureAvailable", "isHysOnboardingEnabled", "isSmartRouteEntryPointVisible", "isBetaDisclosureEnabled", "", "getBetaOptOutUrl", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SavingsFeatureManager implements com.paypal.oslo.feature.savings.api.SavingsOnboardingProvider {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.core.remoteconfig.contract.FeatureGate getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public SavingsFeatureManager(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicConfiguration, "");
        this.getHighSpeedVideoFpsRanges = featureGate;
        this.getHighSpeedVideoFpsRangesFor = dynamicConfiguration;
    }

    public final boolean isSavingsFeatureAvailable() {
        return this.getHighSpeedVideoFpsRanges.checkGate(com.paypal.oslo.feature.savings.common.SavingsFeatureGates.INSTANCE.getFeatureEnabled());
    }

    public final boolean isAddMoneyFeatureAvailable() {
        return this.getHighSpeedVideoFpsRanges.checkGate(com.paypal.oslo.feature.savings.common.SavingsFeatureGates.INSTANCE.getAddMoneyEnabled());
    }

    public final boolean isTransferMoneyFeatureAvailable() {
        return this.getHighSpeedVideoFpsRanges.checkGate(com.paypal.oslo.feature.savings.common.SavingsFeatureGates.INSTANCE.getTransferMoneyEnabled());
    }

    public final boolean isAutoSaveFeatureAvailable() {
        return this.getHighSpeedVideoFpsRanges.checkGate(com.paypal.oslo.feature.savings.common.SavingsFeatureGates.INSTANCE.getAutoSaveEnabled());
    }

    @Override // com.paypal.oslo.feature.savings.api.SavingsOnboardingProvider
    public final boolean isHysOnboardingEnabled() {
        return this.getHighSpeedVideoFpsRanges.checkGate(com.paypal.oslo.feature.savings.common.SavingsFeatureGates.INSTANCE.getHysOnboardingEnabled());
    }

    public final boolean isSmartRouteEntryPointVisible() {
        return this.getHighSpeedVideoFpsRanges.checkGate(com.paypal.oslo.feature.savings.common.SavingsFeatureGates.INSTANCE.getBalanceL2SmartRouteEnabled());
    }

    public final boolean isBetaDisclosureEnabled() {
        return this.getHighSpeedVideoFpsRanges.checkGate(com.paypal.oslo.feature.savings.common.SavingsFeatureGates.INSTANCE.getHysBetaDisclosureEnabled());
    }

    public final java.lang.String getBetaOptOutUrl() {
        return (java.lang.String) this.getHighSpeedVideoFpsRangesFor.getValue(com.paypal.oslo.feature.savings.common.SavingsDynamicConfigs.INSTANCE.getHysBetaOptOutUrl());
    }
}
