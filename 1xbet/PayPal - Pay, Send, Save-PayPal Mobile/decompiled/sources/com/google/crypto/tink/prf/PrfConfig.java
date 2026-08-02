package com.google.crypto.tink.prf;

/* loaded from: classes9.dex */
public final class PrfConfig {
    public static final java.lang.String PRF_TYPE_URL = com.google.crypto.tink.prf.HkdfPrfKeyManager.getKeyType();
    public static final java.lang.String HMAC_PRF_TYPE_URL = com.google.crypto.tink.prf.HmacPrfKeyManager.getKeyType();

    public static void register() throws java.security.GeneralSecurityException {
        com.google.crypto.tink.prf.PrfSetWrapper.register();
        com.google.crypto.tink.prf.HmacPrfKeyManager.register(true);
        if (com.google.crypto.tink.config.TinkFips.useOnlyFips()) {
            return;
        }
        com.google.crypto.tink.prf.AesCmacPrfKeyManager.register(true);
        com.google.crypto.tink.prf.HkdfPrfKeyManager.register(true);
    }

    private PrfConfig() {
    }
}
