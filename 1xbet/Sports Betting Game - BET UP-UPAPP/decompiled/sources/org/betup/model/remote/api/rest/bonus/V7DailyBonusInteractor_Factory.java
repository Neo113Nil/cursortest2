package org.betup.model.remote.api.rest.bonus;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class V7DailyBonusInteractor_Factory implements Factory<V7DailyBonusInteractor> {
    private final Provider<Context> contextProvider;

    public V7DailyBonusInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public V7DailyBonusInteractor get() {
        return new V7DailyBonusInteractor(this.contextProvider.get());
    }

    public static V7DailyBonusInteractor_Factory create(Provider<Context> contextProvider) {
        return new V7DailyBonusInteractor_Factory(contextProvider);
    }
}
