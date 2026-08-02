package org.betup.games.common.remote.interactor;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class GamesListConfigInteractor_Factory implements Factory<GamesListConfigInteractor> {
    private final Provider<Context> contextProvider;

    public GamesListConfigInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GamesListConfigInteractor get() {
        return new GamesListConfigInteractor(this.contextProvider.get());
    }

    public static GamesListConfigInteractor_Factory create(Provider<Context> contextProvider) {
        return new GamesListConfigInteractor_Factory(contextProvider);
    }
}
