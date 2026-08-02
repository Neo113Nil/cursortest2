package org.bouncycastle.jcajce;

/* loaded from: classes17.dex */
public class PKIXCertRevocationCheckerParameters {
    private final java.security.cert.CertPath Camera2StreamConfigurationMap;
    private final java.util.Date getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.jcajce.PKIXExtendedParameters getHighSpeedVideoFpsRangesFor;
    private final java.security.cert.X509Certificate getHighSpeedVideoSizes;
    private final java.security.PublicKey getInputFormats;

    public java.security.PublicKey getWorkingPublicKey() {
        return this.getInputFormats;
    }

    public java.util.Date getValidDate() {
        return new java.util.Date(this.getHighResolutionOutputSizeshNQ4ISI.getTime());
    }

    public java.security.cert.X509Certificate getSigningCert() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.jcajce.PKIXExtendedParameters getParamsPKIX() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public int getIndex() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public java.security.cert.CertPath getCertPath() {
        return this.Camera2StreamConfigurationMap;
    }

    public PKIXCertRevocationCheckerParameters(org.bouncycastle.jcajce.PKIXExtendedParameters pKIXExtendedParameters, java.util.Date date, java.security.cert.CertPath certPath, int i, java.security.cert.X509Certificate x509Certificate, java.security.PublicKey publicKey) {
        this.getHighSpeedVideoFpsRangesFor = pKIXExtendedParameters;
        this.getHighResolutionOutputSizeshNQ4ISI = date;
        this.Camera2StreamConfigurationMap = certPath;
        this.getHighSpeedVideoFpsRanges = i;
        this.getHighSpeedVideoSizes = x509Certificate;
        this.getInputFormats = publicKey;
    }
}
