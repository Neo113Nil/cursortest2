package com.paypal.oslo.app.navigation;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\f\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001b\u0010\u000f\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001b\u0010\u0012\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u001b\u0010\u0015\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\b"}, d2 = {"Lcom/paypal/oslo/app/navigation/NavigationFeatureGates;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGateSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "topNavAccountSwitchEnabled$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getTopNavAccountSwitchEnabled", "()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "topNavAccountSwitchEnabled", "l0EntryForBusinessEnabled$delegate", "getL0EntryForBusinessEnabled", "l0EntryForBusinessEnabled", "l0EntryForConsumerEnabled$delegate", "getL0EntryForConsumerEnabled", "l0EntryForConsumerEnabled", "betaDisclaimerEnabled$delegate", "getBetaDisclaimerEnabled", "betaDisclaimerEnabled", "bottomNavPayPalPlusEnabled$delegate", "getBottomNavPayPalPlusEnabled", "bottomNavPayPalPlusEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NavigationFeatureGates extends com.paypal.oslo.core.remoteconfig.contract.FeatureGateSpec {
    public static final int $stable;
    public static final com.paypal.oslo.app.navigation.NavigationFeatureGates INSTANCE;

    /* renamed from: betaDisclaimerEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty betaDisclaimerEnabled;

    /* renamed from: bottomNavPayPalPlusEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty bottomNavPayPalPlusEnabled;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoFpsRanges = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.app.navigation.NavigationFeatureGates.class, "topNavAccountSwitchEnabled", "getTopNavAccountSwitchEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.app.navigation.NavigationFeatureGates.class, "l0EntryForBusinessEnabled", "getL0EntryForBusinessEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.app.navigation.NavigationFeatureGates.class, "l0EntryForConsumerEnabled", "getL0EntryForConsumerEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.app.navigation.NavigationFeatureGates.class, "betaDisclaimerEnabled", "getBetaDisclaimerEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.app.navigation.NavigationFeatureGates.class, "bottomNavPayPalPlusEnabled", "getBottomNavPayPalPlusEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0))};

    /* renamed from: l0EntryForBusinessEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty l0EntryForBusinessEnabled;

    /* renamed from: l0EntryForConsumerEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty l0EntryForConsumerEnabled;

    /* renamed from: topNavAccountSwitchEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty topNavAccountSwitchEnabled;

    private NavigationFeatureGates() {
        super("core_navigation");
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getTopNavAccountSwitchEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) topNavAccountSwitchEnabled.getValue(this, getHighSpeedVideoFpsRanges[0]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getL0EntryForBusinessEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) l0EntryForBusinessEnabled.getValue(this, getHighSpeedVideoFpsRanges[1]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getL0EntryForConsumerEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) l0EntryForConsumerEnabled.getValue(this, getHighSpeedVideoFpsRanges[2]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getBetaDisclaimerEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) betaDisclaimerEnabled.getValue(this, getHighSpeedVideoFpsRanges[3]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getBottomNavPayPalPlusEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) bottomNavPayPalPlusEnabled.getValue(this, getHighSpeedVideoFpsRanges[4]);
    }

    static {
        com.paypal.oslo.app.navigation.NavigationFeatureGates navigationFeatureGates = new com.paypal.oslo.app.navigation.NavigationFeatureGates();
        INSTANCE = navigationFeatureGates;
        topNavAccountSwitchEnabled = navigationFeatureGates.create("top_nav_account_switch_enabled");
        l0EntryForBusinessEnabled = navigationFeatureGates.create("l0_entry_for_business_enabled");
        l0EntryForConsumerEnabled = navigationFeatureGates.create("l0_entry_for_consumer_enabled");
        betaDisclaimerEnabled = navigationFeatureGates.create("beta_enabled");
        bottomNavPayPalPlusEnabled = navigationFeatureGates.create("bottom_nav_paypal_plus_enabled");
        $stable = 8;
    }
}
