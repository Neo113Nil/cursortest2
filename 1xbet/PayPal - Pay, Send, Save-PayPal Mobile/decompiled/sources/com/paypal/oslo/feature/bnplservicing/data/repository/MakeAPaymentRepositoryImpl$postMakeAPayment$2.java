package com.paypal.oslo.feature.bnplservicing.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class MakeAPaymentRepositoryImpl$postMakeAPayment$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplservicing.graphql.MakeAPaymentMutation.Data, com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.MakeAPaymentSuccess> {
    public static final com.paypal.oslo.feature.bnplservicing.data.repository.MakeAPaymentRepositoryImpl$postMakeAPayment$2 Camera2StreamConfigurationMap = new com.paypal.oslo.feature.bnplservicing.data.repository.MakeAPaymentRepositoryImpl$postMakeAPayment$2();

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.MakeAPaymentSuccess invoke(com.paypal.oslo.feature.bnplservicing.graphql.MakeAPaymentMutation.Data data) {
        return com.paypal.oslo.feature.bnplservicing.data.mapper.makeapayment.MakeAPaymentMapperKt.toMakeAPaymentSuccessResponse(data);
    }

    MakeAPaymentRepositoryImpl$postMakeAPayment$2() {
        super(1, com.paypal.oslo.feature.bnplservicing.data.mapper.makeapayment.MakeAPaymentMapperKt.class, "toMakeAPaymentSuccessResponse", "toMakeAPaymentSuccessResponse(Lcom/paypal/oslo/feature/bnplservicing/graphql/MakeAPaymentMutation$Data;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/MakeAPaymentSuccess;", 1);
    }
}
