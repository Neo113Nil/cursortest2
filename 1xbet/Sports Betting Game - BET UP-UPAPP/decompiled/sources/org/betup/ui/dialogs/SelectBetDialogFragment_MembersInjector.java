package org.betup.ui.dialogs;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.ui.dialogs.controller.BetSelectionController;

/* loaded from: classes2.dex */
public final class SelectBetDialogFragment_MembersInjector implements MembersInjector<SelectBetDialogFragment> {
    private final Provider<BetSelectionController> controllerProvider;

    public SelectBetDialogFragment_MembersInjector(Provider<BetSelectionController> controllerProvider) {
        this.controllerProvider = controllerProvider;
    }

    public static MembersInjector<SelectBetDialogFragment> create(Provider<BetSelectionController> controllerProvider) {
        return new SelectBetDialogFragment_MembersInjector(controllerProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(SelectBetDialogFragment instance) {
        injectController(instance, this.controllerProvider.get());
    }

    public static void injectController(SelectBetDialogFragment instance, BetSelectionController controller) {
        instance.controller = controller;
    }
}
