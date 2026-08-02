package com.google.crypto.tink.proto;

/* loaded from: classes9.dex */
public interface EciesAeadHkdfPublicKeyOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    com.google.crypto.tink.proto.EciesAeadHkdfParams getParams();

    int getVersion();

    com.google.crypto.tink.shaded.protobuf.ByteString getX();

    com.google.crypto.tink.shaded.protobuf.ByteString getY();

    boolean hasParams();
}
