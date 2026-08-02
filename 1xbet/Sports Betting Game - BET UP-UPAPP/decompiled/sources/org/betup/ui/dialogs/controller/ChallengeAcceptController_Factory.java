package org.betup.ui.dialogs.controller;

import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.model.remote.api.interactor.NewChallengeDetailsInteractor;
import org.betup.model.remote.api.rest.energy.ChallengeAcceptInteractor;
import org.betup.model.remote.api.rest.energy.NewChallengeCreateInteractor;
import org.betup.model.remote.api.rest.matches.details.MatchShortInfoInteractor;
import org.betup.services.offer.VideoRewardService;
import org.betup.services.user.UserService;

/* loaded from: classes2.dex */
public final class ChallengeAcceptController_Factory implements Factory<ChallengeAcceptController> {
    private final Provider<ChallengeAcceptInteractor> challengeAcceptInteractorProvider;
    private final Provider<NewChallengeCreateInteractor> challengeCreateInteractorProvider;
    private final Provider<MatchShortInfoInteractor> matchShortInfoInteractorProvider;
    private final Provider<NewChallengeDetailsInteractor> newChallengeDetailsInteractorProvider;
    private final Provider<UserService> userServicePProvider;
    private final Provider<VideoRewardService> videoRewardServiceProvider;

    public ChallengeAcceptController_Factory(Provider<NewChallengeCreateInteractor> challengeCreateInteractorProvider, Provider<ChallengeAcceptInteractor> challengeAcceptInteractorProvider, Provider<UserService> userServicePProvider, Provider<NewChallengeDetailsInteractor> newChallengeDetailsInteractorProvider, Provider<MatchShortInfoInteractor> matchShortInfoInteractorProvider, Provider<VideoRewardService> videoRewardServiceProvider) {
        this.challengeCreateInteractorProvider = challengeCreateInteractorProvider;
        this.challengeAcceptInteractorProvider = challengeAcceptInteractorProvider;
        this.userServicePProvider = userServicePProvider;
        this.newChallengeDetailsInteractorProvider = newChallengeDetailsInteractorProvider;
        this.matchShortInfoInteractorProvider = matchShortInfoInteractorProvider;
        this.videoRewardServiceProvider = videoRewardServiceProvider;
    }

    @Override // javax.inject.Provider
    public ChallengeAcceptController get() {
        ChallengeAcceptController challengeAcceptController = new ChallengeAcceptController();
        ChallengeAcceptController_MembersInjector.injectChallengeCreateInteractor(challengeAcceptController, this.challengeCreateInteractorProvider.get());
        ChallengeAcceptController_MembersInjector.injectChallengeAcceptInteractor(challengeAcceptController, this.challengeAcceptInteractorProvider.get());
        ChallengeAcceptController_MembersInjector.injectUserServiceP(challengeAcceptController, this.userServicePProvider.get());
        ChallengeAcceptController_MembersInjector.injectNewChallengeDetailsInteractor(challengeAcceptController, this.newChallengeDetailsInteractorProvider.get());
        ChallengeAcceptController_MembersInjector.injectMatchShortInfoInteractor(challengeAcceptController, this.matchShortInfoInteractorProvider.get());
        ChallengeAcceptController_MembersInjector.injectVideoRewardService(challengeAcceptController, this.videoRewardServiceProvider.get());
        return challengeAcceptController;
    }

    public static ChallengeAcceptController_Factory create(Provider<NewChallengeCreateInteractor> challengeCreateInteractorProvider, Provider<ChallengeAcceptInteractor> challengeAcceptInteractorProvider, Provider<UserService> userServicePProvider, Provider<NewChallengeDetailsInteractor> newChallengeDetailsInteractorProvider, Provider<MatchShortInfoInteractor> matchShortInfoInteractorProvider, Provider<VideoRewardService> videoRewardServiceProvider) {
        return new ChallengeAcceptController_Factory(challengeCreateInteractorProvider, challengeAcceptInteractorProvider, userServicePProvider, newChallengeDetailsInteractorProvider, matchShortInfoInteractorProvider, videoRewardServiceProvider);
    }

    public static ChallengeAcceptController newChallengeAcceptController() {
        return new ChallengeAcceptController();
    }
}
