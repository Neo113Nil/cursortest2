package org.bouncycastle.cert.ocsp;

/* loaded from: classes17.dex */
public class RevokedStatus implements org.bouncycastle.cert.ocsp.CertificateStatus {
    org.bouncycastle.asn1.ocsp.RevokedInfo getHighSpeedVideoFpsRangesFor;

    public boolean hasRevocationReason() {
        return this.getHighSpeedVideoFpsRangesFor.getRevocationReason() != null;
    }

    public java.util.Date getRevocationTime() {
        return org.bouncycastle.cert.ocsp.OCSPUtils.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor.getRevocationTime());
    }

    public int getRevocationReason() {
        if (this.getHighSpeedVideoFpsRangesFor.getRevocationReason() != null) {
            return this.getHighSpeedVideoFpsRangesFor.getRevocationReason().getValue().intValue();
        }
        throw new java.lang.IllegalStateException("attempt to get a reason where none is available");
    }

    public RevokedStatus(org.bouncycastle.asn1.ocsp.RevokedInfo revokedInfo) {
        this.getHighSpeedVideoFpsRangesFor = revokedInfo;
    }

    public RevokedStatus(java.util.Date date, int i) {
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.ocsp.RevokedInfo(new org.bouncycastle.asn1.ASN1GeneralizedTime(date), org.bouncycastle.asn1.x509.CRLReason.lookup(i));
    }
}
