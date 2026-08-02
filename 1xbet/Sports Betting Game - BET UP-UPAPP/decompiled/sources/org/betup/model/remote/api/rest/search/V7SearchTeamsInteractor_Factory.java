package org.betup.model.remote.api.rest.search;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class V7SearchTeamsInteractor_Factory implements Factory<V7SearchTeamsInteractor> {
    private final Provider<Context> contextProvider;

    public V7SearchTeamsInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public V7SearchTeamsInteractor get() {
        return new V7SearchTeamsInteractor(this.contextProvider.get());
    }

    public static V7SearchTeamsInteractor_Factory create(Provider<Context> contextProvider) {
        return new V7SearchTeamsInteractor_Factory(contextProvider);
    }
}
