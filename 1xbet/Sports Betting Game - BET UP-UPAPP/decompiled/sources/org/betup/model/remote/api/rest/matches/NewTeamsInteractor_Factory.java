package org.betup.model.remote.api.rest.matches;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class NewTeamsInteractor_Factory implements Factory<NewTeamsInteractor> {
    private final Provider<Context> contextProvider;

    public NewTeamsInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public NewTeamsInteractor get() {
        return new NewTeamsInteractor(this.contextProvider.get());
    }

    public static NewTeamsInteractor_Factory create(Provider<Context> contextProvider) {
        return new NewTeamsInteractor_Factory(contextProvider);
    }
}
