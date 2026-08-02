package org.betup.ui.fragment.flashbet;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.ui.fragment.flashbet.controller.FlashBetGameController;

/* loaded from: classes4.dex */
public final class FlashBetGameFragment_MembersInjector implements MembersInjector<FlashBetGameFragment> {
    private final Provider<FlashBetGameController> controllerProvider;

    public FlashBetGameFragment_MembersInjector(Provider<FlashBetGameController> controllerProvider) {
        this.controllerProvider = controllerProvider;
    }

    public static MembersInjector<FlashBetGameFragment> create(Provider<FlashBetGameController> controllerProvider) {
        return new FlashBetGameFragment_MembersInjector(controllerProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(FlashBetGameFragment instance) {
        injectController(instance, this.controllerProvider.get());
    }

    public static void injectController(FlashBetGameFragment instance, FlashBetGameController controller) {
        instance.controller = controller;
    }
}
