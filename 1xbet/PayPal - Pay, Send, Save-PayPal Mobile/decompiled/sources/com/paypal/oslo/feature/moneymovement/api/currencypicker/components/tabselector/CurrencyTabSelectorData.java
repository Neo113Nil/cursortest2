package com.paypal.oslo.feature.moneymovement.api.currencypicker.components.tabselector;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/tabselector/CurrencyTabSelectorData;", "", "", "Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/tabselector/TabItem;", "tabs", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyType;", "selectedTab", "<init>", "(Ljava/util/List;Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyType;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyType;", "copy", "(Ljava/util/List;Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyType;)Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/tabselector/CurrencyTabSelectorData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getTabs", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyType;", "getSelectedTab"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CurrencyTabSelectorData {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType selectedTab;
    private final java.util.List<com.paypal.oslo.feature.moneymovement.api.currencypicker.components.tabselector.TabItem> tabs;

    public CurrencyTabSelectorData(java.util.List<com.paypal.oslo.feature.moneymovement.api.currencypicker.components.tabselector.TabItem> list, com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType currencyType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyType, "");
        this.tabs = list;
        this.selectedTab = currencyType;
    }

    public final java.util.List<com.paypal.oslo.feature.moneymovement.api.currencypicker.components.tabselector.TabItem> getTabs() {
        return this.tabs;
    }

    public /* synthetic */ CurrencyTabSelectorData(java.util.List list, com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType currencyType, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType.CASH : currencyType);
    }

    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType getSelectedTab() {
        return this.selectedTab;
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.moneymovement.api.currencypicker.components.tabselector.TabItem> list = this.tabs;
        com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType currencyType = this.selectedTab;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CurrencyTabSelectorData(tabs=");
        sb.append(list);
        sb.append(", selectedTab=");
        sb.append(currencyType);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.tabs.hashCode() * 31) + this.selectedTab.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.currencypicker.components.tabselector.CurrencyTabSelectorData)) {
            return false;
        }
        com.paypal.oslo.feature.moneymovement.api.currencypicker.components.tabselector.CurrencyTabSelectorData currencyTabSelectorData = (com.paypal.oslo.feature.moneymovement.api.currencypicker.components.tabselector.CurrencyTabSelectorData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.tabs, currencyTabSelectorData.tabs) && this.selectedTab == currencyTabSelectorData.selectedTab;
    }

    public final com.paypal.oslo.feature.moneymovement.api.currencypicker.components.tabselector.CurrencyTabSelectorData copy(java.util.List<com.paypal.oslo.feature.moneymovement.api.currencypicker.components.tabselector.TabItem> tabs, com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType selectedTab) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tabs, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedTab, "");
        return new com.paypal.oslo.feature.moneymovement.api.currencypicker.components.tabselector.CurrencyTabSelectorData(tabs, selectedTab);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType getSelectedTab() {
        return this.selectedTab;
    }

    public final java.util.List<com.paypal.oslo.feature.moneymovement.api.currencypicker.components.tabselector.TabItem> component1() {
        return this.tabs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.currencypicker.components.tabselector.CurrencyTabSelectorData copy$default(com.paypal.oslo.feature.moneymovement.api.currencypicker.components.tabselector.CurrencyTabSelectorData currencyTabSelectorData, java.util.List list, com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType currencyType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = currencyTabSelectorData.tabs;
        }
        if ((i & 2) != 0) {
            currencyType = currencyTabSelectorData.selectedTab;
        }
        return currencyTabSelectorData.copy(list, currencyType);
    }
}
