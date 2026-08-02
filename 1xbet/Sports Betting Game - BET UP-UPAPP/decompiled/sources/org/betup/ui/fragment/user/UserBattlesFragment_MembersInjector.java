package org.betup.ui.fragment.user;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.ui.fragment.user.controller.UserBattlesController;

/* loaded from: classes4.dex */
public final class UserBattlesFragment_MembersInjector implements MembersInjector<UserBattlesFragment> {
    private final Provider<UserBattlesController> userBattlesControllerProvider;

    public UserBattlesFragment_MembersInjector(Provider<UserBattlesController> userBattlesControllerProvider) {
        this.userBattlesControllerProvider = userBattlesControllerProvider;
    }

    public static MembersInjector<UserBattlesFragment> create(Provider<UserBattlesController> userBattlesControllerProvider) {
        return new UserBattlesFragment_MembersInjector(userBattlesControllerProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(UserBattlesFragment instance) {
        injectUserBattlesController(instance, this.userBattlesControllerProvider.get());
    }

    public static void injectUserBattlesController(UserBattlesFragment instance, UserBattlesController userBattlesController) {
        instance.userBattlesController = userBattlesController;
    }
}
