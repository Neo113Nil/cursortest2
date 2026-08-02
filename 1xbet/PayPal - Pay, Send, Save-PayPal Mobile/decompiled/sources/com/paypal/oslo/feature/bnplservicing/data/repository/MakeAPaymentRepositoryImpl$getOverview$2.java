package com.paypal.oslo.feature.bnplservicing.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class MakeAPaymentRepositoryImpl$getOverview$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.Data, com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.MakeAPaymentOverview> {
    public static final com.paypal.oslo.feature.bnplservicing.data.repository.MakeAPaymentRepositoryImpl$getOverview$2 Camera2StreamConfigurationMap = new com.paypal.oslo.feature.bnplservicing.data.repository.MakeAPaymentRepositoryImpl$getOverview$2();

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.MakeAPaymentOverview invoke(com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.Data data) {
        return com.paypal.oslo.feature.bnplservicing.data.mapper.makeapayment.MakeAPaymentOverviewMapperKt.toMakeAPaymentOverview(data);
    }

    MakeAPaymentRepositoryImpl$getOverview$2() {
        super(1, com.paypal.oslo.feature.bnplservicing.data.mapper.makeapayment.MakeAPaymentOverviewMapperKt.class, "toMakeAPaymentOverview", "toMakeAPaymentOverview(Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$Data;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/MakeAPaymentOverview;", 1);
    }
}
