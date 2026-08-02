package org.betup.model.local.interactor;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.model.local.AppDatabase;

/* loaded from: classes2.dex */
public final class ReadAllEventsInteractor_Factory implements Factory<ReadAllEventsInteractor> {
    private final Provider<Context> contextProvider;
    private final Provider<AppDatabase> databaseProvider;

    public ReadAllEventsInteractor_Factory(Provider<Context> contextProvider, Provider<AppDatabase> databaseProvider) {
        this.contextProvider = contextProvider;
        this.databaseProvider = databaseProvider;
    }

    @Override // javax.inject.Provider
    public ReadAllEventsInteractor get() {
        return new ReadAllEventsInteractor(this.contextProvider.get(), this.databaseProvider.get());
    }

    public static ReadAllEventsInteractor_Factory create(Provider<Context> contextProvider, Provider<AppDatabase> databaseProvider) {
        return new ReadAllEventsInteractor_Factory(contextProvider, databaseProvider);
    }
}
