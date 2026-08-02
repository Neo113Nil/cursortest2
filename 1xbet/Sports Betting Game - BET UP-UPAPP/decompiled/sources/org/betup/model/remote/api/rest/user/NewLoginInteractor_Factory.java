package org.betup.model.remote.api.rest.user;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class NewLoginInteractor_Factory implements Factory<NewLoginInteractor> {
    private final Provider<Context> contextProvider;

    public NewLoginInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public NewLoginInteractor get() {
        return new NewLoginInteractor(this.contextProvider.get());
    }

    public static NewLoginInteractor_Factory create(Provider<Context> contextProvider) {
        return new NewLoginInteractor_Factory(contextProvider);
    }
}
