package org.betup.model.remote.api.rest.matches;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class MatchInfoInteractor_Factory implements Factory<MatchInfoInteractor> {
    private final Provider<Context> contextProvider;

    public MatchInfoInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public MatchInfoInteractor get() {
        return new MatchInfoInteractor(this.contextProvider.get());
    }

    public static MatchInfoInteractor_Factory create(Provider<Context> contextProvider) {
        return new MatchInfoInteractor_Factory(contextProvider);
    }
}
