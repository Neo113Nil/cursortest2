package org.betup.model.remote.api.rest.matches;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class DeleteFavoriteLeaguesInteractor_Factory implements Factory<DeleteFavoriteLeaguesInteractor> {
    private final Provider<Context> contextProvider;

    public DeleteFavoriteLeaguesInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public DeleteFavoriteLeaguesInteractor get() {
        return new DeleteFavoriteLeaguesInteractor(this.contextProvider.get());
    }

    public static DeleteFavoriteLeaguesInteractor_Factory create(Provider<Context> contextProvider) {
        return new DeleteFavoriteLeaguesInteractor_Factory(contextProvider);
    }
}
