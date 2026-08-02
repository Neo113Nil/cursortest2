package org.betup.model.remote.api.rest.user;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class V7UserBetStatisticsInteractor_Factory implements Factory<V7UserBetStatisticsInteractor> {
    private final Provider<Context> contextProvider;

    public V7UserBetStatisticsInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public V7UserBetStatisticsInteractor get() {
        return new V7UserBetStatisticsInteractor(this.contextProvider.get());
    }

    public static V7UserBetStatisticsInteractor_Factory create(Provider<Context> contextProvider) {
        return new V7UserBetStatisticsInteractor_Factory(contextProvider);
    }
}
