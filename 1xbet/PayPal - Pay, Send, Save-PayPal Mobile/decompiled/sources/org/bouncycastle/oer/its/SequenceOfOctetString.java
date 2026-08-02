package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class SequenceOfOctetString extends org.bouncycastle.asn1.ASN1Object {
    private byte[][] getHighSpeedVideoSizes;

    private SequenceOfOctetString(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        byte[][] bArr = new byte[aSN1Sequence.size()][];
        for (int i = 0; i != aSN1Sequence.size(); i++) {
            bArr[i] = org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(i)).getOctets();
        }
        this.getHighSpeedVideoSizes = bArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        for (int i = 0; i != this.getHighSpeedVideoSizes.length; i++) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DEROctetString(org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoSizes[i])));
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public int size() {
        return this.getHighSpeedVideoSizes.length;
    }

    public static org.bouncycastle.oer.its.SequenceOfOctetString getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.oer.its.SequenceOfOctetString) {
            return (org.bouncycastle.oer.its.SequenceOfOctetString) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.oer.its.SequenceOfOctetString(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }
}
