package org.betup.games.higherLower.model.interactor;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class StartHighLowGameInteractor_Factory implements Factory<StartHighLowGameInteractor> {
    private final Provider<Context> contextProvider;

    public StartHighLowGameInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public StartHighLowGameInteractor get() {
        return new StartHighLowGameInteractor(this.contextProvider.get());
    }

    public static StartHighLowGameInteractor_Factory create(Provider<Context> contextProvider) {
        return new StartHighLowGameInteractor_Factory(contextProvider);
    }
}
