package org.betup.games.warGame.model.interactor;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class StartWarGameInteractor_Factory implements Factory<StartWarGameInteractor> {
    private final Provider<Context> contextProvider;

    public StartWarGameInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public StartWarGameInteractor get() {
        return new StartWarGameInteractor(this.contextProvider.get());
    }

    public static StartWarGameInteractor_Factory create(Provider<Context> contextProvider) {
        return new StartWarGameInteractor_Factory(contextProvider);
    }
}
