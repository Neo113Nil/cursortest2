package org.betup.model.local.interactor;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.model.local.AppDatabase;

/* loaded from: classes2.dex */
public final class GetNewEventsCountInteractor_Factory implements Factory<GetNewEventsCountInteractor> {
    private final Provider<AppDatabase> appDatabaseProvider;
    private final Provider<Context> contextProvider;

    public GetNewEventsCountInteractor_Factory(Provider<Context> contextProvider, Provider<AppDatabase> appDatabaseProvider) {
        this.contextProvider = contextProvider;
        this.appDatabaseProvider = appDatabaseProvider;
    }

    @Override // javax.inject.Provider
    public GetNewEventsCountInteractor get() {
        return new GetNewEventsCountInteractor(this.contextProvider.get(), this.appDatabaseProvider.get());
    }

    public static GetNewEventsCountInteractor_Factory create(Provider<Context> contextProvider, Provider<AppDatabase> appDatabaseProvider) {
        return new GetNewEventsCountInteractor_Factory(contextProvider, appDatabaseProvider);
    }
}
