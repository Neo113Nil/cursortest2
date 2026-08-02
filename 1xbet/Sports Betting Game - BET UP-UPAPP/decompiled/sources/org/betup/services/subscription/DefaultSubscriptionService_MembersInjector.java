package org.betup.services.subscription;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.subscription.GetV7MatchSubscriptionInteractor;
import org.betup.model.remote.api.rest.subscription.UpdateV7MatchSubscriptionInteractor;

/* loaded from: classes2.dex */
public final class DefaultSubscriptionService_MembersInjector implements MembersInjector<DefaultSubscriptionService> {
    private final Provider<GetV7MatchSubscriptionInteractor> getV7MatchSubscriptionInteractorProvider;
    private final Provider<UpdateV7MatchSubscriptionInteractor> updateV7MatchSubscriptionInteractorProvider;

    public DefaultSubscriptionService_MembersInjector(Provider<GetV7MatchSubscriptionInteractor> getV7MatchSubscriptionInteractorProvider, Provider<UpdateV7MatchSubscriptionInteractor> updateV7MatchSubscriptionInteractorProvider) {
        this.getV7MatchSubscriptionInteractorProvider = getV7MatchSubscriptionInteractorProvider;
        this.updateV7MatchSubscriptionInteractorProvider = updateV7MatchSubscriptionInteractorProvider;
    }

    public static MembersInjector<DefaultSubscriptionService> create(Provider<GetV7MatchSubscriptionInteractor> getV7MatchSubscriptionInteractorProvider, Provider<UpdateV7MatchSubscriptionInteractor> updateV7MatchSubscriptionInteractorProvider) {
        return new DefaultSubscriptionService_MembersInjector(getV7MatchSubscriptionInteractorProvider, updateV7MatchSubscriptionInteractorProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(DefaultSubscriptionService instance) {
        injectGetV7MatchSubscriptionInteractor(instance, this.getV7MatchSubscriptionInteractorProvider.get());
        injectUpdateV7MatchSubscriptionInteractor(instance, this.updateV7MatchSubscriptionInteractorProvider.get());
    }

    public static void injectGetV7MatchSubscriptionInteractor(DefaultSubscriptionService instance, GetV7MatchSubscriptionInteractor getV7MatchSubscriptionInteractor) {
        instance.getV7MatchSubscriptionInteractor = getV7MatchSubscriptionInteractor;
    }

    public static void injectUpdateV7MatchSubscriptionInteractor(DefaultSubscriptionService instance, UpdateV7MatchSubscriptionInteractor updateV7MatchSubscriptionInteractor) {
        instance.updateV7MatchSubscriptionInteractor = updateV7MatchSubscriptionInteractor;
    }
}
