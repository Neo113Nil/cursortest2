package com.paypal.oslo.feature.settings.di;

@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001d\u001a\u00020\u001c2\b\b\u0001\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u001fH\u0007¢\u0006\u0004\b \u0010!"}, d2 = {"Lcom/paypal/oslo/feature/settings/di/SettingsModule;", "", "<init>", "()V", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/settings/data/apollo/ISettingsApolloClient;", "provideSettingsApolloClient", "(Lcom/apollographql/apollo/ApolloClient;)Lcom/paypal/oslo/feature/settings/data/apollo/ISettingsApolloClient;", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "Lcom/paypal/oslo/feature/identity/api/IdentityManagement;", "identityManagement", "Lcom/paypal/oslo/feature/consumerprivacy/api/data/IAccountVisibilityLabelProvider;", "accountVisibilityLabelProvider", "Lcom/paypal/oslo/feature/settings/domain/repository/ISettingsRepository;", "provideSettingsRepository", "(Lcom/paypal/oslo/feature/settings/data/apollo/ISettingsApolloClient;Lcom/paypal/oslo/core/userstore/UserStore;Lcom/paypal/oslo/feature/identity/api/IdentityManagement;Lcom/paypal/oslo/feature/consumerprivacy/api/data/IAccountVisibilityLabelProvider;)Lcom/paypal/oslo/feature/settings/domain/repository/ISettingsRepository;", "Lcom/paypal/oslo/feature/settings/closeaccount/domain/repository/CloseAccountRepository;", "provideCloseAccountRepository", "(Lcom/paypal/oslo/feature/settings/data/apollo/ISettingsApolloClient;Lcom/paypal/oslo/core/userstore/UserStore;)Lcom/paypal/oslo/feature/settings/closeaccount/domain/repository/CloseAccountRepository;", "Lcom/paypal/oslo/feature/settings/featureflags/dynamicconfig/SettingsDynamicConfiguration;", "dynamicConfiguration", "Lcom/paypal/oslo/feature/settings/legal/domain/repository/LegalRepository;", "provideLegalRepository", "(Lcom/paypal/oslo/feature/settings/featureflags/dynamicconfig/SettingsDynamicConfiguration;)Lcom/paypal/oslo/feature/settings/legal/domain/repository/LegalRepository;", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/feature/settings/domain/util/SettingsStringsProvider;", "provideSettingsStringProvider", "(Landroid/content/Context;)Lcom/paypal/oslo/feature/settings/domain/util/SettingsStringsProvider;", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "provideSettingsDynamicConfiguration", "(Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;)Lcom/paypal/oslo/feature/settings/featureflags/dynamicconfig/SettingsDynamicConfiguration;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes14.dex */
public final class SettingsModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.settings.di.SettingsModule INSTANCE = new com.paypal.oslo.feature.settings.di.SettingsModule();

    private SettingsModule() {
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.settings.data.apollo.ISettingsApolloClient provideSettingsApolloClient(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        return new com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImpl(apolloClient);
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository provideSettingsRepository(com.paypal.oslo.feature.settings.data.apollo.ISettingsApolloClient apolloClient, com.paypal.oslo.core.userstore.UserStore userStore, com.paypal.oslo.feature.identity.api.IdentityManagement identityManagement, com.paypal.oslo.feature.consumerprivacy.api.data.IAccountVisibilityLabelProvider accountVisibilityLabelProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identityManagement, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountVisibilityLabelProvider, "");
        return new com.paypal.oslo.feature.settings.data.repository.SettingsRepositoryImpl(apolloClient, userStore, identityManagement, accountVisibilityLabelProvider);
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.settings.closeaccount.domain.repository.CloseAccountRepository provideCloseAccountRepository(com.paypal.oslo.feature.settings.data.apollo.ISettingsApolloClient apolloClient, com.paypal.oslo.core.userstore.UserStore userStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        return new com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl(apolloClient, userStore);
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.settings.legal.domain.repository.LegalRepository provideLegalRepository(com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration dynamicConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicConfiguration, "");
        return new com.paypal.oslo.feature.settings.data.repository.LegalRepositoryImpl(dynamicConfiguration);
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider provideSettingsStringProvider(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        android.content.res.Resources resources = context.getResources();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(resources, "");
        return new com.paypal.oslo.feature.settings.ui.util.SettingsStringsProviderImpl(resources);
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration provideSettingsDynamicConfiguration(com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicConfiguration, "");
        return new com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfigurationImpl(dynamicConfiguration);
    }
}
