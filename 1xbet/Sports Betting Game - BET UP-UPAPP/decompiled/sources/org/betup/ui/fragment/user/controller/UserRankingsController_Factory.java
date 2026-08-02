package org.betup.ui.fragment.user.controller;

import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.user.V7RanksByTypeInteractor;

/* loaded from: classes4.dex */
public final class UserRankingsController_Factory implements Factory<UserRankingsController> {
    private final Provider<V7RanksByTypeInteractor> v7RanksByTypeInteractorProvider;

    public UserRankingsController_Factory(Provider<V7RanksByTypeInteractor> v7RanksByTypeInteractorProvider) {
        this.v7RanksByTypeInteractorProvider = v7RanksByTypeInteractorProvider;
    }

    @Override // javax.inject.Provider
    public UserRankingsController get() {
        UserRankingsController userRankingsController = new UserRankingsController();
        UserRankingsController_MembersInjector.injectV7RanksByTypeInteractor(userRankingsController, this.v7RanksByTypeInteractorProvider.get());
        return userRankingsController;
    }

    public static UserRankingsController_Factory create(Provider<V7RanksByTypeInteractor> v7RanksByTypeInteractorProvider) {
        return new UserRankingsController_Factory(v7RanksByTypeInteractorProvider);
    }

    public static UserRankingsController newUserRankingsController() {
        return new UserRankingsController();
    }
}
