package org.betup.ui.fragment.notifications.controller;

import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.model.local.interactor.LoadEventsInteractor;
import org.betup.model.local.interactor.ReadAllEventsInteractor;
import org.betup.services.push.PushStorageProvider;
import org.betup.services.user.UserService;

/* loaded from: classes4.dex */
public final class NotificationsController_Factory implements Factory<NotificationsController> {
    private final Provider<LoadEventsInteractor> loadEventsInteractorProvider;
    private final Provider<PushStorageProvider> pushStorageProvider;
    private final Provider<ReadAllEventsInteractor> readAllEventsInteractorProvider;
    private final Provider<UserService> userServiceProvider;

    public NotificationsController_Factory(Provider<LoadEventsInteractor> loadEventsInteractorProvider, Provider<ReadAllEventsInteractor> readAllEventsInteractorProvider, Provider<PushStorageProvider> pushStorageProvider, Provider<UserService> userServiceProvider) {
        this.loadEventsInteractorProvider = loadEventsInteractorProvider;
        this.readAllEventsInteractorProvider = readAllEventsInteractorProvider;
        this.pushStorageProvider = pushStorageProvider;
        this.userServiceProvider = userServiceProvider;
    }

    @Override // javax.inject.Provider
    public NotificationsController get() {
        NotificationsController notificationsController = new NotificationsController();
        NotificationsController_MembersInjector.injectLoadEventsInteractor(notificationsController, this.loadEventsInteractorProvider.get());
        NotificationsController_MembersInjector.injectReadAllEventsInteractor(notificationsController, this.readAllEventsInteractorProvider.get());
        NotificationsController_MembersInjector.injectPushStorageProvider(notificationsController, this.pushStorageProvider.get());
        NotificationsController_MembersInjector.injectUserService(notificationsController, this.userServiceProvider.get());
        return notificationsController;
    }

    public static NotificationsController_Factory create(Provider<LoadEventsInteractor> loadEventsInteractorProvider, Provider<ReadAllEventsInteractor> readAllEventsInteractorProvider, Provider<PushStorageProvider> pushStorageProvider, Provider<UserService> userServiceProvider) {
        return new NotificationsController_Factory(loadEventsInteractorProvider, readAllEventsInteractorProvider, pushStorageProvider, userServiceProvider);
    }

    public static NotificationsController newNotificationsController() {
        return new NotificationsController();
    }
}
