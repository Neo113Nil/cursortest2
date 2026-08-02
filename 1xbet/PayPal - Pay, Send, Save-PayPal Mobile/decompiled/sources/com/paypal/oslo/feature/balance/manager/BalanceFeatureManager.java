package com.paypal.oslo.feature.balance.manager;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\bJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\bJ\r\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\bJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\bJ\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\bJ\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\bJ\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\bJ\r\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\bJ\r\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\bJ\r\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\bJ\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\bJ\r\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\bJ\r\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\bJ\r\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\bR\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/balance/manager/BalanceFeatureManager;", "", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "featureGate", "<init>", "(Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;)V", "", "isFeatureEnabled", "()Z", "isAutoReloadEnabled", "isPreferredPaymentModeEnabled", "isAddCashStoresEnabled", "isCashInCheckEnabled", "isFileTaxesEnabled", "isDirectDepositEnabled", "isSmartRouteEnabled", "isNbaEnabled", "isMoreOptionsEnabled", "isAccountRoutingEnabled", "isActivityWidgetEnabled", "isViewCurrenciesEnabled", "isAddMoneyEnabled", "isAccountRoutingProvisioned", "isNbaCategorySelectionEnabled", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BalanceFeatureManager {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.contract.FeatureGate getHighSpeedVideoSizes;

    @javax.inject.Inject
    public BalanceFeatureManager(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        this.getHighSpeedVideoSizes = featureGate;
    }

    public final boolean isFeatureEnabled() {
        return this.getHighSpeedVideoSizes.checkGate(com.paypal.oslo.feature.balance.common.BalanceFeatureGates.INSTANCE.getFeatureEnabled());
    }

    public final boolean isAutoReloadEnabled() {
        return this.getHighSpeedVideoSizes.checkGate(com.paypal.oslo.feature.balance.common.BalanceFeatureGates.INSTANCE.getAutoReloadEnabled());
    }

    public final boolean isPreferredPaymentModeEnabled() {
        return this.getHighSpeedVideoSizes.checkGate(com.paypal.oslo.feature.balance.common.BalanceFeatureGates.INSTANCE.getPreferredPaymentModeEnabled());
    }

    public final boolean isAddCashStoresEnabled() {
        return this.getHighSpeedVideoSizes.checkGate(com.paypal.oslo.feature.balance.common.BalanceFeatureGates.INSTANCE.getAddCashStoresEnabled());
    }

    public final boolean isCashInCheckEnabled() {
        return this.getHighSpeedVideoSizes.checkGate(com.paypal.oslo.feature.balance.common.BalanceFeatureGates.INSTANCE.getCashInCheckEnabled());
    }

    public final boolean isFileTaxesEnabled() {
        return this.getHighSpeedVideoSizes.checkGate(com.paypal.oslo.feature.balance.common.BalanceFeatureGates.INSTANCE.getFileTaxesEnabled());
    }

    public final boolean isDirectDepositEnabled() {
        return this.getHighSpeedVideoSizes.checkGate(com.paypal.oslo.feature.balance.common.BalanceFeatureGates.INSTANCE.getDirectDepositEnabled());
    }

    public final boolean isSmartRouteEnabled() {
        return this.getHighSpeedVideoSizes.checkGate(com.paypal.oslo.feature.balance.common.BalanceFeatureGates.INSTANCE.getSmartRouteEnabled());
    }

    public final boolean isNbaEnabled() {
        return this.getHighSpeedVideoSizes.checkGate(com.paypal.oslo.feature.balance.common.BalanceFeatureGates.INSTANCE.getNbaEnabled());
    }

    public final boolean isMoreOptionsEnabled() {
        return this.getHighSpeedVideoSizes.checkGate(com.paypal.oslo.feature.balance.common.BalanceFeatureGates.INSTANCE.getMoreOptionsEnabled());
    }

    public final boolean isAccountRoutingEnabled() {
        return this.getHighSpeedVideoSizes.checkGate(com.paypal.oslo.feature.balance.common.BalanceFeatureGates.INSTANCE.getAccountRoutingEnabled());
    }

    public final boolean isActivityWidgetEnabled() {
        return this.getHighSpeedVideoSizes.checkGate(com.paypal.oslo.feature.balance.common.BalanceFeatureGates.INSTANCE.getActivityWidgetEnabled());
    }

    public final boolean isViewCurrenciesEnabled() {
        return this.getHighSpeedVideoSizes.checkGate(com.paypal.oslo.feature.balance.common.BalanceFeatureGates.INSTANCE.getViewCurrenciesEnabled());
    }

    public final boolean isAddMoneyEnabled() {
        return this.getHighSpeedVideoSizes.checkGate(com.paypal.oslo.feature.balance.common.BalanceFeatureGates.INSTANCE.getAddMoneyEnabled());
    }

    public final boolean isAccountRoutingProvisioned() {
        return this.getHighSpeedVideoSizes.checkGate(com.paypal.oslo.feature.balance.common.BalanceFeatureGates.INSTANCE.getAccountRoutingProvisioned());
    }

    public final boolean isNbaCategorySelectionEnabled() {
        return this.getHighSpeedVideoSizes.checkGate(com.paypal.oslo.feature.balance.common.BalanceFeatureGates.INSTANCE.getNbaCategorySelectionEnabled());
    }
}
