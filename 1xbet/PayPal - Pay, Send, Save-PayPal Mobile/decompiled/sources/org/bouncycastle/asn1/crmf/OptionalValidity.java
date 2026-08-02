package org.bouncycastle.asn1.crmf;

/* loaded from: classes17.dex */
public class OptionalValidity extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.x509.Time Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.x509.Time getHighResolutionOutputSizeshNQ4ISI;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        org.bouncycastle.asn1.x509.Time time = this.Camera2StreamConfigurationMap;
        if (time != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 0, (org.bouncycastle.asn1.ASN1Encodable) time));
        }
        org.bouncycastle.asn1.x509.Time time2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (time2 != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 1, (org.bouncycastle.asn1.ASN1Encodable) time2));
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.x509.Time getNotBefore() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.x509.Time getNotAfter() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.asn1.crmf.OptionalValidity getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.crmf.OptionalValidity) {
            return (org.bouncycastle.asn1.crmf.OptionalValidity) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.crmf.OptionalValidity(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public OptionalValidity(org.bouncycastle.asn1.x509.Time time, org.bouncycastle.asn1.x509.Time time2) {
        if (time == null && time2 == null) {
            throw new java.lang.IllegalArgumentException("at least one of notBefore/notAfter must not be null.");
        }
        this.Camera2StreamConfigurationMap = time;
        this.getHighResolutionOutputSizeshNQ4ISI = time2;
    }

    private OptionalValidity(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = (org.bouncycastle.asn1.ASN1TaggedObject) objects.nextElement();
            int tagNo = aSN1TaggedObject.getTagNo();
            org.bouncycastle.asn1.x509.Time time = org.bouncycastle.asn1.x509.Time.getInstance(aSN1TaggedObject, true);
            if (tagNo == 0) {
                this.Camera2StreamConfigurationMap = time;
            } else {
                this.getHighResolutionOutputSizeshNQ4ISI = time;
            }
        }
    }
}
