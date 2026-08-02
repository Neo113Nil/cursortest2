package org.betup.model.local.interactor;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.model.local.AppDatabase;

/* loaded from: classes2.dex */
public final class LoadEventsInteractor_Factory implements Factory<LoadEventsInteractor> {
    private final Provider<AppDatabase> appDatabaseProvider;
    private final Provider<Context> contextProvider;

    public LoadEventsInteractor_Factory(Provider<Context> contextProvider, Provider<AppDatabase> appDatabaseProvider) {
        this.contextProvider = contextProvider;
        this.appDatabaseProvider = appDatabaseProvider;
    }

    @Override // javax.inject.Provider
    public LoadEventsInteractor get() {
        return new LoadEventsInteractor(this.contextProvider.get(), this.appDatabaseProvider.get());
    }

    public static LoadEventsInteractor_Factory create(Provider<Context> contextProvider, Provider<AppDatabase> appDatabaseProvider) {
        return new LoadEventsInteractor_Factory(contextProvider, appDatabaseProvider);
    }
}
