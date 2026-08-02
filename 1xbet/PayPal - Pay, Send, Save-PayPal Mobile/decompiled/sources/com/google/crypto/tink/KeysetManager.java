package com.google.crypto.tink;

/* loaded from: classes4.dex */
public final class KeysetManager {
    private final com.google.crypto.tink.proto.Keyset.Builder keysetBuilder;

    private KeysetManager(com.google.crypto.tink.proto.Keyset.Builder builder) {
        this.keysetBuilder = builder;
    }

    public static com.google.crypto.tink.KeysetManager withKeysetHandle(com.google.crypto.tink.KeysetHandle keysetHandle) {
        return new com.google.crypto.tink.KeysetManager(keysetHandle.getKeyset().toBuilder());
    }

    public static com.google.crypto.tink.KeysetManager withEmptyKeyset() {
        return new com.google.crypto.tink.KeysetManager(com.google.crypto.tink.proto.Keyset.newBuilder());
    }

    public final com.google.crypto.tink.KeysetHandle getKeysetHandle() throws java.security.GeneralSecurityException {
        com.google.crypto.tink.KeysetHandle fromKeyset;
        synchronized (this) {
            fromKeyset = com.google.crypto.tink.KeysetHandle.fromKeyset(this.keysetBuilder.build());
        }
        return fromKeyset;
    }

    public final com.google.crypto.tink.KeysetManager rotate(com.google.crypto.tink.proto.KeyTemplate keyTemplate) throws java.security.GeneralSecurityException {
        synchronized (this) {
            addNewKey(keyTemplate, true);
        }
        return this;
    }

    public final com.google.crypto.tink.KeysetManager add(com.google.crypto.tink.proto.KeyTemplate keyTemplate) throws java.security.GeneralSecurityException {
        synchronized (this) {
            addNewKey(keyTemplate, false);
        }
        return this;
    }

    public final com.google.crypto.tink.KeysetManager add(com.google.crypto.tink.KeyTemplate keyTemplate) throws java.security.GeneralSecurityException {
        synchronized (this) {
            addNewKey(keyTemplate.getProtoMaybeThrow(), false);
        }
        return this;
    }

