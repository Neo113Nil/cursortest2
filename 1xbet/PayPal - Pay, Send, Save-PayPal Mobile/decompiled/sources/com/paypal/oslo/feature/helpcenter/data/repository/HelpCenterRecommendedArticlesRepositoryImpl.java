package com.paypal.oslo.feature.helpcenter.data.repository;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\bH\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/data/repository/HelpCenterRecommendedArticlesRepositoryImpl;", "Lcom/paypal/oslo/feature/helpcenter/domain/repository/HelpCenterRecommendedArticlesRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "<init>", "(Lcom/apollographql/apollo/ApolloClient;Lkotlinx/coroutines/CoroutineDispatcher;)V", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/helpcenter/domain/models/HelpCenterDomainError;", "", "Lcom/paypal/oslo/feature/helpcenter/domain/models/RecommendedArticleData;", "fetchRecommendedArticles", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/apollographql/apollo/ApolloClient;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/CoroutineDispatcher;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HelpCenterRecommendedArticlesRepositoryImpl implements com.paypal.oslo.feature.helpcenter.domain.repository.HelpCenterRecommendedArticlesRepository {
    public static final int $stable = 8;
    private final kotlinx.coroutines.CoroutineDispatcher getHighResolutionOutputSizeshNQ4ISI;
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public HelpCenterRecommendedArticlesRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.getHighSpeedVideoFpsRangesFor = apolloClient;
        this.getHighResolutionOutputSizeshNQ4ISI = coroutineDispatcher;
    }

    @Override // com.paypal.oslo.feature.helpcenter.domain.repository.HelpCenterRecommendedArticlesRepository
    public final java.lang.Object fetchRecommendedArticles(kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.helpcenter.domain.models.HelpCenterDomainError, ? extends java.util.List<com.paypal.oslo.feature.helpcenter.domain.models.RecommendedArticleData>>> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.getHighResolutionOutputSizeshNQ4ISI, new com.paypal.oslo.feature.helpcenter.data.repository.HelpCenterRecommendedArticlesRepositoryImpl$fetchRecommendedArticles$2(this, null), continuation);
    }

    public static final /* synthetic */ com.paypal.oslo.feature.helpcenter.domain.models.HelpCenterGenericError access$handleError(com.paypal.oslo.feature.helpcenter.data.repository.HelpCenterRecommendedArticlesRepositoryImpl helpCenterRecommendedArticlesRepositoryImpl, com.paypal.oslo.core.network.graphql.error.CallError callError) {
        return new com.paypal.oslo.feature.helpcenter.domain.models.HelpCenterGenericError(null, callError, 1, null);
    }

    public static final /* synthetic */ void access$logResponse(com.paypal.oslo.feature.helpcenter.data.repository.HelpCenterRecommendedArticlesRepositoryImpl helpCenterRecommendedArticlesRepositoryImpl, com.paypal.oslo.core.network.graphql.error.CallError callError, com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterRecommendedArticlesQuery.Data data, java.util.List list) {
        if (callError != null) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.helpcenter.LoggerKt.log;
            kotlin.Pair[] pairArr = new kotlin.Pair[3];
            pairArr[0] = kotlin.TuplesKt.to("articleCount", java.lang.Integer.valueOf(list.size()));
            pairArr[1] = kotlin.TuplesKt.to("hasData", java.lang.Boolean.valueOf(data != null));
            pairArr[2] = kotlin.TuplesKt.to("error", callError.toString());
            com.paypal.android.logger.Logger.d$default(logger, "Received partial response", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
            return;
        }
        com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.helpcenter.LoggerKt.log;
        kotlin.Pair[] pairArr2 = new kotlin.Pair[2];
        pairArr2[0] = kotlin.TuplesKt.to("articleCount", java.lang.Integer.valueOf(list.size()));
        pairArr2[1] = kotlin.TuplesKt.to("hasData", java.lang.Boolean.valueOf(data != null));
        com.paypal.android.logger.Logger.d$default(logger2, "Successfully fetched articles", kotlin.collections.MapsKt.mapOf(pairArr2), null, 4, null);
    }
}
