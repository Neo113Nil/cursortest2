package com.paypal.oslo.feature.businessinventory.api.analytics;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/api/analytics/UserIntentContextValues;", "", "<init>", "()V", "Feature", "Action"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UserIntentContextValues {
    public static final com.paypal.oslo.feature.businessinventory.api.analytics.UserIntentContextValues INSTANCE = new com.paypal.oslo.feature.businessinventory.api.analytics.UserIntentContextValues();

    private UserIntentContextValues() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/api/analytics/UserIntentContextValues$Feature;", "", "<init>", "()V", "", "ItemList", "Ljava/lang/String;", "TaxList"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Feature {
        public static final com.paypal.oslo.feature.businessinventory.api.analytics.UserIntentContextValues.Feature INSTANCE = new com.paypal.oslo.feature.businessinventory.api.analytics.UserIntentContextValues.Feature();
        public static final java.lang.String ItemList = "item_list";
        public static final java.lang.String TaxList = "tax_list";

        private Feature() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/api/analytics/UserIntentContextValues$Action;", "", "<init>", "()V", "", "ViewItemList", "Ljava/lang/String;", "AddProduct", "EditProduct", "AddService", "EditService", "ViewTaxList", "AddTax", "EditTax"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Action {
        public static final java.lang.String AddProduct = "add_product";
        public static final java.lang.String AddService = "add_service";
        public static final java.lang.String AddTax = "add_tax";
        public static final java.lang.String EditProduct = "edit_product";
        public static final java.lang.String EditService = "edit_service";
        public static final java.lang.String EditTax = "edit_tax";
        public static final com.paypal.oslo.feature.businessinventory.api.analytics.UserIntentContextValues.Action INSTANCE = new com.paypal.oslo.feature.businessinventory.api.analytics.UserIntentContextValues.Action();
        public static final java.lang.String ViewItemList = "view_item_list";
        public static final java.lang.String ViewTaxList = "view_tax_list";

        private Action() {
        }
    }
}
