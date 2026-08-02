package org.betup.ui.dialogs.controller;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.remote.api.interactor.NewChallengeDetailsInteractor;
import org.betup.model.remote.api.rest.energy.ChallengeCancelInteractor;
import org.betup.services.user.UserService;

/* loaded from: classes2.dex */
public final class ChallengePreviewController_MembersInjector implements MembersInjector<ChallengePreviewController> {
    private final Provider<ChallengeCancelInteractor> challengeCancelInteractorProvider;
    private final Provider<NewChallengeDetailsInteractor> newChallengeDetailsInteractorProvider;
    private final Provider<UserService> userServicePProvider;

    public ChallengePreviewController_MembersInjector(Provider<UserService> userServicePProvider, Provider<NewChallengeDetailsInteractor> newChallengeDetailsInteractorProvider, Provider<ChallengeCancelInteractor> challengeCancelInteractorProvider) {
        this.userServicePProvider = userServicePProvider;
        this.newChallengeDetailsInteractorProvider = newChallengeDetailsInteractorProvider;
        this.challengeCancelInteractorProvider = challengeCancelInteractorProvider;
    }

    public static MembersInjector<ChallengePreviewController> create(Provider<UserService> userServicePProvider, Provider<NewChallengeDetailsInteractor> newChallengeDetailsInteractorProvider, Provider<ChallengeCancelInteractor> challengeCancelInteractorProvider) {
        return new ChallengePreviewController_MembersInjector(userServicePProvider, newChallengeDetailsInteractorProvider, challengeCancelInteractorProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ChallengePreviewController instance) {
        injectUserServiceP(instance, this.userServicePProvider.get());
        injectNewChallengeDetailsInteractor(instance, this.newChallengeDetailsInteractorProvider.get());
        injectChallengeCancelInteractor(instance, this.challengeCancelInteractorProvider.get());
    }

    public static void injectUserServiceP(ChallengePreviewController instance, UserService userServiceP) {
        instance.userServiceP = userServiceP;
    }

    public static void injectNewChallengeDetailsInteractor(ChallengePreviewController instance, NewChallengeDetailsInteractor newChallengeDetailsInteractor) {
        instance.newChallengeDetailsInteractor = newChallengeDetailsInteractor;
    }

    public static void injectChallengeCancelInteractor(ChallengePreviewController instance, ChallengeCancelInteractor challengeCancelInteractor) {
        instance.challengeCancelInteractor = challengeCancelInteractor;
    }
}
