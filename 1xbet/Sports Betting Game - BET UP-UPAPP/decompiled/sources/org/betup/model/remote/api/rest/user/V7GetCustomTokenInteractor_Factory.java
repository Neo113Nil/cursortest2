package org.betup.model.remote.api.rest.user;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class V7GetCustomTokenInteractor_Factory implements Factory<V7GetCustomTokenInteractor> {
    private final Provider<Context> contextProvider;

    public V7GetCustomTokenInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public V7GetCustomTokenInteractor get() {
        return new V7GetCustomTokenInteractor(this.contextProvider.get());
    }

    public static V7GetCustomTokenInteractor_Factory create(Provider<Context> contextProvider) {
        return new V7GetCustomTokenInteractor_Factory(contextProvider);
    }
}
