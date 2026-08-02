package org.bouncycastle.asn1.bc;

/* loaded from: classes17.dex */
public class SignatureCheck extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.asn1.ASN1BitString getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = this.getHighSpeedVideoFpsRanges;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(0, aSN1Sequence));
        }
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getSignatureAlgorithm() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.ASN1BitString getSignature() {
        return new org.bouncycastle.asn1.DERBitString(this.getHighSpeedVideoSizes.getBytes(), this.getHighSpeedVideoSizes.getPadBits());
    }

    public org.bouncycastle.asn1.x509.Certificate[] getCertificates() {
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = this.getHighSpeedVideoFpsRanges;
        if (aSN1Sequence == null) {
            return null;
        }
        int size = aSN1Sequence.size();
        org.bouncycastle.asn1.x509.Certificate[] certificateArr = new org.bouncycastle.asn1.x509.Certificate[size];
        for (int i = 0; i != size; i++) {
            certificateArr[i] = org.bouncycastle.asn1.x509.Certificate.getInstance(this.getHighSpeedVideoFpsRanges.getObjectAt(i));
        }
        return certificateArr;
    }

    public static org.bouncycastle.asn1.bc.SignatureCheck getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.bc.SignatureCheck) {
            return (org.bouncycastle.asn1.bc.SignatureCheck) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.bc.SignatureCheck(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public SignatureCheck(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.x509.Certificate[] certificateArr, byte[] bArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = algorithmIdentifier;
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.DERSequence(certificateArr);
        this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.DERBitString(org.bouncycastle.util.Arrays.clone(bArr));
    }

    public SignatureCheck(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = algorithmIdentifier;
        this.getHighSpeedVideoFpsRanges = null;
        this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.DERBitString(org.bouncycastle.util.Arrays.clone(bArr));
    }

    private SignatureCheck(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        int i = 1;
        if (aSN1Sequence.getObjectAt(1) instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1Sequence.getInstance(org.bouncycastle.asn1.ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(1)).getObject());
            i = 2;
        } else {
            this.getHighSpeedVideoFpsRanges = null;
        }
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.DERBitString.getInstance((java.lang.Object) aSN1Sequence.getObjectAt(i));
    }
}
