package com.google.crypto.tink.streamingaead;

@java.lang.Deprecated
/* loaded from: classes9.dex */
public final class StreamingAeadKeyTemplates {
    public static final com.google.crypto.tink.proto.KeyTemplate AES128_CTR_HMAC_SHA256_4KB = createAesCtrHmacStreamingKeyTemplate(16, com.google.crypto.tink.proto.HashType.SHA256, 16, com.google.crypto.tink.proto.HashType.SHA256, 32, 4096);
    public static final com.google.crypto.tink.proto.KeyTemplate AES128_CTR_HMAC_SHA256_1MB = createAesCtrHmacStreamingKeyTemplate(16, com.google.crypto.tink.proto.HashType.SHA256, 16, com.google.crypto.tink.proto.HashType.SHA256, 32, 1048576);
    public static final com.google.crypto.tink.proto.KeyTemplate AES256_CTR_HMAC_SHA256_4KB = createAesCtrHmacStreamingKeyTemplate(32, com.google.crypto.tink.proto.HashType.SHA256, 32, com.google.crypto.tink.proto.HashType.SHA256, 32, 4096);
    public static final com.google.crypto.tink.proto.KeyTemplate AES256_CTR_HMAC_SHA256_1MB = createAesCtrHmacStreamingKeyTemplate(32, com.google.crypto.tink.proto.HashType.SHA256, 32, com.google.crypto.tink.proto.HashType.SHA256, 32, 1048576);
    public static final com.google.crypto.tink.proto.KeyTemplate AES128_GCM_HKDF_4KB = createAesGcmHkdfStreamingKeyTemplate(16, com.google.crypto.tink.proto.HashType.SHA256, 16, 4096);
    public static final com.google.crypto.tink.proto.KeyTemplate AES128_GCM_HKDF_1MB = createAesGcmHkdfStreamingKeyTemplate(16, com.google.crypto.tink.proto.HashType.SHA256, 16, 1048576);
    public static final com.google.crypto.tink.proto.KeyTemplate AES256_GCM_HKDF_4KB = createAesGcmHkdfStreamingKeyTemplate(32, com.google.crypto.tink.proto.HashType.SHA256, 32, 4096);
    public static final com.google.crypto.tink.proto.KeyTemplate AES256_GCM_HKDF_1MB = createAesGcmHkdfStreamingKeyTemplate(32, com.google.crypto.tink.proto.HashType.SHA256, 32, 1048576);

    public static com.google.crypto.tink.proto.KeyTemplate createAesCtrHmacStreamingKeyTemplate(int i, com.google.crypto.tink.proto.HashType hashType, int i2, com.google.crypto.tink.proto.HashType hashType2, int i3, int i4) {
        return com.google.crypto.tink.proto.KeyTemplate.newBuilder().setValue(com.google.crypto.tink.proto.AesCtrHmacStreamingKeyFormat.newBuilder().setParams(com.google.crypto.tink.proto.AesCtrHmacStreamingParams.newBuilder().setCiphertextSegmentSize(i4).setDerivedKeySize(i2).setHkdfHashType(hashType).setHmacParams(com.google.crypto.tink.proto.HmacParams.newBuilder().setHash(hashType2).setTagSize(i3).build()).build()).setKeySize(i).build().toByteString()).setTypeUrl(com.google.crypto.tink.streamingaead.AesCtrHmacStreamingKeyManager.getKeyType()).setOutputPrefixType(com.google.crypto.tink.proto.OutputPrefixType.RAW).build();
    }

    public static com.google.crypto.tink.proto.KeyTemplate createAesGcmHkdfStreamingKeyTemplate(int i, com.google.crypto.tink.proto.HashType hashType, int i2, int i3) {
        return com.google.crypto.tink.proto.KeyTemplate.newBuilder().setValue(com.google.crypto.tink.proto.AesGcmHkdfStreamingKeyFormat.newBuilder().setKeySize(i).setParams(com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.newBuilder().setCiphertextSegmentSize(i3).setDerivedKeySize(i2).setHkdfHashType(hashType).build()).build().toByteString()).setTypeUrl(com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingKeyManager.getKeyType()).setOutputPrefixType(com.google.crypto.tink.proto.OutputPrefixType.RAW).build();
    }

    private StreamingAeadKeyTemplates() {
    }
}
