package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes4.dex */
public interface LazyStringList extends com.google.crypto.tink.shaded.protobuf.ProtocolStringList {
    void add(com.google.crypto.tink.shaded.protobuf.ByteString byteString);

    void add(byte[] bArr);

    boolean addAllByteArray(java.util.Collection<byte[]> collection);

    boolean addAllByteString(java.util.Collection<? extends com.google.crypto.tink.shaded.protobuf.ByteString> collection);

    java.util.List<byte[]> asByteArrayList();

    byte[] getByteArray(int i);

    com.google.crypto.tink.shaded.protobuf.ByteString getByteString(int i);

    java.lang.Object getRaw(int i);

    java.util.List<?> getUnderlyingElements();

    com.google.crypto.tink.shaded.protobuf.LazyStringList getUnmodifiableView();

    void mergeFrom(com.google.crypto.tink.shaded.protobuf.LazyStringList lazyStringList);

    void set(int i, com.google.crypto.tink.shaded.protobuf.ByteString byteString);

    void set(int i, byte[] bArr);
}
