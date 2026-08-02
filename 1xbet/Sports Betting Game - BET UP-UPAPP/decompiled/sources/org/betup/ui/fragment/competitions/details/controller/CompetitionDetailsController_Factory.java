package org.betup.ui.fragment.competitions.details.controller;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.competitions.CompetitionDetailsInteractor;
import org.betup.model.remote.api.rest.competitions.CompetitionDetailsWithParticipantInteractor;
import org.betup.model.remote.api.rest.competitions.PlaceBetInteractor;
import org.betup.services.user.UserService;

/* loaded from: classes4.dex */
public final class CompetitionDetailsController_Factory implements Factory<CompetitionDetailsController> {
    private final Provider<CompetitionDetailsInteractor> competitionDetailsInteractorProvider;
    private final Provider<CompetitionDetailsWithParticipantInteractor> competitionDetailsWithParticipantInteractorProvider;
    private final Provider<Context> contextProvider;
    private final Provider<PlaceBetInteractor> placeBetInteractorProvider;
    private final Provider<UserService> userServiceProvider;

    public CompetitionDetailsController_Factory(Provider<Context> contextProvider, Provider<CompetitionDetailsInteractor> competitionDetailsInteractorProvider, Provider<CompetitionDetailsWithParticipantInteractor> competitionDetailsWithParticipantInteractorProvider, Provider<UserService> userServiceProvider, Provider<PlaceBetInteractor> placeBetInteractorProvider) {
        this.contextProvider = contextProvider;
        this.competitionDetailsInteractorProvider = competitionDetailsInteractorProvider;
        this.competitionDetailsWithParticipantInteractorProvider = competitionDetailsWithParticipantInteractorProvider;
        this.userServiceProvider = userServiceProvider;
        this.placeBetInteractorProvider = placeBetInteractorProvider;
    }

    @Override // javax.inject.Provider
    public CompetitionDetailsController get() {
        CompetitionDetailsController competitionDetailsController = new CompetitionDetailsController(this.contextProvider.get());
        CompetitionDetailsController_MembersInjector.injectCompetitionDetailsInteractor(competitionDetailsController, this.competitionDetailsInteractorProvider.get());
        CompetitionDetailsController_MembersInjector.injectCompetitionDetailsWithParticipantInteractor(competitionDetailsController, this.competitionDetailsWithParticipantInteractorProvider.get());
        CompetitionDetailsController_MembersInjector.injectUserService(competitionDetailsController, this.userServiceProvider.get());
        CompetitionDetailsController_MembersInjector.injectPlaceBetInteractor(competitionDetailsController, this.placeBetInteractorProvider.get());
        return competitionDetailsController;
    }

    public static CompetitionDetailsController_Factory create(Provider<Context> contextProvider, Provider<CompetitionDetailsInteractor> competitionDetailsInteractorProvider, Provider<CompetitionDetailsWithParticipantInteractor> competitionDetailsWithParticipantInteractorProvider, Provider<UserService> userServiceProvider, Provider<PlaceBetInteractor> placeBetInteractorProvider) {
        return new CompetitionDetailsController_Factory(contextProvider, competitionDetailsInteractorProvider, competitionDetailsWithParticipantInteractorProvider, userServiceProvider, placeBetInteractorProvider);
    }

    public static CompetitionDetailsController newCompetitionDetailsController(Context context) {
        return new CompetitionDetailsController(context);
    }
}
