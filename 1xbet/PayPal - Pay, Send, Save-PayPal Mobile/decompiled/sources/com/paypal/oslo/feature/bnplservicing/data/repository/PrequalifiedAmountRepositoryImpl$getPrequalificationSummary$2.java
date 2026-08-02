package com.paypal.oslo.feature.bnplservicing.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class PrequalifiedAmountRepositoryImpl$getPrequalificationSummary$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationSummaryQuery.Data, com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount.PrequalificationSummary> {
    public static final com.paypal.oslo.feature.bnplservicing.data.repository.PrequalifiedAmountRepositoryImpl$getPrequalificationSummary$2 Camera2StreamConfigurationMap = new com.paypal.oslo.feature.bnplservicing.data.repository.PrequalifiedAmountRepositoryImpl$getPrequalificationSummary$2();

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount.PrequalificationSummary invoke(com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationSummaryQuery.Data data) {
        return com.paypal.oslo.feature.bnplservicing.data.mapper.prequal.PrequalifiedAmountMapperKt.toPrequalifiedAmountOverview(data);
    }

    PrequalifiedAmountRepositoryImpl$getPrequalificationSummary$2() {
        super(1, com.paypal.oslo.feature.bnplservicing.data.mapper.prequal.PrequalifiedAmountMapperKt.class, "toPrequalifiedAmountOverview", "toPrequalifiedAmountOverview(Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplPrequalificationSummaryQuery$Data;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/prequalifiedamount/PrequalificationSummary;", 1);
    }
}
