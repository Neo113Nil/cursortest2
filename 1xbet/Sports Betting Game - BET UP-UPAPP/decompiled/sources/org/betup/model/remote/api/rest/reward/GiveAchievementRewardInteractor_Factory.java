package org.betup.model.remote.api.rest.reward;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class GiveAchievementRewardInteractor_Factory implements Factory<GiveAchievementRewardInteractor> {
    private final Provider<Context> contextProvider;

    public GiveAchievementRewardInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GiveAchievementRewardInteractor get() {
        return new GiveAchievementRewardInteractor(this.contextProvider.get());
    }

    public static GiveAchievementRewardInteractor_Factory create(Provider<Context> contextProvider) {
        return new GiveAchievementRewardInteractor_Factory(contextProvider);
    }
}
