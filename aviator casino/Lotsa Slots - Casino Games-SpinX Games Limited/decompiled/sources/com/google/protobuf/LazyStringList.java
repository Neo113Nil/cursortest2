package com.google.protobuf;

/* loaded from: classes4.dex */
public interface LazyStringList extends com.google.protobuf.ProtocolStringList {
    void add(com.google.protobuf.ByteString element);

    void add(byte[] element);

    boolean addAllByteArray(java.util.Collection<byte[]> c);

    boolean addAllByteString(java.util.Collection<? extends com.google.protobuf.ByteString> c);

    java.util.List<byte[]> asByteArrayList();

    byte[] getByteArray(int index);

    com.google.protobuf.ByteString getByteString(int index);

    java.lang.Object getRaw(int index);

    java.util.List<?> getUnderlyingElements();

    com.google.protobuf.LazyStringList getUnmodifiableView();

    void mergeFrom(com.google.protobuf.LazyStringList other);

    void set(int index, com.google.protobuf.ByteString element);

    void set(int index, byte[] element);
}
