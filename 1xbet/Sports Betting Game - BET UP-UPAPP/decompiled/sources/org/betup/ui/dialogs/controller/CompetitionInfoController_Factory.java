package org.betup.ui.dialogs.controller;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.competitions.CompetitionDetailsInteractor;

/* loaded from: classes2.dex */
public final class CompetitionInfoController_Factory implements Factory<CompetitionInfoController> {
    private final Provider<CompetitionDetailsInteractor> competitionDetailsInteractorProvider;
    private final Provider<Context> contextProvider;

    public CompetitionInfoController_Factory(Provider<Context> contextProvider, Provider<CompetitionDetailsInteractor> competitionDetailsInteractorProvider) {
        this.contextProvider = contextProvider;
        this.competitionDetailsInteractorProvider = competitionDetailsInteractorProvider;
    }

    @Override // javax.inject.Provider
    public CompetitionInfoController get() {
        CompetitionInfoController competitionInfoController = new CompetitionInfoController(this.contextProvider.get());
        CompetitionInfoController_MembersInjector.injectCompetitionDetailsInteractor(competitionInfoController, this.competitionDetailsInteractorProvider.get());
        return competitionInfoController;
    }

    public static CompetitionInfoController_Factory create(Provider<Context> contextProvider, Provider<CompetitionDetailsInteractor> competitionDetailsInteractorProvider) {
        return new CompetitionInfoController_Factory(contextProvider, competitionDetailsInteractorProvider);
    }

    public static CompetitionInfoController newCompetitionInfoController(Context context) {
        return new CompetitionInfoController(context);
    }
}
