package com.google.protobuf;

@com.google.protobuf.CheckReturnValue
/* loaded from: classes4.dex */
final class NewInstanceSchemaLite implements com.google.protobuf.NewInstanceSchema {
    NewInstanceSchemaLite() {
    }

    @Override // com.google.protobuf.NewInstanceSchema
    public java.lang.Object newInstance(java.lang.Object defaultInstance) {
        return ((com.google.protobuf.GeneratedMessageLite) defaultInstance).newMutableInstance();
    }
}
