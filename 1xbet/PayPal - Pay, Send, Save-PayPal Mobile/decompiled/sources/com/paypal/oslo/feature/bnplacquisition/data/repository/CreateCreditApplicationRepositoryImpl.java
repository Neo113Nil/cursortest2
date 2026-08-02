package com.paypal.oslo.feature.bnplacquisition.data.repository;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/data/repository/CreateCreditApplicationRepositoryImpl;", "Lcom/paypal/oslo/feature/bnplacquisition/data/repository/BaseRepository;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/repository/CreateCreditApplicationRepository;", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Ldagger/Lazy;)V", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/CreateCreditApplicationRequest;", "request", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/CreateCreditApplication;", "createCreditApplication", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/CreateCreditApplicationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Ldagger/Lazy;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CreateCreditApplicationRepositoryImpl extends com.paypal.oslo.feature.bnplacquisition.data.repository.BaseRepository implements com.paypal.oslo.feature.bnplacquisition.domain.repository.CreateCreditApplicationRepository {
    public static final int $stable = 8;
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public CreateCreditApplicationRepositoryImpl(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        this.getHighResolutionOutputSizeshNQ4ISI = lazy;
    }

    @Override // com.paypal.oslo.feature.bnplacquisition.domain.repository.CreateCreditApplicationRepository
    public final java.lang.Object createCreditApplication(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.CreateCreditApplicationRequest createCreditApplicationRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError, com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.CreateCreditApplication>> continuation) {
        java.lang.String experienceSessionId = createCreditApplicationRequest.getExperienceSessionId();
        java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.requests.ProductDetails> productDetails = createCreditApplicationRequest.getProductDetails();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(productDetails, 10));
        for (com.paypal.oslo.feature.bnplacquisition.domain.model.requests.ProductDetails productDetails2 : productDetails) {
            arrayList.add(new com.paypal.oslo.api.graphql.schema.type.InitializeBNPLApplicationProductInput(com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier.INSTANCE.safeValueOf(productDetails2.getCreditProductIdentifier().name()), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(productDetails2.getOfferId()), productDetails2.getProductOfferEvaluationId()));
        }
        com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation initializeBnplApplicationMutation = new com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation(new com.paypal.oslo.api.graphql.schema.type.InitializeBNPLApplicationInput(experienceSessionId, arrayList), createCreditApplicationRequest.getRequestParams().getIncludeAnnualIncome(), createCreditApplicationRequest.getRequestParams().getIncludeNationalIdentification(), createCreditApplicationRequest.getRequestParams().getIncludePaymentFundingInstruments(), createCreditApplicationRequest.getRequestParams().getIncludeSelectedPaymentFundingInstrument());
        com.apollographql.apollo.ApolloClient apolloClient = this.getHighResolutionOutputSizeshNQ4ISI.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
        return com.paypal.oslo.feature.bnplacquisition.data.repository.BaseRepository.fetchData$default(this, apolloClient, initializeBnplApplicationMutation, com.paypal.oslo.feature.bnplacquisition.data.repository.CreateCreditApplicationRepositoryImpl$createCreditApplication$2.getHighResolutionOutputSizeshNQ4ISI, (com.apollographql.apollo.cache.normalized.FetchPolicy) null, (com.paypal.oslo.core.network.graphql.CallConfig) null, continuation, 12, (java.lang.Object) null);
    }
}
