package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011JB\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u0003\u0010\rR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b!\u0010\u0011R\u0011\u0010#\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\"\u0010\rR\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048G¢\u0006\u0006\u001a\u0004\b$\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/items/SelectItemsUiState;", "", "", "isLoading", "", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/LineItem;", "items", "", "error", "currencyCode", "<init>", "(ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Z", "component2", "()Ljava/util/List;", "component3", "()Ljava/lang/String;", "component4", "copy", "(ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/items/SelectItemsUiState;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Z", "Ljava/util/List;", "getItems", "Ljava/lang/String;", "getError", "getCurrencyCode", "getHasItems", "hasItems", "getSelectedItems", "selectedItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SelectItemsUiState {
    public static final int $stable = 8;
    private final java.lang.String currencyCode;
    private final java.lang.String error;
    private final boolean isLoading;
    private final java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem> items;

    public SelectItemsUiState(boolean z, java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem> list, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.isLoading = z;
        this.items = list;
        this.error = str;
        this.currencyCode = str2;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public /* synthetic */ SelectItemsUiState(boolean z, java.util.List list, java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }

    public final java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem> getItems() {
        return this.items;
    }

    public final java.lang.String getError() {
        return this.error;
    }

    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    public final boolean getHasItems() {
        return !this.items.isEmpty();
    }

    public final java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem> getSelectedItems() {
        java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem> list = this.items;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem) obj).getQuantity().compareTo(java.math.BigDecimal.ZERO) > 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final java.lang.String toString() {
        boolean z = this.isLoading;
        java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem> list = this.items;
        java.lang.String str = this.error;
        java.lang.String str2 = this.currencyCode;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SelectItemsUiState(isLoading=");
        sb.append(z);
        sb.append(", items=");
        sb.append(list);
        sb.append(", error=");
        sb.append(str);
        sb.append(", currencyCode=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.isLoading);
        int hashCode2 = this.items.hashCode();
        java.lang.String str = this.error;
        int hashCode3 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.currencyCode;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsUiState)) {
            return false;
        }
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsUiState selectItemsUiState = (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsUiState) other;
        return this.isLoading == selectItemsUiState.isLoading && kotlin.jvm.internal.Intrinsics.areEqual(this.items, selectItemsUiState.items) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, selectItemsUiState.error) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, selectItemsUiState.currencyCode);
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsUiState copy(boolean isLoading, java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem> items, java.lang.String error, java.lang.String currencyCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
        return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsUiState(isLoading, items, error, currencyCode);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getError() {
        return this.error;
    }

    public final java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem> component2() {
        return this.items;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsUiState copy$default(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsUiState selectItemsUiState, boolean z, java.util.List list, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = selectItemsUiState.isLoading;
        }
        if ((i & 2) != 0) {
            list = selectItemsUiState.items;
        }
        if ((i & 4) != 0) {
            str = selectItemsUiState.error;
        }
        if ((i & 8) != 0) {
            str2 = selectItemsUiState.currencyCode;
        }
        return selectItemsUiState.copy(z, list, str, str2);
    }

    public SelectItemsUiState() {
        this(false, null, null, null, 15, null);
    }
}
