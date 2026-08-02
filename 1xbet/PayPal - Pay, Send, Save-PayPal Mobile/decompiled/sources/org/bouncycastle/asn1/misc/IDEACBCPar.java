package org.bouncycastle.asn1.misc;

/* loaded from: classes17.dex */
public class IDEACBCPar extends org.bouncycastle.asn1.ASN1Object {
    org.bouncycastle.asn1.ASN1OctetString getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(1);
        org.bouncycastle.asn1.ASN1OctetString aSN1OctetString = this.getHighSpeedVideoFpsRanges;
        if (aSN1OctetString != null) {
            aSN1EncodableVector.add(aSN1OctetString);
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public byte[] getIV() {
        org.bouncycastle.asn1.ASN1OctetString aSN1OctetString = this.getHighSpeedVideoFpsRanges;
        if (aSN1OctetString != null) {
            return org.bouncycastle.util.Arrays.clone(aSN1OctetString.getOctets());
        }
        return null;
    }

    public static org.bouncycastle.asn1.misc.IDEACBCPar getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.misc.IDEACBCPar) {
            return (org.bouncycastle.asn1.misc.IDEACBCPar) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.misc.IDEACBCPar(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public IDEACBCPar(byte[] bArr) {
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.DEROctetString(bArr);
    }

    private IDEACBCPar(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoFpsRanges = aSN1Sequence.size() == 1 ? (org.bouncycastle.asn1.ASN1OctetString) aSN1Sequence.getObjectAt(0) : null;
    }
}
