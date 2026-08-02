package com.paypal.oslo.feature.businesscustomers.ui.customerslist;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListUiEffect;", "", "OpenCustomerProfile", "OpenAddCustomer", "SubmitCustomerResult", "SubmitEmailResult", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListUiEffect$OpenAddCustomer;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListUiEffect$OpenCustomerProfile;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListUiEffect$SubmitCustomerResult;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListUiEffect$SubmitEmailResult;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface CustomersListUiEffect {

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListUiEffect$OpenCustomerProfile;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListUiEffect;", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;", "customer", "<init>", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;)V", "component1", "()Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;", "copy", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;)Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListUiEffect$OpenCustomerProfile;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;", "getCustomer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OpenCustomerProfile implements com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer;

        public OpenCustomerProfile(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customer, "");
            this.customer = customer;
        }

        public final com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer getCustomer() {
            return this.customer;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer = this.customer;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OpenCustomerProfile(customer=");
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
            return (other instanceof com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiEffect.OpenCustomerProfile) && kotlin.jvm.internal.Intrinsics.areEqual(this.customer, ((com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiEffect.OpenCustomerProfile) other).customer);
        }

        public final com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiEffect.OpenCustomerProfile copy(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customer, "");
            return new com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiEffect.OpenCustomerProfile(customer);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer getCustomer() {
            return this.customer;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiEffect.OpenCustomerProfile copy$default(com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiEffect.OpenCustomerProfile openCustomerProfile, com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                customer = openCustomerProfile.customer;
            }
            return openCustomerProfile.copy(customer);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListUiEffect$OpenAddCustomer;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OpenAddCustomer implements com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiEffect.OpenAddCustomer INSTANCE = new com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiEffect.OpenAddCustomer();

        public final int hashCode() {
            return 44073684;
        }

        private OpenAddCustomer() {
        }

        public final java.lang.String toString() {
            return "OpenAddCustomer";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiEffect.OpenAddCustomer)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListUiEffect$SubmitCustomerResult;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListUiEffect;", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;", "customer", "<init>", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;)V", "component1", "()Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;", "copy", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;)Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListUiEffect$SubmitCustomerResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;", "getCustomer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SubmitCustomerResult implements com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer;

        public SubmitCustomerResult(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customer, "");
            this.customer = customer;
        }

        public final com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer getCustomer() {
            return this.customer;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer = this.customer;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SubmitCustomerResult(customer=");
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
            return (other instanceof com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiEffect.SubmitCustomerResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.customer, ((com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiEffect.SubmitCustomerResult) other).customer);
        }

        public final com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiEffect.SubmitCustomerResult copy(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customer, "");
            return new com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiEffect.SubmitCustomerResult(customer);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer getCustomer() {
            return this.customer;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiEffect.SubmitCustomerResult copy$default(com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiEffect.SubmitCustomerResult submitCustomerResult, com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                customer = submitCustomerResult.customer;
            }
            return submitCustomerResult.copy(customer);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListUiEffect$SubmitEmailResult;", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListUiEffect;", "", "email", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListUiEffect$SubmitEmailResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getEmail"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SubmitEmailResult implements com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiEffect {
        public static final int $stable = 0;
        private final java.lang.String email;

        public SubmitEmailResult(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.email = str;
        }

        public final java.lang.String getEmail() {
            return this.email;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.email;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SubmitEmailResult(email=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.email.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiEffect.SubmitEmailResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.email, ((com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiEffect.SubmitEmailResult) other).email);
        }

        public final com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiEffect.SubmitEmailResult copy(java.lang.String email) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "");
            return new com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiEffect.SubmitEmailResult(email);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getEmail() {
            return this.email;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiEffect.SubmitEmailResult copy$default(com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiEffect.SubmitEmailResult submitEmailResult, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = submitEmailResult.email;
            }
            return submitEmailResult.copy(str);
        }
    }
}
