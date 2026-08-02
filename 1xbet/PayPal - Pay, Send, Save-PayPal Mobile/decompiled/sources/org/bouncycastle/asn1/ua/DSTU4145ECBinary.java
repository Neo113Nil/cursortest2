package org.bouncycastle.asn1.ua;

/* loaded from: classes17.dex */
public class DSTU4145ECBinary extends org.bouncycastle.asn1.ASN1Object {
    org.bouncycastle.asn1.ASN1Integer Camera2StreamConfigurationMap;
    org.bouncycastle.asn1.ASN1OctetString getHighResolutionOutputSizeshNQ4ISI;
    org.bouncycastle.asn1.ua.DSTU4145BinaryField getHighSpeedVideoFpsRanges;
    org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoFpsRangesFor;
    org.bouncycastle.asn1.ASN1OctetString getHighSpeedVideoSizes;
    java.math.BigInteger getOutputMinFrameDuration;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(6);
        if (this.getOutputMinFrameDuration.compareTo(java.math.BigInteger.valueOf(0L)) != 0) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 0, (org.bouncycastle.asn1.ASN1Encodable) new org.bouncycastle.asn1.ASN1Integer(this.getOutputMinFrameDuration)));
        }
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public java.math.BigInteger getN() {
        return this.Camera2StreamConfigurationMap.getValue();
    }

    public byte[] getG() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoSizes.getOctets());
    }

    public org.bouncycastle.asn1.ua.DSTU4145BinaryField getField() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public byte[] getB() {
        return org.bouncycastle.util.Arrays.clone(this.getHighResolutionOutputSizeshNQ4ISI.getOctets());
    }

    public java.math.BigInteger getA() {
        return this.getHighSpeedVideoFpsRangesFor.getValue();
    }

    public static org.bouncycastle.asn1.ua.DSTU4145ECBinary getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.ua.DSTU4145ECBinary) {
            return (org.bouncycastle.asn1.ua.DSTU4145ECBinary) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.ua.DSTU4145ECBinary(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public DSTU4145ECBinary(org.bouncycastle.crypto.params.ECDomainParameters eCDomainParameters) {
        org.bouncycastle.asn1.ua.DSTU4145BinaryField dSTU4145BinaryField;
        this.getOutputMinFrameDuration = java.math.BigInteger.valueOf(0L);
        org.bouncycastle.math.ec.ECCurve curve = eCDomainParameters.getCurve();
        if (!org.bouncycastle.math.ec.ECAlgorithms.isF2mCurve(curve)) {
            throw new java.lang.IllegalArgumentException("only binary domain is possible");
        }
        int[] exponentsPresent = ((org.bouncycastle.math.field.PolynomialExtensionField) curve.getField()).getMinimalPolynomial().getExponentsPresent();
        if (exponentsPresent.length == 3) {
            dSTU4145BinaryField = new org.bouncycastle.asn1.ua.DSTU4145BinaryField(exponentsPresent[2], exponentsPresent[1]);
        } else {
            if (exponentsPresent.length != 5) {
                throw new java.lang.IllegalArgumentException("curve must have a trinomial or pentanomial basis");
            }
            dSTU4145BinaryField = new org.bouncycastle.asn1.ua.DSTU4145BinaryField(exponentsPresent[4], exponentsPresent[1], exponentsPresent[2], exponentsPresent[3]);
        }
        this.getHighSpeedVideoFpsRanges = dSTU4145BinaryField;
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.ASN1Integer(curve.getA().toBigInteger());
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.DEROctetString(curve.getB().getEncoded());
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.ASN1Integer(eCDomainParameters.getN());
        this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.DEROctetString(org.bouncycastle.asn1.ua.DSTU4145PointEncoder.encodePoint(eCDomainParameters.getG()));
    }

    private DSTU4145ECBinary(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getOutputMinFrameDuration = java.math.BigInteger.valueOf(0L);
        int i = 0;
        if (aSN1Sequence.getObjectAt(0) instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
            org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = (org.bouncycastle.asn1.ASN1TaggedObject) aSN1Sequence.getObjectAt(0);
            if (!aSN1TaggedObject.isExplicit() || aSN1TaggedObject.getTagNo() != 0) {
                throw new java.lang.IllegalArgumentException("object parse error");
            }
            this.getOutputMinFrameDuration = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1TaggedObject.getLoadedObject()).getValue();
            i = 1;
        }
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ua.DSTU4145BinaryField.getInstance(aSN1Sequence.getObjectAt(i));
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(i + 1));
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(i + 2));
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(i + 3));
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(i + 4));
    }
}
