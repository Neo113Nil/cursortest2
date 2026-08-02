package org.betup.model.remote.api.rest.flashbet;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class GetFlashBetSportsInteractor_Factory implements Factory<GetFlashBetSportsInteractor> {
    private final Provider<Context> contextProvider;

    public GetFlashBetSportsInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetFlashBetSportsInteractor get() {
        return new GetFlashBetSportsInteractor(this.contextProvider.get());
    }

    public static GetFlashBetSportsInteractor_Factory create(Provider<Context> contextProvider) {
        return new GetFlashBetSportsInteractor_Factory(contextProvider);
    }
}
