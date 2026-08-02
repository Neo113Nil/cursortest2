package com.paypal.oslo.feature.bnplacquisition.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class UpdateApplicationRepositoryImpl$updateApplicationAndFetchTerms$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.Data, com.paypal.oslo.feature.bnplacquisition.domain.model.reviewterms.ReviewTerms> {
    public static final com.paypal.oslo.feature.bnplacquisition.data.repository.UpdateApplicationRepositoryImpl$updateApplicationAndFetchTerms$2 getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.bnplacquisition.data.repository.UpdateApplicationRepositoryImpl$updateApplicationAndFetchTerms$2();

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.reviewterms.ReviewTerms invoke(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.Data data) {
        return com.paypal.oslo.feature.bnplacquisition.data.mapper.ReviewTermsMapperKt.toReviewTerms(data);
    }

    UpdateApplicationRepositoryImpl$updateApplicationAndFetchTerms$2() {
        super(1, com.paypal.oslo.feature.bnplacquisition.data.mapper.ReviewTermsMapperKt.class, "toReviewTerms", "toReviewTerms(Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchTermsMutation$Data;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/reviewterms/ReviewTerms;", 1);
    }
}
