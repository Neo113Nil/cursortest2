package org.betup.games.doubles.model.interactor;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class StartDoubleGameInteractor_Factory implements Factory<StartDoubleGameInteractor> {
    private final Provider<Context> contextProvider;

    public StartDoubleGameInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public StartDoubleGameInteractor get() {
        return new StartDoubleGameInteractor(this.contextProvider.get());
    }

    public static StartDoubleGameInteractor_Factory create(Provider<Context> contextProvider) {
        return new StartDoubleGameInteractor_Factory(contextProvider);
    }
}
