package org.betup.model.remote.api.rest.flashbet;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class GetFlashBetSessionInteractor_Factory implements Factory<GetFlashBetSessionInteractor> {
    private final Provider<Context> contextProvider;

    public GetFlashBetSessionInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetFlashBetSessionInteractor get() {
        return new GetFlashBetSessionInteractor(this.contextProvider.get());
    }

    public static GetFlashBetSessionInteractor_Factory create(Provider<Context> contextProvider) {
        return new GetFlashBetSessionInteractor_Factory(contextProvider);
    }
}
