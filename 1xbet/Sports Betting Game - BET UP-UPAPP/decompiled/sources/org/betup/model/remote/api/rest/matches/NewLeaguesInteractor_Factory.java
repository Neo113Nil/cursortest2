package org.betup.model.remote.api.rest.matches;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class NewLeaguesInteractor_Factory implements Factory<NewLeaguesInteractor> {
    private final Provider<Context> contextProvider;

    public NewLeaguesInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public NewLeaguesInteractor get() {
        return new NewLeaguesInteractor(this.contextProvider.get());
    }

    public static NewLeaguesInteractor_Factory create(Provider<Context> contextProvider) {
        return new NewLeaguesInteractor_Factory(contextProvider);
    }
}
