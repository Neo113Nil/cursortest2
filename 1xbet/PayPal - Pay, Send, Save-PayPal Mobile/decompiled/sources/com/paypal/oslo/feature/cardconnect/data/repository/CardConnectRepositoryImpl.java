package com.paypal.oslo.feature.cardconnect.data.repository;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00100\n2\u0006\u0010\t\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/cardconnect/data/repository/CardConnectRepositoryImpl;", "Lcom/paypal/oslo/feature/cardconnect/shared/data/repository/BaseRepository;", "Lcom/paypal/oslo/feature/cardconnect/domain/repository/CardConnectRepository;", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Ldagger/Lazy;)V", "Lcom/paypal/oslo/feature/cardconnect/domain/model/CardConnectEligibilityRequest;", "request", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/DataResultError;", "Lcom/paypal/oslo/feature/cardconnect/domain/model/CardConnectEligibilityResponse;", "checkEligibility", "(Lcom/paypal/oslo/feature/cardconnect/domain/model/CardConnectEligibilityRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/cardconnect/domain/model/CardConnectSessionRequest;", "Lcom/paypal/oslo/feature/cardconnect/domain/model/CardConnectSessionResponse;", "createSession", "(Lcom/paypal/oslo/feature/cardconnect/domain/model/CardConnectSessionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Ldagger/Lazy;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CardConnectRepositoryImpl extends com.paypal.oslo.feature.cardconnect.shared.data.repository.BaseRepository implements com.paypal.oslo.feature.cardconnect.domain.repository.CardConnectRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public CardConnectRepositoryImpl(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        this.getHighSpeedVideoFpsRangesFor = lazy;
    }

    @Override // com.paypal.oslo.feature.cardconnect.domain.repository.CardConnectRepository
    public final java.lang.Object checkEligibility(com.paypal.oslo.feature.cardconnect.domain.model.CardConnectEligibilityRequest cardConnectEligibilityRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError, ? extends com.paypal.oslo.feature.cardconnect.domain.model.CardConnectEligibilityResponse>> continuation) {
        com.paypal.oslo.feature.cardconnect.graphql.GetCardConnectEligibilityQuery getCardConnectEligibilityQuery = new com.paypal.oslo.feature.cardconnect.graphql.GetCardConnectEligibilityQuery(com.paypal.oslo.feature.cardconnect.data.mapper.CardConnectEligibilityMapperKt.getCardConnectEligibilityRequestMapper().invoke(cardConnectEligibilityRequest));
        com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoFpsRangesFor.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
        return com.paypal.oslo.feature.cardconnect.shared.data.repository.BaseRepository.fetchData$default(this, apolloClient, getCardConnectEligibilityQuery, com.paypal.oslo.feature.cardconnect.data.mapper.CardConnectEligibilityMapperKt.getCardConnectEligibilityResponseMapper(), null, null, null, continuation, 28, null);
    }

    @Override // com.paypal.oslo.feature.cardconnect.domain.repository.CardConnectRepository
    public final java.lang.Object createSession(com.paypal.oslo.feature.cardconnect.domain.model.CardConnectSessionRequest cardConnectSessionRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError, com.paypal.oslo.feature.cardconnect.domain.model.CardConnectSessionResponse>> continuation) {
        com.paypal.oslo.feature.cardconnect.graphql.CardConnectCreateSessionMutation cardConnectCreateSessionMutation = new com.paypal.oslo.feature.cardconnect.graphql.CardConnectCreateSessionMutation(com.paypal.oslo.feature.cardconnect.data.mapper.CardConnectSessionMapperKt.getCardConnectSessionRequestMapper().invoke(cardConnectSessionRequest));
        com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoFpsRangesFor.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
        return com.paypal.oslo.feature.cardconnect.shared.data.repository.BaseRepository.executeMutation$default(this, apolloClient, cardConnectCreateSessionMutation, com.paypal.oslo.feature.cardconnect.data.mapper.CardConnectSessionMapperKt.getCardConnectSessionResponseMapper(), null, null, null, false, createCallConfig$card_connect_prodRelease(com.paypal.oslo.core.identity.domain.model.AuthenticationState.LOGGED_IN), continuation, 60, null);
    }
}
