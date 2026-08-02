package org.bouncycastle.asn1.bc;

/* loaded from: classes17.dex */
public class SecretKeyData extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.asn1.ASN1OctetString Camera2StreamConfigurationMap;
    private final org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public byte[] getKeyBytes() {
        return org.bouncycastle.util.Arrays.clone(this.Camera2StreamConfigurationMap.getOctets());
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getKeyAlgorithm() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static org.bouncycastle.asn1.bc.SecretKeyData getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.bc.SecretKeyData) {
            return (org.bouncycastle.asn1.bc.SecretKeyData) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.bc.SecretKeyData(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private SecretKeyData(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1));
    }

    public SecretKeyData(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, byte[] bArr) {
        this.getHighSpeedVideoFpsRangesFor = aSN1ObjectIdentifier;
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.DEROctetString(org.bouncycastle.util.Arrays.clone(bArr));
    }
}
