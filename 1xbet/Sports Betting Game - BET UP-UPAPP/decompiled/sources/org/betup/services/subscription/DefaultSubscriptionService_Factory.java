package org.betup.services.subscription;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.subscription.GetV7MatchSubscriptionInteractor;
import org.betup.model.remote.api.rest.subscription.UpdateV7MatchSubscriptionInteractor;

/* loaded from: classes2.dex */
public final class DefaultSubscriptionService_Factory implements Factory<DefaultSubscriptionService> {
    private final Provider<Context> contextProvider;
    private final Provider<GetV7MatchSubscriptionInteractor> getV7MatchSubscriptionInteractorProvider;
    private final Provider<UpdateV7MatchSubscriptionInteractor> updateV7MatchSubscriptionInteractorProvider;

    public DefaultSubscriptionService_Factory(Provider<Context> contextProvider, Provider<GetV7MatchSubscriptionInteractor> getV7MatchSubscriptionInteractorProvider, Provider<UpdateV7MatchSubscriptionInteractor> updateV7MatchSubscriptionInteractorProvider) {
        this.contextProvider = contextProvider;
        this.getV7MatchSubscriptionInteractorProvider = getV7MatchSubscriptionInteractorProvider;
        this.updateV7MatchSubscriptionInteractorProvider = updateV7MatchSubscriptionInteractorProvider;
    }

    @Override // javax.inject.Provider
    public DefaultSubscriptionService get() {
        DefaultSubscriptionService defaultSubscriptionService = new DefaultSubscriptionService(this.contextProvider.get());
        DefaultSubscriptionService_MembersInjector.injectGetV7MatchSubscriptionInteractor(defaultSubscriptionService, this.getV7MatchSubscriptionInteractorProvider.get());
        DefaultSubscriptionService_MembersInjector.injectUpdateV7MatchSubscriptionInteractor(defaultSubscriptionService, this.updateV7MatchSubscriptionInteractorProvider.get());
        return defaultSubscriptionService;
    }

    public static DefaultSubscriptionService_Factory create(Provider<Context> contextProvider, Provider<GetV7MatchSubscriptionInteractor> getV7MatchSubscriptionInteractorProvider, Provider<UpdateV7MatchSubscriptionInteractor> updateV7MatchSubscriptionInteractorProvider) {
        return new DefaultSubscriptionService_Factory(contextProvider, getV7MatchSubscriptionInteractorProvider, updateV7MatchSubscriptionInteractorProvider);
    }

    public static DefaultSubscriptionService newDefaultSubscriptionService(Context context) {
        return new DefaultSubscriptionService(context);
    }
}
