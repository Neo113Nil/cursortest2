package org.betup.games.warGame.model.interactor;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class GetWarGameConfigInteractor_Factory implements Factory<GetWarGameConfigInteractor> {
    private final Provider<Context> contextProvider;

    public GetWarGameConfigInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetWarGameConfigInteractor get() {
        return new GetWarGameConfigInteractor(this.contextProvider.get());
    }

    public static GetWarGameConfigInteractor_Factory create(Provider<Context> contextProvider) {
        return new GetWarGameConfigInteractor_Factory(contextProvider);
    }
}
