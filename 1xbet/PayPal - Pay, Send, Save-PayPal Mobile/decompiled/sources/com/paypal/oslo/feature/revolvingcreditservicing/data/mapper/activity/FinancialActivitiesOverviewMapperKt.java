package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.activity;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditActivitiesOverviewQuery$Data;", "", "currentOffset", "", "hasPaymentsPartialError", "hasActivitiesPartialError", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/activities/FinancialActivitiesOverview;", "toFinancialActivitiesOverview", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditActivitiesOverviewQuery$Data;IZZ)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/activities/FinancialActivitiesOverview;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FinancialActivitiesOverviewMapperKt {
    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.FinancialActivitiesOverview toFinancialActivitiesOverview$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditActivitiesOverviewQuery.Data data, int i, boolean z, boolean z2, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return toFinancialActivitiesOverview(data, i, z, z2);
    }

    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.FinancialActivitiesOverview toFinancialActivitiesOverview(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditActivitiesOverviewQuery.Data data, int i, boolean z, boolean z2) {
        java.util.ArrayList arrayList;
        java.util.List list;
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity> emptyList;
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity> list2;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment revolvingCreditActivitiesFragment;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.activities.FinancialActivitiesPage financialActivityPage;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment revolvingCreditActivitiesFragment2;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Page page;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment revolvingCreditActivitiesFragment3;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Page page2;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerServiceSummaryFragment revolvingCreditCustomerServiceSummaryFragment;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        java.lang.Integer num = null;
        if (z) {
            list = null;
        } else {
            if (data.getRevolvingCreditPayments() == null) {
                arrayList = kotlin.collections.CollectionsKt.emptyList();
            } else {
                java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditActivitiesOverviewQuery.RevolvingCreditPayment> revolvingCreditPayments = data.getRevolvingCreditPayments();
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(revolvingCreditPayments, 10));
                java.util.Iterator<T> it = revolvingCreditPayments.iterator();
                while (it.hasNext()) {
                    arrayList2.add(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivityKt.ensureNegativeAmount(com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.payments.PaymentMapperKt.toRepaymentActivity(((com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditActivitiesOverviewQuery.RevolvingCreditPayment) it.next()).getRevolvingCreditPaymentsFragment())));
                }
                arrayList = arrayList2;
            }
            list = arrayList;
        }
        boolean z3 = false;
        if (z2) {
            list2 = null;
        } else {
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditActivitiesOverviewQuery.RevolvingCreditActivities revolvingCreditActivities = data.getRevolvingCreditActivities();
            if (revolvingCreditActivities == null || (revolvingCreditActivitiesFragment = revolvingCreditActivities.getRevolvingCreditActivitiesFragment()) == null || (financialActivityPage = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.activity.FinancialActivityPageMapperKt.toFinancialActivityPage(revolvingCreditActivitiesFragment, false, java.lang.Integer.valueOf(i))) == null || (emptyList = financialActivityPage.getCreditActivities()) == null) {
                emptyList = kotlin.collections.CollectionsKt.emptyList();
            }
            list2 = emptyList;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditActivitiesOverviewQuery.RevolvingCreditServicingContent revolvingCreditServicingContent = data.getRevolvingCreditServicingContent();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact customerServiceContact = (revolvingCreditServicingContent == null || (revolvingCreditCustomerServiceSummaryFragment = revolvingCreditServicingContent.getRevolvingCreditCustomerServiceSummaryFragment()) == null) ? null : com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.CustomerServiceContactMapperKt.toCustomerServiceContact(revolvingCreditCustomerServiceSummaryFragment);
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditActivitiesOverviewQuery.RevolvingCreditActivities revolvingCreditActivities2 = data.getRevolvingCreditActivities();
        if (revolvingCreditActivities2 != null && (revolvingCreditActivitiesFragment3 = revolvingCreditActivities2.getRevolvingCreditActivitiesFragment()) != null && (page2 = revolvingCreditActivitiesFragment3.getPage()) != null) {
            z3 = page2.getHasNextPage();
        }
        boolean z4 = z3;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditActivitiesOverviewQuery.RevolvingCreditActivities revolvingCreditActivities3 = data.getRevolvingCreditActivities();
        if (revolvingCreditActivities3 != null && (revolvingCreditActivitiesFragment2 = revolvingCreditActivities3.getRevolvingCreditActivitiesFragment()) != null && (page = revolvingCreditActivitiesFragment2.getPage()) != null) {
            num = java.lang.Integer.valueOf(i + page.getLimit());
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.FinancialActivitiesOverview(list, list2, customerServiceContact, num, z4);
    }
}
