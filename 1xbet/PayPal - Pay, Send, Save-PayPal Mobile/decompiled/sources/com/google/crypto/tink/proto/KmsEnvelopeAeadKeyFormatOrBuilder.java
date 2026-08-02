package com.google.crypto.tink.proto;

/* loaded from: classes4.dex */
public interface KmsEnvelopeAeadKeyFormatOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    com.google.crypto.tink.proto.KeyTemplate getDekTemplate();

    java.lang.String getKekUri();

    com.google.crypto.tink.shaded.protobuf.ByteString getKekUriBytes();

    boolean hasDekTemplate();
}
