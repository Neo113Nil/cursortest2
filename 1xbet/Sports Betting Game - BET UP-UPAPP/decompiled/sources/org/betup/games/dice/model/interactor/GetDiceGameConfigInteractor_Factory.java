package org.betup.games.dice.model.interactor;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class GetDiceGameConfigInteractor_Factory implements Factory<GetDiceGameConfigInteractor> {
    private final Provider<Context> contextProvider;

    public GetDiceGameConfigInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetDiceGameConfigInteractor get() {
        return new GetDiceGameConfigInteractor(this.contextProvider.get());
    }

    public static GetDiceGameConfigInteractor_Factory create(Provider<Context> contextProvider) {
        return new GetDiceGameConfigInteractor_Factory(contextProvider);
    }
}
