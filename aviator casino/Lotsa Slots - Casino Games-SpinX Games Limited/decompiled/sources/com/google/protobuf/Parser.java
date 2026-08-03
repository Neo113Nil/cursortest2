package com.google.protobuf;

/* loaded from: classes4.dex */
public interface Parser<MessageType> {
    MessageType parseDelimitedFrom(java.io.InputStream input) throws com.google.protobuf.InvalidProtocolBufferException;

    MessageType parseDelimitedFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(com.google.protobuf.ByteString data) throws com.google.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(com.google.protobuf.ByteString data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(com.google.protobuf.CodedInputStream input) throws com.google.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(java.io.InputStream input) throws com.google.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(byte[] data, int off, int len) throws com.google.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(byte[] data, int off, int len, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialDelimitedFrom(java.io.InputStream input) throws com.google.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialDelimitedFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialFrom(com.google.protobuf.ByteString data) throws com.google.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialFrom(com.google.protobuf.ByteString data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialFrom(com.google.protobuf.CodedInputStream input) throws com.google.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialFrom(java.io.InputStream input) throws com.google.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialFrom(byte[] data, int off, int len) throws com.google.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialFrom(byte[] data, int off, int len, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException;
}
