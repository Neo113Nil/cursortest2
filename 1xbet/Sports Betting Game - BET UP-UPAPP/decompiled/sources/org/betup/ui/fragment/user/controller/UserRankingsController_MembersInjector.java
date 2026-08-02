package org.betup.ui.fragment.user.controller;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.user.V7RanksByTypeInteractor;

/* loaded from: classes4.dex */
public final class UserRankingsController_MembersInjector implements MembersInjector<UserRankingsController> {
    private final Provider<V7RanksByTypeInteractor> v7RanksByTypeInteractorProvider;

    public UserRankingsController_MembersInjector(Provider<V7RanksByTypeInteractor> v7RanksByTypeInteractorProvider) {
        this.v7RanksByTypeInteractorProvider = v7RanksByTypeInteractorProvider;
    }

    public static MembersInjector<UserRankingsController> create(Provider<V7RanksByTypeInteractor> v7RanksByTypeInteractorProvider) {
        return new UserRankingsController_MembersInjector(v7RanksByTypeInteractorProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(UserRankingsController instance) {
        injectV7RanksByTypeInteractor(instance, this.v7RanksByTypeInteractorProvider.get());
    }

    public static void injectV7RanksByTypeInteractor(UserRankingsController instance, V7RanksByTypeInteractor v7RanksByTypeInteractor) {
        instance.v7RanksByTypeInteractor = v7RanksByTypeInteractor;
    }
}
