package com.paypal.oslo.feature.bnplservicing.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class AutopayRepositoryImpl$cancelAutopay$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplservicing.graphql.CancelBnplAutopayMutation.Data, com.paypal.oslo.feature.bnplservicing.domain.model.autopay.CancelAutoPayResult> {
    public static final com.paypal.oslo.feature.bnplservicing.data.repository.AutopayRepositoryImpl$cancelAutopay$2 Camera2StreamConfigurationMap = new com.paypal.oslo.feature.bnplservicing.data.repository.AutopayRepositoryImpl$cancelAutopay$2();

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.autopay.CancelAutoPayResult invoke(com.paypal.oslo.feature.bnplservicing.graphql.CancelBnplAutopayMutation.Data data) {
        return com.paypal.oslo.feature.bnplservicing.data.mapper.autopay.CancelAutopayMapperKt.toCancelAutoPayResponse(data);
    }

    AutopayRepositoryImpl$cancelAutopay$2() {
        super(1, com.paypal.oslo.feature.bnplservicing.data.mapper.autopay.CancelAutopayMapperKt.class, "toCancelAutoPayResponse", "toCancelAutoPayResponse(Lcom/paypal/oslo/feature/bnplservicing/graphql/CancelBnplAutopayMutation$Data;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/autopay/CancelAutoPayResult;", 1);
    }
}
