package com.paypal.oslo.feature.businesscustomers.ui.emailmodal;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b#\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/emailmodal/AddEmailModalState;", "", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;", "customer", "Lcom/paypal/oslo/feature/businesscustomers/navigation/CustomersPresentationMode;", "presentationMode", "", "updateInProgress", "invalidEmail", "<init>", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;Lcom/paypal/oslo/feature/businesscustomers/navigation/CustomersPresentationMode;ZZ)V", "component1", "()Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;", "component2", "()Lcom/paypal/oslo/feature/businesscustomers/navigation/CustomersPresentationMode;", "component3", "()Z", "component4", "copy", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;Lcom/paypal/oslo/feature/businesscustomers/navigation/CustomersPresentationMode;ZZ)Lcom/paypal/oslo/feature/businesscustomers/ui/emailmodal/AddEmailModalState;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;", "getCustomer", "Lcom/paypal/oslo/feature/businesscustomers/navigation/CustomersPresentationMode;", "getPresentationMode", "Z", "getUpdateInProgress", "getInvalidEmail"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AddEmailModalState {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer;
    private final boolean invalidEmail;
    private final com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode presentationMode;
    private final boolean updateInProgress;

    public AddEmailModalState(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer, com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode customersPresentationMode, boolean z, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customersPresentationMode, "");
        this.customer = customer;
        this.presentationMode = customersPresentationMode;
        this.updateInProgress = z;
        this.invalidEmail = z2;
    }

    public /* synthetic */ AddEmailModalState(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer, com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode customersPresentationMode, boolean z, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(customer, customersPresentationMode, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
    }

    public final com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer getCustomer() {
        return this.customer;
    }

    public final com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode getPresentationMode() {
        return this.presentationMode;
    }

    public final boolean getUpdateInProgress() {
        return this.updateInProgress;
    }

    public final boolean getInvalidEmail() {
        return this.invalidEmail;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer = this.customer;
        com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode customersPresentationMode = this.presentationMode;
        boolean z = this.updateInProgress;
        boolean z2 = this.invalidEmail;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AddEmailModalState(customer=");
        sb.append(customer);
        sb.append(", presentationMode=");
        sb.append(customersPresentationMode);
        sb.append(", updateInProgress=");
        sb.append(z);
        sb.append(", invalidEmail=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.customer.hashCode() * 31) + this.presentationMode.hashCode()) * 31) + java.lang.Boolean.hashCode(this.updateInProgress)) * 31) + java.lang.Boolean.hashCode(this.invalidEmail);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalState)) {
            return false;
        }
        com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalState addEmailModalState = (com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalState) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.customer, addEmailModalState.customer) && kotlin.jvm.internal.Intrinsics.areEqual(this.presentationMode, addEmailModalState.presentationMode) && this.updateInProgress == addEmailModalState.updateInProgress && this.invalidEmail == addEmailModalState.invalidEmail;
    }

    public final com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalState copy(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer, com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode presentationMode, boolean updateInProgress, boolean invalidEmail) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(presentationMode, "");
        return new com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalState(customer, presentationMode, updateInProgress, invalidEmail);
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getInvalidEmail() {
        return this.invalidEmail;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getUpdateInProgress() {
        return this.updateInProgress;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode getPresentationMode() {
        return this.presentationMode;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer getCustomer() {
        return this.customer;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalState copy$default(com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalState addEmailModalState, com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer, com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode customersPresentationMode, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            customer = addEmailModalState.customer;
        }
        if ((i & 2) != 0) {
            customersPresentationMode = addEmailModalState.presentationMode;
        }
        if ((i & 4) != 0) {
            z = addEmailModalState.updateInProgress;
        }
        if ((i & 8) != 0) {
            z2 = addEmailModalState.invalidEmail;
        }
        return addEmailModalState.copy(customer, customersPresentationMode, z, z2);
    }
}
