package org.bouncycastle.openssl.jcajce;

/* loaded from: classes17.dex */
public class JcePEMDecryptorProviderBuilder {
    private org.bouncycastle.jcajce.util.JcaJceHelper getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.jcajce.util.DefaultJcaJceHelper();

    public org.bouncycastle.openssl.jcajce.JcePEMDecryptorProviderBuilder setProvider(java.security.Provider provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.jcajce.util.ProviderJcaJceHelper(provider);
        return this;
    }

    public org.bouncycastle.openssl.jcajce.JcePEMDecryptorProviderBuilder setProvider(java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.jcajce.util.NamedJcaJceHelper(str);
        return this;
    }

    public org.bouncycastle.openssl.PEMDecryptorProvider build(final char[] cArr) {
        return new org.bouncycastle.openssl.PEMDecryptorProvider() { // from class: org.bouncycastle.openssl.jcajce.JcePEMDecryptorProviderBuilder.1
            @Override // org.bouncycastle.openssl.PEMDecryptorProvider
            public org.bouncycastle.openssl.PEMDecryptor get(final java.lang.String str) {
                return new org.bouncycastle.openssl.PEMDecryptor() { // from class: org.bouncycastle.openssl.jcajce.JcePEMDecryptorProviderBuilder.1.1
                    @Override // org.bouncycastle.openssl.PEMDecryptor
                    public byte[] decrypt(byte[] bArr, byte[] bArr2) throws org.bouncycastle.openssl.PEMException {
                        if (cArr != null) {
                            return org.bouncycastle.openssl.jcajce.PEMUtilities.getHighSpeedVideoFpsRangesFor(false, org.bouncycastle.openssl.jcajce.JcePEMDecryptorProviderBuilder.this.getHighResolutionOutputSizeshNQ4ISI, bArr, cArr, str, bArr2);
                        }
                        throw new org.bouncycastle.openssl.PasswordException("Password is null, but a password is required");
                    }
                };
            }
        };
    }
}
