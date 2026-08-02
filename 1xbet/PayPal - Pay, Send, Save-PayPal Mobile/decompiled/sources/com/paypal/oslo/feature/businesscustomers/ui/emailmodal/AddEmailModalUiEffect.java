package com.paypal.oslo.feature.businesscustomers.ui.emailmodal;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/emailmodal/AddEmailModalUiEffect;", "", "NavigateBack", "Lcom/paypal/oslo/feature/businesscustomers/ui/emailmodal/AddEmailModalUiEffect$NavigateBack;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface AddEmailModalUiEffect {

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/emailmodal/AddEmailModalUiEffect$NavigateBack;", "Lcom/paypal/oslo/feature/businesscustomers/ui/emailmodal/AddEmailModalUiEffect;", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;", "customer", "<init>", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;)V", "component1", "()Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;", "copy", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;)Lcom/paypal/oslo/feature/businesscustomers/ui/emailmodal/AddEmailModalUiEffect$NavigateBack;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;", "getCustomer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack implements com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalUiEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer;

        public NavigateBack(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customer, "");
            this.customer = customer;
        }

        public final com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer getCustomer() {
            return this.customer;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer = this.customer;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateBack(customer=");
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
            return (other instanceof com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalUiEffect.NavigateBack) && kotlin.jvm.internal.Intrinsics.areEqual(this.customer, ((com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalUiEffect.NavigateBack) other).customer);
        }

        public final com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalUiEffect.NavigateBack copy(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customer, "");
            return new com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalUiEffect.NavigateBack(customer);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer getCustomer() {
            return this.customer;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalUiEffect.NavigateBack copy$default(com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalUiEffect.NavigateBack navigateBack, com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                customer = navigateBack.customer;
            }
            return navigateBack.copy(customer);
        }
    }
}
