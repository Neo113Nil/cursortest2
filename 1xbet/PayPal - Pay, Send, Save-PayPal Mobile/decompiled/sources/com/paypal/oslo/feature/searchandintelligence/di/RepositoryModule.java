package com.paypal.oslo.feature.searchandintelligence.di;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/di/RepositoryModule;", "", "Lcom/paypal/oslo/feature/searchandintelligence/data/repository/ChatRepositoryImpl;", "impl", "Lcom/paypal/oslo/feature/searchandintelligence/domain/repository/ChatRepository;", "bindChatRepository", "(Lcom/paypal/oslo/feature/searchandintelligence/data/repository/ChatRepositoryImpl;)Lcom/paypal/oslo/feature/searchandintelligence/domain/repository/ChatRepository;", "Lcom/paypal/oslo/feature/searchandintelligence/data/repository/CommerceItemRepositoryImpl;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/repository/CommerceItemRepository;", "bindCommerceItemRepository", "(Lcom/paypal/oslo/feature/searchandintelligence/data/repository/CommerceItemRepositoryImpl;)Lcom/paypal/oslo/feature/searchandintelligence/domain/repository/CommerceItemRepository;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes14.dex */
public interface RepositoryModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.searchandintelligence.di.RepositoryModule.Companion INSTANCE = com.paypal.oslo.feature.searchandintelligence.di.RepositoryModule.Companion.getHighSpeedVideoFpsRanges;

    @dagger.Binds
    com.paypal.oslo.feature.searchandintelligence.domain.repository.ChatRepository bindChatRepository(com.paypal.oslo.feature.searchandintelligence.data.repository.ChatRepositoryImpl impl);

    @dagger.Binds
    com.paypal.oslo.feature.searchandintelligence.domain.repository.CommerceItemRepository bindCommerceItemRepository(com.paypal.oslo.feature.searchandintelligence.data.repository.CommerceItemRepositoryImpl impl);

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/di/RepositoryModule$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/searchandintelligence/api/config/SearchAndIntelligenceConfigManager;", "configManager", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/searchandintelligence/domain/repository/StartersRepository;", "provideStartersRepository", "(Lcom/paypal/oslo/feature/searchandintelligence/api/config/SearchAndIntelligenceConfigManager;Lcom/apollographql/apollo/ApolloClient;)Lcom/paypal/oslo/feature/searchandintelligence/domain/repository/StartersRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.paypal.oslo.feature.searchandintelligence.di.RepositoryModule.Companion getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.searchandintelligence.di.RepositoryModule.Companion();

        private Companion() {
        }

        @dagger.Provides
        public final com.paypal.oslo.feature.searchandintelligence.domain.repository.StartersRepository provideStartersRepository(com.paypal.oslo.feature.searchandintelligence.api.config.SearchAndIntelligenceConfigManager configManager, com.apollographql.apollo.ApolloClient apolloClient) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configManager, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
            return com.paypal.oslo.feature.searchandintelligence.data.repository.StartersRepositoryFactory.INSTANCE.create(configManager, apolloClient);
        }
    }
}
