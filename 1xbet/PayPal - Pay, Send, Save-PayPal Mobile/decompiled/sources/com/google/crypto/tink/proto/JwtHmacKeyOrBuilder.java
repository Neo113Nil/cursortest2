package com.google.crypto.tink.proto;

/* loaded from: classes9.dex */
public interface JwtHmacKeyOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    com.google.crypto.tink.proto.JwtHmacAlgorithm getAlgorithm();

    int getAlgorithmValue();

    com.google.crypto.tink.proto.JwtHmacKey.CustomKid getCustomKid();

    com.google.crypto.tink.shaded.protobuf.ByteString getKeyValue();

    int getVersion();

    boolean hasCustomKid();
}
