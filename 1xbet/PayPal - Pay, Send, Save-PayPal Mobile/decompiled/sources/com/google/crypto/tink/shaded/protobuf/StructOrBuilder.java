package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes9.dex */
public interface StructOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    boolean containsFields(java.lang.String str);

    @java.lang.Deprecated
    java.util.Map<java.lang.String, com.google.crypto.tink.shaded.protobuf.Value> getFields();

    int getFieldsCount();

    java.util.Map<java.lang.String, com.google.crypto.tink.shaded.protobuf.Value> getFieldsMap();

    com.google.crypto.tink.shaded.protobuf.Value getFieldsOrDefault(java.lang.String str, com.google.crypto.tink.shaded.protobuf.Value value);

    com.google.crypto.tink.shaded.protobuf.Value getFieldsOrThrow(java.lang.String str);
}
