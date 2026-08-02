package com.google.crypto.tink.proto;

/* loaded from: classes9.dex */
public interface RsaSsaPkcs1KeyFormatOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    int getModulusSizeInBits();

    com.google.crypto.tink.proto.RsaSsaPkcs1Params getParams();

    com.google.crypto.tink.shaded.protobuf.ByteString getPublicExponent();

    boolean hasParams();
}
