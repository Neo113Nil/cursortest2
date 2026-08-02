package com.paypal.oslo.feature.bnplacquisition.data.repository;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/data/repository/CheckApplicationEligibilityRepositoryImpl;", "Lcom/paypal/oslo/feature/bnplacquisition/data/repository/BaseRepository;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/repository/CheckApplicationEligibilityRepository;", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Ldagger/Lazy;)V", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/CheckApplicationEligibilityRequest;", "request", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/productselection/CheckApplicationEligibility;", "checkApplicationEligibility", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/CheckApplicationEligibilityRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Ldagger/Lazy;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CheckApplicationEligibilityRepositoryImpl extends com.paypal.oslo.feature.bnplacquisition.data.repository.BaseRepository implements com.paypal.oslo.feature.bnplacquisition.domain.repository.CheckApplicationEligibilityRepository {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public CheckApplicationEligibilityRepositoryImpl(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        this.Camera2StreamConfigurationMap = lazy;
    }

    @Override // com.paypal.oslo.feature.bnplacquisition.domain.repository.CheckApplicationEligibilityRepository
    public final java.lang.Object checkApplicationEligibility(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.CheckApplicationEligibilityRequest checkApplicationEligibilityRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError, com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CheckApplicationEligibility>> continuation) {
        com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation checkBnplApplicationEligibilityMutation = new com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation(com.paypal.oslo.feature.bnplacquisition.data.mapper.CheckApplicationEligibilityMapperKt.toGraphQLInput(checkApplicationEligibilityRequest), checkApplicationEligibilityRequest.getParams().getIncludeOffers());
        com.apollographql.apollo.ApolloClient apolloClient = this.Camera2StreamConfigurationMap.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
        return com.paypal.oslo.feature.bnplacquisition.data.repository.BaseRepository.fetchData$default(this, apolloClient, checkBnplApplicationEligibilityMutation, com.paypal.oslo.feature.bnplacquisition.data.repository.CheckApplicationEligibilityRepositoryImpl$checkApplicationEligibility$2.Camera2StreamConfigurationMap, (com.apollographql.apollo.cache.normalized.FetchPolicy) null, (com.paypal.oslo.core.network.graphql.CallConfig) null, continuation, 12, (java.lang.Object) null);
    }
}
