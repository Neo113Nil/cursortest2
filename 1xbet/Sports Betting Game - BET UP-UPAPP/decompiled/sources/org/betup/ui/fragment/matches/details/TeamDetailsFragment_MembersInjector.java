package org.betup.ui.fragment.matches.details;

import dagger.MembersInjector;
import javax.inject.Provider;

/* loaded from: classes4.dex */
public final class TeamDetailsFragment_MembersInjector implements MembersInjector<TeamDetailsFragment> {
    private final Provider<TeamDetailsController> controllerProvider;

    public TeamDetailsFragment_MembersInjector(Provider<TeamDetailsController> controllerProvider) {
        this.controllerProvider = controllerProvider;
    }

    public static MembersInjector<TeamDetailsFragment> create(Provider<TeamDetailsController> controllerProvider) {
        return new TeamDetailsFragment_MembersInjector(controllerProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(TeamDetailsFragment instance) {
        injectController(instance, this.controllerProvider.get());
    }

    public static void injectController(TeamDetailsFragment instance, TeamDetailsController controller) {
        instance.controller = controller;
    }
}
