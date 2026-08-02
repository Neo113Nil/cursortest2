package org.betup.ui.fragment.achievements.controller;

import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.user.V7UserAchievementsInteractor;

/* loaded from: classes4.dex */
public final class AchievementsController_Factory implements Factory<AchievementsController> {
    private final Provider<V7UserAchievementsInteractor> achievementsInteractorProvider;

    public AchievementsController_Factory(Provider<V7UserAchievementsInteractor> achievementsInteractorProvider) {
        this.achievementsInteractorProvider = achievementsInteractorProvider;
    }

    @Override // javax.inject.Provider
    public AchievementsController get() {
        AchievementsController achievementsController = new AchievementsController();
        AchievementsController_MembersInjector.injectAchievementsInteractor(achievementsController, this.achievementsInteractorProvider.get());
        return achievementsController;
    }

    public static AchievementsController_Factory create(Provider<V7UserAchievementsInteractor> achievementsInteractorProvider) {
        return new AchievementsController_Factory(achievementsInteractorProvider);
    }

    public static AchievementsController newAchievementsController() {
        return new AchievementsController();
    }
}
