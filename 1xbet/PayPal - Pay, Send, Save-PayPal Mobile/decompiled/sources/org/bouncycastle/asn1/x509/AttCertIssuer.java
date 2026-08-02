package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class AttCertIssuer extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.ASN1Choice {
    org.bouncycastle.asn1.ASN1Encodable getHighResolutionOutputSizeshNQ4ISI;
    org.bouncycastle.asn1.ASN1Primitive getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.ASN1Encodable getIssuer() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.asn1.x509.AttCertIssuer getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(aSN1TaggedObject.getObject());
    }

    public static org.bouncycastle.asn1.x509.AttCertIssuer getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.x509.AttCertIssuer)) {
            return (org.bouncycastle.asn1.x509.AttCertIssuer) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.x509.V2Form) {
            return new org.bouncycastle.asn1.x509.AttCertIssuer(org.bouncycastle.asn1.x509.V2Form.getInstance(obj));
        }
        if (obj instanceof org.bouncycastle.asn1.x509.GeneralNames) {
            return new org.bouncycastle.asn1.x509.AttCertIssuer((org.bouncycastle.asn1.x509.GeneralNames) obj);
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
            return new org.bouncycastle.asn1.x509.AttCertIssuer(org.bouncycastle.asn1.x509.V2Form.getInstance((org.bouncycastle.asn1.ASN1TaggedObject) obj, false));
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1Sequence) {
            return new org.bouncycastle.asn1.x509.AttCertIssuer(org.bouncycastle.asn1.x509.GeneralNames.getInstance(obj));
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown object in factory: ");
        sb.append(obj.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public AttCertIssuer(org.bouncycastle.asn1.x509.V2Form v2Form) {
        this.getHighResolutionOutputSizeshNQ4ISI = v2Form;
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.DERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) v2Form);
    }

    public AttCertIssuer(org.bouncycastle.asn1.x509.GeneralNames generalNames) {
        this.getHighResolutionOutputSizeshNQ4ISI = generalNames;
        this.getHighSpeedVideoFpsRanges = generalNames.toASN1Primitive();
    }
}
