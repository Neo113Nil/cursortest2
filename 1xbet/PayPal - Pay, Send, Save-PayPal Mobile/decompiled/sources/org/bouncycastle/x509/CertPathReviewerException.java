package org.bouncycastle.x509;

/* loaded from: classes17.dex */
public class CertPathReviewerException extends org.bouncycastle.i18n.LocalizedException {
    private int Camera2StreamConfigurationMap;
    private java.security.cert.CertPath getHighResolutionOutputSizeshNQ4ISI;

    public int getIndex() {
        return this.Camera2StreamConfigurationMap;
    }

    public java.security.cert.CertPath getCertPath() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public CertPathReviewerException(org.bouncycastle.i18n.ErrorBundle errorBundle, java.security.cert.CertPath certPath, int i) {
        super(errorBundle);
        this.Camera2StreamConfigurationMap = -1;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        if (certPath == null || i == -1) {
            throw new java.lang.IllegalArgumentException();
        }
        if (i < -1 || i >= certPath.getCertificates().size()) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        this.getHighResolutionOutputSizeshNQ4ISI = certPath;
        this.Camera2StreamConfigurationMap = i;
    }

    public CertPathReviewerException(org.bouncycastle.i18n.ErrorBundle errorBundle, java.lang.Throwable th, java.security.cert.CertPath certPath, int i) {
        super(errorBundle, th);
        this.Camera2StreamConfigurationMap = -1;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        if (certPath == null || i == -1) {
            throw new java.lang.IllegalArgumentException();
        }
        if (i < -1 || i >= certPath.getCertificates().size()) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        this.getHighResolutionOutputSizeshNQ4ISI = certPath;
        this.Camera2StreamConfigurationMap = i;
    }

    public CertPathReviewerException(org.bouncycastle.i18n.ErrorBundle errorBundle, java.lang.Throwable th) {
        super(errorBundle, th);
        this.Camera2StreamConfigurationMap = -1;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
    }

    public CertPathReviewerException(org.bouncycastle.i18n.ErrorBundle errorBundle) {
        super(errorBundle);
        this.Camera2StreamConfigurationMap = -1;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
    }
}
