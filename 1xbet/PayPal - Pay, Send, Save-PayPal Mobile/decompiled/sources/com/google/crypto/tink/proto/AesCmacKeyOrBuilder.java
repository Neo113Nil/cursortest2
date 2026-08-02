package com.google.crypto.tink.proto;

/* loaded from: classes4.dex */
public interface AesCmacKeyOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    com.google.crypto.tink.shaded.protobuf.ByteString getKeyValue();

    com.google.crypto.tink.proto.AesCmacParams getParams();

    int getVersion();

    boolean hasParams();
}
