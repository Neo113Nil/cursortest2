package com.paypal.oslo.feature.smartroute.analytics;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001:\u0005\b\t\n\u000b\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/analytics/SmartRouteAnalyticsConstants;", "", "<init>", "()V", "", "PRODUCT", "Ljava/lang/String;", "FEATURE", "Screen", com.ingo.sdk.kotlin.common.analytics.IPropertyNames.Module, "Item", "Action", "Api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SmartRouteAnalyticsConstants {
    public static final int $stable = 0;
    public static final java.lang.String FEATURE = "smart_route";
    public static final com.paypal.oslo.feature.smartroute.analytics.SmartRouteAnalyticsConstants INSTANCE = new com.paypal.oslo.feature.smartroute.analytics.SmartRouteAnalyticsConstants();
    public static final java.lang.String PRODUCT = "smart_route";

    private SmartRouteAnalyticsConstants() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/analytics/SmartRouteAnalyticsConstants$Screen;", "", "<init>", "()V", "", "SMART_ROUTE_SETUP", "Ljava/lang/String;", "SCREEN_LOADING", "SCREEN_CONTENT", "SCREEN_ERROR_RETRY", "SCREEN_ERROR_FATAL"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Screen {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.smartroute.analytics.SmartRouteAnalyticsConstants.Screen INSTANCE = new com.paypal.oslo.feature.smartroute.analytics.SmartRouteAnalyticsConstants.Screen();
        public static final java.lang.String SCREEN_CONTENT = "smart_route_setup_content";
        public static final java.lang.String SCREEN_ERROR_FATAL = "smart_route_setup_error_fatal";
        public static final java.lang.String SCREEN_ERROR_RETRY = "smart_route_setup_error_retry";
        public static final java.lang.String SCREEN_LOADING = "smart_route_setup_loading";
        public static final java.lang.String SMART_ROUTE_SETUP = "smart_route_setup";

        private Screen() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/analytics/SmartRouteAnalyticsConstants$Module;", "", "<init>", "()V", "", "SPLIT_SLIDERS", "Ljava/lang/String;", "AUTO_RELOAD", "AUTO_RELOAD_INFO", "PYUSD_PROMO", "VALIDATION_ERROR", "SETUP_SUCCESS", "CONFIRM_MODAL", "TURN_OFF_SUCCESS", "SAVINGS_ONBOARDING"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Module {
        public static final int $stable = 0;
        public static final java.lang.String AUTO_RELOAD = "smart_route_auto_reload";
        public static final java.lang.String AUTO_RELOAD_INFO = "smart_route_auto_reload_info";
        public static final java.lang.String CONFIRM_MODAL = "smart_route_confirm_modal";
        public static final com.paypal.oslo.feature.smartroute.analytics.SmartRouteAnalyticsConstants.Module INSTANCE = new com.paypal.oslo.feature.smartroute.analytics.SmartRouteAnalyticsConstants.Module();
        public static final java.lang.String PYUSD_PROMO = "smart_route_pyusd_promo";
        public static final java.lang.String SAVINGS_ONBOARDING = "smart_route_savings_onboarding";
        public static final java.lang.String SETUP_SUCCESS = "smart_route_setup_success";
        public static final java.lang.String SPLIT_SLIDERS = "smart_route_split_sliders";
        public static final java.lang.String TURN_OFF_SUCCESS = "smart_route_turn_off_success";
        public static final java.lang.String VALIDATION_ERROR = "smart_route_validation_error";

        private Module() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0017\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u001a\u0010\u0019\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u001a\u0010\u001d\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u001a\u0010\u001f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/analytics/SmartRouteAnalyticsConstants$Item;", "", "<init>", "()V", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "SAVINGS_SLIDER", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getSAVINGS_SLIDER", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "PYUSD_SLIDER", "getPYUSD_SLIDER", "AUTO_RELOAD_TOGGLE", "getAUTO_RELOAD_TOGGLE", "AUTO_RELOAD_INFO_LINK", "getAUTO_RELOAD_INFO_LINK", "AGREE_AND_AUTHORIZE_BUTTON", "getAGREE_AND_AUTHORIZE_BUTTON", "CANCEL_BUTTON", "getCANCEL_BUTTON", "TURN_OFF_BUTTON", "getTURN_OFF_BUTTON", "CONFIRM_BUTTON", "getCONFIRM_BUTTON", "KEEP_ON_BUTTON", "getKEEP_ON_BUTTON", "PYUSD_OPT_IN_BUTTON", "getPYUSD_OPT_IN_BUTTON", "PYUSD_MAYBE_LATER_BUTTON", "getPYUSD_MAYBE_LATER_BUTTON", "PYUSD_PROMO_DISMISS_BUTTON", "getPYUSD_PROMO_DISMISS_BUTTON", "AUTO_RELOAD_INFO_GOT_IT", "getAUTO_RELOAD_INFO_GOT_IT"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Item {
        public static final int $stable;
        public static final com.paypal.oslo.feature.smartroute.analytics.SmartRouteAnalyticsConstants.Item INSTANCE = new com.paypal.oslo.feature.smartroute.analytics.SmartRouteAnalyticsConstants.Item();
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item SAVINGS_SLIDER = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("savings_slider", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item PYUSD_SLIDER = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("pyusd_slider", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item AUTO_RELOAD_TOGGLE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("auto_reload_toggle", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item AUTO_RELOAD_INFO_LINK = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("auto_reload_info_link", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item AGREE_AND_AUTHORIZE_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("agree_and_authorize_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item CANCEL_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("cancel_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item TURN_OFF_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("turn_off_smart_route_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item CONFIRM_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddMoneyReviewScreenKt.TestTagConfirmButton, 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item KEEP_ON_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("keep_smart_route_on_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item PYUSD_OPT_IN_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.smartroute.ui.pyusd.PYUsdOptInTestTags.OPT_IN_BUTTON, 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item PYUSD_MAYBE_LATER_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.smartroute.ui.pyusd.PYUsdOptInTestTags.MAYBE_LATER_BUTTON, 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item PYUSD_PROMO_DISMISS_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("pyusd_promo_dismiss_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item AUTO_RELOAD_INFO_GOT_IT = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.smartroute.ui.DistributionTestTags.AUTO_RELOAD_INFO_GOT_IT_BUTTON, 0, 2, null);

        private Item() {
        }

        static {
            int i = com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable;
            $stable = i | i | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getSAVINGS_SLIDER() {
            return SAVINGS_SLIDER;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getPYUSD_SLIDER() {
            return PYUSD_SLIDER;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getAUTO_RELOAD_TOGGLE() {
            return AUTO_RELOAD_TOGGLE;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getAUTO_RELOAD_INFO_LINK() {
            return AUTO_RELOAD_INFO_LINK;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getAGREE_AND_AUTHORIZE_BUTTON() {
            return AGREE_AND_AUTHORIZE_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getCANCEL_BUTTON() {
            return CANCEL_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getTURN_OFF_BUTTON() {
            return TURN_OFF_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getCONFIRM_BUTTON() {
            return CONFIRM_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getKEEP_ON_BUTTON() {
            return KEEP_ON_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getPYUSD_OPT_IN_BUTTON() {
            return PYUSD_OPT_IN_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getPYUSD_MAYBE_LATER_BUTTON() {
            return PYUSD_MAYBE_LATER_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getPYUSD_PROMO_DISMISS_BUTTON() {
            return PYUSD_PROMO_DISMISS_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getAUTO_RELOAD_INFO_GOT_IT() {
            return AUTO_RELOAD_INFO_GOT_IT;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0019\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0006R\u0014\u0010\u001a\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0006R\u0014\u0010\u001c\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/analytics/SmartRouteAnalyticsConstants$Action;", "", "<init>", "()V", "", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.SETUP, "Ljava/lang/String;", "EDIT", "ADJUST_SPLIT", "TOGGLE_AUTO_RELOAD", "VIEW_AUTO_RELOAD_INFO", "AUTHORIZE", "SAVE_EDIT", "CANCEL_SETUP", "CANCEL_EDIT", "INITIATE_TURN_OFF", "CONFIRM_TURN_OFF", "CANCEL_TURN_OFF", "TURN_OFF_SUCCESS", "VIEW_PYUSD_PROMO", "OPT_IN_PYUSD", "DISMISS_PYUSD_PROMO", "CONFIRM_PYUSD_OPT_OUT", "CANCEL_PYUSD_OPT_OUT", "SETUP_SUCCESS", "VIEW_AUTO_RELOAD_INFO_MODAL", "DISMISS_AUTO_RELOAD_INFO", "VIEW_SAVINGS_ONBOARDING_MODAL", "DISMISS_SAVINGS_ONBOARDING", "SAVINGS_ONBOARDING_CONTINUE"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Action {
        public static final int $stable = 0;
        public static final java.lang.String ADJUST_SPLIT = "adjust_split";
        public static final java.lang.String AUTHORIZE = "authorize";
        public static final java.lang.String CANCEL_EDIT = "cancel_edit";
        public static final java.lang.String CANCEL_PYUSD_OPT_OUT = "cancel_pyusd_opt_out";
        public static final java.lang.String CANCEL_SETUP = "cancel_setup";
        public static final java.lang.String CANCEL_TURN_OFF = "cancel_turn_off";
        public static final java.lang.String CONFIRM_PYUSD_OPT_OUT = "confirm_pyusd_opt_out";
        public static final java.lang.String CONFIRM_TURN_OFF = "confirm_turn_off";
        public static final java.lang.String DISMISS_AUTO_RELOAD_INFO = "dismiss_auto_reload_info";
        public static final java.lang.String DISMISS_PYUSD_PROMO = "dismiss_pyusd_promo";
        public static final java.lang.String DISMISS_SAVINGS_ONBOARDING = "dismiss_savings_onboarding";
        public static final java.lang.String EDIT = "edit";
        public static final java.lang.String INITIATE_TURN_OFF = "initiate_turn_off";
        public static final com.paypal.oslo.feature.smartroute.analytics.SmartRouteAnalyticsConstants.Action INSTANCE = new com.paypal.oslo.feature.smartroute.analytics.SmartRouteAnalyticsConstants.Action();
        public static final java.lang.String OPT_IN_PYUSD = "opt_in_pyusd";
        public static final java.lang.String SAVE_EDIT = "save_edit";
        public static final java.lang.String SAVINGS_ONBOARDING_CONTINUE = "savings_onboarding_continue";
        public static final java.lang.String SETUP = "setup";
        public static final java.lang.String SETUP_SUCCESS = "setup_success";
        public static final java.lang.String TOGGLE_AUTO_RELOAD = "toggle_auto_reload";
        public static final java.lang.String TURN_OFF_SUCCESS = "turn_off_success";
        public static final java.lang.String VIEW_AUTO_RELOAD_INFO = "view_auto_reload_info";
        public static final java.lang.String VIEW_AUTO_RELOAD_INFO_MODAL = "view_auto_reload_info_modal";
        public static final java.lang.String VIEW_PYUSD_PROMO = "view_pyusd_promo";
        public static final java.lang.String VIEW_SAVINGS_ONBOARDING_MODAL = "view_savings_onboarding_modal";

        private Action() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/analytics/SmartRouteAnalyticsConstants$Api;", "", "<init>", "()V", "", "GET_PREFERENCES", "Ljava/lang/String;", "GET_AUTO_RELOAD_DETAILS", "UPDATE_PREFERENCES", "UPDATE_CRYPTO_PREFERENCES", "SETUP_AUTO_RELOAD", "DEACTIVATE_AUTO_RELOAD", "ApiType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Api {
        public static final int $stable = 0;
        public static final java.lang.String DEACTIVATE_AUTO_RELOAD = "deactivate_auto_reload";
        public static final java.lang.String GET_AUTO_RELOAD_DETAILS = "get_smart_route_auto_reload_setup_details";
        public static final java.lang.String GET_PREFERENCES = "get_smart_route_preferences";
        public static final com.paypal.oslo.feature.smartroute.analytics.SmartRouteAnalyticsConstants.Api INSTANCE = new com.paypal.oslo.feature.smartroute.analytics.SmartRouteAnalyticsConstants.Api();
        public static final java.lang.String SETUP_AUTO_RELOAD = "setup_low_balance_auto_reload";
        public static final java.lang.String UPDATE_CRYPTO_PREFERENCES = "update_cryptocurrency_preferences";
        public static final java.lang.String UPDATE_PREFERENCES = "update_smart_route_preferences";

        private Api() {
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/analytics/SmartRouteAnalyticsConstants$Api$ApiType;", "", "<init>", "()V", "", "QUERY", "Ljava/lang/String;", "MUTATION"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class ApiType {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.smartroute.analytics.SmartRouteAnalyticsConstants.Api.ApiType INSTANCE = new com.paypal.oslo.feature.smartroute.analytics.SmartRouteAnalyticsConstants.Api.ApiType();
            public static final java.lang.String MUTATION = "mutation";
            public static final java.lang.String QUERY = "query";

            private ApiType() {
            }
        }
    }
}
