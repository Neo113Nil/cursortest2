package com.paypal.oslo.feature.consumerprivacy.data.apollo;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\b0\u00062\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/data/apollo/PersonalizedShoppingApiImpl;", "Lcom/paypal/oslo/feature/consumerprivacy/data/apollo/PersonalizedShoppingApi;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "Larrow/core/Ior;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/core/network/graphql/GraphQLData;", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetPersonalizedShoppingConsentQuery$Data;", "getPersonalizedShoppingConsent", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.TRACKING_CONSENT_KEY, "Lcom/paypal/oslo/feature/consumerprivacy/graphql/UpdatePersonalizedShoppingConsentMutation$Data;", "updatePersonalizedShoppingConsent", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/apollographql/apollo/ApolloClient;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PersonalizedShoppingApiImpl implements com.paypal.oslo.feature.consumerprivacy.data.apollo.PersonalizedShoppingApi {
    public static final int $stable = 8;
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoSizes;

    @javax.inject.Inject
    public PersonalizedShoppingApiImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.getHighSpeedVideoSizes = apolloClient;
    }

    @Override // com.paypal.oslo.feature.consumerprivacy.data.apollo.PersonalizedShoppingApi
    public final java.lang.Object getPersonalizedShoppingConsent(kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.consumerprivacy.graphql.GetPersonalizedShoppingConsentQuery.Data>>> continuation) {
        return com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default((com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.getHighSpeedVideoSizes.query(new com.paypal.oslo.feature.consumerprivacy.graphql.GetPersonalizedShoppingConsentQuery()), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly), null, continuation, 2, null);
    }

    @Override // com.paypal.oslo.feature.consumerprivacy.data.apollo.PersonalizedShoppingApi
    public final java.lang.Object updatePersonalizedShoppingConsent(boolean z, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.consumerprivacy.graphql.UpdatePersonalizedShoppingConsentMutation.Data>>> continuation) {
        return com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(this.getHighSpeedVideoSizes.mutation(new com.paypal.oslo.feature.consumerprivacy.graphql.UpdatePersonalizedShoppingConsentMutation(z)), null, continuation, 2, null);
    }
}