    @java.lang.Deprecated
    public final com.google.crypto.tink.KeysetManager add(com.google.crypto.tink.tinkkey.KeyHandle keyHandle) throws java.security.GeneralSecurityException {
        synchronized (this) {
            try {
                try {
                    com.google.crypto.tink.tinkkey.internal.ProtoKey protoKey = (com.google.crypto.tink.tinkkey.internal.ProtoKey) keyHandle.getKey(com.google.crypto.tink.tinkkey.SecretKeyAccess.insecureSecretAccess());
                    if (keyIdExists(keyHandle.getId())) {
                        throw new java.security.GeneralSecurityException("Trying to add a key with an ID already contained in the keyset.");
                    }
                    this.keysetBuilder.addKey(com.google.crypto.tink.proto.Keyset.Key.newBuilder().setKeyData(protoKey.getProtoKey()).setKeyId(keyHandle.getId()).setStatus(com.google.crypto.tink.internal.KeyStatusTypeProtoConverter.toProto(keyHandle.getStatus())).setOutputPrefixType(com.google.crypto.tink.KeyTemplate.toProto(protoKey.getOutputPrefixType())).build());
                } catch (java.lang.ClassCastException e) {
                    throw new java.lang.UnsupportedOperationException("KeyHandles which contain TinkKeys that are not ProtoKeys are not yet supported.", e);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return this;
    }

    @java.lang.Deprecated
    public final com.google.crypto.tink.KeysetManager add(com.google.crypto.tink.tinkkey.KeyHandle keyHandle, com.google.crypto.tink.tinkkey.KeyAccess keyAccess) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.KeysetManager add;
        synchronized (this) {
            add = add(keyHandle);
        }
        return add;
    }

    public final int addNewKey(com.google.crypto.tink.proto.KeyTemplate keyTemplate, boolean z) throws java.security.GeneralSecurityException {
        int keyId;
        synchronized (this) {
            com.google.crypto.tink.proto.Keyset.Key newKey = newKey(keyTemplate);
            this.keysetBuilder.addKey(newKey);
            if (z) {
                this.keysetBuilder.setPrimaryKeyId(newKey.getKeyId());
            }
            keyId = newKey.getKeyId();
        }
        return keyId;
    }

    public final com.google.crypto.tink.KeysetManager setPrimary(int i) throws java.security.GeneralSecurityException {
        synchronized (this) {
            for (int i2 = 0; i2 < this.keysetBuilder.getKeyCount(); i2++) {
                com.google.crypto.tink.proto.Keyset.Key key = this.keysetBuilder.getKey(i2);
                if (key.getKeyId() == i) {
                    if (!key.getStatus().equals(com.google.crypto.tink.proto.KeyStatusType.ENABLED)) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append("cannot set key as primary because it's not enabled: ");
                        sb.append(i);
                        throw new java.security.GeneralSecurityException(sb.toString());
                    }
                    this.keysetBuilder.setPrimaryKeyId(i);
                }
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append("key not found: ");
            sb2.append(i);
            throw new java.security.GeneralSecurityException(sb2.toString());
        }
        return this;
    }

    public final com.google.crypto.tink.KeysetManager promote(int i) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.KeysetManager primary;
        synchronized (this) {
            primary = setPrimary(i);
        }
        return primary;
    }

    public final com.google.crypto.tink.KeysetManager enable(int i) throws java.security.GeneralSecurityException {
        synchronized (this) {
            for (int i2 = 0; i2 < this.keysetBuilder.getKeyCount(); i2++) {
                com.google.crypto.tink.proto.Keyset.Key key = this.keysetBuilder.getKey(i2);
                if (key.getKeyId() == i) {
                    if (key.getStatus() != com.google.crypto.tink.proto.KeyStatusType.ENABLED && key.getStatus() != com.google.crypto.tink.proto.KeyStatusType.DISABLED) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append("cannot enable key with id ");
                        sb.append(i);
                        throw new java.security.GeneralSecurityException(sb.toString());
                    }
                    this.keysetBuilder.setKey(i2, key.toBuilder().setStatus(com.google.crypto.tink.proto.KeyStatusType.ENABLED).build());
                }
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append("key not found: ");
            sb2.append(i);
            throw new java.security.GeneralSecurityException(sb2.toString());
        }
        return this;
    }

    public final com.google.crypto.tink.KeysetManager disable(int i) throws java.security.GeneralSecurityException {
        synchronized (this) {
            if (i == this.keysetBuilder.getPrimaryKeyId()) {
                throw new java.security.GeneralSecurityException("cannot disable the primary key");
            }
            for (int i2 = 0; i2 < this.keysetBuilder.getKeyCount(); i2++) {
                com.google.crypto.tink.proto.Keyset.Key key = this.keysetBuilder.getKey(i2);
                if (key.getKeyId() == i) {
                    if (key.getStatus() != com.google.crypto.tink.proto.KeyStatusType.ENABLED && key.getStatus() != com.google.crypto.tink.proto.KeyStatusType.DISABLED) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append("cannot disable key with id ");
                        sb.append(i);
                        throw new java.security.GeneralSecurityException(sb.toString());
                    }
                    this.keysetBuilder.setKey(i2, key.toBuilder().setStatus(com.google.crypto.tink.proto.KeyStatusType.DISABLED).build());
                }
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append("key not found: ");
            sb2.append(i);
            throw new java.security.GeneralSecurityException(sb2.toString());
        }
        return this;
    }

    public final com.google.crypto.tink.KeysetManager delete(int i) throws java.security.GeneralSecurityException {
        synchronized (this) {
            if (i == this.keysetBuilder.getPrimaryKeyId()) {
                throw new java.security.GeneralSecurityException("cannot delete the primary key");
            }
            for (int i2 = 0; i2 < this.keysetBuilder.getKeyCount(); i2++) {
                if (this.keysetBuilder.getKey(i2).getKeyId() == i) {
                    this.keysetBuilder.removeKey(i2);
                }
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("key not found: ");
            sb.append(i);
            throw new java.security.GeneralSecurityException(sb.toString());
        }
        return this;
    }

    public final com.google.crypto.tink.KeysetManager destroy(int i) throws java.security.GeneralSecurityException {
        synchronized (this) {
            if (i == this.keysetBuilder.getPrimaryKeyId()) {
                throw new java.security.GeneralSecurityException("cannot destroy the primary key");
            }
            for (int i2 = 0; i2 < this.keysetBuilder.getKeyCount(); i2++) {
                com.google.crypto.tink.proto.Keyset.Key key = this.keysetBuilder.getKey(i2);
                if (key.getKeyId() == i) {
                    if (key.getStatus() != com.google.crypto.tink.proto.KeyStatusType.ENABLED && key.getStatus() != com.google.crypto.tink.proto.KeyStatusType.DISABLED && key.getStatus() != com.google.crypto.tink.proto.KeyStatusType.DESTROYED) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append("cannot destroy key with id ");
                        sb.append(i);
                        throw new java.security.GeneralSecurityException(sb.toString());
                    }
                    this.keysetBuilder.setKey(i2, key.toBuilder().setStatus(com.google.crypto.tink.proto.KeyStatusType.DESTROYED).clearKeyData().build());
                }
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append("key not found: ");
            sb2.append(i);
            throw new java.security.GeneralSecurityException(sb2.toString());
        }
        return this;
    }

    private com.google.crypto.tink.proto.Keyset.Key newKey(com.google.crypto.tink.proto.KeyTemplate keyTemplate) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.proto.Keyset.Key createKeysetKey;
        synchronized (this) {
            createKeysetKey = createKeysetKey(com.google.crypto.tink.Registry.newKeyData(keyTemplate), keyTemplate.getOutputPrefixType());
        }
        return createKeysetKey;
    }

    private com.google.crypto.tink.proto.Keyset.Key createKeysetKey(com.google.crypto.tink.proto.KeyData keyData, com.google.crypto.tink.proto.OutputPrefixType outputPrefixType) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.proto.Keyset.Key build;
        synchronized (this) {
            int newKeyId = newKeyId();
            if (outputPrefixType == com.google.crypto.tink.proto.OutputPrefixType.UNKNOWN_PREFIX) {
                throw new java.security.GeneralSecurityException("unknown output prefix type");
            }
            build = com.google.crypto.tink.proto.Keyset.Key.newBuilder().setKeyData(keyData).setKeyId(newKeyId).setStatus(com.google.crypto.tink.proto.KeyStatusType.ENABLED).setOutputPrefixType(outputPrefixType).build();
        }
        return build;
    }

    private boolean keyIdExists(int i) {
        synchronized (this) {
            java.util.Iterator<com.google.crypto.tink.proto.Keyset.Key> it = this.keysetBuilder.getKeyList().iterator();
            while (it.hasNext()) {
                if (it.next().getKeyId() == i) {
                    return true;
                }
            }
            return false;
        }
    }

    private int newKeyId() {
        int randKeyId;
        synchronized (this) {
            randKeyId = com.google.crypto.tink.internal.Util.randKeyId();
            while (keyIdExists(randKeyId)) {
                randKeyId = com.google.crypto.tink.internal.Util.randKeyId();
            }
        }
        return randKeyId;
    }
}
