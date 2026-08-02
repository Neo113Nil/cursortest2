package org.betup.model.remote.api.rest.matches;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class PutFavoriteSportsBulkInteractor_Factory implements Factory<PutFavoriteSportsBulkInteractor> {
    private final Provider<Context> contextProvider;

    public PutFavoriteSportsBulkInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public PutFavoriteSportsBulkInteractor get() {
        return new PutFavoriteSportsBulkInteractor(this.contextProvider.get());
    }

    public static PutFavoriteSportsBulkInteractor_Factory create(Provider<Context> contextProvider) {
        return new PutFavoriteSportsBulkInteractor_Factory(contextProvider);
    }
}
