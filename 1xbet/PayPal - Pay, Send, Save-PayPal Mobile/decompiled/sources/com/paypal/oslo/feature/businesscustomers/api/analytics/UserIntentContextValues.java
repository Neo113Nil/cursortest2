package com.paypal.oslo.feature.businesscustomers.api.analytics;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/api/analytics/UserIntentContextValues;", "", "<init>", "()V", "Feature", "Action"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UserIntentContextValues {
    public static final com.paypal.oslo.feature.businesscustomers.api.analytics.UserIntentContextValues INSTANCE = new com.paypal.oslo.feature.businesscustomers.api.analytics.UserIntentContextValues();

    private UserIntentContextValues() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/api/analytics/UserIntentContextValues$Feature;", "", "<init>", "()V", "", "CustomersList", "Ljava/lang/String;", "SaveCustomer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Feature {
        public static final java.lang.String CustomersList = "customers_list";
        public static final com.paypal.oslo.feature.businesscustomers.api.analytics.UserIntentContextValues.Feature INSTANCE = new com.paypal.oslo.feature.businesscustomers.api.analytics.UserIntentContextValues.Feature();
        public static final java.lang.String SaveCustomer = "save_customer";

        private Feature() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/api/analytics/UserIntentContextValues$Action;", "", "<init>", "()V", "", "ViewCustomersList", "Ljava/lang/String;", "AddCustomer", "EditCustomer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Action {
        public static final java.lang.String AddCustomer = "add_customer";
        public static final java.lang.String EditCustomer = "edit_customer";
        public static final com.paypal.oslo.feature.businesscustomers.api.analytics.UserIntentContextValues.Action INSTANCE = new com.paypal.oslo.feature.businesscustomers.api.analytics.UserIntentContextValues.Action();
        public static final java.lang.String ViewCustomersList = "view_customers_list";

        private Action() {
        }
    }
}
