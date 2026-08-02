package com.paypal.oslo.core.i18n.di;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/core/i18n/di/I18nNetworkModule;", "", "<init>", "()V", "Lretrofit2/Retrofit;", "retrofit", "Lcom/paypal/oslo/core/i18n/data/service/I18nMetadataApiService;", "provideApiService", "(Lretrofit2/Retrofit;)Lcom/paypal/oslo/core/i18n/data/service/I18nMetadataApiService;", "apiService", "Lcom/paypal/oslo/core/i18n/data/repository/NetworkRepository;", "provideNetworkRepository", "(Lcom/paypal/oslo/core/i18n/data/service/I18nMetadataApiService;)Lcom/paypal/oslo/core/i18n/data/repository/NetworkRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes10.dex */
public final class I18nNetworkModule {
    public static final com.paypal.oslo.core.i18n.di.I18nNetworkModule INSTANCE = new com.paypal.oslo.core.i18n.di.I18nNetworkModule();

    private I18nNetworkModule() {
    }

    @dagger.Provides
    public final com.paypal.oslo.core.i18n.data.service.I18nMetadataApiService provideApiService(retrofit2.Retrofit retrofit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(retrofit, "");
        java.lang.Object create = retrofit.create(com.paypal.oslo.core.i18n.data.service.I18nMetadataApiService.class);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "");
        return (com.paypal.oslo.core.i18n.data.service.I18nMetadataApiService) create;
    }

    @dagger.Provides
    public final com.paypal.oslo.core.i18n.data.repository.NetworkRepository provideNetworkRepository(com.paypal.oslo.core.i18n.data.service.I18nMetadataApiService apiService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apiService, "");
        return new com.paypal.oslo.core.i18n.data.repository.NetworkRepository(apiService);
    }
}
