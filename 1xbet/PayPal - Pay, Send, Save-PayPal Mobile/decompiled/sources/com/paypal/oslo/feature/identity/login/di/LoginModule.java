package com.paypal.oslo.feature.identity.login.di;

@kotlin.Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u0000 '2\u00020\u0001:\u0001'J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0013H'¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0017H'¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u001bH'¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020\u001fH'¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020$2\u0006\u0010\u0003\u001a\u00020#H'¢\u0006\u0004\b%\u0010&À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/di/LoginModule;", "", "Lcom/paypal/oslo/feature/identity/login/data/repository/LoginRepositoryImpl;", "impl", "Lcom/paypal/oslo/feature/identity/login/domain/repository/LoginRepository;", "bindLoginRepo", "(Lcom/paypal/oslo/feature/identity/login/data/repository/LoginRepositoryImpl;)Lcom/paypal/oslo/feature/identity/login/domain/repository/LoginRepository;", "Lcom/paypal/oslo/feature/identity/login/data/AuthenticationInputFactoryImpl;", "Lcom/paypal/oslo/feature/identity/api/AuthenticationInputFactory;", "bindAuthenticationInputFactory", "(Lcom/paypal/oslo/feature/identity/login/data/AuthenticationInputFactoryImpl;)Lcom/paypal/oslo/feature/identity/api/AuthenticationInputFactory;", "Lcom/paypal/oslo/feature/identity/login/data/observer/SignupPassiveLoginTokenObserverImpl;", "Lcom/paypal/oslo/feature/identity/login/domain/observer/SignupPassiveLoginTokenObserver;", "bindIdentityTokenObserver", "(Lcom/paypal/oslo/feature/identity/login/data/observer/SignupPassiveLoginTokenObserverImpl;)Lcom/paypal/oslo/feature/identity/login/domain/observer/SignupPassiveLoginTokenObserver;", "Lcom/paypal/oslo/feature/identity/login/DefaultElapsedRealtimeProvider;", "Lcom/paypal/oslo/feature/identity/login/ElapsedRealtimeProvider;", "bindElapsedRealtimeProvider", "(Lcom/paypal/oslo/feature/identity/login/DefaultElapsedRealtimeProvider;)Lcom/paypal/oslo/feature/identity/login/ElapsedRealtimeProvider;", "Lcom/paypal/oslo/feature/identity/login/data/repository/InContextLoginProviderImpl;", "Lcom/paypal/oslo/feature/identity/login/domain/repository/InContextLoginProvider;", "bindInContextLoginProvider", "(Lcom/paypal/oslo/feature/identity/login/data/repository/InContextLoginProviderImpl;)Lcom/paypal/oslo/feature/identity/login/domain/repository/InContextLoginProvider;", "Lcom/paypal/oslo/feature/identity/login/IdentityLoginFlowStoreImpl;", "Lcom/paypal/oslo/feature/identity/login/domain/IdentityLoginFlowStore;", "bindLoginFlowStore", "(Lcom/paypal/oslo/feature/identity/login/IdentityLoginFlowStoreImpl;)Lcom/paypal/oslo/feature/identity/login/domain/IdentityLoginFlowStore;", "Lcom/paypal/oslo/feature/identity/login/domain/reducer/IdentityLoginReducerImpl;", "Lcom/paypal/oslo/feature/identity/login/domain/reducer/IdentityLoginFlowReducer;", "bindLoginFlowReducer", "(Lcom/paypal/oslo/feature/identity/login/domain/reducer/IdentityLoginReducerImpl;)Lcom/paypal/oslo/feature/identity/login/domain/reducer/IdentityLoginFlowReducer;", "Lcom/paypal/oslo/feature/identity/login/IdentityLoginFlowEffectExecutorImpl;", "Lcom/paypal/oslo/feature/identity/login/IdentityLoginFlowEffectExecutor;", "bindAuthFlowEffectExecutor", "(Lcom/paypal/oslo/feature/identity/login/IdentityLoginFlowEffectExecutorImpl;)Lcom/paypal/oslo/feature/identity/login/IdentityLoginFlowEffectExecutor;", "Lcom/paypal/oslo/feature/identity/login/ActivityProviderImpl;", "Lcom/paypal/oslo/feature/identity/login/ActivityProvider;", "bindActivityProvider", "(Lcom/paypal/oslo/feature/identity/login/ActivityProviderImpl;)Lcom/paypal/oslo/feature/identity/login/ActivityProvider;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes12.dex */
public interface LoginModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.login.di.LoginModule.Companion INSTANCE = com.paypal.oslo.feature.identity.login.di.LoginModule.Companion.getHighSpeedVideoFpsRangesFor;

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.identity.login.ActivityProvider bindActivityProvider(com.paypal.oslo.feature.identity.login.ActivityProviderImpl impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutor bindAuthFlowEffectExecutor(com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.identity.api.AuthenticationInputFactory bindAuthenticationInputFactory(com.paypal.oslo.feature.identity.login.data.AuthenticationInputFactoryImpl impl);

    @dagger.Binds
    com.paypal.oslo.feature.identity.login.ElapsedRealtimeProvider bindElapsedRealtimeProvider(com.paypal.oslo.feature.identity.login.DefaultElapsedRealtimeProvider impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.identity.login.domain.observer.SignupPassiveLoginTokenObserver bindIdentityTokenObserver(com.paypal.oslo.feature.identity.login.data.observer.SignupPassiveLoginTokenObserverImpl impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.identity.login.domain.repository.InContextLoginProvider bindInContextLoginProvider(com.paypal.oslo.feature.identity.login.data.repository.InContextLoginProviderImpl impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.identity.login.domain.reducer.IdentityLoginFlowReducer bindLoginFlowReducer(com.paypal.oslo.feature.identity.login.domain.reducer.IdentityLoginReducerImpl impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.identity.login.domain.IdentityLoginFlowStore bindLoginFlowStore(com.paypal.oslo.feature.identity.login.IdentityLoginFlowStoreImpl impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.identity.login.domain.repository.LoginRepository bindLoginRepo(com.paypal.oslo.feature.identity.login.data.repository.LoginRepositoryImpl impl);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/di/LoginModule$Companion;", "", "<init>", "()V", "Lkotlinx/coroutines/CoroutineScope;", "provideObserverCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.paypal.oslo.feature.identity.login.di.LoginModule.Companion getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.identity.login.di.LoginModule.Companion();

        private Companion() {
        }

        @dagger.Provides
        @javax.inject.Singleton
        public final kotlinx.coroutines.CoroutineScope provideObserverCoroutineScope() {
            return kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null).plus(kotlinx.coroutines.Dispatchers.getDefault()));
        }
    }
}
