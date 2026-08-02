package com.google.crypto.tink.proto;

/* loaded from: classes9.dex */
public interface JwtRsaSsaPkcs1PublicKeyOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm getAlgorithm();

    int getAlgorithmValue();

    com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid getCustomKid();

    com.google.crypto.tink.shaded.protobuf.ByteString getE();

    com.google.crypto.tink.shaded.protobuf.ByteString getN();

    int getVersion();

    boolean hasCustomKid();
}
