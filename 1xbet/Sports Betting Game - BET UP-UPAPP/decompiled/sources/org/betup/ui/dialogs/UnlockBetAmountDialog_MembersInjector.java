package org.betup.ui.dialogs;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.services.user.UserService;

/* loaded from: classes2.dex */
public final class UnlockBetAmountDialog_MembersInjector implements MembersInjector<UnlockBetAmountDialog> {
    private final Provider<UserService> userServiceProvider;

    public UnlockBetAmountDialog_MembersInjector(Provider<UserService> userServiceProvider) {
        this.userServiceProvider = userServiceProvider;
    }

    public static MembersInjector<UnlockBetAmountDialog> create(Provider<UserService> userServiceProvider) {
        return new UnlockBetAmountDialog_MembersInjector(userServiceProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(UnlockBetAmountDialog instance) {
        injectUserService(instance, this.userServiceProvider.get());
    }

    public static void injectUserService(UnlockBetAmountDialog instance, UserService userService) {
        instance.userService = userService;
    }
}
