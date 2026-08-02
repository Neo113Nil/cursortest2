package com.paypal.oslo.feature.publicprofile.analytics;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0011\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001a\u0010\u001a\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u001a\u0010\u001c\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017R\u001a\u0010!\u001a\u00020 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u001a\u0010'\u001a\u00020 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$R\u001a\u0010)\u001a\u00020 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\"\u001a\u0004\b*\u0010$R\u001a\u0010+\u001a\u00020 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\"\u001a\u0004\b,\u0010$R\u0014\u0010-\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b-\u0010\u0006R\u0014\u0010.\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b.\u0010\u0006R\u0014\u0010/\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b/\u0010\u0006R\u0014\u00100\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b0\u0010\u0006R\u0014\u00101\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b1\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/analytics/PublicProfileAnalyticsConstants;", "", "<init>", "()V", "", "PRODUCT", "Ljava/lang/String;", "FEATURE", "SCREEN", "ACTION_VIEW", "ACTION_TAP", "ACTION_REFRESH", "ACTION_ADD_FAVORITE", "ACTION_REMOVE_FAVORITE", "ACTION_REMOVE_CONTACT", "ACTION_REPORT_USER", "ACTION_BLOCK_CONTACT", "ACTION_UNBLOCK_CONTACT", "ACTION_DISMISS", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "ITEM_MORE_OPTIONS", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getITEM_MORE_OPTIONS", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "ITEM_FAVORITE", "getITEM_FAVORITE", "ITEM_CONFIRM", "getITEM_CONFIRM", "ITEM_CANCEL", "getITEM_CANCEL", "ITEM_REFRESH", "getITEM_REFRESH", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "MODULE_MORE_OPTIONS_SHEET", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "getMODULE_MORE_OPTIONS_SHEET", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "MODULE_REMOVE_SHEET", "getMODULE_REMOVE_SHEET", "MODULE_REPORT_SHEET", "getMODULE_REPORT_SHEET", "MODULE_BLOCK_SHEET", "getMODULE_BLOCK_SHEET", "MODULE_UNBLOCK_SHEET", "getMODULE_UNBLOCK_SHEET", "ERROR_CODE_UNKNOWN", "ERROR_CODE_NETWORK", "ERROR_CODE_UNKNOWN_ERROR", "ERROR_TYPE_UNKNOWN", "ERROR_SOURCE_API"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PublicProfileAnalyticsConstants {
    public static final int $stable;
    public static final java.lang.String ACTION_ADD_FAVORITE = "add_favorite";
    public static final java.lang.String ACTION_BLOCK_CONTACT = "block_contact";
    public static final java.lang.String ACTION_DISMISS = "dismiss";
    public static final java.lang.String ACTION_REMOVE_CONTACT = "remove_contact";
    public static final java.lang.String ACTION_REMOVE_FAVORITE = "remove_favorite";
    public static final java.lang.String ACTION_REPORT_USER = "report_user";
    public static final java.lang.String ACTION_TAP = "tap";
    public static final java.lang.String ACTION_UNBLOCK_CONTACT = "unblock_contact";
    public static final java.lang.String ACTION_VIEW = "view";
    public static final java.lang.String ERROR_CODE_NETWORK = "network_error";
    public static final java.lang.String ERROR_CODE_UNKNOWN = "unknown";
    public static final java.lang.String ERROR_CODE_UNKNOWN_ERROR = "unknown_error";
    public static final java.lang.String ERROR_SOURCE_API = "api_call";
    public static final java.lang.String ERROR_TYPE_UNKNOWN = "unknown";
    public static final java.lang.String FEATURE = "public_profile";
    public static final java.lang.String PRODUCT = "public_profile";
    public static final java.lang.String SCREEN = "public_profile";
    public static final com.paypal.oslo.feature.publicprofile.analytics.PublicProfileAnalyticsConstants INSTANCE = new com.paypal.oslo.feature.publicprofile.analytics.PublicProfileAnalyticsConstants();
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item ITEM_MORE_OPTIONS = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("more_options", 0, 2, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item ITEM_FAVORITE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("favorite", 0, 2, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item ITEM_CONFIRM = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("confirm", 0, 2, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item ITEM_CANCEL = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, 0, 2, null);
    public static final java.lang.String ACTION_REFRESH = "refresh";
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item ITEM_REFRESH = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(ACTION_REFRESH, 0, 2, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module MODULE_MORE_OPTIONS_SHEET = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("more_options_sheet", 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module MODULE_REMOVE_SHEET = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("remove_sheet", 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module MODULE_REPORT_SHEET = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("report_sheet", 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module MODULE_BLOCK_SHEET = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("block_sheet", 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module MODULE_UNBLOCK_SHEET = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("unblock_sheet", 0, null, null, 14, null);

    private PublicProfileAnalyticsConstants() {
    }

    static {
        int i = com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable;
        $stable = i | i | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getITEM_MORE_OPTIONS() {
        return ITEM_MORE_OPTIONS;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getITEM_FAVORITE() {
        return ITEM_FAVORITE;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getITEM_CONFIRM() {
        return ITEM_CONFIRM;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getITEM_CANCEL() {
        return ITEM_CANCEL;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getITEM_REFRESH() {
        return ITEM_REFRESH;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getMODULE_MORE_OPTIONS_SHEET() {
        return MODULE_MORE_OPTIONS_SHEET;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getMODULE_REMOVE_SHEET() {
        return MODULE_REMOVE_SHEET;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getMODULE_REPORT_SHEET() {
        return MODULE_REPORT_SHEET;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getMODULE_BLOCK_SHEET() {
        return MODULE_BLOCK_SHEET;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getMODULE_UNBLOCK_SHEET() {
        return MODULE_UNBLOCK_SHEET;
    }
}
