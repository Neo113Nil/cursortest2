package org.bouncycastle.asn1.cmp;

/* loaded from: classes17.dex */
public class Challenge extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1OctetString getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.ASN1OctetString getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier = this.getHighResolutionOutputSizeshNQ4ISI;
        if (algorithmIdentifier != null) {
            aSN1EncodableVector.add(algorithmIdentifier);
        }
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public byte[] getWitness() {
        return this.getHighSpeedVideoFpsRangesFor.getOctets();
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getOwf() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public byte[] getChallenge() {
        return this.getHighSpeedVideoSizes.getOctets();
    }

    public static org.bouncycastle.asn1.cmp.Challenge getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmp.Challenge) {
            return (org.bouncycastle.asn1.cmp.Challenge) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cmp.Challenge(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public Challenge(byte[] bArr, byte[] bArr2) {
        this(null, bArr, bArr2);
    }

    public Challenge(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, byte[] bArr, byte[] bArr2) {
        this.getHighResolutionOutputSizeshNQ4ISI = algorithmIdentifier;
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.DEROctetString(bArr);
        this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.DEROctetString(bArr2);
    }

    private Challenge(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        int i = 0;
        if (aSN1Sequence.size() == 3) {
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
            i = 1;
        }
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(i));
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(i + 1));
    }
}
