package org.betup.games.higherLower.model.interactor;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class ContinueHighLowGameInteractor_Factory implements Factory<ContinueHighLowGameInteractor> {
    private final Provider<Context> contextProvider;

    public ContinueHighLowGameInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public ContinueHighLowGameInteractor get() {
        return new ContinueHighLowGameInteractor(this.contextProvider.get());
    }

    public static ContinueHighLowGameInteractor_Factory create(Provider<Context> contextProvider) {
        return new ContinueHighLowGameInteractor_Factory(contextProvider);
    }
}
