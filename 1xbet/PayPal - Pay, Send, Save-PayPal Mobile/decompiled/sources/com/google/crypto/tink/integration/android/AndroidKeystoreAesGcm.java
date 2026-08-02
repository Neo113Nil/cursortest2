package com.google.crypto.tink.integration.android;

/* loaded from: classes4.dex */
public final class AndroidKeystoreAesGcm implements com.google.crypto.tink.Aead {
    private static final int MAX_WAIT_TIME_MILLISECONDS_BEFORE_RETRY = 100;
    private static final java.lang.String TAG = "AndroidKeystoreAesGcm";
    private final com.google.crypto.tink.Aead keystoreAead;

    public AndroidKeystoreAesGcm(java.lang.String str) throws java.security.GeneralSecurityException, java.io.IOException {
        this.keystoreAead = com.google.crypto.tink.integration.android.AndroidKeystore.getAead(str);
    }

    @Override // com.google.crypto.tink.Aead
    public final byte[] encrypt(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        try {
            return this.keystoreAead.encrypt(bArr, bArr2);
        } catch (java.security.GeneralSecurityException | java.security.ProviderException unused) {
            sleepRandomAmount();
            return this.keystoreAead.encrypt(bArr, bArr2);
        }
    }

    @Override // com.google.crypto.tink.Aead
    public final byte[] decrypt(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        try {
            return this.keystoreAead.decrypt(bArr, bArr2);
        } catch (javax.crypto.BadPaddingException e) {
            throw e;
        } catch (java.security.GeneralSecurityException | java.security.ProviderException unused) {
            sleepRandomAmount();
            return this.keystoreAead.decrypt(bArr, bArr2);
        }
    }

    private static void sleepRandomAmount() {
        try {
            java.lang.Thread.sleep((int) (java.lang.Math.random() * 100.0d));
        } catch (java.lang.InterruptedException unused) {
        }
    }
}
