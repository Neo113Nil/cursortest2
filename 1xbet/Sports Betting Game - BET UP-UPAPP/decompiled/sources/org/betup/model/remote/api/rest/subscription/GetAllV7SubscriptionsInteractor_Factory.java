package org.betup.model.remote.api.rest.subscription;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class GetAllV7SubscriptionsInteractor_Factory implements Factory<GetAllV7SubscriptionsInteractor> {
    private final Provider<Context> contextProvider;

    public GetAllV7SubscriptionsInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetAllV7SubscriptionsInteractor get() {
        return new GetAllV7SubscriptionsInteractor(this.contextProvider.get());
    }

    public static GetAllV7SubscriptionsInteractor_Factory create(Provider<Context> contextProvider) {
        return new GetAllV7SubscriptionsInteractor_Factory(contextProvider);
    }
}
