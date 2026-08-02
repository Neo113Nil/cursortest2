package org.bouncycastle.asn1.isismtt.ocsp;

/* loaded from: classes17.dex */
public class RequestedCertificate extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.ASN1Choice {
    public static final int attributeCertificate = 1;
    public static final int certificate = -1;
    public static final int publicKeyCertificate = 0;
    private org.bouncycastle.asn1.x509.Certificate Camera2StreamConfigurationMap;
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.getHighSpeedVideoSizes != null ? new org.bouncycastle.asn1.DERTaggedObject(0, new org.bouncycastle.asn1.DEROctetString(this.getHighSpeedVideoSizes)) : this.getHighResolutionOutputSizeshNQ4ISI != null ? new org.bouncycastle.asn1.DERTaggedObject(1, new org.bouncycastle.asn1.DEROctetString(this.getHighResolutionOutputSizeshNQ4ISI)) : this.Camera2StreamConfigurationMap.toASN1Primitive();
    }

    public int getType() {
        if (this.Camera2StreamConfigurationMap != null) {
            return -1;
        }
        return this.getHighSpeedVideoSizes != null ? 0 : 1;
    }

    public byte[] getCertificateBytes() {
        org.bouncycastle.asn1.x509.Certificate certificate2 = this.Camera2StreamConfigurationMap;
        if (certificate2 == null) {
            byte[] bArr = this.getHighSpeedVideoSizes;
            return bArr != null ? org.bouncycastle.util.Arrays.clone(bArr) : org.bouncycastle.util.Arrays.clone(this.getHighResolutionOutputSizeshNQ4ISI);
        }
        try {
            return certificate2.getEncoded();
        } catch (java.io.IOException e) {
            throw new java.lang.IllegalStateException("can't decode certificate: ".concat(java.lang.String.valueOf(e)));
        }
    }

    public static org.bouncycastle.asn1.isismtt.ocsp.RequestedCertificate getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        if (z) {
            return getInstance(aSN1TaggedObject.getObject());
        }
        throw new java.lang.IllegalArgumentException("choice item must be explicitly tagged");
    }

    public static org.bouncycastle.asn1.isismtt.ocsp.RequestedCertificate getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.isismtt.ocsp.RequestedCertificate)) {
            return (org.bouncycastle.asn1.isismtt.ocsp.RequestedCertificate) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1Sequence) {
            return new org.bouncycastle.asn1.isismtt.ocsp.RequestedCertificate(org.bouncycastle.asn1.x509.Certificate.getInstance(obj));
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
            return new org.bouncycastle.asn1.isismtt.ocsp.RequestedCertificate((org.bouncycastle.asn1.ASN1TaggedObject) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("illegal object in getInstance: ");
        sb.append(obj.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public RequestedCertificate(org.bouncycastle.asn1.x509.Certificate certificate2) {
        this.Camera2StreamConfigurationMap = certificate2;
    }

    private RequestedCertificate(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject) {
        if (aSN1TaggedObject.getTagNo() == 0) {
            this.getHighSpeedVideoSizes = org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1TaggedObject, true).getOctets();
        } else if (aSN1TaggedObject.getTagNo() == 1) {
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1TaggedObject, true).getOctets();
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown tag number: ");
            sb.append(aSN1TaggedObject.getTagNo());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }

    public RequestedCertificate(int i, byte[] bArr) {
        this(new org.bouncycastle.asn1.DERTaggedObject(i, new org.bouncycastle.asn1.DEROctetString(bArr)));
    }
}
