package org.betup.ui.fragment.flashbet;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.ui.fragment.flashbet.controller.FlashBetMatchStartController;

/* loaded from: classes4.dex */
public final class FlashBetMatchStartFragment_MembersInjector implements MembersInjector<FlashBetMatchStartFragment> {
    private final Provider<FlashBetMatchStartController> controllerProvider;

    public FlashBetMatchStartFragment_MembersInjector(Provider<FlashBetMatchStartController> controllerProvider) {
        this.controllerProvider = controllerProvider;
    }

    public static MembersInjector<FlashBetMatchStartFragment> create(Provider<FlashBetMatchStartController> controllerProvider) {
        return new FlashBetMatchStartFragment_MembersInjector(controllerProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(FlashBetMatchStartFragment instance) {
        injectController(instance, this.controllerProvider.get());
    }

    public static void injectController(FlashBetMatchStartFragment instance, FlashBetMatchStartController controller) {
        instance.controller = controller;
    }
}
