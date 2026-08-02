package org.betup.model.remote.api.rest.challenges;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class NewUserBattleCountsInteractor_Factory implements Factory<NewUserBattleCountsInteractor> {
    private final Provider<Context> contextProvider;

    public NewUserBattleCountsInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public NewUserBattleCountsInteractor get() {
        return new NewUserBattleCountsInteractor(this.contextProvider.get());
    }

    public static NewUserBattleCountsInteractor_Factory create(Provider<Context> contextProvider) {
        return new NewUserBattleCountsInteractor_Factory(contextProvider);
    }
}
