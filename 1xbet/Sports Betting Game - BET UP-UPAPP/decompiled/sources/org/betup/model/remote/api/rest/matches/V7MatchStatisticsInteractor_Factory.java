package org.betup.model.remote.api.rest.matches;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class V7MatchStatisticsInteractor_Factory implements Factory<V7MatchStatisticsInteractor> {
    private final Provider<Context> contextProvider;

    public V7MatchStatisticsInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public V7MatchStatisticsInteractor get() {
        return new V7MatchStatisticsInteractor(this.contextProvider.get());
    }

    public static V7MatchStatisticsInteractor_Factory create(Provider<Context> contextProvider) {
        return new V7MatchStatisticsInteractor_Factory(contextProvider);
    }
}
