package org.betup.model.remote.api.rest.user;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class V7UpdateAppVersionInteractor_Factory implements Factory<V7UpdateAppVersionInteractor> {
    private final Provider<Context> contextProvider;

    public V7UpdateAppVersionInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public V7UpdateAppVersionInteractor get() {
        return new V7UpdateAppVersionInteractor(this.contextProvider.get());
    }

    public static V7UpdateAppVersionInteractor_Factory create(Provider<Context> contextProvider) {
        return new V7UpdateAppVersionInteractor_Factory(contextProvider);
    }
}
