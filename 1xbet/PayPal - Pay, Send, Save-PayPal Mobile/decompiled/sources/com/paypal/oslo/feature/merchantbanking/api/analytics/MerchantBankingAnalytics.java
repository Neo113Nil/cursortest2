package com.paypal.oslo.feature.merchantbanking.api.analytics;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u000f\u0010\u0011B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/merchantbanking/api/analytics/MerchantBankingAnalytics;", "", "<init>", "()V", "", "PRODUCT", "Ljava/lang/String;", "FEATURE", "ACTION", "SOURCE", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "screenShownAction", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "getScreenShownAction", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "TermsScreen", "AccountNumbersScreen", "ErrorScreen"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MerchantBankingAnalytics {
    public static final java.lang.String SOURCE = "feature:merchant-banking";
    public static final com.paypal.oslo.feature.merchantbanking.api.analytics.MerchantBankingAnalytics INSTANCE = new com.paypal.oslo.feature.merchantbanking.api.analytics.MerchantBankingAnalytics();
    public static final java.lang.String PRODUCT = "merchant_banking";
    public static final java.lang.String FEATURE = "account_routing_number";
    public static final java.lang.String ACTION = "screen_viewed";
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext screenShownAction = new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(PRODUCT, FEATURE, ACTION);

    private MerchantBankingAnalytics() {
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getScreenShownAction() {
        return screenShownAction;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/merchantbanking/api/analytics/MerchantBankingAnalytics$TermsScreen;", "", "<init>", "()V", "", "IDENTIFIER", "Ljava/lang/String;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "CONTINUE_BUTTON", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getCONTINUE_BUTTON", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "CANCEL_BUTTON", "getCANCEL_BUTTON"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class TermsScreen {
        public static final java.lang.String IDENTIFIER = "merchant_banking_account_routing_number_terms_screen";
        public static final com.paypal.oslo.feature.merchantbanking.api.analytics.MerchantBankingAnalytics.TermsScreen INSTANCE = new com.paypal.oslo.feature.merchantbanking.api.analytics.MerchantBankingAnalytics.TermsScreen();
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item CONTINUE_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("continue_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item CANCEL_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("cancel_button", 0, 2, null);

        private TermsScreen() {
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getCONTINUE_BUTTON() {
            return CONTINUE_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getCANCEL_BUTTON() {
            return CANCEL_BUTTON;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u000f\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\fR\u001a\u0010\u0011\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/merchantbanking/api/analytics/MerchantBankingAnalytics$AccountNumbersScreen;", "", "<init>", "()V", "", "IDENTIFIER", "Ljava/lang/String;", "NAVIGATION_TYPE", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "COPY_ACCOUNT_NUMBER", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getCOPY_ACCOUNT_NUMBER", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "COPY_ROUTING_NUMBER", "getCOPY_ROUTING_NUMBER", "SHOW_ACCOUNT_NUMBER", "getSHOW_ACCOUNT_NUMBER", "HIDE_ACCOUNT_NUMBER", "getHIDE_ACCOUNT_NUMBER"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AccountNumbersScreen {
        public static final java.lang.String IDENTIFIER = "merchant_banking_account_routing_number_account_numbers_screen";
        public static final java.lang.String NAVIGATION_TYPE = "click";
        public static final com.paypal.oslo.feature.merchantbanking.api.analytics.MerchantBankingAnalytics.AccountNumbersScreen INSTANCE = new com.paypal.oslo.feature.merchantbanking.api.analytics.MerchantBankingAnalytics.AccountNumbersScreen();
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item COPY_ACCOUNT_NUMBER = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("copy_account_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item COPY_ROUTING_NUMBER = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("copy_routing_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item SHOW_ACCOUNT_NUMBER = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("show_account_number_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item HIDE_ACCOUNT_NUMBER = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("hide_account_number_button", 0, 2, null);

        private AccountNumbersScreen() {
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getCOPY_ACCOUNT_NUMBER() {
            return COPY_ACCOUNT_NUMBER;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getCOPY_ROUTING_NUMBER() {
            return COPY_ROUTING_NUMBER;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getSHOW_ACCOUNT_NUMBER() {
            return SHOW_ACCOUNT_NUMBER;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getHIDE_ACCOUNT_NUMBER() {
            return HIDE_ACCOUNT_NUMBER;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/merchantbanking/api/analytics/MerchantBankingAnalytics$ErrorScreen;", "", "<init>", "()V", "", "IDENTIFIER", "Ljava/lang/String;", "RETRY_BUTTON"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ErrorScreen {
        public static final java.lang.String IDENTIFIER = "merchant_banking_account_routing_number_error_screen";
        public static final com.paypal.oslo.feature.merchantbanking.api.analytics.MerchantBankingAnalytics.ErrorScreen INSTANCE = new com.paypal.oslo.feature.merchantbanking.api.analytics.MerchantBankingAnalytics.ErrorScreen();
        public static final java.lang.String RETRY_BUTTON = "retry_button";

        private ErrorScreen() {
        }
    }
}
