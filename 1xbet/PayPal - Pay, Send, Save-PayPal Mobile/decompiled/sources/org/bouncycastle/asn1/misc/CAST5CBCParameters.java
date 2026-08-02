package org.bouncycastle.asn1.misc;

/* loaded from: classes17.dex */
public class CAST5CBCParameters extends org.bouncycastle.asn1.ASN1Object {
    org.bouncycastle.asn1.ASN1OctetString getHighResolutionOutputSizeshNQ4ISI;
    org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public int getKeyLength() {
        return this.getHighSpeedVideoFpsRanges.intValueExact();
    }

    public byte[] getIV() {
        return org.bouncycastle.util.Arrays.clone(this.getHighResolutionOutputSizeshNQ4ISI.getOctets());
    }

    public static org.bouncycastle.asn1.misc.CAST5CBCParameters getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.misc.CAST5CBCParameters) {
            return (org.bouncycastle.asn1.misc.CAST5CBCParameters) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.misc.CAST5CBCParameters(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public CAST5CBCParameters(byte[] bArr, int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.DEROctetString(org.bouncycastle.util.Arrays.clone(bArr));
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.ASN1Integer(i);
    }

    private CAST5CBCParameters(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighResolutionOutputSizeshNQ4ISI = (org.bouncycastle.asn1.ASN1OctetString) aSN1Sequence.getObjectAt(0);
        this.getHighSpeedVideoFpsRanges = (org.bouncycastle.asn1.ASN1Integer) aSN1Sequence.getObjectAt(1);
    }
}
