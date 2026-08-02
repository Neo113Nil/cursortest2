package org.betup.model.remote.api.rest.user;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class V7UserFavouritesInteractor_Factory implements Factory<V7UserFavouritesInteractor> {
    private final Provider<Context> contextProvider;

    public V7UserFavouritesInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public V7UserFavouritesInteractor get() {
        return new V7UserFavouritesInteractor(this.contextProvider.get());
    }

    public static V7UserFavouritesInteractor_Factory create(Provider<Context> contextProvider) {
        return new V7UserFavouritesInteractor_Factory(contextProvider);
    }
}
