package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class AccessDescription extends org.bouncycastle.asn1.ASN1Object {
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_ad_caIssuers = new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.6.1.5.5.7.48.2");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_ad_ocsp = new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.6.1.5.5.7.48.1");
    org.bouncycastle.asn1.x509.GeneralName getHighSpeedVideoFpsRanges;
    org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoFpsRangesFor;

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AccessDescription: Oid(");
        sb.append(this.getHighSpeedVideoFpsRangesFor.getId());
        sb.append(")");
        return sb.toString();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getAccessMethod() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.x509.GeneralName getAccessLocation() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public static org.bouncycastle.asn1.x509.AccessDescription getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x509.AccessDescription) {
            return (org.bouncycastle.asn1.x509.AccessDescription) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x509.AccessDescription(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private AccessDescription(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighSpeedVideoFpsRanges = null;
        if (aSN1Sequence.size() != 2) {
            throw new java.lang.IllegalArgumentException("wrong number of elements in sequence");
        }
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.x509.GeneralName.getInstance(aSN1Sequence.getObjectAt(1));
    }

    public AccessDescription(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.x509.GeneralName generalName) {
        this.getHighSpeedVideoFpsRangesFor = aSN1ObjectIdentifier;
        this.getHighSpeedVideoFpsRanges = generalName;
    }
}
