package org.betup.model.remote.api.rest.user;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class ClaimDailyQuestInteractor_Factory implements Factory<ClaimDailyQuestInteractor> {
    private final Provider<Context> contextProvider;

    public ClaimDailyQuestInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public ClaimDailyQuestInteractor get() {
        return new ClaimDailyQuestInteractor(this.contextProvider.get());
    }

    public static ClaimDailyQuestInteractor_Factory create(Provider<Context> contextProvider) {
        return new ClaimDailyQuestInteractor_Factory(contextProvider);
    }
}
