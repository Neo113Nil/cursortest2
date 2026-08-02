package com.google.crypto.tink.proto;

/* loaded from: classes4.dex */
public interface EncryptedKeysetOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    com.google.crypto.tink.shaded.protobuf.ByteString getEncryptedKeyset();

    com.google.crypto.tink.proto.KeysetInfo getKeysetInfo();

    boolean hasKeysetInfo();
}
