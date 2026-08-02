package com.paypal.oslo.feature.packagetracking.ui.analytics;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\bÀ\u0002\u0018\u00002\u00020\u0001:\t\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\f\u001a\u00020\u0004*\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/analytics/PTAnalytics;", "", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "item", "", "Lcom/paypal/oslo/core/telemetry/analytics/context/AnalyticsContext;", "contexts", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "analytics", "(Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;Ljava/util/List;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;)Landroidx/compose/ui/Modifier;", "Components", "Items", "ActionNames", "FeatureNames", "ErrorTypes", "ErrorCodes", "PackageDetailContexts", "PackageSettingsContexts", "AmazonUserPreferencesContexts"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PTAnalytics {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics();

    private PTAnalytics() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/analytics/PTAnalytics$Components;", "", "<init>", "()V", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "viewShippingUpdatesButton", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "getViewShippingUpdatesButton", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "unlinkEmailBottomSheet", "getUnlinkEmailBottomSheet", "unlinkAllAccountsBottomSheet", "getUnlinkAllAccountsBottomSheet", "deleteDataBottomSheet", "getDeleteDataBottomSheet", "relinkGmail", "getRelinkGmail"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Components {
        public static final int $stable;
        public static final com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.Components INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.Components();
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component viewShippingUpdatesButton = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("view_shipping_updates_button", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component unlinkEmailBottomSheet = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("unlink_email_bottom_sheet", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component unlinkAllAccountsBottomSheet = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("unlink_all_accounts_bottom_sheet", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component deleteDataBottomSheet = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("delete_data_bottom_sheet", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component relinkGmail = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("relink_gmail", 0, null, null, 14, null);

        private Components() {
        }

        static {
            int i = com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable;
            $stable = i | i | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getViewShippingUpdatesButton() {
            return viewShippingUpdatesButton;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getUnlinkEmailBottomSheet() {
            return unlinkEmailBottomSheet;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getUnlinkAllAccountsBottomSheet() {
            return unlinkAllAccountsBottomSheet;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getDeleteDataBottomSheet() {
            return deleteDataBottomSheet;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getRelinkGmail() {
            return relinkGmail;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b@\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0017\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u001a\u0010\u0019\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u001a\u0010\u001d\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u001a\u0010\u001f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\bR\u001a\u0010#\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b$\u0010\bR\u001a\u0010%\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\bR\u001a\u0010'\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b(\u0010\bR\u001a\u0010)\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0006\u001a\u0004\b*\u0010\bR\u001a\u0010+\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\bR\u001a\u0010-\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\u0006\u001a\u0004\b.\u0010\bR\u001a\u0010/\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\u0006\u001a\u0004\b0\u0010\bR\u001a\u00101\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b2\u0010\bR\u001a\u00103\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010\u0006\u001a\u0004\b4\u0010\bR\u001a\u00105\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010\u0006\u001a\u0004\b6\u0010\bR\u001a\u00107\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010\u0006\u001a\u0004\b8\u0010\bR\u001a\u00109\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010\u0006\u001a\u0004\b:\u0010\bR\u001a\u0010;\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010\u0006\u001a\u0004\b<\u0010\bR\u001a\u0010=\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010\u0006\u001a\u0004\b>\u0010\bR\u001a\u0010?\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010\u0006\u001a\u0004\b@\u0010\bR\u001a\u0010A\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010\u0006\u001a\u0004\bB\u0010\bR\u001a\u0010C\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010\u0006\u001a\u0004\bD\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/analytics/PTAnalytics$Items;", "", "<init>", "()V", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "settingsButton", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getSettingsButton", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "manageOnAmazonButton", "getManageOnAmazonButton", "viewShippingUpdatesButton", "getViewShippingUpdatesButton", "viewShippingUpdatesChevron", "getViewShippingUpdatesChevron", "trackingNumber", "getTrackingNumber", "copyTrackingNumberButton", "getCopyTrackingNumberButton", "mapLoaded", "getMapLoaded", "emailLinkBanner", "getEmailLinkBanner", "alertBanner", "getAlertBanner", "linkEmailButton", "getLinkEmailButton", "accountLinkSuccess", "getAccountLinkSuccess", "privacyLink", "getPrivacyLink", "learnMoreLink", "getLearnMoreLink", "contactUsLink", "getContactUsLink", "unlinkEmailButton", "getUnlinkEmailButton", "unlinkEmailBottomSheetButton", "getUnlinkEmailBottomSheetButton", "unlinkEmailSuccess", "getUnlinkEmailSuccess", "unlinkEmailError", "getUnlinkEmailError", "unlinkAllAccountsBottomSheetButton", "getUnlinkAllAccountsBottomSheetButton", "unlinkAllAccountsSuccess", "getUnlinkAllAccountsSuccess", "deleteDataSuccess", "getDeleteDataSuccess", "deleteDataBottomSheetButton", "getDeleteDataBottomSheetButton", "genericError", "getGenericError", "genericErrorRefreshButton", "getGenericErrorRefreshButton", "inlineHelpIcon", "getInlineHelpIcon", "errorBanner", "getErrorBanner", "amazonPreferencesInlineHelpButton", "getAmazonPreferencesInlineHelpButton", "amazonPreferencesToggleButton", "getAmazonPreferencesToggleButton", "amazonPreferencesUpdateSuccess", "getAmazonPreferencesUpdateSuccess", "relinkGmailSuccess", "getRelinkGmailSuccess", "linkEmail", "getLinkEmail"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Items {
        public static final int $stable;
        public static final com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.Items INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.Items();
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item settingsButton = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("settings_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item manageOnAmazonButton = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("manage_on_amazon_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item viewShippingUpdatesButton = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("view_shipping_updates_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item viewShippingUpdatesChevron = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("view_shipping_updates_chevron", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item trackingNumber = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("tracking_number", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item copyTrackingNumberButton = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("copy_tracking_number_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item mapLoaded = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("map_loaded", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item emailLinkBanner = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("email_link_banner", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item alertBanner = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("alert_banner", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item linkEmailButton = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("link_email_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item accountLinkSuccess = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("account_link_success", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item privacyLink = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("privacy_link", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item learnMoreLink = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("learn_more_link", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item contactUsLink = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.inappcheckout.Constants.CONTACT_US_LINK_ID, 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item unlinkEmailButton = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("unlink_email_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item unlinkEmailBottomSheetButton = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("unlink_email_bottom_sheet_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item unlinkEmailSuccess = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("unlink_email_success", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item unlinkEmailError = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("unlink_email_error", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item unlinkAllAccountsBottomSheetButton = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("unlink_all_accounts_bottom_sheet_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item unlinkAllAccountsSuccess = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("unlink_all_accounts_success", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item deleteDataSuccess = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("delete_data_success", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item deleteDataBottomSheetButton = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("delete_data_bottom_sheet_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item genericError = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Error.GENERIC_ERROR, 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item genericErrorRefreshButton = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("generic_error_refresh_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item inlineHelpIcon = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("inline_help_icon", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item errorBanner = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_ERROR_BANNER, 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item amazonPreferencesInlineHelpButton = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("amazon_preferences_inline_help_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item amazonPreferencesToggleButton = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("amazon_preferences_toggle_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item amazonPreferencesUpdateSuccess = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("amazon_preferences_update_success", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item relinkGmailSuccess = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("relink_gmail_success", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item linkEmail = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("link_email", 0, 2, null);

        private Items() {
        }

        static {
            int i = com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable;
            $stable = i | i | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getSettingsButton() {
            return settingsButton;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getManageOnAmazonButton() {
            return manageOnAmazonButton;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getViewShippingUpdatesButton() {
            return viewShippingUpdatesButton;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getViewShippingUpdatesChevron() {
            return viewShippingUpdatesChevron;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getTrackingNumber() {
            return trackingNumber;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getCopyTrackingNumberButton() {
            return copyTrackingNumberButton;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getMapLoaded() {
            return mapLoaded;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getEmailLinkBanner() {
            return emailLinkBanner;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getAlertBanner() {
            return alertBanner;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getLinkEmailButton() {
            return linkEmailButton;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getAccountLinkSuccess() {
            return accountLinkSuccess;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getPrivacyLink() {
            return privacyLink;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getLearnMoreLink() {
            return learnMoreLink;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getContactUsLink() {
            return contactUsLink;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getUnlinkEmailButton() {
            return unlinkEmailButton;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getUnlinkEmailBottomSheetButton() {
            return unlinkEmailBottomSheetButton;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getUnlinkEmailSuccess() {
            return unlinkEmailSuccess;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getUnlinkEmailError() {
            return unlinkEmailError;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getUnlinkAllAccountsBottomSheetButton() {
            return unlinkAllAccountsBottomSheetButton;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getUnlinkAllAccountsSuccess() {
            return unlinkAllAccountsSuccess;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getDeleteDataSuccess() {
            return deleteDataSuccess;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getDeleteDataBottomSheetButton() {
            return deleteDataBottomSheetButton;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getGenericError() {
            return genericError;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getGenericErrorRefreshButton() {
            return genericErrorRefreshButton;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getInlineHelpIcon() {
            return inlineHelpIcon;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getErrorBanner() {
            return errorBanner;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getAmazonPreferencesInlineHelpButton() {
            return amazonPreferencesInlineHelpButton;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getAmazonPreferencesToggleButton() {
            return amazonPreferencesToggleButton;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getAmazonPreferencesUpdateSuccess() {
            return amazonPreferencesUpdateSuccess;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getRelinkGmailSuccess() {
            return relinkGmailSuccess;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getLinkEmail() {
            return linkEmail;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/analytics/PTAnalytics$ActionNames;", "", "<init>", "()V", "", "VIEW_TRACKING_UPDATES", "Ljava/lang/String;", "MANAGE_LINKED_EMAILS", "LINK_EMAIL", "RELINK_EMAIL", "RELINK_GMAIL", "UNLINK_EMAIL", "DELETE_USER_DATA", "TRACK_AMAZON_PACKAGES"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ActionNames {
        public static final int $stable = 0;
        public static final java.lang.String DELETE_USER_DATA = "delete_user_data";
        public static final com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.ActionNames INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.ActionNames();
        public static final java.lang.String LINK_EMAIL = "link_email";
        public static final java.lang.String MANAGE_LINKED_EMAILS = "manage_linked_emails";
        public static final java.lang.String RELINK_EMAIL = "relink_email";
        public static final java.lang.String RELINK_GMAIL = "relink_gmail";
        public static final java.lang.String TRACK_AMAZON_PACKAGES = "track_amazon_packages";
        public static final java.lang.String UNLINK_EMAIL = "unlink_email";
        public static final java.lang.String VIEW_TRACKING_UPDATES = "view_tracking_updates";

        private ActionNames() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/analytics/PTAnalytics$FeatureNames;", "", "<init>", "()V", "", "RELINK_GMAIL", "Ljava/lang/String;", "DELETE_DATA", "UNLINK_EMAIL", "LINK_EMAIL"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class FeatureNames {
        public static final int $stable = 0;
        public static final java.lang.String DELETE_DATA = "delete_data";
        public static final com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.FeatureNames INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.FeatureNames();
        public static final java.lang.String LINK_EMAIL = "link_email";
        public static final java.lang.String RELINK_GMAIL = "relink_gmail";
        public static final java.lang.String UNLINK_EMAIL = "unlink_email";

        private FeatureNames() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/analytics/PTAnalytics$ErrorTypes;", "", "<init>", "()V", "", "CRITICAL", "Ljava/lang/String;", "WARNING", "INFORMATIONAL"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ErrorTypes {
        public static final int $stable = 0;
        public static final java.lang.String CRITICAL = "critical";
        public static final java.lang.String INFORMATIONAL = "informational";
        public static final com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.ErrorTypes INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.ErrorTypes();
        public static final java.lang.String WARNING = "warning";

        private ErrorTypes() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/analytics/PTAnalytics$ErrorCodes;", "", "<init>", "()V", "", "EMAIL_ALREADY_LINKED", "Ljava/lang/String;", "EMAIL_CANNOT_BE_LINKED", "GENERIC_LINK_ERROR", "EMAIL_UNLINK_ERROR", "GENERIC_UNLINK_ERROR", "UNLINKED_BY_SYSTEM", "AMAZON_PREFERENCES_UPDATE"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ErrorCodes {
        public static final int $stable = 0;
        public static final java.lang.String AMAZON_PREFERENCES_UPDATE = "amazon_preferences_update";
        public static final java.lang.String EMAIL_ALREADY_LINKED = "email_already_linked";
        public static final java.lang.String EMAIL_CANNOT_BE_LINKED = "email_cannot_be_linked";
        public static final java.lang.String EMAIL_UNLINK_ERROR = "email_unlink_error";
        public static final java.lang.String GENERIC_LINK_ERROR = "generic_link_error";
        public static final java.lang.String GENERIC_UNLINK_ERROR = "generic_unlink_error";
        public static final com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.ErrorCodes INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.ErrorCodes();
        public static final java.lang.String UNLINKED_BY_SYSTEM = "unlinked_by_system";

        private ErrorCodes() {
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000b\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/analytics/PTAnalytics$PackageDetailContexts;", "", "<init>", "()V", "", "errorCode", "errorType", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;", "errorContext", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext;", "uiContext", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext;", "getUiContext", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "userIntentContext", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "getUserIntentContext", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "", "Lcom/paypal/oslo/core/telemetry/analytics/context/AnalyticsContext;", "analyticsContexts", "Ljava/util/List;", "getAnalyticsContexts", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PackageDetailContexts {
        public static final int $stable;
        public static final com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.PackageDetailContexts INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.PackageDetailContexts();
        private static final java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> analyticsContexts;
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext uiContext;
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext;

        private PackageDetailContexts() {
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext getUiContext() {
            return uiContext;
        }

        static {
            com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext uIContext = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen("package_detail"), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("package_tracking", 0, null, null, 14, null), null, null, 12, null);
            uiContext = uIContext;
            com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext2 = new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.core.telemetry.analytics.schema.Product.PACKAGE_TRACKING, "package_detail", "view_tracking_updates");
            userIntentContext = userIntentContext2;
            analyticsContexts = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[]{uIContext, userIntentContext2});
            $stable = 8;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getUserIntentContext() {
            return userIntentContext;
        }

        public final java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> getAnalyticsContexts() {
            return analyticsContexts;
        }

        public static /* synthetic */ com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext$default(com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.PackageDetailContexts packageDetailContexts, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str2 = com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.ErrorTypes.CRITICAL;
            }
            return packageDetailContexts.errorContext(str, str2);
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext(java.lang.String errorCode, java.lang.String errorType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            return new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext(errorCode, "banner_alert", errorType, "app_ui");
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000b\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/analytics/PTAnalytics$PackageSettingsContexts;", "", "<init>", "()V", "", "errorCode", "errorType", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;", "errorContext", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext;", "uiContext", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext;", "getUiContext", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "userIntentContext", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "getUserIntentContext", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "", "Lcom/paypal/oslo/core/telemetry/analytics/context/AnalyticsContext;", "analyticsContexts", "Ljava/util/List;", "getAnalyticsContexts", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PackageSettingsContexts {
        public static final int $stable;
        public static final com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.PackageSettingsContexts INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.PackageSettingsContexts();
        private static final java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> analyticsContexts;
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext uiContext;
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext;

        private PackageSettingsContexts() {
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext getUiContext() {
            return uiContext;
        }

        static {
            com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext uIContext = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen("package_settings"), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("package_tracking", 0, null, null, 14, null), null, null, 12, null);
            uiContext = uIContext;
            com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext2 = new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.core.telemetry.analytics.schema.Product.PACKAGE_TRACKING, "package_settings", com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.ActionNames.MANAGE_LINKED_EMAILS);
            userIntentContext = userIntentContext2;
            analyticsContexts = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[]{uIContext, userIntentContext2});
            $stable = 8;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getUserIntentContext() {
            return userIntentContext;
        }

        public static /* synthetic */ com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext$default(com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.PackageSettingsContexts packageSettingsContexts, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str2 = com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.ErrorTypes.CRITICAL;
            }
            return packageSettingsContexts.errorContext(str, str2);
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext(java.lang.String errorCode, java.lang.String errorType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            return new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext(errorCode, "banner_alert", errorType, "app_ui");
        }

        public final java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> getAnalyticsContexts() {
            return analyticsContexts;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/analytics/PTAnalytics$AmazonUserPreferencesContexts;", "", "<init>", "()V", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "userIntentContext", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "getUserIntentContext", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AmazonUserPreferencesContexts {
        public static final com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.AmazonUserPreferencesContexts INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.AmazonUserPreferencesContexts();
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext = new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.core.telemetry.analytics.schema.Product.PACKAGE_TRACKING, "amazon_user_preferences", com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.ActionNames.TRACK_AMAZON_PACKAGES);
        public static final int $stable = com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable;

        private AmazonUserPreferencesContexts() {
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getUserIntentContext() {
            return userIntentContext;
        }
    }

    public static /* synthetic */ androidx.compose.ui.Modifier analytics$default(com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics pTAnalytics, androidx.compose.ui.Modifier modifier, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item item, java.util.List list, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component component, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            item = null;
        }
        if ((i & 4) != 0) {
            component = null;
        }
        return pTAnalytics.analytics(modifier, item, list, component);
    }

    public final androidx.compose.ui.Modifier analytics(androidx.compose.ui.Modifier modifier, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item item, java.util.List<? extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> list, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component component) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        androidx.compose.ui.Modifier context = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(modifier, list);
        androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
        if (component != null) {
            companion = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.component(companion, component);
        }
        return context.then(companion).then(item != null ? com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.ui.Modifier.INSTANCE, item) : androidx.compose.ui.Modifier.INSTANCE);
    }
}
