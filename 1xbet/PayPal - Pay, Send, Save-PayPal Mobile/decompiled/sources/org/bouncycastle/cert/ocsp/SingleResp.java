package org.bouncycastle.cert.ocsp;

/* loaded from: classes17.dex */
public class SingleResp {
    private org.bouncycastle.asn1.x509.Extensions Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.ocsp.SingleResponse getHighSpeedVideoFpsRanges;

    public boolean hasExtensions() {
        return this.Camera2StreamConfigurationMap != null;
    }

    public java.util.Date getThisUpdate() {
        return org.bouncycastle.cert.ocsp.OCSPUtils.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges.getThisUpdate());
    }

    public java.util.Set getNonCriticalExtensionOIDs() {
        return org.bouncycastle.cert.ocsp.OCSPUtils.Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap);
    }

    public java.util.Date getNextUpdate() {
        if (this.getHighSpeedVideoFpsRanges.getNextUpdate() == null) {
            return null;
        }
        return org.bouncycastle.cert.ocsp.OCSPUtils.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges.getNextUpdate());
    }

    public java.util.List getExtensionOIDs() {
        return org.bouncycastle.cert.ocsp.OCSPUtils.getHighResolutionOutputSizeshNQ4ISI(this.Camera2StreamConfigurationMap);
    }

    public org.bouncycastle.asn1.x509.Extension getExtension(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        org.bouncycastle.asn1.x509.Extensions extensions = this.Camera2StreamConfigurationMap;
        if (extensions != null) {
            return extensions.getExtension(aSN1ObjectIdentifier);
        }
        return null;
    }

    public java.util.Set getCriticalExtensionOIDs() {
        return org.bouncycastle.cert.ocsp.OCSPUtils.getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap);
    }

    public org.bouncycastle.cert.ocsp.CertificateStatus getCertStatus() {
        org.bouncycastle.asn1.ocsp.CertStatus certStatus = this.getHighSpeedVideoFpsRanges.getCertStatus();
        if (certStatus.getTagNo() == 0) {
            return null;
        }
        return certStatus.getTagNo() == 1 ? new org.bouncycastle.cert.ocsp.RevokedStatus(org.bouncycastle.asn1.ocsp.RevokedInfo.getInstance(certStatus.getStatus())) : new org.bouncycastle.cert.ocsp.UnknownStatus();
    }

    public org.bouncycastle.cert.ocsp.CertificateID getCertID() {
        return new org.bouncycastle.cert.ocsp.CertificateID(this.getHighSpeedVideoFpsRanges.getCertID());
    }

    public SingleResp(org.bouncycastle.asn1.ocsp.SingleResponse singleResponse) {
        this.getHighSpeedVideoFpsRanges = singleResponse;
        this.Camera2StreamConfigurationMap = singleResponse.getSingleExtensions();
    }
}
