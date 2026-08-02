package com.paypal.oslo.feature.settings.featureflags.config;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\f\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001b\u0010\u000f\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001b\u0010\u0012\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u001b\u0010\u0015\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001b\u0010\u0018\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\bR\u001b\u0010\u001b\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/settings/featureflags/config/SettingsFeatureGates;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGateSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "creditEligibility$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getCreditEligibility", "()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "creditEligibility", "cashbackEligibility$delegate", "getCashbackEligibility", "cashbackEligibility", "savingsAutoSave$delegate", "getSavingsAutoSave", "savingsAutoSave", "cryptoEligibility$delegate", "getCryptoEligibility", "cryptoEligibility", "dsrMerchantEligibility$delegate", "getDsrMerchantEligibility", "dsrMerchantEligibility", "savingsSmartRoute$delegate", "getSavingsSmartRoute", "savingsSmartRoute", "closeAccount$delegate", "getCloseAccount", "closeAccount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SettingsFeatureGates extends com.paypal.oslo.core.remoteconfig.contract.FeatureGateSpec {
    public static final int $stable;
    public static final com.paypal.oslo.feature.settings.featureflags.config.SettingsFeatureGates INSTANCE;

    /* renamed from: cashbackEligibility$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty cashbackEligibility;

    /* renamed from: closeAccount$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty closeAccount;

    /* renamed from: creditEligibility$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty creditEligibility;

    /* renamed from: cryptoEligibility$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty cryptoEligibility;

    /* renamed from: dsrMerchantEligibility$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty dsrMerchantEligibility;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoFpsRanges = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.settings.featureflags.config.SettingsFeatureGates.class, "creditEligibility", "getCreditEligibility()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.settings.featureflags.config.SettingsFeatureGates.class, "cashbackEligibility", "getCashbackEligibility()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.settings.featureflags.config.SettingsFeatureGates.class, "savingsAutoSave", "getSavingsAutoSave()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.settings.featureflags.config.SettingsFeatureGates.class, "cryptoEligibility", "getCryptoEligibility()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.settings.featureflags.config.SettingsFeatureGates.class, "dsrMerchantEligibility", "getDsrMerchantEligibility()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.settings.featureflags.config.SettingsFeatureGates.class, "savingsSmartRoute", "getSavingsSmartRoute()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.settings.featureflags.config.SettingsFeatureGates.class, "closeAccount", "getCloseAccount()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0))};

    /* renamed from: savingsAutoSave$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty savingsAutoSave;

    /* renamed from: savingsSmartRoute$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty savingsSmartRoute;

    private SettingsFeatureGates() {
        super("settings");
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getCreditEligibility() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) creditEligibility.getValue(this, getHighSpeedVideoFpsRanges[0]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getCashbackEligibility() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) cashbackEligibility.getValue(this, getHighSpeedVideoFpsRanges[1]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getSavingsAutoSave() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) savingsAutoSave.getValue(this, getHighSpeedVideoFpsRanges[2]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getCryptoEligibility() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) cryptoEligibility.getValue(this, getHighSpeedVideoFpsRanges[3]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getDsrMerchantEligibility() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) dsrMerchantEligibility.getValue(this, getHighSpeedVideoFpsRanges[4]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getSavingsSmartRoute() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) savingsSmartRoute.getValue(this, getHighSpeedVideoFpsRanges[5]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getCloseAccount() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) closeAccount.getValue(this, getHighSpeedVideoFpsRanges[6]);
    }

    static {
        com.paypal.oslo.feature.settings.featureflags.config.SettingsFeatureGates settingsFeatureGates = new com.paypal.oslo.feature.settings.featureflags.config.SettingsFeatureGates();
        INSTANCE = settingsFeatureGates;
        creditEligibility = settingsFeatureGates.create("credit_eligibility");
        cashbackEligibility = settingsFeatureGates.create("cashback_eligibility");
        savingsAutoSave = settingsFeatureGates.create(com.paypal.oslo.feature.savings.constants.SavingsConstants.RemoteConfig.AUTO_SAVE_KEY_NAME);
        cryptoEligibility = settingsFeatureGates.create("crypto_eligibility");
        dsrMerchantEligibility = settingsFeatureGates.create("dsr_merchant_eligibility");
        savingsSmartRoute = settingsFeatureGates.create("smart_route_eligibility");
        closeAccount = settingsFeatureGates.create(com.paypal.oslo.feature.settings.constants.SettingsConstants.Analytics.CLOSE_ACCOUNT_SOURCE);
        $stable = 8;
    }
}
