package org.betup.model.remote.api.rest.subscription;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class GetV7MatchSubscriptionInteractor_Factory implements Factory<GetV7MatchSubscriptionInteractor> {
    private final Provider<Context> contextProvider;

    public GetV7MatchSubscriptionInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetV7MatchSubscriptionInteractor get() {
        return new GetV7MatchSubscriptionInteractor(this.contextProvider.get());
    }

    public static GetV7MatchSubscriptionInteractor_Factory create(Provider<Context> contextProvider) {
        return new GetV7MatchSubscriptionInteractor_Factory(contextProvider);
    }
}
