package com.paypal.oslo.feature.packagetracking.remoteconfig.featureflags;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\f\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001b\u0010\u000f\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001b\u0010\u0012\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u001b\u0010\u0015\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001b\u0010\u0018\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/remoteconfig/featureflags/PackageTrackingFeatureGateSpec;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGateSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "amazonOrdersEnabled$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getAmazonOrdersEnabled", "()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "amazonOrdersEnabled", "primeShipmentEnabled$delegate", "getPrimeShipmentEnabled", "primeShipmentEnabled", "packageEditingEnabled$delegate", "getPackageEditingEnabled", "packageEditingEnabled", "orderPlacedBwpSheetEnabled$delegate", "getOrderPlacedBwpSheetEnabled", "orderPlacedBwpSheetEnabled", "settingsDeleteImportedDataEnabled$delegate", "getSettingsDeleteImportedDataEnabled", "settingsDeleteImportedDataEnabled", "emailRelinkReminder$delegate", "getEmailRelinkReminder", "emailRelinkReminder"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PackageTrackingFeatureGateSpec extends com.paypal.oslo.core.remoteconfig.contract.FeatureGateSpec {
    public static final int $stable;
    public static final com.paypal.oslo.feature.packagetracking.remoteconfig.featureflags.PackageTrackingFeatureGateSpec INSTANCE;

    /* renamed from: amazonOrdersEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty amazonOrdersEnabled;

    /* renamed from: emailRelinkReminder$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty emailRelinkReminder;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoSizes = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.packagetracking.remoteconfig.featureflags.PackageTrackingFeatureGateSpec.class, "amazonOrdersEnabled", "getAmazonOrdersEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.packagetracking.remoteconfig.featureflags.PackageTrackingFeatureGateSpec.class, "primeShipmentEnabled", "getPrimeShipmentEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.packagetracking.remoteconfig.featureflags.PackageTrackingFeatureGateSpec.class, "packageEditingEnabled", "getPackageEditingEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.packagetracking.remoteconfig.featureflags.PackageTrackingFeatureGateSpec.class, "orderPlacedBwpSheetEnabled", "getOrderPlacedBwpSheetEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.packagetracking.remoteconfig.featureflags.PackageTrackingFeatureGateSpec.class, "settingsDeleteImportedDataEnabled", "getSettingsDeleteImportedDataEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.packagetracking.remoteconfig.featureflags.PackageTrackingFeatureGateSpec.class, "emailRelinkReminder", "getEmailRelinkReminder()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0))};

    /* renamed from: orderPlacedBwpSheetEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty orderPlacedBwpSheetEnabled;

    /* renamed from: packageEditingEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty packageEditingEnabled;

    /* renamed from: primeShipmentEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty primeShipmentEnabled;

    /* renamed from: settingsDeleteImportedDataEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty settingsDeleteImportedDataEnabled;

    private PackageTrackingFeatureGateSpec() {
        super("package_tracking");
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getAmazonOrdersEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) amazonOrdersEnabled.getValue(this, getHighSpeedVideoSizes[0]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getPrimeShipmentEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) primeShipmentEnabled.getValue(this, getHighSpeedVideoSizes[1]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getPackageEditingEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) packageEditingEnabled.getValue(this, getHighSpeedVideoSizes[2]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getOrderPlacedBwpSheetEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) orderPlacedBwpSheetEnabled.getValue(this, getHighSpeedVideoSizes[3]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getSettingsDeleteImportedDataEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) settingsDeleteImportedDataEnabled.getValue(this, getHighSpeedVideoSizes[4]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getEmailRelinkReminder() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) emailRelinkReminder.getValue(this, getHighSpeedVideoSizes[5]);
    }

    static {
        com.paypal.oslo.feature.packagetracking.remoteconfig.featureflags.PackageTrackingFeatureGateSpec packageTrackingFeatureGateSpec = new com.paypal.oslo.feature.packagetracking.remoteconfig.featureflags.PackageTrackingFeatureGateSpec();
        INSTANCE = packageTrackingFeatureGateSpec;
        amazonOrdersEnabled = packageTrackingFeatureGateSpec.create(com.paypal.oslo.feature.packagetracking.remoteconfig.PackageTrackingRemoteConfigConstants.FeatureGates.AMAZON_ORDER_ENABLED_KEY);
        primeShipmentEnabled = packageTrackingFeatureGateSpec.create(com.paypal.oslo.feature.packagetracking.remoteconfig.PackageTrackingRemoteConfigConstants.FeatureGates.PRIME_SHIPMENT_ENABLED_KEY);
        packageEditingEnabled = packageTrackingFeatureGateSpec.create(com.paypal.oslo.feature.packagetracking.remoteconfig.PackageTrackingRemoteConfigConstants.FeatureGates.PACKAGE_EDITING_ENABLED_KEY);
        orderPlacedBwpSheetEnabled = packageTrackingFeatureGateSpec.create(com.paypal.oslo.feature.packagetracking.remoteconfig.PackageTrackingRemoteConfigConstants.FeatureGates.ORDER_PLACED_BWP_SHEET_ENABLED_KEY);
        settingsDeleteImportedDataEnabled = packageTrackingFeatureGateSpec.create(com.paypal.oslo.feature.packagetracking.remoteconfig.PackageTrackingRemoteConfigConstants.FeatureGates.SETTINGS_DELETE_IMPORTED_DATA_ENABLED_KEY);
        emailRelinkReminder = packageTrackingFeatureGateSpec.create(com.paypal.oslo.feature.packagetracking.remoteconfig.PackageTrackingRemoteConfigConstants.FeatureGates.EMAIL_RELINK_REMINDER_KEY);
        $stable = 8;
    }
}
