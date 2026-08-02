package com.paypal.oslo.feature.revolvingcreditservicing.di;

/* loaded from: classes14.dex */
public final class RepositoryBindingsModule_Companion_ProvideStatementServiceFactory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.data.api.StatementService> {
    private final dagger.internal.Provider<retrofit2.Retrofit> Camera2StreamConfigurationMap;

    private RepositoryBindingsModule_Companion_ProvideStatementServiceFactory(dagger.internal.Provider<retrofit2.Retrofit> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.data.api.StatementService get() {
        return provideStatementService(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.di.RepositoryBindingsModule_Companion_ProvideStatementServiceFactory create(dagger.internal.Provider<retrofit2.Retrofit> provider) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.di.RepositoryBindingsModule_Companion_ProvideStatementServiceFactory(provider);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.data.api.StatementService provideStatementService(retrofit2.Retrofit retrofit) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.data.api.StatementService) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.revolvingcreditservicing.di.RepositoryBindingsModule.INSTANCE.provideStatementService(retrofit));
    }
}
