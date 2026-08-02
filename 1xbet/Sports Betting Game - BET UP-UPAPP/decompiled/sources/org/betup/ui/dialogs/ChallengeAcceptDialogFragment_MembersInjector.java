package org.betup.ui.dialogs;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.ui.dialogs.controller.ChallengeAcceptController;
import org.betup.ui.fragment.bets.BetsController;

/* loaded from: classes2.dex */
public final class ChallengeAcceptDialogFragment_MembersInjector implements MembersInjector<ChallengeAcceptDialogFragment> {
    private final Provider<BetsController> betControllerProvider;
    private final Provider<ChallengeAcceptController> controllerProvider;

    public ChallengeAcceptDialogFragment_MembersInjector(Provider<ChallengeAcceptController> controllerProvider, Provider<BetsController> betControllerProvider) {
        this.controllerProvider = controllerProvider;
        this.betControllerProvider = betControllerProvider;
    }

    public static MembersInjector<ChallengeAcceptDialogFragment> create(Provider<ChallengeAcceptController> controllerProvider, Provider<BetsController> betControllerProvider) {
        return new ChallengeAcceptDialogFragment_MembersInjector(controllerProvider, betControllerProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ChallengeAcceptDialogFragment instance) {
        injectController(instance, this.controllerProvider.get());
        injectBetController(instance, this.betControllerProvider.get());
    }

    public static void injectController(ChallengeAcceptDialogFragment instance, ChallengeAcceptController controller) {
        instance.controller = controller;
    }

    public static void injectBetController(ChallengeAcceptDialogFragment instance, BetsController betController) {
        instance.betController = betController;
    }
}
