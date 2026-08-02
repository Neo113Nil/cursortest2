package org.betup.model.remote.api.rest.casino;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class V7CasinoAuthInteractor_Factory implements Factory<V7CasinoAuthInteractor> {
    private final Provider<Context> contextProvider;

    public V7CasinoAuthInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public V7CasinoAuthInteractor get() {
        return new V7CasinoAuthInteractor(this.contextProvider.get());
    }

    public static V7CasinoAuthInteractor_Factory create(Provider<Context> contextProvider) {
        return new V7CasinoAuthInteractor_Factory(contextProvider);
    }
}
