package com.google.crypto.tink.aead;

/* loaded from: classes9.dex */
public final class AeadKeyTemplates {
    public static final com.google.crypto.tink.proto.KeyTemplate AES128_GCM = createAesGcmKeyTemplate(16);
    public static final com.google.crypto.tink.proto.KeyTemplate AES256_GCM = createAesGcmKeyTemplate(32);
    public static final com.google.crypto.tink.proto.KeyTemplate AES128_EAX = createAesEaxKeyTemplate(16, 16);
    public static final com.google.crypto.tink.proto.KeyTemplate AES256_EAX = createAesEaxKeyTemplate(32, 16);
    public static final com.google.crypto.tink.proto.KeyTemplate AES128_CTR_HMAC_SHA256 = createAesCtrHmacAeadKeyTemplate(16, 16, 32, 16, com.google.crypto.tink.proto.HashType.SHA256);
    public static final com.google.crypto.tink.proto.KeyTemplate AES256_CTR_HMAC_SHA256 = createAesCtrHmacAeadKeyTemplate(32, 16, 32, 32, com.google.crypto.tink.proto.HashType.SHA256);
    public static final com.google.crypto.tink.proto.KeyTemplate CHACHA20_POLY1305 = com.google.crypto.tink.proto.KeyTemplate.newBuilder().setTypeUrl(com.google.crypto.tink.aead.ChaCha20Poly1305KeyManager.getKeyType()).setOutputPrefixType(com.google.crypto.tink.proto.OutputPrefixType.TINK).build();
    public static final com.google.crypto.tink.proto.KeyTemplate XCHACHA20_POLY1305 = com.google.crypto.tink.proto.KeyTemplate.newBuilder().setTypeUrl(com.google.crypto.tink.aead.XChaCha20Poly1305KeyManager.getKeyType()).setOutputPrefixType(com.google.crypto.tink.proto.OutputPrefixType.TINK).build();

    public static com.google.crypto.tink.proto.KeyTemplate createAesGcmKeyTemplate(int i) {
        return com.google.crypto.tink.proto.KeyTemplate.newBuilder().setValue(com.google.crypto.tink.proto.AesGcmKeyFormat.newBuilder().setKeySize(i).build().toByteString()).setTypeUrl(com.google.crypto.tink.aead.AesGcmKeyManager.getKeyType()).setOutputPrefixType(com.google.crypto.tink.proto.OutputPrefixType.TINK).build();
    }

    public static com.google.crypto.tink.proto.KeyTemplate createAesEaxKeyTemplate(int i, int i2) {
        return com.google.crypto.tink.proto.KeyTemplate.newBuilder().setValue(com.google.crypto.tink.proto.AesEaxKeyFormat.newBuilder().setKeySize(i).setParams(com.google.crypto.tink.proto.AesEaxParams.newBuilder().setIvSize(i2).build()).build().toByteString()).setTypeUrl(com.google.crypto.tink.aead.AesEaxKeyManager.getKeyType()).setOutputPrefixType(com.google.crypto.tink.proto.OutputPrefixType.TINK).build();
    }

    public static com.google.crypto.tink.proto.KeyTemplate createAesCtrHmacAeadKeyTemplate(int i, int i2, int i3, int i4, com.google.crypto.tink.proto.HashType hashType) {
        com.google.crypto.tink.proto.AesCtrKeyFormat build = com.google.crypto.tink.proto.AesCtrKeyFormat.newBuilder().setParams(com.google.crypto.tink.proto.AesCtrParams.newBuilder().setIvSize(i2).build()).setKeySize(i).build();
        return com.google.crypto.tink.proto.KeyTemplate.newBuilder().setValue(com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.newBuilder().setAesCtrKeyFormat(build).setHmacKeyFormat(com.google.crypto.tink.proto.HmacKeyFormat.newBuilder().setParams(com.google.crypto.tink.proto.HmacParams.newBuilder().setHash(hashType).setTagSize(i4).build()).setKeySize(i3).build()).build().toByteString()).setTypeUrl(com.google.crypto.tink.aead.AesCtrHmacAeadKeyManager.getKeyType()).setOutputPrefixType(com.google.crypto.tink.proto.OutputPrefixType.TINK).build();
    }

    public static com.google.crypto.tink.proto.KeyTemplate createKmsEnvelopeAeadKeyTemplate(java.lang.String str, com.google.crypto.tink.proto.KeyTemplate keyTemplate) {
        return com.google.crypto.tink.proto.KeyTemplate.newBuilder().setValue(com.google.crypto.tink.proto.KmsEnvelopeAeadKeyFormat.newBuilder().setDekTemplate(keyTemplate).setKekUri(str).build().toByteString()).setTypeUrl(com.google.crypto.tink.aead.KmsEnvelopeAeadKeyManager.getKeyType()).setOutputPrefixType(com.google.crypto.tink.proto.OutputPrefixType.RAW).build();
    }

    private AeadKeyTemplates() {
    }
}
