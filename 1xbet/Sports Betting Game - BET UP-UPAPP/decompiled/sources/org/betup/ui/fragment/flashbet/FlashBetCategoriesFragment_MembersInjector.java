package org.betup.ui.fragment.flashbet;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.ui.fragment.flashbet.controller.FlashBetCategoriesController;

/* loaded from: classes4.dex */
public final class FlashBetCategoriesFragment_MembersInjector implements MembersInjector<FlashBetCategoriesFragment> {
    private final Provider<FlashBetCategoriesController> flashBetCategoriesControllerProvider;

    public FlashBetCategoriesFragment_MembersInjector(Provider<FlashBetCategoriesController> flashBetCategoriesControllerProvider) {
        this.flashBetCategoriesControllerProvider = flashBetCategoriesControllerProvider;
    }

    public static MembersInjector<FlashBetCategoriesFragment> create(Provider<FlashBetCategoriesController> flashBetCategoriesControllerProvider) {
        return new FlashBetCategoriesFragment_MembersInjector(flashBetCategoriesControllerProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(FlashBetCategoriesFragment instance) {
        injectFlashBetCategoriesController(instance, this.flashBetCategoriesControllerProvider.get());
    }

    public static void injectFlashBetCategoriesController(FlashBetCategoriesFragment instance, FlashBetCategoriesController flashBetCategoriesController) {
        instance.flashBetCategoriesController = flashBetCategoriesController;
    }
}
