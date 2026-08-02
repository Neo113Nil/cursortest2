package com.google.crypto.tink.proto;

/* loaded from: classes9.dex */
public interface EcdsaPrivateKeyOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    com.google.crypto.tink.shaded.protobuf.ByteString getKeyValue();

    com.google.crypto.tink.proto.EcdsaPublicKey getPublicKey();

    int getVersion();

    boolean hasPublicKey();
}
