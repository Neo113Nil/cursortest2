package org.bouncycastle.asn1.cmc;

/* loaded from: classes17.dex */
public class PendInfo extends org.bouncycastle.asn1.ASN1Object {
    private final byte[] Camera2StreamConfigurationMap;
    private final org.bouncycastle.asn1.ASN1GeneralizedTime getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DEROctetString(this.Camera2StreamConfigurationMap));
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public byte[] getPendToken() {
        return org.bouncycastle.util.Arrays.clone(this.Camera2StreamConfigurationMap);
    }

    public org.bouncycastle.asn1.ASN1GeneralizedTime getPendTime() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static org.bouncycastle.asn1.cmc.PendInfo getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmc.PendInfo) {
            return (org.bouncycastle.asn1.cmc.PendInfo) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cmc.PendInfo(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public PendInfo(byte[] bArr, org.bouncycastle.asn1.ASN1GeneralizedTime aSN1GeneralizedTime) {
        this.Camera2StreamConfigurationMap = org.bouncycastle.util.Arrays.clone(bArr);
        this.getHighSpeedVideoFpsRangesFor = aSN1GeneralizedTime;
    }

    private PendInfo(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            throw new java.lang.IllegalArgumentException("incorrect sequence size");
        }
        this.Camera2StreamConfigurationMap = org.bouncycastle.util.Arrays.clone(org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0)).getOctets());
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1GeneralizedTime.getInstance(aSN1Sequence.getObjectAt(1));
    }
}
