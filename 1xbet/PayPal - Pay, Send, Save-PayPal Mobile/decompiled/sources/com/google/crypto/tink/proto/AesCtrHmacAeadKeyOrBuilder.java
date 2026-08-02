package com.google.crypto.tink.proto;

/* loaded from: classes4.dex */
public interface AesCtrHmacAeadKeyOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    com.google.crypto.tink.proto.AesCtrKey getAesCtrKey();

    com.google.crypto.tink.proto.HmacKey getHmacKey();

    int getVersion();

    boolean hasAesCtrKey();

    boolean hasHmacKey();
}
