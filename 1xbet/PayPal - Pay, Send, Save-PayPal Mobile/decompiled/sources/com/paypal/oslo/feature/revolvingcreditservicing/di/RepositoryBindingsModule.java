package com.paypal.oslo.feature.revolvingcreditservicing.di;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u0000 \f2\u00020\u0001:\u0001\fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\n\u0010\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/di/RepositoryBindingsModule;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/ProductCapabilityRepositoryImpl;", "productCapabilityRepository", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/ProductCapabilityRepository;", "bindProductCapabilityRepository", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/ProductCapabilityRepositoryImpl;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/ProductCapabilityRepository;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/SpecialFinancingRepositoryImpl;", "repository", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/SpecialFinancingRepository;", "bindSpecialFinancingRepository", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/SpecialFinancingRepositoryImpl;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/SpecialFinancingRepository;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes14.dex */
public interface RepositoryBindingsModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.revolvingcreditservicing.di.RepositoryBindingsModule.Companion INSTANCE = com.paypal.oslo.feature.revolvingcreditservicing.di.RepositoryBindingsModule.Companion.getHighSpeedVideoFpsRanges;

    @dagger.Binds
    com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.ProductCapabilityRepository bindProductCapabilityRepository(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.ProductCapabilityRepositoryImpl productCapabilityRepository);

    @dagger.Binds
    com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.SpecialFinancingRepository bindSpecialFinancingRepository(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.SpecialFinancingRepositoryImpl repository);

    @kotlin.Metadata(d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b$\u0010%J'\u0010)\u001a\u00020(2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020&2\u0006\u0010\t\u001a\u00020'H\u0007¢\u0006\u0004\b)\u0010*J'\u00100\u001a\u00020/2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0007¢\u0006\u0004\b0\u00101J'\u00105\u001a\u0002042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u0002022\u0006\u0010\t\u001a\u000203H\u0007¢\u0006\u0004\b5\u00106J'\u0010:\u001a\u0002092\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u0002072\u0006\u0010\t\u001a\u000208H\u0007¢\u0006\u0004\b:\u0010;J'\u0010?\u001a\u00020>2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020<2\u0006\u0010\t\u001a\u00020=H\u0007¢\u0006\u0004\b?\u0010@J'\u0010D\u001a\u00020C2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020A2\u0006\u0010\t\u001a\u00020BH\u0007¢\u0006\u0004\bD\u0010EJ'\u0010I\u001a\u00020H2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020F2\u0006\u0010\t\u001a\u00020GH\u0007¢\u0006\u0004\bI\u0010J"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/di/RepositoryBindingsModule$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/remoteConfig/featureFlags/FeatureGateManager;", "featureGateManager", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/mock/MockPaymentOptionsRepository;", "mock", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/PaymentOptionsRepositoryImpl;", "real", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/PaymentOptionsRepository;", "providePaymentOptionsRepository", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/remoteConfig/featureFlags/FeatureGateManager;Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/mock/MockPaymentOptionsRepository;Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/PaymentOptionsRepositoryImpl;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/PaymentOptionsRepository;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/mock/MockCardActivationRepository;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/CardActivationRepositoryImpl;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/CardActivationRepository;", "provideCardActivationRepository", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/remoteConfig/featureFlags/FeatureGateManager;Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/mock/MockCardActivationRepository;Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/CardActivationRepositoryImpl;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/CardActivationRepository;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/mock/MockCLIRepository;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/CLIRepositoryImpl;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/CLIRepository;", "provideCLIRepository", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/remoteConfig/featureFlags/FeatureGateManager;Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/mock/MockCLIRepository;Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/CLIRepositoryImpl;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/CLIRepository;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/mock/MockAccountSummaryRepository;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/AccountSummaryRepositoryImpl;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/AccountSummaryRepository;", "provideAccountSummaryRepository", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/remoteConfig/featureFlags/FeatureGateManager;Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/mock/MockAccountSummaryRepository;Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/AccountSummaryRepositoryImpl;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/AccountSummaryRepository;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/mock/MockFinancialActivityRepositoryImpl;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/FinancialActivityRepositoryImpl;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/FinancialActivityRepository;", "provideFinancialActivityRepository", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/remoteConfig/featureFlags/FeatureGateManager;Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/mock/MockFinancialActivityRepositoryImpl;Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/FinancialActivityRepositoryImpl;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/FinancialActivityRepository;", "Lretrofit2/Retrofit;", "retrofit", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/api/StatementService;", "provideStatementService", "(Lretrofit2/Retrofit;)Lcom/paypal/oslo/feature/revolvingcreditservicing/data/api/StatementService;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/mock/MockStatementsRepositoryImpl;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/StatementsRepositoryImpl;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/StatementsRepository;", "provideStatementsRepository", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/remoteConfig/featureFlags/FeatureGateManager;Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/mock/MockStatementsRepositoryImpl;Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/StatementsRepositoryImpl;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/StatementsRepository;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/mock/MockPaymentSummaryRepositoryImpl;", "mockRepository", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/PaymentSummaryRepositoryImpl;", "realRepository", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/PaymentSummaryRepository;", "bindPaymentSummaryRepository", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/remoteConfig/featureFlags/FeatureGateManager;Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/mock/MockPaymentSummaryRepositoryImpl;Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/PaymentSummaryRepositoryImpl;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/PaymentSummaryRepository;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/mock/MockPaymentReviewRepository;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/PaymentReviewRepositoryImpl;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/PaymentReviewRepository;", "providePaymentReviewRepository", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/remoteConfig/featureFlags/FeatureGateManager;Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/mock/MockPaymentReviewRepository;Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/PaymentReviewRepositoryImpl;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/PaymentReviewRepository;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/mock/MockAutopayRepository;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/AutopayRepositoryImpl;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/AutopayRepository;", "provideAutopayRepository", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/remoteConfig/featureFlags/FeatureGateManager;Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/mock/MockAutopayRepository;Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/AutopayRepositoryImpl;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/AutopayRepository;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/mock/MockManageAccountRepository;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/ManageAccountRepositoryImpl;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/ManageAccountRepository;", "provideManageAccountRepository", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/remoteConfig/featureFlags/FeatureGateManager;Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/mock/MockManageAccountRepository;Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/ManageAccountRepositoryImpl;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/ManageAccountRepository;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/mock/MockRedeemRewardsRepository;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/RedeemRewardsRepositoryImpl;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/RedeemRewardsRepository;", "provideRedeemRewardsRepository", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/remoteConfig/featureFlags/FeatureGateManager;Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/mock/MockRedeemRewardsRepository;Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/RedeemRewardsRepositoryImpl;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/RedeemRewardsRepository;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/mock/MockCLIApplicationRepository;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/CLIApplicationRepositoryImpl;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/CLIApplicationRepository;", "provideCLIApplicationRepository", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/remoteConfig/featureFlags/FeatureGateManager;Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/mock/MockCLIApplicationRepository;Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/CLIApplicationRepositoryImpl;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/CLIApplicationRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.di.RepositoryBindingsModule.Companion getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.revolvingcreditservicing.di.RepositoryBindingsModule.Companion();

        private Companion() {
        }

        @dagger.Provides
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.PaymentOptionsRepository providePaymentOptionsRepository(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager featureGateManager, com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockPaymentOptionsRepository mock, com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentOptionsRepositoryImpl real) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mock, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(real, "");
            return featureGateManager.mockGraphqlEnabled() ? mock : real;
        }

        @dagger.Provides
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.CardActivationRepository provideCardActivationRepository(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager featureGateManager, com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCardActivationRepository mock, com.paypal.oslo.feature.revolvingcreditservicing.data.repository.CardActivationRepositoryImpl real) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mock, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(real, "");
            return featureGateManager.mockGraphqlEnabled() ? mock : real;
        }

        @dagger.Provides
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.CLIRepository provideCLIRepository(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager featureGateManager, com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCLIRepository mock, com.paypal.oslo.feature.revolvingcreditservicing.data.repository.CLIRepositoryImpl real) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mock, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(real, "");
            return featureGateManager.mockGraphqlEnabled() ? mock : real;
        }

        @dagger.Provides
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.AccountSummaryRepository provideAccountSummaryRepository(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager featureGateManager, com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockAccountSummaryRepository mock, com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AccountSummaryRepositoryImpl real) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mock, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(real, "");
            return featureGateManager.mockGraphqlEnabled() ? mock : real;
        }

        @dagger.Provides
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.FinancialActivityRepository provideFinancialActivityRepository(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager featureGateManager, com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockFinancialActivityRepositoryImpl mock, com.paypal.oslo.feature.revolvingcreditservicing.data.repository.FinancialActivityRepositoryImpl real) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mock, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(real, "");
            return featureGateManager.mockGraphqlEnabled() ? mock : real;
        }

        @dagger.Provides
        public final com.paypal.oslo.feature.revolvingcreditservicing.data.api.StatementService provideStatementService(retrofit2.Retrofit retrofit) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(retrofit, "");
            java.lang.Object create = retrofit.create(com.paypal.oslo.feature.revolvingcreditservicing.data.api.StatementService.class);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "");
            return (com.paypal.oslo.feature.revolvingcreditservicing.data.api.StatementService) create;
        }

        @dagger.Provides
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.StatementsRepository provideStatementsRepository(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager featureGateManager, com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockStatementsRepositoryImpl mock, com.paypal.oslo.feature.revolvingcreditservicing.data.repository.StatementsRepositoryImpl real) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mock, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(real, "");
            return featureGateManager.mockGraphqlEnabled() ? mock : real;
        }

        @dagger.Provides
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.PaymentSummaryRepository bindPaymentSummaryRepository(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager featureGateManager, com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockPaymentSummaryRepositoryImpl mockRepository, com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentSummaryRepositoryImpl realRepository) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mockRepository, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realRepository, "");
            if (featureGateManager.mockGraphqlEnabled()) {
                return mockRepository;
            }
            return realRepository;
        }

        @dagger.Provides
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.PaymentReviewRepository providePaymentReviewRepository(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager featureGateManager, com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockPaymentReviewRepository mock, com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentReviewRepositoryImpl real) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mock, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(real, "");
            return featureGateManager.mockGraphqlEnabled() ? mock : real;
        }

        @dagger.Provides
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.AutopayRepository provideAutopayRepository(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager featureGateManager, com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockAutopayRepository mock, com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AutopayRepositoryImpl real) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mock, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(real, "");
            return featureGateManager.mockGraphqlEnabled() ? mock : real;
        }

        @dagger.Provides
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.ManageAccountRepository provideManageAccountRepository(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager featureGateManager, com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockManageAccountRepository mock, com.paypal.oslo.feature.revolvingcreditservicing.data.repository.ManageAccountRepositoryImpl real) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mock, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(real, "");
            return featureGateManager.mockGraphqlEnabled() ? mock : real;
        }

        @dagger.Provides
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.RedeemRewardsRepository provideRedeemRewardsRepository(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager featureGateManager, com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockRedeemRewardsRepository mock, com.paypal.oslo.feature.revolvingcreditservicing.data.repository.RedeemRewardsRepositoryImpl real) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mock, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(real, "");
            return featureGateManager.mockGraphqlEnabled() ? mock : real;
        }

        @dagger.Provides
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.CLIApplicationRepository provideCLIApplicationRepository(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager featureGateManager, com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCLIApplicationRepository mock, com.paypal.oslo.feature.revolvingcreditservicing.data.repository.CLIApplicationRepositoryImpl real) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mock, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(real, "");
            return featureGateManager.mockGraphqlEnabled() ? mock : real;
        }
    }
}
