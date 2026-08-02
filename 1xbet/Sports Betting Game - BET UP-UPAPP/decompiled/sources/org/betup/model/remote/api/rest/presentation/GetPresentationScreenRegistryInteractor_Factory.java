package org.betup.model.remote.api.rest.presentation;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class GetPresentationScreenRegistryInteractor_Factory implements Factory<GetPresentationScreenRegistryInteractor> {
    private final Provider<Context> contextProvider;

    public GetPresentationScreenRegistryInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetPresentationScreenRegistryInteractor get() {
        return new GetPresentationScreenRegistryInteractor(this.contextProvider.get());
    }

    public static GetPresentationScreenRegistryInteractor_Factory create(Provider<Context> contextProvider) {
        return new GetPresentationScreenRegistryInteractor_Factory(contextProvider);
    }
}
