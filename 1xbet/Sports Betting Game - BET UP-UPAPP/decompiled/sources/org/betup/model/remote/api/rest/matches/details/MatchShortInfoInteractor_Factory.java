package org.betup.model.remote.api.rest.matches.details;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class MatchShortInfoInteractor_Factory implements Factory<MatchShortInfoInteractor> {
    private final Provider<Context> contextProvider;

    public MatchShortInfoInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public MatchShortInfoInteractor get() {
        return new MatchShortInfoInteractor(this.contextProvider.get());
    }

    public static MatchShortInfoInteractor_Factory create(Provider<Context> contextProvider) {
        return new MatchShortInfoInteractor_Factory(contextProvider);
    }
}
