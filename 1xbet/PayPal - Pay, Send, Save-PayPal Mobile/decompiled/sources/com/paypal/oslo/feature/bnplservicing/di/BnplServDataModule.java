package com.paypal.oslo.feature.bnplservicing.di;

@kotlin.Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010 \u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b \u0010!J'\u0010'\u001a\u00020&2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b'\u0010(J'\u0010.\u001a\u00020-2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0007¢\u0006\u0004\b.\u0010/J\u0017\u00103\u001a\u0002022\u0006\u00101\u001a\u000200H\u0007¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u0002062\u0006\u00101\u001a\u000205H\u0007¢\u0006\u0004\b7\u00108"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/di/BnplServDataModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "featureGate", "Lcom/paypal/oslo/feature/bnplservicing/data/repository/mock/MockMakeAPaymentRepository;", "mockMakeAPaymentRepository", "Lcom/paypal/oslo/feature/bnplservicing/data/repository/MakeAPaymentRepositoryImpl;", "makeAPaymentRepository", "Lcom/paypal/oslo/feature/bnplservicing/domain/repository/MakeAPaymentRepository;", "bindMakeAPaymentRepository", "(Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;Lcom/paypal/oslo/feature/bnplservicing/data/repository/mock/MockMakeAPaymentRepository;Lcom/paypal/oslo/feature/bnplservicing/data/repository/MakeAPaymentRepositoryImpl;)Lcom/paypal/oslo/feature/bnplservicing/domain/repository/MakeAPaymentRepository;", "Lcom/paypal/oslo/feature/bnplservicing/data/repository/mock/MockPlanListRepository;", "mockPlanListRepository", "Lcom/paypal/oslo/feature/bnplservicing/data/repository/PlanListRepositoryImpl;", "planPlanListRepository", "Lcom/paypal/oslo/feature/bnplservicing/domain/repository/PlanListRepository;", "bindPlanListRepository", "(Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;Lcom/paypal/oslo/feature/bnplservicing/data/repository/mock/MockPlanListRepository;Lcom/paypal/oslo/feature/bnplservicing/data/repository/PlanListRepositoryImpl;)Lcom/paypal/oslo/feature/bnplservicing/domain/repository/PlanListRepository;", "Lcom/paypal/oslo/feature/bnplservicing/data/repository/mock/MockPlanDetailsOverviewRepository;", "mockPlanDetailsOverviewRepository", "Lcom/paypal/oslo/feature/bnplservicing/data/repository/PlanDetailsOverviewRepositoryImpl;", "planDetailsOverviewRepository", "Lcom/paypal/oslo/feature/bnplservicing/domain/repository/PlanDetailsOverviewRepository;", "bindPlanDetailsOverviewRepository", "(Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;Lcom/paypal/oslo/feature/bnplservicing/data/repository/mock/MockPlanDetailsOverviewRepository;Lcom/paypal/oslo/feature/bnplservicing/data/repository/PlanDetailsOverviewRepositoryImpl;)Lcom/paypal/oslo/feature/bnplservicing/domain/repository/PlanDetailsOverviewRepository;", "Lcom/paypal/oslo/feature/bnplservicing/data/repository/mock/MockAutopayRepository;", "mockAutopayRepository", "Lcom/paypal/oslo/feature/bnplservicing/data/repository/AutopayRepositoryImpl;", "autopayRepository", "Lcom/paypal/oslo/feature/bnplservicing/domain/repository/AutopayRepository;", "bindAutopayRepository", "(Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;Lcom/paypal/oslo/feature/bnplservicing/data/repository/mock/MockAutopayRepository;Lcom/paypal/oslo/feature/bnplservicing/data/repository/AutopayRepositoryImpl;)Lcom/paypal/oslo/feature/bnplservicing/domain/repository/AutopayRepository;", "Lcom/paypal/oslo/feature/bnplservicing/data/repository/mock/MockPrequalificationSummaryRepository;", "mockPrequalifiedAmountRepository", "Lcom/paypal/oslo/feature/bnplservicing/data/repository/PrequalifiedAmountRepositoryImpl;", "prequalifiedAmountRepository", "Lcom/paypal/oslo/feature/bnplservicing/domain/repository/PrequalificationSummaryRepository;", "bindPrequalifiedAmountRepository", "(Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;Lcom/paypal/oslo/feature/bnplservicing/data/repository/mock/MockPrequalificationSummaryRepository;Lcom/paypal/oslo/feature/bnplservicing/data/repository/PrequalifiedAmountRepositoryImpl;)Lcom/paypal/oslo/feature/bnplservicing/domain/repository/PrequalificationSummaryRepository;", "Lcom/paypal/oslo/feature/bnplservicing/data/repository/mock/MockPayLaterHubRepository;", "mockPayLaterHubRepository", "Lcom/paypal/oslo/feature/bnplservicing/data/repository/PayLaterHubRepositoryImpl;", "payLaterHubRepository", "Lcom/paypal/oslo/feature/bnplservicing/domain/repository/PayLaterHubRepository;", "bindPayLaterHubRepository", "(Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;Lcom/paypal/oslo/feature/bnplservicing/data/repository/mock/MockPayLaterHubRepository;Lcom/paypal/oslo/feature/bnplservicing/data/repository/PayLaterHubRepositoryImpl;)Lcom/paypal/oslo/feature/bnplservicing/domain/repository/PayLaterHubRepository;", "Lcom/paypal/oslo/feature/bnplservicing/data/repository/DocumentRepositoryImpl;", "repository", "Lcom/paypal/oslo/feature/bnplservicing/domain/repository/DocumentRepository;", "bindDocumentRepository", "(Lcom/paypal/oslo/feature/bnplservicing/data/repository/DocumentRepositoryImpl;)Lcom/paypal/oslo/feature/bnplservicing/domain/repository/DocumentRepository;", "Lcom/paypal/oslo/feature/bnplservicing/data/repository/SnoozeRepositoryImpl;", "Lcom/paypal/oslo/feature/bnplservicing/domain/repository/SnoozeRepository;", "bindSnoozeRepository", "(Lcom/paypal/oslo/feature/bnplservicing/data/repository/SnoozeRepositoryImpl;)Lcom/paypal/oslo/feature/bnplservicing/domain/repository/SnoozeRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes11.dex */
public final class BnplServDataModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.bnplservicing.di.BnplServDataModule INSTANCE = new com.paypal.oslo.feature.bnplservicing.di.BnplServDataModule();

    private BnplServDataModule() {
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.bnplservicing.domain.repository.MakeAPaymentRepository bindMakeAPaymentRepository(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockMakeAPaymentRepository mockMakeAPaymentRepository, com.paypal.oslo.feature.bnplservicing.data.repository.MakeAPaymentRepositoryImpl makeAPaymentRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mockMakeAPaymentRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(makeAPaymentRepository, "");
        if (featureGate.checkGate(com.paypal.oslo.feature.bnplservicing.remoteconfigs.featureflags.BnplServicingConfig.Flags.INSTANCE.getMockApiEnabled())) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.bnplservicing.LoggerKt.log, "**** Using Mock MakeAPaymentRepository ****", null, null, 6, null);
            return mockMakeAPaymentRepository;
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.bnplservicing.LoggerKt.log, "Using Real MakeAPaymentRepository", null, null, 6, null);
        return makeAPaymentRepository;
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.bnplservicing.domain.repository.PlanListRepository bindPlanListRepository(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPlanListRepository mockPlanListRepository, com.paypal.oslo.feature.bnplservicing.data.repository.PlanListRepositoryImpl planPlanListRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mockPlanListRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planPlanListRepository, "");
        if (featureGate.checkGate(com.paypal.oslo.feature.bnplservicing.remoteconfigs.featureflags.BnplServicingConfig.Flags.INSTANCE.getMockApiEnabled())) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.bnplservicing.LoggerKt.log, "**** Using Mock PlanListRepository ****", null, null, 6, null);
            return mockPlanListRepository;
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.bnplservicing.LoggerKt.log, "Using Real PlanListRepository", null, null, 6, null);
        return planPlanListRepository;
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.bnplservicing.domain.repository.PlanDetailsOverviewRepository bindPlanDetailsOverviewRepository(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPlanDetailsOverviewRepository mockPlanDetailsOverviewRepository, com.paypal.oslo.feature.bnplservicing.data.repository.PlanDetailsOverviewRepositoryImpl planDetailsOverviewRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mockPlanDetailsOverviewRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planDetailsOverviewRepository, "");
        if (featureGate.checkGate(com.paypal.oslo.feature.bnplservicing.remoteconfigs.featureflags.BnplServicingConfig.Flags.INSTANCE.getMockApiEnabled())) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.bnplservicing.LoggerKt.log, "**** Using Mock PlanDetailsOverviewRepository ****", null, null, 6, null);
            return mockPlanDetailsOverviewRepository;
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.bnplservicing.LoggerKt.log, "Using Real PlanDetailsOverviewRepository", null, null, 6, null);
        return planDetailsOverviewRepository;
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.bnplservicing.domain.repository.AutopayRepository bindAutopayRepository(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockAutopayRepository mockAutopayRepository, com.paypal.oslo.feature.bnplservicing.data.repository.AutopayRepositoryImpl autopayRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mockAutopayRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autopayRepository, "");
        if (featureGate.checkGate(com.paypal.oslo.feature.bnplservicing.remoteconfigs.featureflags.BnplServicingConfig.Flags.INSTANCE.getMockApiEnabled())) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.bnplservicing.LoggerKt.log, "**** Using Mock AutopayRepository ****", null, null, 6, null);
            return mockAutopayRepository;
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.bnplservicing.LoggerKt.log, "Using Real AutopayRepository", null, null, 6, null);
        return autopayRepository;
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.bnplservicing.domain.repository.PrequalificationSummaryRepository bindPrequalifiedAmountRepository(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPrequalificationSummaryRepository mockPrequalifiedAmountRepository, com.paypal.oslo.feature.bnplservicing.data.repository.PrequalifiedAmountRepositoryImpl prequalifiedAmountRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mockPrequalifiedAmountRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prequalifiedAmountRepository, "");
        if (featureGate.checkGate(com.paypal.oslo.feature.bnplservicing.remoteconfigs.featureflags.BnplServicingConfig.Flags.INSTANCE.getMockApiEnabled())) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.bnplservicing.LoggerKt.log, "**** Using Mock PrequalifiedAmountRepository ****", null, null, 6, null);
            return mockPrequalifiedAmountRepository;
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.bnplservicing.LoggerKt.log, "Using Real PrequalifiedAmountRepository", null, null, 6, null);
        return prequalifiedAmountRepository;
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.bnplservicing.domain.repository.PayLaterHubRepository bindPayLaterHubRepository(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPayLaterHubRepository mockPayLaterHubRepository, com.paypal.oslo.feature.bnplservicing.data.repository.PayLaterHubRepositoryImpl payLaterHubRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mockPayLaterHubRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payLaterHubRepository, "");
        if (featureGate.checkGate(com.paypal.oslo.feature.bnplservicing.remoteconfigs.featureflags.BnplServicingConfig.Flags.INSTANCE.getMockApiEnabled())) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.bnplservicing.LoggerKt.log, "**** Using Mock PayLaterHubRepository ****", null, null, 6, null);
            return mockPayLaterHubRepository;
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.bnplservicing.LoggerKt.log, "Using Real PayLaterHubRepository", null, null, 6, null);
        return payLaterHubRepository;
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.bnplservicing.domain.repository.DocumentRepository bindDocumentRepository(com.paypal.oslo.feature.bnplservicing.data.repository.DocumentRepositoryImpl repository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repository, "");
        return repository;
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.bnplservicing.domain.repository.SnoozeRepository bindSnoozeRepository(com.paypal.oslo.feature.bnplservicing.data.repository.SnoozeRepositoryImpl repository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repository, "");
        return repository;
    }
}
