package com.paypal.oslo.feature.bnplacquisition.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class PaymentFundingInstrumentsRepositoryImpl$getPaymentFundingInstruments$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.Data, java.util.List<? extends com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrument>> {
    public static final com.paypal.oslo.feature.bnplacquisition.data.repository.PaymentFundingInstrumentsRepositoryImpl$getPaymentFundingInstruments$2 getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.bnplacquisition.data.repository.PaymentFundingInstrumentsRepositoryImpl$getPaymentFundingInstruments$2();

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.util.List<? extends com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrument> invoke(com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.Data data) {
        return com.paypal.oslo.feature.bnplacquisition.data.mapper.PaymentFundingInstrumentsMapperKt.toFundingInstruments(data);
    }

    PaymentFundingInstrumentsRepositoryImpl$getPaymentFundingInstruments$2() {
        super(1, com.paypal.oslo.feature.bnplacquisition.data.mapper.PaymentFundingInstrumentsMapperKt.class, "toFundingInstruments", "toFundingInstruments(Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplAcquisitionPaymentFundingInstrumentsQuery$Data;)Ljava/util/List;", 1);
    }
}
