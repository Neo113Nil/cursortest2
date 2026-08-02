package org.betup.ui.fragment.flashbet.controller;

import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.flashbet.StartFlashBetGameInteractor;
import org.betup.model.remote.api.rest.matches.GetRandomTeamImagesInteractor;
import org.betup.services.user.UserService;

/* loaded from: classes4.dex */
public final class FlashBetMatchStartController_Factory implements Factory<FlashBetMatchStartController> {
    private final Provider<GetRandomTeamImagesInteractor> getRandomTeamImagesInteractorProvider;
    private final Provider<StartFlashBetGameInteractor> startFlashBetGameInteractorProvider;
    private final Provider<UserService> userServiceProvider;

    public FlashBetMatchStartController_Factory(Provider<StartFlashBetGameInteractor> startFlashBetGameInteractorProvider, Provider<GetRandomTeamImagesInteractor> getRandomTeamImagesInteractorProvider, Provider<UserService> userServiceProvider) {
        this.startFlashBetGameInteractorProvider = startFlashBetGameInteractorProvider;
        this.getRandomTeamImagesInteractorProvider = getRandomTeamImagesInteractorProvider;
        this.userServiceProvider = userServiceProvider;
    }

    @Override // javax.inject.Provider
    public FlashBetMatchStartController get() {
        return new FlashBetMatchStartController(this.startFlashBetGameInteractorProvider.get(), this.getRandomTeamImagesInteractorProvider.get(), this.userServiceProvider.get());
    }

    public static FlashBetMatchStartController_Factory create(Provider<StartFlashBetGameInteractor> startFlashBetGameInteractorProvider, Provider<GetRandomTeamImagesInteractor> getRandomTeamImagesInteractorProvider, Provider<UserService> userServiceProvider) {
        return new FlashBetMatchStartController_Factory(startFlashBetGameInteractorProvider, getRandomTeamImagesInteractorProvider, userServiceProvider);
    }
}
