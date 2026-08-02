package com.paypal.oslo.feature.moneymovement.domain.search;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000 \u0019*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u0019B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\u0005J\u001b\u0010\n\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R$\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/domain/search/PrefixSearch;", "Lcom/paypal/oslo/feature/moneymovement/domain/search/SearchableItem;", "T", "", "<init>", "()V", "", "clear", "", "items", "indexItems", "(Ljava/util/List;)V", "", "query", com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.Analytics.FEATURE_SEARCH, "(Ljava/lang/String;)Ljava/util/List;", "Lcom/paypal/oslo/feature/moneymovement/domain/search/TrieNode;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/moneymovement/domain/search/TrieNode;", "", "p0", io.ktor.http.ContentDisposition.Parameters.Size, com.visa.cbp.getEncExpo.warmup, "getSize", "()I", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PrefixSearch<T extends com.paypal.oslo.feature.moneymovement.domain.search.SearchableItem> {
    private com.paypal.oslo.feature.moneymovement.domain.search.TrieNode<T> getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.moneymovement.domain.search.TrieNode<>();
    private int size;
    public static final int $stable = 8;
    private static final kotlin.text.Regex getHighSpeedVideoFpsRangesFor = new kotlin.text.Regex("\\s+");

    public final int getSize() {
        return this.size;
    }

    public final void clear() {
        this.getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.moneymovement.domain.search.TrieNode<>();
        this.size = 0;
    }

    public final void indexItems(java.util.List<? extends T> items) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
        this.size += items.size();
        java.util.Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            com.paypal.oslo.feature.moneymovement.domain.search.SearchableItem searchableItem = (com.paypal.oslo.feature.moneymovement.domain.search.SearchableItem) it.next();
            java.util.Iterator<T> it2 = searchableItem.getSearchableFields().iterator();
            while (it2.hasNext()) {
                java.lang.String lowerCase = ((java.lang.String) it2.next()).toLowerCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                java.util.List<java.lang.String> split = getHighSpeedVideoFpsRangesFor.split(lowerCase, 0);
                java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : split) {
                    if (!kotlin.text.StringsKt.isBlank((java.lang.String) obj)) {
                        arrayList.add(obj);
                    }
                }
                for (java.lang.String str : arrayList) {
                    com.paypal.oslo.feature.moneymovement.domain.search.TrieNode<T> trieNode = this.getHighResolutionOutputSizeshNQ4ISI;
                    int length = str.length();
                    for (int i = 0; i < length; i++) {
                        char charAt = str.charAt(i);
                        if (!trieNode.getChildren().containsKey(java.lang.Character.valueOf(charAt))) {
                            trieNode.getChildren().put(java.lang.Character.valueOf(charAt), new com.paypal.oslo.feature.moneymovement.domain.search.TrieNode<>());
                        }
                        trieNode = (com.paypal.oslo.feature.moneymovement.domain.search.TrieNode) kotlin.collections.MapsKt.getValue(trieNode.getChildren(), java.lang.Character.valueOf(charAt));
                        trieNode.getItems().add(searchableItem);
                    }
                }
            }
        }
    }

    public final java.util.List<T> search(java.lang.String query) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(query, "");
        if (kotlin.text.StringsKt.isBlank(query)) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.lang.String lowerCase = query.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return kotlin.sequences.SequencesKt.toList(kotlin.sequences.SequencesKt.distinct(kotlin.sequences.SequencesKt.flatMapIterable(kotlin.sequences.SequencesKt.filter(getHighSpeedVideoFpsRangesFor.splitToSequence(lowerCase, 0), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.moneymovement.domain.search.PrefixSearch$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(com.paypal.oslo.feature.moneymovement.domain.search.PrefixSearch.m15628$r8$lambda$r6pWxqBQKXIeDK0IiwnvK5J5xs((java.lang.String) obj));
            }
        }), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.moneymovement.domain.search.PrefixSearch$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.moneymovement.domain.search.PrefixSearch.m15627$r8$lambda$4NOYmJXsT5e1GOLCzJ3RHjZ9EU(com.paypal.oslo.feature.moneymovement.domain.search.PrefixSearch.this, (java.lang.String) obj);
            }
        })));
    }

    /* renamed from: $r8$lambda$4NOYmJXsT5e1GOLCzJ3R-HjZ9EU, reason: not valid java name */
    public static /* synthetic */ java.lang.Iterable m15627$r8$lambda$4NOYmJXsT5e1GOLCzJ3RHjZ9EU(com.paypal.oslo.feature.moneymovement.domain.search.PrefixSearch prefixSearch, java.lang.String str) {
        java.util.List distinct;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.paypal.oslo.feature.moneymovement.domain.search.TrieNode<T> trieNode = prefixSearch.getHighResolutionOutputSizeshNQ4ISI;
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                distinct = kotlin.collections.CollectionsKt.distinct(trieNode.getItems());
                break;
            }
            trieNode = trieNode.getChildren().get(java.lang.Character.valueOf(str.charAt(i)));
            if (trieNode == null) {
                distinct = kotlin.collections.CollectionsKt.emptyList();
                break;
            }
            i++;
        }
        return distinct;
    }

    /* renamed from: $r8$lambda$r6pWxqBQKXIeDK0Ii-wnvK5J5xs, reason: not valid java name */
    public static /* synthetic */ boolean m15628$r8$lambda$r6pWxqBQKXIeDK0IiwnvK5J5xs(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return !kotlin.text.StringsKt.isBlank(str);
    }
}
