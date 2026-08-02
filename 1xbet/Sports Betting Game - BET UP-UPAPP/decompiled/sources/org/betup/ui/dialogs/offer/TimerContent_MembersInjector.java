package org.betup.ui.dialogs.offer;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.server.V7GetServerInfoInteractor;
import org.betup.services.user.UserService;

/* loaded from: classes2.dex */
public final class TimerContent_MembersInjector implements MembersInjector<TimerContent> {
    private final Provider<V7GetServerInfoInteractor> serverInfoInteractorProvider;
    private final Provider<UserService> userServiceProvider;

    public TimerContent_MembersInjector(Provider<UserService> userServiceProvider, Provider<V7GetServerInfoInteractor> serverInfoInteractorProvider) {
        this.userServiceProvider = userServiceProvider;
        this.serverInfoInteractorProvider = serverInfoInteractorProvider;
    }

    public static MembersInjector<TimerContent> create(Provider<UserService> userServiceProvider, Provider<V7GetServerInfoInteractor> serverInfoInteractorProvider) {
        return new TimerContent_MembersInjector(userServiceProvider, serverInfoInteractorProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(TimerContent instance) {
        injectUserService(instance, this.userServiceProvider.get());
        injectServerInfoInteractor(instance, this.serverInfoInteractorProvider.get());
    }

    public static void injectUserService(TimerContent instance, UserService userService) {
        instance.userService = userService;
    }

    public static void injectServerInfoInteractor(TimerContent instance, V7GetServerInfoInteractor serverInfoInteractor) {
        instance.serverInfoInteractor = serverInfoInteractor;
    }
}
