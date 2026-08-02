package org.betup.model.remote.api.rest.competitions;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class CompetitionDetailsInteractor_Factory implements Factory<CompetitionDetailsInteractor> {
    private final Provider<Context> contextProvider;

    public CompetitionDetailsInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public CompetitionDetailsInteractor get() {
        return new CompetitionDetailsInteractor(this.contextProvider.get());
    }

    public static CompetitionDetailsInteractor_Factory create(Provider<Context> contextProvider) {
        return new CompetitionDetailsInteractor_Factory(contextProvider);
    }
}
