package org.betup.ui.fragment.flashbet;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.flashbet.LeaveFlashBetSessionInteractor;

/* loaded from: classes4.dex */
public final class FlashBetLeaveConfirmDialogFragment_MembersInjector implements MembersInjector<FlashBetLeaveConfirmDialogFragment> {
    private final Provider<LeaveFlashBetSessionInteractor> leaveFlashBetSessionInteractorProvider;

    public FlashBetLeaveConfirmDialogFragment_MembersInjector(Provider<LeaveFlashBetSessionInteractor> leaveFlashBetSessionInteractorProvider) {
        this.leaveFlashBetSessionInteractorProvider = leaveFlashBetSessionInteractorProvider;
    }

    public static MembersInjector<FlashBetLeaveConfirmDialogFragment> create(Provider<LeaveFlashBetSessionInteractor> leaveFlashBetSessionInteractorProvider) {
        return new FlashBetLeaveConfirmDialogFragment_MembersInjector(leaveFlashBetSessionInteractorProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(FlashBetLeaveConfirmDialogFragment instance) {
        injectLeaveFlashBetSessionInteractor(instance, this.leaveFlashBetSessionInteractorProvider.get());
    }

    public static void injectLeaveFlashBetSessionInteractor(FlashBetLeaveConfirmDialogFragment instance, LeaveFlashBetSessionInteractor leaveFlashBetSessionInteractor) {
        instance.leaveFlashBetSessionInteractor = leaveFlashBetSessionInteractor;
    }
}
