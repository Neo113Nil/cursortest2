package com.google.crypto.tink.keyderivation;

/* loaded from: classes9.dex */
public final class KeyDerivationConfig {
    public static void register() throws java.security.GeneralSecurityException {
        com.google.crypto.tink.keyderivation.internal.KeysetDeriverWrapper.register();
        if (com.google.crypto.tink.config.TinkFips.useOnlyFips()) {
            return;
        }
        com.google.crypto.tink.prf.HkdfPrfKeyManager.register(true);
        com.google.crypto.tink.keyderivation.internal.PrfBasedDeriverKeyManager.register(true);
    }

    private KeyDerivationConfig() {
    }
}
