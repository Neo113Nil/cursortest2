package org.bouncycastle.asn1.bc;

/* loaded from: classes17.dex */
public class PbkdMacIntegrityCheck extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.asn1.x509.AlgorithmIdentifier Camera2StreamConfigurationMap;
    private final org.bouncycastle.asn1.ASN1OctetString getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.asn1.pkcs.KeyDerivationFunc getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.pkcs.KeyDerivationFunc getPbkdAlgorithm() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getMacAlgorithm() {
        return this.Camera2StreamConfigurationMap;
    }

    public byte[] getMac() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoFpsRanges.getOctets());
    }

    public static org.bouncycastle.asn1.bc.PbkdMacIntegrityCheck getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.bc.PbkdMacIntegrityCheck) {
            return (org.bouncycastle.asn1.bc.PbkdMacIntegrityCheck) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.bc.PbkdMacIntegrityCheck(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public PbkdMacIntegrityCheck(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.pkcs.KeyDerivationFunc keyDerivationFunc, byte[] bArr) {
        this.Camera2StreamConfigurationMap = algorithmIdentifier;
        this.getHighSpeedVideoFpsRangesFor = keyDerivationFunc;
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.DEROctetString(org.bouncycastle.util.Arrays.clone(bArr));
    }

    private PbkdMacIntegrityCheck(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.pkcs.KeyDerivationFunc.getInstance(aSN1Sequence.getObjectAt(1));
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(2));
    }
}
