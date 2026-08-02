package com.paypal.oslo.feature.taptopay.api.analytics;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0006\r\u000e\u000f\u0010\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\f\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/api/analytics/TapToPayAnalytics;", "", "<init>", "()V", "Lcom/paypal/oslo/core/telemetry/analytics/schema/Product;", "PRODUCT", "Lcom/paypal/oslo/core/telemetry/analytics/schema/Product;", "getPRODUCT", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/Product;", "", "FEATURE_SETUP", "Ljava/lang/String;", "FEATURE_PAYMODE", "Action", "Item", "SetupFlowScreen", "PayModeRouterScreen", "SetAsDefaultRouterScreen", "ChooseDefaultPaymentScreen"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TapToPayAnalytics {
    public static final java.lang.String FEATURE_PAYMODE = "paymode";
    public static final java.lang.String FEATURE_SETUP = "setup";
    public static final com.paypal.oslo.feature.taptopay.api.analytics.TapToPayAnalytics INSTANCE = new com.paypal.oslo.feature.taptopay.api.analytics.TapToPayAnalytics();
    private static final com.paypal.oslo.core.telemetry.analytics.schema.Product PRODUCT = com.paypal.oslo.core.telemetry.analytics.schema.Product.MOBILE_NFC_WALLET;

    private TapToPayAnalytics() {
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.Product getPRODUCT() {
        return PRODUCT;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/api/analytics/TapToPayAnalytics$Action;", "", "<init>", "()V", "", "CLICKED", "Ljava/lang/String;", "VIEWED", "SUBMITTED", com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED, "DEFAULT_PAYMENT_APP"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Action {
        public static final java.lang.String CLICKED = "clicked";
        public static final java.lang.String DEFAULT_PAYMENT_APP = "default_payment_app";
        public static final java.lang.String FAILED = "failed";
        public static final com.paypal.oslo.feature.taptopay.api.analytics.TapToPayAnalytics.Action INSTANCE = new com.paypal.oslo.feature.taptopay.api.analytics.TapToPayAnalytics.Action();
        public static final java.lang.String SUBMITTED = "submitted";
        public static final java.lang.String VIEWED = "viewed";

        private Action() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/api/analytics/TapToPayAnalytics$Item;", "", "<init>", "()V", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "CTA", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getCTA", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "SKIP", "getSKIP", "DISMISS", "getDISMISS"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Item {
        public static final com.paypal.oslo.feature.taptopay.api.analytics.TapToPayAnalytics.Item INSTANCE = new com.paypal.oslo.feature.taptopay.api.analytics.TapToPayAnalytics.Item();
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item CTA = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("cta", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item SKIP = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("skip", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item DISMISS = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("dismiss", 0, 2, null);

        private Item() {
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getCTA() {
            return CTA;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getSKIP() {
            return SKIP;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getDISMISS() {
            return DISMISS;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/api/analytics/TapToPayAnalytics$SetupFlowScreen;", "", "<init>", "()V", "", "ID", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SetupFlowScreen {
        public static final java.lang.String ID = "taptopay_setup_flow";
        public static final com.paypal.oslo.feature.taptopay.api.analytics.TapToPayAnalytics.SetupFlowScreen INSTANCE = new com.paypal.oslo.feature.taptopay.api.analytics.TapToPayAnalytics.SetupFlowScreen();

        private SetupFlowScreen() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/api/analytics/TapToPayAnalytics$PayModeRouterScreen;", "", "<init>", "()V", "", "ID", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PayModeRouterScreen {
        public static final java.lang.String ID = "taptopay_paymode_router";
        public static final com.paypal.oslo.feature.taptopay.api.analytics.TapToPayAnalytics.PayModeRouterScreen INSTANCE = new com.paypal.oslo.feature.taptopay.api.analytics.TapToPayAnalytics.PayModeRouterScreen();

        private PayModeRouterScreen() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/api/analytics/TapToPayAnalytics$SetAsDefaultRouterScreen;", "", "<init>", "()V", "", "ID", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SetAsDefaultRouterScreen {
        public static final java.lang.String ID = "taptopay_setasdefault_router";
        public static final com.paypal.oslo.feature.taptopay.api.analytics.TapToPayAnalytics.SetAsDefaultRouterScreen INSTANCE = new com.paypal.oslo.feature.taptopay.api.analytics.TapToPayAnalytics.SetAsDefaultRouterScreen();

        private SetAsDefaultRouterScreen() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/api/analytics/TapToPayAnalytics$ChooseDefaultPaymentScreen;", "", "<init>", "()V", "", "ID", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ChooseDefaultPaymentScreen {
        public static final java.lang.String ID = "set_default_payment_app";
        public static final com.paypal.oslo.feature.taptopay.api.analytics.TapToPayAnalytics.ChooseDefaultPaymentScreen INSTANCE = new com.paypal.oslo.feature.taptopay.api.analytics.TapToPayAnalytics.ChooseDefaultPaymentScreen();

        private ChooseDefaultPaymentScreen() {
        }
    }
}
