package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.analytics;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/analytics/UserIntentContextValues;", "", "<init>", "()V", "Feature", "Action"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UserIntentContextValues {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.analytics.UserIntentContextValues INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.analytics.UserIntentContextValues();

    private UserIntentContextValues() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/analytics/UserIntentContextValues$Feature;", "", "<init>", "()V", "", "Invoicing", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Feature {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.analytics.UserIntentContextValues.Feature INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.analytics.UserIntentContextValues.Feature();
        public static final java.lang.String Invoicing = "invoicing";

        private Feature() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/analytics/UserIntentContextValues$Action;", "", "<init>", "()V", "", "InvoiceSent", "Ljava/lang/String;", "LinkShared"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Action {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.analytics.UserIntentContextValues.Action INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.analytics.UserIntentContextValues.Action();
        public static final java.lang.String InvoiceSent = "invoice_sent";
        public static final java.lang.String LinkShared = "link_shared";

        private Action() {
        }
    }
}
