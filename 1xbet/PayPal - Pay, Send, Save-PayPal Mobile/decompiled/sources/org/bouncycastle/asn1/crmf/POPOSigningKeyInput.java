package org.bouncycastle.asn1.crmf;

/* loaded from: classes17.dex */
public class POPOSigningKeyInput extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.x509.GeneralName getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.x509.SubjectPublicKeyInfo getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.crmf.PKMACValue getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        org.bouncycastle.asn1.x509.GeneralName generalName = this.getHighResolutionOutputSizeshNQ4ISI;
        aSN1EncodableVector.add(generalName != null ? new org.bouncycastle.asn1.DERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) generalName) : this.getHighSpeedVideoSizes);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.x509.GeneralName getSender() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.crmf.PKMACValue getPublicKeyMAC() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.x509.SubjectPublicKeyInfo getPublicKey() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public static org.bouncycastle.asn1.crmf.POPOSigningKeyInput getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.crmf.POPOSigningKeyInput) {
            return (org.bouncycastle.asn1.crmf.POPOSigningKeyInput) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.crmf.POPOSigningKeyInput(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public POPOSigningKeyInput(org.bouncycastle.asn1.x509.GeneralName generalName, org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) {
        this.getHighResolutionOutputSizeshNQ4ISI = generalName;
        this.getHighSpeedVideoFpsRanges = subjectPublicKeyInfo;
    }

    public POPOSigningKeyInput(org.bouncycastle.asn1.crmf.PKMACValue pKMACValue, org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) {
        this.getHighSpeedVideoSizes = pKMACValue;
        this.getHighSpeedVideoFpsRanges = subjectPublicKeyInfo;
    }

    private POPOSigningKeyInput(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        org.bouncycastle.asn1.ASN1Encodable objectAt = aSN1Sequence.getObjectAt(0);
        if (objectAt instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
            org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = (org.bouncycastle.asn1.ASN1TaggedObject) objectAt;
            if (aSN1TaggedObject.getTagNo() != 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown authInfo tag: ");
                sb.append(aSN1TaggedObject.getTagNo());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.x509.GeneralName.getInstance(aSN1TaggedObject.getObject());
        } else {
            this.getHighSpeedVideoSizes = org.bouncycastle.asn1.crmf.PKMACValue.getInstance(objectAt);
        }
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(aSN1Sequence.getObjectAt(1));
    }
}
