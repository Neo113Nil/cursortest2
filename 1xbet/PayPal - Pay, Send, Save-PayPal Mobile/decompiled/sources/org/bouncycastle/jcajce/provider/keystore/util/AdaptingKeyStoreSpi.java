package org.bouncycastle.jcajce.provider.keystore.util;

/* loaded from: classes17.dex */
public class AdaptingKeyStoreSpi extends java.security.KeyStoreSpi {
    public static final java.lang.String COMPAT_OVERRIDE = "keystore.type.compat";
    private final java.security.KeyStoreSpi getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.jcajce.provider.keystore.util.JKSKeyStoreSpi getHighSpeedVideoFpsRangesFor;
    private java.security.KeyStoreSpi getHighSpeedVideoSizes;

    @Override // java.security.KeyStoreSpi
    public void engineStore(java.security.KeyStore.LoadStoreParameter loadStoreParameter) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException {
        this.getHighSpeedVideoSizes.engineStore(loadStoreParameter);
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(java.io.OutputStream outputStream, char[] cArr) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException {
        this.getHighSpeedVideoSizes.engineStore(outputStream, cArr);
    }

    @Override // java.security.KeyStoreSpi
    public int engineSize() {
        return this.getHighSpeedVideoSizes.engineSize();
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(java.lang.String str, byte[] bArr, java.security.cert.Certificate[] certificateArr) throws java.security.KeyStoreException {
        this.getHighSpeedVideoSizes.engineSetKeyEntry(str, bArr, certificateArr);
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(java.lang.String str, java.security.Key key, char[] cArr, java.security.cert.Certificate[] certificateArr) throws java.security.KeyStoreException {
        this.getHighSpeedVideoSizes.engineSetKeyEntry(str, key, cArr, certificateArr);
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetCertificateEntry(java.lang.String str, java.security.cert.Certificate certificate) throws java.security.KeyStoreException {
        this.getHighSpeedVideoSizes.engineSetCertificateEntry(str, certificate);
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineProbe(java.io.InputStream inputStream) throws java.io.IOException {
        java.security.KeyStoreSpi keyStoreSpi = this.getHighSpeedVideoSizes;
        if (keyStoreSpi instanceof org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi) {
            return ((org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi) keyStoreSpi).engineProbe(inputStream);
        }
        return false;
    }

    @Override // java.security.KeyStoreSpi
    public void engineLoad(java.security.KeyStore.LoadStoreParameter loadStoreParameter) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException {
        this.getHighSpeedVideoSizes.engineLoad(loadStoreParameter);
    }

    @Override // java.security.KeyStoreSpi
    public void engineLoad(java.io.InputStream inputStream, char[] cArr) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException {
        if (inputStream == null) {
            java.security.KeyStoreSpi keyStoreSpi = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoSizes = keyStoreSpi;
            keyStoreSpi.engineLoad(null, cArr);
            return;
        }
        if (!org.bouncycastle.util.Properties.isOverrideSet(COMPAT_OVERRIDE)) {
            java.security.KeyStoreSpi keyStoreSpi2 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (keyStoreSpi2 instanceof org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi) {
                this.getHighSpeedVideoSizes = keyStoreSpi2;
                this.getHighSpeedVideoSizes.engineLoad(inputStream, cArr);
            }
        }
        if (!inputStream.markSupported()) {
            inputStream = new java.io.BufferedInputStream(inputStream);
        }
        inputStream.mark(8);
        this.getHighSpeedVideoSizes = this.getHighSpeedVideoFpsRangesFor.engineProbe(inputStream) ? this.getHighSpeedVideoFpsRangesFor : this.getHighResolutionOutputSizeshNQ4ISI;
        inputStream.reset();
        this.getHighSpeedVideoSizes.engineLoad(inputStream, cArr);
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsKeyEntry(java.lang.String str) {
        return this.getHighSpeedVideoSizes.engineIsKeyEntry(str);
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsCertificateEntry(java.lang.String str) {
        return this.getHighSpeedVideoSizes.engineIsCertificateEntry(str);
    }

    @Override // java.security.KeyStoreSpi
    public java.security.Key engineGetKey(java.lang.String str, char[] cArr) throws java.security.NoSuchAlgorithmException, java.security.UnrecoverableKeyException {
        return this.getHighSpeedVideoSizes.engineGetKey(str, cArr);
    }

    @Override // java.security.KeyStoreSpi
    public java.util.Date engineGetCreationDate(java.lang.String str) {
        return this.getHighSpeedVideoSizes.engineGetCreationDate(str);
    }

    @Override // java.security.KeyStoreSpi
    public java.security.cert.Certificate[] engineGetCertificateChain(java.lang.String str) {
        return this.getHighSpeedVideoSizes.engineGetCertificateChain(str);
    }

    @Override // java.security.KeyStoreSpi
    public java.lang.String engineGetCertificateAlias(java.security.cert.Certificate certificate) {
        return this.getHighSpeedVideoSizes.engineGetCertificateAlias(certificate);
    }

    @Override // java.security.KeyStoreSpi
    public java.security.cert.Certificate engineGetCertificate(java.lang.String str) {
        return this.getHighSpeedVideoSizes.engineGetCertificate(str);
    }

    @Override // java.security.KeyStoreSpi
    public void engineDeleteEntry(java.lang.String str) throws java.security.KeyStoreException {
        this.getHighSpeedVideoSizes.engineDeleteEntry(str);
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineContainsAlias(java.lang.String str) {
        return this.getHighSpeedVideoSizes.engineContainsAlias(str);
    }

    @Override // java.security.KeyStoreSpi
    public java.util.Enumeration<java.lang.String> engineAliases() {
        return this.getHighSpeedVideoSizes.engineAliases();
    }

    public AdaptingKeyStoreSpi(org.bouncycastle.jcajce.util.JcaJceHelper jcaJceHelper, java.security.KeyStoreSpi keyStoreSpi) {
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.jcajce.provider.keystore.util.JKSKeyStoreSpi(jcaJceHelper);
        this.getHighResolutionOutputSizeshNQ4ISI = keyStoreSpi;
        this.getHighSpeedVideoSizes = keyStoreSpi;
    }
}
