package org.betup.model.remote.api.rest.search;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class V7SearchLeaguesInteractor_Factory implements Factory<V7SearchLeaguesInteractor> {
    private final Provider<Context> contextProvider;

    public V7SearchLeaguesInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public V7SearchLeaguesInteractor get() {
        return new V7SearchLeaguesInteractor(this.contextProvider.get());
    }

    public static V7SearchLeaguesInteractor_Factory create(Provider<Context> contextProvider) {
        return new V7SearchLeaguesInteractor_Factory(contextProvider);
    }
}
