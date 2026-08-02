package com.paypal.oslo.feature.businesscustomers.ui.customerslist;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJZ\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b$\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b\u0007\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010\u0018R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b.\u0010\u001aR\u001a\u0010\r\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b/\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomerListScreenUiState;", "", "Lcom/paypal/oslo/feature/businesscustomers/navigation/CustomersPresentationMode;", "presentationMode", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListUiState;", "listUiState", "", "isRefreshing", "displayError", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomerListNotification;", "customerListNotification", "", "emailRecipient", "searchString", "<init>", "(Lcom/paypal/oslo/feature/businesscustomers/navigation/CustomersPresentationMode;Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListUiState;ZZLcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomerListNotification;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/businesscustomers/navigation/CustomersPresentationMode;", "component2", "()Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListUiState;", "component3", "()Z", "component4", "component5", "()Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomerListNotification;", "component6", "()Ljava/lang/String;", "component7", "copy", "(Lcom/paypal/oslo/feature/businesscustomers/navigation/CustomersPresentationMode;Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListUiState;ZZLcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomerListNotification;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomerListScreenUiState;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/businesscustomers/navigation/CustomersPresentationMode;", "getPresentationMode", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListUiState;", "getListUiState", "Z", "getDisplayError", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomerListNotification;", "getCustomerListNotification", "Ljava/lang/String;", "getEmailRecipient", "getSearchString"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CustomerListScreenUiState {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListNotification customerListNotification;
    private final boolean displayError;
    private final java.lang.String emailRecipient;
    private final boolean isRefreshing;
    private final com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiState listUiState;
    private final com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode presentationMode;
    private final java.lang.String searchString;

    public CustomerListScreenUiState(com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode customersPresentationMode, com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiState customersListUiState, boolean z, boolean z2, com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListNotification customerListNotification, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customersPresentationMode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customersListUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.presentationMode = customersPresentationMode;
        this.listUiState = customersListUiState;
        this.isRefreshing = z;
        this.displayError = z2;
        this.customerListNotification = customerListNotification;
        this.emailRecipient = str;
        this.searchString = str2;
    }

    public final com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode getPresentationMode() {
        return this.presentationMode;
    }

    public /* synthetic */ CustomerListScreenUiState(com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode customersPresentationMode, com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiState customersListUiState, boolean z, boolean z2, com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListNotification customerListNotification, java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(customersPresentationMode, (i & 2) != 0 ? com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiState.INSTANCE.getLoading() : customersListUiState, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : customerListNotification, (i & 32) != 0 ? null : str, str2);
    }

    public final com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiState getListUiState() {
        return this.listUiState;
    }

    public final boolean isRefreshing() {
        return this.isRefreshing;
    }

    public final boolean getDisplayError() {
        return this.displayError;
    }

    public final com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListNotification getCustomerListNotification() {
        return this.customerListNotification;
    }

    public final java.lang.String getEmailRecipient() {
        return this.emailRecipient;
    }

    public final java.lang.String getSearchString() {
        return this.searchString;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode customersPresentationMode = this.presentationMode;
        com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiState customersListUiState = this.listUiState;
        boolean z = this.isRefreshing;
        boolean z2 = this.displayError;
        com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListNotification customerListNotification = this.customerListNotification;
        java.lang.String str = this.emailRecipient;
        java.lang.String str2 = this.searchString;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CustomerListScreenUiState(presentationMode=");
        sb.append(customersPresentationMode);
        sb.append(", listUiState=");
        sb.append(customersListUiState);
        sb.append(", isRefreshing=");
        sb.append(z);
        sb.append(", displayError=");
        sb.append(z2);
        sb.append(", customerListNotification=");
        sb.append(customerListNotification);
        sb.append(", emailRecipient=");
        sb.append(str);
        sb.append(", searchString=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.presentationMode.hashCode();
        int hashCode2 = this.listUiState.hashCode();
        int hashCode3 = java.lang.Boolean.hashCode(this.isRefreshing);
        int hashCode4 = java.lang.Boolean.hashCode(this.displayError);
        com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListNotification customerListNotification = this.customerListNotification;
        int hashCode5 = customerListNotification == null ? 0 : customerListNotification.hashCode();
        java.lang.String str = this.emailRecipient;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.searchString.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListScreenUiState)) {
            return false;
        }
        com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListScreenUiState customerListScreenUiState = (com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListScreenUiState) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.presentationMode, customerListScreenUiState.presentationMode) && kotlin.jvm.internal.Intrinsics.areEqual(this.listUiState, customerListScreenUiState.listUiState) && this.isRefreshing == customerListScreenUiState.isRefreshing && this.displayError == customerListScreenUiState.displayError && kotlin.jvm.internal.Intrinsics.areEqual(this.customerListNotification, customerListScreenUiState.customerListNotification) && kotlin.jvm.internal.Intrinsics.areEqual(this.emailRecipient, customerListScreenUiState.emailRecipient) && kotlin.jvm.internal.Intrinsics.areEqual(this.searchString, customerListScreenUiState.searchString);
    }

    public final com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListScreenUiState copy(com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode presentationMode, com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiState listUiState, boolean isRefreshing, boolean displayError, com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListNotification customerListNotification, java.lang.String emailRecipient, java.lang.String searchString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(presentationMode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(searchString, "");
        return new com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListScreenUiState(presentationMode, listUiState, isRefreshing, displayError, customerListNotification, emailRecipient, searchString);
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getSearchString() {
        return this.searchString;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getEmailRecipient() {
        return this.emailRecipient;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListNotification getCustomerListNotification() {
        return this.customerListNotification;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getDisplayError() {
        return this.displayError;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsRefreshing() {
        return this.isRefreshing;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiState getListUiState() {
        return this.listUiState;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode getPresentationMode() {
        return this.presentationMode;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListScreenUiState copy$default(com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListScreenUiState customerListScreenUiState, com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode customersPresentationMode, com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiState customersListUiState, boolean z, boolean z2, com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListNotification customerListNotification, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            customersPresentationMode = customerListScreenUiState.presentationMode;
        }
        if ((i & 2) != 0) {
            customersListUiState = customerListScreenUiState.listUiState;
        }
        com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiState customersListUiState2 = customersListUiState;
        if ((i & 4) != 0) {
            z = customerListScreenUiState.isRefreshing;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = customerListScreenUiState.displayError;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            customerListNotification = customerListScreenUiState.customerListNotification;
        }
        com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListNotification customerListNotification2 = customerListNotification;
        if ((i & 32) != 0) {
            str = customerListScreenUiState.emailRecipient;
        }
        java.lang.String str3 = str;
        if ((i & 64) != 0) {
            str2 = customerListScreenUiState.searchString;
        }
        return customerListScreenUiState.copy(customersPresentationMode, customersListUiState2, z3, z4, customerListNotification2, str3, str2);
    }
}
