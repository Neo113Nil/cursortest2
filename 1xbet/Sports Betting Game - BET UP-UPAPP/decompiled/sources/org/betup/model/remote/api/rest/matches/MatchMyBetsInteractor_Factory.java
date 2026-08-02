package org.betup.model.remote.api.rest.matches;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class MatchMyBetsInteractor_Factory implements Factory<MatchMyBetsInteractor> {
    private final Provider<Context> contextProvider;

    public MatchMyBetsInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public MatchMyBetsInteractor get() {
        return new MatchMyBetsInteractor(this.contextProvider.get());
    }

    public static MatchMyBetsInteractor_Factory create(Provider<Context> contextProvider) {
        return new MatchMyBetsInteractor_Factory(contextProvider);
    }
}
