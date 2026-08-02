package org.betup.model.remote.api.rest.user;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class ChangeV7CountryInteractor_Factory implements Factory<ChangeV7CountryInteractor> {
    private final Provider<Context> contextProvider;

    public ChangeV7CountryInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public ChangeV7CountryInteractor get() {
        return new ChangeV7CountryInteractor(this.contextProvider.get());
    }

    public static ChangeV7CountryInteractor_Factory create(Provider<Context> contextProvider) {
        return new ChangeV7CountryInteractor_Factory(contextProvider);
    }
}
