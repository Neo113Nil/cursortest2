package com.paypal.oslo.core.persistence.appstorage.di;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00008CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/Context;", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/properties/ReadOnlyProperty;", "Camera2StreamConfigurationMap"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AppStorageModuleKt {
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoFpsRangesFor = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.core.persistence.appstorage.di.AppStorageModuleKt.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1))};
    private static final kotlin.properties.ReadOnlyProperty getHighResolutionOutputSizeshNQ4ISI = androidx.content.preferences.PreferenceDataStoreDelegateKt.preferencesDataStore$default("oslo.preferences_pb", null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.persistence.appstorage.di.AppStorageModuleKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.core.persistence.appstorage.di.AppStorageModuleKt.$r8$lambda$RvWEVIEJv5PVtaxOVoiHEZWz3wM((android.content.Context) obj);
        }
    }, null, 10, null);

    public static /* synthetic */ java.util.List $r8$lambda$RvWEVIEJv5PVtaxOVoiHEZWz3wM(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.lang.Object obj = dagger.hilt.android.EarlyEntryPoints.get(context, com.paypal.oslo.core.persistence.appstorage.di.AppStorageEntryPoint.class);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        com.paypal.oslo.core.persistence.appstorage.SharedPrefsMigrationProvider sharedPrefsMigrationProvider = ((com.paypal.oslo.core.persistence.appstorage.di.AppStorageEntryPoint) obj).sharedPrefsMigrationProvider();
        return kotlin.collections.CollectionsKt.plus((java.util.Collection) sharedPrefsMigrationProvider.provideMigrations(context), (java.lang.Iterable) sharedPrefsMigrationProvider.provideEncryptedMigrations(context));
    }

    public static final /* synthetic */ androidx.content.core.DataStore access$getDataStore(android.content.Context context) {
        return (androidx.content.core.DataStore) getHighResolutionOutputSizeshNQ4ISI.getValue(context, getHighSpeedVideoFpsRangesFor[0]);
    }
}
