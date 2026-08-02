package org.betup.games.common.remote.interactor;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class WebGamesListInteractor_Factory implements Factory<WebGamesListInteractor> {
    private final Provider<Context> contextProvider;

    public WebGamesListInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public WebGamesListInteractor get() {
        return new WebGamesListInteractor(this.contextProvider.get());
    }

    public static WebGamesListInteractor_Factory create(Provider<Context> contextProvider) {
        return new WebGamesListInteractor_Factory(contextProvider);
    }
}
