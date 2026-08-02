package org.betup.model.remote.api.rest.matches;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class V7MatchHistoryInteractor_Factory implements Factory<V7MatchHistoryInteractor> {
    private final Provider<Context> contextProvider;

    public V7MatchHistoryInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public V7MatchHistoryInteractor get() {
        return new V7MatchHistoryInteractor(this.contextProvider.get());
    }

    public static V7MatchHistoryInteractor_Factory create(Provider<Context> contextProvider) {
        return new V7MatchHistoryInteractor_Factory(contextProvider);
    }
}
