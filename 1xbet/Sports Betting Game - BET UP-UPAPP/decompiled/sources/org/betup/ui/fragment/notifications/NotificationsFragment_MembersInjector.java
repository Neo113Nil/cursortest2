package org.betup.ui.fragment.notifications;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.services.user.UserService;
import org.betup.ui.fragment.notifications.controller.NotificationsController;

/* loaded from: classes4.dex */
public final class NotificationsFragment_MembersInjector implements MembersInjector<NotificationsFragment> {
    private final Provider<NotificationsController> notificationsControllerProvider;
    private final Provider<UserService> userServiceProvider;

    public NotificationsFragment_MembersInjector(Provider<NotificationsController> notificationsControllerProvider, Provider<UserService> userServiceProvider) {
        this.notificationsControllerProvider = notificationsControllerProvider;
        this.userServiceProvider = userServiceProvider;
    }

    public static MembersInjector<NotificationsFragment> create(Provider<NotificationsController> notificationsControllerProvider, Provider<UserService> userServiceProvider) {
        return new NotificationsFragment_MembersInjector(notificationsControllerProvider, userServiceProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(NotificationsFragment instance) {
        injectNotificationsController(instance, this.notificationsControllerProvider.get());
        injectUserService(instance, this.userServiceProvider.get());
    }

    public static void injectNotificationsController(NotificationsFragment instance, NotificationsController notificationsController) {
        instance.notificationsController = notificationsController;
    }

    public static void injectUserService(NotificationsFragment instance, UserService userService) {
        instance.userService = userService;
    }
}
