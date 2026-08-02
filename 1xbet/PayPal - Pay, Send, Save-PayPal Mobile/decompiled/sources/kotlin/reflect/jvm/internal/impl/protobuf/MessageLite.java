package kotlin.reflect.jvm.internal.impl.protobuf;

/* loaded from: classes5.dex */
public interface MessageLite extends kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder {

    public interface Builder extends java.lang.Cloneable, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder {
        kotlin.reflect.jvm.internal.impl.protobuf.MessageLite build();

        kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException;
    }

    kotlin.reflect.jvm.internal.impl.protobuf.Parser<? extends kotlin.reflect.jvm.internal.impl.protobuf.MessageLite> getParserForType();

    int getSerializedSize();

    kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder newBuilderForType();

    kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder toBuilder();

    byte[] toByteArray();

    void writeTo(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException;
}
