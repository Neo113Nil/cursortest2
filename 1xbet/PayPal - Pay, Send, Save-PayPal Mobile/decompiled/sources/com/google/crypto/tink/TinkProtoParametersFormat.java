package com.google.crypto.tink;

/* loaded from: classes4.dex */
public final class TinkProtoParametersFormat {
    public static byte[] serialize(com.google.crypto.tink.Parameters parameters) throws java.security.GeneralSecurityException {
        if (parameters instanceof com.google.crypto.tink.internal.LegacyProtoParameters) {
            return ((com.google.crypto.tink.internal.LegacyProtoParameters) parameters).getSerialization().getKeyTemplate().toByteArray();
        }
        return ((com.google.crypto.tink.internal.ProtoParametersSerialization) com.google.crypto.tink.internal.MutableSerializationRegistry.globalInstance().serializeParameters(parameters, com.google.crypto.tink.internal.ProtoParametersSerialization.class)).getKeyTemplate().toByteArray();
    }

    public static com.google.crypto.tink.Parameters parse(byte[] bArr) throws java.security.GeneralSecurityException {
        try {
            return com.google.crypto.tink.internal.MutableSerializationRegistry.globalInstance().parseParametersWithLegacyFallback(com.google.crypto.tink.internal.ProtoParametersSerialization.checkedCreate(com.google.crypto.tink.proto.KeyTemplate.parseFrom(bArr, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry())));
        } catch (java.io.IOException e) {
            throw new java.security.GeneralSecurityException("Failed to parse proto", e);
        }
    }

    private TinkProtoParametersFormat() {
    }
}
