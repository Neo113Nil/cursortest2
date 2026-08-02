package org.betup.services.push;

import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.user.V7UpdatePushTokenAndLangInteractor;
import org.betup.services.user.UserService;

/* loaded from: classes2.dex */
public final class PushTokenService_Factory implements Factory<PushTokenService> {
    private final Provider<UserService> userServiceProvider;
    private final Provider<V7UpdatePushTokenAndLangInteractor> v7UpdatePushTokenAndLangInteractorProvider;

    public PushTokenService_Factory(Provider<V7UpdatePushTokenAndLangInteractor> v7UpdatePushTokenAndLangInteractorProvider, Provider<UserService> userServiceProvider) {
        this.v7UpdatePushTokenAndLangInteractorProvider = v7UpdatePushTokenAndLangInteractorProvider;
        this.userServiceProvider = userServiceProvider;
    }

    @Override // javax.inject.Provider
    public PushTokenService get() {
        return new PushTokenService(this.v7UpdatePushTokenAndLangInteractorProvider.get(), this.userServiceProvider.get());
    }

    public static PushTokenService_Factory create(Provider<V7UpdatePushTokenAndLangInteractor> v7UpdatePushTokenAndLangInteractorProvider, Provider<UserService> userServiceProvider) {
        return new PushTokenService_Factory(v7UpdatePushTokenAndLangInteractorProvider, userServiceProvider);
    }
}
