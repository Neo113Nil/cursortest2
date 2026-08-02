package com.paypal.oslo.feature.helpcenter.di;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/di/HelpCenterDataModule;", "", "Lcom/paypal/oslo/feature/helpcenter/data/repository/HelpCenterRecommendedArticlesRepositoryImpl;", "impl", "Lcom/paypal/oslo/feature/helpcenter/domain/repository/HelpCenterRecommendedArticlesRepository;", "bindHelpCenterRecommendedArticlesRepository", "(Lcom/paypal/oslo/feature/helpcenter/data/repository/HelpCenterRecommendedArticlesRepositoryImpl;)Lcom/paypal/oslo/feature/helpcenter/domain/repository/HelpCenterRecommendedArticlesRepository;", "Lcom/paypal/oslo/feature/helpcenter/data/repository/SearchArticlesRepositoryImpl;", "Lcom/paypal/oslo/feature/helpcenter/domain/repository/SearchArticlesRepository;", "bindSearchArticlesRepository", "(Lcom/paypal/oslo/feature/helpcenter/data/repository/SearchArticlesRepositoryImpl;)Lcom/paypal/oslo/feature/helpcenter/domain/repository/SearchArticlesRepository;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes5.dex */
public interface HelpCenterDataModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.helpcenter.di.HelpCenterDataModule.Companion INSTANCE = com.paypal.oslo.feature.helpcenter.di.HelpCenterDataModule.Companion.getHighSpeedVideoFpsRanges;

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.helpcenter.domain.repository.HelpCenterRecommendedArticlesRepository bindHelpCenterRecommendedArticlesRepository(com.paypal.oslo.feature.helpcenter.data.repository.HelpCenterRecommendedArticlesRepositoryImpl impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.helpcenter.domain.repository.SearchArticlesRepository bindSearchArticlesRepository(com.paypal.oslo.feature.helpcenter.data.repository.SearchArticlesRepositoryImpl impl);

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/di/HelpCenterDataModule$Companion;", "", "<init>", "()V", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "Lcom/paypal/oslo/feature/helpcenter/domain/repository/ArticleRepository;", "provideArticleRepository", "(Lcom/apollographql/apollo/ApolloClient;Lkotlinx/coroutines/CoroutineDispatcher;)Lcom/paypal/oslo/feature/helpcenter/domain/repository/ArticleRepository;", "Lcom/paypal/oslo/feature/helpcenter/domain/repository/IpsArticlesRepository;", "provideIpsArticlesRepository", "(Lcom/apollographql/apollo/ApolloClient;Lkotlinx/coroutines/CoroutineDispatcher;)Lcom/paypal/oslo/feature/helpcenter/domain/repository/IpsArticlesRepository;", "Lcom/paypal/oslo/feature/helpcenter/domain/repository/ContactUsRepository;", "provideContactUsRepository", "(Lcom/apollographql/apollo/ApolloClient;Lkotlinx/coroutines/CoroutineDispatcher;)Lcom/paypal/oslo/feature/helpcenter/domain/repository/ContactUsRepository;", "Lcom/paypal/oslo/feature/helpcenter/domain/repository/CallUsRepository;", "provideCallUsRepository", "(Lcom/apollographql/apollo/ApolloClient;Lkotlinx/coroutines/CoroutineDispatcher;)Lcom/paypal/oslo/feature/helpcenter/domain/repository/CallUsRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.paypal.oslo.feature.helpcenter.di.HelpCenterDataModule.Companion getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.helpcenter.di.HelpCenterDataModule.Companion();

        private Companion() {
        }

        @dagger.Provides
        @javax.inject.Singleton
        public final com.paypal.oslo.feature.helpcenter.domain.repository.ArticleRepository provideArticleRepository(com.apollographql.apollo.ApolloClient apolloClient, kotlinx.coroutines.CoroutineDispatcher ioDispatcher) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ioDispatcher, "");
            return new com.paypal.oslo.feature.helpcenter.data.repository.ArticleRepositoryImpl(apolloClient, ioDispatcher);
        }

        @dagger.Provides
        @javax.inject.Singleton
        public final com.paypal.oslo.feature.helpcenter.domain.repository.IpsArticlesRepository provideIpsArticlesRepository(com.apollographql.apollo.ApolloClient apolloClient, kotlinx.coroutines.CoroutineDispatcher ioDispatcher) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ioDispatcher, "");
            return new com.paypal.oslo.feature.helpcenter.data.repository.IpsArticlesRepositoryImpl(apolloClient, ioDispatcher);
        }

        @dagger.Provides
        @javax.inject.Singleton
        public final com.paypal.oslo.feature.helpcenter.domain.repository.ContactUsRepository provideContactUsRepository(com.apollographql.apollo.ApolloClient apolloClient, kotlinx.coroutines.CoroutineDispatcher ioDispatcher) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ioDispatcher, "");
            return new com.paypal.oslo.feature.helpcenter.data.repository.ContactUsRepositoryImpl(apolloClient, ioDispatcher);
        }

        @dagger.Provides
        @javax.inject.Singleton
        public final com.paypal.oslo.feature.helpcenter.domain.repository.CallUsRepository provideCallUsRepository(com.apollographql.apollo.ApolloClient apolloClient, kotlinx.coroutines.CoroutineDispatcher ioDispatcher) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ioDispatcher, "");
            return new com.paypal.oslo.feature.helpcenter.data.repository.CallUsRepositoryImpl(apolloClient, ioDispatcher);
        }
    }
}
