package org.betup.ui.fragment.user;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.user.V7UserFollowersInteractor;
import org.betup.model.remote.api.rest.user.V7UserFollowingInteractor;
import org.betup.services.user.UserService;

/* loaded from: classes4.dex */
public final class FollowersDialogController_MembersInjector implements MembersInjector<FollowersDialogController> {
    private final Provider<UserService> userServiceProvider;
    private final Provider<V7UserFollowersInteractor> v7UserFollowersInteractorProvider;
    private final Provider<V7UserFollowingInteractor> v7UserFollowingInteractorProvider;

    public FollowersDialogController_MembersInjector(Provider<V7UserFollowersInteractor> v7UserFollowersInteractorProvider, Provider<V7UserFollowingInteractor> v7UserFollowingInteractorProvider, Provider<UserService> userServiceProvider) {
        this.v7UserFollowersInteractorProvider = v7UserFollowersInteractorProvider;
        this.v7UserFollowingInteractorProvider = v7UserFollowingInteractorProvider;
        this.userServiceProvider = userServiceProvider;
    }

    public static MembersInjector<FollowersDialogController> create(Provider<V7UserFollowersInteractor> v7UserFollowersInteractorProvider, Provider<V7UserFollowingInteractor> v7UserFollowingInteractorProvider, Provider<UserService> userServiceProvider) {
        return new FollowersDialogController_MembersInjector(v7UserFollowersInteractorProvider, v7UserFollowingInteractorProvider, userServiceProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(FollowersDialogController instance) {
        injectV7UserFollowersInteractor(instance, this.v7UserFollowersInteractorProvider.get());
        injectV7UserFollowingInteractor(instance, this.v7UserFollowingInteractorProvider.get());
        injectUserService(instance, this.userServiceProvider.get());
    }

    public static void injectV7UserFollowersInteractor(FollowersDialogController instance, V7UserFollowersInteractor v7UserFollowersInteractor) {
        instance.v7UserFollowersInteractor = v7UserFollowersInteractor;
    }

    public static void injectV7UserFollowingInteractor(FollowersDialogController instance, V7UserFollowingInteractor v7UserFollowingInteractor) {
        instance.v7UserFollowingInteractor = v7UserFollowingInteractor;
    }

    public static void injectUserService(FollowersDialogController instance, UserService userService) {
        instance.userService = userService;
    }
}
