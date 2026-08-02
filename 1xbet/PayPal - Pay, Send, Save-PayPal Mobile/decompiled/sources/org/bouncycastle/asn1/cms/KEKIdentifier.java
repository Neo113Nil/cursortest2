package org.bouncycastle.asn1.cms;

/* loaded from: classes17.dex */
public class KEKIdentifier extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1GeneralizedTime Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.cms.OtherKeyAttribute getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1OctetString getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        org.bouncycastle.asn1.ASN1GeneralizedTime aSN1GeneralizedTime = this.Camera2StreamConfigurationMap;
        if (aSN1GeneralizedTime != null) {
            aSN1EncodableVector.add(aSN1GeneralizedTime);
        }
        org.bouncycastle.asn1.cms.OtherKeyAttribute otherKeyAttribute = this.getHighResolutionOutputSizeshNQ4ISI;
        if (otherKeyAttribute != null) {
            aSN1EncodableVector.add(otherKeyAttribute);
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.cms.OtherKeyAttribute getOther() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.ASN1OctetString getKeyIdentifier() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.ASN1GeneralizedTime getDate() {
        return this.Camera2StreamConfigurationMap;
    }

    public static org.bouncycastle.asn1.cms.KEKIdentifier getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.cms.KEKIdentifier getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.cms.KEKIdentifier)) {
            return (org.bouncycastle.asn1.cms.KEKIdentifier) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1Sequence) {
            return new org.bouncycastle.asn1.cms.KEKIdentifier((org.bouncycastle.asn1.ASN1Sequence) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid KEKIdentifier: ");
        sb.append(obj.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public KEKIdentifier(byte[] bArr, org.bouncycastle.asn1.ASN1GeneralizedTime aSN1GeneralizedTime, org.bouncycastle.asn1.cms.OtherKeyAttribute otherKeyAttribute) {
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.DEROctetString(bArr);
        this.Camera2StreamConfigurationMap = aSN1GeneralizedTime;
        this.getHighResolutionOutputSizeshNQ4ISI = otherKeyAttribute;
    }

    private KEKIdentifier(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoFpsRanges = (org.bouncycastle.asn1.ASN1OctetString) aSN1Sequence.getObjectAt(0);
        int size = aSN1Sequence.size();
        if (size != 1) {
            if (size != 2) {
                if (size != 3) {
                    throw new java.lang.IllegalArgumentException("Invalid KEKIdentifier");
                }
                this.Camera2StreamConfigurationMap = (org.bouncycastle.asn1.ASN1GeneralizedTime) aSN1Sequence.getObjectAt(1);
                this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.cms.OtherKeyAttribute.getInstance(aSN1Sequence.getObjectAt(2));
                return;
            }
            boolean z = aSN1Sequence.getObjectAt(1) instanceof org.bouncycastle.asn1.ASN1GeneralizedTime;
            org.bouncycastle.asn1.ASN1Encodable objectAt = aSN1Sequence.getObjectAt(1);
            if (z) {
                this.Camera2StreamConfigurationMap = (org.bouncycastle.asn1.ASN1GeneralizedTime) objectAt;
            } else {
                this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.cms.OtherKeyAttribute.getInstance(objectAt);
            }
        }
    }
}
