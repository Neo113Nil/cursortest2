package org.betup.ui.fragment.settings.subscriptions;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.ui.fragment.settings.subscriptions.controller.AllSubscriptionsController;

/* loaded from: classes4.dex */
public final class AllSubscriptionsFragment_MembersInjector implements MembersInjector<AllSubscriptionsFragment> {
    private final Provider<AllSubscriptionsController> controllerProvider;

    public AllSubscriptionsFragment_MembersInjector(Provider<AllSubscriptionsController> controllerProvider) {
        this.controllerProvider = controllerProvider;
    }

    public static MembersInjector<AllSubscriptionsFragment> create(Provider<AllSubscriptionsController> controllerProvider) {
        return new AllSubscriptionsFragment_MembersInjector(controllerProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(AllSubscriptionsFragment instance) {
        injectController(instance, this.controllerProvider.get());
    }

    public static void injectController(AllSubscriptionsFragment instance, AllSubscriptionsController controller) {
        instance.controller = controller;
    }
}
