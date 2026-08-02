package org.betup.ui.fragment.support;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.ui.fragment.support.controller.SupportController;

/* loaded from: classes4.dex */
public final class SupportFragmentK_MembersInjector implements MembersInjector<SupportFragmentK> {
    private final Provider<SupportController> controllerProvider;

    public SupportFragmentK_MembersInjector(Provider<SupportController> controllerProvider) {
        this.controllerProvider = controllerProvider;
    }

    public static MembersInjector<SupportFragmentK> create(Provider<SupportController> controllerProvider) {
        return new SupportFragmentK_MembersInjector(controllerProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(SupportFragmentK instance) {
        injectController(instance, this.controllerProvider.get());
    }

    public static void injectController(SupportFragmentK instance, SupportController controller) {
        instance.controller = controller;
    }
}
