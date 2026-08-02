package com.google.crypto.tink.aead;

/* loaded from: classes4.dex */
public final class KmsEnvelopeAead implements com.google.crypto.tink.Aead {
    private static final int LENGTH_ENCRYPTED_DEK = 4;
    private static final int MAX_LENGTH_ENCRYPTED_DEK = 4096;
    private final com.google.crypto.tink.Parameters parametersForNewKeys;
    private final com.google.crypto.tink.Aead remote;
    private final java.lang.String typeUrlForParsing;
    private static final byte[] EMPTY_AAD = new byte[0];
    private static final java.util.Set<java.lang.String> supportedDekKeyTypes = listSupportedDekKeyTypes();

    private static java.util.Set<java.lang.String> listSupportedDekKeyTypes() {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        return java.util.Collections.unmodifiableSet(hashSet);
    }

    public static boolean isSupportedDekKeyType(java.lang.String str) {
        return supportedDekKeyTypes.contains(str);
    }

    private com.google.crypto.tink.Parameters getRawParameters(com.google.crypto.tink.proto.KeyTemplate keyTemplate) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.TinkProtoParametersFormat.parse(com.google.crypto.tink.proto.KeyTemplate.newBuilder(keyTemplate).setOutputPrefixType(com.google.crypto.tink.proto.OutputPrefixType.RAW).build().toByteArray());
    }

    @java.lang.Deprecated
    public KmsEnvelopeAead(com.google.crypto.tink.proto.KeyTemplate keyTemplate, com.google.crypto.tink.Aead aead) throws java.security.GeneralSecurityException {
        if (!isSupportedDekKeyType(keyTemplate.getTypeUrl())) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported DEK key type: ");
            sb.append(keyTemplate.getTypeUrl());
            sb.append(". Only Tink AEAD key types are supported.");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        this.typeUrlForParsing = keyTemplate.getTypeUrl();
        this.parametersForNewKeys = getRawParameters(keyTemplate);
        this.remote = aead;
    }

    public static com.google.crypto.tink.Aead create(com.google.crypto.tink.aead.AeadParameters aeadParameters, com.google.crypto.tink.Aead aead) throws java.security.GeneralSecurityException {
        try {
            return new com.google.crypto.tink.aead.KmsEnvelopeAead(com.google.crypto.tink.proto.KeyTemplate.parseFrom(com.google.crypto.tink.TinkProtoParametersFormat.serialize(aeadParameters), com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()), aead);
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException e) {
            throw new java.security.GeneralSecurityException(e);
        }
    }

    @Override // com.google.crypto.tink.Aead
    public final byte[] encrypt(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.Key createKey = com.google.crypto.tink.internal.MutableKeyCreationRegistry.globalInstance().createKey(this.parametersForNewKeys, null);
        byte[] encrypt = this.remote.encrypt(((com.google.crypto.tink.internal.ProtoKeySerialization) com.google.crypto.tink.internal.MutableSerializationRegistry.globalInstance().serializeKey(createKey, com.google.crypto.tink.internal.ProtoKeySerialization.class, com.google.crypto.tink.InsecureSecretKeyAccess.get())).getValue().toByteArray(), EMPTY_AAD);
        if (encrypt.length > 4096) {
            throw new java.security.GeneralSecurityException("length of encrypted DEK too large");
        }
        return buildCiphertext(encrypt, ((com.google.crypto.tink.Aead) com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().getPrimitive(createKey, com.google.crypto.tink.Aead.class)).encrypt(bArr, bArr2));
    }

    @Override // com.google.crypto.tink.Aead
    public final byte[] decrypt(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        try {
            java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
            int i = wrap.getInt();
            if (i <= 0 || i > 4096 || i > bArr.length - 4) {
                throw new java.security.GeneralSecurityException("length of encrypted DEK too large");
            }
            byte[] bArr3 = new byte[i];
            wrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            return ((com.google.crypto.tink.Aead) com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().getPrimitive(com.google.crypto.tink.internal.MutableSerializationRegistry.globalInstance().parseKey(com.google.crypto.tink.internal.ProtoKeySerialization.create(this.typeUrlForParsing, com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(this.remote.decrypt(bArr3, EMPTY_AAD)), com.google.crypto.tink.proto.KeyData.KeyMaterialType.SYMMETRIC, com.google.crypto.tink.proto.OutputPrefixType.RAW, null), com.google.crypto.tink.InsecureSecretKeyAccess.get()), com.google.crypto.tink.Aead.class)).decrypt(bArr4, bArr2);
        } catch (java.lang.IndexOutOfBoundsException | java.lang.NegativeArraySizeException | java.nio.BufferUnderflowException e) {
            throw new java.security.GeneralSecurityException("invalid ciphertext", e);
        }
    }

    private byte[] buildCiphertext(byte[] bArr, byte[] bArr2) {
        return java.nio.ByteBuffer.allocate(bArr.length + 4 + bArr2.length).putInt(bArr.length).put(bArr).put(bArr2).array();
    }
}
