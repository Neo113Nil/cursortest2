package org.betup.games.luckyCells.model.interactor;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class StartLuckyCellsGameInteractor_Factory implements Factory<StartLuckyCellsGameInteractor> {
    private final Provider<Context> contextProvider;

    public StartLuckyCellsGameInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public StartLuckyCellsGameInteractor get() {
        return new StartLuckyCellsGameInteractor(this.contextProvider.get());
    }

    public static StartLuckyCellsGameInteractor_Factory create(Provider<Context> contextProvider) {
        return new StartLuckyCellsGameInteractor_Factory(contextProvider);
    }
}
