package org.betup.model.remote.api.rest.user;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.remote.api.infrastructure.NewVersionBettingApi;
import org.betup.services.user.UserService;

/* loaded from: classes2.dex */
public final class V7VarietyVersionGatesInteractor_MembersInjector implements MembersInjector<V7VarietyVersionGatesInteractor> {
    private final Provider<NewVersionBettingApi> bettingApiProvider;
    private final Provider<UserService> userServiceProvider;

    public V7VarietyVersionGatesInteractor_MembersInjector(Provider<UserService> userServiceProvider, Provider<NewVersionBettingApi> bettingApiProvider) {
        this.userServiceProvider = userServiceProvider;
        this.bettingApiProvider = bettingApiProvider;
    }

    public static MembersInjector<V7VarietyVersionGatesInteractor> create(Provider<UserService> userServiceProvider, Provider<NewVersionBettingApi> bettingApiProvider) {
        return new V7VarietyVersionGatesInteractor_MembersInjector(userServiceProvider, bettingApiProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(V7VarietyVersionGatesInteractor instance) {
        injectUserService(instance, this.userServiceProvider.get());
        injectBettingApi(instance, this.bettingApiProvider.get());
    }

    public static void injectUserService(V7VarietyVersionGatesInteractor instance, UserService userService) {
        instance.userService = userService;
    }

    public static void injectBettingApi(V7VarietyVersionGatesInteractor instance, NewVersionBettingApi bettingApi) {
        instance.bettingApi = bettingApi;
    }
}
