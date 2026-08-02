package org.bouncycastle.asn1.x509.qualified;

/* loaded from: classes17.dex */
public class MonetaryValue extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Integer Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.x509.qualified.Iso4217CurrencyCode getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public java.math.BigInteger getExponent() {
        return this.Camera2StreamConfigurationMap.getValue();
    }

    public org.bouncycastle.asn1.x509.qualified.Iso4217CurrencyCode getCurrency() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public java.math.BigInteger getAmount() {
        return this.getHighSpeedVideoSizes.getValue();
    }

    public static org.bouncycastle.asn1.x509.qualified.MonetaryValue getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x509.qualified.MonetaryValue) {
            return (org.bouncycastle.asn1.x509.qualified.MonetaryValue) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x509.qualified.MonetaryValue(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public MonetaryValue(org.bouncycastle.asn1.x509.qualified.Iso4217CurrencyCode iso4217CurrencyCode, int i, int i2) {
        this.getHighSpeedVideoFpsRangesFor = iso4217CurrencyCode;
        this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.ASN1Integer(i);
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.ASN1Integer(i2);
    }

    private MonetaryValue(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.x509.qualified.Iso4217CurrencyCode.getInstance(objects.nextElement());
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.ASN1Integer.getInstance(objects.nextElement());
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.ASN1Integer.getInstance(objects.nextElement());
    }
}
