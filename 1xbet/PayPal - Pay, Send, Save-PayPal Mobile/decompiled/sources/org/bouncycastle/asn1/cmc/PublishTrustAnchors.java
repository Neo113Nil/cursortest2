package org.bouncycastle.asn1.cmc;

/* loaded from: classes17.dex */
public class PublishTrustAnchors extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRangesFor;
    private final org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public java.math.BigInteger getSeqNumber() {
        return this.getHighSpeedVideoFpsRanges.getValue();
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getHashAlgorithm() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public byte[][] getAnchorHashes() {
        int size = this.getHighSpeedVideoSizes.size();
        byte[][] bArr = new byte[size][];
        for (int i = 0; i != size; i++) {
            bArr[i] = org.bouncycastle.util.Arrays.clone(org.bouncycastle.asn1.ASN1OctetString.getInstance(this.getHighSpeedVideoSizes.getObjectAt(i)).getOctets());
        }
        return bArr;
    }

    public static org.bouncycastle.asn1.cmc.PublishTrustAnchors getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmc.PublishTrustAnchors) {
            return (org.bouncycastle.asn1.cmc.PublishTrustAnchors) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cmc.PublishTrustAnchors(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private PublishTrustAnchors(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 3) {
            throw new java.lang.IllegalArgumentException("incorrect sequence size");
        }
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(1));
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(2));
    }

    public PublishTrustAnchors(java.math.BigInteger bigInteger, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, byte[][] bArr) {
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.ASN1Integer(bigInteger);
        this.getHighSpeedVideoFpsRangesFor = algorithmIdentifier;
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(bArr.length);
        for (int i = 0; i != bArr.length; i++) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DEROctetString(org.bouncycastle.util.Arrays.clone(bArr[i])));
        }
        this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }
}
