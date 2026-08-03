package androidx.datastore.preferences.protobuf;

@androidx.datastore.preferences.protobuf.CheckReturnValue
/* loaded from: classes2.dex */
final class NewInstanceSchemaLite implements androidx.datastore.preferences.protobuf.NewInstanceSchema {
    NewInstanceSchemaLite() {
    }

    @Override // androidx.datastore.preferences.protobuf.NewInstanceSchema
    public java.lang.Object newInstance(java.lang.Object defaultInstance) {
        return ((androidx.datastore.preferences.protobuf.GeneratedMessageLite) defaultInstance).newMutableInstance();
    }
}
