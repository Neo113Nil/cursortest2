package org.betup.ui.dialogs.controller;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.competitions.CompetitionDetailsInteractor;

/* loaded from: classes2.dex */
public final class CompetitionInfoController_MembersInjector implements MembersInjector<CompetitionInfoController> {
    private final Provider<CompetitionDetailsInteractor> competitionDetailsInteractorProvider;

    public CompetitionInfoController_MembersInjector(Provider<CompetitionDetailsInteractor> competitionDetailsInteractorProvider) {
        this.competitionDetailsInteractorProvider = competitionDetailsInteractorProvider;
    }

    public static MembersInjector<CompetitionInfoController> create(Provider<CompetitionDetailsInteractor> competitionDetailsInteractorProvider) {
        return new CompetitionInfoController_MembersInjector(competitionDetailsInteractorProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(CompetitionInfoController instance) {
        injectCompetitionDetailsInteractor(instance, this.competitionDetailsInteractorProvider.get());
    }

    public static void injectCompetitionDetailsInteractor(CompetitionInfoController instance, CompetitionDetailsInteractor competitionDetailsInteractor) {
        instance.competitionDetailsInteractor = competitionDetailsInteractor;
    }
}
