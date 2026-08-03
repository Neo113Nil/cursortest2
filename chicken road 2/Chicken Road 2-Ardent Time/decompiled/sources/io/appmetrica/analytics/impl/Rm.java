package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public abstract class Rm implements io.appmetrica.analytics.impl.Qm {
    public abstract io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper a(android.content.Context context);

    public abstract io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage<java.lang.Object> a(android.content.Context context, io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper iBinaryDataHelper);

    public abstract io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper b(android.content.Context context);

    @Override // io.appmetrica.analytics.impl.Qm, io.appmetrica.analytics.coreapi.internal.data.ProtobufBinaryStateStorageFactory
    public final io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage<java.lang.Object> create(android.content.Context context) {
        return a(context, a(context));
    }

    @Override // io.appmetrica.analytics.impl.Qm, io.appmetrica.analytics.coreapi.internal.data.ProtobufBinaryStateStorageFactory
    public final io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage<java.lang.Object> createForMigration(android.content.Context context) {
        return a(context, b(context));
    }
}
