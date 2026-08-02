package org.betup.model.remote.api.rest.competitions;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class NewCompetitionsHistoryInteractor_Factory implements Factory<NewCompetitionsHistoryInteractor> {
    private final Provider<Context> contextProvider;

    public NewCompetitionsHistoryInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public NewCompetitionsHistoryInteractor get() {
        return new NewCompetitionsHistoryInteractor(this.contextProvider.get());
    }

    public static NewCompetitionsHistoryInteractor_Factory create(Provider<Context> contextProvider) {
        return new NewCompetitionsHistoryInteractor_Factory(contextProvider);
    }
}
