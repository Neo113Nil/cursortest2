package com.paypal.oslo.feature.businesscustomers.ui.customerslist;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListEvent;", "", com.google.common.net.HttpHeaders.REFRESH, "EndOfListReached", "AddCustomerClick", com.paypal.oslo.feature.pools.constants.PoolsConstants.IntentNames.INTENT_DISMISS_ERROR, "DismissToast", "CustomerSelected", "CustomerInfoClicked", "SearchQueryChanged", "EmailRecipientSelected", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListEvent$AddCustomerClick;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListEvent$CustomerInfoClicked;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListEvent$CustomerSelected;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListEvent$DismissError;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListEvent$DismissToast;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListEvent$EmailRecipientSelected;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListEvent$EndOfListReached;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListEvent$Refresh;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListEvent$SearchQueryChanged;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface CustomersListEvent {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListEvent$Refresh;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Refresh implements com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.Refresh INSTANCE = new com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.Refresh();

        public final int hashCode() {
            return -561830465;
        }

        private Refresh() {
        }

        public final java.lang.String toString() {
            return com.google.common.net.HttpHeaders.REFRESH;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.Refresh)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListEvent$EndOfListReached;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EndOfListReached implements com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.EndOfListReached INSTANCE = new com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.EndOfListReached();

        public final int hashCode() {
            return -1758274306;
        }

        private EndOfListReached() {
        }

        public final java.lang.String toString() {
            return "EndOfListReached";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.EndOfListReached)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListEvent$AddCustomerClick;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddCustomerClick implements com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.AddCustomerClick INSTANCE = new com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.AddCustomerClick();

        public final int hashCode() {
            return -620395835;
        }

        private AddCustomerClick() {
        }

        public final java.lang.String toString() {
            return "AddCustomerClick";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.AddCustomerClick)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListEvent$DismissError;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissError implements com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.DismissError INSTANCE = new com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.DismissError();

        public final int hashCode() {
            return 1160106298;
        }

        private DismissError() {
        }

        public final java.lang.String toString() {
            return com.paypal.oslo.feature.pools.constants.PoolsConstants.IntentNames.INTENT_DISMISS_ERROR;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.DismissError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListEvent$DismissToast;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissToast implements com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.DismissToast INSTANCE = new com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.DismissToast();

        public final int hashCode() {
            return 1173853529;
        }

        private DismissToast() {
        }

        public final java.lang.String toString() {
            return "DismissToast";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.DismissToast)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListEvent$CustomerSelected;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListEvent;", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;", "customer", "<init>", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;)V", "component1", "()Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;", "copy", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;)Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListEvent$CustomerSelected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;", "getCustomer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CustomerSelected implements com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer;

        public CustomerSelected(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customer, "");
            this.customer = customer;
        }

        public final com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer getCustomer() {
            return this.customer;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer = this.customer;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CustomerSelected(customer=");
            sb.append(customer);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.customer.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.CustomerSelected) && kotlin.jvm.internal.Intrinsics.areEqual(this.customer, ((com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.CustomerSelected) other).customer);
        }

        public final com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.CustomerSelected copy(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customer, "");
            return new com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.CustomerSelected(customer);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer getCustomer() {
            return this.customer;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.CustomerSelected copy$default(com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.CustomerSelected customerSelected, com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                customer = customerSelected.customer;
            }
            return customerSelected.copy(customer);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListEvent$CustomerInfoClicked;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListEvent;", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;", "customer", "<init>", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;)V", "component1", "()Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;", "copy", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;)Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListEvent$CustomerInfoClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;", "getCustomer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CustomerInfoClicked implements com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer;

        public CustomerInfoClicked(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customer, "");
            this.customer = customer;
        }

        public final com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer getCustomer() {
            return this.customer;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer = this.customer;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CustomerInfoClicked(customer=");
            sb.append(customer);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.customer.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.CustomerInfoClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.customer, ((com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.CustomerInfoClicked) other).customer);
        }

        public final com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.CustomerInfoClicked copy(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customer, "");
            return new com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.CustomerInfoClicked(customer);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer getCustomer() {
            return this.customer;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.CustomerInfoClicked copy$default(com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.CustomerInfoClicked customerInfoClicked, com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                customer = customerInfoClicked.customer;
            }
            return customerInfoClicked.copy(customer);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListEvent$SearchQueryChanged;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListEvent;", "", "query", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListEvent$SearchQueryChanged;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getQuery"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SearchQueryChanged implements com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent {
        public static final int $stable = 0;
        private final java.lang.String query;

        public SearchQueryChanged(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.query = str;
        }

        public final java.lang.String getQuery() {
            return this.query;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.query;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SearchQueryChanged(query=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.query.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.SearchQueryChanged) && kotlin.jvm.internal.Intrinsics.areEqual(this.query, ((com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.SearchQueryChanged) other).query);
        }

        public final com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.SearchQueryChanged copy(java.lang.String query) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(query, "");
            return new com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.SearchQueryChanged(query);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getQuery() {
            return this.query;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.SearchQueryChanged copy$default(com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.SearchQueryChanged searchQueryChanged, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = searchQueryChanged.query;
            }
            return searchQueryChanged.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListEvent$EmailRecipientSelected;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EmailRecipientSelected implements com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.EmailRecipientSelected INSTANCE = new com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.EmailRecipientSelected();

        public final int hashCode() {
            return -2065135564;
        }

        private EmailRecipientSelected() {
        }

        public final java.lang.String toString() {
            return "EmailRecipientSelected";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.EmailRecipientSelected)) {
                return false;
            }
            return true;
        }
    }
}
