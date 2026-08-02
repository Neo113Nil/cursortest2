package org.betup.ui.fragment.flashbet.controller;

import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.flashbet.GetFlashBetSessionInteractor;
import org.betup.model.remote.api.rest.flashbet.LeaveFlashBetSessionInteractor;
import org.betup.model.remote.api.rest.flashbet.SubmitFlashBetAnswerInteractor;
import org.betup.services.user.UserService;

/* loaded from: classes4.dex */
public final class FlashBetGameController_Factory implements Factory<FlashBetGameController> {
    private final Provider<GetFlashBetSessionInteractor> getFlashBetSessionInteractorProvider;
    private final Provider<LeaveFlashBetSessionInteractor> leaveFlashBetSessionInteractorProvider;
    private final Provider<SubmitFlashBetAnswerInteractor> submitFlashBetAnswerInteractorProvider;
    private final Provider<UserService> userServiceProvider;

    public FlashBetGameController_Factory(Provider<GetFlashBetSessionInteractor> getFlashBetSessionInteractorProvider, Provider<SubmitFlashBetAnswerInteractor> submitFlashBetAnswerInteractorProvider, Provider<LeaveFlashBetSessionInteractor> leaveFlashBetSessionInteractorProvider, Provider<UserService> userServiceProvider) {
        this.getFlashBetSessionInteractorProvider = getFlashBetSessionInteractorProvider;
        this.submitFlashBetAnswerInteractorProvider = submitFlashBetAnswerInteractorProvider;
        this.leaveFlashBetSessionInteractorProvider = leaveFlashBetSessionInteractorProvider;
        this.userServiceProvider = userServiceProvider;
    }

    @Override // javax.inject.Provider
    public FlashBetGameController get() {
        return new FlashBetGameController(this.getFlashBetSessionInteractorProvider.get(), this.submitFlashBetAnswerInteractorProvider.get(), this.leaveFlashBetSessionInteractorProvider.get(), this.userServiceProvider.get());
    }

    public static FlashBetGameController_Factory create(Provider<GetFlashBetSessionInteractor> getFlashBetSessionInteractorProvider, Provider<SubmitFlashBetAnswerInteractor> submitFlashBetAnswerInteractorProvider, Provider<LeaveFlashBetSessionInteractor> leaveFlashBetSessionInteractorProvider, Provider<UserService> userServiceProvider) {
        return new FlashBetGameController_Factory(getFlashBetSessionInteractorProvider, submitFlashBetAnswerInteractorProvider, leaveFlashBetSessionInteractorProvider, userServiceProvider);
    }
}
