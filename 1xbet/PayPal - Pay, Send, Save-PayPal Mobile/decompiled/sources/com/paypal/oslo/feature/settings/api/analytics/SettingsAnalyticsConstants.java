package com.paypal.oslo.feature.settings.api.analytics;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/settings/api/analytics/SettingsAnalyticsConstants;", "", "<init>", "()V", "Screen", com.ingo.sdk.kotlin.common.analytics.IPropertyNames.Module, "FooterComponent", "ErrorComponent"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SettingsAnalyticsConstants {
    public static final com.paypal.oslo.feature.settings.api.analytics.SettingsAnalyticsConstants INSTANCE = new com.paypal.oslo.feature.settings.api.analytics.SettingsAnalyticsConstants();

    private SettingsAnalyticsConstants() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0017\u0010\f\u001a\u00020\u000b8\u0007¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/settings/api/analytics/SettingsAnalyticsConstants$Screen;", "", "<init>", "()V", "", "ID", "Ljava/lang/String;", "PRODUCT", "FEATURE", "ACTION", "ITEM_ACTION", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "USER_INTENT", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "getUSER_INTENT", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "ITEM_USER_INTENT", "getITEM_USER_INTENT"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Screen {
        public static final java.lang.String ACTION = "view_and_manage";
        public static final java.lang.String FEATURE = "view_and_manage";
        public static final java.lang.String ID = "me_settings";
        public static final java.lang.String ITEM_ACTION = "manage";
        public static final java.lang.String PRODUCT = "me_settings";
        public static final com.paypal.oslo.feature.settings.api.analytics.SettingsAnalyticsConstants.Screen INSTANCE = new com.paypal.oslo.feature.settings.api.analytics.SettingsAnalyticsConstants.Screen();
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext USER_INTENT = new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("me_settings", "view_and_manage", "view_and_manage");
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext ITEM_USER_INTENT = new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("me_settings", "view_and_manage", "manage");

        private Screen() {
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getUSER_INTENT() {
            return USER_INTENT;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getITEM_USER_INTENT() {
            return ITEM_USER_INTENT;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/settings/api/analytics/SettingsAnalyticsConstants$Module;", "", "<init>", "()V", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "PROFILE", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "getPROFILE", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "PAYMENTS", "getPAYMENTS", "SECURITY_AND_PRIVACY", "getSECURITY_AND_PRIVACY", "NOTIFICATIONS", "getNOTIFICATIONS", "SUPPORT", "getSUPPORT", "FOOTER", "getFOOTER", "ERROR", "getERROR"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Module {
        public static final com.paypal.oslo.feature.settings.api.analytics.SettingsAnalyticsConstants.Module INSTANCE = new com.paypal.oslo.feature.settings.api.analytics.SettingsAnalyticsConstants.Module();
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module PROFILE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("me_settings_profile", 0, null, 0, 6, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module PAYMENTS = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("me_settings_payments", 0, null, 1, 6, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module SECURITY_AND_PRIVACY = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("me_settings_security_and_privacy", 0, null, 2, 6, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module NOTIFICATIONS = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("me_settings_notifications", 0, null, 3, 6, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module SUPPORT = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("me_settings_support", 0, null, 4, 6, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module FOOTER = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("me_settings_footer", 0, null, 5, 6, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module ERROR = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("me_settings_error", 0, null, 0, 6, null);

        private Module() {
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getPROFILE() {
            return PROFILE;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getPAYMENTS() {
            return PAYMENTS;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getSECURITY_AND_PRIVACY() {
            return SECURITY_AND_PRIVACY;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getNOTIFICATIONS() {
            return NOTIFICATIONS;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getSUPPORT() {
            return SUPPORT;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getFOOTER() {
            return FOOTER;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getERROR() {
            return ERROR;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/settings/api/analytics/SettingsAnalyticsConstants$FooterComponent;", "", "<init>", "()V", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "LOG_OUT", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "getLOG_OUT", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "CLOSE_ACCOUNT", "getCLOSE_ACCOUNT", "LEGAL", "getLEGAL"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class FooterComponent {
        public static final com.paypal.oslo.feature.settings.api.analytics.SettingsAnalyticsConstants.FooterComponent INSTANCE = new com.paypal.oslo.feature.settings.api.analytics.SettingsAnalyticsConstants.FooterComponent();
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component LOG_OUT = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("log_out", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component CLOSE_ACCOUNT = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component(com.paypal.oslo.feature.settings.constants.SettingsConstants.Analytics.CLOSE_ACCOUNT_SOURCE, 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component LEGAL = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("legal", 0, null, null, 14, null);

        private FooterComponent() {
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getLOG_OUT() {
            return LOG_OUT;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getCLOSE_ACCOUNT() {
            return CLOSE_ACCOUNT;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getLEGAL() {
            return LEGAL;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/settings/api/analytics/SettingsAnalyticsConstants$ErrorComponent;", "", "<init>", "()V", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "TRY_AGAIN", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "getTRY_AGAIN", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ErrorComponent {
        public static final com.paypal.oslo.feature.settings.api.analytics.SettingsAnalyticsConstants.ErrorComponent INSTANCE = new com.paypal.oslo.feature.settings.api.analytics.SettingsAnalyticsConstants.ErrorComponent();
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component TRY_AGAIN = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("try_again", 0, null, null, 14, null);

        private ErrorComponent() {
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getTRY_AGAIN() {
            return TRY_AGAIN;
        }
    }
}
