package com.paypal.oslo.feature.bnplservicing.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class MakeAPaymentRepositoryImpl$getEligibleFi$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplMakePaymentFIsQuery.Data, com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.MakeAPaymentEligibleFi> {
    public static final com.paypal.oslo.feature.bnplservicing.data.repository.MakeAPaymentRepositoryImpl$getEligibleFi$2 getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.bnplservicing.data.repository.MakeAPaymentRepositoryImpl$getEligibleFi$2();

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.MakeAPaymentEligibleFi invoke(com.paypal.oslo.feature.bnplservicing.graphql.GetBnplMakePaymentFIsQuery.Data data) {
        return com.paypal.oslo.feature.bnplservicing.data.mapper.makeapayment.MakeAPaymentEligibleFiMapperKt.toMakeAPaymentEligibleFi(data);
    }

    MakeAPaymentRepositoryImpl$getEligibleFi$2() {
        super(1, com.paypal.oslo.feature.bnplservicing.data.mapper.makeapayment.MakeAPaymentEligibleFiMapperKt.class, "toMakeAPaymentEligibleFi", "toMakeAPaymentEligibleFi(Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplMakePaymentFIsQuery$Data;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/MakeAPaymentEligibleFi;", 1);
    }
}
