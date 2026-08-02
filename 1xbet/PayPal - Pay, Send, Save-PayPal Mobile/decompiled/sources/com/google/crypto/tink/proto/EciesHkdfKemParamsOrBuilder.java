package com.google.crypto.tink.proto;

/* loaded from: classes9.dex */
public interface EciesHkdfKemParamsOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    com.google.crypto.tink.proto.EllipticCurveType getCurveType();

    int getCurveTypeValue();

    com.google.crypto.tink.proto.HashType getHkdfHashType();

    int getHkdfHashTypeValue();

    com.google.crypto.tink.shaded.protobuf.ByteString getHkdfSalt();
}
