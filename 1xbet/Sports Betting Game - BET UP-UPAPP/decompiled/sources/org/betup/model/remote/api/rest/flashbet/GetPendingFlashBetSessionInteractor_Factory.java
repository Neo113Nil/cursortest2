package org.betup.model.remote.api.rest.flashbet;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class GetPendingFlashBetSessionInteractor_Factory implements Factory<GetPendingFlashBetSessionInteractor> {
    private final Provider<Context> contextProvider;

    public GetPendingFlashBetSessionInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetPendingFlashBetSessionInteractor get() {
        return new GetPendingFlashBetSessionInteractor(this.contextProvider.get());
    }

    public static GetPendingFlashBetSessionInteractor_Factory create(Provider<Context> contextProvider) {
        return new GetPendingFlashBetSessionInteractor_Factory(contextProvider);
    }
}
