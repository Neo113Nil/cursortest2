package org.betup.services.user;

import android.content.Context;
import com.google.firebase.auth.FirebaseAuth;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.matches.MatchInfoInteractor;
import org.betup.model.remote.api.rest.user.V7GetCustomTokenInteractor;
import org.betup.services.betlist.BetListAppender;

/* loaded from: classes2.dex */
public final class SocialConnectionService_Factory implements Factory<SocialConnectionService> {
    private final Provider<BetListAppender> betListAppenderProvider;
    private final Provider<Context> contextProvider;
    private final Provider<FirebaseAuth> firebaseAuthProvider;
    private final Provider<MatchInfoInteractor> matchInfoInteractorProvider;
    private final Provider<UserService> userServiceProvider;
    private final Provider<V7GetCustomTokenInteractor> v7GetCustomTokenInteractorProvider;

    public SocialConnectionService_Factory(Provider<Context> contextProvider, Provider<FirebaseAuth> firebaseAuthProvider, Provider<UserService> userServiceProvider, Provider<MatchInfoInteractor> matchInfoInteractorProvider, Provider<BetListAppender> betListAppenderProvider, Provider<V7GetCustomTokenInteractor> v7GetCustomTokenInteractorProvider) {
        this.contextProvider = contextProvider;
        this.firebaseAuthProvider = firebaseAuthProvider;
        this.userServiceProvider = userServiceProvider;
        this.matchInfoInteractorProvider = matchInfoInteractorProvider;
        this.betListAppenderProvider = betListAppenderProvider;
        this.v7GetCustomTokenInteractorProvider = v7GetCustomTokenInteractorProvider;
    }

    @Override // javax.inject.Provider
    public SocialConnectionService get() {
        return new SocialConnectionService(this.contextProvider.get(), this.firebaseAuthProvider.get(), this.userServiceProvider.get(), this.matchInfoInteractorProvider.get(), this.betListAppenderProvider.get(), this.v7GetCustomTokenInteractorProvider.get());
    }

    public static SocialConnectionService_Factory create(Provider<Context> contextProvider, Provider<FirebaseAuth> firebaseAuthProvider, Provider<UserService> userServiceProvider, Provider<MatchInfoInteractor> matchInfoInteractorProvider, Provider<BetListAppender> betListAppenderProvider, Provider<V7GetCustomTokenInteractor> v7GetCustomTokenInteractorProvider) {
        return new SocialConnectionService_Factory(contextProvider, firebaseAuthProvider, userServiceProvider, matchInfoInteractorProvider, betListAppenderProvider, v7GetCustomTokenInteractorProvider);
    }
}
