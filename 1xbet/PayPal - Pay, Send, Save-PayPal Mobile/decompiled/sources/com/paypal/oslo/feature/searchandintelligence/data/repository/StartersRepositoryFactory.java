package com.paypal.oslo.feature.searchandintelligence.data.repository;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/data/repository/StartersRepositoryFactory;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/searchandintelligence/api/config/SearchAndIntelligenceConfigManager;", "configManager", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/searchandintelligence/domain/repository/StartersRepository;", "create", "(Lcom/paypal/oslo/feature/searchandintelligence/api/config/SearchAndIntelligenceConfigManager;Lcom/apollographql/apollo/ApolloClient;)Lcom/paypal/oslo/feature/searchandintelligence/domain/repository/StartersRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class StartersRepositoryFactory {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.searchandintelligence.data.repository.StartersRepositoryFactory INSTANCE = new com.paypal.oslo.feature.searchandintelligence.data.repository.StartersRepositoryFactory();

    private StartersRepositoryFactory() {
    }

    public final com.paypal.oslo.feature.searchandintelligence.domain.repository.StartersRepository create(com.paypal.oslo.feature.searchandintelligence.api.config.SearchAndIntelligenceConfigManager configManager, com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        if (configManager.isMockQuickStartPromptsEnabled()) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.searchandintelligence.LoggerKt.log, "**** Using Mock Quick Start Prompts Repository ****", null, null, 6, null);
            return new com.paypal.oslo.feature.searchandintelligence.data.repository.mock.MockStartersRepository();
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.searchandintelligence.LoggerKt.log, "Using Real Quick Start Prompts Repository", null, null, 6, null);
        return new com.paypal.oslo.feature.searchandintelligence.data.repository.StartersRepositoryImpl(apolloClient);
    }
}
