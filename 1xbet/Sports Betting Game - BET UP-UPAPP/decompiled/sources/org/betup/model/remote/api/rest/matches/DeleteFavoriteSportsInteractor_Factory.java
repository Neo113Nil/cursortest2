package org.betup.model.remote.api.rest.matches;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class DeleteFavoriteSportsInteractor_Factory implements Factory<DeleteFavoriteSportsInteractor> {
    private final Provider<Context> contextProvider;

    public DeleteFavoriteSportsInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public DeleteFavoriteSportsInteractor get() {
        return new DeleteFavoriteSportsInteractor(this.contextProvider.get());
    }

    public static DeleteFavoriteSportsInteractor_Factory create(Provider<Context> contextProvider) {
        return new DeleteFavoriteSportsInteractor_Factory(contextProvider);
    }
}
