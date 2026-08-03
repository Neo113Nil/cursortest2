package com.google.protobuf;

@com.google.protobuf.CheckReturnValue
/* loaded from: classes4.dex */
abstract class ExtensionSchema<T extends com.google.protobuf.FieldSet.FieldDescriptorLite<T>> {
    abstract int extensionNumber(java.util.Map.Entry<?, ?> extension);

    abstract java.lang.Object findExtensionByNumber(com.google.protobuf.ExtensionRegistryLite extensionRegistry, com.google.protobuf.MessageLite defaultInstance, int number);

    abstract com.google.protobuf.FieldSet<T> getExtensions(java.lang.Object message);

    abstract com.google.protobuf.FieldSet<T> getMutableExtensions(java.lang.Object message);

    abstract boolean hasExtensions(com.google.protobuf.MessageLite prototype);

    abstract void makeImmutable(java.lang.Object message);

    abstract <UT, UB> UB parseExtension(java.lang.Object containerMessage, com.google.protobuf.Reader reader, java.lang.Object extension, com.google.protobuf.ExtensionRegistryLite extensionRegistry, com.google.protobuf.FieldSet<T> extensions, UB unknownFields, com.google.protobuf.UnknownFieldSchema<UT, UB> unknownFieldSchema) throws java.io.IOException;

    abstract void parseLengthPrefixedMessageSetItem(com.google.protobuf.Reader reader, java.lang.Object extension, com.google.protobuf.ExtensionRegistryLite extensionRegistry, com.google.protobuf.FieldSet<T> extensions) throws java.io.IOException;

    abstract void parseMessageSetItem(com.google.protobuf.ByteString data, java.lang.Object extension, com.google.protobuf.ExtensionRegistryLite extensionRegistry, com.google.protobuf.FieldSet<T> extensions) throws java.io.IOException;

    abstract void serializeExtension(com.google.protobuf.Writer writer, java.util.Map.Entry<?, ?> extension) throws java.io.IOException;

    abstract void setExtensions(java.lang.Object message, com.google.protobuf.FieldSet<T> extensions);

    ExtensionSchema() {
    }
}
