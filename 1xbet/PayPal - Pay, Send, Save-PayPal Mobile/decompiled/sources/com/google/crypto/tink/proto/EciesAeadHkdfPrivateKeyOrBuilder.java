package com.google.crypto.tink.proto;

/* loaded from: classes9.dex */
public interface EciesAeadHkdfPrivateKeyOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    com.google.crypto.tink.shaded.protobuf.ByteString getKeyValue();

    com.google.crypto.tink.proto.EciesAeadHkdfPublicKey getPublicKey();

    int getVersion();

    boolean hasPublicKey();
}
