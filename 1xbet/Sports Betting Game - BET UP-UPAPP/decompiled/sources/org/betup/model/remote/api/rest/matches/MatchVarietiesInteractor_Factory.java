package org.betup.model.remote.api.rest.matches;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class MatchVarietiesInteractor_Factory implements Factory<MatchVarietiesInteractor> {
    private final Provider<Context> contextProvider;

    public MatchVarietiesInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public MatchVarietiesInteractor get() {
        return new MatchVarietiesInteractor(this.contextProvider.get());
    }

    public static MatchVarietiesInteractor_Factory create(Provider<Context> contextProvider) {
        return new MatchVarietiesInteractor_Factory(contextProvider);
    }
}
