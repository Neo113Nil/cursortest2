package com.paypal.oslo.feature.bnplacquisition.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class PrepareDigitizationDataRepositoryImpl$fetchDigitizationData$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation.Data, com.paypal.oslo.feature.bnplacquisition.domain.model.digitilization.PrepareDigitizationData> {
    public static final com.paypal.oslo.feature.bnplacquisition.data.repository.PrepareDigitizationDataRepositoryImpl$fetchDigitizationData$2 Camera2StreamConfigurationMap = new com.paypal.oslo.feature.bnplacquisition.data.repository.PrepareDigitizationDataRepositoryImpl$fetchDigitizationData$2();

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.digitilization.PrepareDigitizationData invoke(com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation.Data data) {
        return com.paypal.oslo.feature.bnplacquisition.data.mapper.PrepareDigitizationDataMapperKt.toDigitizationData(data);
    }

    PrepareDigitizationDataRepositoryImpl$fetchDigitizationData$2() {
        super(1, com.paypal.oslo.feature.bnplacquisition.data.mapper.PrepareDigitizationDataMapperKt.class, "toDigitizationData", "toDigitizationData(Lcom/paypal/oslo/feature/bnplacquisition/graphql/PrepareBnplDigitizationDataMutation$Data;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/digitilization/PrepareDigitizationData;", 1);
    }
}
