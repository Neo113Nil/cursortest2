package com.google.crypto.tink.proto;

/* loaded from: classes9.dex */
public interface HpkePrivateKeyOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    com.google.crypto.tink.shaded.protobuf.ByteString getPrivateKey();

    com.google.crypto.tink.proto.HpkePublicKey getPublicKey();

    int getVersion();

    boolean hasPublicKey();
}
