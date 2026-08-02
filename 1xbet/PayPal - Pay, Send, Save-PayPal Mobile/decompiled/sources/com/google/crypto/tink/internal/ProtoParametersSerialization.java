package com.google.crypto.tink.internal;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes4.dex */
public final class ProtoParametersSerialization implements com.google.crypto.tink.internal.Serialization {
    private final com.google.crypto.tink.proto.KeyTemplate keyTemplate;
    private final com.google.crypto.tink.util.Bytes objectIdentifier;

    private ProtoParametersSerialization(com.google.crypto.tink.proto.KeyTemplate keyTemplate, com.google.crypto.tink.util.Bytes bytes) {
        this.keyTemplate = keyTemplate;
        this.objectIdentifier = bytes;
    }

    public static com.google.crypto.tink.internal.ProtoParametersSerialization create(java.lang.String str, com.google.crypto.tink.proto.OutputPrefixType outputPrefixType, com.google.crypto.tink.shaded.protobuf.MessageLite messageLite) {
        return create(com.google.crypto.tink.proto.KeyTemplate.newBuilder().setTypeUrl(str).setOutputPrefixType(outputPrefixType).setValue(messageLite.toByteString()).build());
    }

    public static com.google.crypto.tink.internal.ProtoParametersSerialization create(com.google.crypto.tink.proto.KeyTemplate keyTemplate) {
        return new com.google.crypto.tink.internal.ProtoParametersSerialization(keyTemplate, com.google.crypto.tink.internal.Util.toBytesFromPrintableAscii(keyTemplate.getTypeUrl()));
    }

    public static com.google.crypto.tink.internal.ProtoParametersSerialization checkedCreate(com.google.crypto.tink.proto.KeyTemplate keyTemplate) throws java.security.GeneralSecurityException {
        return new com.google.crypto.tink.internal.ProtoParametersSerialization(keyTemplate, com.google.crypto.tink.internal.Util.checkedToBytesFromPrintableAscii(keyTemplate.getTypeUrl()));
    }

    public final com.google.crypto.tink.proto.KeyTemplate getKeyTemplate() {
        return this.keyTemplate;
    }

    @Override // com.google.crypto.tink.internal.Serialization
    public final com.google.crypto.tink.util.Bytes getObjectIdentifier() {
        return this.objectIdentifier;
    }
}
