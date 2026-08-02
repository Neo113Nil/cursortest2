package org.betup.model.remote.api.rest.subscription;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class UpdateV7MatchSubscriptionInteractor_Factory implements Factory<UpdateV7MatchSubscriptionInteractor> {
    private final Provider<Context> contextProvider;

    public UpdateV7MatchSubscriptionInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public UpdateV7MatchSubscriptionInteractor get() {
        return new UpdateV7MatchSubscriptionInteractor(this.contextProvider.get());
    }

    public static UpdateV7MatchSubscriptionInteractor_Factory create(Provider<Context> contextProvider) {
        return new UpdateV7MatchSubscriptionInteractor_Factory(contextProvider);
    }
}
