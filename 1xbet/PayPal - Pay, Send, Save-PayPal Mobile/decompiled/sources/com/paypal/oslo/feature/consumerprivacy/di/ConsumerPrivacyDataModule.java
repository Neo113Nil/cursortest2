package com.paypal.oslo.feature.consumerprivacy.di;

@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0013H'¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0017H'¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u001bH'¢\u0006\u0004\b\u001d\u0010\u001eÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/di/ConsumerPrivacyDataModule;", "", "Lcom/paypal/oslo/feature/consumerprivacy/data/repository/PersonalizedShoppingRepositoryImpl;", "impl", "Lcom/paypal/oslo/feature/consumerprivacy/domain/repository/PersonalizedShoppingRepository;", "bindPersonalizedShoppingRepository", "(Lcom/paypal/oslo/feature/consumerprivacy/data/repository/PersonalizedShoppingRepositoryImpl;)Lcom/paypal/oslo/feature/consumerprivacy/domain/repository/PersonalizedShoppingRepository;", "Lcom/paypal/oslo/feature/consumerprivacy/data/repository/FaceScanRepositoryImpl;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/repository/FaceScanRepository;", "bindFaceScanRepository", "(Lcom/paypal/oslo/feature/consumerprivacy/data/repository/FaceScanRepositoryImpl;)Lcom/paypal/oslo/feature/consumerprivacy/domain/repository/FaceScanRepository;", "Lcom/paypal/oslo/feature/consumerprivacy/data/repository/PersonalizedAdsRepositoryImpl;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/repository/PersonalizedAdsRepository;", "bindPersonalizedAdsRepository", "(Lcom/paypal/oslo/feature/consumerprivacy/data/repository/PersonalizedAdsRepositoryImpl;)Lcom/paypal/oslo/feature/consumerprivacy/domain/repository/PersonalizedAdsRepository;", "Lcom/paypal/oslo/feature/consumerprivacy/data/repository/AccountVisibilityRepositoryImpl;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/repository/AccountVisibilityRepository;", "bindAccountVisibilityRepository", "(Lcom/paypal/oslo/feature/consumerprivacy/data/repository/AccountVisibilityRepositoryImpl;)Lcom/paypal/oslo/feature/consumerprivacy/domain/repository/AccountVisibilityRepository;", "Lcom/paypal/oslo/feature/consumerprivacy/data/repository/GranularAccountVisibilityRepositoryImpl;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/repository/GranularAccountVisibilityRepository;", "bindGranularAccountVisibilityRepository", "(Lcom/paypal/oslo/feature/consumerprivacy/data/repository/GranularAccountVisibilityRepositoryImpl;)Lcom/paypal/oslo/feature/consumerprivacy/domain/repository/GranularAccountVisibilityRepository;", "Lcom/paypal/oslo/feature/consumerprivacy/data/repository/ConnectedAppsRepositoryImpl;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/repository/ConnectedAppsRepository;", "bindConnectedAppsRepository", "(Lcom/paypal/oslo/feature/consumerprivacy/data/repository/ConnectedAppsRepositoryImpl;)Lcom/paypal/oslo/feature/consumerprivacy/domain/repository/ConnectedAppsRepository;", "Lcom/paypal/oslo/feature/consumerprivacy/data/resolver/ResourcePermissionStringResolver;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/PermissionStringResolver;", "bindPermissionStringResolver", "(Lcom/paypal/oslo/feature/consumerprivacy/data/resolver/ResourcePermissionStringResolver;)Lcom/paypal/oslo/feature/consumerprivacy/domain/PermissionStringResolver;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes12.dex */
public interface ConsumerPrivacyDataModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.consumerprivacy.di.ConsumerPrivacyDataModule.Companion INSTANCE = com.paypal.oslo.feature.consumerprivacy.di.ConsumerPrivacyDataModule.Companion.getHighSpeedVideoFpsRangesFor;

    @dagger.Binds
    com.paypal.oslo.feature.consumerprivacy.domain.repository.AccountVisibilityRepository bindAccountVisibilityRepository(com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityRepositoryImpl impl);

    @dagger.Binds
    com.paypal.oslo.feature.consumerprivacy.domain.repository.ConnectedAppsRepository bindConnectedAppsRepository(com.paypal.oslo.feature.consumerprivacy.data.repository.ConnectedAppsRepositoryImpl impl);

    @dagger.Binds
    com.paypal.oslo.feature.consumerprivacy.domain.repository.FaceScanRepository bindFaceScanRepository(com.paypal.oslo.feature.consumerprivacy.data.repository.FaceScanRepositoryImpl impl);

    @dagger.Binds
    com.paypal.oslo.feature.consumerprivacy.domain.repository.GranularAccountVisibilityRepository bindGranularAccountVisibilityRepository(com.paypal.oslo.feature.consumerprivacy.data.repository.GranularAccountVisibilityRepositoryImpl impl);

    @dagger.Binds
    com.paypal.oslo.feature.consumerprivacy.domain.PermissionStringResolver bindPermissionStringResolver(com.paypal.oslo.feature.consumerprivacy.data.resolver.ResourcePermissionStringResolver impl);

    @dagger.Binds
    com.paypal.oslo.feature.consumerprivacy.domain.repository.PersonalizedAdsRepository bindPersonalizedAdsRepository(com.paypal.oslo.feature.consumerprivacy.data.repository.PersonalizedAdsRepositoryImpl impl);

    @dagger.Binds
    com.paypal.oslo.feature.consumerprivacy.domain.repository.PersonalizedShoppingRepository bindPersonalizedShoppingRepository(com.paypal.oslo.feature.consumerprivacy.data.repository.PersonalizedShoppingRepositoryImpl impl);

    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/di/ConsumerPrivacyDataModule$Companion;", "", "<init>", "()V", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/consumerprivacy/data/apollo/PersonalizedShoppingApi;", "providePersonalizedShoppingApolloClient", "(Lcom/apollographql/apollo/ApolloClient;)Lcom/paypal/oslo/feature/consumerprivacy/data/apollo/PersonalizedShoppingApi;", "Lcom/paypal/oslo/feature/consumerprivacy/data/apollo/FaceScanApi;", "provideFaceScanApolloClient", "(Lcom/apollographql/apollo/ApolloClient;)Lcom/paypal/oslo/feature/consumerprivacy/data/apollo/FaceScanApi;", "Lcom/paypal/oslo/feature/consumerprivacy/data/apollo/PersonalizedAdsApi;", "providePersonalizedAdsApolloClient", "(Lcom/apollographql/apollo/ApolloClient;)Lcom/paypal/oslo/feature/consumerprivacy/data/apollo/PersonalizedAdsApi;", "Lcom/paypal/oslo/feature/consumerprivacy/data/apollo/AccountVisibilityApi;", "provideAccountVisibilityApolloClient", "(Lcom/apollographql/apollo/ApolloClient;)Lcom/paypal/oslo/feature/consumerprivacy/data/apollo/AccountVisibilityApi;", "Lcom/paypal/oslo/feature/consumerprivacy/data/apollo/GranularAccountVisibilityApi;", "provideGranularAccountVisibilityApolloClient", "(Lcom/apollographql/apollo/ApolloClient;)Lcom/paypal/oslo/feature/consumerprivacy/data/apollo/GranularAccountVisibilityApi;", "Lcom/paypal/oslo/feature/consumerprivacy/data/apollo/ConnectedAppsApi;", "provideConnectedAppsApi", "(Lcom/apollographql/apollo/ApolloClient;)Lcom/paypal/oslo/feature/consumerprivacy/data/apollo/ConnectedAppsApi;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.paypal.oslo.feature.consumerprivacy.di.ConsumerPrivacyDataModule.Companion getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.consumerprivacy.di.ConsumerPrivacyDataModule.Companion();

        private Companion() {
        }

        @dagger.Provides
        public final com.paypal.oslo.feature.consumerprivacy.data.apollo.PersonalizedShoppingApi providePersonalizedShoppingApolloClient(com.apollographql.apollo.ApolloClient apolloClient) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
            return new com.paypal.oslo.feature.consumerprivacy.data.apollo.PersonalizedShoppingApiImpl(apolloClient);
        }

        @dagger.Provides
        public final com.paypal.oslo.feature.consumerprivacy.data.apollo.FaceScanApi provideFaceScanApolloClient(com.apollographql.apollo.ApolloClient apolloClient) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
            return new com.paypal.oslo.feature.consumerprivacy.data.apollo.FaceScanApiImpl(apolloClient);
        }

        @dagger.Provides
        public final com.paypal.oslo.feature.consumerprivacy.data.apollo.PersonalizedAdsApi providePersonalizedAdsApolloClient(com.apollographql.apollo.ApolloClient apolloClient) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
            return new com.paypal.oslo.feature.consumerprivacy.data.apollo.PersonalizedAdsApiImpl(apolloClient);
        }

        @dagger.Provides
        public final com.paypal.oslo.feature.consumerprivacy.data.apollo.AccountVisibilityApi provideAccountVisibilityApolloClient(com.apollographql.apollo.ApolloClient apolloClient) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
            return new com.paypal.oslo.feature.consumerprivacy.data.apollo.AccountVisibilityApiImpl(apolloClient);
        }

        @dagger.Provides
        public final com.paypal.oslo.feature.consumerprivacy.data.apollo.GranularAccountVisibilityApi provideGranularAccountVisibilityApolloClient(com.apollographql.apollo.ApolloClient apolloClient) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
            return new com.paypal.oslo.feature.consumerprivacy.data.apollo.GranularAccountVisibilityApiImpl(apolloClient);
        }

        @dagger.Provides
        public final com.paypal.oslo.feature.consumerprivacy.data.apollo.ConnectedAppsApi provideConnectedAppsApi(com.apollographql.apollo.ApolloClient apolloClient) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
            return new com.paypal.oslo.feature.consumerprivacy.data.apollo.ConnectedAppsApiImpl(apolloClient);
        }
    }
}
