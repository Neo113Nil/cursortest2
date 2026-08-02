package org.betup.services.user;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.user.GetV7MyInfoInteractor;
import org.betup.model.remote.api.rest.user.MyProgressInteractor;
import org.betup.model.remote.api.rest.user.V7UserBetStatisticsInteractor;
import org.betup.model.remote.api.rest.user.V7UserFavouritesInteractor;
import org.betup.model.remote.api.rest.user.V7UserRanksInteractor;
import org.betup.services.storage.LocalPreferencesService;

/* loaded from: classes2.dex */
public final class UserService_Factory implements Factory<UserService> {
    private final Provider<FirebaseAuth> firebaseAuthProvider;
    private final Provider<FirebaseRemoteConfig> firebaseRemoteConfigProvider;
    private final Provider<GetV7MyInfoInteractor> getV7MyInfoInteractorProvider;
    private final Provider<LocalPreferencesService> localPreferencesServiceProvider;
    private final Provider<MyProgressInteractor> myProgressInteractorProvider;
    private final Provider<V7UserBetStatisticsInteractor> v7UserBetStatisticsInteractorProvider;
    private final Provider<V7UserFavouritesInteractor> v7UserFavouritesInteractorProvider;
    private final Provider<V7UserRanksInteractor> v7UserRanksInteractorProvider;

    public UserService_Factory(Provider<FirebaseAuth> firebaseAuthProvider, Provider<FirebaseRemoteConfig> firebaseRemoteConfigProvider, Provider<LocalPreferencesService> localPreferencesServiceProvider, Provider<GetV7MyInfoInteractor> getV7MyInfoInteractorProvider, Provider<MyProgressInteractor> myProgressInteractorProvider, Provider<V7UserBetStatisticsInteractor> v7UserBetStatisticsInteractorProvider, Provider<V7UserRanksInteractor> v7UserRanksInteractorProvider, Provider<V7UserFavouritesInteractor> v7UserFavouritesInteractorProvider) {
        this.firebaseAuthProvider = firebaseAuthProvider;
        this.firebaseRemoteConfigProvider = firebaseRemoteConfigProvider;
        this.localPreferencesServiceProvider = localPreferencesServiceProvider;
        this.getV7MyInfoInteractorProvider = getV7MyInfoInteractorProvider;
        this.myProgressInteractorProvider = myProgressInteractorProvider;
        this.v7UserBetStatisticsInteractorProvider = v7UserBetStatisticsInteractorProvider;
        this.v7UserRanksInteractorProvider = v7UserRanksInteractorProvider;
        this.v7UserFavouritesInteractorProvider = v7UserFavouritesInteractorProvider;
    }

    @Override // javax.inject.Provider
    public UserService get() {
        return new UserService(this.firebaseAuthProvider.get(), this.firebaseRemoteConfigProvider.get(), this.localPreferencesServiceProvider.get(), this.getV7MyInfoInteractorProvider.get(), this.myProgressInteractorProvider.get(), this.v7UserBetStatisticsInteractorProvider.get(), this.v7UserRanksInteractorProvider.get(), this.v7UserFavouritesInteractorProvider.get());
    }

    public static UserService_Factory create(Provider<FirebaseAuth> firebaseAuthProvider, Provider<FirebaseRemoteConfig> firebaseRemoteConfigProvider, Provider<LocalPreferencesService> localPreferencesServiceProvider, Provider<GetV7MyInfoInteractor> getV7MyInfoInteractorProvider, Provider<MyProgressInteractor> myProgressInteractorProvider, Provider<V7UserBetStatisticsInteractor> v7UserBetStatisticsInteractorProvider, Provider<V7UserRanksInteractor> v7UserRanksInteractorProvider, Provider<V7UserFavouritesInteractor> v7UserFavouritesInteractorProvider) {
        return new UserService_Factory(firebaseAuthProvider, firebaseRemoteConfigProvider, localPreferencesServiceProvider, getV7MyInfoInteractorProvider, myProgressInteractorProvider, v7UserBetStatisticsInteractorProvider, v7UserRanksInteractorProvider, v7UserFavouritesInteractorProvider);
    }
}
