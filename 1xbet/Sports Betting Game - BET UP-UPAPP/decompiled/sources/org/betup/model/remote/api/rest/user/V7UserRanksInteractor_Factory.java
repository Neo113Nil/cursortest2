package org.betup.model.remote.api.rest.user;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class V7UserRanksInteractor_Factory implements Factory<V7UserRanksInteractor> {
    private final Provider<Context> contextProvider;

    public V7UserRanksInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public V7UserRanksInteractor get() {
        return new V7UserRanksInteractor(this.contextProvider.get());
    }

    public static V7UserRanksInteractor_Factory create(Provider<Context> contextProvider) {
        return new V7UserRanksInteractor_Factory(contextProvider);
    }
}
