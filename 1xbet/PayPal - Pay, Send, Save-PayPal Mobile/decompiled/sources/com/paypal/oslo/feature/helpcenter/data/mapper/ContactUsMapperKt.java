package com.paypal.oslo.feature.helpcenter.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0004H\u0000¢\u0006\u0004\b\u0002\u0010\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0006H\u0000¢\u0006\u0004\b\u0002\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Item;", "Lcom/paypal/oslo/feature/helpcenter/domain/models/ContactTopic;", "toDomain", "(Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Item;)Lcom/paypal/oslo/feature/helpcenter/domain/models/ContactTopic;", "Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Item1;", "(Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Item1;)Lcom/paypal/oslo/feature/helpcenter/domain/models/ContactTopic;", "Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Item2;", "(Lcom/paypal/oslo/feature/helpcenter/graphql/GetContactUsTopicsQuery$Item2;)Lcom/paypal/oslo/feature/helpcenter/domain/models/ContactTopic;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ContactUsMapperKt {
    public static final com.paypal.oslo.feature.helpcenter.domain.models.ContactTopic toDomain(com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Item item) {
        java.util.List emptyList;
        java.util.List<com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Item1> items;
        java.util.List filterNotNull;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
        java.lang.String id = item.getId();
        java.lang.String title = item.getTitle();
        java.lang.String description = item.getDescription();
        com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Topics topics = item.getTopics();
        if (topics == null || (items = topics.getItems()) == null || (filterNotNull = kotlin.collections.CollectionsKt.filterNotNull(items)) == null) {
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        } else {
            java.util.List list = filterNotNull;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(toDomain((com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Item1) it.next()));
            }
            emptyList = arrayList;
        }
        return new com.paypal.oslo.feature.helpcenter.domain.models.ContactTopic(id, title, null, description, emptyList, null, 36, null);
    }

    public static final com.paypal.oslo.feature.helpcenter.domain.models.ContactTopic toDomain(com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Item1 item1) {
        java.util.List emptyList;
        com.paypal.oslo.feature.helpcenter.domain.models.ContactTopicResource contactTopicResource;
        java.util.List<com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Item2> items;
        java.util.List filterNotNull;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item1, "");
        java.lang.String id = item1.getId();
        java.lang.String title = item1.getTitle();
        java.lang.String referenceId = item1.getReferenceId();
        com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Topics1 topics = item1.getTopics();
        if (topics == null || (items = topics.getItems()) == null || (filterNotNull = kotlin.collections.CollectionsKt.filterNotNull(items)) == null) {
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        } else {
            java.util.List list = filterNotNull;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(toDomain((com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Item2) it.next()));
            }
            emptyList = arrayList;
        }
        com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Resources1 resources = item1.getResources();
        if (resources != null) {
            com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Article1 article = resources.getArticle();
            contactTopicResource = new com.paypal.oslo.feature.helpcenter.domain.models.ContactTopicResource(article != null ? article.getId() : null, resources.getIntentName(), resources.getIntentCode(), resources.getIntentVariant());
        } else {
            contactTopicResource = null;
        }
        return new com.paypal.oslo.feature.helpcenter.domain.models.ContactTopic(id, title, referenceId, null, emptyList, contactTopicResource, 8, null);
    }

    public static final com.paypal.oslo.feature.helpcenter.domain.models.ContactTopic toDomain(com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Item2 item2) {
        com.paypal.oslo.feature.helpcenter.domain.models.ContactTopicResource contactTopicResource;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item2, "");
        java.lang.String id = item2.getId();
        java.lang.String title = item2.getTitle();
        java.lang.String referenceId = item2.getReferenceId();
        com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Resources resources = item2.getResources();
        if (resources != null) {
            com.paypal.oslo.feature.helpcenter.graphql.GetContactUsTopicsQuery.Article article = resources.getArticle();
            contactTopicResource = new com.paypal.oslo.feature.helpcenter.domain.models.ContactTopicResource(article != null ? article.getId() : null, resources.getIntentName(), resources.getIntentCode(), resources.getIntentVariant());
        } else {
            contactTopicResource = null;
        }
        return new com.paypal.oslo.feature.helpcenter.domain.models.ContactTopic(id, title, referenceId, null, null, contactTopicResource, 24, null);
    }
}
