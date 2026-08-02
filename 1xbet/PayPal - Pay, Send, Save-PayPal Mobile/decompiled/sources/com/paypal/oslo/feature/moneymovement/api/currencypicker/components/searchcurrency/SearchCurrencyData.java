package com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b\b\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/searchcurrency/SearchCurrencyData;", "", "", "searchQuery", "searchPlaceholder", "Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/searchcurrency/CurrencyListMode;", "listMode", "", "isLoading", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/searchcurrency/CurrencyListMode;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/searchcurrency/CurrencyListMode;", "component4", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/searchcurrency/CurrencyListMode;Z)Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/searchcurrency/SearchCurrencyData;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getSearchQuery", "getSearchPlaceholder", "Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/searchcurrency/CurrencyListMode;", "getListMode", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SearchCurrencyData {
    public static final int $stable = 0;
    private final boolean isLoading;
    private final com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.CurrencyListMode listMode;
    private final java.lang.String searchPlaceholder;
    private final java.lang.String searchQuery;

    public SearchCurrencyData(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.CurrencyListMode currencyListMode, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyListMode, "");
        this.searchQuery = str;
        this.searchPlaceholder = str2;
        this.listMode = currencyListMode;
        this.isLoading = z;
    }

    public /* synthetic */ SearchCurrencyData(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.CurrencyListMode currencyListMode, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, currencyListMode, (i & 8) != 0 ? false : z);
    }

    public final java.lang.String getSearchQuery() {
        return this.searchQuery;
    }

    public final java.lang.String getSearchPlaceholder() {
        return this.searchPlaceholder;
    }

    public final com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.CurrencyListMode getListMode() {
        return this.listMode;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.searchQuery;
        java.lang.String str2 = this.searchPlaceholder;
        com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.CurrencyListMode currencyListMode = this.listMode;
        boolean z = this.isLoading;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SearchCurrencyData(searchQuery=");
        sb.append(str);
        sb.append(", searchPlaceholder=");
        sb.append(str2);
        sb.append(", listMode=");
        sb.append(currencyListMode);
        sb.append(", isLoading=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.searchQuery.hashCode() * 31) + this.searchPlaceholder.hashCode()) * 31) + this.listMode.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isLoading);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.SearchCurrencyData)) {
            return false;
        }
        com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.SearchCurrencyData searchCurrencyData = (com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.SearchCurrencyData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.searchQuery, searchCurrencyData.searchQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.searchPlaceholder, searchCurrencyData.searchPlaceholder) && kotlin.jvm.internal.Intrinsics.areEqual(this.listMode, searchCurrencyData.listMode) && this.isLoading == searchCurrencyData.isLoading;
    }

    public final com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.SearchCurrencyData copy(java.lang.String searchQuery, java.lang.String searchPlaceholder, com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.CurrencyListMode listMode, boolean isLoading) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(searchQuery, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(searchPlaceholder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listMode, "");
        return new com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.SearchCurrencyData(searchQuery, searchPlaceholder, listMode, isLoading);
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.CurrencyListMode getListMode() {
        return this.listMode;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getSearchPlaceholder() {
        return this.searchPlaceholder;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getSearchQuery() {
        return this.searchQuery;
    }

    public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.SearchCurrencyData copy$default(com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.SearchCurrencyData searchCurrencyData, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.CurrencyListMode currencyListMode, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = searchCurrencyData.searchQuery;
        }
        if ((i & 2) != 0) {
            str2 = searchCurrencyData.searchPlaceholder;
        }
        if ((i & 4) != 0) {
            currencyListMode = searchCurrencyData.listMode;
        }
        if ((i & 8) != 0) {
            z = searchCurrencyData.isLoading;
        }
        return searchCurrencyData.copy(str, str2, currencyListMode, z);
    }
}
