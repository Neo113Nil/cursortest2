package org.bouncycastle.asn1.pkcs;

/* loaded from: classes17.dex */
public class RSAPrivateKeyStructure extends org.bouncycastle.asn1.ASN1Object {
    private java.math.BigInteger Camera2StreamConfigurationMap;
    private java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI;
    private java.math.BigInteger getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoFpsRangesFor;
    private java.math.BigInteger getHighSpeedVideoSizes;
    private java.math.BigInteger getHighSpeedVideoSizesFor;
    private java.math.BigInteger getInputFormats;
    private int getInputSizeshNQ4ISI;
    private java.math.BigInteger getOutputFormats;
    private java.math.BigInteger getOutputMinFrameDuration;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(10);
        aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(this.getInputSizeshNQ4ISI));
        aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(getModulus()));
        aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(getPublicExponent()));
        aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(getPrivateExponent()));
        aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(getPrime1()));
        aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(getPrime2()));
        aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(getExponent1()));
        aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(getExponent2()));
        aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(getCoefficient()));
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = this.getHighSpeedVideoFpsRangesFor;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(aSN1Sequence);
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public int getVersion() {
        return this.getInputSizeshNQ4ISI;
    }

    public java.math.BigInteger getPublicExponent() {
        return this.getOutputFormats;
    }

    public java.math.BigInteger getPrivateExponent() {
        return this.getHighSpeedVideoSizesFor;
    }

    public java.math.BigInteger getPrime2() {
        return this.getOutputMinFrameDuration;
    }

    public java.math.BigInteger getPrime1() {
        return this.getInputFormats;
    }

    public java.math.BigInteger getModulus() {
        return this.getHighSpeedVideoSizes;
    }

    public java.math.BigInteger getExponent2() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.math.BigInteger getExponent1() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public java.math.BigInteger getCoefficient() {
        return this.Camera2StreamConfigurationMap;
    }

    public static org.bouncycastle.asn1.pkcs.RSAPrivateKeyStructure getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.pkcs.RSAPrivateKeyStructure getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.pkcs.RSAPrivateKeyStructure) {
            return (org.bouncycastle.asn1.pkcs.RSAPrivateKeyStructure) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1Sequence) {
            return new org.bouncycastle.asn1.pkcs.RSAPrivateKeyStructure((org.bouncycastle.asn1.ASN1Sequence) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown object in factory: ");
        sb.append(obj.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public RSAPrivateKeyStructure(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoFpsRangesFor = null;
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        int intValueExact = ((org.bouncycastle.asn1.ASN1Integer) objects.nextElement()).intValueExact();
        if (intValueExact < 0 || intValueExact > 1) {
            throw new java.lang.IllegalArgumentException("wrong version for RSA private key");
        }
        this.getInputSizeshNQ4ISI = intValueExact;
        this.getHighSpeedVideoSizes = ((org.bouncycastle.asn1.ASN1Integer) objects.nextElement()).getValue();
        this.getOutputFormats = ((org.bouncycastle.asn1.ASN1Integer) objects.nextElement()).getValue();
        this.getHighSpeedVideoSizesFor = ((org.bouncycastle.asn1.ASN1Integer) objects.nextElement()).getValue();
        this.getInputFormats = ((org.bouncycastle.asn1.ASN1Integer) objects.nextElement()).getValue();
        this.getOutputMinFrameDuration = ((org.bouncycastle.asn1.ASN1Integer) objects.nextElement()).getValue();
        this.getHighSpeedVideoFpsRanges = ((org.bouncycastle.asn1.ASN1Integer) objects.nextElement()).getValue();
        this.getHighResolutionOutputSizeshNQ4ISI = ((org.bouncycastle.asn1.ASN1Integer) objects.nextElement()).getValue();
        this.Camera2StreamConfigurationMap = ((org.bouncycastle.asn1.ASN1Integer) objects.nextElement()).getValue();
        if (objects.hasMoreElements()) {
            this.getHighSpeedVideoFpsRangesFor = (org.bouncycastle.asn1.ASN1Sequence) objects.nextElement();
        }
    }

    public RSAPrivateKeyStructure(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3, java.math.BigInteger bigInteger4, java.math.BigInteger bigInteger5, java.math.BigInteger bigInteger6, java.math.BigInteger bigInteger7, java.math.BigInteger bigInteger8) {
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getInputSizeshNQ4ISI = 0;
        this.getHighSpeedVideoSizes = bigInteger;
        this.getOutputFormats = bigInteger2;
        this.getHighSpeedVideoSizesFor = bigInteger3;
        this.getInputFormats = bigInteger4;
        this.getOutputMinFrameDuration = bigInteger5;
        this.getHighSpeedVideoFpsRanges = bigInteger6;
        this.getHighResolutionOutputSizeshNQ4ISI = bigInteger7;
        this.Camera2StreamConfigurationMap = bigInteger8;
    }
}
