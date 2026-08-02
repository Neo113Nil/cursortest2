package org.bouncycastle.asn1.cmc;

/* loaded from: classes17.dex */
public class ExtendedFailInfo extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.asn1.ASN1Encodable getHighSpeedVideoFpsRangesFor;
    private final org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return new org.bouncycastle.asn1.DERSequence(new org.bouncycastle.asn1.ASN1Encodable[]{this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor});
    }

    public org.bouncycastle.asn1.ASN1Encodable getFailInfoValue() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getFailInfoOID() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.asn1.cmc.ExtendedFailInfo getInstance(java.lang.Object obj) {
        while (!(obj instanceof org.bouncycastle.asn1.cmc.ExtendedFailInfo)) {
            if (obj instanceof org.bouncycastle.asn1.ASN1Encodable) {
                org.bouncycastle.asn1.ASN1Primitive aSN1Primitive = ((org.bouncycastle.asn1.ASN1Encodable) obj).toASN1Primitive();
                if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1Sequence) {
                    return new org.bouncycastle.asn1.cmc.ExtendedFailInfo((org.bouncycastle.asn1.ASN1Sequence) aSN1Primitive);
                }
                return null;
            }
            if (!(obj instanceof byte[])) {
                return null;
            }
            obj = org.bouncycastle.asn1.ASN1Sequence.getInstance(obj);
        }
        return (org.bouncycastle.asn1.cmc.ExtendedFailInfo) obj;
    }

    private ExtendedFailInfo(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            throw new java.lang.IllegalArgumentException("Sequence must be 2 elements.");
        }
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        this.getHighSpeedVideoFpsRangesFor = aSN1Sequence.getObjectAt(1);
    }

    public ExtendedFailInfo(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.getHighSpeedVideoSizes = aSN1ObjectIdentifier;
        this.getHighSpeedVideoFpsRangesFor = aSN1Encodable;
    }
}
