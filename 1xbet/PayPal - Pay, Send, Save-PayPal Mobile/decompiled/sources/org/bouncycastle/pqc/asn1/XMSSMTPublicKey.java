package org.bouncycastle.pqc.asn1;

/* loaded from: classes17.dex */
public class XMSSMTPublicKey extends org.bouncycastle.asn1.ASN1Object {
    private final byte[] getHighResolutionOutputSizeshNQ4ISI;
    private final byte[] getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(0L));
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DEROctetString(this.getHighResolutionOutputSizeshNQ4ISI));
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DEROctetString(this.getHighSpeedVideoSizes));
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public byte[] getRoot() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoSizes);
    }

    public byte[] getPublicSeed() {
        return org.bouncycastle.util.Arrays.clone(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public static org.bouncycastle.pqc.asn1.XMSSMTPublicKey getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.pqc.asn1.XMSSMTPublicKey) {
            return (org.bouncycastle.pqc.asn1.XMSSMTPublicKey) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.pqc.asn1.XMSSMTPublicKey(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public XMSSMTPublicKey(byte[] bArr, byte[] bArr2) {
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.util.Arrays.clone(bArr);
        this.getHighSpeedVideoSizes = org.bouncycastle.util.Arrays.clone(bArr2);
    }

    private XMSSMTPublicKey(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (!org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0)).hasValue(0)) {
            throw new java.lang.IllegalArgumentException("unknown version of sequence");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.util.Arrays.clone(org.bouncycastle.asn1.DEROctetString.getInstance(aSN1Sequence.getObjectAt(1)).getOctets());
        this.getHighSpeedVideoSizes = org.bouncycastle.util.Arrays.clone(org.bouncycastle.asn1.DEROctetString.getInstance(aSN1Sequence.getObjectAt(2)).getOctets());
    }
}
