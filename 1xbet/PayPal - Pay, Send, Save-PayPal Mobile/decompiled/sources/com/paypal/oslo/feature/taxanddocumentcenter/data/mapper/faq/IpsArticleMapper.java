package com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.faq;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/data/mapper/faq/IpsArticleMapper;", "", "<init>", "()V", "", "Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/GetTaxReportsAndFaqsQuery$IpsArticle;", "articles", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/FaqItem;", "map", "(Ljava/util/List;)Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class IpsArticleMapper {
    public static final int $stable = 0;

    @javax.inject.Inject
    public IpsArticleMapper() {
    }

    public final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.FaqItem> map(java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsAndFaqsQuery.IpsArticle> articles) {
        if (articles != null) {
            java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsAndFaqsQuery.IpsArticle> list = articles;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            for (com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsAndFaqsQuery.IpsArticle ipsArticle : list) {
                arrayList.add(new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.FaqItem(ipsArticle.getId(), ipsArticle.getTitle(), ipsArticle.getRank()));
            }
            java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.FaqItem> sortedWith = kotlin.collections.CollectionsKt.sortedWith(arrayList, new java.util.Comparator() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.faq.IpsArticleMapper$map$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.FaqItem) t).getRank()), java.lang.Integer.valueOf(((com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.FaqItem) t2).getRank()));
                }
            });
            if (sortedWith != null) {
                return sortedWith;
            }
        }
        return kotlin.collections.CollectionsKt.emptyList();
    }
}
