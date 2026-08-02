package org.betup.games.luckyCells.model.interactor;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class CompleteLuckyCellsGameInteractor_Factory implements Factory<CompleteLuckyCellsGameInteractor> {
    private final Provider<Context> contextProvider;

    public CompleteLuckyCellsGameInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public CompleteLuckyCellsGameInteractor get() {
        return new CompleteLuckyCellsGameInteractor(this.contextProvider.get());
    }

    public static CompleteLuckyCellsGameInteractor_Factory create(Provider<Context> contextProvider) {
        return new CompleteLuckyCellsGameInteractor_Factory(contextProvider);
    }
}
