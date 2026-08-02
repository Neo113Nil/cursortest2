package org.betup.model.remote.api.rest.user;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.model.remote.api.infrastructure.NewVersionBettingApi;
import org.betup.services.user.UserService;

/* loaded from: classes2.dex */
public final class V7VarietyVersionGatesInteractor_Factory implements Factory<V7VarietyVersionGatesInteractor> {
    private final Provider<NewVersionBettingApi> bettingApiProvider;
    private final Provider<Context> contextProvider;
    private final Provider<UserService> userServiceProvider;

    public V7VarietyVersionGatesInteractor_Factory(Provider<Context> contextProvider, Provider<UserService> userServiceProvider, Provider<NewVersionBettingApi> bettingApiProvider) {
        this.contextProvider = contextProvider;
        this.userServiceProvider = userServiceProvider;
        this.bettingApiProvider = bettingApiProvider;
    }

    @Override // javax.inject.Provider
    public V7VarietyVersionGatesInteractor get() {
        V7VarietyVersionGatesInteractor v7VarietyVersionGatesInteractor = new V7VarietyVersionGatesInteractor(this.contextProvider.get());
        V7VarietyVersionGatesInteractor_MembersInjector.injectUserService(v7VarietyVersionGatesInteractor, this.userServiceProvider.get());
        V7VarietyVersionGatesInteractor_MembersInjector.injectBettingApi(v7VarietyVersionGatesInteractor, this.bettingApiProvider.get());
        return v7VarietyVersionGatesInteractor;
    }

    public static V7VarietyVersionGatesInteractor_Factory create(Provider<Context> contextProvider, Provider<UserService> userServiceProvider, Provider<NewVersionBettingApi> bettingApiProvider) {
        return new V7VarietyVersionGatesInteractor_Factory(contextProvider, userServiceProvider, bettingApiProvider);
    }

    public static V7VarietyVersionGatesInteractor newV7VarietyVersionGatesInteractor(Context context) {
        return new V7VarietyVersionGatesInteractor(context);
    }
}
