package com.paypal.oslo.feature.p2p.ui.currencypicker.state;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0010JT\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b\u0007\u0010\u0014R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b\u000b\u0010\u0014R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b*\u0010\u0010R\u001a\u0010+\u001a\u00020\u00028\u0017X\u0097D¢\u0006\f\n\u0004\b+\u0010#\u001a\u0004\b,\u0010\u0010R\u0011\u0010-\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b-\u0010\u0014R\u0017\u00101\u001a\b\u0012\u0004\u0012\u00020.0\b8G¢\u0006\u0006\u001a\u0004\b/\u00100R\u0011\u00104\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b2\u00103"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/currencypicker/state/CurrencyPickerState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "searchQuery", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyType;", "selectedTab", "", "isCryptoEnabled", "", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyItem;", "currencies", "isLoading", "error", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyType;ZLjava/util/List;ZLjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyType;", "component3", "()Z", "component4", "()Ljava/util/List;", "component5", "component6", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyType;ZLjava/util/List;ZLjava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/currencypicker/state/CurrencyPickerState;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getSearchQuery", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyType;", "getSelectedTab", "Z", "Ljava/util/List;", "getCurrencies", "getError", "name", "getName", "isCrypto", "Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/tabselector/TabItem;", "getTabItems", "(Landroidx/compose/runtime/Composer;I)Ljava/util/List;", "tabItems", "getSearchBarPlaceholder", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "searchBarPlaceholder"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CurrencyPickerState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem> currencies;
    private final java.lang.String error;
    private final boolean isCryptoEnabled;
    private final boolean isLoading;
    private final java.lang.String name;
    private final java.lang.String searchQuery;
    private final com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType selectedTab;

    public CurrencyPickerState(java.lang.String str, com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType currencyType, boolean z, java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem> list, boolean z2, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.searchQuery = str;
        this.selectedTab = currencyType;
        this.isCryptoEnabled = z;
        this.currencies = list;
        this.isLoading = z2;
        this.error = str2;
        this.name = "CurrencyPickerState";
    }

    public /* synthetic */ CurrencyPickerState(java.lang.String str, com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType currencyType, boolean z, java.util.List list, boolean z2, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType.CASH : currencyType, (i & 4) != 0 ? false : z, (i & 8) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 16) == 0 ? z2 : false, (i & 32) != 0 ? null : str2);
    }

    public final java.lang.String getSearchQuery() {
        return this.searchQuery;
    }

    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType getSelectedTab() {
        return this.selectedTab;
    }

    public final boolean isCryptoEnabled() {
        return this.isCryptoEnabled;
    }

    public final java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem> getCurrencies() {
        return this.currencies;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final java.lang.String getError() {
        return this.error;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public final java.lang.String getName() {
        return this.name;
    }

    public final boolean isCrypto() {
        return this.selectedTab == com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType.CRYPTO;
    }

    public final java.util.List<com.paypal.oslo.feature.moneymovement.api.currencypicker.components.tabselector.TabItem> getTabItems(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1857214020, i, -1, "com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyPickerState.<get-tabItems> (CurrencyPickerState.kt:41)");
        }
        java.util.List<com.paypal.oslo.feature.moneymovement.api.currencypicker.components.tabselector.TabItem> listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.moneymovement.api.currencypicker.components.tabselector.TabItem[]{new com.paypal.oslo.feature.moneymovement.api.currencypicker.components.tabselector.TabItem(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.p2p.R.string.feature_p2p_currency_picker_cash_tab_title, composer, 0), null, com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType.CASH, 2, null), new com.paypal.oslo.feature.moneymovement.api.currencypicker.components.tabselector.TabItem(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.p2p.R.string.feature_p2p_currency_picker_crypto_tab_title, composer, 0), null, com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType.CRYPTO, 2, null)});
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return listOf;
    }

    public final java.lang.String getSearchBarPlaceholder(androidx.compose.runtime.Composer composer, int i) {
        java.lang.String stringResource;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1606123541, i, -1, "com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyPickerState.<get-searchBarPlaceholder> (CurrencyPickerState.kt:53)");
        }
        if (isCrypto()) {
            composer.startReplaceGroup(-2090695599);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.p2p.R.string.feature_p2p_currency_picker_crypto_search_placeholder, composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-2090588525);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.p2p.R.string.feature_p2p_currency_picker_cash_search_placeholder, composer, 0);
            composer.endReplaceGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return stringResource;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.searchQuery;
        com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType currencyType = this.selectedTab;
        boolean z = this.isCryptoEnabled;
        java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem> list = this.currencies;
        boolean z2 = this.isLoading;
        java.lang.String str2 = this.error;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CurrencyPickerState(searchQuery=");
        sb.append(str);
        sb.append(", selectedTab=");
        sb.append(currencyType);
        sb.append(", isCryptoEnabled=");
        sb.append(z);
        sb.append(", currencies=");
        sb.append(list);
        sb.append(", isLoading=");
        sb.append(z2);
        sb.append(", error=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.searchQuery.hashCode();
        int hashCode2 = this.selectedTab.hashCode();
        int hashCode3 = java.lang.Boolean.hashCode(this.isCryptoEnabled);
        int hashCode4 = this.currencies.hashCode();
        int hashCode5 = java.lang.Boolean.hashCode(this.isLoading);
        java.lang.String str = this.error;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyPickerState)) {
            return false;
        }
        com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyPickerState currencyPickerState = (com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyPickerState) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.searchQuery, currencyPickerState.searchQuery) && this.selectedTab == currencyPickerState.selectedTab && this.isCryptoEnabled == currencyPickerState.isCryptoEnabled && kotlin.jvm.internal.Intrinsics.areEqual(this.currencies, currencyPickerState.currencies) && this.isLoading == currencyPickerState.isLoading && kotlin.jvm.internal.Intrinsics.areEqual(this.error, currencyPickerState.error);
    }

    public final com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyPickerState copy(java.lang.String searchQuery, com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType selectedTab, boolean isCryptoEnabled, java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem> currencies, boolean isLoading, java.lang.String error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(searchQuery, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedTab, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencies, "");
        return new com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyPickerState(searchQuery, selectedTab, isCryptoEnabled, currencies, isLoading, error);
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getError() {
        return this.error;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem> component4() {
        return this.currencies;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsCryptoEnabled() {
        return this.isCryptoEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType getSelectedTab() {
        return this.selectedTab;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getSearchQuery() {
        return this.searchQuery;
    }

    public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyPickerState copy$default(com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyPickerState currencyPickerState, java.lang.String str, com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType currencyType, boolean z, java.util.List list, boolean z2, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = currencyPickerState.searchQuery;
        }
        if ((i & 2) != 0) {
            currencyType = currencyPickerState.selectedTab;
        }
        com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType currencyType2 = currencyType;
        if ((i & 4) != 0) {
            z = currencyPickerState.isCryptoEnabled;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            list = currencyPickerState.currencies;
        }
        java.util.List list2 = list;
        if ((i & 16) != 0) {
            z2 = currencyPickerState.isLoading;
        }
        boolean z4 = z2;
        if ((i & 32) != 0) {
            str2 = currencyPickerState.error;
        }
        return currencyPickerState.copy(str, currencyType2, z3, list2, z4, str2);
    }

    public CurrencyPickerState() {
        this(null, null, false, null, false, null, 63, null);
    }
}
