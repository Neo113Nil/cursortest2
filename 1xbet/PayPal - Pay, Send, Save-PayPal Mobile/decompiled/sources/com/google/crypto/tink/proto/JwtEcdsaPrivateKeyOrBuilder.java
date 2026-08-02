package com.google.crypto.tink.proto;

/* loaded from: classes9.dex */
public interface JwtEcdsaPrivateKeyOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    com.google.crypto.tink.shaded.protobuf.ByteString getKeyValue();

    com.google.crypto.tink.proto.JwtEcdsaPublicKey getPublicKey();

    int getVersion();

    boolean hasPublicKey();
}
