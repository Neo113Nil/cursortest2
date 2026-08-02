package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class PrivateKeyUsagePeriod extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1GeneralizedTime getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1GeneralizedTime getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        org.bouncycastle.asn1.ASN1GeneralizedTime aSN1GeneralizedTime = this.getHighResolutionOutputSizeshNQ4ISI;
        if (aSN1GeneralizedTime != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) aSN1GeneralizedTime));
        }
        org.bouncycastle.asn1.ASN1GeneralizedTime aSN1GeneralizedTime2 = this.getHighSpeedVideoFpsRanges;
        if (aSN1GeneralizedTime2 != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 1, (org.bouncycastle.asn1.ASN1Encodable) aSN1GeneralizedTime2));
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1GeneralizedTime getNotBefore() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.ASN1GeneralizedTime getNotAfter() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public static org.bouncycastle.asn1.x509.PrivateKeyUsagePeriod getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x509.PrivateKeyUsagePeriod) {
            return (org.bouncycastle.asn1.x509.PrivateKeyUsagePeriod) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x509.PrivateKeyUsagePeriod(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private PrivateKeyUsagePeriod(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = (org.bouncycastle.asn1.ASN1TaggedObject) objects.nextElement();
            if (aSN1TaggedObject.getTagNo() == 0) {
                this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1GeneralizedTime.getInstance(aSN1TaggedObject, false);
            } else if (aSN1TaggedObject.getTagNo() == 1) {
                this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1GeneralizedTime.getInstance(aSN1TaggedObject, false);
            }
        }
    }
}
