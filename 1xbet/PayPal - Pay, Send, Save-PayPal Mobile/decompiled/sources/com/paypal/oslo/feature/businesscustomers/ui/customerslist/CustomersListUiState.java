package com.paypal.oslo.feature.businesscustomers.ui.customerslist;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ4\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u0006\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u0007\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListUiState;", "", "", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;", "customers", "", "isLoading", "isSearch", "<init>", "(Ljava/util/List;ZZ)V", "component1", "()Ljava/util/List;", "component2", "()Z", "component3", "copy", "(Ljava/util/List;ZZ)Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListUiState;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getCustomers", "Z", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CustomersListUiState {
    private final java.util.List<com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer> customers;
    private final boolean isLoading;
    private final boolean isSearch;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiState.Companion INSTANCE = new com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiState.Companion(null);
    public static final int $stable = 8;
    private static final com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiState Loading = new com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiState(kotlin.collections.CollectionsKt.emptyList(), true, false, 4, null);

    public CustomersListUiState(java.util.List<com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer> list, boolean z, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.customers = list;
        this.isLoading = z;
        this.isSearch = z2;
    }

    public /* synthetic */ CustomersListUiState(java.util.List list, boolean z, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
    }

    public final java.util.List<com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer> getCustomers() {
        return this.customers;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isSearch() {
        return this.isSearch;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListUiState$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListUiState;", "Loading", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListUiState;", "getLoading", "()Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListUiState;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiState getLoading() {
            return com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiState.Loading;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer> list = this.customers;
        boolean z = this.isLoading;
        boolean z2 = this.isSearch;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CustomersListUiState(customers=");
        sb.append(list);
        sb.append(", isLoading=");
        sb.append(z);
        sb.append(", isSearch=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.customers.hashCode() * 31) + java.lang.Boolean.hashCode(this.isLoading)) * 31) + java.lang.Boolean.hashCode(this.isSearch);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiState)) {
            return false;
        }
        com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiState customersListUiState = (com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiState) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.customers, customersListUiState.customers) && this.isLoading == customersListUiState.isLoading && this.isSearch == customersListUiState.isSearch;
    }

    public final com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiState copy(java.util.List<com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer> customers, boolean isLoading, boolean isSearch) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customers, "");
        return new com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiState(customers, isLoading, isSearch);
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsSearch() {
        return this.isSearch;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final java.util.List<com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer> component1() {
        return this.customers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiState copy$default(com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiState customersListUiState, java.util.List list, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = customersListUiState.customers;
        }
        if ((i & 2) != 0) {
            z = customersListUiState.isLoading;
        }
        if ((i & 4) != 0) {
            z2 = customersListUiState.isSearch;
        }
        return customersListUiState.copy(list, z, z2);
    }
}
