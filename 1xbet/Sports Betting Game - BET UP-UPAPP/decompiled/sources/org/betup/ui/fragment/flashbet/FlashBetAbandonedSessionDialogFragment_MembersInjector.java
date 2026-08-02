package org.betup.ui.fragment.flashbet;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.flashbet.GetFlashBetSessionInteractor;

/* loaded from: classes4.dex */
public final class FlashBetAbandonedSessionDialogFragment_MembersInjector implements MembersInjector<FlashBetAbandonedSessionDialogFragment> {
    private final Provider<GetFlashBetSessionInteractor> getFlashBetSessionInteractorProvider;

    public FlashBetAbandonedSessionDialogFragment_MembersInjector(Provider<GetFlashBetSessionInteractor> getFlashBetSessionInteractorProvider) {
        this.getFlashBetSessionInteractorProvider = getFlashBetSessionInteractorProvider;
    }

    public static MembersInjector<FlashBetAbandonedSessionDialogFragment> create(Provider<GetFlashBetSessionInteractor> getFlashBetSessionInteractorProvider) {
        return new FlashBetAbandonedSessionDialogFragment_MembersInjector(getFlashBetSessionInteractorProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(FlashBetAbandonedSessionDialogFragment instance) {
        injectGetFlashBetSessionInteractor(instance, this.getFlashBetSessionInteractorProvider.get());
    }

    public static void injectGetFlashBetSessionInteractor(FlashBetAbandonedSessionDialogFragment instance, GetFlashBetSessionInteractor getFlashBetSessionInteractor) {
        instance.getFlashBetSessionInteractor = getFlashBetSessionInteractor;
    }
}
