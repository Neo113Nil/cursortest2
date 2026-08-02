package org.bouncycastle.asn1.isismtt.ocsp;

/* loaded from: classes17.dex */
public class CertHash extends org.bouncycastle.asn1.ASN1Object {
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DEROctetString(this.getHighResolutionOutputSizeshNQ4ISI));
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getHashAlgorithm() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public byte[] getCertificateHash() {
        return org.bouncycastle.util.Arrays.clone(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public static org.bouncycastle.asn1.isismtt.ocsp.CertHash getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.isismtt.ocsp.CertHash)) {
            return (org.bouncycastle.asn1.isismtt.ocsp.CertHash) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1Sequence) {
            return new org.bouncycastle.asn1.isismtt.ocsp.CertHash((org.bouncycastle.asn1.ASN1Sequence) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("illegal object in getInstance: ");
        sb.append(obj.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public CertHash(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
        this.getHighSpeedVideoFpsRangesFor = algorithmIdentifier;
        byte[] bArr2 = new byte[bArr.length];
        this.getHighResolutionOutputSizeshNQ4ISI = bArr2;
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
    }

    private CertHash(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() == 2) {
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.DEROctetString.getInstance(aSN1Sequence.getObjectAt(1)).getOctets();
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Bad sequence size: ");
            sb.append(aSN1Sequence.size());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }
}
