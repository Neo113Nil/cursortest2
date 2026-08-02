package org.betup.ui.fragment.notifications.controller;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.local.interactor.LoadEventsInteractor;
import org.betup.model.local.interactor.ReadAllEventsInteractor;
import org.betup.services.push.PushStorageProvider;
import org.betup.services.user.UserService;

/* loaded from: classes4.dex */
public final class NotificationsController_MembersInjector implements MembersInjector<NotificationsController> {
    private final Provider<LoadEventsInteractor> loadEventsInteractorProvider;
    private final Provider<PushStorageProvider> pushStorageProvider;
    private final Provider<ReadAllEventsInteractor> readAllEventsInteractorProvider;
    private final Provider<UserService> userServiceProvider;

    public NotificationsController_MembersInjector(Provider<LoadEventsInteractor> loadEventsInteractorProvider, Provider<ReadAllEventsInteractor> readAllEventsInteractorProvider, Provider<PushStorageProvider> pushStorageProvider, Provider<UserService> userServiceProvider) {
        this.loadEventsInteractorProvider = loadEventsInteractorProvider;
        this.readAllEventsInteractorProvider = readAllEventsInteractorProvider;
        this.pushStorageProvider = pushStorageProvider;
        this.userServiceProvider = userServiceProvider;
    }

    public static MembersInjector<NotificationsController> create(Provider<LoadEventsInteractor> loadEventsInteractorProvider, Provider<ReadAllEventsInteractor> readAllEventsInteractorProvider, Provider<PushStorageProvider> pushStorageProvider, Provider<UserService> userServiceProvider) {
        return new NotificationsController_MembersInjector(loadEventsInteractorProvider, readAllEventsInteractorProvider, pushStorageProvider, userServiceProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(NotificationsController instance) {
        injectLoadEventsInteractor(instance, this.loadEventsInteractorProvider.get());
        injectReadAllEventsInteractor(instance, this.readAllEventsInteractorProvider.get());
        injectPushStorageProvider(instance, this.pushStorageProvider.get());
        injectUserService(instance, this.userServiceProvider.get());
    }

    public static void injectLoadEventsInteractor(NotificationsController instance, LoadEventsInteractor loadEventsInteractor) {
        instance.loadEventsInteractor = loadEventsInteractor;
    }

    public static void injectReadAllEventsInteractor(NotificationsController instance, ReadAllEventsInteractor readAllEventsInteractor) {
        instance.readAllEventsInteractor = readAllEventsInteractor;
    }

    public static void injectPushStorageProvider(NotificationsController instance, PushStorageProvider pushStorageProvider) {
        instance.pushStorageProvider = pushStorageProvider;
    }

    public static void injectUserService(NotificationsController instance, UserService userService) {
        instance.userService = userService;
    }
}
