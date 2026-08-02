package org.betup.model.local.interactor;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.model.local.AppDatabase;

/* loaded from: classes2.dex */
public final class GetNewEventsCountInteractorByUUID_Factory implements Factory<GetNewEventsCountInteractorByUUID> {
    private final Provider<AppDatabase> appDatabaseProvider;
    private final Provider<Context> contextProvider;

    public GetNewEventsCountInteractorByUUID_Factory(Provider<Context> contextProvider, Provider<AppDatabase> appDatabaseProvider) {
        this.contextProvider = contextProvider;
        this.appDatabaseProvider = appDatabaseProvider;
    }

    @Override // javax.inject.Provider
    public GetNewEventsCountInteractorByUUID get() {
        return new GetNewEventsCountInteractorByUUID(this.contextProvider.get(), this.appDatabaseProvider.get());
    }

    public static GetNewEventsCountInteractorByUUID_Factory create(Provider<Context> contextProvider, Provider<AppDatabase> appDatabaseProvider) {
        return new GetNewEventsCountInteractorByUUID_Factory(contextProvider, appDatabaseProvider);
    }
}
