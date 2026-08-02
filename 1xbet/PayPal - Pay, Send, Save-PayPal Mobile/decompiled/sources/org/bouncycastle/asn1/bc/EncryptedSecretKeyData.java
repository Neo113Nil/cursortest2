package org.bouncycastle.asn1.bc;

/* loaded from: classes17.dex */
public class EncryptedSecretKeyData extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.asn1.ASN1OctetString Camera2StreamConfigurationMap;
    private final org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getKeyEncryptionAlgorithm() {
        return this.getHighSpeedVideoSizes;
    }

    public byte[] getEncryptedKeyData() {
        return org.bouncycastle.util.Arrays.clone(this.Camera2StreamConfigurationMap.getOctets());
    }

    public static org.bouncycastle.asn1.bc.EncryptedSecretKeyData getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.bc.EncryptedSecretKeyData) {
            return (org.bouncycastle.asn1.bc.EncryptedSecretKeyData) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.bc.EncryptedSecretKeyData(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public EncryptedSecretKeyData(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
        this.getHighSpeedVideoSizes = algorithmIdentifier;
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.DEROctetString(org.bouncycastle.util.Arrays.clone(bArr));
    }

    private EncryptedSecretKeyData(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1));
    }
}
