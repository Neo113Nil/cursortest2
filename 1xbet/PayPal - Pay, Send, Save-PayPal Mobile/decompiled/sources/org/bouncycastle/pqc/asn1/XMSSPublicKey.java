package org.bouncycastle.pqc.asn1;

/* loaded from: classes17.dex */
public class XMSSPublicKey extends org.bouncycastle.asn1.ASN1Object {
    private final byte[] Camera2StreamConfigurationMap;
    private final byte[] getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(0L));
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DEROctetString(this.getHighSpeedVideoFpsRangesFor));
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DEROctetString(this.Camera2StreamConfigurationMap));
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public byte[] getRoot() {
        return org.bouncycastle.util.Arrays.clone(this.Camera2StreamConfigurationMap);
    }

    public byte[] getPublicSeed() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoFpsRangesFor);
    }

    public static org.bouncycastle.pqc.asn1.XMSSPublicKey getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.pqc.asn1.XMSSPublicKey) {
            return (org.bouncycastle.pqc.asn1.XMSSPublicKey) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.pqc.asn1.XMSSPublicKey(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public XMSSPublicKey(byte[] bArr, byte[] bArr2) {
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.util.Arrays.clone(bArr);
        this.Camera2StreamConfigurationMap = org.bouncycastle.util.Arrays.clone(bArr2);
    }

    private XMSSPublicKey(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (!org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0)).hasValue(0)) {
            throw new java.lang.IllegalArgumentException("unknown version of sequence");
        }
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.util.Arrays.clone(org.bouncycastle.asn1.DEROctetString.getInstance(aSN1Sequence.getObjectAt(1)).getOctets());
        this.Camera2StreamConfigurationMap = org.bouncycastle.util.Arrays.clone(org.bouncycastle.asn1.DEROctetString.getInstance(aSN1Sequence.getObjectAt(2)).getOctets());
    }
}
