package org.bouncycastle.asn1.cmc;

/* loaded from: classes17.dex */
public class CMCPublicationInfo extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.asn1.ASN1Sequence getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.asn1.crmf.PKIPublicationInfo getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.crmf.PKIPublicationInfo getPubInfo() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getHashAlg() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public byte[][] getCertHashes() {
        int size = this.getHighResolutionOutputSizeshNQ4ISI.size();
        byte[][] bArr = new byte[size][];
        for (int i = 0; i != size; i++) {
            bArr[i] = org.bouncycastle.util.Arrays.clone(org.bouncycastle.asn1.ASN1OctetString.getInstance(this.getHighResolutionOutputSizeshNQ4ISI.getObjectAt(i)).getOctets());
        }
        return bArr;
    }

    public static org.bouncycastle.asn1.cmc.CMCPublicationInfo getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmc.CMCPublicationInfo) {
            return (org.bouncycastle.asn1.cmc.CMCPublicationInfo) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cmc.CMCPublicationInfo(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public CMCPublicationInfo(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, byte[][] bArr, org.bouncycastle.asn1.crmf.PKIPublicationInfo pKIPublicationInfo) {
        this.getHighSpeedVideoFpsRangesFor = algorithmIdentifier;
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(bArr.length);
        for (int i = 0; i != bArr.length; i++) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DEROctetString(org.bouncycastle.util.Arrays.clone(bArr[i])));
        }
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
        this.getHighSpeedVideoFpsRanges = pKIPublicationInfo;
    }

    private CMCPublicationInfo(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 3) {
            throw new java.lang.IllegalArgumentException("incorrect sequence size");
        }
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1));
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.crmf.PKIPublicationInfo.getInstance(aSN1Sequence.getObjectAt(2));
    }
}
