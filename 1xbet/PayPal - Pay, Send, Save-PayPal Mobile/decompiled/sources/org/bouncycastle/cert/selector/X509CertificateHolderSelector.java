package org.bouncycastle.cert.selector;

/* loaded from: classes17.dex */
public class X509CertificateHolderSelector implements org.bouncycastle.util.Selector {
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.x500.X500Name getHighSpeedVideoFpsRanges;
    private java.math.BigInteger getHighSpeedVideoSizes;

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof org.bouncycastle.cert.selector.X509CertificateHolderSelector)) {
            return false;
        }
        org.bouncycastle.cert.selector.X509CertificateHolderSelector x509CertificateHolderSelector = (org.bouncycastle.cert.selector.X509CertificateHolderSelector) obj;
        if (org.bouncycastle.util.Arrays.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, x509CertificateHolderSelector.getHighResolutionOutputSizeshNQ4ISI)) {
            java.math.BigInteger bigInteger = this.getHighSpeedVideoSizes;
            java.math.BigInteger bigInteger2 = x509CertificateHolderSelector.getHighSpeedVideoSizes;
            if (bigInteger == null ? bigInteger2 == null : bigInteger.equals(bigInteger2)) {
                org.bouncycastle.asn1.x500.X500Name x500Name = this.getHighSpeedVideoFpsRanges;
                org.bouncycastle.asn1.x500.X500Name x500Name2 = x509CertificateHolderSelector.getHighSpeedVideoFpsRanges;
                if (x500Name != null) {
                    if (x500Name.equals(x500Name2)) {
                        return true;
                    }
                } else if (x500Name2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.bouncycastle.util.Selector
    public boolean match(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.cert.X509CertificateHolder) {
            org.bouncycastle.cert.X509CertificateHolder x509CertificateHolder = (org.bouncycastle.cert.X509CertificateHolder) obj;
            if (getSerialNumber() != null) {
                org.bouncycastle.asn1.cms.IssuerAndSerialNumber issuerAndSerialNumber = new org.bouncycastle.asn1.cms.IssuerAndSerialNumber(x509CertificateHolder.toASN1Structure());
                return issuerAndSerialNumber.getName().equals(this.getHighSpeedVideoFpsRanges) && issuerAndSerialNumber.getSerialNumber().hasValue(this.getHighSpeedVideoSizes);
            }
            if (this.getHighResolutionOutputSizeshNQ4ISI != null) {
                org.bouncycastle.asn1.x509.Extension extension = x509CertificateHolder.getExtension(org.bouncycastle.asn1.x509.Extension.subjectKeyIdentifier);
                if (extension == null) {
                    return org.bouncycastle.util.Arrays.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, org.bouncycastle.cert.selector.MSOutlookKeyIdCalculator.getHighSpeedVideoFpsRangesFor(x509CertificateHolder.getSubjectPublicKeyInfo()));
                }
                return org.bouncycastle.util.Arrays.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, org.bouncycastle.asn1.ASN1OctetString.getInstance(extension.getParsedValue()).getOctets());
            }
        } else if (obj instanceof byte[]) {
            return org.bouncycastle.util.Arrays.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, (byte[]) obj);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = org.bouncycastle.util.Arrays.hashCode(this.getHighResolutionOutputSizeshNQ4ISI);
        java.math.BigInteger bigInteger = this.getHighSpeedVideoSizes;
        if (bigInteger != null) {
            hashCode ^= bigInteger.hashCode();
        }
        org.bouncycastle.asn1.x500.X500Name x500Name = this.getHighSpeedVideoFpsRanges;
        return x500Name != null ? hashCode ^ x500Name.hashCode() : hashCode;
    }

    public byte[] getSubjectKeyIdentifier() {
        return org.bouncycastle.util.Arrays.clone(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public java.math.BigInteger getSerialNumber() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.x500.X500Name getIssuer() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // org.bouncycastle.util.Selector
    public java.lang.Object clone() {
        return new org.bouncycastle.cert.selector.X509CertificateHolderSelector(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public X509CertificateHolderSelector(byte[] bArr) {
        this(null, null, bArr);
    }

    public X509CertificateHolderSelector(org.bouncycastle.asn1.x500.X500Name x500Name, java.math.BigInteger bigInteger, byte[] bArr) {
        this.getHighSpeedVideoFpsRanges = x500Name;
        this.getHighSpeedVideoSizes = bigInteger;
        this.getHighResolutionOutputSizeshNQ4ISI = bArr;
    }

    public X509CertificateHolderSelector(org.bouncycastle.asn1.x500.X500Name x500Name, java.math.BigInteger bigInteger) {
        this(x500Name, bigInteger, null);
    }
}
