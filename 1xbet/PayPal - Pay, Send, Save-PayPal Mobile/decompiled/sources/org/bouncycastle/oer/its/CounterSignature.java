package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class CounterSignature extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.oer.its.SignedData Camera2StreamConfigurationMap;
    private final org.bouncycastle.oer.its.Uint8 getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return org.bouncycastle.oer.its.Utils.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap);
    }

    public org.bouncycastle.oer.its.SignedData getSignedData() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.oer.its.Uint8 getProtocolVersion() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.oer.its.CounterSignature getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.oer.its.CounterSignature) {
            return (org.bouncycastle.oer.its.CounterSignature) obj;
        }
        java.util.Iterator<org.bouncycastle.asn1.ASN1Encodable> it = org.bouncycastle.asn1.ASN1Sequence.getInstance(obj).iterator();
        return new org.bouncycastle.oer.its.CounterSignature(org.bouncycastle.oer.its.Uint8.getInstance(it.next()), org.bouncycastle.oer.its.SignedData.getInstance(it.next()));
    }

    public CounterSignature(org.bouncycastle.oer.its.Uint8 uint8, org.bouncycastle.oer.its.SignedData signedData) {
        this.getHighSpeedVideoFpsRanges = uint8;
        this.Camera2StreamConfigurationMap = signedData;
    }
}
