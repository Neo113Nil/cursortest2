package org.betup.ui.fragment.home.controller;

import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.user.ClaimDailyQuestInteractor;
import org.betup.model.remote.api.rest.user.GetDailyQuestsInteractor;

/* loaded from: classes4.dex */
public final class HomeDailyQuestController_Factory implements Factory<HomeDailyQuestController> {
    private final Provider<ClaimDailyQuestInteractor> claimDailyQuestInteractorProvider;
    private final Provider<GetDailyQuestsInteractor> getDailyQuestsInteractorProvider;

    public HomeDailyQuestController_Factory(Provider<GetDailyQuestsInteractor> getDailyQuestsInteractorProvider, Provider<ClaimDailyQuestInteractor> claimDailyQuestInteractorProvider) {
        this.getDailyQuestsInteractorProvider = getDailyQuestsInteractorProvider;
        this.claimDailyQuestInteractorProvider = claimDailyQuestInteractorProvider;
    }

    @Override // javax.inject.Provider
    public HomeDailyQuestController get() {
        return new HomeDailyQuestController(this.getDailyQuestsInteractorProvider.get(), this.claimDailyQuestInteractorProvider.get());
    }

    public static HomeDailyQuestController_Factory create(Provider<GetDailyQuestsInteractor> getDailyQuestsInteractorProvider, Provider<ClaimDailyQuestInteractor> claimDailyQuestInteractorProvider) {
        return new HomeDailyQuestController_Factory(getDailyQuestsInteractorProvider, claimDailyQuestInteractorProvider);
    }
}
