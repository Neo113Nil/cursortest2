package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class MissingCrlIdentifier extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.oer.its.HashedId.HashedId3 Camera2StreamConfigurationMap;
    private final org.bouncycastle.oer.its.CrlSeries getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return org.bouncycastle.oer.its.Utils.getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges);
    }

    public org.bouncycastle.oer.its.CrlSeries getCrlSeries() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.oer.its.HashedId.HashedId3 getCracaId() {
        return this.Camera2StreamConfigurationMap;
    }

    public static org.bouncycastle.oer.its.MissingCrlIdentifier getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.oer.its.MissingCrlIdentifier) {
            return (org.bouncycastle.oer.its.MissingCrlIdentifier) obj;
        }
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(obj);
        return new org.bouncycastle.oer.its.MissingCrlIdentifier((org.bouncycastle.oer.its.HashedId.HashedId3) org.bouncycastle.oer.its.HashedId.getInstance(aSN1Sequence.getObjectAt(0)), org.bouncycastle.oer.its.CrlSeries.getInstance((java.lang.Object) aSN1Sequence.getObjectAt(1)));
    }

    public MissingCrlIdentifier(org.bouncycastle.oer.its.HashedId.HashedId3 hashedId3, org.bouncycastle.oer.its.CrlSeries crlSeries) {
        this.Camera2StreamConfigurationMap = hashedId3;
        this.getHighSpeedVideoFpsRanges = crlSeries;
    }
}
