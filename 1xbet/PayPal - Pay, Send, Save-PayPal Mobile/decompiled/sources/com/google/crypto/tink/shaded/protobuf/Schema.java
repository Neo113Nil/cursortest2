package com.google.crypto.tink.shaded.protobuf;

@com.google.crypto.tink.shaded.protobuf.CheckReturnValue
/* loaded from: classes4.dex */
interface Schema<T> {
    boolean equals(T t, T t2);

    int getSerializedSize(T t);

    int hashCode(T t);

    boolean isInitialized(T t);

    void makeImmutable(T t);

    void mergeFrom(T t, com.google.crypto.tink.shaded.protobuf.Reader reader, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException;

    void mergeFrom(T t, T t2);

    void mergeFrom(T t, byte[] bArr, int i, int i2, com.google.crypto.tink.shaded.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException;

    T newInstance();

    void writeTo(T t, com.google.crypto.tink.shaded.protobuf.Writer writer) throws java.io.IOException;
}
