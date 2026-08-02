package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.activity;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\t\u001a\u001f\u0010\n\u001a\u00020\u0001*\u00020\b2\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditActivitiesQuery$Data;", "", "currentOffset", "", "hasPartialError", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/activities/FinancialActivitiesPage;", "toFinancialActivityPage", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditActivitiesQuery$Data;IZ)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/activities/FinancialActivitiesPage;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditActivitiesFragment;", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditActivitiesFragment;ZLjava/lang/Integer;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/activities/FinancialActivitiesPage;", "toNextOffset", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditActivitiesFragment;Ljava/lang/Integer;)I"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FinancialActivityPageMapperKt {
    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.activities.FinancialActivitiesPage toFinancialActivityPage$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditActivitiesQuery.Data data, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return toFinancialActivityPage(data, i, z);
    }

    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.activities.FinancialActivitiesPage toFinancialActivityPage(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditActivitiesQuery.Data data, int i, boolean z) {
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment revolvingCreditActivitiesFragment;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditActivitiesQuery.RevolvingCreditActivities revolvingCreditActivities = data.getRevolvingCreditActivities();
        if (revolvingCreditActivities == null || (revolvingCreditActivitiesFragment = revolvingCreditActivities.getRevolvingCreditActivitiesFragment()) == null) {
            return null;
        }
        return toFinancialActivityPage(revolvingCreditActivitiesFragment, z, java.lang.Integer.valueOf(i));
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.activities.FinancialActivitiesPage toFinancialActivityPage$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment revolvingCreditActivitiesFragment, boolean z, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            num = null;
        }
        return toFinancialActivityPage(revolvingCreditActivitiesFragment, z, num);
    }

    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.activities.FinancialActivitiesPage toFinancialActivityPage(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment revolvingCreditActivitiesFragment, boolean z, java.lang.Integer num) {
        if (z) {
            return null;
        }
        if (revolvingCreditActivitiesFragment == null) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.activities.FinancialActivitiesPage(kotlin.collections.CollectionsKt.emptyList(), null, false);
        }
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Item> items = revolvingCreditActivitiesFragment.getPage().getItems();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(items, 10));
        java.util.Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.activity.TransactionActivityMapperKt.toTransactionActivity((com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Item) it.next()));
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.activities.FinancialActivitiesPage(arrayList, java.lang.Integer.valueOf(toNextOffset(revolvingCreditActivitiesFragment, num)), revolvingCreditActivitiesFragment.getPage().getHasNextPage());
    }

    public static /* synthetic */ int toNextOffset$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment revolvingCreditActivitiesFragment, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = 0;
        }
        return toNextOffset(revolvingCreditActivitiesFragment, num);
    }

    public static final int toNextOffset(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment revolvingCreditActivitiesFragment, java.lang.Integer num) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditActivitiesFragment, "");
        return (num != null ? num.intValue() : 0) + revolvingCreditActivitiesFragment.getPage().getLimit();
    }
}
