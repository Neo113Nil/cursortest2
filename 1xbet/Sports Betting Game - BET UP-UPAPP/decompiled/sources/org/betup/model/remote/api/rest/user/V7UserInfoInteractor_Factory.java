package org.betup.model.remote.api.rest.user;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class V7UserInfoInteractor_Factory implements Factory<V7UserInfoInteractor> {
    private final Provider<Context> contextProvider;

    public V7UserInfoInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public V7UserInfoInteractor get() {
        return new V7UserInfoInteractor(this.contextProvider.get());
    }

    public static V7UserInfoInteractor_Factory create(Provider<Context> contextProvider) {
        return new V7UserInfoInteractor_Factory(contextProvider);
    }
}
