package org.betup.ui.fragment.flashbet.controller;

import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.flashbet.GetFlashBetCategoriesInteractor;

/* loaded from: classes4.dex */
public final class FlashBetCategoriesController_Factory implements Factory<FlashBetCategoriesController> {
    private final Provider<GetFlashBetCategoriesInteractor> getFlashBetCategoriesInteractorProvider;

    public FlashBetCategoriesController_Factory(Provider<GetFlashBetCategoriesInteractor> getFlashBetCategoriesInteractorProvider) {
        this.getFlashBetCategoriesInteractorProvider = getFlashBetCategoriesInteractorProvider;
    }

    @Override // javax.inject.Provider
    public FlashBetCategoriesController get() {
        return new FlashBetCategoriesController(this.getFlashBetCategoriesInteractorProvider.get());
    }

    public static FlashBetCategoriesController_Factory create(Provider<GetFlashBetCategoriesInteractor> getFlashBetCategoriesInteractorProvider) {
        return new FlashBetCategoriesController_Factory(getFlashBetCategoriesInteractorProvider);
    }
}
