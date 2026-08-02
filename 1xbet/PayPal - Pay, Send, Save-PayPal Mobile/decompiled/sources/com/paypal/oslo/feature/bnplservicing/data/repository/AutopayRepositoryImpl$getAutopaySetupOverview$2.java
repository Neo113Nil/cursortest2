package com.paypal.oslo.feature.bnplservicing.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class AutopayRepositoryImpl$getAutopaySetupOverview$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplAutopaySetupOverviewQuery.Data, com.paypal.oslo.feature.bnplservicing.domain.model.autopay.AutoPaySetupOverview> {
    public static final com.paypal.oslo.feature.bnplservicing.data.repository.AutopayRepositoryImpl$getAutopaySetupOverview$2 Camera2StreamConfigurationMap = new com.paypal.oslo.feature.bnplservicing.data.repository.AutopayRepositoryImpl$getAutopaySetupOverview$2();

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.autopay.AutoPaySetupOverview invoke(com.paypal.oslo.feature.bnplservicing.graphql.GetBnplAutopaySetupOverviewQuery.Data data) {
        return com.paypal.oslo.feature.bnplservicing.data.mapper.autopay.AutoPaySetupOverviewMapperKt.toAutoPaySetupOverview(data);
    }

    AutopayRepositoryImpl$getAutopaySetupOverview$2() {
        super(1, com.paypal.oslo.feature.bnplservicing.data.mapper.autopay.AutoPaySetupOverviewMapperKt.class, "toAutoPaySetupOverview", "toAutoPaySetupOverview(Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplAutopaySetupOverviewQuery$Data;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/autopay/AutoPaySetupOverview;", 1);
    }
}
