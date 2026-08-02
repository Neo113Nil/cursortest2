package com.google.crypto.tink.proto;

/* loaded from: classes9.dex */
public interface HmacPrfKeyOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    com.google.crypto.tink.shaded.protobuf.ByteString getKeyValue();

    com.google.crypto.tink.proto.HmacPrfParams getParams();

    int getVersion();

    boolean hasParams();
}
