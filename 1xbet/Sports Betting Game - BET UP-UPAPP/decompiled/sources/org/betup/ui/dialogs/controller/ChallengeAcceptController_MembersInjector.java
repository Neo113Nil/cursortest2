package org.betup.ui.dialogs.controller;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.remote.api.interactor.NewChallengeDetailsInteractor;
import org.betup.model.remote.api.rest.energy.ChallengeAcceptInteractor;
import org.betup.model.remote.api.rest.energy.NewChallengeCreateInteractor;
import org.betup.model.remote.api.rest.matches.details.MatchShortInfoInteractor;
import org.betup.services.offer.VideoRewardService;
import org.betup.services.user.UserService;

/* loaded from: classes2.dex */
public final class ChallengeAcceptController_MembersInjector implements MembersInjector<ChallengeAcceptController> {
    private final Provider<ChallengeAcceptInteractor> challengeAcceptInteractorProvider;
    private final Provider<NewChallengeCreateInteractor> challengeCreateInteractorProvider;
    private final Provider<MatchShortInfoInteractor> matchShortInfoInteractorProvider;
    private final Provider<NewChallengeDetailsInteractor> newChallengeDetailsInteractorProvider;
    private final Provider<UserService> userServicePProvider;
    private final Provider<VideoRewardService> videoRewardServiceProvider;

    public ChallengeAcceptController_MembersInjector(Provider<NewChallengeCreateInteractor> challengeCreateInteractorProvider, Provider<ChallengeAcceptInteractor> challengeAcceptInteractorProvider, Provider<UserService> userServicePProvider, Provider<NewChallengeDetailsInteractor> newChallengeDetailsInteractorProvider, Provider<MatchShortInfoInteractor> matchShortInfoInteractorProvider, Provider<VideoRewardService> videoRewardServiceProvider) {
        this.challengeCreateInteractorProvider = challengeCreateInteractorProvider;
        this.challengeAcceptInteractorProvider = challengeAcceptInteractorProvider;
        this.userServicePProvider = userServicePProvider;
        this.newChallengeDetailsInteractorProvider = newChallengeDetailsInteractorProvider;
        this.matchShortInfoInteractorProvider = matchShortInfoInteractorProvider;
        this.videoRewardServiceProvider = videoRewardServiceProvider;
    }

    public static MembersInjector<ChallengeAcceptController> create(Provider<NewChallengeCreateInteractor> challengeCreateInteractorProvider, Provider<ChallengeAcceptInteractor> challengeAcceptInteractorProvider, Provider<UserService> userServicePProvider, Provider<NewChallengeDetailsInteractor> newChallengeDetailsInteractorProvider, Provider<MatchShortInfoInteractor> matchShortInfoInteractorProvider, Provider<VideoRewardService> videoRewardServiceProvider) {
        return new ChallengeAcceptController_MembersInjector(challengeCreateInteractorProvider, challengeAcceptInteractorProvider, userServicePProvider, newChallengeDetailsInteractorProvider, matchShortInfoInteractorProvider, videoRewardServiceProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ChallengeAcceptController instance) {
        injectChallengeCreateInteractor(instance, this.challengeCreateInteractorProvider.get());
        injectChallengeAcceptInteractor(instance, this.challengeAcceptInteractorProvider.get());
        injectUserServiceP(instance, this.userServicePProvider.get());
        injectNewChallengeDetailsInteractor(instance, this.newChallengeDetailsInteractorProvider.get());
        injectMatchShortInfoInteractor(instance, this.matchShortInfoInteractorProvider.get());
        injectVideoRewardService(instance, this.videoRewardServiceProvider.get());
    }

    public static void injectChallengeCreateInteractor(ChallengeAcceptController instance, NewChallengeCreateInteractor challengeCreateInteractor) {
        instance.challengeCreateInteractor = challengeCreateInteractor;
    }

    public static void injectChallengeAcceptInteractor(ChallengeAcceptController instance, ChallengeAcceptInteractor challengeAcceptInteractor) {
        instance.challengeAcceptInteractor = challengeAcceptInteractor;
    }

    public static void injectUserServiceP(ChallengeAcceptController instance, UserService userServiceP) {
        instance.userServiceP = userServiceP;
    }

    public static void injectNewChallengeDetailsInteractor(ChallengeAcceptController instance, NewChallengeDetailsInteractor newChallengeDetailsInteractor) {
        instance.newChallengeDetailsInteractor = newChallengeDetailsInteractor;
    }

    public static void injectMatchShortInfoInteractor(ChallengeAcceptController instance, MatchShortInfoInteractor matchShortInfoInteractor) {
        instance.matchShortInfoInteractor = matchShortInfoInteractor;
    }

    public static void injectVideoRewardService(ChallengeAcceptController instance, VideoRewardService videoRewardService) {
        instance.videoRewardService = videoRewardService;
    }
}
