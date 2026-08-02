package org.betup.services.casino;

import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.casino.V7CasinoAuthInteractor;
import org.betup.services.user.UserService;

/* loaded from: classes2.dex */
public final class CasinoService_Factory implements Factory<CasinoService> {
    private final Provider<UserService> userServiceProvider;
    private final Provider<V7CasinoAuthInteractor> v7CasinoAuthInteractorProvider;

    public CasinoService_Factory(Provider<V7CasinoAuthInteractor> v7CasinoAuthInteractorProvider, Provider<UserService> userServiceProvider) {
        this.v7CasinoAuthInteractorProvider = v7CasinoAuthInteractorProvider;
        this.userServiceProvider = userServiceProvider;
    }

    @Override // javax.inject.Provider
    public CasinoService get() {
        return new CasinoService(this.v7CasinoAuthInteractorProvider.get(), this.userServiceProvider.get());
    }

    public static CasinoService_Factory create(Provider<V7CasinoAuthInteractor> v7CasinoAuthInteractorProvider, Provider<UserService> userServiceProvider) {
        return new CasinoService_Factory(v7CasinoAuthInteractorProvider, userServiceProvider);
    }
}
