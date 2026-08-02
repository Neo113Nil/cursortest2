package org.bouncycastle.internal.asn1.cms;

/* loaded from: classes17.dex */
public class GCMParameters extends org.bouncycastle.asn1.ASN1Object {
    private byte[] getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DEROctetString(this.getHighSpeedVideoFpsRanges));
        if (this.getHighSpeedVideoSizes != 12) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(this.getHighSpeedVideoSizes));
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public byte[] getNonce() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoFpsRanges);
    }

    public int getIcvLen() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.internal.asn1.cms.GCMParameters getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.internal.asn1.cms.GCMParameters) {
            return (org.bouncycastle.internal.asn1.cms.GCMParameters) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.internal.asn1.cms.GCMParameters(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public GCMParameters(byte[] bArr, int i) {
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.util.Arrays.clone(bArr);
        this.getHighSpeedVideoSizes = i;
    }

    private GCMParameters(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0)).getOctets();
        this.getHighSpeedVideoSizes = aSN1Sequence.size() == 2 ? org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1)).intValueExact() : 12;
    }
}
