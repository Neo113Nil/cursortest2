package org.bouncycastle.asn1.cmc;

/* loaded from: classes17.dex */
public class IdentityProofV2 extends org.bouncycastle.asn1.ASN1Object {
    private final byte[] Camera2StreamConfigurationMap;
    private final org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DEROctetString(getWitness()));
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public byte[] getWitness() {
        return org.bouncycastle.util.Arrays.clone(this.Camera2StreamConfigurationMap);
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getProofAlgID() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getMacAlgId() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static org.bouncycastle.asn1.cmc.IdentityProofV2 getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmc.IdentityProofV2) {
            return (org.bouncycastle.asn1.cmc.IdentityProofV2) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cmc.IdentityProofV2(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public IdentityProofV2(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2, byte[] bArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = algorithmIdentifier;
        this.getHighSpeedVideoFpsRangesFor = algorithmIdentifier2;
        this.Camera2StreamConfigurationMap = org.bouncycastle.util.Arrays.clone(bArr);
    }

    private IdentityProofV2(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 3) {
            throw new java.lang.IllegalArgumentException("incorrect sequence size");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(1));
        this.Camera2StreamConfigurationMap = org.bouncycastle.util.Arrays.clone(org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(2)).getOctets());
    }
}
