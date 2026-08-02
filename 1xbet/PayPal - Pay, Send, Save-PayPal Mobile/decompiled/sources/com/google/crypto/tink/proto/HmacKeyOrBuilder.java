package com.google.crypto.tink.proto;

/* loaded from: classes4.dex */
public interface HmacKeyOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    com.google.crypto.tink.shaded.protobuf.ByteString getKeyValue();

    com.google.crypto.tink.proto.HmacParams getParams();

    int getVersion();

    boolean hasParams();
}
