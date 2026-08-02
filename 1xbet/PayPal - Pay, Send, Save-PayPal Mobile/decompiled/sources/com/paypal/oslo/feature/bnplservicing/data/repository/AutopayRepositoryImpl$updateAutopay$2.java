package com.paypal.oslo.feature.bnplservicing.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class AutopayRepositoryImpl$updateAutopay$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplservicing.graphql.SetBnplAutopayMutation.Data, com.paypal.oslo.feature.bnplservicing.domain.model.autopay.UpdateAutoPayResult> {
    public static final com.paypal.oslo.feature.bnplservicing.data.repository.AutopayRepositoryImpl$updateAutopay$2 getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.bnplservicing.data.repository.AutopayRepositoryImpl$updateAutopay$2();

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.autopay.UpdateAutoPayResult invoke(com.paypal.oslo.feature.bnplservicing.graphql.SetBnplAutopayMutation.Data data) {
        return com.paypal.oslo.feature.bnplservicing.data.mapper.autopay.UpdateAutopayMapperKt.toUpdateAutoPayResult(data);
    }

    AutopayRepositoryImpl$updateAutopay$2() {
        super(1, com.paypal.oslo.feature.bnplservicing.data.mapper.autopay.UpdateAutopayMapperKt.class, "toUpdateAutoPayResult", "toUpdateAutoPayResult(Lcom/paypal/oslo/feature/bnplservicing/graphql/SetBnplAutopayMutation$Data;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/autopay/UpdateAutoPayResult;", 1);
    }
}
