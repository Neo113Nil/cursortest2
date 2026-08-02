package com.google.crypto.tink.proto;

/* loaded from: classes9.dex */
public interface RsaSsaPkcs1PublicKeyOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    com.google.crypto.tink.shaded.protobuf.ByteString getE();

    com.google.crypto.tink.shaded.protobuf.ByteString getN();

    com.google.crypto.tink.proto.RsaSsaPkcs1Params getParams();

    int getVersion();

    boolean hasParams();
}
