package com.google.crypto.tink.shaded.protobuf;

@com.google.crypto.tink.shaded.protobuf.CheckReturnValue
/* loaded from: classes4.dex */
public interface MessageLite extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {

    public interface Builder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder, java.lang.Cloneable {
        com.google.crypto.tink.shaded.protobuf.MessageLite build();

        com.google.crypto.tink.shaded.protobuf.MessageLite buildPartial();

        com.google.crypto.tink.shaded.protobuf.MessageLite.Builder clear();

        /* renamed from: clone */
        com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mo10407clone();

        boolean mergeDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException;

        boolean mergeDelimitedFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException;

        com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

        com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

        com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream) throws java.io.IOException;

        com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException;

        com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(com.google.crypto.tink.shaded.protobuf.MessageLite messageLite);

        com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(java.io.InputStream inputStream) throws java.io.IOException;

        com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException;

        com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(byte[] bArr) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

        com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(byte[] bArr, int i, int i2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

        com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(byte[] bArr, int i, int i2, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

        com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(byte[] bArr, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
    }

    com.google.crypto.tink.shaded.protobuf.Parser<? extends com.google.crypto.tink.shaded.protobuf.MessageLite> getParserForType();

    int getSerializedSize();

    com.google.crypto.tink.shaded.protobuf.MessageLite.Builder newBuilderForType();

    com.google.crypto.tink.shaded.protobuf.MessageLite.Builder toBuilder();

    byte[] toByteArray();

    com.google.crypto.tink.shaded.protobuf.ByteString toByteString();

    void writeDelimitedTo(java.io.OutputStream outputStream) throws java.io.IOException;

    void writeTo(com.google.crypto.tink.shaded.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException;

    void writeTo(java.io.OutputStream outputStream) throws java.io.IOException;
}
