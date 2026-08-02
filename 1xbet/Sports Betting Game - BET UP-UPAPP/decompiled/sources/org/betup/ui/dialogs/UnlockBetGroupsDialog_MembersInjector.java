package org.betup.ui.dialogs;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.services.user.UserService;

/* loaded from: classes2.dex */
public final class UnlockBetGroupsDialog_MembersInjector implements MembersInjector<UnlockBetGroupsDialog> {
    private final Provider<UserService> userServiceProvider;

    public UnlockBetGroupsDialog_MembersInjector(Provider<UserService> userServiceProvider) {
        this.userServiceProvider = userServiceProvider;
    }

    public static MembersInjector<UnlockBetGroupsDialog> create(Provider<UserService> userServiceProvider) {
        return new UnlockBetGroupsDialog_MembersInjector(userServiceProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(UnlockBetGroupsDialog instance) {
        injectUserService(instance, this.userServiceProvider.get());
    }

    public static void injectUserService(UnlockBetGroupsDialog instance, UserService userService) {
        instance.userService = userService;
    }
}
