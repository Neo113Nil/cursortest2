package org.betup.ui.dialogs;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.ui.dialogs.controller.ChallengePreviewController;

/* loaded from: classes2.dex */
public final class ChallengePreviewNewDialogFragment_MembersInjector implements MembersInjector<ChallengePreviewNewDialogFragment> {
    private final Provider<ChallengePreviewController> controllerProvider;

    public ChallengePreviewNewDialogFragment_MembersInjector(Provider<ChallengePreviewController> controllerProvider) {
        this.controllerProvider = controllerProvider;
    }

    public static MembersInjector<ChallengePreviewNewDialogFragment> create(Provider<ChallengePreviewController> controllerProvider) {
        return new ChallengePreviewNewDialogFragment_MembersInjector(controllerProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ChallengePreviewNewDialogFragment instance) {
        injectController(instance, this.controllerProvider.get());
    }

    public static void injectController(ChallengePreviewNewDialogFragment instance, ChallengePreviewController controller) {
        instance.controller = controller;
    }
}
