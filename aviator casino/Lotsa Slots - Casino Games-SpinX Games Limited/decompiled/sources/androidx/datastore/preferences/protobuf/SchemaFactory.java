package androidx.datastore.preferences.protobuf;

@androidx.datastore.preferences.protobuf.CheckReturnValue
/* loaded from: classes2.dex */
interface SchemaFactory {
    <T> androidx.datastore.preferences.protobuf.Schema<T> createSchema(java.lang.Class<T> messageType);
}
