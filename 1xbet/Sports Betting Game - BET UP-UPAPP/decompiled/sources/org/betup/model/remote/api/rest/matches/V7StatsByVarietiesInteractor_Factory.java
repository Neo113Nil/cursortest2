package org.betup.model.remote.api.rest.matches;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class V7StatsByVarietiesInteractor_Factory implements Factory<V7StatsByVarietiesInteractor> {
    private final Provider<Context> contextProvider;

    public V7StatsByVarietiesInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public V7StatsByVarietiesInteractor get() {
        return new V7StatsByVarietiesInteractor(this.contextProvider.get());
    }

    public static V7StatsByVarietiesInteractor_Factory create(Provider<Context> contextProvider) {
        return new V7StatsByVarietiesInteractor_Factory(contextProvider);
    }
}
