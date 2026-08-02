package org.betup.ui.fragment.competitions.details.controller;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.competitions.CompetitionDetailsInteractor;
import org.betup.model.remote.api.rest.competitions.CompetitionDetailsWithParticipantInteractor;
import org.betup.model.remote.api.rest.competitions.PlaceBetInteractor;
import org.betup.services.user.UserService;

/* loaded from: classes4.dex */
public final class CompetitionDetailsController_MembersInjector implements MembersInjector<CompetitionDetailsController> {
    private final Provider<CompetitionDetailsInteractor> competitionDetailsInteractorProvider;
    private final Provider<CompetitionDetailsWithParticipantInteractor> competitionDetailsWithParticipantInteractorProvider;
    private final Provider<PlaceBetInteractor> placeBetInteractorProvider;
    private final Provider<UserService> userServiceProvider;

    public CompetitionDetailsController_MembersInjector(Provider<CompetitionDetailsInteractor> competitionDetailsInteractorProvider, Provider<CompetitionDetailsWithParticipantInteractor> competitionDetailsWithParticipantInteractorProvider, Provider<UserService> userServiceProvider, Provider<PlaceBetInteractor> placeBetInteractorProvider) {
        this.competitionDetailsInteractorProvider = competitionDetailsInteractorProvider;
        this.competitionDetailsWithParticipantInteractorProvider = competitionDetailsWithParticipantInteractorProvider;
        this.userServiceProvider = userServiceProvider;
        this.placeBetInteractorProvider = placeBetInteractorProvider;
    }

    public static MembersInjector<CompetitionDetailsController> create(Provider<CompetitionDetailsInteractor> competitionDetailsInteractorProvider, Provider<CompetitionDetailsWithParticipantInteractor> competitionDetailsWithParticipantInteractorProvider, Provider<UserService> userServiceProvider, Provider<PlaceBetInteractor> placeBetInteractorProvider) {
        return new CompetitionDetailsController_MembersInjector(competitionDetailsInteractorProvider, competitionDetailsWithParticipantInteractorProvider, userServiceProvider, placeBetInteractorProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(CompetitionDetailsController instance) {
        injectCompetitionDetailsInteractor(instance, this.competitionDetailsInteractorProvider.get());
        injectCompetitionDetailsWithParticipantInteractor(instance, this.competitionDetailsWithParticipantInteractorProvider.get());
        injectUserService(instance, this.userServiceProvider.get());
        injectPlaceBetInteractor(instance, this.placeBetInteractorProvider.get());
    }

    public static void injectCompetitionDetailsInteractor(CompetitionDetailsController instance, CompetitionDetailsInteractor competitionDetailsInteractor) {
        instance.competitionDetailsInteractor = competitionDetailsInteractor;
    }

    public static void injectCompetitionDetailsWithParticipantInteractor(CompetitionDetailsController instance, CompetitionDetailsWithParticipantInteractor competitionDetailsWithParticipantInteractor) {
        instance.competitionDetailsWithParticipantInteractor = competitionDetailsWithParticipantInteractor;
    }

    public static void injectUserService(CompetitionDetailsController instance, UserService userService) {
        instance.userService = userService;
    }

    public static void injectPlaceBetInteractor(CompetitionDetailsController instance, PlaceBetInteractor placeBetInteractor) {
        instance.placeBetInteractor = placeBetInteractor;
    }
}
