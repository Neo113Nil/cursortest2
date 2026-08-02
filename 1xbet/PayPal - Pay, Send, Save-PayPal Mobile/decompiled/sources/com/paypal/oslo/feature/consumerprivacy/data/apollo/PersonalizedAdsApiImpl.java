package com.paypal.oslo.feature.consumerprivacy.data.apollo;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\b0\u00062\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/data/apollo/PersonalizedAdsApiImpl;", "Lcom/paypal/oslo/feature/consumerprivacy/data/apollo/PersonalizedAdsApi;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "Larrow/core/Ior;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/core/network/graphql/GraphQLData;", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetPersonalizedAdsConsentQuery$Data;", "getPersonalizedAdsPreference", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/api/graphql/schema/type/UpdatePersonalizedAdsInput;", "input", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/UpdatePersonalizedAdsConsentMutation$Data;", "updatePersonalizedAdsPreference", "(Lcom/paypal/oslo/api/graphql/schema/type/UpdatePersonalizedAdsInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/apollographql/apollo/ApolloClient;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PersonalizedAdsApiImpl implements com.paypal.oslo.feature.consumerprivacy.data.apollo.PersonalizedAdsApi {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public PersonalizedAdsApiImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.Camera2StreamConfigurationMap = apolloClient;
    }

    @Override // com.paypal.oslo.feature.consumerprivacy.data.apollo.PersonalizedAdsApi
    public final java.lang.Object getPersonalizedAdsPreference(kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.consumerprivacy.graphql.GetPersonalizedAdsConsentQuery.Data>>> continuation) {
        return com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default((com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.Camera2StreamConfigurationMap.query(new com.paypal.oslo.feature.consumerprivacy.graphql.GetPersonalizedAdsConsentQuery()), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly), null, continuation, 2, null);
    }

    @Override // com.paypal.oslo.feature.consumerprivacy.data.apollo.PersonalizedAdsApi
    public final java.lang.Object updatePersonalizedAdsPreference(com.paypal.oslo.api.graphql.schema.type.UpdatePersonalizedAdsInput updatePersonalizedAdsInput, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.consumerprivacy.graphql.UpdatePersonalizedAdsConsentMutation.Data>>> continuation) {
        return com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default((com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.Camera2StreamConfigurationMap.mutation(new com.paypal.oslo.feature.consumerprivacy.graphql.UpdatePersonalizedAdsConsentMutation(updatePersonalizedAdsInput)), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly), null, continuation, 2, null);
    }
}
