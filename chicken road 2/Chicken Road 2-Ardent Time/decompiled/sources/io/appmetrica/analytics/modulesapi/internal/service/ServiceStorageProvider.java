package io.appmetrica.analytics.modulesapi.internal.service;

/* loaded from: classes.dex */
public interface ServiceStorageProvider {
    <T, P extends io.appmetrica.analytics.protobuf.nano.MessageNano> io.appmetrica.analytics.coreapi.internal.data.ProtobufBinaryStateStorageFactory<T> createBinaryStateStorageFactory(java.lang.String str, io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer<P> protobufStateSerializer, io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter<T, P> protobufConverter);

    java.io.File getAppDataStorage();

    java.io.File getAppFileStorage();

    android.database.sqlite.SQLiteOpenHelper getDbStorage();

    java.io.File getSdkDataStorage();

    io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage getTempCacheStorage();

    io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences legacyModulePreferences();

    io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences modulePreferences(java.lang.String str);
}
