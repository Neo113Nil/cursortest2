package org.betup.ui.dialogs;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.ui.fragment.competitions.details.controller.CompetitionDetailsController;

/* loaded from: classes2.dex */
public final class CompetitionsPreviewFragment_MembersInjector implements MembersInjector<CompetitionsPreviewFragment> {
    private final Provider<CompetitionDetailsController> controllerProvider;

    public CompetitionsPreviewFragment_MembersInjector(Provider<CompetitionDetailsController> controllerProvider) {
        this.controllerProvider = controllerProvider;
    }

    public static MembersInjector<CompetitionsPreviewFragment> create(Provider<CompetitionDetailsController> controllerProvider) {
        return new CompetitionsPreviewFragment_MembersInjector(controllerProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(CompetitionsPreviewFragment instance) {
        injectController(instance, this.controllerProvider.get());
    }

    public static void injectController(CompetitionsPreviewFragment instance, CompetitionDetailsController controller) {
        instance.controller = controller;
    }
}
