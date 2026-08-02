package com.paypal.oslo.feature.balance.common;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b2\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\f\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001b\u0010\u000f\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001b\u0010\u0012\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u001b\u0010\u0015\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001b\u0010\u0018\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\bR\u001b\u0010\u001b\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u001b\u0010\u001e\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001d\u0010\bR\u001b\u0010!\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\bR\u001b\u0010$\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0006\u001a\u0004\b#\u0010\bR\u001b\u0010'\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\bR\u001b\u0010*\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0006\u001a\u0004\b)\u0010\bR\u001b\u0010-\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\bR\u001b\u00100\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u0006\u001a\u0004\b/\u0010\bR\u001b\u00103\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b2\u0010\bR\u001b\u00106\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\u0006\u001a\u0004\b5\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/balance/common/BalanceFeatureGates;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGateSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "featureEnabled$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getFeatureEnabled", "()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "featureEnabled", "autoReloadEnabled$delegate", "getAutoReloadEnabled", "autoReloadEnabled", "preferredPaymentModeEnabled$delegate", "getPreferredPaymentModeEnabled", "preferredPaymentModeEnabled", "addCashStoresEnabled$delegate", "getAddCashStoresEnabled", "addCashStoresEnabled", "cashInCheckEnabled$delegate", "getCashInCheckEnabled", "cashInCheckEnabled", "fileTaxesEnabled$delegate", "getFileTaxesEnabled", "fileTaxesEnabled", "directDepositEnabled$delegate", "getDirectDepositEnabled", "directDepositEnabled", "smartRouteEnabled$delegate", "getSmartRouteEnabled", "smartRouteEnabled", "nbaEnabled$delegate", "getNbaEnabled", "nbaEnabled", "nbaCategorySelectionEnabled$delegate", "getNbaCategorySelectionEnabled", "nbaCategorySelectionEnabled", "moreOptionsEnabled$delegate", "getMoreOptionsEnabled", "moreOptionsEnabled", "accountRoutingEnabled$delegate", "getAccountRoutingEnabled", "accountRoutingEnabled", "activityWidgetEnabled$delegate", "getActivityWidgetEnabled", "activityWidgetEnabled", "viewCurrenciesEnabled$delegate", "getViewCurrenciesEnabled", "viewCurrenciesEnabled", "addMoneyEnabled$delegate", "getAddMoneyEnabled", "addMoneyEnabled", "accountRoutingProvisioned$delegate", "getAccountRoutingProvisioned", "accountRoutingProvisioned"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BalanceFeatureGates extends com.paypal.oslo.core.remoteconfig.contract.FeatureGateSpec {
    public static final int $stable;
    public static final com.paypal.oslo.feature.balance.common.BalanceFeatureGates INSTANCE;

    /* renamed from: accountRoutingEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty accountRoutingEnabled;

    /* renamed from: accountRoutingProvisioned$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty accountRoutingProvisioned;

    /* renamed from: activityWidgetEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty activityWidgetEnabled;

    /* renamed from: addCashStoresEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty addCashStoresEnabled;

    /* renamed from: addMoneyEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty addMoneyEnabled;

    /* renamed from: autoReloadEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty autoReloadEnabled;

    /* renamed from: cashInCheckEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty cashInCheckEnabled;

    /* renamed from: directDepositEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty directDepositEnabled;

    /* renamed from: featureEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty featureEnabled;

    /* renamed from: fileTaxesEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty fileTaxesEnabled;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoFpsRangesFor = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.balance.common.BalanceFeatureGates.class, "featureEnabled", "getFeatureEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.balance.common.BalanceFeatureGates.class, "autoReloadEnabled", "getAutoReloadEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.balance.common.BalanceFeatureGates.class, "preferredPaymentModeEnabled", "getPreferredPaymentModeEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.balance.common.BalanceFeatureGates.class, "addCashStoresEnabled", "getAddCashStoresEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.balance.common.BalanceFeatureGates.class, "cashInCheckEnabled", "getCashInCheckEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.balance.common.BalanceFeatureGates.class, "fileTaxesEnabled", "getFileTaxesEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.balance.common.BalanceFeatureGates.class, "directDepositEnabled", "getDirectDepositEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.balance.common.BalanceFeatureGates.class, "smartRouteEnabled", "getSmartRouteEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.balance.common.BalanceFeatureGates.class, "nbaEnabled", "getNbaEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.balance.common.BalanceFeatureGates.class, "nbaCategorySelectionEnabled", "getNbaCategorySelectionEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.balance.common.BalanceFeatureGates.class, "moreOptionsEnabled", "getMoreOptionsEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.balance.common.BalanceFeatureGates.class, "accountRoutingEnabled", "getAccountRoutingEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.balance.common.BalanceFeatureGates.class, "activityWidgetEnabled", "getActivityWidgetEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.balance.common.BalanceFeatureGates.class, "viewCurrenciesEnabled", "getViewCurrenciesEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.balance.common.BalanceFeatureGates.class, "addMoneyEnabled", "getAddMoneyEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.balance.common.BalanceFeatureGates.class, "accountRoutingProvisioned", "getAccountRoutingProvisioned()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0))};

    /* renamed from: moreOptionsEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty moreOptionsEnabled;

    /* renamed from: nbaCategorySelectionEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty nbaCategorySelectionEnabled;

    /* renamed from: nbaEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty nbaEnabled;

    /* renamed from: preferredPaymentModeEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty preferredPaymentModeEnabled;

    /* renamed from: smartRouteEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty smartRouteEnabled;

    /* renamed from: viewCurrenciesEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty viewCurrenciesEnabled;

    private BalanceFeatureGates() {
        super("money_management");
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getFeatureEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) featureEnabled.getValue(this, getHighSpeedVideoFpsRangesFor[0]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getAutoReloadEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) autoReloadEnabled.getValue(this, getHighSpeedVideoFpsRangesFor[1]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getPreferredPaymentModeEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) preferredPaymentModeEnabled.getValue(this, getHighSpeedVideoFpsRangesFor[2]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getAddCashStoresEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) addCashStoresEnabled.getValue(this, getHighSpeedVideoFpsRangesFor[3]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getCashInCheckEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) cashInCheckEnabled.getValue(this, getHighSpeedVideoFpsRangesFor[4]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getFileTaxesEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) fileTaxesEnabled.getValue(this, getHighSpeedVideoFpsRangesFor[5]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getDirectDepositEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) directDepositEnabled.getValue(this, getHighSpeedVideoFpsRangesFor[6]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getSmartRouteEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) smartRouteEnabled.getValue(this, getHighSpeedVideoFpsRangesFor[7]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getNbaEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) nbaEnabled.getValue(this, getHighSpeedVideoFpsRangesFor[8]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getNbaCategorySelectionEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) nbaCategorySelectionEnabled.getValue(this, getHighSpeedVideoFpsRangesFor[9]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getMoreOptionsEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) moreOptionsEnabled.getValue(this, getHighSpeedVideoFpsRangesFor[10]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getAccountRoutingEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) accountRoutingEnabled.getValue(this, getHighSpeedVideoFpsRangesFor[11]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getActivityWidgetEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) activityWidgetEnabled.getValue(this, getHighSpeedVideoFpsRangesFor[12]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getViewCurrenciesEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) viewCurrenciesEnabled.getValue(this, getHighSpeedVideoFpsRangesFor[13]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getAddMoneyEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) addMoneyEnabled.getValue(this, getHighSpeedVideoFpsRangesFor[14]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getAccountRoutingProvisioned() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) accountRoutingProvisioned.getValue(this, getHighSpeedVideoFpsRangesFor[15]);
    }

    static {
        com.paypal.oslo.feature.balance.common.BalanceFeatureGates balanceFeatureGates = new com.paypal.oslo.feature.balance.common.BalanceFeatureGates();
        INSTANCE = balanceFeatureGates;
        featureEnabled = balanceFeatureGates.create("balance");
        autoReloadEnabled = balanceFeatureGates.create(com.paypal.oslo.feature.balance.common.BalanceConstants.RemoteConfig.AUTO_RELOAD_KEY_NAME);
        preferredPaymentModeEnabled = balanceFeatureGates.create(com.paypal.oslo.feature.balance.common.BalanceConstants.RemoteConfig.PREFERRED_PAYMENT_MODE_KEY_NAME);
        addCashStoresEnabled = balanceFeatureGates.create(com.paypal.oslo.feature.balance.common.BalanceConstants.RemoteConfig.ADD_CASH_STORES_KEY_NAME);
        cashInCheckEnabled = balanceFeatureGates.create(com.paypal.oslo.feature.balance.common.BalanceConstants.RemoteConfig.CASH_IN_CHECK_KEY_NAME);
        fileTaxesEnabled = balanceFeatureGates.create(com.paypal.oslo.feature.balance.common.BalanceConstants.RemoteConfig.FILE_TAXES_KEY_NAME);
        directDepositEnabled = balanceFeatureGates.create(com.paypal.oslo.feature.balance.common.BalanceConstants.RemoteConfig.DIRECT_DEPOSIT_KEY_NAME);
        smartRouteEnabled = balanceFeatureGates.create("balance_l2_smart_route");
        nbaEnabled = balanceFeatureGates.create(com.paypal.oslo.feature.balance.common.BalanceConstants.RemoteConfig.NBA_KEY_NAME);
        nbaCategorySelectionEnabled = balanceFeatureGates.create(com.paypal.oslo.feature.balance.common.BalanceConstants.RemoteConfig.NBA_CATEGORY_SELECTION_KEY_NAME);
        moreOptionsEnabled = balanceFeatureGates.create(com.paypal.oslo.feature.balance.common.BalanceConstants.RemoteConfig.MORE_OPTIONS_KEY_NAME);
        accountRoutingEnabled = balanceFeatureGates.create(com.paypal.oslo.feature.balance.common.BalanceConstants.RemoteConfig.ACCOUNT_ROUTING_KEY_NAME);
        activityWidgetEnabled = balanceFeatureGates.create(com.paypal.oslo.feature.balance.common.BalanceConstants.RemoteConfig.ACTIVITY_WIDGET_KEY_NAME);
        viewCurrenciesEnabled = balanceFeatureGates.create(com.paypal.oslo.feature.balance.common.BalanceConstants.RemoteConfig.VIEW_CURRENCIES_KEY_NAME);
        addMoneyEnabled = balanceFeatureGates.create(com.paypal.oslo.feature.balance.common.BalanceConstants.RemoteConfig.ADD_MONEY_KEY_NAME);
        accountRoutingProvisioned = balanceFeatureGates.create(com.paypal.oslo.feature.balance.common.BalanceConstants.RemoteConfig.ACCOUNT_ROUTING_PROVISIONED);
        $stable = 8;
    }
}
