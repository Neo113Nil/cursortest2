package com.google.crypto.tink.proto;

/* loaded from: classes4.dex */
public interface KeysetOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    com.google.crypto.tink.proto.Keyset.Key getKey(int i);

    int getKeyCount();

    java.util.List<com.google.crypto.tink.proto.Keyset.Key> getKeyList();

    int getPrimaryKeyId();
}
