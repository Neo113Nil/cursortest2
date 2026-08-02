package org.betup.model.remote.api.rest.matches;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class DeleteFavoriteTeamsInteractor_Factory implements Factory<DeleteFavoriteTeamsInteractor> {
    private final Provider<Context> contextProvider;

    public DeleteFavoriteTeamsInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public DeleteFavoriteTeamsInteractor get() {
        return new DeleteFavoriteTeamsInteractor(this.contextProvider.get());
    }

    public static DeleteFavoriteTeamsInteractor_Factory create(Provider<Context> contextProvider) {
        return new DeleteFavoriteTeamsInteractor_Factory(contextProvider);
    }
}
