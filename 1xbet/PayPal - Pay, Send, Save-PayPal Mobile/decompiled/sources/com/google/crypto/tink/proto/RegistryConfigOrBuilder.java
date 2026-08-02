package com.google.crypto.tink.proto;

@java.lang.Deprecated
/* loaded from: classes4.dex */
public interface RegistryConfigOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    java.lang.String getConfigName();

    com.google.crypto.tink.shaded.protobuf.ByteString getConfigNameBytes();

    com.google.crypto.tink.proto.KeyTypeEntry getEntry(int i);

    int getEntryCount();

    java.util.List<com.google.crypto.tink.proto.KeyTypeEntry> getEntryList();
}
