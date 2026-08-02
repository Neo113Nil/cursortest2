package org.bouncycastle.openssl.bc;

/* loaded from: classes17.dex */
public class BcPEMDecryptorProvider implements org.bouncycastle.openssl.PEMDecryptorProvider {
    private final char[] getHighSpeedVideoSizes;

    @Override // org.bouncycastle.openssl.PEMDecryptorProvider
    public org.bouncycastle.openssl.PEMDecryptor get(final java.lang.String str) {
        return new org.bouncycastle.openssl.PEMDecryptor() { // from class: org.bouncycastle.openssl.bc.BcPEMDecryptorProvider.1
            @Override // org.bouncycastle.openssl.PEMDecryptor
            public byte[] decrypt(byte[] bArr, byte[] bArr2) throws org.bouncycastle.openssl.PEMException {
                if (org.bouncycastle.openssl.bc.BcPEMDecryptorProvider.this.getHighSpeedVideoSizes != null) {
                    return org.bouncycastle.openssl.bc.PEMUtilities.Camera2StreamConfigurationMap(bArr, org.bouncycastle.openssl.bc.BcPEMDecryptorProvider.this.getHighSpeedVideoSizes, str, bArr2);
                }
                throw new org.bouncycastle.openssl.PasswordException("Password is null, but a password is required");
            }
        };
    }

    public BcPEMDecryptorProvider(char[] cArr) {
        this.getHighSpeedVideoSizes = cArr;
    }
}
