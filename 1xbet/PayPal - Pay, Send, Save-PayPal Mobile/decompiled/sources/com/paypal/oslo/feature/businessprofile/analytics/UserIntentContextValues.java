package com.paypal.oslo.feature.businessprofile.analytics;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businessprofile/analytics/UserIntentContextValues;", "", "<init>", "()V", "Product", "Feature", "Action"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UserIntentContextValues {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.businessprofile.analytics.UserIntentContextValues INSTANCE = new com.paypal.oslo.feature.businessprofile.analytics.UserIntentContextValues();

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/businessprofile/analytics/UserIntentContextValues$Product;", "", "<init>", "()V", "", "BusinessProfile", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Product {
        public static final int $stable = 0;
        public static final java.lang.String BusinessProfile = "business_profile";
        public static final com.paypal.oslo.feature.businessprofile.analytics.UserIntentContextValues.Product INSTANCE = new com.paypal.oslo.feature.businessprofile.analytics.UserIntentContextValues.Product();

        private Product() {
        }
    }

    private UserIntentContextValues() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/businessprofile/analytics/UserIntentContextValues$Feature;", "", "<init>", "()V", "", "BusinessTools", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Feature {
        public static final int $stable = 0;
        public static final java.lang.String BusinessTools = "business_tools";
        public static final com.paypal.oslo.feature.businessprofile.analytics.UserIntentContextValues.Feature INSTANCE = new com.paypal.oslo.feature.businessprofile.analytics.UserIntentContextValues.Feature();

        private Feature() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/businessprofile/analytics/UserIntentContextValues$Action;", "", "<init>", "()V", "", "ViewBusiness", "Ljava/lang/String;", "ViewBusinessProfile", "ViewCustomers", "ViewItemList", "ViewSalesTax", "ViewInquiries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Action {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businessprofile.analytics.UserIntentContextValues.Action INSTANCE = new com.paypal.oslo.feature.businessprofile.analytics.UserIntentContextValues.Action();
        public static final java.lang.String ViewBusiness = "view_business";
        public static final java.lang.String ViewBusinessProfile = "view_business_profile";
        public static final java.lang.String ViewCustomers = "view_customers";
        public static final java.lang.String ViewInquiries = "view_inquiries";
        public static final java.lang.String ViewItemList = "view_item_list";
        public static final java.lang.String ViewSalesTax = "view_sales_tax";

        private Action() {
        }
    }
}
