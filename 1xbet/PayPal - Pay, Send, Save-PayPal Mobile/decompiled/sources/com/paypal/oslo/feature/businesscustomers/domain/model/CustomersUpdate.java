package com.paypal.oslo.feature.businesscustomers.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/domain/model/CustomersUpdate;", "", "CustomerAdded", "CustomerEdited", "CustomerRemoved", "Lcom/paypal/oslo/feature/businesscustomers/domain/model/CustomersUpdate$CustomerAdded;", "Lcom/paypal/oslo/feature/businesscustomers/domain/model/CustomersUpdate$CustomerEdited;", "Lcom/paypal/oslo/feature/businesscustomers/domain/model/CustomersUpdate$CustomerRemoved;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface CustomersUpdate {

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/domain/model/CustomersUpdate$CustomerAdded;", "Lcom/paypal/oslo/feature/businesscustomers/domain/model/CustomersUpdate;", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;", "customer", "<init>", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;)V", "component1", "()Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;", "copy", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;)Lcom/paypal/oslo/feature/businesscustomers/domain/model/CustomersUpdate$CustomerAdded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;", "getCustomer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CustomerAdded implements com.paypal.oslo.feature.businesscustomers.domain.model.CustomersUpdate {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer;

        public CustomerAdded(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customer, "");
            this.customer = customer;
        }

        public final com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer getCustomer() {
            return this.customer;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer = this.customer;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CustomerAdded(customer=");
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
            return (other instanceof com.paypal.oslo.feature.businesscustomers.domain.model.CustomersUpdate.CustomerAdded) && kotlin.jvm.internal.Intrinsics.areEqual(this.customer, ((com.paypal.oslo.feature.businesscustomers.domain.model.CustomersUpdate.CustomerAdded) other).customer);
        }

        public final com.paypal.oslo.feature.businesscustomers.domain.model.CustomersUpdate.CustomerAdded copy(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customer, "");
            return new com.paypal.oslo.feature.businesscustomers.domain.model.CustomersUpdate.CustomerAdded(customer);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer getCustomer() {
            return this.customer;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.domain.model.CustomersUpdate.CustomerAdded copy$default(com.paypal.oslo.feature.businesscustomers.domain.model.CustomersUpdate.CustomerAdded customerAdded, com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                customer = customerAdded.customer;
            }
            return customerAdded.copy(customer);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/domain/model/CustomersUpdate$CustomerEdited;", "Lcom/paypal/oslo/feature/businesscustomers/domain/model/CustomersUpdate;", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;", "customer", "", "previousId", "<init>", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;Ljava/lang/String;)Lcom/paypal/oslo/feature/businesscustomers/domain/model/CustomersUpdate$CustomerEdited;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;", "getCustomer", "Ljava/lang/String;", "getPreviousId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CustomerEdited implements com.paypal.oslo.feature.businesscustomers.domain.model.CustomersUpdate {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer;
        private final java.lang.String previousId;

        public CustomerEdited(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.customer = customer;
            this.previousId = str;
        }

        public final com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer getCustomer() {
            return this.customer;
        }

        public final java.lang.String getPreviousId() {
            return this.previousId;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer = this.customer;
            java.lang.String str = this.previousId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CustomerEdited(customer=");
            sb.append(customer);
            sb.append(", previousId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.customer.hashCode() * 31) + this.previousId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesscustomers.domain.model.CustomersUpdate.CustomerEdited)) {
                return false;
            }
            com.paypal.oslo.feature.businesscustomers.domain.model.CustomersUpdate.CustomerEdited customerEdited = (com.paypal.oslo.feature.businesscustomers.domain.model.CustomersUpdate.CustomerEdited) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.customer, customerEdited.customer) && kotlin.jvm.internal.Intrinsics.areEqual(this.previousId, customerEdited.previousId);
        }

        public final com.paypal.oslo.feature.businesscustomers.domain.model.CustomersUpdate.CustomerEdited copy(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer, java.lang.String previousId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(previousId, "");
            return new com.paypal.oslo.feature.businesscustomers.domain.model.CustomersUpdate.CustomerEdited(customer, previousId);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getPreviousId() {
            return this.previousId;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer getCustomer() {
            return this.customer;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.domain.model.CustomersUpdate.CustomerEdited copy$default(com.paypal.oslo.feature.businesscustomers.domain.model.CustomersUpdate.CustomerEdited customerEdited, com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                customer = customerEdited.customer;
            }
            if ((i & 2) != 0) {
                str = customerEdited.previousId;
            }
            return customerEdited.copy(customer, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/domain/model/CustomersUpdate$CustomerRemoved;", "Lcom/paypal/oslo/feature/businesscustomers/domain/model/CustomersUpdate;", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;", "customer", "<init>", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;)V", "component1", "()Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;", "copy", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;)Lcom/paypal/oslo/feature/businesscustomers/domain/model/CustomersUpdate$CustomerRemoved;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;", "getCustomer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CustomerRemoved implements com.paypal.oslo.feature.businesscustomers.domain.model.CustomersUpdate {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer;

        public CustomerRemoved(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customer, "");
            this.customer = customer;
        }

        public final com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer getCustomer() {
            return this.customer;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer = this.customer;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CustomerRemoved(customer=");
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
            return (other instanceof com.paypal.oslo.feature.businesscustomers.domain.model.CustomersUpdate.CustomerRemoved) && kotlin.jvm.internal.Intrinsics.areEqual(this.customer, ((com.paypal.oslo.feature.businesscustomers.domain.model.CustomersUpdate.CustomerRemoved) other).customer);
        }

        public final com.paypal.oslo.feature.businesscustomers.domain.model.CustomersUpdate.CustomerRemoved copy(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customer, "");
            return new com.paypal.oslo.feature.businesscustomers.domain.model.CustomersUpdate.CustomerRemoved(customer);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer getCustomer() {
            return this.customer;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.domain.model.CustomersUpdate.CustomerRemoved copy$default(com.paypal.oslo.feature.businesscustomers.domain.model.CustomersUpdate.CustomerRemoved customerRemoved, com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                customer = customerRemoved.customer;
            }
            return customerRemoved.copy(customer);
        }
    }
}
