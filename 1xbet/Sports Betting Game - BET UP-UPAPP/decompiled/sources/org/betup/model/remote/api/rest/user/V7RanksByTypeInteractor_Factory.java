package org.betup.model.remote.api.rest.user;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class V7RanksByTypeInteractor_Factory implements Factory<V7RanksByTypeInteractor> {
    private final Provider<Context> contextProvider;

    public V7RanksByTypeInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public V7RanksByTypeInteractor get() {
        return new V7RanksByTypeInteractor(this.contextProvider.get());
    }

    public static V7RanksByTypeInteractor_Factory create(Provider<Context> contextProvider) {
        return new V7RanksByTypeInteractor_Factory(contextProvider);
    }
}
