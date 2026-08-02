package com.google.crypto.tink;

@java.lang.Deprecated
/* loaded from: classes9.dex */
public final class NoSecretKeysetHandle {
    @java.lang.Deprecated
    public static final com.google.crypto.tink.KeysetHandle parseFrom(byte[] bArr) throws java.security.GeneralSecurityException {
        try {
            com.google.crypto.tink.proto.Keyset parseFrom = com.google.crypto.tink.proto.Keyset.parseFrom(bArr, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry());
            validate(parseFrom);
            return com.google.crypto.tink.KeysetHandle.fromKeyset(parseFrom);
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException unused) {
            throw new java.security.GeneralSecurityException("invalid keyset");
        }
    }

    public static final com.google.crypto.tink.KeysetHandle read(com.google.crypto.tink.KeysetReader keysetReader) throws java.security.GeneralSecurityException, java.io.IOException {
        com.google.crypto.tink.proto.Keyset read = keysetReader.read();
        validate(read);
        return com.google.crypto.tink.KeysetHandle.fromKeyset(read);
    }

    private static void validate(com.google.crypto.tink.proto.Keyset keyset) throws java.security.GeneralSecurityException {
        for (com.google.crypto.tink.proto.Keyset.Key key : keyset.getKeyList()) {
            if (key.getKeyData().getKeyMaterialType() == com.google.crypto.tink.proto.KeyData.KeyMaterialType.UNKNOWN_KEYMATERIAL || key.getKeyData().getKeyMaterialType() == com.google.crypto.tink.proto.KeyData.KeyMaterialType.SYMMETRIC || key.getKeyData().getKeyMaterialType() == com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE) {
                throw new java.security.GeneralSecurityException("keyset contains secret key material");
            }
        }
    }

    private NoSecretKeysetHandle() {
    }
}
