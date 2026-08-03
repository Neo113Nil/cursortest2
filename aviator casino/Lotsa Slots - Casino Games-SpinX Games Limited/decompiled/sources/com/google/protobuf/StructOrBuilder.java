package com.google.protobuf;

/* loaded from: classes4.dex */
public interface StructOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
    boolean containsFields(java.lang.String key);

    @java.lang.Deprecated
    java.util.Map<java.lang.String, com.google.protobuf.Value> getFields();

    int getFieldsCount();

    java.util.Map<java.lang.String, com.google.protobuf.Value> getFieldsMap();

    com.google.protobuf.Value getFieldsOrDefault(java.lang.String key, com.google.protobuf.Value defaultValue);

    com.google.protobuf.Value getFieldsOrThrow(java.lang.String key);
}
