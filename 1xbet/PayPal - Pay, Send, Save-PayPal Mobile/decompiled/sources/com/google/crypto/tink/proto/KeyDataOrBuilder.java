package com.google.crypto.tink.proto;

/* loaded from: classes4.dex */
public interface KeyDataOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    com.google.crypto.tink.proto.KeyData.KeyMaterialType getKeyMaterialType();

    int getKeyMaterialTypeValue();

    java.lang.String getTypeUrl();

    com.google.crypto.tink.shaded.protobuf.ByteString getTypeUrlBytes();

    com.google.crypto.tink.shaded.protobuf.ByteString getValue();
}
