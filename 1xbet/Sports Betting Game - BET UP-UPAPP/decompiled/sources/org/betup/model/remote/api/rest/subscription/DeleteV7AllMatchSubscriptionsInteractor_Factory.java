package org.betup.model.remote.api.rest.subscription;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class DeleteV7AllMatchSubscriptionsInteractor_Factory implements Factory<DeleteV7AllMatchSubscriptionsInteractor> {
    private final Provider<Context> contextProvider;

    public DeleteV7AllMatchSubscriptionsInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public DeleteV7AllMatchSubscriptionsInteractor get() {
        return new DeleteV7AllMatchSubscriptionsInteractor(this.contextProvider.get());
    }

    public static DeleteV7AllMatchSubscriptionsInteractor_Factory create(Provider<Context> contextProvider) {
        return new DeleteV7AllMatchSubscriptionsInteractor_Factory(contextProvider);
    }
}
