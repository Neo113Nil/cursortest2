package org.betup.model.remote.api.rest.flashbet;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class GetFlashBetStatsInteractor_Factory implements Factory<GetFlashBetStatsInteractor> {
    private final Provider<Context> contextProvider;

    public GetFlashBetStatsInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetFlashBetStatsInteractor get() {
        return new GetFlashBetStatsInteractor(this.contextProvider.get());
    }

    public static GetFlashBetStatsInteractor_Factory create(Provider<Context> contextProvider) {
        return new GetFlashBetStatsInteractor_Factory(contextProvider);
    }
}
