package com.paypal.oslo.feature.helpcenter.data.repository;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/data/repository/ArticleRepositoryImpl;", "Lcom/paypal/oslo/feature/helpcenter/domain/repository/ArticleRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "<init>", "(Lcom/apollographql/apollo/ApolloClient;Lkotlinx/coroutines/CoroutineDispatcher;)V", "", "articleId", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/helpcenter/domain/models/HelpCenterDomainError;", "Lcom/paypal/oslo/feature/helpcenter/domain/models/Article;", "fetchArticle", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/apollographql/apollo/ApolloClient;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/CoroutineDispatcher;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ArticleRepositoryImpl implements com.paypal.oslo.feature.helpcenter.domain.repository.ArticleRepository {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public ArticleRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.Camera2StreamConfigurationMap = apolloClient;
        this.getHighSpeedVideoFpsRangesFor = coroutineDispatcher;
    }

    @Override // com.paypal.oslo.feature.helpcenter.domain.repository.ArticleRepository
    public final java.lang.Object fetchArticle(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.helpcenter.domain.models.HelpCenterDomainError, com.paypal.oslo.feature.helpcenter.domain.models.Article>> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.getHighSpeedVideoFpsRangesFor, new com.paypal.oslo.feature.helpcenter.data.repository.ArticleRepositoryImpl$fetchArticle$2(str, this, null), continuation);
    }

    public static final /* synthetic */ com.paypal.oslo.feature.helpcenter.domain.models.HelpCenterGenericError access$handleError(com.paypal.oslo.feature.helpcenter.data.repository.ArticleRepositoryImpl articleRepositoryImpl, com.paypal.oslo.core.network.graphql.error.CallError callError) {
        return new com.paypal.oslo.feature.helpcenter.domain.models.HelpCenterGenericError(null, callError, 1, null);
    }

    public static final /* synthetic */ void access$logResponse(com.paypal.oslo.feature.helpcenter.data.repository.ArticleRepositoryImpl articleRepositoryImpl, com.paypal.oslo.core.network.graphql.error.CallError callError, com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery.HelpArticle helpArticle) {
        if (callError != null) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.helpcenter.LoggerKt.log, "HelpArticle partial response", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("articleId", helpArticle.getId()), kotlin.TuplesKt.to("errorType", callError.getClass().getSimpleName())), null, 4, null);
        }
    }
}
