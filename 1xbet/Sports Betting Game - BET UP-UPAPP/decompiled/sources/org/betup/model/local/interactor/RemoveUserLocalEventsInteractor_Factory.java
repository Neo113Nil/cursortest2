package org.betup.model.local.interactor;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.model.local.AppDatabase;

/* loaded from: classes2.dex */
public final class RemoveUserLocalEventsInteractor_Factory implements Factory<RemoveUserLocalEventsInteractor> {
    private final Provider<AppDatabase> appDatabaseProvider;
    private final Provider<Context> contextProvider;

    public RemoveUserLocalEventsInteractor_Factory(Provider<Context> contextProvider, Provider<AppDatabase> appDatabaseProvider) {
        this.contextProvider = contextProvider;
        this.appDatabaseProvider = appDatabaseProvider;
    }

    @Override // javax.inject.Provider
    public RemoveUserLocalEventsInteractor get() {
        return new RemoveUserLocalEventsInteractor(this.contextProvider.get(), this.appDatabaseProvider.get());
    }

    public static RemoveUserLocalEventsInteractor_Factory create(Provider<Context> contextProvider, Provider<AppDatabase> appDatabaseProvider) {
        return new RemoveUserLocalEventsInteractor_Factory(contextProvider, appDatabaseProvider);
    }
}
