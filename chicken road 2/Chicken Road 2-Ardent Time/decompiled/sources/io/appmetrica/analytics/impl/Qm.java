package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public interface Qm extends io.appmetrica.analytics.coreapi.internal.data.ProtobufBinaryStateStorageFactory {
    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufBinaryStateStorageFactory
    io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage<java.lang.Object> create(android.content.Context context);

    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufBinaryStateStorageFactory
    io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage<java.lang.Object> createForMigration(android.content.Context context);
}
