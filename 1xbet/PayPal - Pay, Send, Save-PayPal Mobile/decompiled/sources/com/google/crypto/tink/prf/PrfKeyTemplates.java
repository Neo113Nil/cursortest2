package com.google.crypto.tink.prf;

@java.lang.Deprecated
/* loaded from: classes9.dex */
public final class PrfKeyTemplates {
    public static final com.google.crypto.tink.proto.KeyTemplate HKDF_SHA256 = createHkdfKeyTemplate();
    public static final com.google.crypto.tink.proto.KeyTemplate HMAC_SHA256_PRF = createHmacTemplate(32, com.google.crypto.tink.proto.HashType.SHA256);
    public static final com.google.crypto.tink.proto.KeyTemplate HMAC_SHA512_PRF = createHmacTemplate(64, com.google.crypto.tink.proto.HashType.SHA512);
    public static final com.google.crypto.tink.proto.KeyTemplate AES_CMAC_PRF = createAes256CmacTemplate();

    private PrfKeyTemplates() {
    }

    private static com.google.crypto.tink.proto.KeyTemplate createHkdfKeyTemplate() {
        return com.google.crypto.tink.proto.KeyTemplate.newBuilder().setValue(com.google.crypto.tink.proto.HkdfPrfKeyFormat.newBuilder().setKeySize(32).setParams(com.google.crypto.tink.proto.HkdfPrfParams.newBuilder().setHash(com.google.crypto.tink.proto.HashType.SHA256)).build().toByteString()).setTypeUrl(com.google.crypto.tink.prf.HkdfPrfKeyManager.staticKeyType()).setOutputPrefixType(com.google.crypto.tink.proto.OutputPrefixType.RAW).build();
    }

    private static com.google.crypto.tink.proto.KeyTemplate createHmacTemplate(int i, com.google.crypto.tink.proto.HashType hashType) {
        return com.google.crypto.tink.proto.KeyTemplate.newBuilder().setTypeUrl(com.google.crypto.tink.prf.HmacPrfKeyManager.getKeyType()).setValue(com.google.crypto.tink.proto.HmacPrfKeyFormat.newBuilder().setParams(com.google.crypto.tink.proto.HmacPrfParams.newBuilder().setHash(hashType).build()).setKeySize(i).build().toByteString()).setOutputPrefixType(com.google.crypto.tink.proto.OutputPrefixType.RAW).build();
    }

    private static com.google.crypto.tink.proto.KeyTemplate createAes256CmacTemplate() {
        return com.google.crypto.tink.proto.KeyTemplate.newBuilder().setTypeUrl(com.google.crypto.tink.prf.AesCmacPrfKeyManager.getKeyType()).setValue(com.google.crypto.tink.proto.AesCmacPrfKeyFormat.newBuilder().setKeySize(32).build().toByteString()).setOutputPrefixType(com.google.crypto.tink.proto.OutputPrefixType.RAW).build();
    }
}
