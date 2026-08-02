package com.google.crypto.tink.shaded.protobuf;

@com.google.crypto.tink.shaded.protobuf.CheckReturnValue
/* loaded from: classes4.dex */
abstract class ExtensionSchema<T extends com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<T>> {
    abstract int extensionNumber(java.util.Map.Entry<?, ?> entry);

    abstract java.lang.Object findExtensionByNumber(com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite, com.google.crypto.tink.shaded.protobuf.MessageLite messageLite, int i);

    abstract com.google.crypto.tink.shaded.protobuf.FieldSet<T> getExtensions(java.lang.Object obj);

    abstract com.google.crypto.tink.shaded.protobuf.FieldSet<T> getMutableExtensions(java.lang.Object obj);

    abstract boolean hasExtensions(com.google.crypto.tink.shaded.protobuf.MessageLite messageLite);

    abstract void makeImmutable(java.lang.Object obj);

    abstract <UT, UB> UB parseExtension(java.lang.Object obj, com.google.crypto.tink.shaded.protobuf.Reader reader, java.lang.Object obj2, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite, com.google.crypto.tink.shaded.protobuf.FieldSet<T> fieldSet, UB ub, com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<UT, UB> unknownFieldSchema) throws java.io.IOException;

    abstract void parseLengthPrefixedMessageSetItem(com.google.crypto.tink.shaded.protobuf.Reader reader, java.lang.Object obj, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite, com.google.crypto.tink.shaded.protobuf.FieldSet<T> fieldSet) throws java.io.IOException;

    abstract void parseMessageSetItem(com.google.crypto.tink.shaded.protobuf.ByteString byteString, java.lang.Object obj, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite, com.google.crypto.tink.shaded.protobuf.FieldSet<T> fieldSet) throws java.io.IOException;

    abstract void serializeExtension(com.google.crypto.tink.shaded.protobuf.Writer writer, java.util.Map.Entry<?, ?> entry) throws java.io.IOException;

    abstract void setExtensions(java.lang.Object obj, com.google.crypto.tink.shaded.protobuf.FieldSet<T> fieldSet);

    ExtensionSchema() {
    }
}
