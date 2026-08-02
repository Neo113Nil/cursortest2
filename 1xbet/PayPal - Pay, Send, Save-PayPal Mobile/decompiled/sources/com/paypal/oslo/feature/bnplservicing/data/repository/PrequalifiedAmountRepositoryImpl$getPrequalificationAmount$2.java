package com.paypal.oslo.feature.bnplservicing.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class PrequalifiedAmountRepositoryImpl$getPrequalificationAmount$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationAmountQuery.Data, com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount.PrequalificationAmount> {
    public static final com.paypal.oslo.feature.bnplservicing.data.repository.PrequalifiedAmountRepositoryImpl$getPrequalificationAmount$2 getHighSpeedVideoSizes = new com.paypal.oslo.feature.bnplservicing.data.repository.PrequalifiedAmountRepositoryImpl$getPrequalificationAmount$2();

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount.PrequalificationAmount invoke(com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationAmountQuery.Data data) {
        return com.paypal.oslo.feature.bnplservicing.data.mapper.prequal.PrequalifiedAmountMapperKt.toPrequalificationAmount(data);
    }

    PrequalifiedAmountRepositoryImpl$getPrequalificationAmount$2() {
        super(1, com.paypal.oslo.feature.bnplservicing.data.mapper.prequal.PrequalifiedAmountMapperKt.class, "toPrequalificationAmount", "toPrequalificationAmount(Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplPrequalificationAmountQuery$Data;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/prequalifiedamount/PrequalificationAmount;", 1);
    }
}
