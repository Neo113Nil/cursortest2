package com.google.crypto.tink.proto;

/* loaded from: classes9.dex */
public interface AesGcmHkdfStreamingParamsOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    int getCiphertextSegmentSize();

    int getDerivedKeySize();

    com.google.crypto.tink.proto.HashType getHkdfHashType();

    int getHkdfHashTypeValue();
}
