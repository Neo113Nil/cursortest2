package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.statement;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/data/mapper/statement/StatementDetailsMapper;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/mapper/statement/StatementDetailSummaryMapper;", "statementSummaryMapper", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/mapper/statement/SpecialFinancingMapper;", "specialFinancingMapper", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/data/mapper/statement/StatementDetailSummaryMapper;Lcom/paypal/oslo/feature/revolvingcreditservicing/data/mapper/statement/SpecialFinancingMapper;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$RevolvingCreditStatement;", "statement", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/network/PartialErrorHandler;", "partialErrors", "", "creditAccountId", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/statement/StatementDetails;", "toDomain", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$RevolvingCreditStatement;Lcom/paypal/oslo/feature/revolvingcreditservicing/data/network/PartialErrorHandler;Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/statement/StatementDetails;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/mapper/statement/StatementDetailSummaryMapper;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/mapper/statement/SpecialFinancingMapper;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class StatementDetailsMapper {
    public static final int $stable = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.statement.SpecialFinancingMapper Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.statement.StatementDetailSummaryMapper getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public StatementDetailsMapper(com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.statement.StatementDetailSummaryMapper statementDetailSummaryMapper, com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.statement.SpecialFinancingMapper specialFinancingMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statementDetailSummaryMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(specialFinancingMapper, "");
        this.getHighSpeedVideoFpsRanges = statementDetailSummaryMapper;
        this.Camera2StreamConfigurationMap = specialFinancingMapper;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.StatementDetails toDomain$default(com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.statement.StatementDetailsMapper statementDetailsMapper, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.RevolvingCreditStatement revolvingCreditStatement, com.paypal.oslo.feature.revolvingcreditservicing.data.network.PartialErrorHandler partialErrorHandler, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            partialErrorHandler = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        return statementDetailsMapper.toDomain(revolvingCreditStatement, partialErrorHandler, str);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.StatementDetails toDomain(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.RevolvingCreditStatement statement, com.paypal.oslo.feature.revolvingcreditservicing.data.network.PartialErrorHandler partialErrors, java.lang.String creditAccountId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statement, "");
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.Summary summary = statement.getSummary();
        java.util.ArrayList arrayList = null;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.StatementDetailSummary domain = summary != null ? this.getHighSpeedVideoFpsRanges.toDomain(summary) : null;
        if (domain == null) {
            return null;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.RewardsSummary rewardsSummary = statement.getRewardsSummary();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.CashBackSummary cashBackSummary = rewardsSummary != null ? com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.statement.CashBackSummaryMapperKt.toCashBackSummary(rewardsSummary) : null;
        boolean z = partialErrors != null && partialErrors.contains(com.paypal.oslo.feature.revolvingcreditservicing.data.network.fields.StatementsFields.REWARDS_SUMMARY);
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.PromotionalActivity> promotionalActivities = statement.getPromotionalActivities();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancing specialFinancing = promotionalActivities != null ? this.Camera2StreamConfigurationMap.toSpecialFinancing(promotionalActivities) : null;
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.Activity> activities = statement.getActivities();
        if (activities != null) {
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.Activity> list = activities;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.statement.StatementActivityMapperKt.toTransactionActivity((com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.Activity) it.next()));
            }
            arrayList = arrayList2;
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.StatementDetails(domain, cashBackSummary, z, specialFinancing, arrayList == null ? kotlin.collections.CollectionsKt.emptyList() : arrayList, creditAccountId);
    }
}
