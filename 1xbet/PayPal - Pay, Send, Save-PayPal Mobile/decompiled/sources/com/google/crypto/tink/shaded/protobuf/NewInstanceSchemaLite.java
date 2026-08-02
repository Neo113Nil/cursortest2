package com.google.crypto.tink.shaded.protobuf;

@com.google.crypto.tink.shaded.protobuf.CheckReturnValue
/* loaded from: classes4.dex */
final class NewInstanceSchemaLite implements com.google.crypto.tink.shaded.protobuf.NewInstanceSchema {
    NewInstanceSchemaLite() {
    }

    @Override // com.google.crypto.tink.shaded.protobuf.NewInstanceSchema
    public final java.lang.Object newInstance(java.lang.Object obj) {
        return ((com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite) obj).newMutableInstance();
    }
}
