package org.bouncycastle.asn1.pkcs;

/* loaded from: classes17.dex */
public class PBEParameter extends org.bouncycastle.asn1.ASN1Object {
    org.bouncycastle.asn1.ASN1Integer getHighResolutionOutputSizeshNQ4ISI;
    org.bouncycastle.asn1.ASN1OctetString getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public byte[] getSalt() {
        return this.getHighSpeedVideoFpsRanges.getOctets();
    }

    public java.math.BigInteger getIterationCount() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getValue();
    }

    public static org.bouncycastle.asn1.pkcs.PBEParameter getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.pkcs.PBEParameter) {
            return (org.bouncycastle.asn1.pkcs.PBEParameter) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.pkcs.PBEParameter(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public PBEParameter(byte[] bArr, int i) {
        if (bArr.length != 8) {
            throw new java.lang.IllegalArgumentException("salt length must be 8");
        }
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.DEROctetString(bArr);
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.ASN1Integer(i);
    }

    private PBEParameter(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoFpsRanges = (org.bouncycastle.asn1.ASN1OctetString) aSN1Sequence.getObjectAt(0);
        this.getHighResolutionOutputSizeshNQ4ISI = (org.bouncycastle.asn1.ASN1Integer) aSN1Sequence.getObjectAt(1);
    }
}
