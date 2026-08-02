package org.betup.games.doubles.model.interactor;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class FinishDoubleGameInteractor_Factory implements Factory<FinishDoubleGameInteractor> {
    private final Provider<Context> contextProvider;

    public FinishDoubleGameInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public FinishDoubleGameInteractor get() {
        return new FinishDoubleGameInteractor(this.contextProvider.get());
    }

    public static FinishDoubleGameInteractor_Factory create(Provider<Context> contextProvider) {
        return new FinishDoubleGameInteractor_Factory(contextProvider);
    }
}
