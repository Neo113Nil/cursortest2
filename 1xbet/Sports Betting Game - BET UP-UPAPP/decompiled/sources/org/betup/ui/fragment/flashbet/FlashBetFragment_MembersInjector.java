package org.betup.ui.fragment.flashbet;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.ui.fragment.flashbet.controller.FlashBetController;

/* loaded from: classes4.dex */
public final class FlashBetFragment_MembersInjector implements MembersInjector<FlashBetFragment> {
    private final Provider<FlashBetController> flashBetControllerProvider;

    public FlashBetFragment_MembersInjector(Provider<FlashBetController> flashBetControllerProvider) {
        this.flashBetControllerProvider = flashBetControllerProvider;
    }

    public static MembersInjector<FlashBetFragment> create(Provider<FlashBetController> flashBetControllerProvider) {
        return new FlashBetFragment_MembersInjector(flashBetControllerProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(FlashBetFragment instance) {
        injectFlashBetController(instance, this.flashBetControllerProvider.get());
    }

    public static void injectFlashBetController(FlashBetFragment instance, FlashBetController flashBetController) {
        instance.flashBetController = flashBetController;
    }
}
