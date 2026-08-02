package com.paypal.oslo.feature.consumerprivacy.di;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/di/AccountVisibilityLabelDataModule;", "", "Lcom/paypal/oslo/feature/consumerprivacy/data/repository/AccountVisibilityLabelRepositoryImpl;", "impl", "Lcom/paypal/oslo/feature/consumerprivacy/domain/repository/AccountVisibilityLabelRepository;", "bindAccountVisibilityLabelRepository", "(Lcom/paypal/oslo/feature/consumerprivacy/data/repository/AccountVisibilityLabelRepositoryImpl;)Lcom/paypal/oslo/feature/consumerprivacy/domain/repository/AccountVisibilityLabelRepository;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes12.dex */
public interface AccountVisibilityLabelDataModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.consumerprivacy.di.AccountVisibilityLabelDataModule.Companion INSTANCE = com.paypal.oslo.feature.consumerprivacy.di.AccountVisibilityLabelDataModule.Companion.getHighResolutionOutputSizeshNQ4ISI;

    @dagger.Binds
    com.paypal.oslo.feature.consumerprivacy.domain.repository.AccountVisibilityLabelRepository bindAccountVisibilityLabelRepository(com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityLabelRepositoryImpl impl);

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/di/AccountVisibilityLabelDataModule$Companion;", "", "<init>", "()V", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/consumerprivacy/data/apollo/AccountVisibilityLabelApi;", "provideAccountVisibilityLabelApi", "(Lcom/apollographql/apollo/ApolloClient;)Lcom/paypal/oslo/feature/consumerprivacy/data/apollo/AccountVisibilityLabelApi;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/GetAccountVisibilityLabelUseCase;", "getAccountVisibilityLabelUseCase", "Lcom/paypal/oslo/feature/consumerprivacy/api/data/IAccountVisibilityLabelProvider;", "provideAccountVisibilityLabelProvider", "(Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/GetAccountVisibilityLabelUseCase;)Lcom/paypal/oslo/feature/consumerprivacy/api/data/IAccountVisibilityLabelProvider;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.paypal.oslo.feature.consumerprivacy.di.AccountVisibilityLabelDataModule.Companion getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.consumerprivacy.di.AccountVisibilityLabelDataModule.Companion();

        private Companion() {
        }

        @dagger.Provides
        public final com.paypal.oslo.feature.consumerprivacy.data.apollo.AccountVisibilityLabelApi provideAccountVisibilityLabelApi(com.apollographql.apollo.ApolloClient apolloClient) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
            return new com.paypal.oslo.feature.consumerprivacy.data.apollo.AccountVisibilityLabelApiImpl(apolloClient);
        }

        @dagger.Provides
        public final com.paypal.oslo.feature.consumerprivacy.api.data.IAccountVisibilityLabelProvider provideAccountVisibilityLabelProvider(com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetAccountVisibilityLabelUseCase getAccountVisibilityLabelUseCase) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAccountVisibilityLabelUseCase, "");
            return new com.paypal.oslo.feature.consumerprivacy.data.provider.AccountVisibilityLabelProviderImpl(getAccountVisibilityLabelUseCase);
        }
    }
}
