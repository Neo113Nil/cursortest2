package com.google.protobuf;

@com.google.protobuf.CheckReturnValue
/* loaded from: classes4.dex */
interface Schema<T> {
    boolean equals(T message, T other);

    int getSerializedSize(T message);

    int hashCode(T message);

    boolean isInitialized(T message);

    void makeImmutable(T message);

    void mergeFrom(T message, com.google.protobuf.Reader reader, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException;

    void mergeFrom(T message, T other);

    void mergeFrom(T message, byte[] data, int position, int limit, com.google.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException;

    T newInstance();

    void writeTo(T message, com.google.protobuf.Writer writer) throws java.io.IOException;
}
