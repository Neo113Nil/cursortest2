package kotlin.reflect.jvm.internal.impl.protobuf;

/* loaded from: classes5.dex */
public interface Parser<MessageType> {
    MessageType parseDelimitedFrom(java.io.InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(java.io.InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

    MessageType parseFrom(kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

    MessageType parsePartialFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
}
