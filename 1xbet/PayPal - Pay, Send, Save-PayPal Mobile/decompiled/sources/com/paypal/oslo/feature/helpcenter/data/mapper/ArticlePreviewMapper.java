package com.paypal.oslo.feature.helpcenter.data.mapper;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b*\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\r\u001a\u00020\f*\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\b*\b\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0004\b\u000f\u0010\nJ\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\b*\b\u0012\u0004\u0012\u00020\u00100\b¢\u0006\u0004\b\u0014\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/data/mapper/ArticlePreviewMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/helpcenter/graphql/GetHelpCenterIpsArticlesQuery$Item;", "Lcom/paypal/oslo/feature/helpcenter/domain/models/IpsArticleData;", "toIpsArticleData", "(Lcom/paypal/oslo/feature/helpcenter/graphql/GetHelpCenterIpsArticlesQuery$Item;)Lcom/paypal/oslo/feature/helpcenter/domain/models/IpsArticleData;", "", "toIpsArticleDataList", "(Ljava/util/List;)Ljava/util/List;", "Lcom/paypal/oslo/feature/helpcenter/graphql/SearchHelpCenterArticlesQuery$Item;", "Lcom/paypal/oslo/feature/helpcenter/domain/models/SearchArticleData;", "toSearchArticleData", "(Lcom/paypal/oslo/feature/helpcenter/graphql/SearchHelpCenterArticlesQuery$Item;)Lcom/paypal/oslo/feature/helpcenter/domain/models/SearchArticleData;", "toSearchArticleDataList", "Lcom/paypal/oslo/feature/helpcenter/graphql/GetHelpCenterRecommendedArticlesQuery$Item;", "Lcom/paypal/oslo/feature/helpcenter/domain/models/RecommendedArticleData;", "toRecommendedArticleData", "(Lcom/paypal/oslo/feature/helpcenter/graphql/GetHelpCenterRecommendedArticlesQuery$Item;)Lcom/paypal/oslo/feature/helpcenter/domain/models/RecommendedArticleData;", "toRecommendedArticleDataList"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ArticlePreviewMapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.helpcenter.data.mapper.ArticlePreviewMapper INSTANCE = new com.paypal.oslo.feature.helpcenter.data.mapper.ArticlePreviewMapper();

    private ArticlePreviewMapper() {
    }

    public final com.paypal.oslo.feature.helpcenter.domain.models.IpsArticleData toIpsArticleData(com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterIpsArticlesQuery.Item item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
        java.lang.String id = item.getId();
        java.lang.String title = item.getTitle();
        java.lang.String excerpt = item.getExcerpt();
        com.paypal.oslo.api.graphql.schema.type.HelpContentCategory contentCategory = item.getContentCategory();
        return new com.paypal.oslo.feature.helpcenter.domain.models.IpsArticleData(new com.paypal.oslo.feature.helpcenter.domain.models.ArticlePreview(id, title, excerpt, contentCategory != null ? contentCategory.name() : null));
    }

    public final java.util.List<com.paypal.oslo.feature.helpcenter.domain.models.IpsArticleData> toIpsArticleDataList(java.util.List<com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterIpsArticlesQuery.Item> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.List<com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterIpsArticlesQuery.Item> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(INSTANCE.toIpsArticleData((com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterIpsArticlesQuery.Item) it.next()));
        }
        return arrayList;
    }

    public final com.paypal.oslo.feature.helpcenter.domain.models.SearchArticleData toSearchArticleData(com.paypal.oslo.feature.helpcenter.graphql.SearchHelpCenterArticlesQuery.Item item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
        java.lang.String id = item.getId();
        java.lang.String title = item.getTitle();
        java.lang.String excerpt = item.getExcerpt();
        com.paypal.oslo.api.graphql.schema.type.HelpContentCategory contentCategory = item.getContentCategory();
        return new com.paypal.oslo.feature.helpcenter.domain.models.SearchArticleData(new com.paypal.oslo.feature.helpcenter.domain.models.ArticlePreview(id, title, excerpt, contentCategory != null ? contentCategory.name() : null));
    }

    public final java.util.List<com.paypal.oslo.feature.helpcenter.domain.models.SearchArticleData> toSearchArticleDataList(java.util.List<com.paypal.oslo.feature.helpcenter.graphql.SearchHelpCenterArticlesQuery.Item> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.List<com.paypal.oslo.feature.helpcenter.graphql.SearchHelpCenterArticlesQuery.Item> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(INSTANCE.toSearchArticleData((com.paypal.oslo.feature.helpcenter.graphql.SearchHelpCenterArticlesQuery.Item) it.next()));
        }
        return arrayList;
    }

    public final com.paypal.oslo.feature.helpcenter.domain.models.RecommendedArticleData toRecommendedArticleData(com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterRecommendedArticlesQuery.Item item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
        java.lang.String id = item.getId();
        java.lang.String title = item.getTitle();
        java.lang.String excerpt = item.getExcerpt();
        com.paypal.oslo.api.graphql.schema.type.HelpContentCategory contentCategory = item.getContentCategory();
        return new com.paypal.oslo.feature.helpcenter.domain.models.RecommendedArticleData(new com.paypal.oslo.feature.helpcenter.domain.models.ArticlePreview(id, title, excerpt, contentCategory != null ? contentCategory.name() : null));
    }

    public final java.util.List<com.paypal.oslo.feature.helpcenter.domain.models.RecommendedArticleData> toRecommendedArticleDataList(java.util.List<com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterRecommendedArticlesQuery.Item> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.List<com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterRecommendedArticlesQuery.Item> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(INSTANCE.toRecommendedArticleData((com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterRecommendedArticlesQuery.Item) it.next()));
        }
        return arrayList;
    }
}
