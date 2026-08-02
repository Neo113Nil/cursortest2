package org.betup.ui.fragment.competitions.details;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.ui.fragment.competitions.details.controller.CompetitionDetailsController;

/* loaded from: classes4.dex */
public final class CompetitionDetailsFragment_MembersInjector implements MembersInjector<CompetitionDetailsFragment> {
    private final Provider<CompetitionDetailsController> competitionDetailsControllerProvider;

    public CompetitionDetailsFragment_MembersInjector(Provider<CompetitionDetailsController> competitionDetailsControllerProvider) {
        this.competitionDetailsControllerProvider = competitionDetailsControllerProvider;
    }

    public static MembersInjector<CompetitionDetailsFragment> create(Provider<CompetitionDetailsController> competitionDetailsControllerProvider) {
        return new CompetitionDetailsFragment_MembersInjector(competitionDetailsControllerProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(CompetitionDetailsFragment instance) {
        injectCompetitionDetailsController(instance, this.competitionDetailsControllerProvider.get());
    }

    public static void injectCompetitionDetailsController(CompetitionDetailsFragment instance, CompetitionDetailsController competitionDetailsController) {
        instance.competitionDetailsController = competitionDetailsController;
    }
}
