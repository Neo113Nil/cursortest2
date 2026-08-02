package com.paypal.oslo.feature.cryptocurrency.di;

@kotlin.Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010!\u001a\u00020 2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u001fH\u0007¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020#H\u0007¢\u0006\u0004\b%\u0010&J'\u0010*\u001a\u00020)2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020'2\u0006\u0010\u0005\u001a\u00020(H\u0007¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020-2\u0006\u0010\u0005\u001a\u00020,H\u0007¢\u0006\u0004\b.\u0010/"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/di/RepositoryModule;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/cryptocurrency/data/repository/holdings/CryptoHoldingsRepositoryImpl;", "realRepository", "Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/holdings/CryptoHoldingsRepository;", "provideCryptoHoldingsRepository", "(Lcom/paypal/oslo/feature/cryptocurrency/data/repository/holdings/CryptoHoldingsRepositoryImpl;)Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/holdings/CryptoHoldingsRepository;", "Lcom/paypal/oslo/feature/cryptocurrency/data/repository/prices/CryptoMarketPricesRepositoryImpl;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/prices/CryptoMarketPricesRepository;", "provideCryptoMarketPricesRepository", "(Lcom/paypal/oslo/feature/cryptocurrency/data/repository/prices/CryptoMarketPricesRepositoryImpl;)Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/prices/CryptoMarketPricesRepository;", "Lcom/paypal/oslo/feature/cryptocurrency/data/repository/preferences/CryptoPreferencesRepositoryImpl;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/preferences/CryptoPreferencesRepository;", "provideCryptoPreferencesRepository", "(Lcom/paypal/oslo/feature/cryptocurrency/data/repository/preferences/CryptoPreferencesRepositoryImpl;)Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/preferences/CryptoPreferencesRepository;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/gates/FeatureGateManager;", "featureGateManager", "Lcom/paypal/oslo/feature/cryptocurrency/data/repository/mock/MockCryptoFundingRepository;", "mockRepository", "Lcom/paypal/oslo/feature/cryptocurrency/data/repository/funding/CryptoFundingRepositoryImpl;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/funding/CryptoFundingRepository;", "provideCryptoFundingRepository", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/gates/FeatureGateManager;Lcom/paypal/oslo/feature/cryptocurrency/data/repository/mock/MockCryptoFundingRepository;Lcom/paypal/oslo/feature/cryptocurrency/data/repository/funding/CryptoFundingRepositoryImpl;)Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/funding/CryptoFundingRepository;", "Lcom/paypal/oslo/feature/cryptocurrency/data/repository/mock/MockCryptoQuoteRepository;", "Lcom/paypal/oslo/feature/cryptocurrency/data/repository/quote/CryptoQuoteRepositoryImpl;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/quote/CryptoQuoteRepository;", "provideCryptoQuoteRepository", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/gates/FeatureGateManager;Lcom/paypal/oslo/feature/cryptocurrency/data/repository/mock/MockCryptoQuoteRepository;Lcom/paypal/oslo/feature/cryptocurrency/data/repository/quote/CryptoQuoteRepositoryImpl;)Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/quote/CryptoQuoteRepository;", "Lcom/paypal/oslo/feature/cryptocurrency/data/repository/mock/MockCryptoTradeRepository;", "Lcom/paypal/oslo/feature/cryptocurrency/data/repository/trade/CryptoTradeRepositoryImpl;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/trade/CryptoTradeRepository;", "provideCryptoTradeRepository", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/gates/FeatureGateManager;Lcom/paypal/oslo/feature/cryptocurrency/data/repository/mock/MockCryptoTradeRepository;Lcom/paypal/oslo/feature/cryptocurrency/data/repository/trade/CryptoTradeRepositoryImpl;)Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/trade/CryptoTradeRepository;", "Lcom/paypal/oslo/feature/cryptocurrency/data/repository/subscriptions/CryptoSubscriptionCapabilitiesRepositoryImpl;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/subscriptions/CryptoSubscriptionCapabilitiesRepository;", "provideCryptoSubscriptionCapabilitiesRepository", "(Lcom/paypal/oslo/feature/cryptocurrency/data/repository/subscriptions/CryptoSubscriptionCapabilitiesRepositoryImpl;)Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/subscriptions/CryptoSubscriptionCapabilitiesRepository;", "Lcom/paypal/oslo/feature/cryptocurrency/data/repository/mock/MockCryptoRolloverRepository;", "Lcom/paypal/oslo/feature/cryptocurrency/data/repository/rollover/CryptoRolloverRepositoryImpl;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/rollover/CryptoRolloverRepository;", "provideCryptoRolloverRepository", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/gates/FeatureGateManager;Lcom/paypal/oslo/feature/cryptocurrency/data/repository/mock/MockCryptoRolloverRepository;Lcom/paypal/oslo/feature/cryptocurrency/data/repository/rollover/CryptoRolloverRepositoryImpl;)Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/rollover/CryptoRolloverRepository;", "Lcom/paypal/oslo/feature/cryptocurrency/data/repository/receive/CryptoReceiveRepositoryImpl;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/receive/CryptoReceiveRepository;", "provideCryptoReceiveRepository", "(Lcom/paypal/oslo/feature/cryptocurrency/data/repository/receive/CryptoReceiveRepositoryImpl;)Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/receive/CryptoReceiveRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes12.dex */
public final class RepositoryModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.cryptocurrency.di.RepositoryModule INSTANCE = new com.paypal.oslo.feature.cryptocurrency.di.RepositoryModule();

    private RepositoryModule() {
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.cryptocurrency.domain.repository.holdings.CryptoHoldingsRepository provideCryptoHoldingsRepository(com.paypal.oslo.feature.cryptocurrency.data.repository.holdings.CryptoHoldingsRepositoryImpl realRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realRepository, "");
        return realRepository;
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.cryptocurrency.domain.repository.prices.CryptoMarketPricesRepository provideCryptoMarketPricesRepository(com.paypal.oslo.feature.cryptocurrency.data.repository.prices.CryptoMarketPricesRepositoryImpl realRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realRepository, "");
        return realRepository;
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.cryptocurrency.domain.repository.preferences.CryptoPreferencesRepository provideCryptoPreferencesRepository(com.paypal.oslo.feature.cryptocurrency.data.repository.preferences.CryptoPreferencesRepositoryImpl realRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realRepository, "");
        return realRepository;
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.cryptocurrency.domain.repository.funding.CryptoFundingRepository provideCryptoFundingRepository(com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager featureGateManager, com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoFundingRepository mockRepository, com.paypal.oslo.feature.cryptocurrency.data.repository.funding.CryptoFundingRepositoryImpl realRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mockRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realRepository, "");
        if (featureGateManager.isMockApiEnabled()) {
            return mockRepository;
        }
        return realRepository;
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.cryptocurrency.domain.repository.quote.CryptoQuoteRepository provideCryptoQuoteRepository(com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager featureGateManager, com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoQuoteRepository mockRepository, com.paypal.oslo.feature.cryptocurrency.data.repository.quote.CryptoQuoteRepositoryImpl realRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mockRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realRepository, "");
        if (featureGateManager.isMockApiEnabled()) {
            return mockRepository;
        }
        return realRepository;
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.cryptocurrency.domain.repository.trade.CryptoTradeRepository provideCryptoTradeRepository(com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager featureGateManager, com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoTradeRepository mockRepository, com.paypal.oslo.feature.cryptocurrency.data.repository.trade.CryptoTradeRepositoryImpl realRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mockRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realRepository, "");
        if (featureGateManager.isMockApiEnabled()) {
            return mockRepository;
        }
        return realRepository;
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.cryptocurrency.domain.repository.subscriptions.CryptoSubscriptionCapabilitiesRepository provideCryptoSubscriptionCapabilitiesRepository(com.paypal.oslo.feature.cryptocurrency.data.repository.subscriptions.CryptoSubscriptionCapabilitiesRepositoryImpl realRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realRepository, "");
        return realRepository;
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.cryptocurrency.domain.repository.rollover.CryptoRolloverRepository provideCryptoRolloverRepository(com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager featureGateManager, com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoRolloverRepository mockRepository, com.paypal.oslo.feature.cryptocurrency.data.repository.rollover.CryptoRolloverRepositoryImpl realRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mockRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realRepository, "");
        if (featureGateManager.isMockApiEnabled()) {
            return mockRepository;
        }
        return realRepository;
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.cryptocurrency.domain.repository.receive.CryptoReceiveRepository provideCryptoReceiveRepository(com.paypal.oslo.feature.cryptocurrency.data.repository.receive.CryptoReceiveRepositoryImpl realRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realRepository, "");
        return realRepository;
    }
}
