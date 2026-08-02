package org.bouncycastle.asn1.cryptopro;

/* loaded from: classes17.dex */
public class ECGOST3410ParamSetParameters extends org.bouncycastle.asn1.ASN1Object {
    org.bouncycastle.asn1.ASN1Integer Camera2StreamConfigurationMap;
    org.bouncycastle.asn1.ASN1Integer getHighResolutionOutputSizeshNQ4ISI;
    org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoFpsRanges;
    org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoFpsRangesFor;
    org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoSizes;
    org.bouncycastle.asn1.ASN1Integer getOutputFormats;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(6);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        aSN1EncodableVector.add(this.getOutputFormats);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public java.math.BigInteger getQ() {
        return this.Camera2StreamConfigurationMap.getPositiveValue();
    }

    public java.math.BigInteger getP() {
        return this.getHighSpeedVideoFpsRanges.getPositiveValue();
    }

    public java.math.BigInteger getA() {
        return this.getHighSpeedVideoFpsRangesFor.getPositiveValue();
    }

    public static org.bouncycastle.asn1.cryptopro.ECGOST3410ParamSetParameters getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.cryptopro.ECGOST3410ParamSetParameters getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.cryptopro.ECGOST3410ParamSetParameters)) {
            return (org.bouncycastle.asn1.cryptopro.ECGOST3410ParamSetParameters) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1Sequence) {
            return new org.bouncycastle.asn1.cryptopro.ECGOST3410ParamSetParameters((org.bouncycastle.asn1.ASN1Sequence) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid GOST3410Parameter: ");
        sb.append(obj.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public ECGOST3410ParamSetParameters(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        this.getHighSpeedVideoFpsRangesFor = (org.bouncycastle.asn1.ASN1Integer) objects.nextElement();
        this.getHighSpeedVideoSizes = (org.bouncycastle.asn1.ASN1Integer) objects.nextElement();
        this.getHighSpeedVideoFpsRanges = (org.bouncycastle.asn1.ASN1Integer) objects.nextElement();
        this.Camera2StreamConfigurationMap = (org.bouncycastle.asn1.ASN1Integer) objects.nextElement();
        this.getHighResolutionOutputSizeshNQ4ISI = (org.bouncycastle.asn1.ASN1Integer) objects.nextElement();
        this.getOutputFormats = (org.bouncycastle.asn1.ASN1Integer) objects.nextElement();
    }

    public ECGOST3410ParamSetParameters(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3, java.math.BigInteger bigInteger4, int i, java.math.BigInteger bigInteger5) {
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.ASN1Integer(bigInteger);
        this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.ASN1Integer(bigInteger2);
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.ASN1Integer(bigInteger3);
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.ASN1Integer(bigInteger4);
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.ASN1Integer(i);
        this.getOutputFormats = new org.bouncycastle.asn1.ASN1Integer(bigInteger5);
    }
}
