package com.google.crypto.tink.proto;

/* loaded from: classes9.dex */
public interface EcdsaParamsOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    com.google.crypto.tink.proto.EllipticCurveType getCurve();

    int getCurveValue();

    com.google.crypto.tink.proto.EcdsaSignatureEncoding getEncoding();

    int getEncodingValue();

    com.google.crypto.tink.proto.HashType getHashType();

    int getHashTypeValue();
}
