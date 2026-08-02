package org.bouncycastle.asn1.pkcs;

/* loaded from: classes17.dex */
public class SafeBag extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Encodable getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.ASN1Set getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DLTaggedObject(true, 0, this.getHighResolutionOutputSizeshNQ4ISI));
        org.bouncycastle.asn1.ASN1Set aSN1Set = this.getHighSpeedVideoSizes;
        if (aSN1Set != null) {
            aSN1EncodableVector.add(aSN1Set);
        }
        return new org.bouncycastle.asn1.DLSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1Encodable getBagValue() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getBagId() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.ASN1Set getBagAttributes() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.asn1.pkcs.SafeBag getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.pkcs.SafeBag) {
            return (org.bouncycastle.asn1.pkcs.SafeBag) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.pkcs.SafeBag(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private SafeBag(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoFpsRanges = (org.bouncycastle.asn1.ASN1ObjectIdentifier) aSN1Sequence.getObjectAt(0);
        this.getHighResolutionOutputSizeshNQ4ISI = ((org.bouncycastle.asn1.ASN1TaggedObject) aSN1Sequence.getObjectAt(1)).getObject();
        if (aSN1Sequence.size() == 3) {
            this.getHighSpeedVideoSizes = (org.bouncycastle.asn1.ASN1Set) aSN1Sequence.getObjectAt(2);
        }
    }

    public SafeBag(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable, org.bouncycastle.asn1.ASN1Set aSN1Set) {
        this.getHighSpeedVideoFpsRanges = aSN1ObjectIdentifier;
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1Encodable;
        this.getHighSpeedVideoSizes = aSN1Set;
    }

    public SafeBag(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.getHighSpeedVideoFpsRanges = aSN1ObjectIdentifier;
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1Encodable;
        this.getHighSpeedVideoSizes = null;
    }
}
