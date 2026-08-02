package com.paypal.oslo.feature.businesscustomers.ui.model;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/model/CustomerListItemType;", "", "CustomerItem", "LoadingItem", "Lcom/paypal/oslo/feature/businesscustomers/ui/model/CustomerListItemType$CustomerItem;", "Lcom/paypal/oslo/feature/businesscustomers/ui/model/CustomerListItemType$LoadingItem;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface CustomerListItemType {

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/model/CustomerListItemType$CustomerItem;", "Lcom/paypal/oslo/feature/businesscustomers/ui/model/CustomerListItemType;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CustomerItem implements com.paypal.oslo.feature.businesscustomers.ui.model.CustomerListItemType {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesscustomers.ui.model.CustomerListItemType.CustomerItem INSTANCE = new com.paypal.oslo.feature.businesscustomers.ui.model.CustomerListItemType.CustomerItem();

        private CustomerItem() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/model/CustomerListItemType$LoadingItem;", "Lcom/paypal/oslo/feature/businesscustomers/ui/model/CustomerListItemType;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class LoadingItem implements com.paypal.oslo.feature.businesscustomers.ui.model.CustomerListItemType {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesscustomers.ui.model.CustomerListItemType.LoadingItem INSTANCE = new com.paypal.oslo.feature.businesscustomers.ui.model.CustomerListItemType.LoadingItem();

        private LoadingItem() {
        }
    }
}
