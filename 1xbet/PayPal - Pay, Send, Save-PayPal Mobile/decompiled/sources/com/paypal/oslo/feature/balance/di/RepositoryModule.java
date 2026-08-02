package com.paypal.oslo.feature.balance.di;

@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J?\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020%2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b&\u0010'"}, d2 = {"Lcom/paypal/oslo/feature/balance/di/RepositoryModule;", "", "<init>", "()V", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/balance/data/repository/autoreload/FetchAutoReloadConfigCall;", "provideFetchAutoReloadConfigCall", "(Lcom/apollographql/apollo/ApolloClient;)Lcom/paypal/oslo/feature/balance/data/repository/autoreload/FetchAutoReloadConfigCall;", "Lcom/paypal/oslo/feature/balance/data/repository/autoreload/CreateAutoReloadCall;", "provideCreateAutoReloadCall", "(Lcom/apollographql/apollo/ApolloClient;)Lcom/paypal/oslo/feature/balance/data/repository/autoreload/CreateAutoReloadCall;", "Lcom/paypal/oslo/feature/balance/data/repository/autoreload/UpdateAutoReloadCall;", "provideUpdateAutoReloadCall", "(Lcom/apollographql/apollo/ApolloClient;)Lcom/paypal/oslo/feature/balance/data/repository/autoreload/UpdateAutoReloadCall;", "Lcom/paypal/oslo/feature/balance/data/repository/autoreload/FetchDepositOptionsCall;", "provideFetchDepositOptionsCall", "(Lcom/apollographql/apollo/ApolloClient;)Lcom/paypal/oslo/feature/balance/data/repository/autoreload/FetchDepositOptionsCall;", "Lcom/paypal/oslo/feature/balance/data/repository/autoreload/FetchSavingsAccountsCall;", "provideFetchSavingsAccountsCall", "(Lcom/apollographql/apollo/ApolloClient;)Lcom/paypal/oslo/feature/balance/data/repository/autoreload/FetchSavingsAccountsCall;", "fetchAutoReloadConfigCall", "createAutoReloadCall", "updateAutoReloadCall", "Lcom/paypal/oslo/feature/balance/data/repository/autoreload/DisableAutoReloadCall;", "disableAutoReloadCall", "fetchDepositOptionsCall", "fetchSavingsAccountsCall", "Lcom/paypal/oslo/feature/balance/domain/repository/autoreload/AutoReloadRepository;", "provideAutoReloadRepository", "(Lcom/paypal/oslo/feature/balance/data/repository/autoreload/FetchAutoReloadConfigCall;Lcom/paypal/oslo/feature/balance/data/repository/autoreload/CreateAutoReloadCall;Lcom/paypal/oslo/feature/balance/data/repository/autoreload/UpdateAutoReloadCall;Lcom/paypal/oslo/feature/balance/data/repository/autoreload/DisableAutoReloadCall;Lcom/paypal/oslo/feature/balance/data/repository/autoreload/FetchDepositOptionsCall;Lcom/paypal/oslo/feature/balance/data/repository/autoreload/FetchSavingsAccountsCall;)Lcom/paypal/oslo/feature/balance/domain/repository/autoreload/AutoReloadRepository;", "Lcom/paypal/oslo/feature/balance/domain/repository/balance/BalanceRepository;", "provideBalanceRepository", "(Lcom/apollographql/apollo/ApolloClient;)Lcom/paypal/oslo/feature/balance/domain/repository/balance/BalanceRepository;", "Lcom/paypal/oslo/feature/balance/domain/repository/nba/NbaRepository;", "provideNbaRepository", "(Lcom/apollographql/apollo/ApolloClient;)Lcom/paypal/oslo/feature/balance/domain/repository/nba/NbaRepository;", "Lcom/paypal/oslo/feature/balance/domain/repository/autoreload/AutoTransferRepository;", "provideAutoTransferRepository", "(Lcom/apollographql/apollo/ApolloClient;)Lcom/paypal/oslo/feature/balance/domain/repository/autoreload/AutoTransferRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes5.dex */
public final class RepositoryModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.balance.di.RepositoryModule INSTANCE = new com.paypal.oslo.feature.balance.di.RepositoryModule();

    private RepositoryModule() {
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.oslo.feature.balance.data.repository.autoreload.FetchAutoReloadConfigCall provideFetchAutoReloadConfigCall(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        return new com.paypal.oslo.feature.balance.data.repository.autoreload.FetchAutoReloadConfigCall(apolloClient);
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.oslo.feature.balance.data.repository.autoreload.CreateAutoReloadCall provideCreateAutoReloadCall(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        return new com.paypal.oslo.feature.balance.data.repository.autoreload.CreateAutoReloadCall(apolloClient);
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.oslo.feature.balance.data.repository.autoreload.UpdateAutoReloadCall provideUpdateAutoReloadCall(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        return new com.paypal.oslo.feature.balance.data.repository.autoreload.UpdateAutoReloadCall(apolloClient);
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.oslo.feature.balance.data.repository.autoreload.FetchDepositOptionsCall provideFetchDepositOptionsCall(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        return new com.paypal.oslo.feature.balance.data.repository.autoreload.FetchDepositOptionsCall(apolloClient);
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.oslo.feature.balance.data.repository.autoreload.FetchSavingsAccountsCall provideFetchSavingsAccountsCall(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        return new com.paypal.oslo.feature.balance.data.repository.autoreload.FetchSavingsAccountsCall(apolloClient);
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository provideAutoReloadRepository(com.paypal.oslo.feature.balance.data.repository.autoreload.FetchAutoReloadConfigCall fetchAutoReloadConfigCall, com.paypal.oslo.feature.balance.data.repository.autoreload.CreateAutoReloadCall createAutoReloadCall, com.paypal.oslo.feature.balance.data.repository.autoreload.UpdateAutoReloadCall updateAutoReloadCall, com.paypal.oslo.feature.balance.data.repository.autoreload.DisableAutoReloadCall disableAutoReloadCall, com.paypal.oslo.feature.balance.data.repository.autoreload.FetchDepositOptionsCall fetchDepositOptionsCall, com.paypal.oslo.feature.balance.data.repository.autoreload.FetchSavingsAccountsCall fetchSavingsAccountsCall) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fetchAutoReloadConfigCall, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createAutoReloadCall, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateAutoReloadCall, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disableAutoReloadCall, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fetchDepositOptionsCall, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fetchSavingsAccountsCall, "");
        return new com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadRepositoryImpl(fetchAutoReloadConfigCall, createAutoReloadCall, updateAutoReloadCall, disableAutoReloadCall, fetchDepositOptionsCall, fetchSavingsAccountsCall);
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.oslo.feature.balance.domain.repository.balance.BalanceRepository provideBalanceRepository(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        return new com.paypal.oslo.feature.balance.data.repository.balance.BalanceRepositoryImpl(apolloClient);
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.oslo.feature.balance.domain.repository.nba.NbaRepository provideNbaRepository(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        return new com.paypal.oslo.feature.balance.data.repository.nba.NbaRepositoryImpl(apolloClient);
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoTransferRepository provideAutoTransferRepository(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        return new com.paypal.oslo.feature.balance.data.repository.autoreload.AutoTransferRepositoryImpl(apolloClient);
    }
}
