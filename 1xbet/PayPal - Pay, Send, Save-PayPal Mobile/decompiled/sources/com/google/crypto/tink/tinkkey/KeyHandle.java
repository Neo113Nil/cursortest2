package com.google.crypto.tink.tinkkey;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public class KeyHandle {
    private final int id;
    private final com.google.crypto.tink.tinkkey.TinkKey key;
    private final com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType status;

    public enum KeyStatusType {
        ENABLED,
        DISABLED,
        DESTROYED
    }

    private static com.google.crypto.tink.proto.KeyData newKeyData(com.google.crypto.tink.KeyTemplate keyTemplate) throws java.security.GeneralSecurityException {
        try {
            com.google.crypto.tink.proto.KeyTemplate parseFrom = com.google.crypto.tink.proto.KeyTemplate.parseFrom(com.google.crypto.tink.TinkProtoParametersFormat.serialize(keyTemplate.toParameters()), com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry());
            com.google.crypto.tink.KeyManager<?> untypedKeyManager = com.google.crypto.tink.internal.KeyManagerRegistry.globalInstance().getUntypedKeyManager(parseFrom.getTypeUrl());
            if (com.google.crypto.tink.internal.KeyManagerRegistry.globalInstance().isNewKeyAllowed(parseFrom.getTypeUrl())) {
                return untypedKeyManager.newKeyData(parseFrom.getValue());
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("newKey-operation not permitted for key type ");
            sb.append(parseFrom.getTypeUrl());
            throw new java.security.GeneralSecurityException(sb.toString());
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException e) {
            throw new java.security.GeneralSecurityException("Failed to parse serialized parameters", e);
        }
    }

    public static com.google.crypto.tink.tinkkey.KeyHandle createFromKey(com.google.crypto.tink.tinkkey.TinkKey tinkKey, com.google.crypto.tink.tinkkey.KeyAccess keyAccess) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.tinkkey.KeyHandle keyHandle = new com.google.crypto.tink.tinkkey.KeyHandle(tinkKey);
        keyHandle.checkAccess(keyAccess);
        return keyHandle;
    }

    public static com.google.crypto.tink.tinkkey.KeyHandle createFromKey(com.google.crypto.tink.proto.KeyData keyData, com.google.crypto.tink.KeyTemplate.OutputPrefixType outputPrefixType) {
        return new com.google.crypto.tink.tinkkey.KeyHandle(new com.google.crypto.tink.tinkkey.internal.ProtoKey(keyData, outputPrefixType));
    }

    private KeyHandle(com.google.crypto.tink.tinkkey.TinkKey tinkKey) {
        this.key = tinkKey;
        this.status = com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType.ENABLED;
        this.id = com.google.crypto.tink.internal.Util.randKeyId();
    }

    public KeyHandle(com.google.crypto.tink.tinkkey.TinkKey tinkKey, com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType keyStatusType, int i) {
        this.key = tinkKey;
        this.status = keyStatusType;
        this.id = i;
    }

    public static com.google.crypto.tink.tinkkey.KeyHandle generateNew(com.google.crypto.tink.KeyTemplate keyTemplate) throws java.security.GeneralSecurityException {
        return new com.google.crypto.tink.tinkkey.KeyHandle(new com.google.crypto.tink.tinkkey.internal.ProtoKey(newKeyData(keyTemplate), com.google.crypto.tink.internal.KeyTemplateProtoConverter.getOutputPrefixType(keyTemplate)));
    }

    public boolean hasSecret() {
        return this.key.hasSecret();
    }

    public com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType getStatus() {
        return this.status;
    }

    public int getId() {
        return this.id;
    }

    public com.google.crypto.tink.tinkkey.TinkKey getKey(com.google.crypto.tink.tinkkey.KeyAccess keyAccess) throws java.security.GeneralSecurityException {
        checkAccess(keyAccess);
        return this.key;
    }

    public com.google.crypto.tink.KeyTemplate getKeyTemplate() {
        return this.key.getKeyTemplate();
    }

    private void checkAccess(com.google.crypto.tink.tinkkey.KeyAccess keyAccess) throws java.security.GeneralSecurityException {
        if (hasSecret() && !keyAccess.canAccessSecret()) {
            throw new java.security.GeneralSecurityException("No access");
        }
    }
}
