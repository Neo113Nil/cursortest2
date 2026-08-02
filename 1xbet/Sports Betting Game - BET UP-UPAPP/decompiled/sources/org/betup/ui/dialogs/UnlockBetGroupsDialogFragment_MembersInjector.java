package org.betup.ui.dialogs;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.services.user.UserService;

/* loaded from: classes2.dex */
public final class UnlockBetGroupsDialogFragment_MembersInjector implements MembersInjector<UnlockBetGroupsDialogFragment> {
    private final Provider<UserService> userServiceProvider;

    public UnlockBetGroupsDialogFragment_MembersInjector(Provider<UserService> userServiceProvider) {
        this.userServiceProvider = userServiceProvider;
    }

    public static MembersInjector<UnlockBetGroupsDialogFragment> create(Provider<UserService> userServiceProvider) {
        return new UnlockBetGroupsDialogFragment_MembersInjector(userServiceProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(UnlockBetGroupsDialogFragment instance) {
        injectUserService(instance, this.userServiceProvider.get());
    }

    public static void injectUserService(UnlockBetGroupsDialogFragment instance, UserService userService) {
        instance.userService = userService;
    }
}
