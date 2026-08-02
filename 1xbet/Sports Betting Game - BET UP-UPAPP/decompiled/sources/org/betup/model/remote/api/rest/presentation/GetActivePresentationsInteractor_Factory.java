package org.betup.model.remote.api.rest.presentation;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class GetActivePresentationsInteractor_Factory implements Factory<GetActivePresentationsInteractor> {
    private final Provider<Context> contextProvider;

    public GetActivePresentationsInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetActivePresentationsInteractor get() {
        return new GetActivePresentationsInteractor(this.contextProvider.get());
    }

    public static GetActivePresentationsInteractor_Factory create(Provider<Context> contextProvider) {
        return new GetActivePresentationsInteractor_Factory(contextProvider);
    }
}
