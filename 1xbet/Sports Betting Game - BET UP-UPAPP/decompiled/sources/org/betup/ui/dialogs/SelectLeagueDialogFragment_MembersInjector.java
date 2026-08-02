package org.betup.ui.dialogs;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.ui.dialogs.controller.LeagueSelectionController;

/* loaded from: classes2.dex */
public final class SelectLeagueDialogFragment_MembersInjector implements MembersInjector<SelectLeagueDialogFragment> {
    private final Provider<LeagueSelectionController> controllerProvider;

    public SelectLeagueDialogFragment_MembersInjector(Provider<LeagueSelectionController> controllerProvider) {
        this.controllerProvider = controllerProvider;
    }

    public static MembersInjector<SelectLeagueDialogFragment> create(Provider<LeagueSelectionController> controllerProvider) {
        return new SelectLeagueDialogFragment_MembersInjector(controllerProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(SelectLeagueDialogFragment instance) {
        injectController(instance, this.controllerProvider.get());
    }

    public static void injectController(SelectLeagueDialogFragment instance, LeagueSelectionController controller) {
        instance.controller = controller;
    }
}
