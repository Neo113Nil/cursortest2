package org.betup.ui.dialogs.push;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.services.analytics.AnalyticsService;
import org.betup.services.user.UserService;
import org.betup.ui.fragment.home.controller.HomeDailyQuestController;

/* loaded from: classes2.dex */
public final class PushNotificationDialogFragment_MembersInjector implements MembersInjector<PushNotificationDialogFragment> {
    private final Provider<AnalyticsService> analyticsServiceProvider;
    private final Provider<HomeDailyQuestController> homeDailyQuestControllerProvider;
    private final Provider<UserService> userServiceProvider;

    public PushNotificationDialogFragment_MembersInjector(Provider<AnalyticsService> analyticsServiceProvider, Provider<HomeDailyQuestController> homeDailyQuestControllerProvider, Provider<UserService> userServiceProvider) {
        this.analyticsServiceProvider = analyticsServiceProvider;
        this.homeDailyQuestControllerProvider = homeDailyQuestControllerProvider;
        this.userServiceProvider = userServiceProvider;
    }

    public static MembersInjector<PushNotificationDialogFragment> create(Provider<AnalyticsService> analyticsServiceProvider, Provider<HomeDailyQuestController> homeDailyQuestControllerProvider, Provider<UserService> userServiceProvider) {
        return new PushNotificationDialogFragment_MembersInjector(analyticsServiceProvider, homeDailyQuestControllerProvider, userServiceProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(PushNotificationDialogFragment instance) {
        injectAnalyticsService(instance, this.analyticsServiceProvider.get());
        injectHomeDailyQuestController(instance, this.homeDailyQuestControllerProvider.get());
        injectUserService(instance, this.userServiceProvider.get());
    }

    public static void injectAnalyticsService(PushNotificationDialogFragment instance, AnalyticsService analyticsService) {
        instance.analyticsService = analyticsService;
    }

    public static void injectHomeDailyQuestController(PushNotificationDialogFragment instance, HomeDailyQuestController homeDailyQuestController) {
        instance.homeDailyQuestController = homeDailyQuestController;
    }

    public static void injectUserService(PushNotificationDialogFragment instance, UserService userService) {
        instance.userService = userService;
    }
}
