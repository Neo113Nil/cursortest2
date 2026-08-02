package org.bouncycastle.asn1.pkcs;

/* loaded from: classes17.dex */
public class RSAPrivateKey extends org.bouncycastle.asn1.ASN1Object {
    private java.math.BigInteger Camera2StreamConfigurationMap;
    private java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI;
    private java.math.BigInteger getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoFpsRangesFor;
    private java.math.BigInteger getHighSpeedVideoSizes;
    private java.math.BigInteger getHighSpeedVideoSizesFor;
    private java.math.BigInteger getInputFormats;
    private java.math.BigInteger getInputSizeshNQ4ISI;
    private java.math.BigInteger getOutputFormats;
    private java.math.BigInteger getOutputMinFrameDuration;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(10);
        aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(this.getHighSpeedVideoSizesFor));
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

    public java.math.BigInteger getVersion() {
        return this.getHighSpeedVideoSizesFor;
    }

    public java.math.BigInteger getPublicExponent() {
        return this.getOutputMinFrameDuration;
    }

    public java.math.BigInteger getPrivateExponent() {
        return this.getInputFormats;
    }

    public java.math.BigInteger getPrime2() {
        return this.getOutputFormats;
    }

    public java.math.BigInteger getPrime1() {
        return this.getInputSizeshNQ4ISI;
    }

    public java.math.BigInteger getModulus() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public java.math.BigInteger getExponent2() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.math.BigInteger getExponent1() {
        return this.getHighSpeedVideoSizes;
    }

    public java.math.BigInteger getCoefficient() {
        return this.Camera2StreamConfigurationMap;
    }

    public static org.bouncycastle.asn1.pkcs.RSAPrivateKey getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.pkcs.RSAPrivateKey getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.pkcs.RSAPrivateKey) {
            return (org.bouncycastle.asn1.pkcs.RSAPrivateKey) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.pkcs.RSAPrivateKey(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private RSAPrivateKey(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoFpsRangesFor = null;
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        org.bouncycastle.asn1.ASN1Integer aSN1Integer = (org.bouncycastle.asn1.ASN1Integer) objects.nextElement();
        int intValueExact = aSN1Integer.intValueExact();
        if (intValueExact < 0 || intValueExact > 1) {
            throw new java.lang.IllegalArgumentException("wrong version for RSA private key");
        }
        this.getHighSpeedVideoSizesFor = aSN1Integer.getValue();
        this.getHighSpeedVideoFpsRanges = ((org.bouncycastle.asn1.ASN1Integer) objects.nextElement()).getValue();
        this.getOutputMinFrameDuration = ((org.bouncycastle.asn1.ASN1Integer) objects.nextElement()).getValue();
        this.getInputFormats = ((org.bouncycastle.asn1.ASN1Integer) objects.nextElement()).getValue();
        this.getInputSizeshNQ4ISI = ((org.bouncycastle.asn1.ASN1Integer) objects.nextElement()).getValue();
        this.getOutputFormats = ((org.bouncycastle.asn1.ASN1Integer) objects.nextElement()).getValue();
        this.getHighSpeedVideoSizes = ((org.bouncycastle.asn1.ASN1Integer) objects.nextElement()).getValue();
        this.getHighResolutionOutputSizeshNQ4ISI = ((org.bouncycastle.asn1.ASN1Integer) objects.nextElement()).getValue();
        this.Camera2StreamConfigurationMap = ((org.bouncycastle.asn1.ASN1Integer) objects.nextElement()).getValue();
        if (objects.hasMoreElements()) {
            this.getHighSpeedVideoFpsRangesFor = (org.bouncycastle.asn1.ASN1Sequence) objects.nextElement();
        }
    }

    public RSAPrivateKey(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3, java.math.BigInteger bigInteger4, java.math.BigInteger bigInteger5, java.math.BigInteger bigInteger6, java.math.BigInteger bigInteger7, java.math.BigInteger bigInteger8) {
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighSpeedVideoSizesFor = java.math.BigInteger.valueOf(0L);
        this.getHighSpeedVideoFpsRanges = bigInteger;
        this.getOutputMinFrameDuration = bigInteger2;
        this.getInputFormats = bigInteger3;
        this.getInputSizeshNQ4ISI = bigInteger4;
        this.getOutputFormats = bigInteger5;
        this.getHighSpeedVideoSizes = bigInteger6;
        this.getHighResolutionOutputSizeshNQ4ISI = bigInteger7;
        this.Camera2StreamConfigurationMap = bigInteger8;
    }
}
