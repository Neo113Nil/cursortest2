package org.betup.model.remote.api.rest.user;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class V7UserAchievementsInteractor_Factory implements Factory<V7UserAchievementsInteractor> {
    private final Provider<Context> contextProvider;

    public V7UserAchievementsInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public V7UserAchievementsInteractor get() {
        return new V7UserAchievementsInteractor(this.contextProvider.get());
    }

    public static V7UserAchievementsInteractor_Factory create(Provider<Context> contextProvider) {
        return new V7UserAchievementsInteractor_Factory(contextProvider);
    }
}
