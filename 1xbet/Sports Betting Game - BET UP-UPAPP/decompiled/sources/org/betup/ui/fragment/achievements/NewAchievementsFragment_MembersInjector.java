package org.betup.ui.fragment.achievements;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.services.user.UserService;
import org.betup.ui.fragment.achievements.controller.AchievementsController;

/* loaded from: classes4.dex */
public final class NewAchievementsFragment_MembersInjector implements MembersInjector<NewAchievementsFragment> {
    private final Provider<AchievementsController> achievementsControllerProvider;
    private final Provider<UserService> userServiceProvider;

    public NewAchievementsFragment_MembersInjector(Provider<AchievementsController> achievementsControllerProvider, Provider<UserService> userServiceProvider) {
        this.achievementsControllerProvider = achievementsControllerProvider;
        this.userServiceProvider = userServiceProvider;
    }

    public static MembersInjector<NewAchievementsFragment> create(Provider<AchievementsController> achievementsControllerProvider, Provider<UserService> userServiceProvider) {
        return new NewAchievementsFragment_MembersInjector(achievementsControllerProvider, userServiceProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(NewAchievementsFragment instance) {
        injectAchievementsController(instance, this.achievementsControllerProvider.get());
        injectUserService(instance, this.userServiceProvider.get());
    }

    public static void injectAchievementsController(NewAchievementsFragment instance, AchievementsController achievementsController) {
        instance.achievementsController = achievementsController;
    }

    public static void injectUserService(NewAchievementsFragment instance, UserService userService) {
        instance.userService = userService;
    }
}
