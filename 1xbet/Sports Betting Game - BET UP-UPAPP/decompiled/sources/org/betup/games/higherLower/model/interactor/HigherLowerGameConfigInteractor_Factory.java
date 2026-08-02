package org.betup.games.higherLower.model.interactor;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class HigherLowerGameConfigInteractor_Factory implements Factory<HigherLowerGameConfigInteractor> {
    private final Provider<Context> contextProvider;

    public HigherLowerGameConfigInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public HigherLowerGameConfigInteractor get() {
        return new HigherLowerGameConfigInteractor(this.contextProvider.get());
    }

    public static HigherLowerGameConfigInteractor_Factory create(Provider<Context> contextProvider) {
        return new HigherLowerGameConfigInteractor_Factory(contextProvider);
    }
}
