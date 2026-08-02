package org.betup.model.remote.api.rest.search;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class V7SearchUsersInteractor_Factory implements Factory<V7SearchUsersInteractor> {
    private final Provider<Context> contextProvider;

    public V7SearchUsersInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public V7SearchUsersInteractor get() {
        return new V7SearchUsersInteractor(this.contextProvider.get());
    }

    public static V7SearchUsersInteractor_Factory create(Provider<Context> contextProvider) {
        return new V7SearchUsersInteractor_Factory(contextProvider);
    }
}
