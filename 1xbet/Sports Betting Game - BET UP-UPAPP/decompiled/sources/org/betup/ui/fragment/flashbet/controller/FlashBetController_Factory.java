package org.betup.ui.fragment.flashbet.controller;

import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.flashbet.GetFlashBetSportsInteractor;
import org.betup.model.remote.api.rest.flashbet.GetFlashBetStatsInteractor;
import org.betup.model.remote.api.rest.flashbet.GetPendingFlashBetSessionInteractor;

/* loaded from: classes4.dex */
public final class FlashBetController_Factory implements Factory<FlashBetController> {
    private final Provider<GetFlashBetSportsInteractor> getFlashBetSportsInteractorProvider;
    private final Provider<GetFlashBetStatsInteractor> getFlashBetStatsInteractorProvider;
    private final Provider<GetPendingFlashBetSessionInteractor> getPendingFlashBetSessionInteractorProvider;

    public FlashBetController_Factory(Provider<GetFlashBetSportsInteractor> getFlashBetSportsInteractorProvider, Provider<GetFlashBetStatsInteractor> getFlashBetStatsInteractorProvider, Provider<GetPendingFlashBetSessionInteractor> getPendingFlashBetSessionInteractorProvider) {
        this.getFlashBetSportsInteractorProvider = getFlashBetSportsInteractorProvider;
        this.getFlashBetStatsInteractorProvider = getFlashBetStatsInteractorProvider;
        this.getPendingFlashBetSessionInteractorProvider = getPendingFlashBetSessionInteractorProvider;
    }

    @Override // javax.inject.Provider
    public FlashBetController get() {
        return new FlashBetController(this.getFlashBetSportsInteractorProvider.get(), this.getFlashBetStatsInteractorProvider.get(), this.getPendingFlashBetSessionInteractorProvider.get());
    }

    public static FlashBetController_Factory create(Provider<GetFlashBetSportsInteractor> getFlashBetSportsInteractorProvider, Provider<GetFlashBetStatsInteractor> getFlashBetStatsInteractorProvider, Provider<GetPendingFlashBetSessionInteractor> getPendingFlashBetSessionInteractorProvider) {
        return new FlashBetController_Factory(getFlashBetSportsInteractorProvider, getFlashBetStatsInteractorProvider, getPendingFlashBetSessionInteractorProvider);
    }
}
