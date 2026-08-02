package org.betup.ui.fragment.user;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.ui.fragment.user.controller.UserRankingsController;

/* loaded from: classes4.dex */
public final class UserRankingsFragment_MembersInjector implements MembersInjector<UserRankingsFragment> {
    private final Provider<UserRankingsController> userRankingsControllerProvider;

    public UserRankingsFragment_MembersInjector(Provider<UserRankingsController> userRankingsControllerProvider) {
        this.userRankingsControllerProvider = userRankingsControllerProvider;
    }

    public static MembersInjector<UserRankingsFragment> create(Provider<UserRankingsController> userRankingsControllerProvider) {
        return new UserRankingsFragment_MembersInjector(userRankingsControllerProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(UserRankingsFragment instance) {
        injectUserRankingsController(instance, this.userRankingsControllerProvider.get());
    }

    public static void injectUserRankingsController(UserRankingsFragment instance, UserRankingsController userRankingsController) {
        instance.userRankingsController = userRankingsController;
    }
}
