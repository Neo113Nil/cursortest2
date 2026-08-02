package com.google.protobuf;

@com.google.protobuf.CheckReturnValue
/* loaded from: classes9.dex */
final class NewInstanceSchemaLite implements com.google.protobuf.NewInstanceSchema {
    NewInstanceSchemaLite() {
    }

    @Override // com.google.protobuf.NewInstanceSchema
    public final java.lang.Object newInstance(java.lang.Object obj) {
        return ((com.google.protobuf.GeneratedMessageLite) obj).newMutableInstance();
    }
}
