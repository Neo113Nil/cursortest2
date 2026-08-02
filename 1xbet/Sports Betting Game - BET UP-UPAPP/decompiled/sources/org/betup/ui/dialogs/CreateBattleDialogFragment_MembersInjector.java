package org.betup.ui.dialogs;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.ui.dialogs.controller.SportsSelectionController;

/* loaded from: classes2.dex */
public final class CreateBattleDialogFragment_MembersInjector implements MembersInjector<CreateBattleDialogFragment> {
    private final Provider<SportsSelectionController> controllerProvider;

    public CreateBattleDialogFragment_MembersInjector(Provider<SportsSelectionController> controllerProvider) {
        this.controllerProvider = controllerProvider;
    }

    public static MembersInjector<CreateBattleDialogFragment> create(Provider<SportsSelectionController> controllerProvider) {
        return new CreateBattleDialogFragment_MembersInjector(controllerProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(CreateBattleDialogFragment instance) {
        injectController(instance, this.controllerProvider.get());
    }

    public static void injectController(CreateBattleDialogFragment instance, SportsSelectionController controller) {
        instance.controller = controller;
    }
}
