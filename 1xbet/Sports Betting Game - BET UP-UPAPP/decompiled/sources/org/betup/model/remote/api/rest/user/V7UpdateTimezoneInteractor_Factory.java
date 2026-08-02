package org.betup.model.remote.api.rest.user;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class V7UpdateTimezoneInteractor_Factory implements Factory<V7UpdateTimezoneInteractor> {
    private final Provider<Context> contextProvider;

    public V7UpdateTimezoneInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public V7UpdateTimezoneInteractor get() {
        return new V7UpdateTimezoneInteractor(this.contextProvider.get());
    }

    public static V7UpdateTimezoneInteractor_Factory create(Provider<Context> contextProvider) {
        return new V7UpdateTimezoneInteractor_Factory(contextProvider);
    }
}
