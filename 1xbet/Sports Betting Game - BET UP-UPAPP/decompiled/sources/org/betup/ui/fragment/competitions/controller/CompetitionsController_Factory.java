package org.betup.ui.fragment.competitions.controller;

import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.competitions.CompetitionHistoryCountInteractor;
import org.betup.model.remote.api.rest.competitions.NewActiveCompetitionsInteractor;
import org.betup.model.remote.api.rest.competitions.NewCompetitionsHistoryInteractor;

/* loaded from: classes4.dex */
public final class CompetitionsController_Factory implements Factory<CompetitionsController> {
    private final Provider<CompetitionHistoryCountInteractor> competitionHistoryCountInteractorProvider;
    private final Provider<NewActiveCompetitionsInteractor> newActiveCompetitionsInteractorProvider;
    private final Provider<NewCompetitionsHistoryInteractor> newCompetitionsHistoryInteractorProvider;

    public CompetitionsController_Factory(Provider<NewActiveCompetitionsInteractor> newActiveCompetitionsInteractorProvider, Provider<NewCompetitionsHistoryInteractor> newCompetitionsHistoryInteractorProvider, Provider<CompetitionHistoryCountInteractor> competitionHistoryCountInteractorProvider) {
        this.newActiveCompetitionsInteractorProvider = newActiveCompetitionsInteractorProvider;
        this.newCompetitionsHistoryInteractorProvider = newCompetitionsHistoryInteractorProvider;
        this.competitionHistoryCountInteractorProvider = competitionHistoryCountInteractorProvider;
    }

    @Override // javax.inject.Provider
    public CompetitionsController get() {
        CompetitionsController competitionsController = new CompetitionsController();
        CompetitionsController_MembersInjector.injectNewActiveCompetitionsInteractor(competitionsController, this.newActiveCompetitionsInteractorProvider.get());
        CompetitionsController_MembersInjector.injectNewCompetitionsHistoryInteractor(competitionsController, this.newCompetitionsHistoryInteractorProvider.get());
        CompetitionsController_MembersInjector.injectCompetitionHistoryCountInteractor(competitionsController, this.competitionHistoryCountInteractorProvider.get());
        return competitionsController;
    }

    public static CompetitionsController_Factory create(Provider<NewActiveCompetitionsInteractor> newActiveCompetitionsInteractorProvider, Provider<NewCompetitionsHistoryInteractor> newCompetitionsHistoryInteractorProvider, Provider<CompetitionHistoryCountInteractor> competitionHistoryCountInteractorProvider) {
        return new CompetitionsController_Factory(newActiveCompetitionsInteractorProvider, newCompetitionsHistoryInteractorProvider, competitionHistoryCountInteractorProvider);
    }

    public static CompetitionsController newCompetitionsController() {
        return new CompetitionsController();
    }
}
