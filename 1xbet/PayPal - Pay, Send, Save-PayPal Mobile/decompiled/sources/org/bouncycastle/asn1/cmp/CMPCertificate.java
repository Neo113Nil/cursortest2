package org.bouncycastle.asn1.cmp;

/* loaded from: classes17.dex */
public class CMPCertificate extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.ASN1Choice {
    private int getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1Object getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.x509.Certificate getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1Object aSN1Object = this.getHighSpeedVideoFpsRanges;
        return aSN1Object != null ? new org.bouncycastle.asn1.DERTaggedObject(true, this.getHighResolutionOutputSizeshNQ4ISI, (org.bouncycastle.asn1.ASN1Encodable) aSN1Object) : this.getHighSpeedVideoFpsRangesFor.toASN1Primitive();
    }

    public boolean isX509v3PKCert() {
        return this.getHighSpeedVideoFpsRangesFor != null;
    }

    public org.bouncycastle.asn1.x509.Certificate getX509v3PKCert() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.x509.AttributeCertificate getX509v2AttrCert() {
        return org.bouncycastle.asn1.x509.AttributeCertificate.getInstance(this.getHighSpeedVideoFpsRanges);
    }

    public int getOtherCertTag() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.ASN1Object getOtherCert() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public static org.bouncycastle.asn1.cmp.CMPCertificate getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.cmp.CMPCertificate)) {
            return (org.bouncycastle.asn1.cmp.CMPCertificate) obj;
        }
        if (obj instanceof byte[]) {
            try {
                obj = org.bouncycastle.asn1.ASN1Primitive.fromByteArray((byte[]) obj);
            } catch (java.io.IOException unused) {
                throw new java.lang.IllegalArgumentException("Invalid encoding in CMPCertificate");
            }
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1Sequence) {
            return new org.bouncycastle.asn1.cmp.CMPCertificate(org.bouncycastle.asn1.x509.Certificate.getInstance(obj));
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
            org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = (org.bouncycastle.asn1.ASN1TaggedObject) obj;
            return new org.bouncycastle.asn1.cmp.CMPCertificate(aSN1TaggedObject.getTagNo(), aSN1TaggedObject.getObject());
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid object: ");
        sb.append(obj.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public CMPCertificate(org.bouncycastle.asn1.x509.Certificate certificate) {
        if (certificate.getVersionNumber() != 3) {
            throw new java.lang.IllegalArgumentException("only version 3 certificates allowed");
        }
        this.getHighSpeedVideoFpsRangesFor = certificate;
    }

    public CMPCertificate(org.bouncycastle.asn1.x509.AttributeCertificate attributeCertificate) {
        this(1, attributeCertificate);
    }

    public CMPCertificate(int i, org.bouncycastle.asn1.ASN1Object aSN1Object) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoFpsRanges = aSN1Object;
    }
}
