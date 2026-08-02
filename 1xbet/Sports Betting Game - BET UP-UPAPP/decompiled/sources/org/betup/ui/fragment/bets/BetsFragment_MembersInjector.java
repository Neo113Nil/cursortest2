package org.betup.ui.fragment.bets;

import dagger.MembersInjector;
import javax.inject.Provider;

/* loaded from: classes4.dex */
public final class BetsFragment_MembersInjector implements MembersInjector<BetsFragment> {
    private final Provider<BetsController> controllerProvider;

    public BetsFragment_MembersInjector(Provider<BetsController> controllerProvider) {
        this.controllerProvider = controllerProvider;
    }

    public static MembersInjector<BetsFragment> create(Provider<BetsController> controllerProvider) {
        return new BetsFragment_MembersInjector(controllerProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(BetsFragment instance) {
        injectController(instance, this.controllerProvider.get());
    }

    public static void injectController(BetsFragment instance, BetsController controller) {
        instance.controller = controller;
    }
}
