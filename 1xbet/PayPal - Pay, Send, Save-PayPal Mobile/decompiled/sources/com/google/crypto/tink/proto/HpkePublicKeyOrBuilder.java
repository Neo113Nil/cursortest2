package com.google.crypto.tink.proto;

/* loaded from: classes9.dex */
public interface HpkePublicKeyOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    com.google.crypto.tink.proto.HpkeParams getParams();

    com.google.crypto.tink.shaded.protobuf.ByteString getPublicKey();

    int getVersion();

    boolean hasParams();
}
