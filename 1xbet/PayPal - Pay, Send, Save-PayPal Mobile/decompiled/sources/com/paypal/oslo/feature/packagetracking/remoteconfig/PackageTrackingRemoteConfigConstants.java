package com.paypal.oslo.feature.packagetracking.remoteconfig;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/remoteconfig/PackageTrackingRemoteConfigConstants;", "", "<init>", "()V", "", "DOMAIN", "Ljava/lang/String;", "FeatureGates"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PackageTrackingRemoteConfigConstants {
    public static final int $stable = 0;
    public static final java.lang.String DOMAIN = "package_tracking";
    public static final com.paypal.oslo.feature.packagetracking.remoteconfig.PackageTrackingRemoteConfigConstants INSTANCE = new com.paypal.oslo.feature.packagetracking.remoteconfig.PackageTrackingRemoteConfigConstants();

    private PackageTrackingRemoteConfigConstants() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/remoteconfig/PackageTrackingRemoteConfigConstants$FeatureGates;", "", "<init>", "()V", "", "AMAZON_ORDER_ENABLED_KEY", "Ljava/lang/String;", "PRIME_SHIPMENT_ENABLED_KEY", "PACKAGE_EDITING_ENABLED_KEY", "ORDER_PLACED_BWP_SHEET_ENABLED_KEY", "SETTINGS_DELETE_IMPORTED_DATA_ENABLED_KEY", "EMAIL_RELINK_REMINDER_KEY"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class FeatureGates {
        public static final int $stable = 0;
        public static final java.lang.String AMAZON_ORDER_ENABLED_KEY = "amazon_order_enabled";
        public static final java.lang.String EMAIL_RELINK_REMINDER_KEY = "email_relink_reminder";
        public static final com.paypal.oslo.feature.packagetracking.remoteconfig.PackageTrackingRemoteConfigConstants.FeatureGates INSTANCE = new com.paypal.oslo.feature.packagetracking.remoteconfig.PackageTrackingRemoteConfigConstants.FeatureGates();
        public static final java.lang.String ORDER_PLACED_BWP_SHEET_ENABLED_KEY = "order_placed_bwp_sheet_enabled";
        public static final java.lang.String PACKAGE_EDITING_ENABLED_KEY = "package_editing_enabled";
        public static final java.lang.String PRIME_SHIPMENT_ENABLED_KEY = "prime_shipment_enabled";
        public static final java.lang.String SETTINGS_DELETE_IMPORTED_DATA_ENABLED_KEY = "settings_delete_imported_data_enabled";

        private FeatureGates() {
        }
    }
}
