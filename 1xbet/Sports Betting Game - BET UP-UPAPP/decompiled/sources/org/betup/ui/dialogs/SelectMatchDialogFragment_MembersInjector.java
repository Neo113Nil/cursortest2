package org.betup.ui.dialogs;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.ui.dialogs.controller.MatchSelectionController;

/* loaded from: classes2.dex */
public final class SelectMatchDialogFragment_MembersInjector implements MembersInjector<SelectMatchDialogFragment> {
    private final Provider<MatchSelectionController> controllerProvider;

    public SelectMatchDialogFragment_MembersInjector(Provider<MatchSelectionController> controllerProvider) {
        this.controllerProvider = controllerProvider;
    }

    public static MembersInjector<SelectMatchDialogFragment> create(Provider<MatchSelectionController> controllerProvider) {
        return new SelectMatchDialogFragment_MembersInjector(controllerProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(SelectMatchDialogFragment instance) {
        injectController(instance, this.controllerProvider.get());
    }

    public static void injectController(SelectMatchDialogFragment instance, MatchSelectionController controller) {
        instance.controller = controller;
    }
}
