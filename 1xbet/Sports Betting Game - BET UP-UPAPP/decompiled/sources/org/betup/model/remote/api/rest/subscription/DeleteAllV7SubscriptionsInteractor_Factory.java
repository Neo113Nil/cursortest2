package org.betup.model.remote.api.rest.subscription;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class DeleteAllV7SubscriptionsInteractor_Factory implements Factory<DeleteAllV7SubscriptionsInteractor> {
    private final Provider<Context> contextProvider;

    public DeleteAllV7SubscriptionsInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public DeleteAllV7SubscriptionsInteractor get() {
        return new DeleteAllV7SubscriptionsInteractor(this.contextProvider.get());
    }

    public static DeleteAllV7SubscriptionsInteractor_Factory create(Provider<Context> contextProvider) {
        return new DeleteAllV7SubscriptionsInteractor_Factory(contextProvider);
    }
}
