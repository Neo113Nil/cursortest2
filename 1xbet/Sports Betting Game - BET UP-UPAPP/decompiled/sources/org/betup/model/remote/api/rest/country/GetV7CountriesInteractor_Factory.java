package org.betup.model.remote.api.rest.country;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class GetV7CountriesInteractor_Factory implements Factory<GetV7CountriesInteractor> {
    private final Provider<Context> contextProvider;

    public GetV7CountriesInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetV7CountriesInteractor get() {
        return new GetV7CountriesInteractor(this.contextProvider.get());
    }

    public static GetV7CountriesInteractor_Factory create(Provider<Context> contextProvider) {
        return new GetV7CountriesInteractor_Factory(contextProvider);
    }
}
