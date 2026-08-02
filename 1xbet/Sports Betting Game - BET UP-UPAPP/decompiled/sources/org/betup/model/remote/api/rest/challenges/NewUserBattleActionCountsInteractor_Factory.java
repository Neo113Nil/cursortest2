package org.betup.model.remote.api.rest.challenges;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class NewUserBattleActionCountsInteractor_Factory implements Factory<NewUserBattleActionCountsInteractor> {
    private final Provider<Context> contextProvider;

    public NewUserBattleActionCountsInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public NewUserBattleActionCountsInteractor get() {
        return new NewUserBattleActionCountsInteractor(this.contextProvider.get());
    }

    public static NewUserBattleActionCountsInteractor_Factory create(Provider<Context> contextProvider) {
        return new NewUserBattleActionCountsInteractor_Factory(contextProvider);
    }
}
