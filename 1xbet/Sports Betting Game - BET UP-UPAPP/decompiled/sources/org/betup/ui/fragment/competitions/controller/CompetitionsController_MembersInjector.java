package org.betup.ui.fragment.competitions.controller;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.competitions.CompetitionHistoryCountInteractor;
import org.betup.model.remote.api.rest.competitions.NewActiveCompetitionsInteractor;
import org.betup.model.remote.api.rest.competitions.NewCompetitionsHistoryInteractor;

/* loaded from: classes4.dex */
public final class CompetitionsController_MembersInjector implements MembersInjector<CompetitionsController> {
    private final Provider<CompetitionHistoryCountInteractor> competitionHistoryCountInteractorProvider;
    private final Provider<NewActiveCompetitionsInteractor> newActiveCompetitionsInteractorProvider;
    private final Provider<NewCompetitionsHistoryInteractor> newCompetitionsHistoryInteractorProvider;

    public CompetitionsController_MembersInjector(Provider<NewActiveCompetitionsInteractor> newActiveCompetitionsInteractorProvider, Provider<NewCompetitionsHistoryInteractor> newCompetitionsHistoryInteractorProvider, Provider<CompetitionHistoryCountInteractor> competitionHistoryCountInteractorProvider) {
        this.newActiveCompetitionsInteractorProvider = newActiveCompetitionsInteractorProvider;
        this.newCompetitionsHistoryInteractorProvider = newCompetitionsHistoryInteractorProvider;
        this.competitionHistoryCountInteractorProvider = competitionHistoryCountInteractorProvider;
    }

    public static MembersInjector<CompetitionsController> create(Provider<NewActiveCompetitionsInteractor> newActiveCompetitionsInteractorProvider, Provider<NewCompetitionsHistoryInteractor> newCompetitionsHistoryInteractorProvider, Provider<CompetitionHistoryCountInteractor> competitionHistoryCountInteractorProvider) {
        return new CompetitionsController_MembersInjector(newActiveCompetitionsInteractorProvider, newCompetitionsHistoryInteractorProvider, competitionHistoryCountInteractorProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(CompetitionsController instance) {
        injectNewActiveCompetitionsInteractor(instance, this.newActiveCompetitionsInteractorProvider.get());
        injectNewCompetitionsHistoryInteractor(instance, this.newCompetitionsHistoryInteractorProvider.get());
        injectCompetitionHistoryCountInteractor(instance, this.competitionHistoryCountInteractorProvider.get());
    }

    public static void injectNewActiveCompetitionsInteractor(CompetitionsController instance, NewActiveCompetitionsInteractor newActiveCompetitionsInteractor) {
        instance.newActiveCompetitionsInteractor = newActiveCompetitionsInteractor;
    }

    public static void injectNewCompetitionsHistoryInteractor(CompetitionsController instance, NewCompetitionsHistoryInteractor newCompetitionsHistoryInteractor) {
        instance.newCompetitionsHistoryInteractor = newCompetitionsHistoryInteractor;
    }

    public static void injectCompetitionHistoryCountInteractor(CompetitionsController instance, CompetitionHistoryCountInteractor competitionHistoryCountInteractor) {
        instance.competitionHistoryCountInteractor = competitionHistoryCountInteractor;
    }
}
