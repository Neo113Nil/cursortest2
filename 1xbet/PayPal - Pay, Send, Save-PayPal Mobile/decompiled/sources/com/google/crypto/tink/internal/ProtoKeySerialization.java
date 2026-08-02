package com.google.crypto.tink.internal;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes4.dex */
public final class ProtoKeySerialization implements com.google.crypto.tink.internal.Serialization {

    @javax.annotation.Nullable
    private final java.lang.Integer idRequirement;
    private final com.google.crypto.tink.proto.KeyData.KeyMaterialType keyMaterialType;
    private final com.google.crypto.tink.util.Bytes objectIdentifier;
    private final com.google.crypto.tink.proto.OutputPrefixType outputPrefixType;
    private final java.lang.String typeUrl;
    private final com.google.crypto.tink.shaded.protobuf.ByteString value;

    private ProtoKeySerialization(java.lang.String str, com.google.crypto.tink.util.Bytes bytes, com.google.crypto.tink.shaded.protobuf.ByteString byteString, com.google.crypto.tink.proto.KeyData.KeyMaterialType keyMaterialType, com.google.crypto.tink.proto.OutputPrefixType outputPrefixType, @javax.annotation.Nullable java.lang.Integer num) {
        this.typeUrl = str;
        this.objectIdentifier = bytes;
        this.value = byteString;
        this.keyMaterialType = keyMaterialType;
        this.outputPrefixType = outputPrefixType;
        this.idRequirement = num;
    }

    public static com.google.crypto.tink.internal.ProtoKeySerialization create(java.lang.String str, com.google.crypto.tink.shaded.protobuf.ByteString byteString, com.google.crypto.tink.proto.KeyData.KeyMaterialType keyMaterialType, com.google.crypto.tink.proto.OutputPrefixType outputPrefixType, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        if (outputPrefixType == com.google.crypto.tink.proto.OutputPrefixType.RAW) {
            if (num != null) {
                throw new java.security.GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new java.security.GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new com.google.crypto.tink.internal.ProtoKeySerialization(str, com.google.crypto.tink.internal.Util.checkedToBytesFromPrintableAscii(str), byteString, keyMaterialType, outputPrefixType, num);
    }

    public final com.google.crypto.tink.shaded.protobuf.ByteString getValue() {
        return this.value;
    }

    public final com.google.crypto.tink.proto.KeyData.KeyMaterialType getKeyMaterialType() {
        return this.keyMaterialType;
    }

    public final com.google.crypto.tink.proto.OutputPrefixType getOutputPrefixType() {
        return this.outputPrefixType;
    }

    @javax.annotation.Nullable
    public final java.lang.Integer getIdRequirementOrNull() {
        return this.idRequirement;
    }

    @Override // com.google.crypto.tink.internal.Serialization
    public final com.google.crypto.tink.util.Bytes getObjectIdentifier() {
        return this.objectIdentifier;
    }

    public final java.lang.String getTypeUrl() {
        return this.typeUrl;
    }
}
