package io.appmetrica.analytics.coreapi.internal.data;

/* loaded from: classes.dex */
public interface ProtobufBinaryStateStorageFactory<T> {
    io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage<T> create(android.content.Context context);

    io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage<T> createForMigration(android.content.Context context);
}
