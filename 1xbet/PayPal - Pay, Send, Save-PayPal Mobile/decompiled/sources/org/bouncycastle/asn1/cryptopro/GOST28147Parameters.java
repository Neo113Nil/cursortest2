package org.bouncycastle.asn1.cryptopro;

/* loaded from: classes17.dex */
public class GOST28147Parameters extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1ObjectIdentifier Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.ASN1OctetString getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public byte[] getIV() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoFpsRanges.getOctets());
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getEncryptionParamSet() {
        return this.Camera2StreamConfigurationMap;
    }

    public static org.bouncycastle.asn1.cryptopro.GOST28147Parameters getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.cryptopro.GOST28147Parameters getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cryptopro.GOST28147Parameters) {
            return (org.bouncycastle.asn1.cryptopro.GOST28147Parameters) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cryptopro.GOST28147Parameters(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public GOST28147Parameters(byte[] bArr, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.DEROctetString(bArr);
        this.Camera2StreamConfigurationMap = aSN1ObjectIdentifier;
    }

    private GOST28147Parameters(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        this.getHighSpeedVideoFpsRanges = (org.bouncycastle.asn1.ASN1OctetString) objects.nextElement();
        this.Camera2StreamConfigurationMap = (org.bouncycastle.asn1.ASN1ObjectIdentifier) objects.nextElement();
    }
}
