package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.statement;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001f\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0004\u001a\u00020\u0007*\u00020\u0006H\u0000¢\u0006\u0004\b\u0004\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementSummariesQuery$Data;", "", "hasPartialError", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/statements/StatementSummary;", "toDomain", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementSummariesQuery$Data;Z)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/statements/StatementSummary;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditStatementSummaryFragment;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/statements/StatementItem;", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditStatementSummaryFragment;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/statements/StatementItem;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class StatementsMapperKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementSummary toDomain(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementSummariesQuery.Data data, boolean z) {
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementSummariesQuery.RevolvingCreditStatementSummary> revolvingCreditStatementSummaries;
        java.util.ArrayList arrayList = null;
        if ((data != null ? data.getRevolvingCreditStatementSummaries() : null) == null && z) {
            return null;
        }
        if (data != null && (revolvingCreditStatementSummaries = data.getRevolvingCreditStatementSummaries()) != null) {
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementSummariesQuery.RevolvingCreditStatementSummary> list = revolvingCreditStatementSummaries;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(toDomain(((com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementSummariesQuery.RevolvingCreditStatementSummary) it.next()).getRevolvingCreditStatementSummaryFragment()));
            }
            arrayList = arrayList2;
        }
        if (arrayList == null) {
            arrayList = kotlin.collections.CollectionsKt.emptyList();
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementSummary(arrayList);
    }

    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementItem toDomain(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditStatementSummaryFragment revolvingCreditStatementSummaryFragment) {
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditStatementSummaryFragment, "");
        java.lang.String obj = revolvingCreditStatementSummaryFragment.getId().toString();
        java.time.Instant anyToInstantOrNull = com.paypal.oslo.feature.revolvingcreditservicing.utils.DateUtilKt.anyToInstantOrNull(revolvingCreditStatementSummaryFragment.getStartTime());
        java.time.Instant anyToInstantOrNull2 = com.paypal.oslo.feature.revolvingcreditservicing.utils.DateUtilKt.anyToInstantOrNull(revolvingCreditStatementSummaryFragment.getClosingTime());
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditStatementSummaryFragment.NewBalance newBalance = revolvingCreditStatementSummaryFragment.getNewBalance();
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementItem(obj, anyToInstantOrNull, anyToInstantOrNull2, (newBalance == null || (revolvingCreditMoneyFragment = newBalance.getRevolvingCreditMoneyFragment()) == null) ? null : new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount(revolvingCreditMoneyFragment.getCurrencyCode().toString(), revolvingCreditMoneyFragment.getValue()), kotlin.jvm.internal.Intrinsics.areEqual(revolvingCreditStatementSummaryFragment.getChangeInTerms(), java.lang.Boolean.TRUE));
    }
}
