package org.betup.games.doubles.model.interactor;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class GetConfigDoubleGameInteractor_Factory implements Factory<GetConfigDoubleGameInteractor> {
    private final Provider<Context> contextProvider;

    public GetConfigDoubleGameInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetConfigDoubleGameInteractor get() {
        return new GetConfigDoubleGameInteractor(this.contextProvider.get());
    }

    public static GetConfigDoubleGameInteractor_Factory create(Provider<Context> contextProvider) {
        return new GetConfigDoubleGameInteractor_Factory(contextProvider);
    }
}
