package com.google.protobuf;

@com.google.protobuf.CheckReturnValue
/* loaded from: classes4.dex */
public interface MessageLite extends com.google.protobuf.MessageLiteOrBuilder {

    public interface Builder extends com.google.protobuf.MessageLiteOrBuilder, java.lang.Cloneable {
        com.google.protobuf.MessageLite build();

        com.google.protobuf.MessageLite buildPartial();

        com.google.protobuf.MessageLite.Builder clear();

        /* renamed from: clone */
        com.google.protobuf.MessageLite.Builder mo5595clone();

        boolean mergeDelimitedFrom(java.io.InputStream input) throws java.io.IOException;

        boolean mergeDelimitedFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException;

        com.google.protobuf.MessageLite.Builder mergeFrom(com.google.protobuf.ByteString data) throws com.google.protobuf.InvalidProtocolBufferException;

        com.google.protobuf.MessageLite.Builder mergeFrom(com.google.protobuf.ByteString data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException;

        com.google.protobuf.MessageLite.Builder mergeFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException;

        com.google.protobuf.MessageLite.Builder mergeFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException;

        com.google.protobuf.MessageLite.Builder mergeFrom(com.google.protobuf.MessageLite other);

        com.google.protobuf.MessageLite.Builder mergeFrom(java.io.InputStream input) throws java.io.IOException;

        com.google.protobuf.MessageLite.Builder mergeFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException;

        com.google.protobuf.MessageLite.Builder mergeFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException;

        com.google.protobuf.MessageLite.Builder mergeFrom(byte[] data, int off, int len) throws com.google.protobuf.InvalidProtocolBufferException;

        com.google.protobuf.MessageLite.Builder mergeFrom(byte[] data, int off, int len, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException;

        com.google.protobuf.MessageLite.Builder mergeFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException;
    }

    com.google.protobuf.Parser<? extends com.google.protobuf.MessageLite> getParserForType();

    int getSerializedSize();

    com.google.protobuf.MessageLite.Builder newBuilderForType();

    com.google.protobuf.MessageLite.Builder toBuilder();

    byte[] toByteArray();

    com.google.protobuf.ByteString toByteString();

    void writeDelimitedTo(java.io.OutputStream output) throws java.io.IOException;

    void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException;

    void writeTo(java.io.OutputStream output) throws java.io.IOException;
}
