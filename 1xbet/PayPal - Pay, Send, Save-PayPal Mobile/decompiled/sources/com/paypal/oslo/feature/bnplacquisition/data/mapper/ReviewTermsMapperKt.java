package com.paypal.oslo.feature.bnplacquisition.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006*\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchTermsMutation$Data;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/reviewterms/ReviewTerms;", "toReviewTerms", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchTermsMutation$Data;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/reviewterms/ReviewTerms;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/ReviewTermsRequest;", "Lcom/paypal/oslo/api/graphql/schema/type/UpdateBNPLApplicationInput;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/type/UpdateBNPLApplicationInput;", "toGraphQLInput", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/ReviewTermsRequest;)Lcom/paypal/oslo/api/graphql/schema/type/UpdateBNPLApplicationInput;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ReviewTermsMapperKt {
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.reviewterms.ReviewTerms toReviewTerms(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.Data data) {
        com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.UpdateBnplApplication updateBnplApplication;
        com.paypal.oslo.feature.bnplacquisition.domain.model.reviewterms.ReviewTermsSuccess reviewTermsSuccess;
        com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason reason;
        com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.Application application;
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.ApplicationDecline applicationDecline = null;
        if (data == null || (updateBnplApplication = data.getUpdateBnplApplication()) == null) {
            return null;
        }
        com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.OnUpdateBNPLApplicationSuccess onUpdateBNPLApplicationSuccess = updateBnplApplication.getOnUpdateBNPLApplicationSuccess();
        if (onUpdateBNPLApplicationSuccess == null || (application = onUpdateBNPLApplicationSuccess.getApplication()) == null) {
            reviewTermsSuccess = null;
        } else {
            java.lang.Object creditAccountId = application.getCreditAccountId();
            java.lang.String str = creditAccountId instanceof java.lang.String ? (java.lang.String) creditAccountId : null;
            com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier.Companion companion = com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier.INSTANCE;
            com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier creditProductIdentifier = application.getCreditProductIdentifier();
            java.lang.String name2 = creditProductIdentifier != null ? creditProductIdentifier.name() : null;
            if (name2 == null) {
                name2 = "";
            }
            com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier from = companion.from(name2);
            java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.Document> documents = application.getDocuments();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(documents, 10));
            java.util.Iterator<T> it = documents.iterator();
            while (it.hasNext()) {
                arrayList.add(com.paypal.oslo.feature.bnplacquisition.data.mapper.CreditApplicationDocumentMapperKt.toDocument(((com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.Document) it.next()).getBnplAcquisitionDocumentFragment()));
            }
            reviewTermsSuccess = new com.paypal.oslo.feature.bnplacquisition.domain.model.reviewterms.ReviewTermsSuccess(new com.paypal.oslo.feature.bnplacquisition.domain.model.reviewterms.ReviewTermsSuccessCreditApplication(from, str, arrayList));
        }
        com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.OnUpdateBNPLApplicationDecline onUpdateBNPLApplicationDecline = updateBnplApplication.getOnUpdateBNPLApplicationDecline();
        if (onUpdateBNPLApplicationDecline != null && (reason = onUpdateBNPLApplicationDecline.getReason()) != null) {
            applicationDecline = com.paypal.oslo.feature.bnplacquisition.data.mapper.ApplicationDeclineMapperKt.toApplicationDecline(reason);
        }
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.reviewterms.ReviewTerms(reviewTermsSuccess, applicationDecline);
    }

    public static final com.paypal.oslo.api.graphql.schema.type.UpdateBNPLApplicationInput toGraphQLInput(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.ReviewTermsRequest reviewTermsRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewTermsRequest, "");
        java.lang.String experienceSessionId = reviewTermsRequest.getExperienceSessionId();
        com.apollographql.apollo.api.Optional presentIfNotNull = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(reviewTermsRequest.getSelectedOfferId());
        com.apollographql.apollo.api.Optional presentIfNotNull2 = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(reviewTermsRequest.getNationalIdentificationShort());
        com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
        java.lang.Long annualIncome = reviewTermsRequest.getAnnualIncome();
        return new com.paypal.oslo.api.graphql.schema.type.UpdateBNPLApplicationInput(null, companion.presentIfNotNull(annualIncome != null ? new com.paypal.oslo.api.graphql.schema.type.MoneyInput("USD", java.lang.String.valueOf(annualIncome.longValue())) : null), null, null, null, null, null, null, null, experienceSessionId, null, null, null, presentIfNotNull2, null, presentIfNotNull, null, null, null, null, 1007101, null);
    }
}
