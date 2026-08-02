package org.bouncycastle.asn1.cmc;

/* loaded from: classes17.dex */
public class PopLinkWitnessV2 extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRanges;
    private final byte[] getHighSpeedVideoFpsRangesFor;
    private final org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DEROctetString(getWitness()));
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public byte[] getWitness() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoFpsRangesFor);
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getMacAlgorithm() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getKeyGenAlgorithm() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.asn1.cmc.PopLinkWitnessV2 getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmc.PopLinkWitnessV2) {
            return (org.bouncycastle.asn1.cmc.PopLinkWitnessV2) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cmc.PopLinkWitnessV2(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public PopLinkWitnessV2(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2, byte[] bArr) {
        this.getHighSpeedVideoSizes = algorithmIdentifier;
        this.getHighSpeedVideoFpsRanges = algorithmIdentifier2;
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.util.Arrays.clone(bArr);
    }

    private PopLinkWitnessV2(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 3) {
            throw new java.lang.IllegalArgumentException("incorrect sequence size");
        }
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(1));
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.util.Arrays.clone(org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(2)).getOctets());
    }
}
