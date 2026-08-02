package com.paypal.oslo.feature.moneymovement.ui.currencypicker.model;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007R\u001a\u0010\u0017\u001a\u00020\u00128\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0014R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u001a8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/ui/currencypicker/model/SearchableCurrency;", "Lcom/paypal/oslo/feature/moneymovement/domain/search/SearchableItem;", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyItem;", "item", "<init>", "(Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyItem;)V", "component1", "()Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyItem;", "copy", "(Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyItem;)Lcom/paypal/oslo/feature/moneymovement/ui/currencypicker/model/SearchableCurrency;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyItem;", "getItem", "id", "Ljava/lang/String;", "getId", "", "searchableFields", "Ljava/util/List;", "getSearchableFields", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SearchableCurrency implements com.paypal.oslo.feature.moneymovement.domain.search.SearchableItem {
    public static final int $stable = 8;
    private final java.lang.String id;
    private final com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem item;
    private final java.util.List<java.lang.String> searchableFields;

    public SearchableCurrency(com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem currencyItem) {
        java.lang.String id;
        java.util.List<java.lang.String> listOf;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyItem, "");
        this.item = currencyItem;
        int i = com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.SearchableCurrency.WhenMappings.$EnumSwitchMapping$0[currencyItem.getType().ordinal()];
        if (i == 1) {
            id = currencyItem.requireFiat().getId();
        } else {
            if (i != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            id = currencyItem.requireCrypto().getId();
        }
        this.id = id;
        int i2 = com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.SearchableCurrency.WhenMappings.$EnumSwitchMapping$0[currencyItem.getType().ordinal()];
        if (i2 == 1) {
            com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem.FiatInfo requireFiat = currencyItem.requireFiat();
            listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{requireFiat.getDisplayCurrencyName(), requireFiat.getCurrencyCode()});
        } else {
            if (i2 != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem.CryptoInfo requireCrypto = currencyItem.requireCrypto();
            listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{requireCrypto.getName(), requireCrypto.getCode()});
        }
        this.searchableFields = listOf;
    }

    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem getItem() {
        return this.item;
    }

    @Override // com.paypal.oslo.feature.moneymovement.domain.search.SearchableItem
    public final java.lang.String getId() {
        return this.id;
    }

    @Override // com.paypal.oslo.feature.moneymovement.domain.search.SearchableItem
    public final java.util.List<java.lang.String> getSearchableFields() {
        return this.searchableFields;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem currencyItem = this.item;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SearchableCurrency(item=");
        sb.append(currencyItem);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.item.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.SearchableCurrency) && kotlin.jvm.internal.Intrinsics.areEqual(this.item, ((com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.SearchableCurrency) other).item);
    }

    public final com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.SearchableCurrency copy(com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
        return new com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.SearchableCurrency(item);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType.values().length];
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType.CASH.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType.CRYPTO.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem getItem() {
        return this.item;
    }

    public static /* synthetic */ com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.SearchableCurrency copy$default(com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.SearchableCurrency searchableCurrency, com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem currencyItem, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            currencyItem = searchableCurrency.item;
        }
        return searchableCurrency.copy(currencyItem);
    }
}
