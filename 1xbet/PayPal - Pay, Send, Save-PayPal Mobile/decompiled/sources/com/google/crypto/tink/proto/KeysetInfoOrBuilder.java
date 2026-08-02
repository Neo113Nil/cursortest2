package com.google.crypto.tink.proto;

/* loaded from: classes4.dex */
public interface KeysetInfoOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    com.google.crypto.tink.proto.KeysetInfo.KeyInfo getKeyInfo(int i);

    int getKeyInfoCount();

    java.util.List<com.google.crypto.tink.proto.KeysetInfo.KeyInfo> getKeyInfoList();

    int getPrimaryKeyId();
}
