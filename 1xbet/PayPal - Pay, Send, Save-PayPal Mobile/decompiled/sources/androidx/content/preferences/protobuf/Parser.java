package androidx.content.preferences.protobuf;

/* loaded from: classes3.dex */
public interface Parser<MessageType> {
    MessageType parseDelimitedFrom(java.io.InputStream inputStream) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException;

    MessageType parseDelimitedFrom(java.io.InputStream inputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(androidx.content.preferences.protobuf.ByteString byteString) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(androidx.content.preferences.protobuf.ByteString byteString, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(androidx.content.preferences.protobuf.CodedInputStream codedInputStream) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(androidx.content.preferences.protobuf.CodedInputStream codedInputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(java.io.InputStream inputStream) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(java.io.InputStream inputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(java.nio.ByteBuffer byteBuffer) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(java.nio.ByteBuffer byteBuffer, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(byte[] bArr) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(byte[] bArr, int i, int i2) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(byte[] bArr, int i, int i2, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(byte[] bArr, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialDelimitedFrom(java.io.InputStream inputStream) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialDelimitedFrom(java.io.InputStream inputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialFrom(androidx.content.preferences.protobuf.ByteString byteString) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialFrom(androidx.content.preferences.protobuf.ByteString byteString, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialFrom(androidx.content.preferences.protobuf.CodedInputStream codedInputStream) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialFrom(androidx.content.preferences.protobuf.CodedInputStream codedInputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialFrom(java.io.InputStream inputStream) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialFrom(java.io.InputStream inputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialFrom(byte[] bArr) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialFrom(byte[] bArr, int i, int i2) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialFrom(byte[] bArr, int i, int i2, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialFrom(byte[] bArr, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException;
}
