package org.bouncycastle.asn1.cryptopro;

/* loaded from: classes17.dex */
public class GOST3410ParamSetParameters extends org.bouncycastle.asn1.ASN1Object {
    org.bouncycastle.asn1.ASN1Integer Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoFpsRanges;
    org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(4);
        aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(this.getHighResolutionOutputSizeshNQ4ISI));
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public java.math.BigInteger getQ() {
        return this.getHighSpeedVideoSizes.getPositiveValue();
    }

    public java.math.BigInteger getP() {
        return this.Camera2StreamConfigurationMap.getPositiveValue();
    }

    public int getLKeySize() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public int getKeySize() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.math.BigInteger getA() {
        return this.getHighSpeedVideoFpsRanges.getPositiveValue();
    }

    public static org.bouncycastle.asn1.cryptopro.GOST3410ParamSetParameters getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.cryptopro.GOST3410ParamSetParameters getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.cryptopro.GOST3410ParamSetParameters)) {
            return (org.bouncycastle.asn1.cryptopro.GOST3410ParamSetParameters) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1Sequence) {
            return new org.bouncycastle.asn1.cryptopro.GOST3410ParamSetParameters((org.bouncycastle.asn1.ASN1Sequence) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid GOST3410Parameter: ");
        sb.append(obj.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public GOST3410ParamSetParameters(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        this.getHighResolutionOutputSizeshNQ4ISI = ((org.bouncycastle.asn1.ASN1Integer) objects.nextElement()).intValueExact();
        this.Camera2StreamConfigurationMap = (org.bouncycastle.asn1.ASN1Integer) objects.nextElement();
        this.getHighSpeedVideoSizes = (org.bouncycastle.asn1.ASN1Integer) objects.nextElement();
        this.getHighSpeedVideoFpsRanges = (org.bouncycastle.asn1.ASN1Integer) objects.nextElement();
    }

    public GOST3410ParamSetParameters(int i, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.ASN1Integer(bigInteger);
        this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.ASN1Integer(bigInteger2);
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.ASN1Integer(bigInteger3);
    }
}
