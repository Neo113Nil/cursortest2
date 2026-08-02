package com.google.crypto.tink.proto;

/* loaded from: classes9.dex */
public interface JwtEcdsaPublicKeyOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    com.google.crypto.tink.proto.JwtEcdsaAlgorithm getAlgorithm();

    int getAlgorithmValue();

    com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid getCustomKid();

    int getVersion();

    com.google.crypto.tink.shaded.protobuf.ByteString getX();

    com.google.crypto.tink.shaded.protobuf.ByteString getY();

    boolean hasCustomKid();
}
