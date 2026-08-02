package org.betup.model.remote.api.rest.betslip;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class V7GrabbedBetsInteractor_Factory implements Factory<V7GrabbedBetsInteractor> {
    private final Provider<Context> contextProvider;

    public V7GrabbedBetsInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public V7GrabbedBetsInteractor get() {
        return new V7GrabbedBetsInteractor(this.contextProvider.get());
    }

    public static V7GrabbedBetsInteractor_Factory create(Provider<Context> contextProvider) {
        return new V7GrabbedBetsInteractor_Factory(contextProvider);
    }
}
