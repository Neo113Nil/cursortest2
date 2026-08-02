package com.google.crypto.tink.proto;

/* loaded from: classes9.dex */
public interface RsaSsaPssParamsOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    com.google.crypto.tink.proto.HashType getMgf1Hash();

    int getMgf1HashValue();

    int getSaltLength();

    com.google.crypto.tink.proto.HashType getSigHash();

    int getSigHashValue();
}
