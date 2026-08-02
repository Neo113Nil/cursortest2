package com.google.crypto.tink.mac;

@java.lang.Deprecated
/* loaded from: classes9.dex */
public final class MacKeyTemplates {
    public static final com.google.crypto.tink.proto.KeyTemplate HMAC_SHA256_128BITTAG = createHmacKeyTemplate(32, 16, com.google.crypto.tink.proto.HashType.SHA256);
    public static final com.google.crypto.tink.proto.KeyTemplate HMAC_SHA256_256BITTAG = createHmacKeyTemplate(32, 32, com.google.crypto.tink.proto.HashType.SHA256);
    public static final com.google.crypto.tink.proto.KeyTemplate HMAC_SHA512_256BITTAG = createHmacKeyTemplate(64, 32, com.google.crypto.tink.proto.HashType.SHA512);
    public static final com.google.crypto.tink.proto.KeyTemplate HMAC_SHA512_512BITTAG = createHmacKeyTemplate(64, 64, com.google.crypto.tink.proto.HashType.SHA512);
    public static final com.google.crypto.tink.proto.KeyTemplate AES_CMAC = com.google.crypto.tink.proto.KeyTemplate.newBuilder().setValue(com.google.crypto.tink.proto.AesCmacKeyFormat.newBuilder().setKeySize(32).setParams(com.google.crypto.tink.proto.AesCmacParams.newBuilder().setTagSize(16).build()).build().toByteString()).setTypeUrl("type.googleapis.com/google.crypto.tink.AesCmacKey").setOutputPrefixType(com.google.crypto.tink.proto.OutputPrefixType.TINK).build();

    public static com.google.crypto.tink.proto.KeyTemplate createHmacKeyTemplate(int i, int i2, com.google.crypto.tink.proto.HashType hashType) {
        return com.google.crypto.tink.proto.KeyTemplate.newBuilder().setValue(com.google.crypto.tink.proto.HmacKeyFormat.newBuilder().setParams(com.google.crypto.tink.proto.HmacParams.newBuilder().setHash(hashType).setTagSize(i2).build()).setKeySize(i).build().toByteString()).setTypeUrl(com.google.crypto.tink.mac.HmacKeyManager.getKeyType()).setOutputPrefixType(com.google.crypto.tink.proto.OutputPrefixType.TINK).build();
    }

    private MacKeyTemplates() {
    }
}
