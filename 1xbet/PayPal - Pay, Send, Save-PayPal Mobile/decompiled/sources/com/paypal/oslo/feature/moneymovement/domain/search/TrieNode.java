package com.paypal.oslo.feature.moneymovement.domain.search;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005R)\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u00068\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/domain/search/TrieNode;", "Lcom/paypal/oslo/feature/moneymovement/domain/search/SearchableItem;", "T", "", "<init>", "()V", "", "", "children", "Ljava/util/Map;", "getChildren", "()Ljava/util/Map;", "", "items", "Ljava/util/List;", "getItems", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TrieNode<T extends com.paypal.oslo.feature.moneymovement.domain.search.SearchableItem> {
    public static final int $stable = 8;
    private final java.util.Map<java.lang.Character, com.paypal.oslo.feature.moneymovement.domain.search.TrieNode<T>> children = new java.util.LinkedHashMap();
    private final java.util.List<T> items = new java.util.ArrayList();

    public final java.util.Map<java.lang.Character, com.paypal.oslo.feature.moneymovement.domain.search.TrieNode<T>> getChildren() {
        return this.children;
    }

    public final java.util.List<T> getItems() {
        return this.items;
    }
}
