package com.paypal.oslo.feature.activity.di.module;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/activity/di/module/RepositoryModule;", "", "<init>", "()V", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/activity/domain/base/error/IActivityErrorMapper;", "activityErrorMapper", "Lcom/paypal/oslo/feature/activity/domain/repository/ledger/IActivityLedgerRepository;", "provideActivityLedgerRepository", "(Lcom/apollographql/apollo/ApolloClient;Lcom/paypal/oslo/feature/activity/domain/base/error/IActivityErrorMapper;)Lcom/paypal/oslo/feature/activity/domain/repository/ledger/IActivityLedgerRepository;", "provideErrorMapper", "()Lcom/paypal/oslo/feature/activity/domain/base/error/IActivityErrorMapper;", "Lcom/paypal/oslo/feature/activity/manager/ActivityFeatureManager;", "activityFeatureManager", "Lcom/paypal/oslo/feature/activity/domain/repository/detail/IActivityTransactionDetailRepository;", "provideActivityDetailRepository", "(Lcom/apollographql/apollo/ApolloClient;Lcom/paypal/oslo/feature/activity/domain/base/error/IActivityErrorMapper;Lcom/paypal/oslo/feature/activity/manager/ActivityFeatureManager;)Lcom/paypal/oslo/feature/activity/domain/repository/detail/IActivityTransactionDetailRepository;", "Lcom/paypal/oslo/feature/activity/domain/repository/common/IActivityActionsRepository;", "provideActivityActionsRepository", "(Lcom/apollographql/apollo/ApolloClient;Lcom/paypal/oslo/feature/activity/domain/base/error/IActivityErrorMapper;Lcom/paypal/oslo/feature/activity/manager/ActivityFeatureManager;)Lcom/paypal/oslo/feature/activity/domain/repository/common/IActivityActionsRepository;", "Lcom/paypal/oslo/feature/activity/domain/repository/search/IActivitySearchRepository;", "provideActivitySearchRepository", "(Lcom/apollographql/apollo/ApolloClient;Lcom/paypal/oslo/feature/activity/domain/base/error/IActivityErrorMapper;)Lcom/paypal/oslo/feature/activity/domain/repository/search/IActivitySearchRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes10.dex */
public final class RepositoryModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.activity.di.module.RepositoryModule INSTANCE = new com.paypal.oslo.feature.activity.di.module.RepositoryModule();

    private RepositoryModule() {
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.activity.domain.repository.ledger.IActivityLedgerRepository provideActivityLedgerRepository(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper activityErrorMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityErrorMapper, "");
        return new com.paypal.oslo.feature.activity.data.repository.ledger.ActivityLedgerRepositoryImpl(apolloClient, activityErrorMapper, null, 4, null);
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper provideErrorMapper() {
        return new com.paypal.oslo.feature.activity.data.error.ActivityErrorMapperImpl();
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.activity.domain.repository.detail.IActivityTransactionDetailRepository provideActivityDetailRepository(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper activityErrorMapper, com.paypal.oslo.feature.activity.manager.ActivityFeatureManager activityFeatureManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityErrorMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityFeatureManager, "");
        return new com.paypal.oslo.feature.activity.data.repository.detail.ActivityTransactionDetailRepositoryImpl(null, apolloClient, activityErrorMapper, activityFeatureManager, 1, null);
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.activity.domain.repository.common.IActivityActionsRepository provideActivityActionsRepository(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper activityErrorMapper, com.paypal.oslo.feature.activity.manager.ActivityFeatureManager activityFeatureManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityErrorMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityFeatureManager, "");
        return new com.paypal.oslo.feature.activity.data.repository.common.ActivityActionsRepositoryImpl(apolloClient, activityErrorMapper, null, activityFeatureManager, 4, null);
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.activity.domain.repository.search.IActivitySearchRepository provideActivitySearchRepository(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper activityErrorMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityErrorMapper, "");
        return new com.paypal.oslo.feature.activity.data.repository.search.ActivitySearchRepositoryImpl(apolloClient, activityErrorMapper, null, 4, null);
    }
}
