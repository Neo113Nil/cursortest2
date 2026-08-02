package com.paypal.oslo.feature.identity.login.di;

/* loaded from: classes12.dex */
public final class LoginModule_Companion_ProvideObserverCoroutineScopeFactory implements dagger.internal.Factory<kotlinx.coroutines.CoroutineScope> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlinx.coroutines.CoroutineScope get() {
        return provideObserverCoroutineScope();
    }

    public static com.paypal.oslo.feature.identity.login.di.LoginModule_Companion_ProvideObserverCoroutineScopeFactory create() {
        return com.paypal.oslo.feature.identity.login.di.LoginModule_Companion_ProvideObserverCoroutineScopeFactory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static kotlinx.coroutines.CoroutineScope provideObserverCoroutineScope() {
        return (kotlinx.coroutines.CoroutineScope) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.identity.login.di.LoginModule.INSTANCE.provideObserverCoroutineScope());
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.identity.login.di.LoginModule_Companion_ProvideObserverCoroutineScopeFactory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.identity.login.di.LoginModule_Companion_ProvideObserverCoroutineScopeFactory();

        private InstanceHolder() {
        }
    }
}
