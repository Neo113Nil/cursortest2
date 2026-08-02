package org.betup.ui.fragment.flashbet;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.flashbet.GetFlashBetSessionInteractor;
import org.betup.services.user.UserService;

/* loaded from: classes4.dex */
public final class FlashBetDetailsDialogFragment_MembersInjector implements MembersInjector<FlashBetDetailsDialogFragment> {
    private final Provider<GetFlashBetSessionInteractor> getFlashBetSessionInteractorProvider;
    private final Provider<UserService> userServiceProvider;

    public FlashBetDetailsDialogFragment_MembersInjector(Provider<GetFlashBetSessionInteractor> getFlashBetSessionInteractorProvider, Provider<UserService> userServiceProvider) {
        this.getFlashBetSessionInteractorProvider = getFlashBetSessionInteractorProvider;
        this.userServiceProvider = userServiceProvider;
    }

    public static MembersInjector<FlashBetDetailsDialogFragment> create(Provider<GetFlashBetSessionInteractor> getFlashBetSessionInteractorProvider, Provider<UserService> userServiceProvider) {
        return new FlashBetDetailsDialogFragment_MembersInjector(getFlashBetSessionInteractorProvider, userServiceProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(FlashBetDetailsDialogFragment instance) {
        injectGetFlashBetSessionInteractor(instance, this.getFlashBetSessionInteractorProvider.get());
        injectUserService(instance, this.userServiceProvider.get());
    }

    public static void injectGetFlashBetSessionInteractor(FlashBetDetailsDialogFragment instance, GetFlashBetSessionInteractor getFlashBetSessionInteractor) {
        instance.getFlashBetSessionInteractor = getFlashBetSessionInteractor;
    }

    public static void injectUserService(FlashBetDetailsDialogFragment instance, UserService userService) {
        instance.userService = userService;
    }
}
