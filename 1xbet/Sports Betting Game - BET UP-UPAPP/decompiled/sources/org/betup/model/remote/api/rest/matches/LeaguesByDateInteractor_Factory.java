package org.betup.model.remote.api.rest.matches;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class LeaguesByDateInteractor_Factory implements Factory<LeaguesByDateInteractor> {
    private final Provider<Context> contextProvider;

    public LeaguesByDateInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public LeaguesByDateInteractor get() {
        return new LeaguesByDateInteractor(this.contextProvider.get());
    }

    public static LeaguesByDateInteractor_Factory create(Provider<Context> contextProvider) {
        return new LeaguesByDateInteractor_Factory(contextProvider);
    }
}
