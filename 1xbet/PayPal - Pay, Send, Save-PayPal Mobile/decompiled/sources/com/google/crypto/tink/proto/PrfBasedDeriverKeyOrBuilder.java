package com.google.crypto.tink.proto;

/* loaded from: classes9.dex */
public interface PrfBasedDeriverKeyOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    com.google.crypto.tink.proto.PrfBasedDeriverParams getParams();

    com.google.crypto.tink.proto.KeyData getPrfKey();

    int getVersion();

    boolean hasParams();

    boolean hasPrfKey();
}
