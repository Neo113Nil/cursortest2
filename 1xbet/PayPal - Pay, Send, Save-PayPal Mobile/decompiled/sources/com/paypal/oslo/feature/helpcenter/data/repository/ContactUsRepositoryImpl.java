package com.paypal.oslo.feature.helpcenter.data.repository;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\bH\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/data/repository/ContactUsRepositoryImpl;", "Lcom/paypal/oslo/feature/helpcenter/domain/repository/ContactUsRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "<init>", "(Lcom/apollographql/apollo/ApolloClient;Lkotlinx/coroutines/CoroutineDispatcher;)V", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/helpcenter/domain/models/HelpCenterDomainError;", "", "Lcom/paypal/oslo/feature/helpcenter/domain/models/ContactTopic;", "fetchContactUsTopics", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/apollographql/apollo/ApolloClient;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/CoroutineDispatcher;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ContactUsRepositoryImpl implements com.paypal.oslo.feature.helpcenter.domain.repository.ContactUsRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public ContactUsRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.getHighSpeedVideoFpsRangesFor = apolloClient;
        this.Camera2StreamConfigurationMap = coroutineDispatcher;
    }

    @Override // com.paypal.oslo.feature.helpcenter.domain.repository.ContactUsRepository
    public final java.lang.Object fetchContactUsTopics(kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.helpcenter.domain.models.HelpCenterDomainError, ? extends java.util.List<com.paypal.oslo.feature.helpcenter.domain.models.ContactTopic>>> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.Camera2StreamConfigurationMap, new com.paypal.oslo.feature.helpcenter.data.repository.ContactUsRepositoryImpl$fetchContactUsTopics$2(this, null), continuation);
    }

    public static final /* synthetic */ com.paypal.oslo.feature.helpcenter.domain.models.HelpCenterGenericError access$handleError(com.paypal.oslo.feature.helpcenter.data.repository.ContactUsRepositoryImpl contactUsRepositoryImpl, com.paypal.oslo.core.network.graphql.error.CallError callError) {
        return new com.paypal.oslo.feature.helpcenter.domain.models.HelpCenterGenericError(null, callError, 1, null);
    }

    public static final /* synthetic */ java.util.Map access$toLogAttributes(com.paypal.oslo.feature.helpcenter.data.repository.ContactUsRepositoryImpl contactUsRepositoryImpl, com.paypal.oslo.core.network.graphql.error.CallError callError) {
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            com.paypal.oslo.core.network.http.error.NetworkError error = ((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError).getError();
            if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError) {
                return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", "Network.Http"), kotlin.TuplesKt.to("httpCode", java.lang.Integer.valueOf(((com.paypal.oslo.core.network.http.error.NetworkError.HttpError) error).getCode())));
            }
            if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) {
                return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", "Network.NoInternet"));
            }
            if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) {
                return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", "Network.Unknown"));
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.core.network.graphql.error.CallError.GraphQL graphQL = (com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError;
        return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", "GraphQL"), kotlin.TuplesKt.to("isCritical", java.lang.Boolean.valueOf(graphQL.isCritical())), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.ERROR_COUNT, java.lang.Integer.valueOf(arrow.core.NonEmptyList.m9584getSizeimpl(graphQL.m11659getErrors1X0FAY()))));
    }
}
