package com.paypal.oslo.feature.debitcard.shared.analytics;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b8\n\u0002\u0018\u0002\n\u0002\b\u0014\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\u000f8\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013R\u001a\u0010\u001c\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u001d\u0010\u0013R\u001a\u0010\u001e\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0011\u001a\u0004\b\u001f\u0010\u0013R\u001a\u0010!\u001a\u00020 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u001a\u0010'\u001a\u00020 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$R\u001a\u0010)\u001a\u00020 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\"\u001a\u0004\b*\u0010$R\u001a\u0010+\u001a\u00020 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\"\u001a\u0004\b,\u0010$R\u001a\u0010-\u001a\u00020 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\"\u001a\u0004\b.\u0010$R\u001a\u0010/\u001a\u00020 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\"\u001a\u0004\b0\u0010$R\u001a\u00101\u001a\u00020 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\"\u001a\u0004\b2\u0010$R\u001a\u00103\u001a\u00020 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010\"\u001a\u0004\b4\u0010$R\u001a\u00105\u001a\u00020 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010\"\u001a\u0004\b6\u0010$R\u001a\u00107\u001a\u00020 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010\"\u001a\u0004\b8\u0010$R\u001a\u00109\u001a\u00020 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010\"\u001a\u0004\b:\u0010$R\u001a\u0010;\u001a\u00020 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010\"\u001a\u0004\b<\u0010$R\u001a\u0010=\u001a\u00020 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010\"\u001a\u0004\b>\u0010$R\u001a\u0010?\u001a\u00020 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010\"\u001a\u0004\b@\u0010$R\u001a\u0010A\u001a\u00020 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010\"\u001a\u0004\bB\u0010$R\u001a\u0010C\u001a\u00020 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010\"\u001a\u0004\bD\u0010$R\u001a\u0010E\u001a\u00020 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010\"\u001a\u0004\bF\u0010$R\u001a\u0010G\u001a\u00020 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010\"\u001a\u0004\bH\u0010$R\u001a\u0010I\u001a\u00020 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bI\u0010\"\u001a\u0004\bJ\u0010$R\u001a\u0010K\u001a\u00020 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bK\u0010\"\u001a\u0004\bL\u0010$R\u001a\u0010M\u001a\u00020 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bM\u0010\"\u001a\u0004\bN\u0010$R\u001a\u0010O\u001a\u00020 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bO\u0010\"\u001a\u0004\bP\u0010$R\u001a\u0010Q\u001a\u00020 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bQ\u0010\"\u001a\u0004\bR\u0010$R\u001a\u0010S\u001a\u00020 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bS\u0010\"\u001a\u0004\bT\u0010$R\u001a\u0010U\u001a\u00020 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bU\u0010\"\u001a\u0004\bV\u0010$R\u001a\u0010W\u001a\u00020 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bW\u0010\"\u001a\u0004\bX\u0010$R\u001a\u0010Z\u001a\u00020Y8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u001a\u0010^\u001a\u00020Y8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b^\u0010[\u001a\u0004\b_\u0010]R\u001a\u0010`\u001a\u00020Y8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b`\u0010[\u001a\u0004\ba\u0010]R\u001a\u0010b\u001a\u00020Y8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bb\u0010[\u001a\u0004\bc\u0010]R\u001a\u0010d\u001a\u00020Y8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bd\u0010[\u001a\u0004\be\u0010]R\u001a\u0010f\u001a\u00020Y8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bf\u0010[\u001a\u0004\bg\u0010]R\u001a\u0010h\u001a\u00020Y8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bh\u0010[\u001a\u0004\bi\u0010]R\u001a\u0010j\u001a\u00020Y8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bj\u0010[\u001a\u0004\bk\u0010]R\u001a\u0010l\u001a\u00020Y8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bl\u0010[\u001a\u0004\bm\u0010]"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/analytics/ManageCardAnalytics;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "getUserIntent", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;)Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "", "SCREEN_ID", "Ljava/lang/String;", "SCREEN_LOADING", "SCREEN_ERROR", "ACTION", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "CARDHOLDER_DROPDOWN", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "getCARDHOLDER_DROPDOWN", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "CARD_ART", "getCARD_ART", "CARD_OPERATIONS", "getCARD_OPERATIONS", "FUNDING_OPTIONS", "getFUNDING_OPTIONS", "DAILY_LIMITS", "getDAILY_LIMITS", "BILLING_ADDRESS", "getBILLING_ADDRESS", "BOTTOM_LINKS", "getBOTTOM_LINKS", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "CARD_STATUS_TILE", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "getCARD_STATUS_TILE", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "LOCK_UNLOCK_CARD", "getLOCK_UNLOCK_CARD", "PUSH_PROVISIONING", "getPUSH_PROVISIONING", "CHANGE_PIN", "getCHANGE_PIN", "VIEW_PIN", "getVIEW_PIN", "FIND_ATM", "getFIND_ATM", "CANCEL_CARD", "getCANCEL_CARD", "REPORT_LOST_STOLEN_CARD", "getREPORT_LOST_STOLEN_CARD", "REPORT_LOST_STOLEN_DAMAGED_CARD", "getREPORT_LOST_STOLEN_DAMAGED_CARD", "REQUEST_PHYSICAL_CARD", "getREQUEST_PHYSICAL_CARD", "REPLACE_DIGITAL_CARD", "getREPLACE_DIGITAL_CARD", "CARD_CONNECT", "getCARD_CONNECT", "ADD_SECONDARY_CARDHOLDER", "getADD_SECONDARY_CARDHOLDER", "MANAGE_SECONDARY_CARDHOLDER", "getMANAGE_SECONDARY_CARDHOLDER", "UNKNOWN_DEBIT_CARD_OPERATION", "getUNKNOWN_DEBIT_CARD_OPERATION", "DIGITAL_CARD_REPLACED_SUCCESS_TOAST", "getDIGITAL_CARD_REPLACED_SUCCESS_TOAST", "CHANGE_PIN_SUCCESS_TOAST", "getCHANGE_PIN_SUCCESS_TOAST", "CREATE_PIN_SUCCESS_TOAST", "getCREATE_PIN_SUCCESS_TOAST", "ACTIVATE_CARD_SUCCESS_TOAST", "getACTIVATE_CARD_SUCCESS_TOAST", "CARD_ALREADY_LOCKED_TOAST", "getCARD_ALREADY_LOCKED_TOAST", "CARD_ALREADY_UNLOCKED_TOAST", "getCARD_ALREADY_UNLOCKED_TOAST", "CARD_LOCKED_SUCCESS_TOAST", "getCARD_LOCKED_SUCCESS_TOAST", "CARD_UNLOCKED_SUCCESS_TOAST", "getCARD_UNLOCKED_SUCCESS_TOAST", "BILLING_ADDRESS_UPDATED_SUCCESS_TOAST", "getBILLING_ADDRESS_UPDATED_SUCCESS_TOAST", "UNKNOWN_TOAST", "getUNKNOWN_TOAST", "DAILY_LIMITS_WIDGET", "getDAILY_LIMITS_WIDGET", "DAILY_LIMITS_INFO_BOTTOM_SHEET", "getDAILY_LIMITS_INFO_BOTTOM_SHEET", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "INFO_CARD_BUTTON", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getINFO_CARD_BUTTON", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "LOCK_UNLOCK_TOGGLE", "getLOCK_UNLOCK_TOGGLE", "ADD_TO_WALLET_BUTTON", "getADD_TO_WALLET_BUTTON", "EDIT_BILLING_ADDRESS_BUTTON", "getEDIT_BILLING_ADDRESS_BUTTON", "HELP_CENTER_LINK", "getHELP_CENTER_LINK", "LEARN_MORE_LINK", "getLEARN_MORE_LINK", "PURCHASE_INFO_ICON", "getPURCHASE_INFO_ICON", "OTHER_CASH_WITHDRAWALS_INFO_ICON", "getOTHER_CASH_WITHDRAWALS_INFO_ICON", "ATM_WITHDRAWALS_INFO_ICON", "getATM_WITHDRAWALS_INFO_ICON"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ManageCardAnalytics {
    public static final int $stable;
    public static final java.lang.String ACTION = "manage";
    public static final java.lang.String SCREEN_ERROR = "debit_card_management_error";
    public static final java.lang.String SCREEN_ID = "debit_card_management";
    public static final java.lang.String SCREEN_LOADING = "debit_card_management_loading";
    public static final com.paypal.oslo.feature.debitcard.shared.analytics.ManageCardAnalytics INSTANCE = new com.paypal.oslo.feature.debitcard.shared.analytics.ManageCardAnalytics();
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module CARDHOLDER_DROPDOWN = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("cardholder_dropdown", 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module CARD_ART = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("card_art", 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module CARD_OPERATIONS = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("card_operations", 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module FUNDING_OPTIONS = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("funding_options", 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module DAILY_LIMITS = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("daily_limits", 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module BILLING_ADDRESS = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("billing_address", 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module BOTTOM_LINKS = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("bottom_links", 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component CARD_STATUS_TILE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("card_status_tile", 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component LOCK_UNLOCK_CARD = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("lock_unlock_card", 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component PUSH_PROVISIONING = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component(com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardAnalyticsConstants.PUSH_PROVISIONING_FEATURE, 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component CHANGE_PIN = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("change_pin", 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component VIEW_PIN = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("view_pin", 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component FIND_ATM = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("find_atm", 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component CANCEL_CARD = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component(com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardAnalyticsConstants.CANCEL_CARD_FEATURE, 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component REPORT_LOST_STOLEN_CARD = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("report_lost_stolen_card", 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component REPORT_LOST_STOLEN_DAMAGED_CARD = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("report_lost_stolen_damaged_card", 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component REQUEST_PHYSICAL_CARD = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component(com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardAnalyticsConstants.REQUEST_PHYSICAL_CARD_FEATURE, 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component REPLACE_DIGITAL_CARD = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component(com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardAnalyticsConstants.REPLACE_DIGITAL_CARD_FEATURE, 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component CARD_CONNECT = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component(com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardAnalyticsConstants.CARD_CONNECT_FEATURE, 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component ADD_SECONDARY_CARDHOLDER = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("add_secondary_cardholder", 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component MANAGE_SECONDARY_CARDHOLDER = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("manage_secondary_cardholder", 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component UNKNOWN_DEBIT_CARD_OPERATION = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("unknown_debit_card_operation", 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component DIGITAL_CARD_REPLACED_SUCCESS_TOAST = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("digital_card_replaced_success_toast", 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component CHANGE_PIN_SUCCESS_TOAST = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("change_pin_success_toast", 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component CREATE_PIN_SUCCESS_TOAST = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("create_pin_success_toast", 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component ACTIVATE_CARD_SUCCESS_TOAST = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("activate_card_success_toast", 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component CARD_ALREADY_LOCKED_TOAST = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("card_already_locked_toast", 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component CARD_ALREADY_UNLOCKED_TOAST = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("card_already_unlocked_toast", 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component CARD_LOCKED_SUCCESS_TOAST = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("card_locked_success_toast", 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component CARD_UNLOCKED_SUCCESS_TOAST = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("card_unlocked_success_toast", 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component BILLING_ADDRESS_UPDATED_SUCCESS_TOAST = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("billing_address_updated_success_toast", 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component UNKNOWN_TOAST = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("unknown_toast", 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component DAILY_LIMITS_WIDGET = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("daily_limits_widget", 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component DAILY_LIMITS_INFO_BOTTOM_SHEET = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("daily_limits_info_bottom_sheet", 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item INFO_CARD_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("info_card_button", 0, 2, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item LOCK_UNLOCK_TOGGLE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("lock_unlock_toggle", 0, 2, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item ADD_TO_WALLET_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("add_to_wallet_button", 0, 2, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item EDIT_BILLING_ADDRESS_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("edit_billing_address_button", 0, 2, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item HELP_CENTER_LINK = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("help_center_link", 0, 2, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item LEARN_MORE_LINK = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("learn_more_link", 0, 2, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item PURCHASE_INFO_ICON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("purchase_info_icon", 0, 2, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item OTHER_CASH_WITHDRAWALS_INFO_ICON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("other_cash_withdrawals_info_icon", 0, 2, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item ATM_WITHDRAWALS_INFO_ICON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("atm_withdrawals_info_icon", 0, 2, null);

    private ManageCardAnalytics() {
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getUserIntent(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
        return new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardAnalyticsConstants.INSTANCE.getProductName(productName), com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardAnalyticsConstants.MANAGE_CARD_FEATURE, "manage");
    }

    static {
        int i = com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable;
        $stable = i | i | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getCARDHOLDER_DROPDOWN() {
        return CARDHOLDER_DROPDOWN;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getCARD_ART() {
        return CARD_ART;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getCARD_OPERATIONS() {
        return CARD_OPERATIONS;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getFUNDING_OPTIONS() {
        return FUNDING_OPTIONS;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getDAILY_LIMITS() {
        return DAILY_LIMITS;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getBILLING_ADDRESS() {
        return BILLING_ADDRESS;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getBOTTOM_LINKS() {
        return BOTTOM_LINKS;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getCARD_STATUS_TILE() {
        return CARD_STATUS_TILE;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getLOCK_UNLOCK_CARD() {
        return LOCK_UNLOCK_CARD;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getPUSH_PROVISIONING() {
        return PUSH_PROVISIONING;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getCHANGE_PIN() {
        return CHANGE_PIN;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getVIEW_PIN() {
        return VIEW_PIN;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getFIND_ATM() {
        return FIND_ATM;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getCANCEL_CARD() {
        return CANCEL_CARD;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getREPORT_LOST_STOLEN_CARD() {
        return REPORT_LOST_STOLEN_CARD;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getREPORT_LOST_STOLEN_DAMAGED_CARD() {
        return REPORT_LOST_STOLEN_DAMAGED_CARD;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getREQUEST_PHYSICAL_CARD() {
        return REQUEST_PHYSICAL_CARD;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getREPLACE_DIGITAL_CARD() {
        return REPLACE_DIGITAL_CARD;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getCARD_CONNECT() {
        return CARD_CONNECT;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getADD_SECONDARY_CARDHOLDER() {
        return ADD_SECONDARY_CARDHOLDER;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getMANAGE_SECONDARY_CARDHOLDER() {
        return MANAGE_SECONDARY_CARDHOLDER;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getUNKNOWN_DEBIT_CARD_OPERATION() {
        return UNKNOWN_DEBIT_CARD_OPERATION;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getDIGITAL_CARD_REPLACED_SUCCESS_TOAST() {
        return DIGITAL_CARD_REPLACED_SUCCESS_TOAST;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getCHANGE_PIN_SUCCESS_TOAST() {
        return CHANGE_PIN_SUCCESS_TOAST;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getCREATE_PIN_SUCCESS_TOAST() {
        return CREATE_PIN_SUCCESS_TOAST;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getACTIVATE_CARD_SUCCESS_TOAST() {
        return ACTIVATE_CARD_SUCCESS_TOAST;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getCARD_ALREADY_LOCKED_TOAST() {
        return CARD_ALREADY_LOCKED_TOAST;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getCARD_ALREADY_UNLOCKED_TOAST() {
        return CARD_ALREADY_UNLOCKED_TOAST;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getCARD_LOCKED_SUCCESS_TOAST() {
        return CARD_LOCKED_SUCCESS_TOAST;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getCARD_UNLOCKED_SUCCESS_TOAST() {
        return CARD_UNLOCKED_SUCCESS_TOAST;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getBILLING_ADDRESS_UPDATED_SUCCESS_TOAST() {
        return BILLING_ADDRESS_UPDATED_SUCCESS_TOAST;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getUNKNOWN_TOAST() {
        return UNKNOWN_TOAST;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getDAILY_LIMITS_WIDGET() {
        return DAILY_LIMITS_WIDGET;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getDAILY_LIMITS_INFO_BOTTOM_SHEET() {
        return DAILY_LIMITS_INFO_BOTTOM_SHEET;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getINFO_CARD_BUTTON() {
        return INFO_CARD_BUTTON;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getLOCK_UNLOCK_TOGGLE() {
        return LOCK_UNLOCK_TOGGLE;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getADD_TO_WALLET_BUTTON() {
        return ADD_TO_WALLET_BUTTON;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getEDIT_BILLING_ADDRESS_BUTTON() {
        return EDIT_BILLING_ADDRESS_BUTTON;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getHELP_CENTER_LINK() {
        return HELP_CENTER_LINK;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getLEARN_MORE_LINK() {
        return LEARN_MORE_LINK;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getPURCHASE_INFO_ICON() {
        return PURCHASE_INFO_ICON;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getOTHER_CASH_WITHDRAWALS_INFO_ICON() {
        return OTHER_CASH_WITHDRAWALS_INFO_ICON;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getATM_WITHDRAWALS_INFO_ICON() {
        return ATM_WITHDRAWALS_INFO_ICON;
    }
}
