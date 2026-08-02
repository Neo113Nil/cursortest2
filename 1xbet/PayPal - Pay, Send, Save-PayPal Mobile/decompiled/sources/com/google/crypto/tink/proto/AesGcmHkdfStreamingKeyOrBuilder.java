package com.google.crypto.tink.proto;

/* loaded from: classes9.dex */
public interface AesGcmHkdfStreamingKeyOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    com.google.crypto.tink.shaded.protobuf.ByteString getKeyValue();

    com.google.crypto.tink.proto.AesGcmHkdfStreamingParams getParams();

    int getVersion();

    boolean hasParams();
}
