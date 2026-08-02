package org.betup.ui.dialogs.controller;

import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.model.remote.api.interactor.NewChallengeDetailsInteractor;
import org.betup.model.remote.api.rest.energy.ChallengeCancelInteractor;
import org.betup.services.user.UserService;

/* loaded from: classes2.dex */
public final class ChallengePreviewController_Factory implements Factory<ChallengePreviewController> {
    private final Provider<ChallengeCancelInteractor> challengeCancelInteractorProvider;
    private final Provider<NewChallengeDetailsInteractor> newChallengeDetailsInteractorProvider;
    private final Provider<UserService> userServicePProvider;

    public ChallengePreviewController_Factory(Provider<UserService> userServicePProvider, Provider<NewChallengeDetailsInteractor> newChallengeDetailsInteractorProvider, Provider<ChallengeCancelInteractor> challengeCancelInteractorProvider) {
        this.userServicePProvider = userServicePProvider;
        this.newChallengeDetailsInteractorProvider = newChallengeDetailsInteractorProvider;
        this.challengeCancelInteractorProvider = challengeCancelInteractorProvider;
    }

    @Override // javax.inject.Provider
    public ChallengePreviewController get() {
        ChallengePreviewController challengePreviewController = new ChallengePreviewController();
        ChallengePreviewController_MembersInjector.injectUserServiceP(challengePreviewController, this.userServicePProvider.get());
        ChallengePreviewController_MembersInjector.injectNewChallengeDetailsInteractor(challengePreviewController, this.newChallengeDetailsInteractorProvider.get());
        ChallengePreviewController_MembersInjector.injectChallengeCancelInteractor(challengePreviewController, this.challengeCancelInteractorProvider.get());
        return challengePreviewController;
    }

    public static ChallengePreviewController_Factory create(Provider<UserService> userServicePProvider, Provider<NewChallengeDetailsInteractor> newChallengeDetailsInteractorProvider, Provider<ChallengeCancelInteractor> challengeCancelInteractorProvider) {
        return new ChallengePreviewController_Factory(userServicePProvider, newChallengeDetailsInteractorProvider, challengeCancelInteractorProvider);
    }

    public static ChallengePreviewController newChallengePreviewController() {
        return new ChallengePreviewController();
    }
}
