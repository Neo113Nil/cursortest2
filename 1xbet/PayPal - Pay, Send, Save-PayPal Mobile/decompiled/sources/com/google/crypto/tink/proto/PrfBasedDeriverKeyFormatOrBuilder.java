package com.google.crypto.tink.proto;

/* loaded from: classes9.dex */
public interface PrfBasedDeriverKeyFormatOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    com.google.crypto.tink.proto.PrfBasedDeriverParams getParams();

    com.google.crypto.tink.proto.KeyTemplate getPrfKeyTemplate();

    boolean hasParams();

    boolean hasPrfKeyTemplate();
}
