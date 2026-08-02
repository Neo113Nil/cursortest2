package com.paypal.oslo.feature.savings.common;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\f\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001b\u0010\u000f\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001b\u0010\u0012\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u001b\u0010\u0015\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001b\u0010\u0018\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\bR\u001b\u0010\u001b\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/savings/common/SavingsFeatureGates;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGateSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "featureEnabled$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getFeatureEnabled", "()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "featureEnabled", "addMoneyEnabled$delegate", "getAddMoneyEnabled", "addMoneyEnabled", "transferMoneyEnabled$delegate", "getTransferMoneyEnabled", "transferMoneyEnabled", "autoSaveEnabled$delegate", "getAutoSaveEnabled", "autoSaveEnabled", "hysOnboardingEnabled$delegate", "getHysOnboardingEnabled", "hysOnboardingEnabled", "balanceL2SmartRouteEnabled$delegate", "getBalanceL2SmartRouteEnabled", "balanceL2SmartRouteEnabled", "hysBetaDisclosureEnabled$delegate", "getHysBetaDisclosureEnabled", "hysBetaDisclosureEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SavingsFeatureGates extends com.paypal.oslo.core.remoteconfig.contract.FeatureGateSpec {
    public static final int $stable;
    public static final com.paypal.oslo.feature.savings.common.SavingsFeatureGates INSTANCE;

    /* renamed from: addMoneyEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty addMoneyEnabled;

    /* renamed from: autoSaveEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty autoSaveEnabled;

    /* renamed from: balanceL2SmartRouteEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty balanceL2SmartRouteEnabled;

    /* renamed from: featureEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty featureEnabled;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoFpsRanges = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.savings.common.SavingsFeatureGates.class, "featureEnabled", "getFeatureEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.savings.common.SavingsFeatureGates.class, "addMoneyEnabled", "getAddMoneyEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.savings.common.SavingsFeatureGates.class, "transferMoneyEnabled", "getTransferMoneyEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.savings.common.SavingsFeatureGates.class, "autoSaveEnabled", "getAutoSaveEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.savings.common.SavingsFeatureGates.class, "hysOnboardingEnabled", "getHysOnboardingEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.savings.common.SavingsFeatureGates.class, "balanceL2SmartRouteEnabled", "getBalanceL2SmartRouteEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.savings.common.SavingsFeatureGates.class, "hysBetaDisclosureEnabled", "getHysBetaDisclosureEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0))};

    /* renamed from: hysBetaDisclosureEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty hysBetaDisclosureEnabled;

    /* renamed from: hysOnboardingEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty hysOnboardingEnabled;

    /* renamed from: transferMoneyEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty transferMoneyEnabled;

    private SavingsFeatureGates() {
        super("money_management");
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getFeatureEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) featureEnabled.getValue(this, getHighSpeedVideoFpsRanges[0]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getAddMoneyEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) addMoneyEnabled.getValue(this, getHighSpeedVideoFpsRanges[1]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getTransferMoneyEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) transferMoneyEnabled.getValue(this, getHighSpeedVideoFpsRanges[2]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getAutoSaveEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) autoSaveEnabled.getValue(this, getHighSpeedVideoFpsRanges[3]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getHysOnboardingEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) hysOnboardingEnabled.getValue(this, getHighSpeedVideoFpsRanges[4]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getBalanceL2SmartRouteEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) balanceL2SmartRouteEnabled.getValue(this, getHighSpeedVideoFpsRanges[5]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getHysBetaDisclosureEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) hysBetaDisclosureEnabled.getValue(this, getHighSpeedVideoFpsRanges[6]);
    }

    static {
        com.paypal.oslo.feature.savings.common.SavingsFeatureGates savingsFeatureGates = new com.paypal.oslo.feature.savings.common.SavingsFeatureGates();
        INSTANCE = savingsFeatureGates;
        featureEnabled = savingsFeatureGates.create("savings");
        addMoneyEnabled = savingsFeatureGates.create("savings_add_money");
        transferMoneyEnabled = savingsFeatureGates.create(com.paypal.oslo.feature.savings.constants.SavingsConstants.RemoteConfig.TRANSFER_MONEY_KEY_NAME);
        autoSaveEnabled = savingsFeatureGates.create(com.paypal.oslo.feature.savings.constants.SavingsConstants.RemoteConfig.AUTO_SAVE_KEY_NAME);
        hysOnboardingEnabled = savingsFeatureGates.create(com.paypal.oslo.feature.savings.constants.SavingsConstants.RemoteConfig.HYS_ONBOARDING_KEY_NAME);
        balanceL2SmartRouteEnabled = savingsFeatureGates.create("balance_l2_smart_route");
        hysBetaDisclosureEnabled = savingsFeatureGates.create(com.paypal.oslo.feature.savings.constants.SavingsConstants.RemoteConfig.HYS_BETA_DISCLOSURE_KEY_NAME);
        $stable = 8;
    }
}
