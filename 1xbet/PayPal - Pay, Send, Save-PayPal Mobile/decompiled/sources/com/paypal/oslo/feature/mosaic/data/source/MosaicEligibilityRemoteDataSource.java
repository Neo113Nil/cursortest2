package com.paypal.oslo.feature.mosaic.data.source;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J.\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0086@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/data/source/MosaicEligibilityRemoteDataSource;", "", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "Lcom/paypal/oslo/api/graphql/schema/type/MosaicPageEligibilityInput;", "Lcom/paypal/oslo/feature/mosaic/graphql/type/MosaicPageEligibilityInput;", "input", "Larrow/core/Ior;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/core/network/graphql/GraphQLData;", "Lcom/paypal/oslo/feature/mosaic/graphql/GetMosaicPageEligibilityQuery$Data;", "getEligibility", "(Lcom/paypal/oslo/api/graphql/schema/type/MosaicPageEligibilityInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/apollographql/apollo/ApolloClient;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MosaicEligibilityRemoteDataSource {
    public static final int $stable = 8;
    private final com.apollographql.apollo.ApolloClient Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public MosaicEligibilityRemoteDataSource(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.Camera2StreamConfigurationMap = apolloClient;
    }

    public final java.lang.Object getEligibility(com.paypal.oslo.api.graphql.schema.type.MosaicPageEligibilityInput mosaicPageEligibilityInput, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.mosaic.graphql.GetMosaicPageEligibilityQuery.Data>>> continuation) {
        return com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(this.Camera2StreamConfigurationMap.query(new com.paypal.oslo.feature.mosaic.graphql.GetMosaicPageEligibilityQuery(mosaicPageEligibilityInput)), null, continuation, 2, null);
    }
}
