package org.betup.model.remote.api.rest.matches;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class NewSportsInteractor_Factory implements Factory<NewSportsInteractor> {
    private final Provider<Context> contextProvider;

    public NewSportsInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public NewSportsInteractor get() {
        return new NewSportsInteractor(this.contextProvider.get());
    }

    public static NewSportsInteractor_Factory create(Provider<Context> contextProvider) {
        return new NewSportsInteractor_Factory(contextProvider);
    }
}
