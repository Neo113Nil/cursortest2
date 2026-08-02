package org.betup.model.local.interactor;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.model.local.AppDatabase;

/* loaded from: classes2.dex */
public final class ReadEventInteractor_Factory implements Factory<ReadEventInteractor> {
    private final Provider<AppDatabase> appDatabaseProvider;
    private final Provider<Context> contextProvider;

    public ReadEventInteractor_Factory(Provider<Context> contextProvider, Provider<AppDatabase> appDatabaseProvider) {
        this.contextProvider = contextProvider;
        this.appDatabaseProvider = appDatabaseProvider;
    }

    @Override // javax.inject.Provider
    public ReadEventInteractor get() {
        return new ReadEventInteractor(this.contextProvider.get(), this.appDatabaseProvider.get());
    }

    public static ReadEventInteractor_Factory create(Provider<Context> contextProvider, Provider<AppDatabase> appDatabaseProvider) {
        return new ReadEventInteractor_Factory(contextProvider, appDatabaseProvider);
    }
}
