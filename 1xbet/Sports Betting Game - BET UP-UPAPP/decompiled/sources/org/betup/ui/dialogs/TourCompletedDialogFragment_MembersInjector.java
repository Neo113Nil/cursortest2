package org.betup.ui.dialogs;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.services.user.UserService;

/* loaded from: classes2.dex */
public final class TourCompletedDialogFragment_MembersInjector implements MembersInjector<TourCompletedDialogFragment> {
    private final Provider<UserService> userServiceProvider;

    public TourCompletedDialogFragment_MembersInjector(Provider<UserService> userServiceProvider) {
        this.userServiceProvider = userServiceProvider;
    }

    public static MembersInjector<TourCompletedDialogFragment> create(Provider<UserService> userServiceProvider) {
        return new TourCompletedDialogFragment_MembersInjector(userServiceProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(TourCompletedDialogFragment instance) {
        injectUserService(instance, this.userServiceProvider.get());
    }

    public static void injectUserService(TourCompletedDialogFragment instance, UserService userService) {
        instance.userService = userService;
    }
}
