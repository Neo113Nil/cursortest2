package org.betup.ui.fragment.competitions;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.ui.fragment.competitions.controller.CompetitionsController;

/* loaded from: classes4.dex */
public final class NewCompetitionsFragment_MembersInjector implements MembersInjector<NewCompetitionsFragment> {
    private final Provider<CompetitionsController> competitionsControllerProvider;

    public NewCompetitionsFragment_MembersInjector(Provider<CompetitionsController> competitionsControllerProvider) {
        this.competitionsControllerProvider = competitionsControllerProvider;
    }

    public static MembersInjector<NewCompetitionsFragment> create(Provider<CompetitionsController> competitionsControllerProvider) {
        return new NewCompetitionsFragment_MembersInjector(competitionsControllerProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(NewCompetitionsFragment instance) {
        injectCompetitionsController(instance, this.competitionsControllerProvider.get());
    }

    public static void injectCompetitionsController(NewCompetitionsFragment instance, CompetitionsController competitionsController) {
        instance.competitionsController = competitionsController;
    }
}
