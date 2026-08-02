package org.betup.model.remote.api.rest.subscription;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class DeleteV7MatchSubscriptionInteractor_Factory implements Factory<DeleteV7MatchSubscriptionInteractor> {
    private final Provider<Context> contextProvider;

    public DeleteV7MatchSubscriptionInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public DeleteV7MatchSubscriptionInteractor get() {
        return new DeleteV7MatchSubscriptionInteractor(this.contextProvider.get());
    }

    public static DeleteV7MatchSubscriptionInteractor_Factory create(Provider<Context> contextProvider) {
        return new DeleteV7MatchSubscriptionInteractor_Factory(contextProvider);
    }
}
