package org.betup.games.warGame.model.interactor;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class ContinueWarGameInteractor_Factory implements Factory<ContinueWarGameInteractor> {
    private final Provider<Context> contextProvider;

    public ContinueWarGameInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public ContinueWarGameInteractor get() {
        return new ContinueWarGameInteractor(this.contextProvider.get());
    }

    public static ContinueWarGameInteractor_Factory create(Provider<Context> contextProvider) {
        return new ContinueWarGameInteractor_Factory(contextProvider);
    }
}
