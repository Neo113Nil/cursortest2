package org.bouncycastle.cert.crmf.jcajce;

/* loaded from: classes17.dex */
public class JcePKMACValuesCalculator implements org.bouncycastle.cert.crmf.PKMACValuesCalculator {
    private java.security.MessageDigest Camera2StreamConfigurationMap;
    private org.bouncycastle.cert.crmf.jcajce.CRMFHelper getHighSpeedVideoFpsRanges = new org.bouncycastle.cert.crmf.jcajce.CRMFHelper(new org.bouncycastle.jcajce.util.DefaultJcaJceHelper());
    private javax.crypto.Mac getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.cert.crmf.PKMACValuesCalculator
    public void setup(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2) throws org.bouncycastle.cert.crmf.CRMFException {
        this.Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(algorithmIdentifier.getAlgorithm());
        this.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(algorithmIdentifier2.getAlgorithm());
    }

    public org.bouncycastle.cert.crmf.jcajce.JcePKMACValuesCalculator setProvider(java.security.Provider provider) {
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.cert.crmf.jcajce.CRMFHelper(new org.bouncycastle.jcajce.util.ProviderJcaJceHelper(provider));
        return this;
    }

    public org.bouncycastle.cert.crmf.jcajce.JcePKMACValuesCalculator setProvider(java.lang.String str) {
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.cert.crmf.jcajce.CRMFHelper(new org.bouncycastle.jcajce.util.NamedJcaJceHelper(str));
        return this;
    }

    @Override // org.bouncycastle.cert.crmf.PKMACValuesCalculator
    public byte[] calculateMac(byte[] bArr, byte[] bArr2) throws org.bouncycastle.cert.crmf.CRMFException {
        try {
            this.getHighSpeedVideoFpsRangesFor.init(new javax.crypto.spec.SecretKeySpec(bArr, this.getHighSpeedVideoFpsRangesFor.getAlgorithm()));
            return this.getHighSpeedVideoFpsRangesFor.doFinal(bArr2);
        } catch (java.security.GeneralSecurityException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("failure in setup: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cert.crmf.CRMFException(sb.toString(), e);
        }
    }

    @Override // org.bouncycastle.cert.crmf.PKMACValuesCalculator
    public byte[] calculateDigest(byte[] bArr) {
        return this.Camera2StreamConfigurationMap.digest(bArr);
    }
}
