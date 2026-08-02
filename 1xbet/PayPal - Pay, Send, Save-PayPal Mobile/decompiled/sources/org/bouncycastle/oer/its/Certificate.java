package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class Certificate {
    private final org.bouncycastle.oer.its.CertificateBase getHighSpeedVideoFpsRangesFor;

    public static class Builder {
        private org.bouncycastle.oer.its.CertificateBase getHighSpeedVideoSizes;

        public org.bouncycastle.oer.its.Certificate.Builder setCertificateBase(org.bouncycastle.oer.its.CertificateBase certificateBase) {
            this.getHighSpeedVideoSizes = certificateBase;
            return this;
        }

        public org.bouncycastle.oer.its.Certificate createCertificate() {
            return new org.bouncycastle.oer.its.Certificate(this.getHighSpeedVideoSizes);
        }
    }

    public org.bouncycastle.oer.its.CertificateBase getCertificateBase() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static org.bouncycastle.oer.its.Certificate getInstance(java.lang.Object obj) {
        return obj instanceof org.bouncycastle.oer.its.Certificate ? (org.bouncycastle.oer.its.Certificate) obj : new org.bouncycastle.oer.its.Certificate.Builder().setCertificateBase(org.bouncycastle.oer.its.CertificateBase.getInstance(obj)).createCertificate();
    }

    public static org.bouncycastle.oer.its.Certificate.Builder builder() {
        return new org.bouncycastle.oer.its.Certificate.Builder();
    }

    public Certificate(org.bouncycastle.oer.its.CertificateBase certificateBase) {
        this.getHighSpeedVideoFpsRangesFor = certificateBase;
    }
}
