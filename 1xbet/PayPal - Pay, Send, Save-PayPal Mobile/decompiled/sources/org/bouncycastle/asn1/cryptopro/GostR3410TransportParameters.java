package org.bouncycastle.asn1.cryptopro;

/* loaded from: classes17.dex */
public class GostR3410TransportParameters extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.asn1.x509.SubjectPublicKeyInfo Camera2StreamConfigurationMap;
    private final byte[] getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo = this.Camera2StreamConfigurationMap;
        if (subjectPublicKeyInfo != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) subjectPublicKeyInfo));
        }
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DEROctetString(this.getHighSpeedVideoFpsRanges));
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public byte[] getUkm() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoFpsRanges);
    }

    public org.bouncycastle.asn1.x509.SubjectPublicKeyInfo getEphemeralPublicKey() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getEncryptionParamSet() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.asn1.cryptopro.GostR3410TransportParameters getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return new org.bouncycastle.asn1.cryptopro.GostR3410TransportParameters(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.cryptopro.GostR3410TransportParameters getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cryptopro.GostR3410TransportParameters) {
            return (org.bouncycastle.asn1.cryptopro.GostR3410TransportParameters) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cryptopro.GostR3410TransportParameters(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private GostR3410TransportParameters(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() == 2) {
            this.getHighSpeedVideoSizes = org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1)).getOctets();
            this.Camera2StreamConfigurationMap = null;
        } else {
            if (aSN1Sequence.size() != 3) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown sequence length: ");
                sb.append(aSN1Sequence.size());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            this.getHighSpeedVideoSizes = org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
            this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(org.bouncycastle.asn1.ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(1)), false);
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(2)).getOctets();
        }
    }

    public GostR3410TransportParameters(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo, byte[] bArr) {
        this.getHighSpeedVideoSizes = aSN1ObjectIdentifier;
        this.Camera2StreamConfigurationMap = subjectPublicKeyInfo;
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.util.Arrays.clone(bArr);
    }
}
