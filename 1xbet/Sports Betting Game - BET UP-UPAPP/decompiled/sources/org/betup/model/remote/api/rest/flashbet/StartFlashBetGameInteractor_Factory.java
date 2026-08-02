package org.betup.model.remote.api.rest.flashbet;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class StartFlashBetGameInteractor_Factory implements Factory<StartFlashBetGameInteractor> {
    private final Provider<Context> contextProvider;

    public StartFlashBetGameInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public StartFlashBetGameInteractor get() {
        return new StartFlashBetGameInteractor(this.contextProvider.get());
    }

    public static StartFlashBetGameInteractor_Factory create(Provider<Context> contextProvider) {
        return new StartFlashBetGameInteractor_Factory(contextProvider);
    }
}
