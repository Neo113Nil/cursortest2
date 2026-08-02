package org.betup.games.luckyCells.model.interactor;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class GetConfigLuckyCellsGameInteractor_Factory implements Factory<GetConfigLuckyCellsGameInteractor> {
    private final Provider<Context> contextProvider;

    public GetConfigLuckyCellsGameInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetConfigLuckyCellsGameInteractor get() {
        return new GetConfigLuckyCellsGameInteractor(this.contextProvider.get());
    }

    public static GetConfigLuckyCellsGameInteractor_Factory create(Provider<Context> contextProvider) {
        return new GetConfigLuckyCellsGameInteractor_Factory(contextProvider);
    }
}
