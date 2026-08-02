package com.paypal.oslo.feature.inappcheckout.di;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/di/InAppCheckoutActivityRetainedScopedRepositoryModule;", "", "Lcom/paypal/oslo/feature/inappcheckout/data/repository/BuyerInfoApiRepositoryImpl;", "impl", "Lcom/paypal/oslo/feature/inappcheckout/domain/repository/BuyerInfoApiRepository;", "bindBuyerInfoApiRepository", "(Lcom/paypal/oslo/feature/inappcheckout/data/repository/BuyerInfoApiRepositoryImpl;)Lcom/paypal/oslo/feature/inappcheckout/domain/repository/BuyerInfoApiRepository;", "Lcom/paypal/oslo/feature/inappcheckout/data/repository/TrackLatencyRepositoryImpl;", "Lcom/paypal/oslo/feature/inappcheckout/domain/repository/TrackLatencyRepository;", "bindTrackLatencyRepository", "(Lcom/paypal/oslo/feature/inappcheckout/data/repository/TrackLatencyRepositoryImpl;)Lcom/paypal/oslo/feature/inappcheckout/domain/repository/TrackLatencyRepository;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes13.dex */
public interface InAppCheckoutActivityRetainedScopedRepositoryModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutActivityRetainedScopedRepositoryModule.Companion INSTANCE = com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutActivityRetainedScopedRepositoryModule.Companion.getHighSpeedVideoSizes;

    @dagger.Binds
    com.paypal.oslo.feature.inappcheckout.domain.repository.BuyerInfoApiRepository bindBuyerInfoApiRepository(com.paypal.oslo.feature.inappcheckout.data.repository.BuyerInfoApiRepositoryImpl impl);

    @dagger.Binds
    com.paypal.oslo.feature.inappcheckout.domain.repository.TrackLatencyRepository bindTrackLatencyRepository(com.paypal.oslo.feature.inappcheckout.data.repository.TrackLatencyRepositoryImpl impl);

    @kotlin.Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u001c2\u0006\u0010\f\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001f\u0010 J'\u0010%\u001a\u00020$2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020!2\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b%\u0010&J'\u0010*\u001a\u00020)2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020'2\u0006\u0010\f\u001a\u00020(H\u0007¢\u0006\u0004\b*\u0010+J'\u0010/\u001a\u00020.2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020,2\u0006\u0010\f\u001a\u00020-H\u0007¢\u0006\u0004\b/\u00100J'\u00104\u001a\u0002032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u0002012\u0006\u0010\f\u001a\u000202H\u0007¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u0002072\u0006\u0010\f\u001a\u000206H\u0007¢\u0006\u0004\b8\u00109"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/di/InAppCheckoutActivityRetainedScopedRepositoryModule$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/inappcheckout/domain/repository/LatencyPairReportCallback;", "provideLatencyPairReportCallback", "()Lcom/paypal/oslo/feature/inappcheckout/domain/repository/LatencyPairReportCallback;", "Lcom/paypal/oslo/feature/inappcheckout/features/statsig/featureGate/FeatureGateManager;", "featureGateManager", "Lcom/paypal/oslo/feature/inappcheckout/data/repository/mock/MockInitializeNativeRypCheckoutRepository;", "mockRepository", "Lcom/paypal/oslo/feature/inappcheckout/data/repository/InitializeNativeRypCheckoutRepositoryImpl;", "apiRepository", "Lcom/paypal/oslo/feature/inappcheckout/domain/repository/InitializeNativeRypCheckoutRepository;", "bindInitializeNativeRypCheckoutRepository", "(Lcom/paypal/oslo/feature/inappcheckout/features/statsig/featureGate/FeatureGateManager;Lcom/paypal/oslo/feature/inappcheckout/data/repository/mock/MockInitializeNativeRypCheckoutRepository;Lcom/paypal/oslo/feature/inappcheckout/data/repository/InitializeNativeRypCheckoutRepositoryImpl;)Lcom/paypal/oslo/feature/inappcheckout/domain/repository/InitializeNativeRypCheckoutRepository;", "Lcom/paypal/oslo/feature/inappcheckout/data/repository/mock/MockAuthRepository;", "Lcom/paypal/oslo/feature/inappcheckout/data/repository/AuthRepositoryImpl;", "authRepository", "Lcom/paypal/oslo/feature/inappcheckout/domain/repository/AuthRepository;", "bindAuthRepository", "(Lcom/paypal/oslo/feature/inappcheckout/features/statsig/featureGate/FeatureGateManager;Lcom/paypal/oslo/feature/inappcheckout/data/repository/mock/MockAuthRepository;Lcom/paypal/oslo/feature/inappcheckout/data/repository/AuthRepositoryImpl;)Lcom/paypal/oslo/feature/inappcheckout/domain/repository/AuthRepository;", "Lcom/paypal/oslo/feature/inappcheckout/data/repository/mock/MockEConsentRepository;", "Lcom/paypal/oslo/feature/inappcheckout/data/repository/EConsentRepositoryImpl;", "eConsentRepository", "Lcom/paypal/oslo/feature/inappcheckout/domain/repository/EConsentRepository;", "bindEConsentRepository", "(Lcom/paypal/oslo/feature/inappcheckout/features/statsig/featureGate/FeatureGateManager;Lcom/paypal/oslo/feature/inappcheckout/data/repository/mock/MockEConsentRepository;Lcom/paypal/oslo/feature/inappcheckout/data/repository/EConsentRepositoryImpl;)Lcom/paypal/oslo/feature/inappcheckout/domain/repository/EConsentRepository;", "Lcom/paypal/oslo/feature/inappcheckout/data/repository/mock/MockFundingSelectionApiRepositoryImpl;", "Lcom/paypal/oslo/feature/inappcheckout/data/repository/FundingSelectionApiRepositoryImpl;", "Lcom/paypal/oslo/feature/inappcheckout/domain/repository/FundingSelectionApiRepository;", "bindFundingSelectionApiRepository", "(Lcom/paypal/oslo/feature/inappcheckout/features/statsig/featureGate/FeatureGateManager;Lcom/paypal/oslo/feature/inappcheckout/data/repository/mock/MockFundingSelectionApiRepositoryImpl;Lcom/paypal/oslo/feature/inappcheckout/data/repository/FundingSelectionApiRepositoryImpl;)Lcom/paypal/oslo/feature/inappcheckout/domain/repository/FundingSelectionApiRepository;", "Lcom/paypal/oslo/feature/inappcheckout/data/repository/mock/MockCardRepository;", "Lcom/paypal/oslo/feature/inappcheckout/data/repository/CardRepositoryImpl;", "cardRepository", "Lcom/paypal/oslo/feature/inappcheckout/domain/repository/CardRepository;", "provideCardRepository", "(Lcom/paypal/oslo/feature/inappcheckout/features/statsig/featureGate/FeatureGateManager;Lcom/paypal/oslo/feature/inappcheckout/data/repository/mock/MockCardRepository;Lcom/paypal/oslo/feature/inappcheckout/data/repository/CardRepositoryImpl;)Lcom/paypal/oslo/feature/inappcheckout/domain/repository/CardRepository;", "Lcom/paypal/oslo/feature/inappcheckout/data/repository/mock/MockCardFormDataRepository;", "Lcom/paypal/oslo/feature/inappcheckout/data/repository/CardFormDataRepositoryImpl;", "Lcom/paypal/oslo/feature/inappcheckout/domain/repository/CardFormDataRepository;", "provideCardFormDataRepository", "(Lcom/paypal/oslo/feature/inappcheckout/features/statsig/featureGate/FeatureGateManager;Lcom/paypal/oslo/feature/inappcheckout/data/repository/mock/MockCardFormDataRepository;Lcom/paypal/oslo/feature/inappcheckout/data/repository/CardFormDataRepositoryImpl;)Lcom/paypal/oslo/feature/inappcheckout/domain/repository/CardFormDataRepository;", "Lcom/paypal/oslo/feature/inappcheckout/data/repository/mock/MockUpdateCardRepository;", "Lcom/paypal/oslo/feature/inappcheckout/data/repository/UpdateCardRepositoryImpl;", "Lcom/paypal/oslo/feature/inappcheckout/domain/repository/UpdateCardRepository;", "provideUpdateCardRepository", "(Lcom/paypal/oslo/feature/inappcheckout/features/statsig/featureGate/FeatureGateManager;Lcom/paypal/oslo/feature/inappcheckout/data/repository/mock/MockUpdateCardRepository;Lcom/paypal/oslo/feature/inappcheckout/data/repository/UpdateCardRepositoryImpl;)Lcom/paypal/oslo/feature/inappcheckout/domain/repository/UpdateCardRepository;", "Lcom/paypal/oslo/feature/inappcheckout/data/repository/mock/MockAddCardRepository;", "Lcom/paypal/oslo/feature/inappcheckout/data/repository/AddCardRepositoryImpl;", "Lcom/paypal/oslo/feature/inappcheckout/domain/repository/AddCardRepository;", "provideAddCardRepository", "(Lcom/paypal/oslo/feature/inappcheckout/features/statsig/featureGate/FeatureGateManager;Lcom/paypal/oslo/feature/inappcheckout/data/repository/mock/MockAddCardRepository;Lcom/paypal/oslo/feature/inappcheckout/data/repository/AddCardRepositoryImpl;)Lcom/paypal/oslo/feature/inappcheckout/domain/repository/AddCardRepository;", "Lcom/paypal/oslo/feature/inappcheckout/data/repository/AutodetectCardRepositoryImpl;", "Lcom/paypal/oslo/feature/inappcheckout/domain/repository/AutodetectCardRepository;", "provideAutodetectCardRepository", "(Lcom/paypal/oslo/feature/inappcheckout/data/repository/AutodetectCardRepositoryImpl;)Lcom/paypal/oslo/feature/inappcheckout/domain/repository/AutodetectCardRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutActivityRetainedScopedRepositoryModule.Companion getHighSpeedVideoSizes = new com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutActivityRetainedScopedRepositoryModule.Companion();

        @dagger.Provides
        public final com.paypal.oslo.feature.inappcheckout.domain.repository.LatencyPairReportCallback provideLatencyPairReportCallback() {
            return null;
        }

        private Companion() {
        }

        @dagger.Provides
        public final com.paypal.oslo.feature.inappcheckout.domain.repository.InitializeNativeRypCheckoutRepository bindInitializeNativeRypCheckoutRepository(com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager featureGateManager, com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockInitializeNativeRypCheckoutRepository mockRepository, com.paypal.oslo.feature.inappcheckout.data.repository.InitializeNativeRypCheckoutRepositoryImpl apiRepository) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mockRepository, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apiRepository, "");
            if (featureGateManager.isMockAPIEnabled()) {
                return mockRepository;
            }
            return apiRepository;
        }

        @dagger.Provides
        public final com.paypal.oslo.feature.inappcheckout.domain.repository.AuthRepository bindAuthRepository(com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager featureGateManager, com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockAuthRepository mockRepository, com.paypal.oslo.feature.inappcheckout.data.repository.AuthRepositoryImpl authRepository) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mockRepository, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authRepository, "");
            if (featureGateManager.isMockAPIEnabled()) {
                return mockRepository;
            }
            return authRepository;
        }

        @dagger.Provides
        public final com.paypal.oslo.feature.inappcheckout.domain.repository.EConsentRepository bindEConsentRepository(com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager featureGateManager, com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockEConsentRepository mockRepository, com.paypal.oslo.feature.inappcheckout.data.repository.EConsentRepositoryImpl eConsentRepository) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mockRepository, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eConsentRepository, "");
            if (featureGateManager.isMockAPIEnabled()) {
                return mockRepository;
            }
            return eConsentRepository;
        }

        @dagger.Provides
        public final com.paypal.oslo.feature.inappcheckout.domain.repository.FundingSelectionApiRepository bindFundingSelectionApiRepository(com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager featureGateManager, com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockFundingSelectionApiRepositoryImpl mockRepository, com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl apiRepository) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mockRepository, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apiRepository, "");
            if (featureGateManager.isMockAPIEnabled()) {
                return mockRepository;
            }
            return apiRepository;
        }

        @dagger.Provides
        public final com.paypal.oslo.feature.inappcheckout.domain.repository.CardRepository provideCardRepository(com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager featureGateManager, com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardRepository mockRepository, com.paypal.oslo.feature.inappcheckout.data.repository.CardRepositoryImpl cardRepository) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mockRepository, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardRepository, "");
            if (featureGateManager.isMockAPIEnabled()) {
                return mockRepository;
            }
            return cardRepository;
        }

        @dagger.Provides
        public final com.paypal.oslo.feature.inappcheckout.domain.repository.CardFormDataRepository provideCardFormDataRepository(com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager featureGateManager, com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardFormDataRepository mockRepository, com.paypal.oslo.feature.inappcheckout.data.repository.CardFormDataRepositoryImpl apiRepository) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mockRepository, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apiRepository, "");
            if (featureGateManager.isMockAPIEnabled()) {
                return mockRepository;
            }
            return apiRepository;
        }

        @dagger.Provides
        public final com.paypal.oslo.feature.inappcheckout.domain.repository.UpdateCardRepository provideUpdateCardRepository(com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager featureGateManager, com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockUpdateCardRepository mockRepository, com.paypal.oslo.feature.inappcheckout.data.repository.UpdateCardRepositoryImpl apiRepository) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mockRepository, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apiRepository, "");
            if (featureGateManager.isMockAPIEnabled()) {
                return mockRepository;
            }
            return apiRepository;
        }

        @dagger.Provides
        public final com.paypal.oslo.feature.inappcheckout.domain.repository.AddCardRepository provideAddCardRepository(com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager featureGateManager, com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockAddCardRepository mockRepository, com.paypal.oslo.feature.inappcheckout.data.repository.AddCardRepositoryImpl apiRepository) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mockRepository, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apiRepository, "");
            if (featureGateManager.isMockAPIEnabled()) {
                return mockRepository;
            }
            return apiRepository;
        }

        @dagger.Provides
        public final com.paypal.oslo.feature.inappcheckout.domain.repository.AutodetectCardRepository provideAutodetectCardRepository(com.paypal.oslo.feature.inappcheckout.data.repository.AutodetectCardRepositoryImpl apiRepository) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apiRepository, "");
            return apiRepository;
        }
    }
}
