package org.betup.ui.fragment.achievements.controller;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.user.V7UserAchievementsInteractor;

/* loaded from: classes4.dex */
public final class AchievementsController_MembersInjector implements MembersInjector<AchievementsController> {
    private final Provider<V7UserAchievementsInteractor> achievementsInteractorProvider;

    public AchievementsController_MembersInjector(Provider<V7UserAchievementsInteractor> achievementsInteractorProvider) {
        this.achievementsInteractorProvider = achievementsInteractorProvider;
    }

    public static MembersInjector<AchievementsController> create(Provider<V7UserAchievementsInteractor> achievementsInteractorProvider) {
        return new AchievementsController_MembersInjector(achievementsInteractorProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(AchievementsController instance) {
        injectAchievementsInteractor(instance, this.achievementsInteractorProvider.get());
    }

    public static void injectAchievementsInteractor(AchievementsController instance, V7UserAchievementsInteractor achievementsInteractor) {
        instance.achievementsInteractor = achievementsInteractor;
    }
}
