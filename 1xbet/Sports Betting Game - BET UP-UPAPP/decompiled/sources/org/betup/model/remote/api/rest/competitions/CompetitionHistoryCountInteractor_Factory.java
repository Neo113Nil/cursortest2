package org.betup.model.remote.api.rest.competitions;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class CompetitionHistoryCountInteractor_Factory implements Factory<CompetitionHistoryCountInteractor> {
    private final Provider<Context> contextProvider;

    public CompetitionHistoryCountInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public CompetitionHistoryCountInteractor get() {
        return new CompetitionHistoryCountInteractor(this.contextProvider.get());
    }

    public static CompetitionHistoryCountInteractor_Factory create(Provider<Context> contextProvider) {
        return new CompetitionHistoryCountInteractor_Factory(contextProvider);
    }
}
