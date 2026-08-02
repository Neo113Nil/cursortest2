package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class Duration extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.ASN1Choice {
    public static final int hours = 4;
    public static final int microseconds = 0;
    public static final int milliseconds = 1;
    public static final int minutes = 3;
    public static final int seconds = 2;
    public static final int sixtyHours = 5;
    public static final int years = 6;
    private final int Camera2StreamConfigurationMap;
    private final int getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return new org.bouncycastle.asn1.DERTaggedObject(this.getHighSpeedVideoFpsRangesFor, new org.bouncycastle.asn1.ASN1Integer(this.Camera2StreamConfigurationMap));
    }

    public int getValue() {
        return this.Camera2StreamConfigurationMap;
    }

    public int getTag() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static org.bouncycastle.oer.its.Duration getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.oer.its.Duration) {
            return (org.bouncycastle.oer.its.Duration) obj;
        }
        org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(obj);
        int tagNo = aSN1TaggedObject.getTagNo();
        switch (tagNo) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                try {
                    return new org.bouncycastle.oer.its.Duration(tagNo, org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1TaggedObject.getObject()).getValue().intValue());
                } catch (java.lang.Exception e) {
                    throw new java.lang.IllegalStateException(e.getMessage(), e);
                }
            default:
                throw new java.lang.IllegalArgumentException("invalid choice value ".concat(java.lang.String.valueOf(tagNo)));
        }
    }

    public Duration(int i, int i2) {
        this.getHighSpeedVideoFpsRangesFor = i;
        this.Camera2StreamConfigurationMap = i2;
    }
}
