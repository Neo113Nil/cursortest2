package org.betup.model.remote.api.rest.matches;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class SportsByDateInteractor_Factory implements Factory<SportsByDateInteractor> {
    private final Provider<Context> contextProvider;

    public SportsByDateInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public SportsByDateInteractor get() {
        return new SportsByDateInteractor(this.contextProvider.get());
    }

    public static SportsByDateInteractor_Factory create(Provider<Context> contextProvider) {
        return new SportsByDateInteractor_Factory(contextProvider);
    }
}
