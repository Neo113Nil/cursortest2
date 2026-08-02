package org.betup.ui.dialogs;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.services.user.UserService;

/* loaded from: classes2.dex */
public final class OddsDialogFragment_MembersInjector implements MembersInjector<OddsDialogFragment> {
    private final Provider<UserService> userServiceProvider;

    public OddsDialogFragment_MembersInjector(Provider<UserService> userServiceProvider) {
        this.userServiceProvider = userServiceProvider;
    }

    public static MembersInjector<OddsDialogFragment> create(Provider<UserService> userServiceProvider) {
        return new OddsDialogFragment_MembersInjector(userServiceProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(OddsDialogFragment instance) {
        injectUserService(instance, this.userServiceProvider.get());
    }

    public static void injectUserService(OddsDialogFragment instance, UserService userService) {
        instance.userService = userService;
    }
}
