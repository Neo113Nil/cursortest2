package org.betup.model.remote.api.rest.search;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class V7TrendingItemsInteractor_Factory implements Factory<V7TrendingItemsInteractor> {
    private final Provider<Context> contextProvider;

    public V7TrendingItemsInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public V7TrendingItemsInteractor get() {
        return new V7TrendingItemsInteractor(this.contextProvider.get());
    }

    public static V7TrendingItemsInteractor_Factory create(Provider<Context> contextProvider) {
        return new V7TrendingItemsInteractor_Factory(contextProvider);
    }
}
