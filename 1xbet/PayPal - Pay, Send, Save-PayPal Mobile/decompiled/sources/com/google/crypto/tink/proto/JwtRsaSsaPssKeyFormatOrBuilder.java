package com.google.crypto.tink.proto;

/* loaded from: classes9.dex */
public interface JwtRsaSsaPssKeyFormatOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm getAlgorithm();

    int getAlgorithmValue();

    int getModulusSizeInBits();

    com.google.crypto.tink.shaded.protobuf.ByteString getPublicExponent();

    int getVersion();
}
