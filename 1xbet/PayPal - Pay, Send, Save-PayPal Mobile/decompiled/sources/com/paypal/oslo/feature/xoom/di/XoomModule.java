package com.paypal.oslo.feature.xoom.di;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\tH\u0007¢\u0006\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/xoom/di/XoomModule;", "", "<init>", "()V", "Lretrofit2/Retrofit;", "retrofit", "Lcom/paypal/oslo/feature/xoom/data/XoomApiService;", "provideEndpointApiService", "(Lretrofit2/Retrofit;)Lcom/paypal/oslo/feature/xoom/data/XoomApiService;", "Lkotlinx/coroutines/CoroutineDispatcher;", "provideIoDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "apiService", "Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;", "localeInformation", "Lcom/paypal/oslo/core/security/RiskDataProvider;", "riskDataProvider", "ioDispatcher", "Lcom/paypal/oslo/feature/xoom/domain/repository/XoomRepository;", "provideXoomRepository", "(Lcom/paypal/oslo/feature/xoom/data/XoomApiService;Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;Lcom/paypal/oslo/core/security/RiskDataProvider;Lkotlinx/coroutines/CoroutineDispatcher;)Lcom/paypal/oslo/feature/xoom/domain/repository/XoomRepository;", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;", "appStorage", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "Lcom/paypal/oslo/feature/xoom/domain/repository/XoomLocalRepository;", "provideXoomLocalRepository", "(Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;Lcom/paypal/oslo/core/userstore/UserStore;Lkotlinx/coroutines/CoroutineDispatcher;)Lcom/paypal/oslo/feature/xoom/domain/repository/XoomLocalRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes16.dex */
public final class XoomModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.xoom.di.XoomModule INSTANCE = new com.paypal.oslo.feature.xoom.di.XoomModule();

    private XoomModule() {
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.xoom.data.XoomApiService provideEndpointApiService(retrofit2.Retrofit retrofit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(retrofit, "");
        java.lang.Object create = retrofit.create(com.paypal.oslo.feature.xoom.data.XoomApiService.class);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "");
        return (com.paypal.oslo.feature.xoom.data.XoomApiService) create;
    }

    @dagger.Provides
    public final kotlinx.coroutines.CoroutineDispatcher provideIoDispatcher() {
        return kotlinx.coroutines.Dispatchers.getIO();
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.xoom.domain.repository.XoomRepository provideXoomRepository(com.paypal.oslo.feature.xoom.data.XoomApiService apiService, com.paypal.oslo.core.appidentity.domain.LocaleInformation localeInformation, com.paypal.oslo.core.security.RiskDataProvider riskDataProvider, kotlinx.coroutines.CoroutineDispatcher ioDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apiService, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeInformation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(riskDataProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ioDispatcher, "");
        return new com.paypal.oslo.feature.xoom.data.repository.XoomRepositoryImpl(apiService, localeInformation, riskDataProvider, ioDispatcher);
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.xoom.domain.repository.XoomLocalRepository provideXoomLocalRepository(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage, com.paypal.oslo.core.userstore.UserStore userStore, kotlinx.coroutines.CoroutineDispatcher ioDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ioDispatcher, "");
        return new com.paypal.oslo.feature.xoom.data.repository.XoomLocalRepositoryImpl(appStorage, userStore, ioDispatcher);
    }
}
