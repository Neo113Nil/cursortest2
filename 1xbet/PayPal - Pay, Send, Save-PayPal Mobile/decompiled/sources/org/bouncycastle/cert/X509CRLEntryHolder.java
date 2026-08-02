package org.bouncycastle.cert;

/* loaded from: classes17.dex */
public class X509CRLEntryHolder {
    private org.bouncycastle.asn1.x509.GeneralNames getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.x509.TBSCertList.CRLEntry getHighSpeedVideoFpsRanges;

    public boolean hasExtensions() {
        return this.getHighSpeedVideoFpsRanges.hasExtensions();
    }

    public java.math.BigInteger getSerialNumber() {
        return this.getHighSpeedVideoFpsRanges.getUserCertificate().getValue();
    }

    public java.util.Date getRevocationDate() {
        return this.getHighSpeedVideoFpsRanges.getRevocationDate().getDate();
    }

    public java.util.Set getNonCriticalExtensionOIDs() {
        return org.bouncycastle.cert.CertUtils.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges.getExtensions());
    }

    public org.bouncycastle.asn1.x509.Extensions getExtensions() {
        return this.getHighSpeedVideoFpsRanges.getExtensions();
    }

    public java.util.List getExtensionOIDs() {
        return org.bouncycastle.cert.CertUtils.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges.getExtensions());
    }

    public org.bouncycastle.asn1.x509.Extension getExtension(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        org.bouncycastle.asn1.x509.Extensions extensions = this.getHighSpeedVideoFpsRanges.getExtensions();
        if (extensions != null) {
            return extensions.getExtension(aSN1ObjectIdentifier);
        }
        return null;
    }

    public java.util.Set getCriticalExtensionOIDs() {
        return org.bouncycastle.cert.CertUtils.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges.getExtensions());
    }

    public org.bouncycastle.asn1.x509.GeneralNames getCertificateIssuer() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    X509CRLEntryHolder(org.bouncycastle.asn1.x509.TBSCertList.CRLEntry cRLEntry, boolean z, org.bouncycastle.asn1.x509.GeneralNames generalNames) {
        org.bouncycastle.asn1.x509.Extension extension;
        this.getHighSpeedVideoFpsRanges = cRLEntry;
        this.getHighResolutionOutputSizeshNQ4ISI = generalNames;
        if (z && cRLEntry.hasExtensions() && (extension = cRLEntry.getExtensions().getExtension(org.bouncycastle.asn1.x509.Extension.certificateIssuer)) != null) {
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.x509.GeneralNames.getInstance(extension.getParsedValue());
        }
    }
}
