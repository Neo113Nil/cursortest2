package org.bouncycastle.asn1.esf;

/* loaded from: classes17.dex */
public class CrlOcspRef extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.esf.OtherRevRefs Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.esf.CrlListID getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.esf.OcspListID getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        org.bouncycastle.asn1.esf.CrlListID crlListID = this.getHighResolutionOutputSizeshNQ4ISI;
        if (crlListID != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 0, (org.bouncycastle.asn1.ASN1Encodable) crlListID.toASN1Primitive()));
        }
        org.bouncycastle.asn1.esf.OcspListID ocspListID = this.getHighSpeedVideoFpsRanges;
        if (ocspListID != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 1, (org.bouncycastle.asn1.ASN1Encodable) ocspListID.toASN1Primitive()));
        }
        org.bouncycastle.asn1.esf.OtherRevRefs otherRevRefs = this.Camera2StreamConfigurationMap;
        if (otherRevRefs != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 2, (org.bouncycastle.asn1.ASN1Encodable) otherRevRefs.toASN1Primitive()));
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.esf.OtherRevRefs getOtherRev() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.esf.OcspListID getOcspids() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.esf.CrlListID getCrlids() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.asn1.esf.CrlOcspRef getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.esf.CrlOcspRef) {
            return (org.bouncycastle.asn1.esf.CrlOcspRef) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.esf.CrlOcspRef(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public CrlOcspRef(org.bouncycastle.asn1.esf.CrlListID crlListID, org.bouncycastle.asn1.esf.OcspListID ocspListID, org.bouncycastle.asn1.esf.OtherRevRefs otherRevRefs) {
        this.getHighResolutionOutputSizeshNQ4ISI = crlListID;
        this.getHighSpeedVideoFpsRanges = ocspListID;
        this.Camera2StreamConfigurationMap = otherRevRefs;
    }

    private CrlOcspRef(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = (org.bouncycastle.asn1.ASN1TaggedObject) objects.nextElement();
            int tagNo = aSN1TaggedObject.getTagNo();
            if (tagNo == 0) {
                this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.esf.CrlListID.getInstance(aSN1TaggedObject.getObject());
            } else if (tagNo == 1) {
                this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.esf.OcspListID.getInstance(aSN1TaggedObject.getObject());
            } else {
                if (tagNo != 2) {
                    throw new java.lang.IllegalArgumentException("illegal tag");
                }
                this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.esf.OtherRevRefs.getInstance(aSN1TaggedObject.getObject());
            }
        }
    }
}
