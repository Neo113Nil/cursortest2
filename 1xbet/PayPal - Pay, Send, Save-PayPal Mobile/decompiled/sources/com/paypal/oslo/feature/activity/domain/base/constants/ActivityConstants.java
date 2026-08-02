package com.paypal.oslo.feature.activity.domain.base.constants;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001:\u0010\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/base/constants/ActivityConstants;", "", "<init>", "()V", "RemoteConfig", "ActivityTypeConstants", "UIConstants", "NetworkConstants", "DateTimeFormatConstants", "LogConstants", "UserProfileConstants", "ActivityLedgerFilters", "ActivitySearchConstants", "ActivityActionsConstant", "ActivitySourceConstants", "ActivityAvatarIconConstants", "ActivityInvoiceConstants", "ActivityWebViewConstants", "ActivityPaypalDeepLinks", "ActivityDeeplinkQueryParametersConstants"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityConstants {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants INSTANCE = new com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants();

    private ActivityConstants() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/base/constants/ActivityConstants$RemoteConfig;", "", "<init>", "()V", "", "DOMAIN", "Ljava/lang/String;", "APP_CONFIG", "DETAILS_API_CALL_ENABLED_KEY", "LEDGER_MOCK_API_CALL_ENABLED_KEY", "LEDGER_ACTIONS_ENABLED_KEY", "LEDGER_SUPPORTED_ACTIONS_KEY", "DETAIL_SUPPORTED_ACTIONS_KEY", "HELP_CENTER_SUPPORTED_ACTIONS_KEY", "ACTIVITY_DETAILS_REWARDS_ENABLED_KEY", "ACTIVITY_DETAILS_GET_CONTACT_ENABLED_KEY", "ACTIVITY_LEDGER_ACTION_CARD_ENABLED_KEY"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class RemoteConfig {
        public static final int $stable = 0;
        public static final java.lang.String ACTIVITY_DETAILS_GET_CONTACT_ENABLED_KEY = "details_get_contact_enabled";
        public static final java.lang.String ACTIVITY_DETAILS_REWARDS_ENABLED_KEY = "details_pp_rewards_enabled";
        public static final java.lang.String ACTIVITY_LEDGER_ACTION_CARD_ENABLED_KEY = "ledger_action_card_enabled";
        public static final java.lang.String APP_CONFIG = "app_config";
        public static final java.lang.String DETAILS_API_CALL_ENABLED_KEY = "mock_details_api_enabled";
        public static final java.lang.String DETAIL_SUPPORTED_ACTIONS_KEY = "details_supported_actions";
        public static final java.lang.String DOMAIN = "activity";
        public static final java.lang.String HELP_CENTER_SUPPORTED_ACTIONS_KEY = "help_center_supported_actions";
        public static final com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.RemoteConfig INSTANCE = new com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.RemoteConfig();
        public static final java.lang.String LEDGER_ACTIONS_ENABLED_KEY = "action_webview_enabled";
        public static final java.lang.String LEDGER_MOCK_API_CALL_ENABLED_KEY = "mock_ledger_api_enabled";
        public static final java.lang.String LEDGER_SUPPORTED_ACTIONS_KEY = "ledger_supported_actions";

        private RemoteConfig() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/base/constants/ActivityConstants$ActivityTypeConstants;", "", "<init>", "()V", "", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.PAYMENT, "Ljava/lang/String;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.MONEY_REQUEST, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.ORDER, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.CRYPTO_PAYMENT, "ORDER_PREFIX_PAYMENT"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ActivityTypeConstants {
        public static final int $stable = 0;
        public static final java.lang.String CRYPTO_PAYMENT = "CRYPTO_PAYMENT";
        public static final com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants INSTANCE = new com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants();
        public static final java.lang.String MONEY_REQUEST = "MONEY_REQUEST";
        public static final java.lang.String ORDER = "ORDER";
        public static final java.lang.String ORDER_PREFIX_PAYMENT = "O";
        public static final java.lang.String PAYMENT = "PAYMENT";

        private ActivityTypeConstants() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b7\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u0014\u0010\u0013\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\fR\u0014\u0010\u0018\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\fR\u0014\u0010\u0019\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0006R\u0014\u0010\u001a\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0006R\u0014\u0010\u001c\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0006R\u0014\u0010\u001e\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\fR\u0014\u0010\u001f\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\fR\u0014\u0010 \u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0006R\u0014\u0010!\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0006R\u0014\u0010\"\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0006R\u0014\u0010#\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0006R\u0014\u0010$\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u0006R\u0014\u0010%\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u0006R\u0014\u0010&\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u0006R\u0014\u0010'\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u0006R\u0014\u0010(\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u0006R\u0014\u0010)\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\u0006R\u0014\u0010*\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\u0006R\u0014\u0010+\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010\u0006R\u0014\u0010,\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010\u0006R\u0014\u0010-\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010\u0006R\u0014\u0010.\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010\u0006R\u0014\u0010/\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b/\u0010\u0006R\u0014\u00100\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u0010\u0006R\u0014\u00101\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b1\u0010\u0006R\u0014\u00102\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u0010\u0006R\u0014\u00103\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b3\u0010\u0014R\u0014\u00104\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b4\u0010\u0006R\u0014\u00105\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b5\u0010\u0006R\u0014\u00106\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b6\u0010\u0006R\u0014\u00107\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b7\u0010\u0014R\u0014\u00108\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b8\u0010\u0014R\u0014\u00109\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b9\u0010\fR\u0014\u0010:\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b:\u0010\u0006R\u0014\u0010;\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b;\u0010\u0006R\u0014\u0010<\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b<\u0010\u0006R\u0014\u0010=\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b=\u0010\u0006R\u0014\u0010>\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b>\u0010\u0006R\u0014\u0010?\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b?\u0010\u0006R\u0014\u0010@\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b@\u0010\u0006R\u0014\u0010A\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bA\u0010\u0006R\u0014\u0010B\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bB\u0010\u0006R\u0014\u0010C\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bC\u0010\u0006R\u0014\u0010D\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bD\u0010\u0006R\u0014\u0010E\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bE\u0010\u0006R\u0014\u0010F\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bF\u0010\u0006R\u0014\u0010G\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\bG\u0010\fR\u0014\u0010H\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\bH\u0010\fR\u0014\u0010I\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bI\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/base/constants/ActivityConstants$UIConstants;", "", "<init>", "()V", "", "KEY_PAGINATION_TRIGGER", "Ljava/lang/String;", "UPCOMING", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, "COMPLETE", "", "VALUE_1F", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "FRACTION_7F", "FRACTION_3F", "FRACTION_75F", "FRACTION_4F", "FRACTION_6F", "", "KEY_IMAGE_SIZE_91_DP", com.visa.cbp.getEncExpo.warmup, "KEY_SHIMMER_ITEM_REPEAT_COUNT", "KEY_SHIMMER_TITLE_DIVIDE_WIDTH_DP", "KEY_SHIMMER_TITLE_WIDTH_DP", "KEY_SHIMMER_TITLE_HEIGHT_DP", "EMPTY_STATE_MESSAGE", "GENERIC_ERROR_TITLE", "GENERIC_ERROR_DESCRIPTION", "RETRY_BUTTON_TEXT", "NO_INTERNET_CONNECTION", "THUMBNAIL_IMAGE_WIDTH_DP", "THUMBNAIL_IMAGE_HEIGHT_DP", "FILTER_SECTION_TITLE", "PURCHASES", "PACKAGES", "SENT_AND_RECEIVED", "BY_DATE", "THIS_MONTH", "PAST_MONTH", "PAST_THREE_MONTHS", "DEFAULT", "EMPTY_STRING", "MULTIPLIER_SIGN", "KEY_POSITIVE_SIGN", "KEY_NEGATIVE_SIGN", "COMMA_SEPARATOR", "NEW_LINE", "SPACE_VALUE", "EQUALS_SIGN_WITH_SPACES", "STRING_VALUE_ONE", "STRING_VALUE_NINETY", "KEY_MIN_ITEMS_FOR_FILTER_EMPTY_STATE", "COMPLETED_STATUS", "DECLINED_STATUS", "PENDING_STATUS", "MAX_LINES_2", "MAX_LINES_1", "TRANSACTION_DESCRIPTION_WIDTH_FRACTION", "START_QUOTES", "END_QUOTES", "PACKAGE_TRACKING_SOURCE", "HELP_OPTION_CONTACT_SYNCHRONY", "HELP_OPTION_CONTACT_SELLER", "HELP_OPTION_REPORT_PROBLEM", "HELP_OPTION_SHOW_P2P_BLOCK", "HELP_OPTION_SHOW_P2P_REPORT", "HELP_OPTION_REQUEST_REFUND", "HELP_OPTION_CANCEL_PAYMENT", "HELP_OPTION_GET_ANSWERS", "VENMO_BADGE_IMAGE_URL", "ACTION_CARD_IMAGE_URL", "FRACTION_5F", "FRACTION_1_5F", "PP_WORLD_LOGO_URL"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class UIConstants {
        public static final int $stable = 0;
        public static final java.lang.String ACTION_CARD_IMAGE_URL = "https://www.paypalobjects.com/activity_mobile/images/PT_actioncard.png";
        public static final java.lang.String BY_DATE = "By date";
        public static final java.lang.String COMMA_SEPARATOR = ", ";
        public static final java.lang.String COMPLETE = "Completed";
        public static final java.lang.String COMPLETED_STATUS = "COMPLETED";
        public static final java.lang.String DECLINED_STATUS = "DECLINED";
        public static final java.lang.String DEFAULT = "Default";
        public static final java.lang.String EMPTY_STATE_MESSAGE = "Recent activities are not available.";
        public static final java.lang.String EMPTY_STRING = "";
        public static final java.lang.String END_QUOTES = "”";
        public static final java.lang.String EQUALS_SIGN_WITH_SPACES = " = ";
        public static final java.lang.String FILTER_SECTION_TITLE = "Filter";
        public static final float FRACTION_1_5F = 1.5f;
        public static final float FRACTION_3F = 0.3f;
        public static final float FRACTION_4F = 0.4f;
        public static final float FRACTION_5F = 0.5f;
        public static final float FRACTION_6F = 0.6f;
        public static final float FRACTION_75F = 0.75f;
        public static final float FRACTION_7F = 0.7f;
        public static final java.lang.String GENERIC_ERROR_DESCRIPTION = "We couldn't load your activity. Please try again later.";
        public static final java.lang.String GENERIC_ERROR_TITLE = "Something went wrong";
        public static final java.lang.String HELP_OPTION_CANCEL_PAYMENT = "CANCEL_PAYMENT";
        public static final java.lang.String HELP_OPTION_CONTACT_SELLER = "CONTACT_SELLER";
        public static final java.lang.String HELP_OPTION_CONTACT_SYNCHRONY = "CONTACT_SYNCHRONY";
        public static final java.lang.String HELP_OPTION_GET_ANSWERS = "GET_ANSWERS";
        public static final java.lang.String HELP_OPTION_REPORT_PROBLEM = "REPORT_PROBLEM";
        public static final java.lang.String HELP_OPTION_REQUEST_REFUND = "REQUEST_REFUND";
        public static final java.lang.String HELP_OPTION_SHOW_P2P_BLOCK = "SHOW_P2P_BLOCK";
        public static final java.lang.String HELP_OPTION_SHOW_P2P_REPORT = "SHOW_P2P_REPORT";
        public static final com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants INSTANCE = new com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants();
        public static final int KEY_IMAGE_SIZE_91_DP = 91;
        public static final int KEY_MIN_ITEMS_FOR_FILTER_EMPTY_STATE = 1;
        public static final java.lang.String KEY_NEGATIVE_SIGN = "-";
        public static final java.lang.String KEY_PAGINATION_TRIGGER = "sentinel_pagination_trigger";
        public static final java.lang.String KEY_POSITIVE_SIGN = "+";
        public static final int KEY_SHIMMER_ITEM_REPEAT_COUNT = 4;
        public static final int KEY_SHIMMER_TITLE_DIVIDE_WIDTH_DP = 2;
        public static final float KEY_SHIMMER_TITLE_HEIGHT_DP = 28.0f;
        public static final float KEY_SHIMMER_TITLE_WIDTH_DP = 160.0f;
        public static final int MAX_LINES_1 = 1;
        public static final int MAX_LINES_2 = 2;
        public static final java.lang.String MULTIPLIER_SIGN = "×";
        public static final java.lang.String NEW_LINE = "\n";
        public static final java.lang.String NO_INTERNET_CONNECTION = "No Internet Connection";
        public static final java.lang.String PACKAGES = "Packages";
        public static final java.lang.String PACKAGE_TRACKING_SOURCE = "activity_details";
        public static final java.lang.String PAST_MONTH = "Past month";
        public static final java.lang.String PAST_THREE_MONTHS = "Past 3 months";
        public static final java.lang.String PENDING = "Pending";
        public static final java.lang.String PENDING_STATUS = "PENDING";
        public static final java.lang.String PP_WORLD_LOGO_URL = "https://www.paypalobjects.com/activity_mobile/images/pp_world_logo.png";
        public static final java.lang.String PURCHASES = "Purchases";
        public static final java.lang.String RETRY_BUTTON_TEXT = "Try Again";
        public static final java.lang.String SENT_AND_RECEIVED = "Sent & Received";
        public static final java.lang.String SPACE_VALUE = " ";
        public static final java.lang.String START_QUOTES = "“";
        public static final java.lang.String STRING_VALUE_NINETY = "90";
        public static final java.lang.String STRING_VALUE_ONE = "1";
        public static final java.lang.String THIS_MONTH = "This month";
        public static final float THUMBNAIL_IMAGE_HEIGHT_DP = 40.0f;
        public static final float THUMBNAIL_IMAGE_WIDTH_DP = 101.0f;
        public static final float TRANSACTION_DESCRIPTION_WIDTH_FRACTION = 0.65f;
        public static final java.lang.String UPCOMING = "Upcoming";
        public static final float VALUE_1F = 1.0f;
        public static final java.lang.String VENMO_BADGE_IMAGE_URL = "https://www.paypalobjects.com/activity_mobile/images/venmo_badge_icon.png";

        private UIConstants() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/base/constants/ActivityConstants$NetworkConstants;", "", "<init>", "()V", "", "PAGE_SIZE", com.visa.cbp.getEncExpo.warmup, "KEY_PAST_3_YEAR", "KEY_PAST_6_MONTHS", "KEY_FIRST_DAY_OF_MONTH", "KEY_PAST_MONTH", "KEY_PAST_THREE_MONTHS", "PAST_90_DAYS", "", "KEY_EMPTY_VALUE", "Ljava/lang/String;", "WIDGET_PAGE_SIZE_BUFFER", "KEY_30_DAYS", "KEY_MINUTES_IN_AN_HOUR", "KEY_HOURS_IN_A_DAY", "KEY_ZERO_VALUE", "KEY_PAGINATION_PREFETCH_SIZE"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class NetworkConstants {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.NetworkConstants INSTANCE = new com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.NetworkConstants();
        public static final int KEY_30_DAYS = 30;
        public static final java.lang.String KEY_EMPTY_VALUE = "";
        public static final int KEY_FIRST_DAY_OF_MONTH = 1;
        public static final int KEY_HOURS_IN_A_DAY = 24;
        public static final int KEY_MINUTES_IN_AN_HOUR = 60;
        public static final int KEY_PAGINATION_PREFETCH_SIZE = 12;
        public static final int KEY_PAST_3_YEAR = -3;
        public static final int KEY_PAST_6_MONTHS = -6;
        public static final int KEY_PAST_MONTH = -1;
        public static final int KEY_PAST_THREE_MONTHS = -3;
        public static final int KEY_ZERO_VALUE = 0;
        public static final int PAGE_SIZE = 60;
        public static final int PAST_90_DAYS = -90;
        public static final int WIDGET_PAGE_SIZE_BUFFER = 10;

        private NetworkConstants() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/base/constants/ActivityConstants$DateTimeFormatConstants;", "", "<init>", "()V", "", "KEY_UTC_FORMAT", "Ljava/lang/String;", "KEY_DEEPLINK_DATE_FORMAT", "KEY_FILTER_LABEL_DATE_FORMAT", "KEY_SUB_HEADER_DATE_FORMAT", "KEY_SUB_HEADER_MONTH_DATE_FORMAT", "KEY_YEAR_FORMAT", "KEY_TRANSACTION_DATE_WITH_YEAR_FORMAT", "KEY_UTC_FORMAT_UTC_Z", "KEY_TIMEZONE_UTC", "KEY_DAY_MONTH_YEAR_DATE_FORMAT"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DateTimeFormatConstants {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants INSTANCE = new com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants();
        public static final java.lang.String KEY_DAY_MONTH_YEAR_DATE_FORMAT = "dd/MM/yyyy";
        public static final java.lang.String KEY_DEEPLINK_DATE_FORMAT = "yyyy-MM-dd";
        public static final java.lang.String KEY_FILTER_LABEL_DATE_FORMAT = "MMM d, yy";
        public static final java.lang.String KEY_SUB_HEADER_DATE_FORMAT = "MMMM, yyyy";
        public static final java.lang.String KEY_SUB_HEADER_MONTH_DATE_FORMAT = "MMMM";
        public static final java.lang.String KEY_TIMEZONE_UTC = "UTC";
        public static final java.lang.String KEY_TRANSACTION_DATE_WITH_YEAR_FORMAT = "MMM d, yyyy";
        public static final java.lang.String KEY_UTC_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSX";
        public static final java.lang.String KEY_UTC_FORMAT_UTC_Z = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
        public static final java.lang.String KEY_YEAR_FORMAT = "yyyy";

        private DateTimeFormatConstants() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b%\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0006R\u0014\u0010\u001a\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0006R\u0014\u0010\u001c\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0006R\u0014\u0010\u001e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0006R\u0014\u0010 \u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0006R\u0014\u0010!\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0006R\u0014\u0010\"\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0006R\u0014\u0010#\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0006R\u0014\u0010$\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u0006R\u0014\u0010%\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u0006R\u0014\u0010&\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u0006R\u0014\u0010'\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u0006R\u0014\u0010(\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u0006R\u0014\u0010)\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/base/constants/ActivityConstants$LogConstants;", "", "<init>", "()V", "", "OPERATION", "Ljava/lang/String;", "CLASS", "KEY_START_TIME", "KEY_END_TIME", "ERROR_TYPE", "ROOT_CAUSE", "ERROR_MESSAGE", "STACK_TRACE", "CURRENCY_CODE", "KEY_SOURCE", "KEY_TARGET_FORMAT", "KEY_UTC_FORMAT", "KEY_MAPPED_ERROR_TYPE", "KEY_MESSAGE_ERROR_DATE_TIME", "KEY_MESSAGE_EXCEPTION_FETCH_LEDGER_ITEMS", "KEY_MESSAGE_EXCEPTION_FETCH_WIDGET_ITEMS", "KEY_MESSAGE_EXCEPTION_FETCH_RECENT_ITEMS", "KEY_MESSAGE_EXCEPTION_FETCH_SEARCH_SUGGESTIONS", "KEY_MESSAGE_EXCEPTION_QUERY_RESULT_RECEIVED", "KEY_MESSAGE_EXCEPTION_MOCK_RESULT_RECEIVED", "KEY_MESSAGE_EXCEPTION_ACTIVITY_ERROR_OCCURRED", "KEY_MESSAGE_EXCEPTION_ACTIVITY_DETAIL_ERROR_OCCURRED", "KEY_MESSAGE_LEDGER_USER_PROFILE_NOT_AVAILABLE", "KEY_ERROR_DATE_PARSING", "START_TIME_BEFORE_END_TIME", "START_TIME_FUTURE_DATE", "END_TIME_FUTURE_DATE", "KEY_ERROR_DEEP_LINK_PARSING", "KEY_ACTIONS_EXECUTION", "KEY_UNKNOWN_ACTION_TYPE", "KEY_ACTIONS_DEEPLINK_EXECUTION", "KEY_ACTIONS_DEEPLINK_EXECUTION_MALFORMED_ERROR", "KEY_ACTIONS_DEEPLINK_EXECUTION_UNRECOGNIZED_ERROR", "KEY_PACKAGE_TRACKING_EXECUTION", "ACTION_TYPE", "KEY_MESSAGE_ACTIVITY_COMMON_WEBVIEW"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class LogConstants {
        public static final int $stable = 0;
        public static final java.lang.String ACTION_TYPE = "action_type";
        public static final java.lang.String CLASS = "class";
        public static final java.lang.String CURRENCY_CODE = "currency_code";
        public static final java.lang.String END_TIME_FUTURE_DATE = "End time should not be a future date";
        public static final java.lang.String ERROR_MESSAGE = "error_message";
        public static final java.lang.String ERROR_TYPE = "error_type";
        public static final com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants INSTANCE = new com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants();
        public static final java.lang.String KEY_ACTIONS_DEEPLINK_EXECUTION = "Activity deeplink action execution";
        public static final java.lang.String KEY_ACTIONS_DEEPLINK_EXECUTION_MALFORMED_ERROR = "Error InvokeDeepLink MalformedPath";
        public static final java.lang.String KEY_ACTIONS_DEEPLINK_EXECUTION_UNRECOGNIZED_ERROR = "Error InvokeDeepLink UnrecognizedPath";
        public static final java.lang.String KEY_ACTIONS_EXECUTION = "Activity action execution";
        public static final java.lang.String KEY_END_TIME = "endTime";
        public static final java.lang.String KEY_ERROR_DATE_PARSING = "Error Parsing custom date";
        public static final java.lang.String KEY_ERROR_DEEP_LINK_PARSING = "Error Parsing Deep Link Parameters";
        public static final java.lang.String KEY_MAPPED_ERROR_TYPE = "mapped_error_type";
        public static final java.lang.String KEY_MESSAGE_ACTIVITY_COMMON_WEBVIEW = "PayPal Activity WebView";
        public static final java.lang.String KEY_MESSAGE_ERROR_DATE_TIME = "Error parsing date-time";
        public static final java.lang.String KEY_MESSAGE_EXCEPTION_ACTIVITY_DETAIL_ERROR_OCCURRED = "activity_detail_error_occurred";
        public static final java.lang.String KEY_MESSAGE_EXCEPTION_ACTIVITY_ERROR_OCCURRED = "activity_ledger_error_occurred";
        public static final java.lang.String KEY_MESSAGE_EXCEPTION_FETCH_LEDGER_ITEMS = "Exception in fetchActivityLedgerItems";
        public static final java.lang.String KEY_MESSAGE_EXCEPTION_FETCH_RECENT_ITEMS = "Exception in fetchActivityRecentItems";
        public static final java.lang.String KEY_MESSAGE_EXCEPTION_FETCH_SEARCH_SUGGESTIONS = "Exception in fetchActivitySearchSuggestions";
        public static final java.lang.String KEY_MESSAGE_EXCEPTION_FETCH_WIDGET_ITEMS = "Exception in fetchActivityWidgetItems";
        public static final java.lang.String KEY_MESSAGE_EXCEPTION_MOCK_RESULT_RECEIVED = "Mock data being used";
        public static final java.lang.String KEY_MESSAGE_EXCEPTION_QUERY_RESULT_RECEIVED = "Query result received";
        public static final java.lang.String KEY_MESSAGE_LEDGER_USER_PROFILE_NOT_AVAILABLE = "User profile is not available";
        public static final java.lang.String KEY_PACKAGE_TRACKING_EXECUTION = "Package Tracking execution";
        public static final java.lang.String KEY_SOURCE = "source_string";
        public static final java.lang.String KEY_START_TIME = "startTime";
        public static final java.lang.String KEY_TARGET_FORMAT = "target_format";
        public static final java.lang.String KEY_UNKNOWN_ACTION_TYPE = "Unknown action type encountered";
        public static final java.lang.String KEY_UTC_FORMAT = "utc_format";
        public static final java.lang.String OPERATION = "operation";
        public static final java.lang.String ROOT_CAUSE = "root_cause";
        public static final java.lang.String STACK_TRACE = "stack_trace";
        public static final java.lang.String START_TIME_BEFORE_END_TIME = "Start time must be before end time";
        public static final java.lang.String START_TIME_FUTURE_DATE = "Start time should not be a future date";

        private LogConstants() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/base/constants/ActivityConstants$UserProfileConstants;", "", "<init>", "()V", "", "KEY_ACCOUNT_TYPE_BUSINESS", "Ljava/lang/String;", "KEY_ACCOUNT_TYPE_PREMIER", "KEY_ACCOUNT_TYPE_PERSONAL"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class UserProfileConstants {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UserProfileConstants INSTANCE = new com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UserProfileConstants();
        public static final java.lang.String KEY_ACCOUNT_TYPE_BUSINESS = "business";
        public static final java.lang.String KEY_ACCOUNT_TYPE_PERSONAL = "personal";
        public static final java.lang.String KEY_ACCOUNT_TYPE_PREMIER = "premier";

        private UserProfileConstants() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00128\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/base/constants/ActivityConstants$ActivityLedgerFilters;", "", "<init>", "()V", "", "KEY_PACKAGES", "Ljava/lang/String;", "KEY_PURCHASES", "KEY_SENT_AND_RECEIVED", "KEY_THIS_MONTH", "KEY_PAST_MONTH", "KEY_THREE_MONTHS", "KEY_CUSTOM_DATE_RANGE", "KEY_DEFAULT", "KEY_PERSONAL_PAYMENT", "KEY_P2P_XOOM", "KEY_PAYMENT_RECEIVED", "KEY_PAYMENT_SENT", "", "FILTERS_SENT_RECEIVED_LIST", "Ljava/util/List;", "getFILTERS_SENT_RECEIVED_LIST", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ActivityLedgerFilters {
        public static final java.lang.String KEY_CUSTOM_DATE_RANGE = "custom_date_range";
        public static final java.lang.String KEY_DEFAULT = "default";
        public static final java.lang.String KEY_PACKAGES = "packages";
        public static final java.lang.String KEY_PAST_MONTH = "past_month";
        public static final java.lang.String KEY_PAYMENT_RECEIVED = "CREDIT";
        public static final java.lang.String KEY_PAYMENT_SENT = "DEBIT";
        public static final java.lang.String KEY_PURCHASES = "purchases";
        public static final java.lang.String KEY_SENT_AND_RECEIVED = "sent_and_received";
        public static final java.lang.String KEY_THIS_MONTH = "this_month";
        public static final java.lang.String KEY_THREE_MONTHS = "three_month";
        public static final com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters INSTANCE = new com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters();
        public static final java.lang.String KEY_PERSONAL_PAYMENT = "PERSONAL_PAYMENT::XOOM";
        public static final java.lang.String KEY_P2P_XOOM = "P2P_XOOM";
        private static final java.util.List<java.lang.String> FILTERS_SENT_RECEIVED_LIST = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{KEY_PERSONAL_PAYMENT, KEY_P2P_XOOM});
        public static final int $stable = 8;

        private ActivityLedgerFilters() {
        }

        public final java.util.List<java.lang.String> getFILTERS_SENT_RECEIVED_LIST() {
            return FILTERS_SENT_RECEIVED_LIST;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/base/constants/ActivityConstants$ActivitySearchConstants;", "", "<init>", "()V", "", "MINIMUM_SEARCH_QUERY_LENGTH", com.visa.cbp.getEncExpo.warmup, "MINIMUM_SUGGESTION_QUERY_LENGTH", "SEARCH_LOADING_SHIMMER_COUNT", "SEARCH_SUGGESTION_LOADING_SHIMMER_COUNT", "", "SEARCH_SUGGESTION_DEBOUNCE_DELAY_MS", "J", "SEARCH_SUGGESTION_ITEM_LIMIT", "", "KEY_SEARCH_FILTER_TYPE_REFUNDS", "Ljava/lang/String;", "KEY_SEARCH_FILTER_TYPE_INVOICES"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ActivitySearchConstants {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivitySearchConstants INSTANCE = new com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivitySearchConstants();
        public static final java.lang.String KEY_SEARCH_FILTER_TYPE_INVOICES = "Invoice";
        public static final java.lang.String KEY_SEARCH_FILTER_TYPE_REFUNDS = "Refunded";
        public static final int MINIMUM_SEARCH_QUERY_LENGTH = 3;
        public static final int MINIMUM_SUGGESTION_QUERY_LENGTH = 2;
        public static final int SEARCH_LOADING_SHIMMER_COUNT = 2;
        public static final long SEARCH_SUGGESTION_DEBOUNCE_DELAY_MS = 300;
        public static final int SEARCH_SUGGESTION_ITEM_LIMIT = 3;
        public static final int SEARCH_SUGGESTION_LOADING_SHIMMER_COUNT = 3;

        private ActivitySearchConstants() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b?\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0006R\u0014\u0010\u001a\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0006R\u0014\u0010\u001c\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0006R\u0014\u0010\u001e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0006R\u0014\u0010 \u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0006R\u0014\u0010!\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0006R\u0014\u0010\"\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0006R\u0014\u0010#\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0006R\u0014\u0010$\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u0006R\u0014\u0010%\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u0006R\u0014\u0010&\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u0006R\u0014\u0010'\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u0006R\u0014\u0010(\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u0006R\u0014\u0010)\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\u0006R\u0014\u0010*\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\u0006R\u0014\u0010+\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010\u0006R\u0014\u0010,\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010\u0006R\u0014\u0010-\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010\u0006R\u0014\u0010.\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010\u0006R\u0014\u0010/\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b/\u0010\u0006R\u0014\u00100\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u0010\u0006R\u0014\u00101\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b1\u0010\u0006R\u0014\u00102\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u0010\u0006R\u0014\u00103\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b3\u0010\u0006R\u0014\u00104\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b4\u0010\u0006R\u0014\u00105\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b5\u0010\u0006R\u0014\u00106\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b6\u0010\u0006R\u0014\u00107\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b7\u0010\u0006R\u0014\u00108\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b8\u0010\u0006R\u0014\u00109\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b9\u0010\u0006R\u0014\u0010:\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b:\u0010\u0006R\u0014\u0010;\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b;\u0010\u0006R\u0014\u0010<\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b<\u0010\u0006R\u0014\u0010=\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b=\u0010\u0006R\u0014\u0010>\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b>\u0010\u0006R\u0014\u0010?\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b?\u0010\u0006R\u0014\u0010@\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b@\u0010\u0006R\u0014\u0010A\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bA\u0010\u0006R\u0014\u0010B\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bB\u0010\u0006R\u0014\u0010C\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bC\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/base/constants/ActivityConstants$ActivityActionsConstant;", "", "<init>", "()V", "", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.ADD_TRACKING, "Ljava/lang/String;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.REFUND, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.SHIP, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.VIEW_STORY, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.PAY, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.CANCEL, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.DECLINE, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.REPORT, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.SEND_AGAIN, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.SEND_MONEY, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.VIEW_POOL, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.VIEW_DISPUTE_STATUS, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.ACCEPT, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.DENY, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.AUTH_CAPTURE, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.AUTH_REAUTH, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.INVOICE_PAY, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.INVOICE_CANCEL, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.PAYMENT_ACCEPT, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.PAYMENT_CANCEL, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.PAYMENT_DENY, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.PRINT_RECEIPT, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.REFUND_ACCEPT, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.REFUND_DENY, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.SHIPPING_SHIP, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.SHIPPING_TRACK, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.CRYPTO_PAYMENT_ACCEPT, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.SAY_THANKS, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.SHARE_AGAIN, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.AUTH_VOID, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.CHANGE_PAYMENT_OPTION, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.CONFIRM_RECEIPT, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.EBAY_RECOUP, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.INVOICE_MARK_AS_PAID, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.INVOICE_REMIND, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.MARK_AS_SHIPPED, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.NRR_SELECT_MATCH, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.PAY_NOW, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.UOME_CANCEL, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.UOME_PAY, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.UOME_PAY_SUBMIT, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.UOME_REMIND, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.UOME_EDIT, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.VIEW_ERECEIPT, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.VIEW_INVOICE_RECEIPT, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.UNARCHIVE, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.DOWNLOAD_BOLETO, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.CANCEL_BOLETO, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.GET_YOUR_MONEY, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.INVOICE_RESEND, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.MARK_AS_COMPLETE, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.HIDE, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.PAYMENT_CANCEL_RTR, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.CONTACT_EBAY, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.REPEAT_TXN, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.CONFIRM_TAX_ID, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.ADD_TAX_ID, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.BILL_SPLIT, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.SHARE_LINK, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.TRACK_SHIPPING, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.SETUP, "CANCELED_STATUS"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ActivityActionsConstant {
        public static final int $stable = 0;
        public static final java.lang.String ACCEPT = "ACCEPT";
        public static final java.lang.String ADD_TAX_ID = "ADD_TAX_ID";
        public static final java.lang.String ADD_TRACKING = "ADD_TRACKING";
        public static final java.lang.String AUTH_CAPTURE = "AUTH_CAPTURE";
        public static final java.lang.String AUTH_REAUTH = "AUTH_REAUTH";
        public static final java.lang.String AUTH_VOID = "AUTH_VOID";
        public static final java.lang.String BILL_SPLIT = "BILL_SPLIT";
        public static final java.lang.String CANCEL = "CANCEL";
        public static final java.lang.String CANCELED_STATUS = "CANCELED";
        public static final java.lang.String CANCEL_BOLETO = "CANCEL_BOLETO";
        public static final java.lang.String CHANGE_PAYMENT_OPTION = "CHANGE_PAYMENT_OPTION";
        public static final java.lang.String CONFIRM_RECEIPT = "CONFIRM_RECEIPT";
        public static final java.lang.String CONFIRM_TAX_ID = "CONFIRM_TAX_ID";
        public static final java.lang.String CONTACT_EBAY = "CONTACT_EBAY";
        public static final java.lang.String CRYPTO_PAYMENT_ACCEPT = "CRYPTO_PAYMENT_ACCEPT";
        public static final java.lang.String DECLINE = "DECLINE";
        public static final java.lang.String DENY = "DENY";
        public static final java.lang.String DOWNLOAD_BOLETO = "DOWNLOAD_BOLETO";
        public static final java.lang.String EBAY_RECOUP = "EBAY_RECOUP";
        public static final java.lang.String GET_YOUR_MONEY = "GET_YOUR_MONEY";
        public static final java.lang.String HIDE = "HIDE";
        public static final com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant INSTANCE = new com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant();
        public static final java.lang.String INVOICE_CANCEL = "INVOICE_CANCEL";
        public static final java.lang.String INVOICE_MARK_AS_PAID = "INVOICE_MARK_AS_PAID";
        public static final java.lang.String INVOICE_PAY = "INVOICE_PAY";
        public static final java.lang.String INVOICE_REMIND = "INVOICE_REMIND";
        public static final java.lang.String INVOICE_RESEND = "INVOICE_RESEND";
        public static final java.lang.String MARK_AS_COMPLETE = "MARK_AS_COMPLETE";
        public static final java.lang.String MARK_AS_SHIPPED = "MARK_AS_SHIPPED";
        public static final java.lang.String NRR_SELECT_MATCH = "NRR_SELECT_MATCH";
        public static final java.lang.String PAY = "PAY";
        public static final java.lang.String PAYMENT_ACCEPT = "PAYMENT_ACCEPT";
        public static final java.lang.String PAYMENT_CANCEL = "PAYMENT_CANCEL";
        public static final java.lang.String PAYMENT_CANCEL_RTR = "PAYMENT_CANCEL_RTR";
        public static final java.lang.String PAYMENT_DENY = "PAYMENT_DENY";
        public static final java.lang.String PAY_NOW = "PAY_NOW";
        public static final java.lang.String PRINT_RECEIPT = "PRINT_RECEIPT";
        public static final java.lang.String REFUND = "REFUND";
        public static final java.lang.String REFUND_ACCEPT = "REFUND_ACCEPT";
        public static final java.lang.String REFUND_DENY = "REFUND_DENY";
        public static final java.lang.String REPEAT_TXN = "REPEAT_TXN";
        public static final java.lang.String REPORT = "REPORT";
        public static final java.lang.String SAY_THANKS = "SAY_THANKS";
        public static final java.lang.String SEND_AGAIN = "SEND_AGAIN";
        public static final java.lang.String SEND_MONEY = "SEND_MONEY";
        public static final java.lang.String SETUP = "SETUP";
        public static final java.lang.String SHARE_AGAIN = "SHARE_AGAIN";
        public static final java.lang.String SHARE_LINK = "SHARE_LINK";
        public static final java.lang.String SHIP = "SHIP";
        public static final java.lang.String SHIPPING_SHIP = "SHIPPING_SHIP";
        public static final java.lang.String SHIPPING_TRACK = "SHIPPING_TRACK";
        public static final java.lang.String TRACK_SHIPPING = "TRACK_SHIPPING";
        public static final java.lang.String UNARCHIVE = "UNARCHIVE";
        public static final java.lang.String UOME_CANCEL = "UOME_CANCEL";
        public static final java.lang.String UOME_EDIT = "UOME_EDIT";
        public static final java.lang.String UOME_PAY = "UOME_PAY";
        public static final java.lang.String UOME_PAY_SUBMIT = "UOME_PAY_SUBMIT";
        public static final java.lang.String UOME_REMIND = "UOME_REMIND";
        public static final java.lang.String VIEW_DISPUTE_STATUS = "VIEW_DISPUTE_STATUS";
        public static final java.lang.String VIEW_ERECEIPT = "VIEW_ERECEIPT";
        public static final java.lang.String VIEW_INVOICE_RECEIPT = "VIEW_INVOICE_RECEIPT";
        public static final java.lang.String VIEW_POOL = "VIEW_POOL";
        public static final java.lang.String VIEW_STORY = "VIEW_STORY";

        private ActivityActionsConstant() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/base/constants/ActivityConstants$ActivitySourceConstants;", "", "<init>", "()V", "", "KEY_INVOICE_SOURCE", "Ljava/lang/String;", "KEY_XOOM_SOURCE", "KEY_SOURCE_LEDGER", "KEY_SOURCE_DETAILS", "KEY_SOURCE_WIDGET", "KEY_SOURCE_WIDGET_FS", "KEY_SOURCE_SEARCH", "KEY_SOURCE_DEEP_LINK"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ActivitySourceConstants {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivitySourceConstants INSTANCE = new com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivitySourceConstants();
        public static final java.lang.String KEY_INVOICE_SOURCE = "ACTIVITY";
        public static final java.lang.String KEY_SOURCE_DEEP_LINK = "DEEP_LINK";
        public static final java.lang.String KEY_SOURCE_DETAILS = "ACTIVITY_DETAILS";
        public static final java.lang.String KEY_SOURCE_LEDGER = "ACTIVITY_LEDGER";
        public static final java.lang.String KEY_SOURCE_SEARCH = "ACTIVITY_SEARCH";
        public static final java.lang.String KEY_SOURCE_WIDGET = "ACTIVITY_WIDGET";
        public static final java.lang.String KEY_SOURCE_WIDGET_FS = "ACTIVITY_WIDGET_FS";
        public static final java.lang.String KEY_XOOM_SOURCE = "pyp-xbappflow-activitylist";

        private ActivitySourceConstants() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/base/constants/ActivityConstants$ActivityAvatarIconConstants;", "", "<init>", "()V", "", "KEY_GENERIC_MERCHANT_AVATAR_ICON", "Ljava/lang/String;", "KEY_GENERIC_BANK_AVATAR_ICON", "KEY_GENERIC_DONATE_AVATAR_ICON", "KEY_GENERIC_PROFILE", "KEY_GENERIC_LOGO_PAYPAL_VALUE", "KEY_GENERIC_CREDIT_CARD", "KEY_GENERIC_MC_CREDIT_CARD", "KEY_GENERIC_TOP_UP_VALUE", "KEY_GENERIC_MONEY_POOLS_VALUE", "KEY_GENERIC_ACORNS_VALUE", "KEY_GENERIC_CASH_CHECK_VALUE", "KEY_GENERIC_TRANSFERS_VALUE", "KEY_GENERIC_DIRECT_DEPOSIT_VALUE", "KEY_GENERIC_REQUEST_MONEY_VALUE", "KEY_GENERIC_GOALS_VALUE", "KEY_GENERIC_CASHBACK", "KEY_GENERIC_PAYPAL_GROUPS", "KEY_GENERIC_PAY_LATER", "KEY_GENERIC_LOGO_XOOM_VALUE"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ActivityAvatarIconConstants {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityAvatarIconConstants INSTANCE = new com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityAvatarIconConstants();
        public static final java.lang.String KEY_GENERIC_ACORNS_VALUE = "acorns";
        public static final java.lang.String KEY_GENERIC_BANK_AVATAR_ICON = "bank";
        public static final java.lang.String KEY_GENERIC_CASHBACK = "cash-back";
        public static final java.lang.String KEY_GENERIC_CASH_CHECK_VALUE = "check-capture";
        public static final java.lang.String KEY_GENERIC_CREDIT_CARD = "credit-card";
        public static final java.lang.String KEY_GENERIC_DIRECT_DEPOSIT_VALUE = "direct-deposit";
        public static final java.lang.String KEY_GENERIC_DONATE_AVATAR_ICON = "donate";
        public static final java.lang.String KEY_GENERIC_GOALS_VALUE = "goals";
        public static final java.lang.String KEY_GENERIC_LOGO_PAYPAL_VALUE = "paypal-app";
        public static final java.lang.String KEY_GENERIC_LOGO_XOOM_VALUE = "logo_xoom-monogram-color";
        public static final java.lang.String KEY_GENERIC_MC_CREDIT_CARD = "credit-mastercard";
        public static final java.lang.String KEY_GENERIC_MERCHANT_AVATAR_ICON = "merchant";
        public static final java.lang.String KEY_GENERIC_MONEY_POOLS_VALUE = "community";
        public static final java.lang.String KEY_GENERIC_PAYPAL_GROUPS = "crowdfund";
        public static final java.lang.String KEY_GENERIC_PAY_LATER = "pay-later";
        public static final java.lang.String KEY_GENERIC_PROFILE = "profile";
        public static final java.lang.String KEY_GENERIC_REQUEST_MONEY_VALUE = "request-money";
        public static final java.lang.String KEY_GENERIC_TOP_UP_VALUE = "top-up";
        public static final java.lang.String KEY_GENERIC_TRANSFERS_VALUE = "transfer";

        private ActivityAvatarIconConstants() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/base/constants/ActivityConstants$ActivityInvoiceConstants;", "", "<init>", "()V", "", "ZETTLE_NO_STORE_PREFIX", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ActivityInvoiceConstants {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityInvoiceConstants INSTANCE = new com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityInvoiceConstants();
        public static final java.lang.String ZETTLE_NO_STORE_PREFIX = "ZCON";

        private ActivityInvoiceConstants() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/base/constants/ActivityConstants$ActivityWebViewConstants;", "", "<init>", "()V", "", "KEY_UN_AUTH_WEBVIEW_URL_PARAM", "Ljava/lang/String;", "KEY_UN_AUTH_WEBVIEW_REASON", "KEY_WEBVIEW_CONFIG_URL_PARAM", "KEY_WEBVIEW_CONFIG_REASON", "KEY_WEBVIEW_AUTH_FAILURE_REASON", "KEY_WEBVIEW_REPORT_PROBLEM_PATH", "KEY_WEBVIEW_UNILATERAL_CANCEL_PATH", "KEY_WEBVIEW_ISSUE_REFUND_PATH", "KEY_WEBVIEW_ADD_TRACKING_PATH", "KEY_WEBVIEW_CREATE_SHIP_LABEL_PATH", "KEY_WEBVIEW_CRYPTO_FAQ_PATH", "KEY_WEBVIEW_HOLD_CRYPTO_FAQ_PATH", "KEY_WEBVIEW_FAILED_CRYPTO_FAQ_PATH", "KEY_WEBVIEW_RESOLUTION_CENTER_PATH"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ActivityWebViewConstants {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityWebViewConstants INSTANCE = new com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityWebViewConstants();
        public static final java.lang.String KEY_UN_AUTH_WEBVIEW_REASON = "unauth_webview_reason";
        public static final java.lang.String KEY_UN_AUTH_WEBVIEW_URL_PARAM = "unauth_webview_url";
        public static final java.lang.String KEY_WEBVIEW_ADD_TRACKING_PATH = "/addtracking/add/";
        public static final java.lang.String KEY_WEBVIEW_AUTH_FAILURE_REASON = "auth_webview_failure";
        public static final java.lang.String KEY_WEBVIEW_CONFIG_REASON = "config_webview_reason";
        public static final java.lang.String KEY_WEBVIEW_CONFIG_URL_PARAM = "config_webview_url";
        public static final java.lang.String KEY_WEBVIEW_CREATE_SHIP_LABEL_PATH = "/shiplabel/create/";
        public static final java.lang.String KEY_WEBVIEW_CRYPTO_FAQ_PATH = "/smarthelp/contact-us";
        public static final java.lang.String KEY_WEBVIEW_FAILED_CRYPTO_FAQ_PATH = "/smarthelp/article/FAQ4630";
        public static final java.lang.String KEY_WEBVIEW_HOLD_CRYPTO_FAQ_PATH = "/smarthelp/article/FAQ4629";
        public static final java.lang.String KEY_WEBVIEW_ISSUE_REFUND_PATH = "/activity/actions/refund/edit/";
        public static final java.lang.String KEY_WEBVIEW_REPORT_PROBLEM_PATH = "/resolutioncenter/filing/";
        public static final java.lang.String KEY_WEBVIEW_RESOLUTION_CENTER_PATH = "/resolutioncenter/";
        public static final java.lang.String KEY_WEBVIEW_UNILATERAL_CANCEL_PATH = "/activity/actions/cancelpayment/review/";

        private ActivityWebViewConstants() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/base/constants/ActivityConstants$ActivityPaypalDeepLinks;", "", "<init>", "()V", "", "KEY_PATH_ADD_DEEP_LINK_TAX_ID", "Ljava/lang/String;", "KEY_PATH_GET_ANSWERS"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ActivityPaypalDeepLinks {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityPaypalDeepLinks INSTANCE = new com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityPaypalDeepLinks();
        public static final java.lang.String KEY_PATH_ADD_DEEP_LINK_TAX_ID = "/cip_home";
        public static final java.lang.String KEY_PATH_GET_ANSWERS = "/helpcenter/showRecommendedList?src=ACTIVITY&productRefId=CONSUMER&fieldRefId=TXN_DETAILS_IPS_FAQ&pageRefId=SUMMARY&recommendedSheetTitle=Common%20questions";

        private ActivityPaypalDeepLinks() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/base/constants/ActivityConstants$ActivityDeeplinkQueryParametersConstants;", "", "<init>", "()V", "", "KEY_QUERY_PARAM_POLICY_NAME", "Ljava/lang/String;", "KEY_QUERY_PARAM_SHOW_CONTEXTUAL_MESSAGE", "KEY_QUERY_PARAM_ATTEMPT_INTENTION", "KEY_QUERY_PARAM_INVOCATION_PAGE", "KEY_QUERY_PARAM_SHOW_ACKNOWLEDGEMENT_SCREEN", "KEY_QUERY_PARAM_PP_FLOW", "KEY_QUERY_PARAM_SKIP_SUCCESS_SCREEN", "VALUE_POLICY_NAME_IRS_1099_K", "VALUE_TRUE", "VALUE_ATTEMPT_INTENTION_TIN_COLLECTION_TDC", "VALUE_INVOCATION_PAGE_HOME", "VALUE_PP_FLOW_TDC_ACTION_CARD", "VALUE_ATTEMPT_INTENTION_TAX_ON_HOLD", "VALUE_INVOCATION_PAGE_EDUCATIONAL_SHEET", "VALUE_PP_FLOW_EDUCATIONAL_SHEET_NATIVE", "VALUE_FALSE"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ActivityDeeplinkQueryParametersConstants {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityDeeplinkQueryParametersConstants INSTANCE = new com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityDeeplinkQueryParametersConstants();
        public static final java.lang.String KEY_QUERY_PARAM_ATTEMPT_INTENTION = "attemptIntention";
        public static final java.lang.String KEY_QUERY_PARAM_INVOCATION_PAGE = "invocationPage";
        public static final java.lang.String KEY_QUERY_PARAM_POLICY_NAME = "policyName";
        public static final java.lang.String KEY_QUERY_PARAM_PP_FLOW = "pp_flow";
        public static final java.lang.String KEY_QUERY_PARAM_SHOW_ACKNOWLEDGEMENT_SCREEN = "showAcknowledgementScreen";
        public static final java.lang.String KEY_QUERY_PARAM_SHOW_CONTEXTUAL_MESSAGE = "showContextualMessage";
        public static final java.lang.String KEY_QUERY_PARAM_SKIP_SUCCESS_SCREEN = "skipSuccessScreen";
        public static final java.lang.String VALUE_ATTEMPT_INTENTION_TAX_ON_HOLD = "TaxOnHold";
        public static final java.lang.String VALUE_ATTEMPT_INTENTION_TIN_COLLECTION_TDC = "TIN_collection_for_1099k_through_TDC";
        public static final java.lang.String VALUE_FALSE = "false";
        public static final java.lang.String VALUE_INVOCATION_PAGE_EDUCATIONAL_SHEET = "EducationalSheet";
        public static final java.lang.String VALUE_INVOCATION_PAGE_HOME = "activity_details";
        public static final java.lang.String VALUE_POLICY_NAME_IRS_1099_K = "IRS_1099_K";
        public static final java.lang.String VALUE_PP_FLOW_EDUCATIONAL_SHEET_NATIVE = "edu_sheet_native";
        public static final java.lang.String VALUE_PP_FLOW_TDC_ACTION_CARD = "tdc_action_card_native";
        public static final java.lang.String VALUE_TRUE = "true";

        private ActivityDeeplinkQueryParametersConstants() {
        }
    }
}
