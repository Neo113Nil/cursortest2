package org.betup.model.remote.api.rest.user;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class V7UserFollowActionInteractor_Factory implements Factory<V7UserFollowActionInteractor> {
    private final Provider<Context> contextProvider;

    public V7UserFollowActionInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public V7UserFollowActionInteractor get() {
        return new V7UserFollowActionInteractor(this.contextProvider.get());
    }

    public static V7UserFollowActionInteractor_Factory create(Provider<Context> contextProvider) {
        return new V7UserFollowActionInteractor_Factory(contextProvider);
    }
}
