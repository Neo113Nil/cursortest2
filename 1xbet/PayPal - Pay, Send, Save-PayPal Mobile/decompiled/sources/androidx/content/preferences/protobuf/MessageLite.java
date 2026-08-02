package androidx.content.preferences.protobuf;

@androidx.content.preferences.protobuf.CheckReturnValue
/* loaded from: classes3.dex */
public interface MessageLite extends androidx.content.preferences.protobuf.MessageLiteOrBuilder {

    public interface Builder extends androidx.content.preferences.protobuf.MessageLiteOrBuilder, java.lang.Cloneable {
        androidx.content.preferences.protobuf.MessageLite build();

        androidx.content.preferences.protobuf.MessageLite buildPartial();

        androidx.datastore.preferences.protobuf.MessageLite.Builder clear();

        /* renamed from: clone */
        androidx.datastore.preferences.protobuf.MessageLite.Builder mo9148clone();

        boolean mergeDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException;

        boolean mergeDelimitedFrom(java.io.InputStream inputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException;

        androidx.datastore.preferences.protobuf.MessageLite.Builder mergeFrom(androidx.content.preferences.protobuf.ByteString byteString) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException;

        androidx.datastore.preferences.protobuf.MessageLite.Builder mergeFrom(androidx.content.preferences.protobuf.ByteString byteString, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException;

        androidx.datastore.preferences.protobuf.MessageLite.Builder mergeFrom(androidx.content.preferences.protobuf.CodedInputStream codedInputStream) throws java.io.IOException;

        androidx.datastore.preferences.protobuf.MessageLite.Builder mergeFrom(androidx.content.preferences.protobuf.CodedInputStream codedInputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException;

        androidx.datastore.preferences.protobuf.MessageLite.Builder mergeFrom(androidx.content.preferences.protobuf.MessageLite messageLite);

        androidx.datastore.preferences.protobuf.MessageLite.Builder mergeFrom(java.io.InputStream inputStream) throws java.io.IOException;

        androidx.datastore.preferences.protobuf.MessageLite.Builder mergeFrom(java.io.InputStream inputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException;

        androidx.datastore.preferences.protobuf.MessageLite.Builder mergeFrom(byte[] bArr) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException;

        androidx.datastore.preferences.protobuf.MessageLite.Builder mergeFrom(byte[] bArr, int i, int i2) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException;

        androidx.datastore.preferences.protobuf.MessageLite.Builder mergeFrom(byte[] bArr, int i, int i2, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException;

        androidx.datastore.preferences.protobuf.MessageLite.Builder mergeFrom(byte[] bArr, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException;
    }

    androidx.content.preferences.protobuf.Parser<? extends androidx.content.preferences.protobuf.MessageLite> getParserForType();

    int getSerializedSize();

    androidx.datastore.preferences.protobuf.MessageLite.Builder newBuilderForType();

    androidx.datastore.preferences.protobuf.MessageLite.Builder toBuilder();

    byte[] toByteArray();

    androidx.content.preferences.protobuf.ByteString toByteString();

    void writeDelimitedTo(java.io.OutputStream outputStream) throws java.io.IOException;

    void writeTo(androidx.content.preferences.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException;

    void writeTo(java.io.OutputStream outputStream) throws java.io.IOException;
}
