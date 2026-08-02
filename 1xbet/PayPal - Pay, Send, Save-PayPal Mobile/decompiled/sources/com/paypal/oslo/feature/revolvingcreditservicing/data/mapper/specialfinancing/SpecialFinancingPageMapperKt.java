package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.specialfinancing;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\t\u001a\u001f\u0010\n\u001a\u00020\u0001*\u00020\b2\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPromotionalActivitiesQuery$Data;", "", "currentOffset", "", "hasPartialError", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/specialfinancing/SpecialFinancingPage;", "toSpecialFinancingPage", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPromotionalActivitiesQuery$Data;IZ)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/specialfinancing/SpecialFinancingPage;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditHistoricalPromotionalActivitiesFragment;", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditHistoricalPromotionalActivitiesFragment;ZLjava/lang/Integer;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/specialfinancing/SpecialFinancingPage;", "toNextOffset", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditHistoricalPromotionalActivitiesFragment;Ljava/lang/Integer;)I"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SpecialFinancingPageMapperKt {
    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.specialfinancing.SpecialFinancingPage toSpecialFinancingPage$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPromotionalActivitiesQuery.Data data, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return toSpecialFinancingPage(data, i, z);
    }

    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.specialfinancing.SpecialFinancingPage toSpecialFinancingPage(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPromotionalActivitiesQuery.Data data, int i, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPromotionalActivitiesQuery.RevolvingCreditHistoricalPromotionalActivities revolvingCreditHistoricalPromotionalActivities = data.getRevolvingCreditHistoricalPromotionalActivities();
        return toSpecialFinancingPage(revolvingCreditHistoricalPromotionalActivities != null ? revolvingCreditHistoricalPromotionalActivities.getRevolvingCreditHistoricalPromotionalActivitiesFragment() : null, z, java.lang.Integer.valueOf(i));
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.specialfinancing.SpecialFinancingPage toSpecialFinancingPage$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment revolvingCreditHistoricalPromotionalActivitiesFragment, boolean z, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            num = null;
        }
        return toSpecialFinancingPage(revolvingCreditHistoricalPromotionalActivitiesFragment, z, num);
    }

    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.specialfinancing.SpecialFinancingPage toSpecialFinancingPage(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment revolvingCreditHistoricalPromotionalActivitiesFragment, boolean z, java.lang.Integer num) {
        if (z) {
            return null;
        }
        if (revolvingCreditHistoricalPromotionalActivitiesFragment == null) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.specialfinancing.SpecialFinancingPage(kotlin.collections.CollectionsKt.emptyList(), null, false);
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.specialfinancing.SpecialFinancingPage(com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.specialfinancing.PromotionalActivityMapperKt.toDomain(revolvingCreditHistoricalPromotionalActivitiesFragment.getPage().getItems()), java.lang.Integer.valueOf(toNextOffset(revolvingCreditHistoricalPromotionalActivitiesFragment, num)), revolvingCreditHistoricalPromotionalActivitiesFragment.getPage().getHasNextPage());
    }

    public static /* synthetic */ int toNextOffset$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment revolvingCreditHistoricalPromotionalActivitiesFragment, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = 0;
        }
        return toNextOffset(revolvingCreditHistoricalPromotionalActivitiesFragment, num);
    }

    public static final int toNextOffset(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment revolvingCreditHistoricalPromotionalActivitiesFragment, java.lang.Integer num) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditHistoricalPromotionalActivitiesFragment, "");
        return (num != null ? num.intValue() : 0) + revolvingCreditHistoricalPromotionalActivitiesFragment.getPage().getLimit();
    }
}
