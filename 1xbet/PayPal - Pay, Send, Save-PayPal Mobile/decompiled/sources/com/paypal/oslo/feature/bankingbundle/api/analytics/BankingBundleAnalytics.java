package com.paypal.oslo.feature.bankingbundle.api.analytics;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001:\u0007\u0018\u0019\u001a\u001b\u001c\u001d\u001eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/api/analytics/BankingBundleAnalytics;", "", "<init>", "()V", "", "PRODUCT", "Ljava/lang/String;", "FEATURE", "ACTION_SCREEN_SHOWN", "ACTION_SCREEN_LOADED", "ACTION_SCREEN_EXIT", "ACTION_CLICKED", "SOURCE", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "screenShownAction", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "getScreenShownAction", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "screenLoadedAction", "getScreenLoadedAction", "screenExitAction", "getScreenExitAction", "itemClickedAction", "getItemClickedAction", "StandaloneLandingScreen", "AcceptMoneyChoiceScreen", "BenefitsComparisonScreen", "SuccessSheet", "ErrorScreen", "UnavailableScreen", "FlowOutcome"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BankingBundleAnalytics {
    public static final java.lang.String ACTION_CLICKED = "clicked";
    public static final java.lang.String ACTION_SCREEN_EXIT = "screen_exit";
    public static final java.lang.String ACTION_SCREEN_LOADED = "screen_loaded";
    public static final java.lang.String ACTION_SCREEN_SHOWN = "screen_shown";
    public static final java.lang.String FEATURE = "banking_bundle";
    public static final java.lang.String PRODUCT = "banking_bundle";
    public static final java.lang.String SOURCE = "feature:banking-bundle";
    public static final com.paypal.oslo.feature.bankingbundle.api.analytics.BankingBundleAnalytics INSTANCE = new com.paypal.oslo.feature.bankingbundle.api.analytics.BankingBundleAnalytics();
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext screenShownAction = new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("banking_bundle", "banking_bundle", "screen_shown");
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext screenLoadedAction = new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("banking_bundle", "banking_bundle", "screen_loaded");
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext screenExitAction = new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("banking_bundle", "banking_bundle", "screen_exit");
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext itemClickedAction = new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("banking_bundle", "banking_bundle", "clicked");

    private BankingBundleAnalytics() {
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getScreenShownAction() {
        return screenShownAction;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getScreenLoadedAction() {
        return screenLoadedAction;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getScreenExitAction() {
        return screenExitAction;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getItemClickedAction() {
        return itemClickedAction;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/api/analytics/BankingBundleAnalytics$StandaloneLandingScreen;", "", "<init>", "()V", "", "IDENTIFIER", "Ljava/lang/String;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "NEXT_BUTTON", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getNEXT_BUTTON", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "CLOSE_BUTTON", "getCLOSE_BUTTON", "SET_UP_LATER_BUTTON", "getSET_UP_LATER_BUTTON", "TERMS_LINK", "getTERMS_LINK"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class StandaloneLandingScreen {
        public static final java.lang.String IDENTIFIER = "banking_bundle_banking_bundle_standalone_landing_screen";
        public static final com.paypal.oslo.feature.bankingbundle.api.analytics.BankingBundleAnalytics.StandaloneLandingScreen INSTANCE = new com.paypal.oslo.feature.bankingbundle.api.analytics.BankingBundleAnalytics.StandaloneLandingScreen();
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item NEXT_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("next_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item CLOSE_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("close_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item SET_UP_LATER_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("set_up_later_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item TERMS_LINK = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("terms_link", 0, 2, null);

        private StandaloneLandingScreen() {
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getNEXT_BUTTON() {
            return NEXT_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getCLOSE_BUTTON() {
            return CLOSE_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getSET_UP_LATER_BUTTON() {
            return SET_UP_LATER_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getTERMS_LINK() {
            return TERMS_LINK;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/api/analytics/BankingBundleAnalytics$AcceptMoneyChoiceScreen;", "", "<init>", "()V", "", "IDENTIFIER", "Ljava/lang/String;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "CLOSE_BUTTON", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getCLOSE_BUTTON", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "KEEP_IN_PAYPAL_BUTTON", "getKEEP_IN_PAYPAL_BUTTON", "TRANSFER_TO_BANK_BUTTON", "getTRANSFER_TO_BANK_BUTTON", "TERMS_LINK", "getTERMS_LINK"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AcceptMoneyChoiceScreen {
        public static final java.lang.String IDENTIFIER = "banking_bundle_banking_bundle_accept_money_choice_screen";
        public static final com.paypal.oslo.feature.bankingbundle.api.analytics.BankingBundleAnalytics.AcceptMoneyChoiceScreen INSTANCE = new com.paypal.oslo.feature.bankingbundle.api.analytics.BankingBundleAnalytics.AcceptMoneyChoiceScreen();
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item CLOSE_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("close_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item KEEP_IN_PAYPAL_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("keep_in_paypal_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item TRANSFER_TO_BANK_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("transfer_to_bank_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item TERMS_LINK = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("terms_link", 0, 2, null);

        private AcceptMoneyChoiceScreen() {
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getCLOSE_BUTTON() {
            return CLOSE_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getKEEP_IN_PAYPAL_BUTTON() {
            return KEEP_IN_PAYPAL_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getTRANSFER_TO_BANK_BUTTON() {
            return TRANSFER_TO_BANK_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getTERMS_LINK() {
            return TERMS_LINK;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/api/analytics/BankingBundleAnalytics$BenefitsComparisonScreen;", "", "<init>", "()V", "", "IDENTIFIER", "Ljava/lang/String;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "WANT_BENEFITS_BUTTON", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getWANT_BENEFITS_BUTTON", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "SKIP_BUTTON", "getSKIP_BUTTON", "TERMS_LINK", "getTERMS_LINK"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BenefitsComparisonScreen {
        public static final java.lang.String IDENTIFIER = "banking_bundle_banking_bundle_benefits_comparison_screen";
        public static final com.paypal.oslo.feature.bankingbundle.api.analytics.BankingBundleAnalytics.BenefitsComparisonScreen INSTANCE = new com.paypal.oslo.feature.bankingbundle.api.analytics.BankingBundleAnalytics.BenefitsComparisonScreen();
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item WANT_BENEFITS_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("want_benefits_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item SKIP_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("skip_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item TERMS_LINK = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("terms_link", 0, 2, null);

        private BenefitsComparisonScreen() {
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getWANT_BENEFITS_BUTTON() {
            return WANT_BENEFITS_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getSKIP_BUTTON() {
            return SKIP_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getTERMS_LINK() {
            return TERMS_LINK;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/api/analytics/BankingBundleAnalytics$SuccessSheet;", "", "<init>", "()V", "", "IDENTIFIER", "Ljava/lang/String;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "DONE_BUTTON", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getDONE_BUTTON", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "CLOSE_BUTTON", "getCLOSE_BUTTON"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SuccessSheet {
        public static final java.lang.String IDENTIFIER = "banking_bundle_banking_bundle_success_sheet";
        public static final com.paypal.oslo.feature.bankingbundle.api.analytics.BankingBundleAnalytics.SuccessSheet INSTANCE = new com.paypal.oslo.feature.bankingbundle.api.analytics.BankingBundleAnalytics.SuccessSheet();
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item DONE_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("done_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item CLOSE_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("close_button", 0, 2, null);

        private SuccessSheet() {
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getDONE_BUTTON() {
            return DONE_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getCLOSE_BUTTON() {
            return CLOSE_BUTTON;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/api/analytics/BankingBundleAnalytics$ErrorScreen;", "", "<init>", "()V", "", "IDENTIFIER", "Ljava/lang/String;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "OK_BUTTON", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getOK_BUTTON", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ErrorScreen {
        public static final java.lang.String IDENTIFIER = "banking_bundle_banking_bundle_error_screen";
        public static final com.paypal.oslo.feature.bankingbundle.api.analytics.BankingBundleAnalytics.ErrorScreen INSTANCE = new com.paypal.oslo.feature.bankingbundle.api.analytics.BankingBundleAnalytics.ErrorScreen();
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item OK_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.wallet.fifo.common.IneligibleFundingInstrumentModalKt.TestTagOkButton, 0, 2, null);

        private ErrorScreen() {
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getOK_BUTTON() {
            return OK_BUTTON;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/api/analytics/BankingBundleAnalytics$UnavailableScreen;", "", "<init>", "()V", "", "IDENTIFIER", "Ljava/lang/String;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "OK_BUTTON", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getOK_BUTTON", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class UnavailableScreen {
        public static final java.lang.String IDENTIFIER = "banking_bundle_banking_bundle_unavailable_screen";
        public static final com.paypal.oslo.feature.bankingbundle.api.analytics.BankingBundleAnalytics.UnavailableScreen INSTANCE = new com.paypal.oslo.feature.bankingbundle.api.analytics.BankingBundleAnalytics.UnavailableScreen();
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item OK_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.wallet.fifo.common.IneligibleFundingInstrumentModalKt.TestTagOkButton, 0, 2, null);

        private UnavailableScreen() {
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getOK_BUTTON() {
            return OK_BUTTON;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/api/analytics/BankingBundleAnalytics$FlowOutcome;", "", "<init>", "()V", "", "FLOW_NAME", "Ljava/lang/String;", "COMPLETED", com.paypal.oslo.downloads.impl.DownloadStateValue.CANCELLED, "SKIPPED", "IN_REVIEW", com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED, "IDENTITY_VERIFICATION_REQUIRED"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class FlowOutcome {
        public static final java.lang.String CANCELLED = "cancelled";
        public static final java.lang.String COMPLETED = "completed";
        public static final java.lang.String FAILED = "failed";
        public static final java.lang.String FLOW_NAME = "banking_bundle_enroll";
        public static final java.lang.String IDENTITY_VERIFICATION_REQUIRED = "identity_verification_required";
        public static final com.paypal.oslo.feature.bankingbundle.api.analytics.BankingBundleAnalytics.FlowOutcome INSTANCE = new com.paypal.oslo.feature.bankingbundle.api.analytics.BankingBundleAnalytics.FlowOutcome();
        public static final java.lang.String IN_REVIEW = "in_review";
        public static final java.lang.String SKIPPED = "skipped";

        private FlowOutcome() {
        }
    }
}
