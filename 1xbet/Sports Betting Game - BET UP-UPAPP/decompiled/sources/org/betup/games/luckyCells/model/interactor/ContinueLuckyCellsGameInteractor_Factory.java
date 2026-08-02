package org.betup.games.luckyCells.model.interactor;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class ContinueLuckyCellsGameInteractor_Factory implements Factory<ContinueLuckyCellsGameInteractor> {
    private final Provider<Context> contextProvider;

    public ContinueLuckyCellsGameInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public ContinueLuckyCellsGameInteractor get() {
        return new ContinueLuckyCellsGameInteractor(this.contextProvider.get());
    }

    public static ContinueLuckyCellsGameInteractor_Factory create(Provider<Context> contextProvider) {
        return new ContinueLuckyCellsGameInteractor_Factory(contextProvider);
    }
}
