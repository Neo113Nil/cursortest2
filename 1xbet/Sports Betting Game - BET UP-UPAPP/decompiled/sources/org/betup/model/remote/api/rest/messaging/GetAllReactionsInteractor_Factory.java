package org.betup.model.remote.api.rest.messaging;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class GetAllReactionsInteractor_Factory implements Factory<GetAllReactionsInteractor> {
    private final Provider<Context> contextProvider;

    public GetAllReactionsInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetAllReactionsInteractor get() {
        return new GetAllReactionsInteractor(this.contextProvider.get());
    }

    public static GetAllReactionsInteractor_Factory create(Provider<Context> contextProvider) {
        return new GetAllReactionsInteractor_Factory(contextProvider);
    }
}
