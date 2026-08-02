package org.betup.model.local.interactor;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.model.local.AppDatabase;

/* loaded from: classes2.dex */
public final class AddEventInteractor_Factory implements Factory<AddEventInteractor> {
    private final Provider<AppDatabase> appDatabaseProvider;
    private final Provider<Context> contextProvider;

    public AddEventInteractor_Factory(Provider<Context> contextProvider, Provider<AppDatabase> appDatabaseProvider) {
        this.contextProvider = contextProvider;
        this.appDatabaseProvider = appDatabaseProvider;
    }

    @Override // javax.inject.Provider
    public AddEventInteractor get() {
        return new AddEventInteractor(this.contextProvider.get(), this.appDatabaseProvider.get());
    }

    public static AddEventInteractor_Factory create(Provider<Context> contextProvider, Provider<AppDatabase> appDatabaseProvider) {
        return new AddEventInteractor_Factory(contextProvider, appDatabaseProvider);
    }
}
