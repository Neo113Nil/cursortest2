package com.google.crypto.tink.proto;

/* loaded from: classes9.dex */
public interface EciesAeadHkdfParamsOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    com.google.crypto.tink.proto.EciesAeadDemParams getDemParams();

    com.google.crypto.tink.proto.EcPointFormat getEcPointFormat();

    int getEcPointFormatValue();

    com.google.crypto.tink.proto.EciesHkdfKemParams getKemParams();

    boolean hasDemParams();

    boolean hasKemParams();
}
