package com.paypal.oslo.core.persistence.appstorage.di;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/core/persistence/appstorage/di/AppStorageModule;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "provideDataStore", "(Landroid/content/Context;)Landroidx/datastore/core/DataStore;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes5.dex */
public final class AppStorageModule {
    public static final com.paypal.oslo.core.persistence.appstorage.di.AppStorageModule INSTANCE = new com.paypal.oslo.core.persistence.appstorage.di.AppStorageModule();

    private AppStorageModule() {
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final androidx.content.core.DataStore<androidx.content.preferences.core.Preferences> provideDataStore(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return com.paypal.oslo.core.persistence.appstorage.di.AppStorageModuleKt.access$getDataStore(context);
    }
}
