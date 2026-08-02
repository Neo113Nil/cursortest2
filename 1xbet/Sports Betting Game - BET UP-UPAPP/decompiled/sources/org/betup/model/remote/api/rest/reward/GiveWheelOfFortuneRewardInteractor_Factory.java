package org.betup.model.remote.api.rest.reward;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class GiveWheelOfFortuneRewardInteractor_Factory implements Factory<GiveWheelOfFortuneRewardInteractor> {
    private final Provider<Context> contextProvider;

    public GiveWheelOfFortuneRewardInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GiveWheelOfFortuneRewardInteractor get() {
        return new GiveWheelOfFortuneRewardInteractor(this.contextProvider.get());
    }

    public static GiveWheelOfFortuneRewardInteractor_Factory create(Provider<Context> contextProvider) {
        return new GiveWheelOfFortuneRewardInteractor_Factory(contextProvider);
    }
}
