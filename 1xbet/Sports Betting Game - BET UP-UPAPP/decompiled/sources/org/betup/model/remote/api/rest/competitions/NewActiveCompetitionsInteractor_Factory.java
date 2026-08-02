package org.betup.model.remote.api.rest.competitions;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class NewActiveCompetitionsInteractor_Factory implements Factory<NewActiveCompetitionsInteractor> {
    private final Provider<Context> contextProvider;

    public NewActiveCompetitionsInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public NewActiveCompetitionsInteractor get() {
        return new NewActiveCompetitionsInteractor(this.contextProvider.get());
    }

    public static NewActiveCompetitionsInteractor_Factory create(Provider<Context> contextProvider) {
        return new NewActiveCompetitionsInteractor_Factory(contextProvider);
    }
}
