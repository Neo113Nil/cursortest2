package com.paypal.oslo.feature.home.di;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/home/di/HomeRepositoryModule;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/home/featureflags/HomeConfigManager;", "homeConfigManager", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/home/data/mapper/HomeFeedMapper;", "homeFeedMapper", "Lcom/paypal/oslo/feature/home/data/accountsnapshot/AccountSnapshotMapper;", "accountSnapshotMapper", "Lcom/paypal/oslo/feature/home/domain/StringProvider;", "stringProvider", "Lcom/paypal/oslo/feature/home/domain/error/DemoErrorSimulator;", "demoErrorSimulator", "Lcom/paypal/oslo/feature/home/domain/repository/HomeFeedRepository;", "provideHomeFeedRepository$home_prodRelease", "(Lcom/paypal/oslo/feature/home/featureflags/HomeConfigManager;Lcom/apollographql/apollo/ApolloClient;Lcom/paypal/oslo/feature/home/data/mapper/HomeFeedMapper;Lcom/paypal/oslo/feature/home/data/accountsnapshot/AccountSnapshotMapper;Lcom/paypal/oslo/feature/home/domain/StringProvider;Lcom/paypal/oslo/feature/home/domain/error/DemoErrorSimulator;)Lcom/paypal/oslo/feature/home/domain/repository/HomeFeedRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes5.dex */
public final class HomeRepositoryModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.home.di.HomeRepositoryModule INSTANCE = new com.paypal.oslo.feature.home.di.HomeRepositoryModule();

    private HomeRepositoryModule() {
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.oslo.feature.home.domain.repository.HomeFeedRepository provideHomeFeedRepository$home_prodRelease(com.paypal.oslo.feature.home.featureflags.HomeConfigManager homeConfigManager, com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.home.data.mapper.HomeFeedMapper homeFeedMapper, com.paypal.oslo.feature.home.data.accountsnapshot.AccountSnapshotMapper accountSnapshotMapper, com.paypal.oslo.feature.home.domain.StringProvider stringProvider, com.paypal.oslo.feature.home.domain.error.DemoErrorSimulator demoErrorSimulator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(homeConfigManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(homeFeedMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountSnapshotMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(demoErrorSimulator, "");
        return com.paypal.oslo.feature.home.data.repository.HomeFeedRepositoryFactory.INSTANCE.create(homeConfigManager, apolloClient, homeFeedMapper, accountSnapshotMapper, stringProvider, demoErrorSimulator);
    }
}
