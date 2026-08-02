package org.bouncycastle.asn1.pkcs;

/* loaded from: classes17.dex */
public class PKCS12PBEParams extends org.bouncycastle.asn1.ASN1Object {
    org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoFpsRanges;
    org.bouncycastle.asn1.ASN1OctetString getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public java.math.BigInteger getIterations() {
        return this.getHighSpeedVideoFpsRanges.getValue();
    }

    public byte[] getIV() {
        return this.getHighSpeedVideoSizes.getOctets();
    }

    public static org.bouncycastle.asn1.pkcs.PKCS12PBEParams getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.pkcs.PKCS12PBEParams) {
            return (org.bouncycastle.asn1.pkcs.PKCS12PBEParams) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.pkcs.PKCS12PBEParams(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public PKCS12PBEParams(byte[] bArr, int i) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.DEROctetString(bArr);
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.ASN1Integer(i);
    }

    private PKCS12PBEParams(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoSizes = (org.bouncycastle.asn1.ASN1OctetString) aSN1Sequence.getObjectAt(0);
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1));
    }
}
