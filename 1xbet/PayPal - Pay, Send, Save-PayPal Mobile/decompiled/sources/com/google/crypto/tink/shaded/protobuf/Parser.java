package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes4.dex */
public interface Parser<MessageType> {
    MessageType parseDelimitedFrom(java.io.InputStream inputStream) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

    MessageType parseDelimitedFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(java.io.InputStream inputStream) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(java.nio.ByteBuffer byteBuffer, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(byte[] bArr) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(byte[] bArr, int i, int i2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(byte[] bArr, int i, int i2, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(byte[] bArr, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialDelimitedFrom(java.io.InputStream inputStream) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialDelimitedFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialFrom(java.io.InputStream inputStream) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialFrom(byte[] bArr) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialFrom(byte[] bArr, int i, int i2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialFrom(byte[] bArr, int i, int i2, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialFrom(byte[] bArr, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
}
